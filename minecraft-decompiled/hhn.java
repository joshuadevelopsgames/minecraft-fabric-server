public class hhn extends hew<csp, hni, gqe<hni>> {
   private static final ame a = ame.b("textures/entity/zombie_villager/zombie_villager.png");

   public hhn(hee.a $$0) {
      super($$0, new gqe<>($$0.a(gqm.ey)), new gqe<>($$0.a(gqm.ez)), 0.5F, hhb.a);
      this.a(new hii<>(this, new gqe($$0.a(gqm.eC)), new gqe($$0.a(gqm.eD)), new gqe($$0.a(gqm.eA)), new gqe($$0.a(gqm.eB)), $$0.h()));
      this.a(new hjf<>(this, $$0.e(), "zombie_villager"));
   }

   public ame a(hni $$0) {
      return a;
   }

   public hni b() {
      return new hni();
   }

   public void a(csp $$0, hni $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gQ();
      $$1.c = $$0.gR();
      $$1.a = $$0.gy();
   }

   protected boolean b(hni $$0) {
      return super.a($$0) || $$0.b;
   }
}
