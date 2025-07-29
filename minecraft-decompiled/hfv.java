public class hfv extends hew<cth, hmb, gom> {
   private static final ame k = ame.b("textures/entity/piglin/piglin.png");
   private static final ame l = ame.b("textures/entity/piglin/piglin_brute.png");
   public static final hhy.a a = new hhy.a(0.0F, 0.0F, 1.0019531F);

   public hfv(hee.a $$0, gql $$1, gql $$2, gql $$3, gql $$4, gql $$5, gql $$6) {
      super($$0, new gom($$0.a($$1)), new gom($$0.a($$2)), 0.5F, a);
      this.a(new hii<>(this, new gnw($$0.a($$3)), new gnw($$0.a($$4)), new gnw($$0.a($$5)), new gnw($$0.a($$6)), $$0.h()));
   }

   public ame a(hmb $$0) {
      return $$0.a ? l : k;
   }

   public hmb b() {
      return new hmb();
   }

   public void a(cth $$0, hmb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ap() == bzv.aU;
      $$1.d = $$0.gI();
      $$1.c = dbo.b($$0.fI(), $$0);
      $$1.b = $$0.t();
   }

   protected boolean b(hmb $$0) {
      return super.a($$0) || $$0.b;
   }
}
