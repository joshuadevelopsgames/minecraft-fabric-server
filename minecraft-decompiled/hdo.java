public class hdo extends hfl<cmm, hlq, gmt> {
   private static final ame a = ame.b("textures/entity/fish/cod.png");

   public hdo(hee.a $$0) {
      super($$0, new gmt($$0.a(gqm.ab)), 0.3F);
   }

   @Override
   public ame b(hlq $$0) {
      return a;
   }

   public hlq a() {
      return new hlq();
   }

   @Override
   protected void a(hlq $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bcb.a(0.6F * $$0.v);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.an) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
