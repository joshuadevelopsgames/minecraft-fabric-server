public class hhs extends hit<hka, gmn> {
   private static final ame a = ame.b("textures/entity/breeze/breeze_wind.png");
   private final gmn b;

   public hhs(hee.a $$0, hgc<hka, gmn> $$1) {
      super($$1);
      this.b = new gmn($$0.a(gqm.L));
   }

   public void a(fod $$0, gxn $$1, int $$2, hka $$3, float $$4, float $$5) {
      fog $$6 = $$1.getBuffer(gxz.a(a, this.a($$3.v) % 1.0F, 0.0F));
      this.b.a($$3);
      hdj.a(this.b, this.b.d()).a($$0, $$6, $$2, hri.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
