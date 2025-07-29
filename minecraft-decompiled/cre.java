import java.util.EnumSet;

public class cre extends crv {
   private float a = 0.5F;
   private int b;
   private static final alh<Byte> c = all.a(cre.class, alj.a);

   public cre(bzv<? extends cre> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.j, -1.0F);
      this.a(fbc.i, 8.0F);
      this.a(fbc.n, 0.0F);
      this.a(fbc.o, 0.0F);
      this.cc = 10;
   }

   @Override
   protected void H() {
      this.ch.a(4, new cre.a(this));
      this.ch.a(5, new chw(this, 1.0));
      this.ch.a(7, new civ(this, 1.0, 0.0F));
      this.ch.a(8, new chq(this, cut.class, 8.0F));
      this.ch.a(8, new cid(this));
      this.ci.a(1, new cja(this).a());
      this.ci.a(2, new cjb<>(this, cut.class, true));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.c, 6.0).a(cbs.w, 0.23F).a(cbs.n, 48.0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected ayy p() {
      return ayz.cg;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.cj;
   }

   @Override
   protected ayy f_() {
      return ayz.ci;
   }

   @Override
   public float bB() {
      return 1.0F;
   }

   @Override
   public void e_() {
      if (!this.aK() && this.dA().e < 0.0) {
         this.i(this.dA().d(1.0, 0.6, 1.0));
      }

      if (this.ai().C) {
         if (this.ar.a(24) == 0 && !this.be()) {
            this.ai().a(this.dC() + 0.5, this.dE() + 0.5, this.dI() + 0.5, ayz.ch, this.do(), 1.0F + this.ar.i(), this.ar.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.ai().a(me.aa, this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.e_();
   }

   @Override
   public boolean fx() {
      return true;
   }

   @Override
   protected void a(aub $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ar.a(0.5, 6.891);
      }

      cam $$1 = this.e();
      if ($$1 != null && $$1.dG() > this.dG() + this.a && this.c($$1)) {
         fis $$2 = this.dA();
         this.i(this.dA().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
         this.aE = true;
      }

      super.a($$0);
   }

   @Override
   public boolean cb() {
      return this.m();
   }

   private boolean m() {
      return (this.ay.a(c) & 1) != 0;
   }

   void x(boolean $$0) {
      byte $$1 = this.ay.a(c);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ay.a(c, $$1);
   }

   static class a extends chi {
      private final cre a;
      private int b;
      private int c;
      private int d;

      public a(cre $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         cam $$0 = this.a.e();
         return $$0 != null && $$0.bO() && this.a.c($$0);
      }

      @Override
      public void d() {
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.x(false);
         this.d = 0;
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         cam $$0 = this.a.e();
         if ($$0 != null) {
            boolean $$1 = this.a.T().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bzm)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.Q().a($$0.dC(), $$0.dE(), $$0.dI(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dC() - this.a.dC();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dI() - this.a.dI();
               if (this.c <= 0) {
                  this.b++;
                  if (this.b == 1) {
                     this.c = 60;
                     this.a.x(true);
                  } else if (this.b <= 4) {
                     this.c = 6;
                  } else {
                     this.c = 100;
                     this.b = 0;
                     this.a.x(false);
                  }

                  if (this.b > 1) {
                     double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                     if (!this.a.be()) {
                        this.a.ai().a(null, 1018, this.a.dx(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        fis $$8 = new fis(this.a.ec().a($$3, 2.297 * $$6), $$4, this.a.ec().a($$5, 2.297 * $$6));
                        cvs $$9 = new cvs(this.a.ai(), this.a, $$8.d());
                        $$9.a_($$9.dC(), this.a.e(0.5) + 0.5, $$9.dI());
                        this.a.ai().b($$9);
                     }
                  }
               }

               this.a.P().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.Q().a($$0.dC(), $$0.dE(), $$0.dI(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.i(cbs.n);
      }
   }
}
