public class cwa extends cvd {
   public cwa(bzv<? extends cwa> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cwa(dmu $$0, cam $$1, dcv $$2) {
      super(bzv.aY, $$0, $$1, $$2);
   }

   public cwa(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      super(bzv.aY, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dcr f() {
      return dcz.wU;
   }

   @Override
   public void a(aub $$0, dcv $$1, fiq $$2) {
      bze $$3 = new bze(this.ai(), this.dC(), this.dE(), this.dI());
      if (this.ah_() instanceof cam $$4) {
         $$3.a($$4);
      }

      $$3.a(3.0F);
      $$3.c(-0.5F);
      $$3.a(600);
      $$3.c(10);
      $$3.d(-$$3.c() / $$3.h());
      $$3.c($$1);
      $$0.b($$3);
   }
}
