import java.util.EnumSet;
import javax.annotation.Nullable;

public class crr extends crv {
   protected static final int b = 80;
   private static final alh<Boolean> a = all.a(crr.class, alj.k);
   private static final alh<Integer> d = all.a(crr.class, alj.b);
   private float e;
   private float f;
   private float ck;
   private float cl;
   private float cm;
   @Nullable
   private cam cn;
   private int co;
   private boolean cp;
   @Nullable
   protected cif c;

   public crr(bzv<? extends crr> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 10;
      this.a(fbc.j, 0.0F);
      this.ce = new crr.c(this);
      this.e = this.ar.i();
      this.f = this.e;
   }

   @Override
   protected void H() {
      chw $$0 = new chw(this, 1.0);
      this.c = new cif(this, 1.0, 80);
      this.ch.a(4, new crr.a(this));
      this.ch.a(5, $$0);
      this.ch.a(7, this.c);
      this.ch.a(8, new chq(this, cut.class, 8.0F));
      this.ch.a(8, new chq(this, crr.class, 12.0F, 0.01F));
      this.ch.a(9, new cid(this));
      this.c.a(EnumSet.of(chi.a.a, chi.a.b));
      $$0.a(EnumSet.of(chi.a.a, chi.a.b));
      this.ci.a(1, new cjb<>(this, cam.class, 10, true, false, new crr.b(this)));
   }

   public static cbr.a t() {
      return crv.gM().a(cbs.c, 6.0).a(cbs.w, 0.5).a(cbs.t, 30.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjy(this, $$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(d, 0);
   }

   public boolean gH() {
      return this.ay.a(a);
   }

   void x(boolean $$0) {
      this.ay.a(a, $$0);
   }

   public int m() {
      return 80;
   }

   void b(int $$0) {
      this.ay.a(d, $$0);
   }

   public boolean gI() {
      return this.ay.a(d) != 0;
   }

   @Nullable
   public cam gJ() {
      if (!this.gI()) {
         return null;
      } else if (this.ai().C) {
         if (this.cn != null) {
            return this.cn;
         } else {
            bzm $$0 = this.ai().a(this.ay.a(d));
            if ($$0 instanceof cam) {
               this.cn = (cam)$$0;
               return this.cn;
            } else {
               return null;
            }
         }
      } else {
         return this.e();
      }
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.co = 0;
         this.cn = null;
      }
   }

   @Override
   public int W() {
      return 160;
   }

   @Override
   protected ayy p() {
      return this.bm() ? ayz.mf : ayz.mg;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.bm() ? ayz.ml : ayz.mm;
   }

   @Override
   protected ayy f_() {
      return this.bm() ? ayz.mi : ayz.mj;
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return $$1.b_($$0).a(azu.a) ? 10.0F + $$1.y($$0) : super.a($$0, $$1);
   }

   @Override
   public void e_() {
      if (this.bO()) {
         if (this.ai().C) {
            this.f = this.e;
            if (!this.bm()) {
               this.ck = 2.0F;
               fis $$0 = this.dA();
               if ($$0.e > 0.0 && this.cp && !this.be()) {
                  this.ai().a(this.dC(), this.dE(), this.dI(), this.n(), this.do(), 1.0F, 1.0F, false);
               }

               this.cp = $$0.e < 0.0 && this.ai().a(this.dx().e(), this);
            } else if (this.gH()) {
               if (this.ck < 0.5F) {
                  this.ck = 4.0F;
               } else {
                  this.ck = this.ck + (0.5F - this.ck) * 0.1F;
               }
            } else {
               this.ck = this.ck + (0.125F - this.ck) * 0.2F;
            }

            this.e = this.e + this.ck;
            this.cm = this.cl;
            if (!this.bm()) {
               this.cl = this.ar.i();
            } else if (this.gH()) {
               this.cl = this.cl + (0.0F - this.cl) * 0.25F;
            } else {
               this.cl = this.cl + (1.0F - this.cl) * 0.06F;
            }

            if (this.gH() && this.bm()) {
               fis $$1 = this.h(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.ai().a(me.d, this.d(0.5) - $$1.d * 1.5, this.dF() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gI()) {
               if (this.co < this.m()) {
                  this.co++;
               }

               cam $$3 = this.gJ();
               if ($$3 != null) {
                  this.P().a($$3, 90.0F, 90.0F);
                  this.P().a();
                  double $$4 = this.L(0.0F);
                  double $$5 = $$3.dC() - this.dC();
                  double $$6 = $$3.e(0.5) - this.dG();
                  double $$7 = $$3.dI() - this.dI();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ar.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ar.j() * (1.7 - $$4);
                     this.ai().a(me.d, this.dC() + $$5 * $$9, this.dG() + $$6 * $$9, this.dI() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bm()) {
            this.j(300);
         } else if (this.aK()) {
            this.i(this.dA().b((this.ar.i() * 2.0F - 1.0F) * 0.4F, 0.5, (this.ar.i() * 2.0F - 1.0F) * 0.4F));
            this.v(this.ar.i() * 360.0F);
            this.e(false);
            this.aE = true;
         }

         if (this.gI()) {
            this.v(this.bt);
         }
      }

      super.e_();
   }

   protected ayy n() {
      return ayz.mk;
   }

   public float J(float $$0) {
      return bcb.h($$0, this.f, this.e);
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cm, this.cl);
   }

   public float L(float $$0) {
      return (this.co + $$0) / this.m();
   }

   public float gK() {
      return this.co;
   }

   @Override
   public boolean a(dmx $$0) {
      return $$0.f(this);
   }

   public static boolean b(bzv<? extends crr> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return ($$4.a(20) == 0 || !$$1.x($$3)) && $$1.an() != bxg.a && (bzu.a($$2) || $$1.b_($$3).a(azu.a)) && $$1.b_($$3.e()).a(azu.a);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (!this.gH() && !$$1.a(azp.w) && !$$1.a(bye.P) && $$1.c() instanceof cam $$3) {
         $$3.a($$0, this.ea().d(this), 2.0F);
      }

      if (this.c != null) {
         this.c.i();
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int gg() {
      return 180;
   }

   @Override
   public void k(fis $$0) {
      if (this.bm()) {
         this.a(0.1F, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.9));
         if (!this.gH() && this.e() == null) {
            this.i(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.k($$0);
      }
   }

   static class a extends chi {
      private final crr a;
      private int b;
      private final boolean c;

      public a(crr $$0) {
         this.a = $$0;
         this.c = $$0 instanceof crk;
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         cam $$0 = this.a.e();
         return $$0 != null && $$0.bO();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.e() != null && this.a.g((bzm)this.a.e()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.S().n();
         cam $$0 = this.a.e();
         if ($$0 != null) {
            this.a.P().a($$0, 90.0F, 90.0F);
         }

         this.a.aE = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.g(null);
         this.a.c.i();
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         cam $$0 = this.a.e();
         if ($$0 != null) {
            this.a.S().n();
            this.a.P().a($$0, 90.0F, 90.0F);
            if (!this.a.F($$0)) {
               this.a.g(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ar());
                  if (!this.a.be()) {
                     this.a.ai().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.m()) {
                  float $$1 = 1.0F;
                  if (this.a.ai().an() == bxg.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  aub $$2 = a(this.a);
                  $$0.a($$2, this.a.ea().c(this.a, (bzm)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements clc.a {
      private final crr a;

      public b(crr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable cam $$0, aub $$1) {
         return ($$0 instanceof cut || $$0 instanceof cnj || $$0 instanceof cnu) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cgl {
      private final crr l;

      public c(crr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cgl.a.b && !this.l.S().l()) {
            fis $$0 = new fis(this.e - this.l.dC(), this.f - this.l.dE(), this.g - this.l.dI());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(bcb.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dP(), $$5, 90.0F));
            this.l.br = this.l.dP();
            float $$6 = (float)(this.h * this.l.i(cbs.w));
            float $$7 = bcb.h(0.125F, this.l.fu(), $$6);
            this.l.B($$7);
            double $$8 = Math.sin((this.l.as + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos(this.l.dP() * (float) (Math.PI / 180.0));
            double $$10 = Math.sin(this.l.dP() * (float) (Math.PI / 180.0));
            double $$11 = Math.sin((this.l.as + this.l.ar()) * 0.75) * 0.05;
            this.l.i(this.l.dA().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + $$7 * $$3 * 0.1, $$8 * $$10));
            cgk $$12 = this.l.P();
            double $$13 = this.l.dC() + $$2 * 2.0;
            double $$14 = this.l.dG() + $$3 / $$1;
            double $$15 = this.l.dI() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.P().a(bcb.d(0.125, $$16, $$13), bcb.d(0.125, $$17, $$14), bcb.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.B(0.0F);
            this.l.x(false);
         }
      }
   }
}
