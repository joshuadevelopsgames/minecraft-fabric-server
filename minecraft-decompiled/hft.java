public class hft extends hfl<crx, hlz, goj> {
   private static final ame a = ame.b("textures/entity/phantom.png");

   public hft(hee.a $$0) {
      super($$0, new goj($$0.a(gqm.ci)), 0.75F);
      this.a(new hir(this));
   }

   public ame a(hlz $$0) {
      return a;
   }

   public hlz b() {
      return new hlz();
   }

   public void a(crx $$0, hlz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m() + $$1.v;
      $$1.b = $$0.l();
   }

   protected void a(hlz $$0, fod $$1) {
      float $$2 = 1.0F + 0.15F * $$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hlz $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ae));
   }
}
