public class hfa extends hfl<cmv, hlk, gnz> {
   private static final ame a = ame.b("textures/entity/iron_golem/iron_golem.png");

   public hfa(hee.a $$0) {
      super($$0, new gnz($$0.a(gqm.bG)), 0.7F);
      this.a(new hij(this));
      this.a(new hik(this, $$0.d()));
   }

   public ame a(hlk $$0) {
      return a;
   }

   public hlk b() {
      return new hlk();
   }

   public void a(cmv $$0, hlk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n() > 0.0F ? $$0.n() - $$2 : 0.0F;
      $$1.b = $$0.t();
      $$1.c = $$0.m();
   }

   protected void a(hlk $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!($$0.ah < 0.01)) {
         float $$4 = 13.0F;
         float $$5 = $$0.ag + 6.0F;
         float $$6 = (Math.abs($$5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$6));
      }
   }
}
