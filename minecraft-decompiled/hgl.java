public class hgl extends hfl<cni, hmp, gpk> {
   private static final ame a = ame.b("textures/entity/snow_golem.png");

   public hgl(hee.a $$0) {
      super($$0, new gpk($$0.a(gqm.dq)), 0.5F);
      this.a(new hja(this, $$0.d()));
   }

   public ame a(hmp $$0) {
      return a;
   }

   public hmp b() {
      return new hmp();
   }

   public void a(cni $$0, hmp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
