import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fmq extends fmr {
   public static final int a = 854;
   public static final int b = 480;
   static final fmq.a n = new fmq.a(854, 480);

   public fmq(int $$0, int $$1) {
      super("Main", true);
      this.c($$0, $$1);
   }

   private void c(int $$0, int $$1) {
      fmq.a $$2 = this.d($$0, $$1);
      if (this.i != null && this.k != null) {
         this.i.setTextureFilter(FilterMode.NEAREST, false);
         this.i.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         this.i.setTextureFilter(FilterMode.NEAREST, false);
         this.i.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         this.e = $$2.a;
         this.f = $$2.b;
         this.c = $$2.a;
         this.d = $$2.b;
      } else {
         throw new IllegalStateException("Missing color and/or depth textures");
      }
   }

   private fmq.a d(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();

      for (fmq.a $$2 : fmq.a.a($$0, $$1)) {
         if (this.i != null) {
            this.i.close();
            this.i = null;
         }

         if (this.j != null) {
            this.j.close();
            this.j = null;
         }

         if (this.k != null) {
            this.k.close();
            this.k = null;
         }

         if (this.l != null) {
            this.l.close();
            this.l = null;
         }

         this.i = this.a($$2);
         this.k = this.b($$2);
         if (this.i != null && this.k != null) {
            this.j = RenderSystem.getDevice().createTextureView(this.i);
            this.l = RenderSystem.getDevice().createTextureView(this.k);
            return $$2;
         }
      }

      throw new RuntimeException(
         "Unrecoverable GL_OUT_OF_MEMORY ("
            + (this.i == null ? "missing color" : "have color")
            + ", "
            + (this.k == null ? "missing depth" : "have depth")
            + ")"
      );
   }

   @Nullable
   private GpuTexture a(fmq.a $$0) {
      try {
         return RenderSystem.getDevice().createTexture(() -> this.g + " / Color", 15, TextureFormat.RGBA8, $$0.a, $$0.b, 1, 1);
      } catch (flb var3) {
         return null;
      }
   }

   @Nullable
   private GpuTexture b(fmq.a $$0) {
      try {
         return RenderSystem.getDevice().createTexture(() -> this.g + " / Depth", 15, TextureFormat.DEPTH32, $$0.a, $$0.b, 1, 1);
      } catch (flb var3) {
         return null;
      }
   }

   static class a {
      public final int a;
      public final int b;

      a(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      static List<fmq.a> a(int $$0, int $$1) {
         RenderSystem.assertOnRenderThread();
         int $$2 = RenderSystem.getDevice().getMaxTextureSize();
         return $$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2 ? ImmutableList.of(new fmq.a($$0, $$1), fmq.n) : ImmutableList.of(fmq.n);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fmq.a $$1 = (fmq.a)$$0;
            return this.a == $$1.a && this.b == $$1.b;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b);
      }

      @Override
      public String toString() {
         return this.a + "x" + this.b;
      }
   }
}
