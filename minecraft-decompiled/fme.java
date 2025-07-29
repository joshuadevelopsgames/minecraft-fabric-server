import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;

public class fme implements GpuDevice {
   private static final Logger g = LogUtils.getLogger();
   protected static boolean a = true;
   protected static boolean b = true;
   protected static boolean c = true;
   protected static boolean d = true;
   protected static boolean e = true;
   protected static boolean f = true;
   private final CommandEncoder h;
   @Nullable
   private final fmc i;
   private final fmd j;
   private final int k;
   private final flz l;
   private final BiFunction<ame, ShaderType, String> m;
   private final Map<RenderPipeline, fmi> n = new IdentityHashMap<>();
   private final Map<fme.a, fmj> o = new HashMap<>();
   private final fmn p;
   private final fly q;
   private final Set<String> r = new HashSet<>();
   private final int s;

   public fme(long $$0, int $$1, boolean $$2, BiFunction<ame, ShaderType, String> $$3, boolean $$4) {
      GLFW.glfwMakeContextCurrent($$0);
      GLCapabilities $$5 = GL.createCapabilities();
      int $$6 = e();
      GLFW.glfwSetWindowSizeLimits($$0, -1, -1, $$6, $$6);
      this.i = fmc.a($$1, $$2, this.r);
      this.j = fmd.a($$5, $$4, this.r);
      this.p = fmn.a($$5, this.j, this.r);
      this.q = fly.a($$5, this.r);
      this.l = flz.a($$5, this.r);
      this.k = $$6;
      this.m = $$3;
      this.h = new fmb(this);
      this.s = GL11.glGetInteger(35380);
      GL11.glEnable(34895);
   }

   public fmd a() {
      return this.j;
   }

   @Override
   public CommandEncoder createCommandEncoder() {
      return this.h;
   }

   @Override
   public GpuTexture createTexture(@Nullable Supplier<String> $$0, int $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6) {
      return this.createTexture(this.j.b() && $$0 != null ? $$0.get() : null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public GpuTexture createTexture(@Nullable String $$0, int $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6) {
      if ($$6 < 1) {
         throw new IllegalArgumentException("mipLevels must be at least 1");
      } else if ($$5 < 1) {
         throw new IllegalArgumentException("depthOrLayers must be at least 1");
      } else {
         boolean $$7 = ($$1 & 16) != 0;
         if ($$7) {
            if ($$3 != $$4) {
               throw new IllegalArgumentException("Cubemap compatible textures must be square, but size is " + $$3 + "x" + $$4);
            }

            if ($$5 % 6 != 0) {
               throw new IllegalArgumentException("Cubemap compatible textures must have a layer count with a multiple of 6, was " + $$5);
            }

            if ($$5 > 6) {
               throw new UnsupportedOperationException("Array textures are not yet supported");
            }
         } else if ($$5 > 1) {
            throw new UnsupportedOperationException("Array or 3D textures are not yet supported");
         }

         GlStateManager.clearGlErrors();
         int $$8 = GlStateManager._genTexture();
         if ($$0 == null) {
            $$0 = String.valueOf($$8);
         }

         int $$9;
         if ($$7) {
            GL11.glBindTexture(34067, $$8);
            $$9 = 34067;
         } else {
            GlStateManager._bindTexture($$8);
            $$9 = 3553;
         }

         GlStateManager._texParameter($$9, 33085, $$6 - 1);
         GlStateManager._texParameter($$9, 33082, 0);
         GlStateManager._texParameter($$9, 33083, $$6 - 1);
         if ($$2.hasDepthAspect()) {
            GlStateManager._texParameter($$9, 34892, 0);
         }

         if ($$7) {
            for (int $$11 : GlConst.CUBEMAP_TARGETS) {
               for (int $$12 = 0; $$12 < $$6; $$12++) {
                  GlStateManager._texImage2D(
                     $$11, $$12, GlConst.toGlInternalId($$2), $$3 >> $$12, $$4 >> $$12, 0, GlConst.toGlExternalId($$2), GlConst.toGlType($$2), null
                  );
               }
            }
         } else {
            for (int $$13 = 0; $$13 < $$6; $$13++) {
               GlStateManager._texImage2D(
                  $$9, $$13, GlConst.toGlInternalId($$2), $$3 >> $$13, $$4 >> $$13, 0, GlConst.toGlExternalId($$2), GlConst.toGlType($$2), null
               );
            }
         }

         int $$14 = GlStateManager._getError();
         if ($$14 == 1285) {
            throw new flb("Could not allocate texture of " + $$3 + "x" + $$4 + " for " + $$0);
         } else if ($$14 != 0) {
            throw new IllegalStateException("OpenGL error " + $$14);
         } else {
            fmk $$15 = new fmk($$1, $$0, $$2, $$3, $$4, $$5, $$6, $$8);
            this.j.a($$15);
            return $$15;
         }
      }
   }

   @Override
   public GpuTextureView createTextureView(GpuTexture $$0) {
      return this.createTextureView($$0, 0, $$0.getMipLevels());
   }

   @Override
   public GpuTextureView createTextureView(GpuTexture $$0, int $$1, int $$2) {
      if ($$0.isClosed()) {
         throw new IllegalArgumentException("Can't create texture view with closed texture");
      } else if ($$1 >= 0 && $$1 + $$2 <= $$0.getMipLevels()) {
         return new fml((fmk)$$0, $$1, $$2);
      } else {
         throw new IllegalArgumentException(
            $$2 + " mip levels starting from " + $$1 + " would be out of range for texture with only " + $$0.getMipLevels() + " mip levels"
         );
      }
   }

   @Override
   public GpuBuffer createBuffer(@Nullable Supplier<String> $$0, int $$1, int $$2) {
      if ($$2 <= 0) {
         throw new IllegalArgumentException("Buffer size must be greater than zero");
      } else {
         GlStateManager.clearGlErrors();
         fma $$3 = this.q.a(this.l, $$0, $$1, $$2);
         int $$4 = GlStateManager._getError();
         if ($$4 == 1285) {
            throw new flb("Could not allocate buffer of " + $$2 + " for " + $$0);
         } else if ($$4 != 0) {
            throw new IllegalStateException("OpenGL error " + $$4);
         } else {
            this.j.a($$3);
            return $$3;
         }
      }
   }

   @Override
   public GpuBuffer createBuffer(@Nullable Supplier<String> $$0, int $$1, ByteBuffer $$2) {
      if (!$$2.hasRemaining()) {
         throw new IllegalArgumentException("Buffer source must not be empty");
      } else {
         GlStateManager.clearGlErrors();
         long $$3 = $$2.remaining();
         fma $$4 = this.q.a(this.l, $$0, $$1, $$2);
         int $$5 = GlStateManager._getError();
         if ($$5 == 1285) {
            throw new flb("Could not allocate buffer of " + $$3 + " for " + $$0);
         } else if ($$5 != 0) {
            throw new IllegalStateException("OpenGL error " + $$5);
         } else {
            this.j.a($$4);
            return $$4;
         }
      }
   }

   @Override
   public String getImplementationInformation() {
      return GLFW.glfwGetCurrentContext() == 0L
         ? "NO CONTEXT"
         : GlStateManager._getString(7937) + " GL version " + GlStateManager._getString(7938) + ", " + GlStateManager._getString(7936);
   }

   @Override
   public List<String> getLastDebugMessages() {
      return this.i == null ? Collections.emptyList() : this.i.a();
   }

   @Override
   public boolean isDebuggingEnabled() {
      return this.i != null;
   }

   @Override
   public String getRenderer() {
      return GlStateManager._getString(7937);
   }

   @Override
   public String getVendor() {
      return GlStateManager._getString(7936);
   }

   @Override
   public String getBackendName() {
      return "OpenGL";
   }

   @Override
   public String getVersion() {
      return GlStateManager._getString(7938);
   }

   private static int e() {
      int $$0 = GlStateManager._getInteger(3379);

      for (int $$1 = Math.max(32768, $$0); $$1 >= 1024; $$1 >>= 1) {
         GlStateManager._texImage2D(32868, 0, 6408, $$1, $$1, 0, 6408, 5121, null);
         int $$2 = GlStateManager._getTexLevelParameter(32868, 0, 4096);
         if ($$2 != 0) {
            return $$1;
         }
      }

      int $$3 = Math.max($$0, 1024);
      g.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", $$3);
      return $$3;
   }

   @Override
   public int getMaxTextureSize() {
      return this.k;
   }

   @Override
   public int getUniformOffsetAlignment() {
      return this.s;
   }

   @Override
   public void clearPipelineCache() {
      for (fmi $$0 : this.n.values()) {
         if ($$0.b() != fmg.b) {
            $$0.b().close();
         }
      }

      this.n.clear();

      for (fmj $$1 : this.o.values()) {
         if ($$1 != fmj.a) {
            $$1.close();
         }
      }

      this.o.clear();
      String $$2 = GlStateManager._getString(7937);
      if ($$2.contains("AMD")) {
         f();
      }
   }

   private static void f() {
      int $$0 = GlStateManager.glCreateShader(35633);
      GlStateManager.glShaderSource($$0, "#version 150\nvoid main() {\n    gl_Position = vec4(0.0);\n}\n");
      GlStateManager.glCompileShader($$0);
      int $$1 = GlStateManager.glCreateShader(35632);
      GlStateManager.glShaderSource(
         $$1, "#version 150\nlayout(std140) uniform Dummy {\n    float Value;\n};\nout vec4 fragColor;\nvoid main() {\n    fragColor = vec4(0.0);\n}\n"
      );
      GlStateManager.glCompileShader($$1);
      int $$2 = GlStateManager.glCreateProgram();
      GlStateManager.glAttachShader($$2, $$0);
      GlStateManager.glAttachShader($$2, $$1);
      GlStateManager.glLinkProgram($$2);
      GL31.glGetUniformBlockIndex($$2, "Dummy");
      GlStateManager.glDeleteShader($$0);
      GlStateManager.glDeleteShader($$1);
      GlStateManager.glDeleteProgram($$2);
   }

   @Override
   public List<String> getEnabledExtensions() {
      return new ArrayList<>(this.r);
   }

   @Override
   public void close() {
      this.clearPipelineCache();
   }

   public flz b() {
      return this.l;
   }

   protected fmi a(RenderPipeline $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> this.b($$0, this.m));
   }

   protected fmj a(ame $$0, ShaderType $$1, gyf $$2, BiFunction<ame, ShaderType, String> $$3) {
      fme.a $$4 = new fme.a($$0, $$1, $$2);
      return this.o.computeIfAbsent($$4, $$2x -> this.a($$4, $$3));
   }

   public fmi a(RenderPipeline $$0, @Nullable BiFunction<ame, ShaderType, String> $$1) {
      BiFunction<ame, ShaderType, String> $$2 = $$1 == null ? this.m : $$1;
      return this.n.computeIfAbsent($$0, $$2x -> this.b($$0, $$2));
   }

   private fmj a(fme.a $$0, BiFunction<ame, ShaderType, String> $$1) {
      String $$2 = $$1.apply($$0.a, $$0.b);
      if ($$2 == null) {
         g.error("Couldn't find source for {} shader ({})", $$0.b, $$0.a);
         return fmj.a;
      } else {
         String $$3 = fnl.a($$2, $$0.c);
         int $$4 = GlStateManager.glCreateShader(GlConst.toGl($$0.b));
         GlStateManager.glShaderSource($$4, $$3);
         GlStateManager.glCompileShader($$4);
         if (GlStateManager.glGetShaderi($$4, 35713) == 0) {
            String $$5 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$4, 32768));
            g.error("Couldn't compile {} shader ({}): {}", new Object[]{$$0.b.getName(), $$0.a, $$5});
            return fmj.a;
         } else {
            fmj $$6 = new fmj($$4, $$0.a, $$0.b);
            this.j.a($$6);
            return $$6;
         }
      }
   }

   private fmi b(RenderPipeline $$0, BiFunction<ame, ShaderType, String> $$1) {
      fmj $$2 = this.a($$0.getVertexShader(), ShaderType.VERTEX, $$0.getShaderDefines(), $$1);
      fmj $$3 = this.a($$0.getFragmentShader(), ShaderType.FRAGMENT, $$0.getShaderDefines(), $$1);
      if ($$2 == fmj.a) {
         g.error("Couldn't compile pipeline {}: vertex shader {} was invalid", $$0.getLocation(), $$0.getVertexShader());
         return new fmi($$0, fmg.b);
      } else if ($$3 == fmj.a) {
         g.error("Couldn't compile pipeline {}: fragment shader {} was invalid", $$0.getLocation(), $$0.getFragmentShader());
         return new fmi($$0, fmg.b);
      } else {
         fmg $$4;
         try {
            $$4 = fmg.a($$2, $$3, $$0.getVertexFormat(), $$0.getLocation().toString());
         } catch (gyg.b var7) {
            g.error("Couldn't compile program for pipeline {}: {}", $$0.getLocation(), var7);
            return new fmi($$0, fmg.b);
         }

         $$4.a($$0.getUniforms(), $$0.getSamplers());
         this.j.a($$4);
         return new fmi($$0, $$4);
      }
   }

   public fmn c() {
      return this.p;
   }

   public fly d() {
      return this.q;
   }

   record a(ame a, ShaderType b, gyf c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }
}
