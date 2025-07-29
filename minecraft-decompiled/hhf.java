public class hhf extends hed<cwf, hkn> {
   private static final ame a = ame.b("textures/entity/projectiles/wind_charge.png");
   private final gpz h;

   public hhf(hee.a $$0) {
      super($$0);
      this.h = new gpz($$0.a(gqm.dY));
   }

   @Override
   public void a(hkn $$0, fod $$1, gxn $$2, int $$3) {
      fog $$4 = $$2.getBuffer(gxz.a(a, this.a($$0.v) % 1.0F, 0.0F));
      this.h.a($$0);
      this.h.a($$1, $$4, $$3, hri.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hkn d() {
      return new hkn();
   }
}
