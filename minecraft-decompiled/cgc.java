import com.google.common.collect.ImmutableMap;

public class cgc<E extends ctw> extends ccd<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cgc(int $$0) {
      super(ImmutableMap.of(cjo.aC, cjp.a, cjo.p, cjp.b, cjo.n, cjp.b, cjo.o, cjp.c, cjo.C, cjp.c, cjo.aA, cjp.c, cjo.aH, cjp.c), $$0);
   }

   protected boolean a(aub $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aub $$0, E $$1, long $$2) {
      $$1.a(ayz.Dy, 5.0F, 1.0F);
   }

   protected void c(aub $$0, E $$1, long $$2) {
      if ($$1.c(cay.m)) {
         $$1.b(cay.a);
      }

      $$1.eh().b(cjo.aC);
      $$1.eh().c(cjo.C).filter($$1::G).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.I($$1x);
         }

         if (!$$1.eh().a(cjo.aA)) {
            ctx.a($$1, $$1x.dx());
         }
      });
   }
}
