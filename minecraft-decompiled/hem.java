public class hem extends hcy<cms, hkw, gnl> {
   private static final ame a = ame.b("textures/entity/fox/fox.png");
   private static final ame k = ame.b("textures/entity/fox/fox_sleep.png");
   private static final ame l = ame.b("textures/entity/fox/snow_fox.png");
   private static final ame m = ame.b("textures/entity/fox/snow_fox_sleep.png");

   public hem(hee.a $$0) {
      super($$0, new gnl($$0.a(gqm.aX)), new gnl($$0.a(gqm.aY)), 0.4F);
      this.a(new hig(this));
   }

   protected void a(hkw $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ae));
      }
   }

   public ame a(hkw $$0) {
      if ($$0.h == cms.v.a) {
         return $$0.d ? k : a;
      } else {
         return $$0.d ? m : l;
      }
   }

   public hkw b() {
      return new hkw();
   }

   public void a(cms $$0, hkw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hlf.a($$0, $$1, this.i);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cl();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fY();
      $$1.e = $$0.t();
      $$1.f = $$0.gH();
      $$1.g = $$0.gI();
      $$1.h = $$0.n();
   }
}
