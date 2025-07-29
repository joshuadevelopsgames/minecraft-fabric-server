import javax.annotation.Nullable;

public class cqt extends cqp {
   public static final double b = 0.375;

   public cqt(bzv<? extends cqt> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cqt(dmu $$0, jb $$1) {
      super(bzv.ax, $$0, $$1);
      this.a_($$1.u(), $$1.v(), $$1.w());
   }

   @Override
   protected void a(all.a $$0) {
   }

   @Override
   protected void e() {
      this.o(this.a.u() + 0.5, this.a.v() + 0.375, this.a.w() + 0.5);
      double $$0 = this.ap().l() / 2.0;
      double $$1 = this.ap().m();
      this.a(new fin(this.dC() - $$0, this.dE(), this.dI() - $$0, this.dC() + $$0, this.dE() + $$1, this.dI() + $$0));
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(aub $$0, @Nullable bzm $$1) {
      this.a(ayz.pa, 1.0F, 1.0F);
   }

   @Override
   protected void a(fdc $$0) {
   }

   @Override
   protected void a(fda $$0) {
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      if (this.ai().C) {
         return bxj.a;
      } else {
         if ($$0.b($$1).a(dcz.tu)) {
            bxj $$2 = super.a($$0, $$1);
            if ($$2 instanceof bxj.d $$3 && $$3.c()) {
               return $$2;
            }
         }

         boolean $$4 = false;

         for (cak $$6 : cak.c_($$0)) {
            if ($$6.b_(this)) {
               $$6.a_(this, true);
               $$4 = true;
            }
         }

         boolean $$7 = false;
         if (!$$4 && !$$0.gh()) {
            for (cak $$9 : cak.c_(this)) {
               if ($$9.b_($$0)) {
                  $$9.a_($$0, true);
                  $$7 = true;
               }
            }
         }

         if (!$$4 && !$$7) {
            return super.a($$0, $$1);
         } else {
            this.a(ejb.b, $$0);
            this.a(ayz.pb);
            return bxj.a;
         }
      }
   }

   @Override
   public void b(cak $$0) {
      if (cak.c_(this).isEmpty()) {
         this.at();
      }
   }

   @Override
   public boolean f() {
      return this.ai().a_(this.a).a(azo.R);
   }

   public static cqt b(dmu $$0, jb $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cqt $$6 : $$0.a(cqt.class, new fin($$2 - 1.0, $$3 - 1.0, $$4 - 1.0, $$2 + 1.0, $$3 + 1.0, $$4 + 1.0))) {
         if ($$6.i().equals($$1)) {
            return $$6;
         }
      }

      cqt $$7 = new cqt($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void l() {
      this.a(ayz.pb, 1.0F, 1.0F);
   }

   @Override
   public zw<acq> a(atz $$0) {
      return new acr(this, 0, this.i());
   }

   @Override
   public fis u(float $$0) {
      return this.p($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.wn);
   }
}
