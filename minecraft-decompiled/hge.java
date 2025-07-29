public class hge extends hcy<cpd, hmj, gpa> {
   private static final ame a = ame.b("textures/entity/sheep/sheep.png");

   public hge(hee.a $$0) {
      super($$0, new gpa($$0.a(gqm.cT)), new gpa($$0.a(gqm.cU)), 0.7F);
      this.a(new hiw(this, $$0.f()));
      this.a(new hiv(this, $$0.f()));
   }

   public ame a(hmj $$0) {
      return a;
   }

   public hmj b() {
      return new hmj();
   }

   public void a(cpd $$0, hmj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.t();
      $$1.d = $$0.n();
      $$1.e = $$0.ar();
   }
}
