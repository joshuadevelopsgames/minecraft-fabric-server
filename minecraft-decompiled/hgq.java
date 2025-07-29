public class hgq extends hcy<csi, hmr, gpo> {
   private static final ame a = ame.b("textures/entity/strider/strider.png");
   private static final ame k = ame.b("textures/entity/strider/strider_cold.png");
   private static final float l = 0.5F;

   public hgq(hee.a $$0) {
      super($$0, new gpo($$0.a(gqm.dB)), new gpo($$0.a(gqm.dD)), 0.5F);
      this.a(new hix<>(this, $$0.h(), htz.d.h, $$0x -> $$0x.a, new gpo($$0.a(gqm.dC)), new gpo($$0.a(gqm.dE))));
   }

   public ame a(hmr $$0) {
      return $$0.b ? k : a;
   }

   protected float b(hmr $$0) {
      float $$1 = super.g($$0);
      return $$0.am ? $$1 * 0.5F : $$1;
   }

   public hmr b() {
      return new hmr();
   }

   public void a(csi $$0, hmr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bzw.h).v();
      $$1.b = $$0.m();
      $$1.c = $$0.cd();
   }

   protected boolean c(hmr $$0) {
      return super.a($$0) || $$0.b;
   }
}
