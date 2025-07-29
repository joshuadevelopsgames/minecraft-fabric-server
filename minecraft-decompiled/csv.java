import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;

public class csv extends ccd<csr> {
   private static final int c = 256;
   private static final int d = 5;
   private static final int e = 4;
   private static final float f = 0.7F;
   private static final int g = Math.round(15.0F);
   private static final int h = Math.round(4.0F);
   private static final int i = Math.round(10.0F);

   @VisibleForTesting
   public csv() {
      super(ImmutableMap.of(cjo.p, cjp.a, cjo.aZ, cjp.b, cjo.aX, cjp.b, cjo.aY, cjp.b, cjo.aW, cjp.a, cjo.n, cjp.b, cjo.bb, cjp.b), g + 1 + h);
   }

   protected boolean a(aub $$0, csr $$1) {
      return $$1.aw() != cay.a ? false : $$1.eh().c(cjo.p).map($$1x -> a($$1, $$1x)).map($$1x -> {
         if (!$$1x) {
            $$1.eh().b(cjo.aW);
         }

         return $$1x;
      }).orElse(false);
   }

   protected boolean a(aub $$0, csr $$1, long $$2) {
      return $$1.eh().a(cjo.p) && $$1.eh().a(cjo.aW);
   }

   protected void b(aub $$0, csr $$1, long $$2) {
      $$1.eh().c(cjo.p).ifPresent($$1x -> $$1.b(cay.q));
      $$1.eh().a(cjo.aX, bdk.a, g);
      $$1.a(ayz.cG, 1.0F, 1.0F);
   }

   protected void c(aub $$0, csr $$1, long $$2) {
      if ($$1.aw() == cay.q) {
         $$1.b(cay.a);
      }

      $$1.eh().a(cjo.aZ, bdk.a, i);
      $$1.eh().b(cjo.aW);
   }

   protected void d(aub $$0, csr $$1, long $$2) {
      cbm<csr> $$3 = $$1.eh();
      cam $$4 = $$3.c(cjo.p).orElse(null);
      if ($$4 != null) {
         $$1.a(ex.a.b, $$4.dv());
         if (!$$3.c(cjo.aX).isPresent() && !$$3.c(cjo.aY).isPresent()) {
            $$3.a(cjo.aY, bdk.a, h);
            double $$5 = $$4.dC() - $$1.dC();
            double $$6 = $$4.e($$4.cc() ? 0.8 : 0.3) - $$1.gI();
            double $$7 = $$4.dI() - $$1.dI();
            cvo.a(new cwg($$1, $$0), $$0, dcv.l, $$5, $$6, $$7, 0.7F, 5 - $$0.an().a() * 4);
            $$1.a(ayz.cJ, 1.5F, 1.0F);
         }
      }
   }

   private static boolean a(csr $$0, cam $$1) {
      double $$2 = $$0.dv().g($$1.dv());
      return $$2 < 256.0;
   }
}
