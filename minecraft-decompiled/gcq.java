import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import javax.annotation.Nullable;

public abstract class gcq<T extends gdj> implements AutoCloseable {
   protected final gxn.a a;
   @Nullable
   private GpuTexture b;
   @Nullable
   private GpuTextureView c;
   @Nullable
   private GpuTexture d;
   @Nullable
   private GpuTextureView e;
   private final gwt f = new gwt("PIP - " + this.getClass().getSimpleName(), -1000.0F, 1000.0F, true);

   protected gcq(gxn.a $$0) {
      this.a = $$0;
   }

   public void a(T $$0, gcy $$1, int $$2) {
      int $$3 = ($$0.g() - $$0.e()) * $$2;
      int $$4 = ($$0.h() - $$0.f()) * $$2;
      boolean $$5 = this.b == null || this.b.getWidth(0) != $$3 || this.b.getHeight(0) != $$4;
      if (!$$5 && this.a($$0)) {
         this.a($$0, $$1);
      } else {
         this.a($$5, $$3, $$4);
         RenderSystem.outputColorTextureOverride = this.c;
         RenderSystem.outputDepthTextureOverride = this.e;
         fod $$6 = new fod();
         $$6.a($$3 / 2.0F, this.a($$4, $$2), 0.0F);
         float $$7 = $$2 * $$0.a();
         $$6.b($$7, $$7, -$$7);
         this.a($$0, $$6);
         this.a.b();
         RenderSystem.outputColorTextureOverride = null;
         RenderSystem.outputDepthTextureOverride = null;
         this.a($$0, $$1);
      }
   }

   protected void a(T $$0, gcy $$1) {
      $$1.a(new gcs(gxx.as, gch.a(this.c), $$0.aU_(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), 0.0F, 1.0F, 1.0F, 0.0F, -1, $$0.i(), null));
   }

   private void a(boolean $$0, int $$1, int $$2) {
      if (this.b != null && $$0) {
         this.b.close();
         this.b = null;
         this.c.close();
         this.c = null;
         this.d.close();
         this.d = null;
         this.e.close();
         this.e = null;
      }

      GpuDevice $$3 = RenderSystem.getDevice();
      if (this.b == null) {
         this.b = $$3.createTexture(() -> "UI " + this.b() + " texture", 12, TextureFormat.RGBA8, $$1, $$2, 1, 1);
         this.b.setTextureFilter(FilterMode.NEAREST, false);
         this.c = $$3.createTextureView(this.b);
         this.d = $$3.createTexture(() -> "UI " + this.b() + " depth texture", 8, TextureFormat.DEPTH32, $$1, $$2, 1, 1);
         this.e = $$3.createTextureView(this.d);
      }

      $$3.createCommandEncoder().clearColorAndDepthTextures(this.b, 0, this.d, 1.0);
      RenderSystem.setProjectionMatrix(this.f.a($$1, $$2), fle.b);
   }

   protected boolean a(T $$0) {
      return false;
   }

   protected float a(int $$0, int $$1) {
      return $$0;
   }

   @Override
   public void close() {
      if (this.b != null) {
         this.b.close();
      }

      if (this.c != null) {
         this.c.close();
      }

      if (this.d != null) {
         this.d.close();
      }

      if (this.e != null) {
         this.e.close();
      }

      this.f.close();
   }

   public abstract Class<T> a();

   protected abstract void a(T var1, fod var2);

   protected abstract String b();
}
