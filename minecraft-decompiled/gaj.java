public class gaj implements gag {
   private static final ame e = ame.b("hud/locator_bar_background");
   private static final ame f = ame.b("hud/locator_bar_arrow_up");
   private static final ame g = ame.b("hud/locator_bar_arrow_down");
   private static final int h = 9;
   private static final int i = 60;
   private static final int j = 7;
   private static final int k = 5;
   private static final int l = 1;
   private static final int m = 1;
   private final fue n;

   public gaj(fue $$0) {
      this.n = $$0;
   }

   @Override
   public void a(fxb $$0, ftu $$1) {
      $$0.a(gxx.ar, e, this.a(this.n.aP()), this.b(this.n.aP()), 182, 5);
   }

   @Override
   public void b(fxb $$0, ftu $$1) {
      int $$2 = this.b(this.n.aP());
      dmu $$3 = this.n.u.ai();
      this.n
         .t
         .j
         .H()
         .a(
            this.n.u,
            $$3x -> {
               if (!$$3x.a().left().map($$0xx -> $$0xx.equals(this.n.u.cK())).orElse(false)) {
                  double $$4 = $$3x.a($$3, this.n.j.l());
                  if (!($$4 <= -61.0) && !($$4 > 60.0)) {
                     int $$5 = bcb.f(($$0.a() - 9) / 2.0F);
                     fkt.a $$6 = $$3x.b();
                     hsx $$7 = this.n.aK().a($$6.d);
                     float $$8 = bcb.c((float)$$3x.a(this.n.u));
                     ame $$9 = $$7.a($$8);
                     int $$10 = $$6.e
                        .orElseGet(
                           () -> (Integer)$$3x.a()
                              .map($$0xxx -> baj.b(baj.c(255, $$0xxx.hashCode()), 0.9F), $$0xxx -> baj.b(baj.c(255, $$0xxx.hashCode()), 0.9F))
                        );
                     int $$11 = (int)($$4 * 173.0 / 2.0 / 60.0);
                     $$0.a(gxx.ar, $$9, $$5 + $$11, $$2 - 2, 9, 9, $$10);
                     fkr.e $$12 = $$3x.a($$3, this.n.j);
                     if ($$12 != fkr.e.a) {
                        int $$13;
                        ame $$14;
                        if ($$12 == fkr.e.c) {
                           $$13 = 6;
                           $$14 = g;
                        } else {
                           $$13 = -6;
                           $$14 = f;
                        }

                        $$0.a(gxx.ar, $$14, $$5 + $$11 + 1, $$2 + $$13, 7, 5);
                     }
                  }
               }
            }
         );
   }
}
