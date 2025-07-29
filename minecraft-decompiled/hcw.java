public abstract class hcw<T extends crd, S extends hmm> extends hew<T, S, gpf<S>> {
   public hcw(hee.a $$0, gql $$1, gql $$2, gql $$3) {
      this($$0, $$2, $$3, new gpf<>($$0.a($$1)));
   }

   public hcw(hee.a $$0, gql $$1, gql $$2, gpf<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hii<>(this, new gpf($$0.a($$1)), new gpf($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gy();
      $$1.c = $$0.gI();
      $$1.d = $$0.fh().a(dcz.pA);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gnx.a a(crd $$0, cad $$1) {
      return $$0.fF() == $$1 && $$0.gy() && $$0.fh().a(dcz.pA) ? gnx.a.d : gnx.a.a;
   }
}
