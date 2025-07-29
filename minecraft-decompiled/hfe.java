public class hfe extends hed<cqt, hkn> {
   private static final ame a = ame.b("textures/entity/lead_knot.png");
   private final gob h;

   public hfe(hee.a $$0) {
      super($$0);
      this.h = new gob($$0.a(gqm.bJ));
   }

   @Override
   public void a(hkn $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.h.a($$0);
      fog $$4 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$4, $$3, hri.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hkn d() {
      return new hkn();
   }
}
