public class dbv extends dcr implements ddp {
   public static final float a = 1.5F;

   public dbv(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.iu, aza.h, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof aub $$4) {
         cvo.a(cvx::new, $$4, $$3, $$1, 0.0F, 1.5F, 1.0F);
      }

      $$1.b(azj.c.b(this));
      $$3.a(1, $$1);
      return bxj.a;
   }

   @Override
   public cvo a(dmu $$0, jv $$1, dcv $$2, jh $$3) {
      return new cvx($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
