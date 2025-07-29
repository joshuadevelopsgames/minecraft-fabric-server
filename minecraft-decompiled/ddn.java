public class ddn extends deg {
   public ddn(dpz $$0, dpz $$1, dcr.a $$2) {
      super($$0, $$1, jh.a, $$2);
   }

   @Override
   public xo a(dcv $$0) {
      dfv $$1 = $$0.a(kq.ak);
      return (xo)($$1 != null && $$1.d().isPresent() ? xo.a(this.n + ".named", $$1.d().get()) : super.a($$0));
   }

   @Override
   public void l(dcv $$0) {
      dfv $$1 = $$0.a(kq.ak);
      if ($$1 != null && !$$1.c()) {
         $$1.b().thenAcceptAsync($$1x -> $$0.b(kq.ak, $$1x), ecp.a);
      }
   }
}
