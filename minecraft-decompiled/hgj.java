public class hgj extends hfl<cse, hmn, gpi> {
   public static final ame a = ame.b("textures/entity/slime/slime.png");

   public hgj(hee.a $$0) {
      super($$0, new gpi($$0.a(gqm.dm)), 0.25F);
      this.a(new hiz(this, $$0.f()));
   }

   protected float a(hmn $$0) {
      return $$0.b * 0.25F;
   }

   protected void a(hmn $$0, fod $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = $$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public ame b(hmn $$0) {
      return a;
   }

   public hmn b() {
      return new hmn();
   }

   public void a(cse $$0, hmn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bcb.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gH();
   }
}
