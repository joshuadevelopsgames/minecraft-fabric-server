import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hrf extends hrc implements hre {
   private static final Logger c = LogUtils.getLogger();
   @Nullable
   private fnf d;

   public hrf(Supplier<String> $$0, fnf $$1) {
      this.d = $$1;
      this.a($$0);
      this.c();
   }

   public hrf(String $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fnf($$1, $$2, $$3);
      this.a($$0);
   }

   public hrf(Supplier<String> $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fnf($$1, $$2, $$3);
      this.a($$0);
   }

   private void a(Supplier<String> $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      this.a = $$1.createTexture($$0, 5, TextureFormat.RGBA8, this.d.a(), this.d.b(), 1, 1);
      this.a.setTextureFilter(FilterMode.NEAREST, false);
      this.b = $$1.createTextureView(this.a);
   }

   private void a(String $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      this.a = $$1.createTexture($$0, 5, TextureFormat.RGBA8, this.d.a(), this.d.b(), 1, 1);
      this.a.setTextureFilter(FilterMode.NEAREST, false);
      this.b = $$1.createTextureView(this.a);
   }

   public void c() {
      if (this.d != null && this.a != null) {
         RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.a, this.d);
      } else {
         c.warn("Trying to upload disposed texture {}", this.a().getLabel());
      }
   }

   @Nullable
   public fnf d() {
      return this.d;
   }

   public void a(fnf $$0) {
      if (this.d != null) {
         this.d.close();
      }

      this.d = $$0;
   }

   @Override
   public void close() {
      if (this.d != null) {
         this.d.close();
         this.d = null;
      }

      super.close();
   }

   @Override
   public void a(ame $$0, Path $$1) throws IOException {
      if (this.d != null) {
         String $$2 = $$0.c() + ".png";
         Path $$3 = $$1.resolve($$2);
         this.d.a($$3);
      }
   }
}
