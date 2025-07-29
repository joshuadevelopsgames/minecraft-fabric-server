public class hdk extends hcy<cnz, hkb, gmo> {
   private static final ame a = ame.b("textures/entity/camel/camel.png");

   public hdk(hee.a $$0) {
      super($$0, new gmo($$0.a(gqm.M)), new gmo($$0.a(gqm.N)), 0.7F);
      this.a(new hix<>(this, $$0.h(), htz.d.i, $$0x -> $$0x.a, new gmp($$0.a(gqm.O)), new gmp($$0.a(gqm.P))));
   }

   public ame a(hkb $$0) {
      return a;
   }

   public hkb a() {
      return new hkb();
   }

   public void a(cnz $$0, hkb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bzw.h).v();
      $$1.b = $$0.cd();
      $$1.c = Math.max($$0.c() - $$2, 0.0F);
      $$1.d.a($$0.cq);
      $$1.e.a($$0.cr);
      $$1.f.a($$0.cs);
      $$1.g.a($$0.ct);
      $$1.h.a($$0.cu);
   }
}
