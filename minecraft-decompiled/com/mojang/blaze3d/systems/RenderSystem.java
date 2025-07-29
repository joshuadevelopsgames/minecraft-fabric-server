package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@fkz
public class RenderSystem {
   static final Logger LOGGER = LogUtils.getLogger();
   public static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
   public static final int PROJECTION_MATRIX_UBO_SIZE = new Std140SizeCalculator().putMat4f().get();
   @Nullable
   private static Thread renderThread;
   @Nullable
   private static GpuDevice DEVICE;
   private static double lastDrawTime = Double.MIN_VALUE;
   private static final RenderSystem.a sharedSequential = new RenderSystem.a(1, 1, IntConsumer::accept);
   private static final RenderSystem.a sharedSequentialQuad = new RenderSystem.a(4, 6, ($$0, $$1) -> {
      $$0.accept($$1);
      $$0.accept($$1 + 1);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 3);
      $$0.accept($$1);
   });
   private static final RenderSystem.a sharedSequentialLines = new RenderSystem.a(4, 6, ($$0, $$1) -> {
      $$0.accept($$1);
      $$0.accept($$1 + 1);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 3);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 1);
   });
   private static fle projectionType = fle.a;
   private static fle savedProjectionType = fle.a;
   private static final Matrix4fStack modelViewStack = new Matrix4fStack(16);
   private static Matrix4f textureMatrix = new Matrix4f();
   public static final int TEXTURE_COUNT = 12;
   private static final GpuTextureView[] shaderTextures = new GpuTextureView[12];
   @Nullable
   private static GpuBufferSlice shaderFog = null;
   @Nullable
   private static GpuBufferSlice shaderLightDirections;
   @Nullable
   private static GpuBufferSlice projectionMatrixBuffer;
   @Nullable
   private static GpuBufferSlice savedProjectionMatrixBuffer;
   private static final Vector3f modelOffset = new Vector3f();
   private static float shaderLineWidth = 1.0F;
   private static String apiDescription = "Unknown";
   private static final AtomicLong pollEventsWaitStart = new AtomicLong();
   private static final AtomicBoolean pollingEvents = new AtomicBoolean(false);
   @Nullable
   private static GpuBuffer QUAD_VERTEX_BUFFER;
   private static final bam<RenderSystem.b> PENDING_FENCES = new bam<>();
   @Nullable
   public static GpuTextureView outputColorTextureOverride;
   @Nullable
   public static GpuTextureView outputDepthTextureOverride;
   @Nullable
   private static GpuBuffer globalSettingsUniform;
   @Nullable
   private static gwz dynamicUniforms;
   private static fnv scissorStateForRenderTypeDraws = new fnv();

   public static void initRenderThread() {
      if (renderThread != null) {
         throw new IllegalStateException("Could not initialize render thread");
      } else {
         renderThread = Thread.currentThread();
      }
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == renderThread;
   }

   public static void assertOnRenderThread() {
      if (!isOnRenderThread()) {
         throw constructThreadException();
      }
   }

   private static IllegalStateException constructThreadException() {
      return new IllegalStateException("Rendersystem called from wrong thread");
   }

   private static void pollEvents() {
      pollEventsWaitStart.set(ag.c());
      pollingEvents.set(true);
      GLFW.glfwPollEvents();
      pollingEvents.set(false);
   }

   public static boolean isFrozenAtPollEvents() {
      return pollingEvents.get() && ag.c() - pollEventsWaitStart.get() > 200L;
   }

   public static void flipFrame(long $$0, @Nullable flg $$1) {
      pollEvents();
      fof.b().c();
      GLFW.glfwSwapBuffers($$0);
      if ($$1 != null) {
         $$1.b();
      }

      dynamicUniforms.a();
      fue.R().f.k();
      pollEvents();
   }

   public static void limitDisplayFPS(int $$0) {
      double $$1 = lastDrawTime + 1.0 / $$0;

      double $$2;
      for ($$2 = GLFW.glfwGetTime(); $$2 < $$1; $$2 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout($$1 - $$2);
      }

      lastDrawTime = $$2;
   }

   public static void setShaderFog(GpuBufferSlice $$0) {
      shaderFog = $$0;
   }

   @Nullable
   public static GpuBufferSlice getShaderFog() {
      return shaderFog;
   }

   public static void setShaderLights(GpuBufferSlice $$0) {
      shaderLightDirections = $$0;
   }

   @Nullable
   public static GpuBufferSlice getShaderLights() {
      return shaderLightDirections;
   }

   public static void lineWidth(float $$0) {
      assertOnRenderThread();
      shaderLineWidth = $$0;
   }

   public static float getShaderLineWidth() {
      assertOnRenderThread();
      return shaderLineWidth;
   }

   public static void enableScissorForRenderTypeDraws(int $$0, int $$1, int $$2, int $$3) {
      scissorStateForRenderTypeDraws.a($$0, $$1, $$2, $$3);
   }

   public static void disableScissorForRenderTypeDraws() {
      scissorStateForRenderTypeDraws.a();
   }

   public static fnv getScissorStateForRenderTypeDraws() {
      return scissorStateForRenderTypeDraws;
   }

   public static String getBackendDescription() {
      return String.format(Locale.ROOT, "LWJGL version %s", GLX._getLWJGLVersion());
   }

   public static String getApiDescription() {
      return apiDescription;
   }

   public static bdf.a initBackendSystem() {
      return GLX._initGlfw()::getAsLong;
   }

   public static void initRenderer(long $$0, int $$1, boolean $$2, BiFunction<ame, ShaderType, String> $$3, boolean $$4) {
      DEVICE = new fme($$0, $$1, $$2, $$3, $$4);
      apiDescription = getDevice().getImplementationInformation();
      dynamicUniforms = new gwz();

      try (foa $$5 = foa.a(fob.f.getVertexSize() * 4)) {
         fnz $$6 = new fnz($$5, VertexFormat.b.h, fob.f);
         $$6.a(0.0F, 0.0F, 0.0F);
         $$6.a(1.0F, 0.0F, 0.0F);
         $$6.a(1.0F, 1.0F, 0.0F);
         $$6.a(0.0F, 1.0F, 0.0F);

         try (foc $$7 = $$6.b()) {
            QUAD_VERTEX_BUFFER = getDevice().createBuffer(() -> "Quad", 32, $$7.a());
         }
      }
   }

   public static void setErrorCallback(GLFWErrorCallbackI $$0) {
      GLX._setGlfwErrorCallback($$0);
   }

   public static void setupDefaultState() {
      modelViewStack.clear();
      textureMatrix.identity();
   }

   public static void setupOverlayColor(@Nullable GpuTextureView $$0) {
      assertOnRenderThread();
      setShaderTexture(1, $$0);
   }

   public static void teardownOverlayColor() {
      assertOnRenderThread();
      setShaderTexture(1, null);
   }

   public static void setShaderTexture(int $$0, @Nullable GpuTextureView $$1) {
      assertOnRenderThread();
      if ($$0 >= 0 && $$0 < shaderTextures.length) {
         shaderTextures[$$0] = $$1;
      }
   }

   @Nullable
   public static GpuTextureView getShaderTexture(int $$0) {
      assertOnRenderThread();
      return $$0 >= 0 && $$0 < shaderTextures.length ? shaderTextures[$$0] : null;
   }

   public static void setProjectionMatrix(GpuBufferSlice $$0, fle $$1) {
      assertOnRenderThread();
      projectionMatrixBuffer = $$0;
      projectionType = $$1;
   }

   public static void setTextureMatrix(Matrix4f $$0) {
      assertOnRenderThread();
      textureMatrix = new Matrix4f($$0);
   }

   public static void resetTextureMatrix() {
      assertOnRenderThread();
      textureMatrix.identity();
   }

   public static void backupProjectionMatrix() {
      assertOnRenderThread();
      savedProjectionMatrixBuffer = projectionMatrixBuffer;
      savedProjectionType = projectionType;
   }

   public static void restoreProjectionMatrix() {
      assertOnRenderThread();
      projectionMatrixBuffer = savedProjectionMatrixBuffer;
      projectionType = savedProjectionType;
   }

   @Nullable
   public static GpuBufferSlice getProjectionMatrixBuffer() {
      assertOnRenderThread();
      return projectionMatrixBuffer;
   }

   public static Matrix4f getModelViewMatrix() {
      assertOnRenderThread();
      return modelViewStack;
   }

   public static Matrix4fStack getModelViewStack() {
      assertOnRenderThread();
      return modelViewStack;
   }

   public static Matrix4f getTextureMatrix() {
      assertOnRenderThread();
      return textureMatrix;
   }

   public static RenderSystem.a getSequentialBuffer(VertexFormat.b $$0) {
      assertOnRenderThread();

      return switch ($$0) {
         case h -> sharedSequentialQuad;
         case a -> sharedSequentialLines;
         default -> sharedSequential;
      };
   }

   public static void setGlobalSettingsUniform(GpuBuffer $$0) {
      globalSettingsUniform = $$0;
   }

   @Nullable
   public static GpuBuffer getGlobalSettingsUniform() {
      return globalSettingsUniform;
   }

   public static fle getProjectionType() {
      assertOnRenderThread();
      return projectionType;
   }

   public static GpuBuffer getQuadVertexBuffer() {
      if (QUAD_VERTEX_BUFFER == null) {
         throw new IllegalStateException("Can't getQuadVertexBuffer() before renderer was initialized");
      } else {
         return QUAD_VERTEX_BUFFER;
      }
   }

   public static void setModelOffset(float $$0, float $$1, float $$2) {
      assertOnRenderThread();
      modelOffset.set($$0, $$1, $$2);
   }

   public static void resetModelOffset() {
      assertOnRenderThread();
      modelOffset.set(0.0F, 0.0F, 0.0F);
   }

   public static Vector3f getModelOffset() {
      assertOnRenderThread();
      return modelOffset;
   }

   public static void queueFencedTask(Runnable $$0) {
      PENDING_FENCES.addLast(new RenderSystem.b($$0, getDevice().createCommandEncoder().createFence()));
   }

   public static void executePendingTasks() {
      for (RenderSystem.b $$0 = PENDING_FENCES.peekFirst(); $$0 != null; $$0 = PENDING_FENCES.peekFirst()) {
         if (!$$0.b.awaitCompletion(0L)) {
            return;
         }

         try {
            $$0.a.run();
         } finally {
            $$0.b.close();
         }

         PENDING_FENCES.removeFirst();
      }
   }

   public static GpuDevice getDevice() {
      if (DEVICE == null) {
         throw new IllegalStateException("Can't getDevice() before it was initialized");
      } else {
         return DEVICE;
      }
   }

   @Nullable
   public static GpuDevice tryGetDevice() {
      return DEVICE;
   }

   public static gwz getDynamicUniforms() {
      if (dynamicUniforms == null) {
         throw new IllegalStateException("Can't getDynamicUniforms() before device was initialized");
      } else {
         return dynamicUniforms;
      }
   }

   public static void bindDefaultUniforms(RenderPass $$0) {
      GpuBufferSlice $$1 = getProjectionMatrixBuffer();
      if ($$1 != null) {
         $$0.setUniform("Projection", $$1);
      }

      GpuBufferSlice $$2 = getShaderFog();
      if ($$2 != null) {
         $$0.setUniform("Fog", $$2);
      }

      GpuBuffer $$3 = getGlobalSettingsUniform();
      if ($$3 != null) {
         $$0.setUniform("Globals", $$3);
      }

      GpuBufferSlice $$4 = getShaderLights();
      if ($$4 != null) {
         $$0.setUniform("Lighting", $$4);
      }
   }

   public static final class a {
      private final int a;
      private final int b;
      private final RenderSystem.a.a c;
      @Nullable
      private GpuBuffer d;
      private VertexFormat.a e = VertexFormat.a.a;
      private int f;

      a(int $$0, int $$1, RenderSystem.a.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(int $$0) {
         return $$0 <= this.f;
      }

      public GpuBuffer b(int $$0) {
         this.c($$0);
         return this.d;
      }

      private void c(int $$0) {
         if (!this.a($$0)) {
            $$0 = bcb.d($$0 * 2, this.b);
            RenderSystem.LOGGER.debug("Growing IndexBuffer: Old limit {}, new limit {}.", this.f, $$0);
            int $$1 = $$0 / this.b;
            int $$2 = $$1 * this.a;
            VertexFormat.a $$3 = VertexFormat.a.a($$2);
            int $$4 = bcb.d($$0 * $$3.c, 4);
            ByteBuffer $$5 = MemoryUtil.memAlloc($$4);

            try {
               this.e = $$3;
               it.unimi.dsi.fastutil.ints.IntConsumer $$6 = this.a($$5);

               for (int $$7 = 0; $$7 < $$0; $$7 += this.b) {
                  this.c.accept($$6, $$7 * this.a / this.b);
               }

               $$5.flip();
               if (this.d != null) {
                  this.d.close();
               }

               this.d = RenderSystem.getDevice().createBuffer(() -> "Auto Storage index buffer", 64, $$5);
            } finally {
               MemoryUtil.memFree($$5);
            }

            this.f = $$0;
         }
      }

      private it.unimi.dsi.fastutil.ints.IntConsumer a(ByteBuffer $$0) {
         switch (this.e) {
            case a:
               return $$1 -> $$0.putShort((short)$$1);
            case b:
            default:
               return $$0::putInt;
         }
      }

      public VertexFormat.a a() {
         return this.e;
      }

      interface a {
         void accept(it.unimi.dsi.fastutil.ints.IntConsumer var1, int var2);
      }
   }

   record b(Runnable a, GpuFence b) {
   }
}
