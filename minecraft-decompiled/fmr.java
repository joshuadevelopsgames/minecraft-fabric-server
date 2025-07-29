import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public abstract class fmr {
   private static int a = 0;
   public int c;
   public int d;
   public int e;
   public int f;
   protected final String g;
   public final boolean h;
   @Nullable
   protected GpuTexture i;
   @Nullable
   protected GpuTextureView j;
   @Nullable
   protected GpuTexture k;
   @Nullable
   protected GpuTextureView l;
   public FilterMode m;

   public fmr(@Nullable String $$0, boolean $$1) {
      this.g = $$0 == null ? "FBO " + a++ : $$0;
      this.h = $$1;
   }

   public void a(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      this.a();
      this.b($$0, $$1);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      if (this.k != null) {
         this.k.close();
         this.k = null;
      }

      if (this.l != null) {
         this.l.close();
         this.l = null;
      }

      if (this.i != null) {
         this.i.close();
         this.i = null;
      }

      if (this.j != null) {
         this.j.close();
         this.j = null;
      }
   }

   public void a(fmr $$0) {
      RenderSystem.assertOnRenderThread();
      if (this.k == null) {
         throw new IllegalStateException("Trying to copy depth texture to a RenderTarget without a depth texture");
      } else if ($$0.k == null) {
         throw new IllegalStateException("Trying to copy depth texture from a RenderTarget without a depth texture");
      } else {
         RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture($$0.k, this.k, 0, 0, 0, 0, 0, this.c, this.d);
      }
   }

   public void b(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      GpuDevice $$2 = RenderSystem.getDevice();
      int $$3 = $$2.getMaxTextureSize();
      if ($$0 > 0 && $$0 <= $$3 && $$1 > 0 && $$1 <= $$3) {
         this.e = $$0;
         this.f = $$1;
         this.c = $$0;
         this.d = $$1;
         if (this.h) {
            this.k = $$2.createTexture(() -> this.g + " / Depth", 15, TextureFormat.DEPTH32, $$0, $$1, 1, 1);
            this.l = $$2.createTextureView(this.k);
            this.k.setTextureFilter(FilterMode.NEAREST, false);
            this.k.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         }

         this.i = $$2.createTexture(() -> this.g + " / Color", 15, TextureFormat.RGBA8, $$0, $$1, 1, 1);
         this.j = $$2.createTextureView(this.i);
         this.i.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         this.a(FilterMode.NEAREST, true);
      } else {
         throw new IllegalArgumentException("Window " + $$0 + "x" + $$1 + " size out of bounds (max. size: " + $$3 + ")");
      }
   }

   public void a(FilterMode $$0) {
      this.a($$0, false);
   }

   private void a(FilterMode $$0, boolean $$1) {
      if (this.i == null) {
         throw new IllegalStateException("Can't change filter mode, color texture doesn't exist yet");
      } else {
         if ($$1 || $$0 != this.m) {
            this.m = $$0;
            this.i.setTextureFilter($$0, false);
         }
      }
   }

   public void b() {
      if (this.i == null) {
         throw new IllegalStateException("Can't blit to screen, color texture doesn't exist yet");
      } else {
         RenderSystem.getDevice().createCommandEncoder().presentTexture(this.j);
      }
   }

   public void a(GpuTextureView $$0) {
      RenderSystem.assertOnRenderThread();
      RenderSystem.a $$1 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
      GpuBuffer $$2 = $$1.b(6);
      GpuBuffer $$3 = RenderSystem.getQuadVertexBuffer();

      try (RenderPass $$4 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Blit render target", $$0, OptionalInt.empty())) {
         $$4.setPipeline(gxx.aA);
         RenderSystem.bindDefaultUniforms($$4);
         $$4.setVertexBuffer(0, $$3);
         $$4.setIndexBuffer($$2, $$1.a());
         $$4.bindSampler("InSampler", this.j);
         $$4.drawIndexed(0, 0, 6, 1);
      }
   }

   @Nullable
   public GpuTexture c() {
      return this.i;
   }

   @Nullable
   public GpuTextureView d() {
      return this.j;
   }

   @Nullable
   public GpuTexture e() {
      return this.k;
   }

   @Nullable
   public GpuTextureView f() {
      return this.l;
   }
}
