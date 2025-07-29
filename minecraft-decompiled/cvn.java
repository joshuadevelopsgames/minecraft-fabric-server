public class cvn extends cvo {
   public cvn(bzv<? extends cvn> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvn(dmu $$0, cot $$1) {
      this(bzv.aA, $$0);
      this.c($$1);
      this.a_(
         $$1.dC() - ($$1.ds() + 1.0F) * 0.5 * bcb.a($$1.br * (float) (Math.PI / 180.0)),
         $$1.dG() - 0.1F,
         $$1.dI() + ($$1.ds() + 1.0F) * 0.5 * bcb.b($$1.br * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bg() {
      return 0.06;
   }

   @Override
   public void g() {
      super.g();
      fis $$0 = this.dA();
      fiq $$1 = cvq.a(this, this::b);
      this.b($$1);
      double $$2 = this.dC() + $$0.d;
      double $$3 = this.dE() + $$0.e;
      double $$4 = this.dI() + $$0.f;
      this.z();
      float $$5 = 0.99F;
      if (this.ai().a(this.cV()).noneMatch(eea.a::l)) {
         this.at();
      } else if (this.bm()) {
         this.at();
      } else {
         this.i($$0.c(0.99F));
         this.bi();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (this.ah_() instanceof cam $$1) {
         bzm $$2 = $$0.a();
         byb $$3 = this.ea().b(this, $$1);
         if (this.ai() instanceof aub $$4 && $$2.a($$4, $$3, 1.0F)) {
            djk.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(fio $$0) {
      super.a($$0);
      if (!this.ai().C) {
         this.at();
      }
   }

   @Override
   protected void a(all.a $$0) {
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * $$4;
         this.ai().a(me.ak, this.dC(), this.dE(), this.dI(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
