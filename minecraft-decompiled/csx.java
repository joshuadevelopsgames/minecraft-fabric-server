import java.util.Map;

public class csx extends ccd<csr> {
   public csx() {
      super(Map.of(cjo.p, cjp.a, cjo.n, cjp.b, cjo.aV, cjp.b, cjo.aW, cjp.b));
   }

   protected boolean a(aub $$0, csr $$1) {
      return $$1.aK() && !$$1.bm() && $$1.aw() == cay.a;
   }

   protected void a(aub $$0, csr $$1, long $$2) {
      cam $$3 = $$1.eh().c(cjo.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.m($$3.dv());
         fis $$5 = null;
         if ($$4) {
            fis $$6 = clg.a($$1, 5, 5, $$3.dv());
            if ($$6 != null && cst.a($$1, $$6) && $$3.h($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ec().h() ? cst.a($$3, $$1.ec()) : a($$1, $$3);
         }

         $$1.eh().a(cjo.n, new cjr(jb.a((jv)$$5), 0.6F, 1));
      }
   }

   private static fis a(csr $$0, cam $$1) {
      fis $$2 = $$1.dv().d($$0.dv());
      double $$3 = $$2.g() - bcb.d($$0.ec().j(), 8.0, 4.0);
      fis $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dv().e($$4);
   }
}
