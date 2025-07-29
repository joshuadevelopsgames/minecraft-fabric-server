public class hiw extends hit<hmj, gpa> {
   private static final ame a = ame.b("textures/entity/sheep/sheep_wool_undercoat.png");
   private final gnh<hmj> b;
   private final gnh<hmj> c;

   public hiw(hgc<hmj, gpa> $$0, gqj $$1) {
      super($$0);
      this.b = new goz($$1.a(gqm.cX));
      this.c = new goz($$1.a(gqm.cY));
   }

   public void a(fod $$0, gxn $$1, int $$2, hmj $$3, float $$4, float $$5) {
      if (!$$3.A && ($$3.b() || $$3.d != dbt.a)) {
         gnh<hmj> $$6 = $$3.am ? this.c : this.b;
         a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
      }
   }
}
