public class hgd extends hfl<cng, hmh, goy> {
   private static final ame a = ame.b("textures/entity/fish/salmon.png");
   private final goy k;
   private final goy l;
   private final goy m;

   public hgd(hee.a $$0) {
      super($$0, new goy($$0.a(gqm.cQ)), 0.4F);
      this.k = new goy($$0.a(gqm.cS));
      this.l = new goy($$0.a(gqm.cQ));
      this.m = new goy($$0.a(gqm.cR));
   }

   public void a(cng $$0, hmh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gP();
   }

   public ame a(hmh $$0) {
      return a;
   }

   public hmh b() {
      return new hmh();
   }

   protected void a(hmh $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      if (!$$0.an) {
         $$4 = 1.3F;
         $$5 = 1.7F;
      }

      float $$6 = $$4 * 4.3F * bcb.a($$5 * 0.6F * $$0.v);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.an) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }

   public void a(hmh $$0, fod $$1, gxn $$2, int $$3) {
      if ($$0.a == cng.a.a) {
         this.h = this.k;
      } else if ($$0.a == cng.a.c) {
         this.h = this.m;
      } else {
         this.h = this.l;
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
