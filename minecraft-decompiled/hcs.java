import org.joml.Quaternionf;

public abstract class hcs extends hed<cxe, hjy> {
   public hcs(hee.a $$0) {
      super($$0);
      this.f = 0.8F;
   }

   public void a(hjy $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(bcb.a($$4) * $$4 * $$0.d / 10.0F * $$0.b));
      }

      if (!$$0.f && !bcb.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      gnh<hjy> $$5 = this.a();
      $$5.a($$0);
      fog $$6 = $$2.getBuffer(this.b());
      $$5.a($$1, $$6, $$3, hri.d);
      this.b($$0, $$1, $$2, $$3);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected void b(hjy $$0, fod $$1, gxn $$2, int $$3) {
   }

   protected abstract gnh<hjy> a();

   protected abstract gxz b();

   public hjy c() {
      return new hjy();
   }

   public void a(cxe $$0, hjy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.l($$2);
      $$1.c = $$0.I() - $$2;
      $$1.b = $$0.J();
      $$1.d = Math.max($$0.G() - $$2, 0.0F);
      $$1.e = $$0.b($$2);
      $$1.f = $$0.bq();
      $$1.g = $$0.a(0, $$2);
      $$1.h = $$0.a(1, $$2);
   }
}
