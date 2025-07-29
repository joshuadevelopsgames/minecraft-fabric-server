public class hdf extends hcy<cme, hjw, gmg> {
   private static final ame a = ame.b("textures/entity/bee/bee_angry.png");
   private static final ame k = ame.b("textures/entity/bee/bee_angry_nectar.png");
   private static final ame l = ame.b("textures/entity/bee/bee.png");
   private static final ame m = ame.b("textures/entity/bee/bee_nectar.png");

   public hdf(hee.a $$0) {
      super($$0, new gmg($$0.a(gqm.x)), new gmg($$0.a(gqm.y)), 0.4F);
   }

   public ame a(hjw $$0) {
      if ($$0.d) {
         return $$0.e ? k : a;
      } else {
         return $$0.e ? m : l;
      }
   }

   public hjw a() {
      return new hjw();
   }

   public void a(cme $$0, hjw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gU();
      $$1.c = $$0.aK() && $$0.dA().h() < 1.0E-7;
      $$1.d = $$0.ad_();
      $$1.e = $$0.gT();
   }
}
