public class het extends hcy<cmt, hlb, gns> {
   private static final ame a = ame.b("textures/entity/ghast/happy_ghast.png");
   private static final ame k = ame.b("textures/entity/ghast/happy_ghast_baby.png");
   private static final ame l = ame.b("textures/entity/ghast/happy_ghast_ropes.png");

   public het(hee.a $$0) {
      super($$0, new gns($$0.a(gqm.bk)), new gns($$0.a(gqm.bl)), 2.0F);
      this.a(new hix<>(this, $$0.h(), htz.d.o, $$0x -> $$0x.a, new gnr($$0.a(gqm.bm)), new gnr($$0.a(gqm.bn))));
      this.a(new hiu<>(this, $$0.f(), l));
   }

   public ame a(hlb $$0) {
      return $$0.am ? k : a;
   }

   public hlb b() {
      return new hlb();
   }

   protected fin a(cmt $$0) {
      fin $$1 = super.a($$0);
      float $$2 = $$0.dt();
      return $$1.b($$1.b - $$2 / 2.0F);
   }

   public void a(cmt $$0, hlb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bzw.g).v();
      $$1.b = $$0.cd();
      $$1.c = $$0.n();
   }
}
