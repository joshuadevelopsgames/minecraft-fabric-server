public class cgl implements cgh {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final cao d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cgl.a k = cgl.a.a;

   public cgl(cao $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cgl.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cgl.a.d) {
         this.k = cgl.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cgl.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cgl.a.c) {
         float $$0 = (float)this.d.i(cbs.w);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = bcb.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = bcb.a(this.d.dP() * (float) (Math.PI / 180.0));
         float $$6 = bcb.b(this.d.dP() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.B($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cgl.a.a;
      } else if (this.k == cgl.a.b) {
         this.k = cgl.a.a;
         double $$9 = this.e - this.d.dC();
         double $$10 = this.g - this.d.dI();
         double $$11 = this.f - this.d.dE();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(bcb.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.v(this.b(this.d.dP(), $$13, 90.0F));
         this.d.B((float)(this.h * this.d.i(cbs.w)));
         jb $$14 = this.d.dx();
         eeb $$15 = this.d.ai().a_($$14);
         fjm $$16 = $$15.g(this.d.ai(), $$14);
         if ($$11 > this.d.dT() && $$9 * $$9 + $$10 * $$10 < Math.max(1.0F, this.d.ds())
            || !$$16.c() && this.d.dE() < $$16.c(jh.a.b) + $$14.v() && !$$15.a(azo.n) && !$$15.a(azo.R)) {
            this.d.R().a();
            this.k = cgl.a.d;
         }
      } else if (this.k == cgl.a.d) {
         this.d.B((float)(this.h * this.d.i(cbs.w)));
         if (this.d.aK() || this.d.bp() && this.d.er()) {
            this.k = cgl.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cjw $$2 = this.d.S();
      if ($$2 != null) {
         fay $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d, jb.a(this.d.dC() + $$0, (double)this.d.dD(), this.d.dI() + $$1)) != fbc.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = bcb.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      float $$4 = $$0 + $$3;
      if ($$4 < 0.0F) {
         $$4 += 360.0F;
      } else if ($$4 > 360.0F) {
         $$4 -= 360.0F;
      }

      return $$4;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   public void g() {
      this.k = cgl.a.a;
   }

   protected static enum a {
      a,
      b,
      c,
      d;
   }
}
