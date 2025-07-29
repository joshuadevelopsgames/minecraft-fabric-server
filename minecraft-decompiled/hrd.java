import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;

public class hrd extends hrj {
   private static final String[] c = new String[]{"_1.png", "_3.png", "_5.png", "_4.png", "_0.png", "_2.png"};

   public hrd(ame $$0) {
      super($$0);
   }

   @Override
   public hrt a(axo $$0) throws IOException {
      ame $$1 = this.c();

      hrt var15;
      try (hrt $$2 = hrt.a($$0, $$1.g(c[0]))) {
         int $$3 = $$2.d().a();
         int $$4 = $$2.d().b();
         fnf $$5 = new fnf($$3, $$4 * 6, false);
         $$2.d().a($$5, 0, 0, 0, 0, $$3, $$4, false, true);

         for (int $$6 = 1; $$6 < 6; $$6++) {
            try (hrt $$7 = hrt.a($$0, $$1.g(c[$$6]))) {
               if ($$7.d().a() != $$3 || $$7.d().b() != $$4) {
                  throw new IOException(
                     "Image dimensions of cubemap '"
                        + $$1
                        + "' sides do not match: part 0 is "
                        + $$3
                        + "x"
                        + $$4
                        + ", but part "
                        + $$6
                        + " is "
                        + $$7.d().a()
                        + "x"
                        + $$7.d().b()
                  );
               }

               $$7.d().a($$5, 0, 0, 0, $$6 * $$4, $$3, $$4, false, true);
            }
         }

         var15 = new hrt($$5, new htq(true, false));
      }

      return var15;
   }

   @Override
   protected void a(fnf $$0, boolean $$1, boolean $$2) {
      GpuDevice $$3 = RenderSystem.getDevice();
      int $$4 = $$0.a();
      int $$5 = $$0.b() / 6;
      this.close();
      this.a = $$3.createTexture(this.c()::toString, 21, TextureFormat.RGBA8, $$4, $$5, 6, 1);
      this.b = $$3.createTextureView(this.a);
      this.a($$1, false);
      this.a($$2);

      for (int $$6 = 0; $$6 < 6; $$6++) {
         $$3.createCommandEncoder().writeToTexture(this.a, $$0, 0, $$6, 0, 0, $$4, $$5, 0, $$5 * $$6);
      }
   }
}
