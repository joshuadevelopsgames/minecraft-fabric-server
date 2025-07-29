public class hgy extends hcy<cnm, hmy, gpt> {
   private static final ame a = ame.b("textures/entity/turtle/big_sea_turtle.png");

   public hgy(hee.a $$0) {
      super($$0, new gpt($$0.a(gqm.dO)), new gpt($$0.a(gqm.dP)), 0.7F);
   }

   protected float a(hmy $$0) {
      float $$1 = super.g($$0);
      return $$0.am ? $$1 * 0.83F : $$1;
   }

   public hmy b() {
      return new hmy();
   }

   public void a(cnm $$0, hmy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bm() && $$0.aK();
      $$1.b = $$0.n();
      $$1.c = !$$0.g_() && $$0.m();
   }

   public ame b(hmy $$0) {
      return a;
   }
}
