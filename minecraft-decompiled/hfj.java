public class hfj extends hfl<cru, hmn, goa> {
   private static final ame a = ame.b("textures/entity/slime/magmacube.png");

   public hfj(hee.a $$0) {
      super($$0, new goa($$0.a(gqm.bP)), 0.25F);
   }

   protected int a(cru $$0, jb $$1) {
      return 15;
   }

   public ame a(hmn $$0) {
      return a;
   }

   public hmn b() {
      return new hmn();
   }

   public void a(cru $$0, hmn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bcb.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gH();
   }

   protected float b(hmn $$0) {
      return $$0.b * 0.25F;
   }

   protected void a(hmn $$0, fod $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ($$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * $$2, 1.0F / $$4 * $$2, $$4 * $$2);
   }
}
