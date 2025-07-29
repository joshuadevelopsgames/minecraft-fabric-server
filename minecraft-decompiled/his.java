public class his<S extends hmc, M extends gnh<S> & glx & gnt> extends hil<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public his(hgc<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hoh $$1, cad $$2, fod $$3, gxn $$4, int $$5) {
      if (!$$1.e()) {
         bxi $$6 = $$2 == $$0.e ? bxi.a : bxi.b;
         if ($$0.U && $$0.P == $$6 && $$0.K < 1.0E-5F && !$$0.aL.e()) {
            this.a($$0.aL, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hoh $$0, cad $$1, fod $$2, gxn $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gqn $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = bcb.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      hhy.a($$2, hhy.a.a);
      boolean $$7 = $$1 == cad.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hri.d);
      $$2.b();
   }
}
