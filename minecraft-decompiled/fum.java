import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fum {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "screenshots";

   public static void a(File $$0, fmr $$1, Consumer<xo> $$2) {
      a($$0, null, $$1, 1, $$2);
   }

   public static void a(File $$0, @Nullable String $$1, fmr $$2, int $$3, Consumer<xo> $$4) {
      a($$2, $$3, $$3x -> {
         File $$4x = new File($$0, "screenshots");
         $$4x.mkdir();
         File $$5;
         if ($$1 == null) {
            $$5 = a($$4x);
         } else {
            $$5 = new File($$4x, $$1);
         }

         ag.i().execute(() -> {
            try {
               fnf $$4xx = $$3x;

               try {
                  $$3x.a($$5);
                  xo $$3xx = xo.b($$5.getName()).a(o.t).a($$1xxx -> $$1xxx.a(new xm.e($$5.getAbsoluteFile())));
                  $$4.accept(xo.a("screenshot.success", $$3xx));
               } catch (Throwable var7) {
                  if ($$3x != null) {
                     try {
                        $$4xx.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if ($$3x != null) {
                  $$3x.close();
               }
            } catch (Exception var8) {
               b.warn("Couldn't save screenshot", var8);
               $$4.accept(xo.a("screenshot.failure", var8.getMessage()));
            }
         });
      });
   }

   public static void a(fmr $$0, Consumer<fnf> $$1) {
      a($$0, 1, $$1);
   }

   public static void a(fmr $$0, int $$1, Consumer<fnf> $$2) {
      int $$3 = $$0.c;
      int $$4 = $$0.d;
      GpuTexture $$5 = $$0.c();
      if ($$5 == null) {
         throw new IllegalStateException("Tried to capture screenshot of an incomplete framebuffer");
      } else if ($$3 % $$1 == 0 && $$4 % $$1 == 0) {
         GpuBuffer $$6 = RenderSystem.getDevice().createBuffer(() -> "Screenshot buffer", 9, $$3 * $$4 * $$5.getFormat().pixelSize());
         CommandEncoder $$7 = RenderSystem.getDevice().createCommandEncoder();
         RenderSystem.getDevice().createCommandEncoder().copyTextureToBuffer($$5, $$6, 0, () -> {
            try (GpuBuffer.MappedView $$7x = $$7.mapBuffer($$6, true, false)) {
               int $$8 = $$4 / $$1;
               int $$9 = $$3 / $$1;
               fnf $$10 = new fnf($$9, $$8, false);

               for (int $$11 = 0; $$11 < $$8; $$11++) {
                  for (int $$12 = 0; $$12 < $$9; $$12++) {
                     if ($$1 == 1) {
                        int $$13 = $$7x.data().getInt(($$12 + $$11 * $$3) * $$5.getFormat().pixelSize());
                        $$10.a($$12, $$4 - $$11 - 1, $$13 | 0xFF000000);
                     } else {
                        int $$14 = 0;
                        int $$15 = 0;
                        int $$16 = 0;

                        for (int $$17 = 0; $$17 < $$1; $$17++) {
                           for (int $$18 = 0; $$18 < $$1; $$18++) {
                              int $$19 = $$7x.data().getInt(($$12 * $$1 + $$17 + ($$11 * $$1 + $$18) * $$3) * $$5.getFormat().pixelSize());
                              $$14 += baj.b($$19);
                              $$15 += baj.c($$19);
                              $$16 += baj.d($$19);
                           }
                        }

                        int $$20 = $$1 * $$1;
                        $$10.a($$12, $$8 - $$11 - 1, baj.a(255, $$14 / $$20, $$15 / $$20, $$16 / $$20));
                     }
                  }
               }

               $$2.accept($$10);
            }

            $$6.close();
         }, 0);
      } else {
         throw new IllegalArgumentException("Image size is not divisible by downscale factor");
      }
   }

   private static File a(File $$0) {
      String $$1 = ag.f();
      int $$2 = 1;

      while (true) {
         File $$3 = new File($$0, $$1 + ($$2 == 1 ? "" : "_" + $$2) + ".png");
         if (!$$3.exists()) {
            return $$3;
         }

         $$2++;
      }
   }
}
