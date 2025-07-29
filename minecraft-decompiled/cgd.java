import com.google.common.collect.ImmutableMap;

public class cgd extends ccd<ctw> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = bcb.c(34.0);
   private static final int i = bcb.f(60.0F);

   public cgd() {
      super(ImmutableMap.of(cjo.p, cjp.a, cjo.aK, cjp.b, cjo.aL, cjp.c, cjo.aM, cjp.c), i);
   }

   protected boolean a(aub $$0, ctw $$1) {
      return $$1.a($$1.eh().c(cjo.p).get(), 15.0, 20.0);
   }

   protected boolean a(aub $$0, ctw $$1, long $$2) {
      return true;
   }

   protected void b(aub $$0, ctw $$1, long $$2) {
      $$1.eh().a(cjo.q, true, i);
      $$1.eh().a(cjo.aM, bdk.a, h);
      $$0.a($$1, (byte)62);
      $$1.a(ayz.DA, 3.0F, 1.0F);
   }

   protected void c(aub $$0, ctw $$1, long $$2) {
      $$1.eh().c(cjo.p).ifPresent($$1x -> $$1.P().a($$1x.dv()));
      if (!$$1.eh().a(cjo.aM) && !$$1.eh().a(cjo.aL)) {
         $$1.eh().a(cjo.aL, bdk.a, i - h);
         $$1.eh().c(cjo.p).filter($$1::G).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            fis $$3 = $$1.dv().e($$1.du().b(bzn.d, 0, $$1.dP()));
            fis $$4 = $$2x.bI().d($$3);
            fis $$5 = $$4.d();
            int $$6 = bcb.a($$4.g()) + 7;

            for (int $$7 = 1; $$7 < $$6; $$7++) {
               fis $$8 = $$3.e($$5.c((double)$$7));
               $$0.a(me.B, $$8.d, $$8.e, $$8.f, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(ayz.Dz, 3.0F, 1.0F);
            if ($$2x.a($$0, $$0.al().e($$1), 10.0F)) {
               double $$9 = 0.5 * (1.0 - $$2x.i(cbs.q));
               double $$10 = 2.5 * (1.0 - $$2x.i(cbs.q));
               $$2x.i($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
         });
      }
   }

   protected void d(aub $$0, ctw $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(cam $$0, int $$1) {
      $$0.eh().a(cjo.aK, bdk.a, $$1);
   }
}
