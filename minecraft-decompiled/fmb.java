import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL11C;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL32;
import org.slf4j.Logger;

public class fmb implements CommandEncoder {
   private static final Logger a = LogUtils.getLogger();
   private final fme b;
   private final int c;
   private final int d;
   @Nullable
   private RenderPipeline e;
   private boolean f;
   @Nullable
   private fmg g;

   protected fmb(fme $$0) {
      this.b = $$0;
      this.c = $$0.b().b();
      this.d = $$0.b().b();
   }

   @Override
   public RenderPass createRenderPass(Supplier<String> $$0, GpuTextureView $$1, OptionalInt $$2) {
      return this.createRenderPass($$0, $$1, $$2, null, OptionalDouble.empty());
   }

   @Override
   public RenderPass createRenderPass(Supplier<String> $$0, GpuTextureView $$1, OptionalInt $$2, @Nullable GpuTextureView $$3, OptionalDouble $$4) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         if ($$4.isPresent() && $$3 == null) {
            a.warn("Depth clear value was provided but no depth texture is being used");
         }

         if ($$1.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
         } else if (($$1.texture().usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
         } else if ($$1.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
         } else {
            if ($$3 != null) {
               if ($$3.isClosed()) {
                  throw new IllegalStateException("Depth texture is closed");
               }

               if (($$3.texture().usage() & 8) == 0) {
                  throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
               }

               if ($$3.texture().getDepthOrLayers() > 1) {
                  throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
               }
            }

            this.f = true;
            this.b.a().a($$0);
            int $$5 = ((fmk)$$1.texture()).a(this.b.b(), $$3 == null ? null : $$3.texture());
            GlStateManager._glBindFramebuffer(36160, $$5);
            int $$6 = 0;
            if ($$2.isPresent()) {
               int $$7 = $$2.getAsInt();
               GL11.glClearColor(baj.j($$7), baj.k($$7), baj.l($$7), baj.i($$7));
               $$6 |= 16384;
            }

            if ($$3 != null && $$4.isPresent()) {
               GL11.glClearDepth($$4.getAsDouble());
               $$6 |= 256;
            }

            if ($$6 != 0) {
               GlStateManager._disableScissorTest();
               GlStateManager._depthMask(true);
               GlStateManager._colorMask(true, true, true, true);
               GlStateManager._clear($$6);
            }

            GlStateManager._viewport(0, 0, $$1.getWidth(0), $$1.getHeight(0));
            this.e = null;
            return new fmh(this, $$3 != null);
         }
      }
   }

   @Override
   public void clearColorTexture(GpuTexture $$0, int $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.a($$0);
         this.b.b().a(this.d, ((fmk)$$0).a, 0, 0, 36160);
         GL11.glClearColor(baj.j($$1), baj.k($$1), baj.l($$1), baj.i($$1));
         GlStateManager._disableScissorTest();
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16384);
         GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void clearColorAndDepthTextures(GpuTexture $$0, int $$1, GpuTexture $$2, double $$3) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.a($$0);
         this.b($$2);
         int $$4 = ((fmk)$$0).a(this.b.b(), $$2);
         GlStateManager._glBindFramebuffer(36160, $$4);
         GlStateManager._disableScissorTest();
         GL11.glClearDepth($$3);
         GL11.glClearColor(baj.j($$1), baj.k($$1), baj.l($$1), baj.i($$1));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16640);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void clearColorAndDepthTextures(GpuTexture $$0, int $$1, GpuTexture $$2, double $$3, int $$4, int $$5, int $$6, int $$7) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.a($$0);
         this.b($$2);
         this.a($$0, $$4, $$5, $$6, $$7);
         int $$8 = ((fmk)$$0).a(this.b.b(), $$2);
         GlStateManager._glBindFramebuffer(36160, $$8);
         GlStateManager._scissorBox($$4, $$5, $$6, $$7);
         GlStateManager._enableScissorTest();
         GL11.glClearDepth($$3);
         GL11.glClearColor(baj.j($$1), baj.k($$1), baj.l($$1), baj.i($$1));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16640);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   private void a(GpuTexture $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$1 < 0 || $$1 >= $$0.getWidth(0)) {
         throw new IllegalArgumentException("regionX should not be outside of the texture");
      } else if ($$2 < 0 || $$2 >= $$0.getHeight(0)) {
         throw new IllegalArgumentException("regionY should not be outside of the texture");
      } else if ($$3 <= 0) {
         throw new IllegalArgumentException("regionWidth should be greater than 0");
      } else if ($$1 + $$3 > $$0.getWidth(0)) {
         throw new IllegalArgumentException("regionWidth + regionX should be less than the texture width");
      } else if ($$4 <= 0) {
         throw new IllegalArgumentException("regionHeight should be greater than 0");
      } else if ($$2 + $$4 > $$0.getHeight(0)) {
         throw new IllegalArgumentException("regionWidth + regionX should be less than the texture height");
      }
   }

   @Override
   public void clearDepthTexture(GpuTexture $$0, double $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.b($$0);
         this.b.b().a(this.d, 0, ((fmk)$$0).a, 0, 36160);
         GL11.glDrawBuffer(0);
         GL11.glClearDepth($$1);
         GlStateManager._depthMask(true);
         GlStateManager._disableScissorTest();
         GlStateManager._clear(256);
         GL11.glDrawBuffer(36064);
         GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   private void a(GpuTexture $$0) {
      if (!$$0.getFormat().hasColorAspect()) {
         throw new IllegalStateException("Trying to clear a non-color texture as color");
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Color texture is closed");
      } else if (($$0.usage() & 8) == 0) {
         throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
      } else if ($$0.getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
      }
   }

   private void b(GpuTexture $$0) {
      if (!$$0.getFormat().hasDepthAspect()) {
         throw new IllegalStateException("Trying to clear a non-depth texture as depth");
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Depth texture is closed");
      } else if (($$0.usage() & 8) == 0) {
         throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
      } else if ($$0.getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
      }
   }

   @Override
   public void writeToBuffer(GpuBufferSlice $$0, ByteBuffer $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         fma $$2 = (fma)$$0.buffer();
         if ($$2.b) {
            throw new IllegalStateException("Buffer already closed");
         } else if (($$2.usage() & 8) == 0) {
            throw new IllegalStateException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
         } else {
            int $$3 = $$1.remaining();
            if ($$3 > $$0.length()) {
               throw new IllegalArgumentException(
                  "Cannot write more data than the slice allows (attempting to write " + $$3 + " bytes into a slice of length " + $$0.length() + ")"
               );
            } else if ($$0.length() + $$0.offset() > $$2.size) {
               throw new IllegalArgumentException(
                  "Cannot write more data than this buffer can hold (attempting to write "
                     + $$3
                     + " bytes at offset "
                     + $$0.offset()
                     + " to "
                     + $$2.size
                     + " size buffer)"
               );
            } else {
               this.b.b().a($$2.d, $$0.offset(), $$1);
            }
         }
      }
   }

   @Override
   public GpuBuffer.MappedView mapBuffer(GpuBuffer $$0, boolean $$1, boolean $$2) {
      return this.mapBuffer($$0.slice(), $$1, $$2);
   }

   @Override
   public GpuBuffer.MappedView mapBuffer(GpuBufferSlice $$0, boolean $$1, boolean $$2) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         fma $$3 = (fma)$$0.buffer();
         if ($$3.b) {
            throw new IllegalStateException("Buffer already closed");
         } else if (!$$1 && !$$2) {
            throw new IllegalArgumentException("At least read or write must be true");
         } else if ($$1 && ($$3.usage() & 1) == 0) {
            throw new IllegalStateException("Buffer is not readable");
         } else if ($$2 && ($$3.usage() & 2) == 0) {
            throw new IllegalStateException("Buffer is not writable");
         } else if ($$0.offset() + $$0.length() > $$3.size) {
            throw new IllegalArgumentException(
               "Cannot map more data than this buffer can hold (attempting to map "
                  + $$0.length()
                  + " bytes at offset "
                  + $$0.offset()
                  + " from "
                  + $$3.size
                  + " size buffer)"
            );
         } else {
            int $$4 = 0;
            if ($$1) {
               $$4 |= 1;
            }

            if ($$2) {
               $$4 |= 34;
            }

            return this.b.d().a(this.b.b(), $$3, $$0.offset(), $$0.length(), $$4);
         }
      }
   }

   @Override
   public void copyToBuffer(GpuBufferSlice $$0, GpuBufferSlice $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         fma $$2 = (fma)$$0.buffer();
         if ($$2.b) {
            throw new IllegalStateException("Source buffer already closed");
         } else if (($$2.usage() & 8) == 0) {
            throw new IllegalStateException("Source buffer needs USAGE_COPY_DST to be a destination for a copy");
         } else {
            fma $$3 = (fma)$$1.buffer();
            if ($$3.b) {
               throw new IllegalStateException("Target buffer already closed");
            } else if (($$3.usage() & 8) == 0) {
               throw new IllegalStateException("Target buffer needs USAGE_COPY_DST to be a destination for a copy");
            } else if ($$0.length() != $$1.length()) {
               throw new IllegalArgumentException(
                  "Cannot copy from slice of size " + $$0.length() + " to slice of size " + $$1.length() + ", they must be equal"
               );
            } else if ($$0.offset() + $$0.length() > $$2.size) {
               throw new IllegalArgumentException(
                  "Cannot copy more data than the source buffer holds (attempting to copy "
                     + $$0.length()
                     + " bytes at offset "
                     + $$0.offset()
                     + " from "
                     + $$2.size
                     + " size buffer)"
               );
            } else if ($$1.offset() + $$1.length() > $$3.size) {
               throw new IllegalArgumentException(
                  "Cannot copy more data than the target buffer can hold (attempting to copy "
                     + $$1.length()
                     + " bytes at offset "
                     + $$1.offset()
                     + " to "
                     + $$3.size
                     + " size buffer)"
               );
            } else {
               this.b.b().b($$2.d, $$3.d, $$0.offset(), $$1.offset(), $$0.length());
            }
         }
      }
   }

   @Override
   public void writeToTexture(GpuTexture $$0, fnf $$1) {
      int $$2 = $$0.getWidth(0);
      int $$3 = $$0.getHeight(0);
      if ($$1.a() != $$2 || $$1.b() != $$3) {
         throw new IllegalArgumentException("Cannot replace texture of size " + $$2 + "x" + $$3 + " with image of size " + $$1.a() + "x" + $$1.b());
      } else if ($$0.isClosed()) {
         throw new IllegalStateException("Destination texture is closed");
      } else if (($$0.usage() & 1) == 0) {
         throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
      } else {
         this.writeToTexture($$0, $$1, 0, 0, 0, 0, $$2, $$3, 0, 0);
      }
   }

   @Override
   public void writeToTexture(GpuTexture $$0, fnf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$2 >= 0 && $$2 < $$0.getMipLevels()) {
         if ($$8 + $$6 > $$1.a() || $$9 + $$7 > $$1.b()) {
            throw new IllegalArgumentException(
               "Copy source (" + $$1.a() + "x" + $$1.b() + ") is not large enough to read a rectangle of " + $$6 + "x" + $$7 + " from " + $$8 + "x" + $$9
            );
         } else if ($$4 + $$6 > $$0.getWidth($$2) || $$5 + $$7 > $$0.getHeight($$2)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$6
                  + "x"
                  + $$7
                  + ") is not large enough to write a rectangle of "
                  + $$6
                  + "x"
                  + $$7
                  + " at "
                  + $$4
                  + "x"
                  + $$5
                  + " (at mip level "
                  + $$2
                  + ")"
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else if (($$0.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
         } else if ($$3 >= $$0.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + $$0.getDepthOrLayers());
         } else {
            int $$10;
            if (($$0.usage() & 16) != 0) {
               $$10 = GlConst.CUBEMAP_TARGETS[$$3 % 6];
               GL11.glBindTexture(34067, ((fmk)$$0).a);
            } else {
               $$10 = 3553;
               GlStateManager._bindTexture(((fmk)$$0).a);
            }

            GlStateManager._pixelStore(3314, $$1.a());
            GlStateManager._pixelStore(3316, $$8);
            GlStateManager._pixelStore(3315, $$9);
            GlStateManager._pixelStore(3317, $$1.c().a());
            GlStateManager._texSubImage2D($$10, $$2, $$4, $$5, $$6, $$7, GlConst.toGl($$1.c()), 5121, $$1.h());
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.getMipLevels());
      }
   }

   @Override
   public void writeToTexture(GpuTexture $$0, IntBuffer $$1, fnf.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$3 >= 0 && $$3 < $$0.getMipLevels()) {
         if ($$7 * $$8 > $$1.remaining()) {
            throw new IllegalArgumentException(
               "Copy would overrun the source buffer (remaining length of " + $$1.remaining() + ", but copy is " + $$7 + "x" + $$8 + ")"
            );
         } else if ($$5 + $$7 > $$0.getWidth($$3) || $$6 + $$8 > $$0.getHeight($$3)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$0.getWidth($$3)
                  + "x"
                  + $$0.getHeight($$3)
                  + ") is not large enough to write a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " at "
                  + $$5
                  + "x"
                  + $$6
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else if (($$0.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
         } else if ($$4 >= $$0.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + $$0.getDepthOrLayers());
         } else {
            int $$9;
            if (($$0.usage() & 16) != 0) {
               $$9 = GlConst.CUBEMAP_TARGETS[$$4 % 6];
               GL11.glBindTexture(34067, ((fmk)$$0).a);
            } else {
               $$9 = 3553;
               GlStateManager._bindTexture(((fmk)$$0).a);
            }

            GlStateManager._pixelStore(3314, $$7);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, $$2.a());
            GlStateManager._texSubImage2D($$9, $$3, $$5, $$6, $$7, $$8, GlConst.toGl($$2), 5121, $$1);
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + $$0.getMipLevels());
      }
   }

   @Override
   public void copyTextureToBuffer(GpuTexture $$0, GpuBuffer $$1, int $$2, Runnable $$3, int $$4) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         this.copyTextureToBuffer($$0, $$1, $$2, $$3, $$4, 0, 0, $$0.getWidth($$4), $$0.getHeight($$4));
      }
   }

   @Override
   public void copyTextureToBuffer(GpuTexture $$0, GpuBuffer $$1, int $$2, Runnable $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$4 >= 0 && $$4 < $$0.getMipLevels()) {
         if ($$0.getWidth($$4) * $$0.getHeight($$4) * $$0.getFormat().pixelSize() + $$2 > $$1.size()) {
            throw new IllegalArgumentException(
               "Buffer of size "
                  + $$1.size()
                  + " is not large enough to hold "
                  + $$7
                  + "x"
                  + $$8
                  + " pixels ("
                  + $$0.getFormat().pixelSize()
                  + " bytes each) starting from offset "
                  + $$2
            );
         } else if (($$0.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
         } else if (($$1.usage() & 8) == 0) {
            throw new IllegalArgumentException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
         } else if ($$5 + $$7 > $$0.getWidth($$4) || $$6 + $$8 > $$0.getHeight($$4)) {
            throw new IllegalArgumentException(
               "Copy source texture ("
                  + $$0.getWidth($$4)
                  + "x"
                  + $$0.getHeight($$4)
                  + ") is not large enough to read a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " from "
                  + $$5
                  + ","
                  + $$6
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
         } else if ($$1.isClosed()) {
            throw new IllegalStateException("Destination buffer is closed");
         } else if ($$0.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
         } else {
            GlStateManager.clearGlErrors();
            this.b.b().a(this.c, ((fmk)$$0).a(), 0, $$4, 36008);
            GlStateManager._glBindBuffer(35051, ((fma)$$1).d);
            GlStateManager._pixelStore(3330, $$7);
            GlStateManager._readPixels($$5, $$6, $$7, $$8, GlConst.toGlExternalId($$0.getFormat()), GlConst.toGlType($$0.getFormat()), $$2);
            RenderSystem.queueFencedTask($$3);
            GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, 0, $$4);
            GlStateManager._glBindFramebuffer(36008, 0);
            GlStateManager._glBindBuffer(35051, 0);
            int $$9 = GlStateManager._getError();
            if ($$9 != 0) {
               throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + $$0.getLabel() + ": GL error " + $$9);
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$4 + ", must be >= 0 and < " + $$0.getMipLevels());
      }
   }

   @Override
   public void copyTextureToTexture(GpuTexture $$0, GpuTexture $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$2 >= 0 && $$2 < $$0.getMipLevels() && $$2 < $$1.getMipLevels()) {
         if ($$3 + $$7 > $$1.getWidth($$2) || $$4 + $$8 > $$1.getHeight($$2)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$1.getWidth($$2)
                  + "x"
                  + $$1.getHeight($$2)
                  + ") is not large enough to write a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " at "
                  + $$3
                  + "x"
                  + $$4
            );
         } else if ($$5 + $$7 > $$0.getWidth($$2) || $$6 + $$8 > $$0.getHeight($$2)) {
            throw new IllegalArgumentException(
               "Source texture ("
                  + $$0.getWidth($$2)
                  + "x"
                  + $$0.getHeight($$2)
                  + ") is not large enough to read a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " at "
                  + $$5
                  + "x"
                  + $$6
            );
         } else if ($$0.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
         } else if ($$1.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else if (($$0.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
         } else if (($$1.usage() & 1) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_DST to be a destination for a copy");
         } else if ($$0.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
         } else if ($$1.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
         } else {
            GlStateManager.clearGlErrors();
            GlStateManager._disableScissorTest();
            boolean $$9 = $$0.getFormat().hasDepthAspect();
            int $$10 = ((fmk)$$0).a();
            int $$11 = ((fmk)$$1).a();
            this.b.b().a(this.c, $$9 ? 0 : $$10, $$9 ? $$10 : 0, 0, 0);
            this.b.b().a(this.d, $$9 ? 0 : $$11, $$9 ? $$11 : 0, 0, 0);
            this.b.b().a(this.c, this.d, $$5, $$6, $$7, $$8, $$3, $$4, $$7, $$8, $$9 ? 256 : 16384, 9728);
            int $$12 = GlStateManager._getError();
            if ($$12 != 0) {
               throw new IllegalStateException("Couldn't perform copyToTexture for texture " + $$0.getLabel() + " to " + $$1.getLabel() + ": GL error " + $$12);
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.getMipLevels() + " and < " + $$1.getMipLevels());
      }
   }

   @Override
   public void presentTexture(GpuTextureView $$0) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (!$$0.texture().getFormat().hasColorAspect()) {
         throw new IllegalStateException("Cannot present a non-color texture!");
      } else if (($$0.texture().usage() & 8) == 0) {
         throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT to presented to the screen");
      } else if ($$0.texture().getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for presentation");
      } else {
         GlStateManager._disableScissorTest();
         GlStateManager._viewport(0, 0, $$0.getWidth(0), $$0.getHeight(0));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         this.b.b().a(this.d, ((fmk)$$0.texture()).a(), 0, 0, 0);
         this.b.b().a(this.d, 0, 0, 0, $$0.getWidth(0), $$0.getHeight(0), 0, 0, $$0.getWidth(0), $$0.getHeight(0), 16384, 9728);
      }
   }

   @Override
   public GpuFence createFence() {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         return new fmf();
      }
   }

   protected <T> void a(fmh $$0, Collection<RenderPass.a<T>> $$1, @Nullable GpuBuffer $$2, @Nullable VertexFormat.a $$3, Collection<String> $$4, T $$5) {
      if (this.a($$0, $$4)) {
         if ($$3 == null) {
            $$3 = VertexFormat.a.a;
         }

         for (RenderPass.a<T> $$6 : $$1) {
            VertexFormat.a $$7 = $$6.d() == null ? $$3 : $$6.d();
            $$0.setIndexBuffer($$6.c() == null ? $$2 : $$6.c(), $$7);
            $$0.setVertexBuffer($$6.a(), $$6.b());
            if (fmh.b) {
               if ($$0.e == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if ($$0.e.isClosed()) {
                  throw new IllegalStateException("Index buffer has been closed!");
               }

               if ($$0.d[0] == null) {
                  throw new IllegalStateException("Missing vertex buffer at slot 0");
               }

               if ($$0.d[0].isClosed()) {
                  throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
               }
            }

            BiConsumer<T, RenderPass.b> $$8 = $$6.g();
            if ($$8 != null) {
               $$8.accept($$5, ($$1x, $$2x) -> {
                  if ($$0.c.b().a($$1x) instanceof fmm.b(int $$5x)) {
                     GL32.glBindBufferRange(35345, $$5x, ((fma)$$2x.buffer()).d, $$2x.offset(), $$2x.length());
                  }
               });
            }

            this.a($$0, 0, $$6.e(), $$6.f(), $$7, $$0.c, 1);
         }
      }
   }

   protected void a(fmh $$0, int $$1, int $$2, int $$3, @Nullable VertexFormat.a $$4, int $$5) {
      if (this.a($$0, Collections.emptyList())) {
         if (fmh.b) {
            if ($$4 != null) {
               if ($$0.e == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if ($$0.e.isClosed()) {
                  throw new IllegalStateException("Index buffer has been closed!");
               }

               if (($$0.e.usage() & 64) == 0) {
                  throw new IllegalStateException("Index buffer must have GpuBuffer.USAGE_INDEX!");
               }
            }

            if ($$0.d[0] == null) {
               throw new IllegalStateException("Missing vertex buffer at slot 0");
            }

            if ($$0.d[0].isClosed()) {
               throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
            }

            if (($$0.d[0].usage() & 32) == 0) {
               throw new IllegalStateException("Vertex buffer must have GpuBuffer.USAGE_VERTEX!");
            }
         }

         this.a($$0, $$1, $$2, $$3, $$4, $$0.c, $$5);
      }
   }

   private void a(fmh $$0, int $$1, int $$2, int $$3, @Nullable VertexFormat.a $$4, fmi $$5, int $$6) {
      this.b.c().a($$5.a().getVertexFormat(), (fma)$$0.d[0]);
      if ($$4 != null) {
         GlStateManager._glBindBuffer(34963, ((fma)$$0.e).d);
         if ($$6 > 1) {
            if ($$1 > 0) {
               GL32.glDrawElementsInstancedBaseVertex(GlConst.toGl($$5.a().getVertexFormatMode()), $$3, GlConst.toGl($$4), (long)$$2 * $$4.c, $$6, $$1);
            } else {
               GL31.glDrawElementsInstanced(GlConst.toGl($$5.a().getVertexFormatMode()), $$3, GlConst.toGl($$4), (long)$$2 * $$4.c, $$6);
            }
         } else if ($$1 > 0) {
            GL32.glDrawElementsBaseVertex(GlConst.toGl($$5.a().getVertexFormatMode()), $$3, GlConst.toGl($$4), (long)$$2 * $$4.c, $$1);
         } else {
            GlStateManager._drawElements(GlConst.toGl($$5.a().getVertexFormatMode()), $$3, GlConst.toGl($$4), (long)$$2 * $$4.c);
         }
      } else if ($$6 > 1) {
         GL31.glDrawArraysInstanced(GlConst.toGl($$5.a().getVertexFormatMode()), $$1, $$3, $$6);
      } else {
         GlStateManager._drawArrays(GlConst.toGl($$5.a().getVertexFormatMode()), $$1, $$3);
      }
   }

   private boolean a(fmh $$0, Collection<String> $$1) {
      if (fmh.b) {
         if ($$0.c == null) {
            throw new IllegalStateException("Can't draw without a render pipeline");
         }

         if ($$0.c.b() == fmg.b) {
            throw new IllegalStateException("Pipeline contains invalid shader program");
         }

         for (RenderPipeline.UniformDescription $$2 : $$0.c.a().getUniforms()) {
            GpuBufferSlice $$3 = $$0.g.get($$2.name());
            if (!$$1.contains($$2.name())) {
               if ($$3 == null) {
                  throw new IllegalStateException("Missing uniform " + $$2.name() + " (should be " + $$2.type() + ")");
               }

               if ($$2.type() == fnt.a) {
                  if ($$3.buffer().isClosed()) {
                     throw new IllegalStateException("Uniform buffer " + $$2.name() + " is already closed");
                  }

                  if (($$3.buffer().usage() & 128) == 0) {
                     throw new IllegalStateException("Uniform buffer " + $$2.name() + " must have GpuBuffer.USAGE_UNIFORM");
                  }
               }

               if ($$2.type() == fnt.b) {
                  if ($$3.offset() != 0 || $$3.length() != $$3.buffer().size()) {
                     throw new IllegalStateException("Uniform texel buffers do not support a slice of a buffer, must be entire buffer");
                  }

                  if ($$2.textureFormat() == null) {
                     throw new IllegalStateException("Invalid uniform texel buffer " + $$2.name() + " (missing a texture format)");
                  }
               }
            }
         }

         for (Entry<String, fmm> $$4 : $$0.c.b().c().entrySet()) {
            if ($$4.getValue() instanceof fmm.a) {
               String $$5 = $$4.getKey();
               fml $$6 = (fml)$$0.h.get($$5);
               if ($$6 == null) {
                  throw new IllegalStateException("Missing sampler " + $$5);
               }

               if ($$6.isClosed()) {
                  throw new IllegalStateException("Sampler " + $$5 + " (" + $$6.a().getLabel() + ") has been closed!");
               }

               if (($$6.a().usage() & 4) == 0) {
                  throw new IllegalStateException("Sampler " + $$5 + " (" + $$6.a().getLabel() + ") must have USAGE_TEXTURE_BINDING!");
               }
            }
         }

         if ($$0.c.a().wantsDepthTexture() && !$$0.a()) {
            a.warn("Render pipeline {} wants a depth texture but none was provided - this is probably a bug", $$0.c.a().getLocation());
         }
      } else if ($$0.c == null || $$0.c.b() == fmg.b) {
         return false;
      }

      RenderPipeline $$7 = $$0.c.a();
      fmg $$8 = $$0.c.b();
      this.a($$7);
      boolean $$9 = this.g != $$8;
      if ($$9) {
         GlStateManager._glUseProgram($$8.a());
         this.g = $$8;
      }

      for (Entry<String, fmm> $$10 : $$8.c().entrySet()) {
         String $$11 = $$10.getKey();
         boolean $$12 = $$0.i.contains($$11);
         switch ((fmm)$$10.getValue()) {
            case fmm.b(int var61):
               int var39 = var61;
               if ($$12) {
                  GpuBufferSlice $$14 = $$0.g.get($$11);
                  GL32.glBindBufferRange(35345, var39, ((fma)$$14.buffer()).d, $$14.offset(), $$14.length());
               }
               break;
            case fmm.c(int var41, int var42, TextureFormat var43, int var59):
               int var44 = var59;
               if ($$9 || $$12) {
                  GlStateManager._glUniform1i(var41, var42);
               }

               GlStateManager._activeTexture(33984 + var42);
               GL11C.glBindTexture(35882, var44);
               if ($$12) {
                  GpuBufferSlice $$19 = $$0.g.get($$11);
                  GL31.glTexBuffer(35882, GlConst.toGlInternalId(var43), ((fma)$$19.buffer()).d);
               }
               break;
            case fmm.a(int $$22, int var51):
               int var46 = var51;
               fml $$22x = (fml)$$0.h.get($$11);
               if ($$22x == null) {
                  break;
               }

               if ($$9 || $$12) {
                  GlStateManager._glUniform1i($$22, var46);
               }

               GlStateManager._activeTexture(33984 + var46);
               fmk $$23 = $$22x.a();
               int $$24;
               if (($$23.usage() & 16) != 0) {
                  $$24 = 34067;
                  GL11.glBindTexture(34067, $$23.a);
               } else {
                  $$24 = 3553;
                  GlStateManager._bindTexture($$23.a);
               }

               GlStateManager._texParameter($$24, 33084, $$22x.baseMipLevel());
               GlStateManager._texParameter($$24, 33085, $$22x.baseMipLevel() + $$22x.mipLevels() - 1);
               $$23.a($$24);
               break;
            default:
               throw new MatchException(null, null);
         }
      }

      $$0.i.clear();
      if ($$0.b()) {
         GlStateManager._enableScissorTest();
         GlStateManager._scissorBox($$0.c(), $$0.d(), $$0.e(), $$0.f());
      } else {
         GlStateManager._disableScissorTest();
      }

      return true;
   }

   private void a(RenderPipeline $$0) {
      if (this.e != $$0) {
         this.e = $$0;
         if ($$0.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
            GlStateManager._enableDepthTest();
            GlStateManager._depthFunc(GlConst.toGl($$0.getDepthTestFunction()));
         } else {
            GlStateManager._disableDepthTest();
         }

         if ($$0.isCull()) {
            GlStateManager._enableCull();
         } else {
            GlStateManager._disableCull();
         }

         if ($$0.getBlendFunction().isPresent()) {
            GlStateManager._enableBlend();
            BlendFunction $$1 = $$0.getBlendFunction().get();
            GlStateManager._blendFuncSeparate(
               GlConst.toGl($$1.sourceColor()), GlConst.toGl($$1.destColor()), GlConst.toGl($$1.sourceAlpha()), GlConst.toGl($$1.destAlpha())
            );
         } else {
            GlStateManager._disableBlend();
         }

         GlStateManager._polygonMode(1032, GlConst.toGl($$0.getPolygonMode()));
         GlStateManager._depthMask($$0.isWriteDepth());
         GlStateManager._colorMask($$0.isWriteColor(), $$0.isWriteColor(), $$0.isWriteColor(), $$0.isWriteAlpha());
         if ($$0.getDepthBiasConstant() == 0.0F && $$0.getDepthBiasScaleFactor() == 0.0F) {
            GlStateManager._disablePolygonOffset();
         } else {
            GlStateManager._polygonOffset($$0.getDepthBiasScaleFactor(), $$0.getDepthBiasConstant());
            GlStateManager._enablePolygonOffset();
         }

         switch ($$0.getColorLogic()) {
            case NONE:
               GlStateManager._disableColorLogicOp();
               break;
            case OR_REVERSE:
               GlStateManager._enableColorLogicOp();
               GlStateManager._logicOp(5387);
         }
      }
   }

   public void a() {
      this.f = false;
      GlStateManager._glBindFramebuffer(36160, 0);
      this.b.a().a();
   }

   protected fme b() {
      return this.b;
   }
}
