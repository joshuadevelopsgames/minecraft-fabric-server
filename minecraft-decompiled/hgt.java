public class hgt extends hed<cwc, hmu> {
   public static final ame a = ame.b("textures/entity/trident.png");
   private final gpq h;

   public hgt(hee.a $$0) {
      super($$0);
      this.h = new gpq($$0.a(gqm.dJ));
   }

   public void a(hmu $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fog $$4 = hfd.a($$2, this.h.a(a), false, $$0.c);
      this.h.a($$1, $$4, $$3, hri.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hmu a() {
      return new hmu();
   }

   public void a(cwc $$0, hmu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.x();
   }
}
