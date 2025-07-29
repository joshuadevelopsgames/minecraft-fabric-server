import com.google.common.collect.ImmutableMap;

public class cfz extends ccd<ctw> {
   private static final int c = 25;
   private static final int d = 20;

   public cfz() {
      super(ImmutableMap.of(cjo.az, cjp.a, cjo.p, cjp.b, cjo.aG, cjp.c, cjo.aE, cjp.c), ctx.b);
   }

   protected void a(aub $$0, ctw $$1, long $$2) {
      cbm<ctw> $$3 = $$1.eh();
      $$3.a(cjo.aE, bdk.a, 25L);
      $$3.b(cjo.n);
      cam $$4 = $$1.eh().c(cjo.az).get();
      ccf.a($$1, $$4);
      $$1.b(cay.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aub $$0, ctw $$1, long $$2) {
      return true;
   }

   protected void c(aub $$0, ctw $$1, long $$2) {
      if (!$$1.eh().a(cjo.aE) && !$$1.eh().a(cjo.aG)) {
         $$1.eh().a(cjo.aG, bdk.a, ctx.b - 25);
         $$1.a(ayz.Dx, 3.0F, 1.0F);
      }
   }

   protected void d(aub $$0, ctw $$1, long $$2) {
      if ($$1.c(cay.l)) {
         $$1.b(cay.a);
      }

      $$1.eh().c(cjo.az).ifPresent($$1::i);
      $$1.eh().b(cjo.az);
   }
}
