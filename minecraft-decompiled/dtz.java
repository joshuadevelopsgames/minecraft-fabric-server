import com.mojang.serialization.MapCodec;

public class dtz extends dtu {
   public static final MapCodec<dtz> a = b(dtz::new);
   private static final double b = 0.13;
   private static final double c = 0.08;
   private static final double e = 0.05;
   private static final int f = 20;
   private static final fjm g = dpz.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dtz> a() {
      return a;
   }

   public dtz(eea.d $$0) {
      super($$0);
   }

   private static boolean c(bzm $$0) {
      return $$0 instanceof cam || $$0 instanceof cxg || $$0 instanceof cra || $$0 instanceof cxe;
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return g;
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      $$3.a(ayz.nx, 1.0F, 1.0F);
      if (!$$0.C) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.al().l())) {
         $$3.a(this.I.g(), this.I.a() * 0.5F, this.I.b() * 0.75F);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static double b(double $$0) {
      return $$0 / 0.98F + 0.08;
   }

   private static double c(double $$0) {
      return ($$0 - 0.08) * 0.98F;
   }

   private boolean a(jb $$0, bzm $$1) {
      if ($$1.aK()) {
         return false;
      } else if ($$1.dE() > $$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if (b($$1.dA().e) >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs($$0.u() + 0.5 - $$1.dC());
         double $$3 = Math.abs($$0.w() + 0.5 - $$1.dI());
         double $$4 = 0.4375 + $$1.ds() / 2.0F;
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bzm $$0, jb $$1) {
      if ($$0 instanceof auc && $$0.ai().ae() % 20L == 0L) {
         aq.K.a((auc)$$0, $$0.ai().a_($$1));
      }
   }

   private void d(bzm $$0) {
      fis $$1 = $$0.dA();
      if (b($$0.dA().e) < -0.13) {
         double $$2 = -0.05 / b($$0.dA().e);
         $$0.i(new fis($$1.d * $$2, c(-0.05), $$1.f * $$2));
      } else {
         $$0.i(new fis($$1.d, c(-0.05), $$1.f));
      }

      $$0.j();
   }

   private void a(dmu $$0, bzm $$1) {
      if (c($$1)) {
         if ($$0.A.a(5) == 0) {
            $$1.a(ayz.nx, 1.0F, 1.0F);
         }

         if (!$$0.C && $$0.A.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bzm $$0) {
      a($$0, 5);
   }

   public static void b(bzm $$0) {
      a($$0, 10);
   }

   private static void a(bzm $$0, int $$1) {
      if ($$0.ai().C) {
         eeb $$2 = dqb.pP.m();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.ai().a(new lw(me.b, $$2), $$0.dC(), $$0.dE(), $$0.dI(), 0.0, 0.0, 0.0);
         }
      }
   }
}
