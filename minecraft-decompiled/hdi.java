public class hdi extends hcw<crf, hjz> {
   private static final ame a = ame.b("textures/entity/skeleton/bogged.png");
   private static final ame k = ame.b("textures/entity/skeleton/bogged_overlay.png");

   public hdi(hee.a $$0) {
      super($$0, gqm.G, gqm.H, new gml($$0.a(gqm.F)));
      this.a(new hiy<>(this, $$0.f(), gqm.I, k));
   }

   public ame a(hjz $$0) {
      return a;
   }

   public hjz a() {
      return new hjz();
   }

   public void a(crf $$0, hjz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gK();
   }
}
