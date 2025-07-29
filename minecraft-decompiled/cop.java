public abstract class cop extends coq {
   private static final alh<Boolean> ck = all.a(cop.class, alj.k);
   private static final boolean cl = false;
   private final bzp cm;

   protected cop(bzv<? extends cop> $$0, dmu $$1) {
      super($$0, $$1);
      this.cF = false;
      this.cm = $$0.n().a(bzo.a().a(bzn.a, 0.0F, $$0.m() - 0.15625F, 0.0F)).a(0.5F);
   }

   @Override
   protected void a(bck $$0) {
      this.h(cbs.t).a(a($$0::a));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, false);
   }

   public static cbr.a m() {
      return hh().a(cbs.w, 0.175F).a(cbs.p, 0.5);
   }

   public boolean n() {
      return this.ay.a(ck);
   }

   public void x(boolean $$0) {
      this.ay.a(ck, $$0);
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? this.cm : super.e($$0);
   }

   @Override
   protected void f(aub $$0) {
      super.f($$0);
      if (this.n()) {
         this.a($$0, dqb.cG);
         this.x(false);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("ChestedHorse", this.n());
      if (this.n()) {
         fdc.a<bxk> $$1 = $$0.a("Items", bxk.a);

         for (int $$2 = 0; $$2 < this.cB.b(); $$2++) {
            dcv $$3 = this.cB.a($$2);
            if (!$$3.f()) {
               $$1.a(new bxk($$2, $$3));
            }
         }
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("ChestedHorse", false));
      this.hf();
      if (this.n()) {
         for (bxk $$1 : $$0.c("Items", bxk.a)) {
            if ($$1.a(this.cB.b())) {
               this.cB.a($$1.a(), $$1.b());
            }
         }
      }
   }

   @Override
   public cbd a_(int $$0) {
      return $$0 == 499 ? new cbd() {
         @Override
         public dcv a() {
            return cop.this.n() ? new dcv(dcz.fh) : dcv.l;
         }

         @Override
         public boolean a(dcv $$0) {
            if ($$0.f()) {
               if (cop.this.n()) {
                  cop.this.x(false);
                  cop.this.hf();
               }

               return true;
            } else if ($$0.a(dcz.fh)) {
               if (!cop.this.n()) {
                  cop.this.x(true);
                  cop.this.hf();
               }

               return true;
            } else {
               return false;
            }
         }
      } : super.a_($$0);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      boolean $$2 = !this.g_() && this.gY() && $$0.gh();
      if (!this.cd() && !$$2) {
         dcv $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gY()) {
               this.hn();
               return bxj.a;
            }

            if (!this.n() && $$3.a(dcz.fh)) {
               this.d($$0, $$3);
               return bxj.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void d(cut $$0, dcv $$1) {
      this.x(true);
      this.t();
      $$1.a(1, $$0);
      this.hf();
   }

   @Override
   public fis[] E() {
      return cak.a(this, 0.04, 0.41, 0.18, 0.73);
   }

   @Override
   protected void t() {
      this.a(ayz.hF, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ac_() {
      return this.n() ? 5 : 0;
   }
}
