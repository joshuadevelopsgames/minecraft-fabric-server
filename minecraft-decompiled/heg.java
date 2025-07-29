public class heg extends hed<cvg, hkp> {
   private static final ame a = ame.b("textures/entity/illager/evoker_fangs.png");
   private final gnj h;

   public heg(hee.a $$0) {
      super($$0);
      this.h = new gnj($$0.a(gqm.aW));
   }

   public void a(hkp $$0, fod $$1, gxn $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.h.a($$0);
         fog $$5 = $$2.getBuffer(this.h.a(a));
         this.h.a($$1, $$5, $$3, hri.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hkp a() {
      return new hkp();
   }

   public void a(cvg $$0, hkp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dP();
      $$1.b = $$0.a($$2);
   }
}
