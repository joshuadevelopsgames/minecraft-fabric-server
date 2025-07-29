import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;

public abstract class hrj extends hrc {
   private final ame c;

   public hrj(ame $$0) {
      this.c = $$0;
   }

   public ame c() {
      return this.c;
   }

   public void a(hrt $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();

      try (fnf $$3 = $$0.d()) {
         this.a($$3, $$2, $$1);
      }
   }

   protected void a(fnf $$0, boolean $$1, boolean $$2) {
      GpuDevice $$3 = RenderSystem.getDevice();
      this.close();
      this.a = $$3.createTexture(this.c::toString, 5, TextureFormat.RGBA8, $$0.a(), $$0.b(), 1, 1);
      this.b = $$3.createTextureView(this.a);
      this.a($$1, false);
      this.a($$2);
      $$3.createCommandEncoder().writeToTexture(this.a, $$0);
   }

   public abstract hrt a(axo var1) throws IOException;
}
