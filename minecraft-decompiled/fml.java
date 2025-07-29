import com.mojang.blaze3d.textures.GpuTextureView;

public class fml extends GpuTextureView {
   private boolean a;

   protected fml(fmk $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
      $$0.b();
   }

   @Override
   public boolean isClosed() {
      return this.a;
   }

   @Override
   public void close() {
      if (!this.a) {
         this.a = true;
         this.a().c();
      }
   }

   public fmk a() {
      return (fmk)super.texture();
   }
}
