public class hdq<T extends csz> extends hfl<T, hkf, gmy> {
   private static final ame a = ame.b("textures/entity/creaking/creaking.png");
   private static final ame k = ame.b("textures/entity/creaking/creaking_eyes.png");

   public hdq(hee.a $$0) {
      super($$0, new gmy($$0.a(gqm.ap)), 0.6F);
      this.a(new him<>(this, k, ($$0x, $$1) -> 1.0F, gmy::b, gxz::q, true));
   }

   public ame a(hkf $$0) {
      return a;
   }

   public hkf a() {
      return new hkf();
   }

   public void a(T $$0, hkf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.ck);
      $$1.a.a($$0.cl);
      $$1.c.a($$0.cm);
      if ($$0.gK()) {
         $$1.af = 0.0F;
         $$1.ap = false;
         $$1.d = $$0.gN();
      } else {
         $$1.d = $$0.gR();
      }

      $$1.e = $$0.n();
   }
}
