public class hil<S extends hjr, M extends gnh<S> & glx> extends hit<S, M> {
   public hil(hgc<S, M> $$0) {
      super($$0);
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.g, cad.b, $$0, $$1, $$2);
      this.a($$3, $$3.i, cad.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, hoh $$1, cad $$2, fod $$3, gxn $$4, int $$5) {
      if (!$$1.e()) {
         $$3.a();
         this.d().a($$2, $$3);
         $$3.a(a.b.rotationDegrees(-90.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         boolean $$6 = $$2 == cad.a;
         $$3.a(($$6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         $$1.a($$3, $$4, $$5, hri.d);
         $$3.b();
      }
   }
}
