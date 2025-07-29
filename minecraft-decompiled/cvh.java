import javax.annotation.Nullable;

public class cvh extends bzm implements cvl {
   private static final float a = 12.25F;
   private static final float b = 8.0F;
   private static final float c = 12.0F;
   private static final alh<dcv> d = all.a(cvh.class, alj.h);
   @Nullable
   private fis e;
   private int f;
   private boolean g;

   public cvh(bzv<? extends cvh> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvh(dmu $$0, double $$1, double $$2, double $$3) {
      this(bzv.X, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(dcv $$0) {
      if ($$0.f()) {
         this.au().a(d, this.f());
      } else {
         this.au().a(d, $$0.c(1));
      }
   }

   @Override
   public dcv e() {
      return this.au().a(d);
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(d, this.f());
   }

   @Override
   public boolean a(double $$0) {
      if (this.as < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cV().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(fis $$0) {
      fis $$1 = $$0.d(this.dv());
      double $$2 = $$1.i();
      if ($$2 > 12.0) {
         this.e = this.dv().b($$1.d / $$2 * 12.0, 8.0, $$1.f / $$2 * 12.0);
      } else {
         this.e = $$0;
      }

      this.f = 0;
      this.g = this.ar.a(5) > 0;
   }

   @Override
   public void g() {
      super.g();
      fis $$0 = this.dv().e(this.dA());
      if (!this.ai().B_() && this.e != null) {
         this.i(a(this.dA(), $$0, this.e));
      }

      if (this.ai().B_()) {
         fis $$1 = $$0.d(this.dA().c(0.25));
         this.b($$1, this.dA());
      }

      this.b($$0);
      if (!this.ai().B_()) {
         this.f++;
         if (this.f > 80 && !this.ai().C) {
            this.a(ayz.iO, 1.0F, 1.0F);
            this.at();
            if (this.g) {
               this.ai().b(new cqz(this.ai(), this.dC(), this.dE(), this.dI(), this.e()));
            } else {
               this.ai().c(2003, this.dx(), 0);
            }
         }
      }
   }

   private void b(fis $$0, fis $$1) {
      if (this.bm()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.ai().a(me.d, $$0.d, $$0.e, $$0.f, $$1.d, $$1.e, $$1.f);
         }
      } else {
         this.ai().a(me.af, $$0.d + this.ar.j() * 0.6 - 0.3, $$0.e - 0.5, $$0.f + this.ar.j() * 0.6 - 0.3, $$1.d, $$1.e, $$1.f);
      }
   }

   private static fis a(fis $$0, fis $$1, fis $$2) {
      fis $$3 = new fis($$2.d - $$1.d, 0.0, $$2.f - $$1.f);
      double $$4 = $$3.g();
      double $$5 = bcb.d(0.0025, $$0.i(), $$4);
      double $$6 = $$0.e;
      if ($$4 < 1.0) {
         $$5 *= 0.8;
         $$6 *= 0.8;
      }

      double $$7 = $$1.e - $$0.e < $$2.e ? 1.0 : -1.0;
      return $$3.c($$5 / $$4).b(0.0, $$6 + ($$7 - $$6) * 0.015, 0.0);
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("Item", dcv.b, this.e());
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.<dcv>a("Item", dcv.b).orElse(this.f()));
   }

   private dcv f() {
      return new dcv(dcz.tR);
   }

   @Override
   public float bB() {
      return 1.0F;
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }
}
