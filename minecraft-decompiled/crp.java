import java.util.EnumSet;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class crp extends cao implements crn {
   private static final alh<Boolean> a = all.a(crp.class, alj.k);
   private static final byte b = 1;
   private int c = 1;

   public crp(bzv<? extends crp> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
      this.ce = new crp.b(this, false, () -> false);
   }

   @Override
   protected void H() {
      this.ch.a(5, new crp.d(this));
      this.ch.a(7, new crp.a(this));
      this.ch.a(7, new crp.c(this));
      this.ci.a(1, new cjb<>(this, cut.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dE() - this.dE()) <= 4.0));
   }

   public boolean l() {
      return this.ay.a(a);
   }

   public void x(boolean $$0) {
      this.ay.a(a, $$0);
   }

   public int m() {
      return this.c;
   }

   @Override
   protected boolean ag() {
      return true;
   }

   private static boolean i(byb $$0) {
      return $$0.c() instanceof cvm && $$0.d() instanceof cut;
   }

   @Override
   public boolean a(aub $$0, byb $$1) {
      return this.cG() && !$$1.a(azp.d) || !i($$1) && super.a($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   public boolean eV() {
      return false;
   }

   @Override
   public void k(fis $$0) {
      this.a($$0, 0.02F);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (i($$1)) {
         super.a($$0, $$1, 1000.0F);
         return true;
      } else {
         return this.a($$0, $$1) ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   public static cbr.a n() {
      return cao.I().a(cbs.t, 10.0).a(cbs.n, 100.0).a(cbs.i, 8.0).a(cbs.m, 0.06);
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected ayy p() {
      return ayz.kX;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.kZ;
   }

   @Override
   protected ayy f_() {
      return ayz.kY;
   }

   @Override
   protected float fk() {
      return 5.0F;
   }

   public static boolean b(bzv<crp> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.an() != bxg.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int gk() {
      return 1;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c = $$0.a("ExplosionPower", (byte)1);
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   public double B() {
      return 10.0;
   }

   @Override
   public double A() {
      return 16.0;
   }

   public static void a(cao $$0) {
      if ($$0.e() == null) {
         fis $$1 = $$0.dA();
         $$0.v(-((float)bcb.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI));
         $$0.br = $$0.dP();
      } else {
         cam $$2 = $$0.e();
         double $$3 = 64.0;
         if ($$2.g($$0) < 4096.0) {
            double $$4 = $$2.dC() - $$0.dC();
            double $$5 = $$2.dI() - $$0.dI();
            $$0.v(-((float)bcb.d($$4, $$5)) * (180.0F / (float)Math.PI));
            $$0.br = $$0.dP();
         }
      }
   }

   public static class a extends chi {
      private final cao a;

      public a(cao $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.b));
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         crp.a(this.a);
      }
   }

   public static class b extends cgl {
      private final cao l;
      private int m;
      private final boolean n;
      private final BooleanSupplier o;

      public b(cao $$0, boolean $$1, BooleanSupplier $$2) {
         super($$0);
         this.l = $$0;
         this.n = $$1;
         this.o = $$2;
      }

      @Override
      public void a() {
         if (this.o.getAsBoolean()) {
            this.k = cgl.a.a;
            this.l.aa();
         }

         if (this.k == cgl.a.b) {
            if (this.m-- <= 0) {
               this.m = this.m + this.l.ec().a(5) + 2;
               fis $$0 = new fis(this.e - this.l.dC(), this.f - this.l.dE(), this.g - this.l.dI());
               if (this.a($$0)) {
                  this.l.i(this.l.dA().e($$0.d().c(this.l.i(cbs.m) * 5.0 / 3.0)));
               } else {
                  this.k = cgl.a.a;
               }
            }
         }
      }

      private boolean a(fis $$0) {
         fin $$1 = this.l.cV();
         fin $$2 = $$1.c($$0);
         if (this.n) {
            for (jb $$3 : jb.a($$2.g(1.0))) {
               if (!this.a(this.l.ai(), null, null, $$3, false, false)) {
                  return false;
               }
            }
         }

         boolean $$4 = this.l.bm();
         boolean $$5 = this.l.bA();
         fis $$6 = this.l.dv();
         fis $$7 = $$6.e($$0);
         return dly.a($$6, $$7, $$2, ($$5x, $$6x) -> $$1.b($$5x) ? true : this.a(this.l.ai(), $$6, $$7, $$5x, $$4, $$5));
      }

      private boolean a(dly $$0, @Nullable fis $$1, @Nullable fis $$2, jb $$3, boolean $$4, boolean $$5) {
         eeb $$6 = $$0.a_($$3);
         if ($$6.l()) {
            return true;
         } else {
            boolean $$7 = $$1 != null && $$2 != null;
            boolean $$8 = $$7 ? !this.l.a($$1, $$2, $$6.g($$0, $$3).a(new fis($$3)).e()) : $$6.g($$0, $$3).c();
            if (!this.n) {
               return $$8;
            } else if ($$6.a(azo.bu)) {
               return false;
            } else {
               fal $$9 = $$0.b_($$3);
               if (!$$9.c() && (!$$7 || this.l.a($$9, $$3, $$1, $$2))) {
                  if ($$9.a(azu.a)) {
                     return $$4;
                  }

                  if ($$9.a(azu.b)) {
                     return $$5;
                  }
               }

               return $$8;
            }
         }
      }
   }

   static class c extends chi {
      private final crp b;
      public int a;

      public c(crp $$0) {
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.e() != null;
      }

      @Override
      public void d() {
         this.a = 0;
      }

      @Override
      public void e() {
         this.b.x(false);
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         cam $$0 = this.b.e();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.F($$0)) {
               dmu $$2 = this.b.ai();
               this.a++;
               if (this.a == 10 && !this.b.be()) {
                  $$2.a(null, 1015, this.b.dx(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  fis $$4 = this.b.h(1.0F);
                  double $$5 = $$0.dC() - (this.b.dC() + $$4.d * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dI() - (this.b.dI() + $$4.f * 4.0);
                  fis $$8 = new fis($$5, $$6, $$7);
                  if (!this.b.be()) {
                     $$2.a(null, 1016, this.b.dx(), 0);
                  }

                  cvm $$9 = new cvm($$2, this.b, $$8.d(), this.b.m());
                  $$9.a_(this.b.dC() + $$4.d * 4.0, this.b.e(0.5) + 0.5, $$9.dI() + $$4.f * 4.0);
                  $$2.b($$9);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }

            this.b.x(this.a > 10);
         }
      }
   }

   public static class d extends chi {
      private static final int a = 64;
      private final cao b;
      private final int c;

      public d(cao $$0) {
         this($$0, 0);
      }

      public d(cao $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         cgl $$0 = this.b.Q();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.b.dC();
            double $$2 = $$0.e() - this.b.dE();
            double $$3 = $$0.f() - this.b.dI();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         fis $$0 = a(this.b, this.c);
         this.b.Q().a($$0.a(), $$0.b(), $$0.c(), 1.0);
      }

      public static fis a(cao $$0, int $$1) {
         dmu $$2 = $$0.ai();
         bck $$3 = $$0.ec();
         fis $$4 = $$0.dv();
         fis $$5 = null;

         for (int $$6 = 0; $$6 < 64; $$6++) {
            $$5 = a($$0, $$4, $$3);
            if ($$5 != null && a($$2, $$5, $$1)) {
               return $$5;
            }
         }

         if ($$5 == null) {
            $$5 = a($$4, $$3);
         }

         jb $$7 = jb.a((jv)$$5);
         int $$8 = $$2.a(eka.a.e, $$7.u(), $$7.w());
         if ($$8 < $$7.v() && $$8 > $$2.L_()) {
            $$5 = new fis($$5.a(), $$0.dE() - Math.abs($$0.dE() - $$5.b()), $$5.c());
         }

         return $$5;
      }

      private static boolean a(dmu $$0, fis $$1, int $$2) {
         if ($$2 <= 0) {
            return true;
         } else {
            jb $$3 = jb.a((jv)$$1);
            if (!$$0.a_($$3).l()) {
               return false;
            } else {
               for (jh $$4 : jh.values()) {
                  for (int $$5 = 1; $$5 < $$2; $$5++) {
                     jb $$6 = $$3.a($$4, $$5);
                     if (!$$0.a_($$6).l()) {
                        return true;
                     }
                  }
               }

               return false;
            }
         }
      }

      private static fis a(fis $$0, bck $$1) {
         double $$2 = $$0.a() + ($$1.i() * 2.0F - 1.0F) * 16.0F;
         double $$3 = $$0.b() + ($$1.i() * 2.0F - 1.0F) * 16.0F;
         double $$4 = $$0.c() + ($$1.i() * 2.0F - 1.0F) * 16.0F;
         return new fis($$2, $$3, $$4);
      }

      @Nullable
      private static fis a(cao $$0, fis $$1, bck $$2) {
         fis $$3 = a($$1, $$2);
         return $$0.gv() && !$$0.a($$3) ? null : $$3;
      }
   }
}
