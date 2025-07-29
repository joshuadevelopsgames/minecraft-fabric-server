public class hiv extends hit<hmj, gpa> {
   private static final ame a = ame.b("textures/entity/sheep/sheep_wool.png");
   private final gnh<hmj> b;
   private final gnh<hmj> c;

   public hiv(hgc<hmj, gpa> $$0, gqj $$1) {
      super($$0);
      this.b = new goz($$1.a(gqm.cW));
      this.c = new goz($$1.a(gqm.cV));
   }

   public void a(fod $$0, gxn $$1, int $$2, hmj $$3, float $$4, float $$5) {
      if (!$$3.c) {
         gnh<hmj> $$6 = $$3.am ? this.c : this.b;
         if ($$3.A) {
            if ($$3.ar) {
               $$6.a($$3);
               fog $$7 = $$1.getBuffer(gxz.s(a));
               $$6.a($$0, $$7, $$2, hfg.a($$3, 0.0F), -16777216);
            }
         } else {
            a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
         }
      }
   }
}
