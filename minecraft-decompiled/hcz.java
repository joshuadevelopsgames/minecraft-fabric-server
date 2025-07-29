public class hcz extends hfl<cno, hjp, glu> {
   private static final ame a = ame.b("textures/entity/allay/allay.png");

   public hcz(hee.a $$0) {
      super($$0, new glu($$0.a(gqm.c)), 0.4F);
      this.a(new hil<>(this));
   }

   public ame a(hjp $$0) {
      return a;
   }

   public hjp a() {
      return new hjp();
   }

   public void a(cno $$0, hjp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hjr.a($$0, $$1, this.i);
      $$1.a = $$0.t();
      $$1.b = $$0.gH();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cno $$0, jb $$1) {
      return 15;
   }
}
