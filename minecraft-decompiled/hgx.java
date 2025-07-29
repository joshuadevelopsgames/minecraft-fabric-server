public class hgx extends hfl<cnl, hmx, gnh<hmx>> {
   private final gnh<hmx> a = this.c();
   private final gnh<hmx> k;
   private static final ame l = ame.b("textures/entity/fish/tropical_a.png");
   private static final ame m = ame.b("textures/entity/fish/tropical_b.png");

   public hgx(hee.a $$0) {
      super($$0, new gpr($$0.a(gqm.dM)), 0.15F);
      this.k = new gps($$0.a(gqm.dK));
      this.a(new hje(this, $$0.f()));
   }

   public ame a(hmx $$0) {
      return switch ($$0.a.a()) {
         case a -> l;
         case b -> m;
      };
   }

   public hmx b() {
      return new hmx();
   }

   public void a(cnl $$0, hmx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gR();
      $$1.b = $$0.gP().d();
      $$1.c = $$0.gQ().d();
   }

   public void a(hmx $$0, fod $$1, gxn $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.k;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hmx $$0) {
      return $$0.b;
   }

   protected void a(hmx $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bcb.a(0.6F * $$0.v);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.an) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
