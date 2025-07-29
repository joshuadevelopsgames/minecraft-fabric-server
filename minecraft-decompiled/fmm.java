import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.TextureFormat;

public sealed interface fmm extends AutoCloseable permits fmm.b, fmm.c, fmm.a {
   @Override
   default void close() {
   }

   public record a(int a, int b) implements fmm {
   }

   public record b(int a) implements fmm {
   }

   public record c(int a, int b, TextureFormat c, int d) implements fmm {
      public c(int $$0, int $$1, TextureFormat $$2) {
         this($$0, $$1, $$2, GlStateManager._genTexture());
      }

      @Override
      public void close() {
         GlStateManager._deleteTexture(this.d);
      }
   }
}
