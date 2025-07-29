public class hdw extends hcx<crj, hnh, gnc> {
   private static final ame a = ame.b("textures/entity/zombie/drowned.png");

   public hdw(hee.a $$0) {
      super($$0, new gnc($$0.a(gqm.aG)), new gnc($$0.a(gqm.aH)), new gnc($$0.a(gqm.aL)), new gnc($$0.a(gqm.aM)), new gnc($$0.a(gqm.aI)), new gnc($$0.a(gqm.aJ)));
      this.a(new hib(this, $$0.f()));
   }

   public hnh a() {
      return new hnh();
   }

   @Override
   public ame a(hnh $$0) {
      return a;
   }

   protected void a(hnh $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.J;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ae;
         float $$6 = bcb.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.x / 2.0F / $$3, 0.0F);
      }
   }

   protected gnx.a a(crj $$0, cad $$1) {
      dcv $$2 = $$0.a($$1);
      return $$0.fF() == $$1 && $$0.gy() && $$2.a(dcz.xx) ? gnx.a.e : gnx.a.a;
   }
}
