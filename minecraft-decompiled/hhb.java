public class hhb extends hcy<cuf, hnb, gpw> {
   private static final ame k = ame.b("textures/entity/villager/villager.png");
   public static final hhy.a a = new hhy.a(-0.1171875F, -0.07421875F, 1.0F);

   public hhb(hee.a $$0) {
      super($$0, new gpw($$0.a(gqm.dR)), new gpw($$0.a(gqm.dS)), 0.5F);
      this.a(new hhy<>(this, $$0.f(), a));
      this.a(new hjf<>(this, $$0.e(), "villager"));
      this.a(new hhx<>(this));
   }

   public ame a(hnb $$0) {
      return k;
   }

   protected float b(hnb $$0) {
      float $$1 = super.g($$0);
      return $$0.am ? $$1 * 0.5F : $$1;
   }

   public hnb b() {
      return new hnb();
   }

   public void a(cuf $$0, hnb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hlf.a($$0, $$1, this.i);
      $$1.a = $$0.m() > 0;
      $$1.b = $$0.gR();
   }
}
