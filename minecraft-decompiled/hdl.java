public class hdl extends hcy<cmg, hkc, gmq> {
   public hdl(hee.a $$0) {
      super($$0, new gmq($$0.a(gqm.Q)), new gmq($$0.a(gqm.R)), 0.4F);
      this.a(new hhv(this, $$0.f()));
   }

   public ame a(hkc $$0) {
      return $$0.a;
   }

   public hkc a() {
      return new hkc();
   }

   public void a(cmg $$0, hkc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gT().a().b().b();
      $$1.d = $$0.cl();
      $$1.e = $$0.cm();
      $$1.f = $$0.t();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gY();
      $$1.c = $$0.m() ? $$0.gV() : null;
   }

   protected void a(hkc $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(bcb.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
