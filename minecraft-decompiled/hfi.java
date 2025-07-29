public class hfi extends hed<cvn, hls> {
   private static final ame a = ame.b("textures/entity/llama/spit.png");
   private final god h;

   public hfi(hee.a $$0) {
      super($$0);
      this.h = new god($$0.a(gqm.bO));
   }

   public void a(hls $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.h.a($$0);
      fog $$4 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$4, $$3, hri.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hls a() {
      return new hls();
   }

   public void a(cvn $$0, hls $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}
