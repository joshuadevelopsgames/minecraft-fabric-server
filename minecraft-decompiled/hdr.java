public class hdr extends hfl<crh, hkg, gmz> {
   private static final ame a = ame.b("textures/entity/creeper/creeper.png");

   public hdr(hee.a $$0) {
      super($$0, new gmz($$0.a(gqm.aq)), 0.5F);
      this.a(new hhw(this, $$0.f()));
   }

   protected void a(hkg $$0, fod $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + bcb.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = bcb.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hkg $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : bcb.a($$1, 0.5F, 1.0F);
   }

   public ame b(hkg $$0) {
      return a;
   }

   public hkg a() {
      return new hkg();
   }

   public void a(crh $$0, hkg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.m();
   }
}
