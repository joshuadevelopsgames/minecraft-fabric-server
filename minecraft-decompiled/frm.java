public class frm extends hyg {
   private final get a;
   private final frm.a b;
   private fyi c = fyi.a;

   public frm(fqx $$0, get $$1) {
      super(ftv.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public frm(xo $$0, get $$1) {
      super(ftv.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public frm(xo $$0, xo $$1, get $$2) {
      super(ftv.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static frm.a a(fqx $$0) {
      fot $$1 = $$0.a;
      return a(xo.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static frm.a a(xo $$0) {
      return a(xo.c("mco.errorMessage.generic"), $$0);
   }

   private static frm.a a(xo $$0, xo $$1) {
      return new frm.a($$0, $$1);
   }

   @Override
   public void aV_() {
      this.c(fxo.a(xn.h, $$0 -> this.aP_()).a(this.o / 2 - 100, this.p - 52, 200, 20).a());
      this.c = fyi.a(this.q, this.b.b, this.o * 3 / 4);
   }

   @Override
   public void aP_() {
      this.n.a(this.a);
   }

   @Override
   public xo i() {
      return xo.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.b.a, this.o / 2, 80, -1);
      this.c.a($$0, this.o / 2, 100, 9, -2142128);
   }

   record a(xo a, xo b) {
   }
}
