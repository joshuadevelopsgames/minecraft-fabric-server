public class cvs extends cvi {
   public cvs(bzv<? extends cvs> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvs(dmu $$0, cam $$1, fis $$2) {
      super(bzv.bk, $$1, $$2, $$0);
   }

   public cvs(dmu $$0, double $$1, double $$2, double $$3, fis $$4) {
      super(bzv.bk, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         bzm var7 = $$0.a();
         bzm $$4 = this.ah_();
         int $$5 = var7.aH();
         var7.e(5.0F);
         byb $$6 = this.ea().a((cvi)this, $$4);
         if (!var7.a($$1, $$6, 5.0F)) {
            var7.h($$5);
         } else {
            djk.a($$1, var7, $$6);
         }
      }
   }

   @Override
   protected void a(fio $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         bzm $$3 = this.ah_();
         if (!($$3 instanceof cao) || $$1.P().c(dmq.d)) {
            jb $$4 = $$0.b().a($$0.c());
            if (this.ai().w($$4)) {
               this.ai().c($$4, dpm.a(this.ai(), $$4));
            }
         }
      }
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (!this.ai().C) {
         this.at();
      }
   }
}
