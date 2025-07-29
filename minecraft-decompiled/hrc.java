import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import javax.annotation.Nullable;

public abstract class hrc implements AutoCloseable {
   @Nullable
   protected GpuTexture a;
   @Nullable
   protected GpuTextureView b;

   public void a(boolean $$0) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't change its clamp before something initializes it");
      } else {
         this.a.setAddressMode($$0 ? AddressMode.CLAMP_TO_EDGE : AddressMode.REPEAT);
      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get change its filter before something initializes it");
      } else {
         this.a.setTextureFilter($$0 ? FilterMode.LINEAR : FilterMode.NEAREST, $$1);
      }
   }

   public void b(boolean $$0) {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get change its filter before something initializes it");
      } else {
         this.a.setUseMipmaps($$0);
      }
   }

   @Override
   public void close() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }

      if (this.b != null) {
         this.b.close();
         this.b = null;
      }
   }

   public GpuTexture a() {
      if (this.a == null) {
         throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
      } else {
         return this.a;
      }
   }

   public GpuTextureView b() {
      if (this.b == null) {
         throw new IllegalStateException("Texture view does not exist, can't get it before something initializes it");
      } else {
         return this.b;
      }
   }
}
