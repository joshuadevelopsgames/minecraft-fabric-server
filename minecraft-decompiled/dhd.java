public class dhd extends dhc {
   public dhd(dgz $$0) {
      super($$0);
   }

   private static dcv c(dha $$0) {
      return $$0.a(1, 0);
   }

   private static dcv d(dha $$0) {
      return $$0.a(0, 1);
   }

   private static dcv e(dha $$0) {
      return $$0.a(2, 1);
   }

   private static dcv f(dha $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dha $$0, dmu $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(azx.bK) && d($$0).a(azx.bK) && e($$0).a(azx.bK) && f($$0).a(azx.bK) : false;
   }

   public dcv a(dha $$0, jn.a $$1) {
      ech $$2 = new ech(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return ebr.a($$2);
   }

   @Override
   public dhw<dhd> a() {
      return dhw.v;
   }
}
