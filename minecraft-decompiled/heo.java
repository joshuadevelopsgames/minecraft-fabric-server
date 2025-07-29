public class heo extends hfl<crp, hky, gnn> {
   private static final ame a = ame.b("textures/entity/ghast/ghast.png");
   private static final ame k = ame.b("textures/entity/ghast/ghast_shooting.png");

   public heo(hee.a $$0) {
      super($$0, new gnn($$0.a(gqm.bb)), 1.5F);
   }

   public ame a(hky $$0) {
      return $$0.a ? k : a;
   }

   public hky b() {
      return new hky();
   }

   public void a(crp $$0, hky $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.l();
   }
}
