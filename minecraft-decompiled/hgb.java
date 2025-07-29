public class hgb extends hfl<csa, hmg, gox> {
   private static final ame a = ame.b("textures/entity/illager/ravager.png");

   public hgb(hee.a $$0) {
      super($$0, new gox($$0.a(gqm.cP)), 1.1F);
   }

   public ame a(hmg $$0) {
      return a;
   }

   public hmg b() {
      return new hmg();
   }

   public void a(csa $$0, hmg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t() > 0.0F ? $$0.t() - $$2 : 0.0F;
      $$1.b = $$0.m() > 0.0F ? $$0.m() - $$2 : 0.0F;
      if ($$0.gQ() > 0) {
         $$1.c = (20 - $$0.gQ() + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
