public class hhd extends hfl<cul, hnb, gpw> {
   private static final ame a = ame.b("textures/entity/wandering_trader.png");

   public hhd(hee.a $$0) {
      super($$0, new gpw($$0.a(gqm.dU)), 0.5F);
      this.a(new hhy<>(this, $$0.f()));
      this.a(new hhx<>(this));
   }

   public ame a(hnb $$0) {
      return a;
   }

   public hnb b() {
      return new hnb();
   }

   public void a(cul $$0, hnb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hlf.a($$0, $$1, this.i);
      $$1.a = $$0.m() > 0;
   }
}
