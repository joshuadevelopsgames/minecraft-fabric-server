public class hdt extends hcy<cmq, hki, gna> {
   private static final ame a = ame.b("textures/entity/dolphin.png");

   public hdt(hee.a $$0) {
      super($$0, new gna($$0.a(gqm.ax)), new gna($$0.a(gqm.ay)), 0.7F);
      this.a(new hia(this));
   }

   public ame a(hki $$0) {
      return a;
   }

   public hki a() {
      return new hki();
   }

   public void a(cmq $$0, hki $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hlf.a($$0, $$1, this.i);
      $$1.a = $$0.dA().j() > 1.0E-7;
   }
}
