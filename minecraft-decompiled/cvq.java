import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cvq {
   public static final float a = 0.3F;

   public static fiq a(bzm $$0, Predicate<bzm> $$1) {
      fis $$2 = $$0.dA();
      dmu $$3 = $$0.ai();
      fis $$4 = $$0.dv();
      return a($$4, $$0, $$1, $$2, $$3, a($$0), dmb.a.a);
   }

   public static fiq a(bzm $$0, Predicate<bzm> $$1, dmb.a $$2) {
      fis $$3 = $$0.dA();
      dmu $$4 = $$0.ai();
      fis $$5 = $$0.dv();
      return a($$5, $$0, $$1, $$3, $$4, a($$0), $$2);
   }

   public static fiq a(bzm $$0, Predicate<bzm> $$1, double $$2) {
      fis $$3 = $$0.h(0.0F).c($$2);
      dmu $$4 = $$0.ai();
      fis $$5 = $$0.bI();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dmb.a.a);
   }

   private static fiq a(fis $$0, bzm $$1, Predicate<bzm> $$2, fis $$3, dmu $$4, float $$5, dmb.a $$6) {
      fis $$7 = $$0.e($$3);
      fiq $$8 = $$4.b(new dmb($$0, $$7, $$6, dmb.b.a, $$1));
      if ($$8.d() != fiq.a.a) {
         $$7 = $$8.g();
      }

      fiq $$9 = a($$4, $$1, $$0, $$7, $$1.cV().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fip a(bzm $$0, fis $$1, fis $$2, fin $$3, Predicate<bzm> $$4, double $$5) {
      dmu $$6 = $$0.ai();
      double $$7 = $$5;
      bzm $$8 = null;
      fis $$9 = null;

      for (bzm $$10 : $$6.a($$0, $$3, $$4)) {
         fin $$11 = $$10.cV().g($$10.bV());
         Optional<fis> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fis $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.dh() == $$0.dh()) {
                  if ($$7 == 0.0) {
                     $$8 = $$10;
                     $$9 = $$13;
                  }
               } else {
                  $$8 = $$10;
                  $$9 = $$13;
                  $$7 = $$14;
               }
            }
         }
      }

      return $$8 == null ? null : new fip($$8, $$9);
   }

   @Nullable
   public static fip a(dmu $$0, cvo $$1, fis $$2, fis $$3, fin $$4, Predicate<bzm> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, a($$1));
   }

   public static float a(bzm $$0) {
      return Math.max(0.0F, Math.min(0.3F, ($$0.as - 2) / 20.0F));
   }

   @Nullable
   public static fip a(dmu $$0, bzm $$1, fis $$2, fis $$3, fin $$4, Predicate<bzm> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fis> $$8 = Optional.empty();
      bzm $$9 = null;

      for (bzm $$10 : $$0.a($$1, $$4, $$5)) {
         fin $$11 = $$10.cV().g($$6);
         Optional<fis> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fip($$9, $$8.get());
   }

   public static void a(bzm $$0, float $$1) {
      fis $$2 = $$0.dA();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(bcb.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(bcb.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dR() - $$0.ab < -180.0F) {
            $$0.ab -= 360.0F;
         }

         while ($$0.dR() - $$0.ab >= 180.0F) {
            $$0.ab += 360.0F;
         }

         while ($$0.dP() - $$0.aa < -180.0F) {
            $$0.aa -= 360.0F;
         }

         while ($$0.dP() - $$0.aa >= 180.0F) {
            $$0.aa += 360.0F;
         }

         $$0.w(bcb.h($$1, $$0.ab, $$0.dR()));
         $$0.v(bcb.h($$1, $$0.aa, $$0.dP()));
      }
   }

   public static bxi a(cam $$0, dcr $$1) {
      return $$0.fh().a($$1) ? bxi.a : bxi.b;
   }

   public static cvb a(cam $$0, dcv $$1, float $$2, @Nullable dcv $$3) {
      daz $$4 = (daz)($$1.h() instanceof daz ? $$1.h() : dcz.pB);
      cvb $$5 = $$4.a($$0.ai(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
