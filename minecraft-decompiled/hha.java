public class hha extends hfl<csj, hmz, gpu> {
   private static final ame a = ame.b("textures/entity/illager/vex.png");
   private static final ame k = ame.b("textures/entity/illager/vex_charging.png");

   public hha(hee.a $$0) {
      super($$0, new gpu($$0.a(gqm.dQ)), 0.3F);
      this.a(new hil<>(this));
   }

   protected int a(csj $$0, jb $$1) {
      return 15;
   }

   public ame a(hmz $$0) {
      return $$0.a ? k : a;
   }

   public hmz b() {
      return new hmz();
   }

   public void a(csj $$0, hmz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hjr.a($$0, $$1, this.i);
      $$1.a = $$0.t();
   }
}
