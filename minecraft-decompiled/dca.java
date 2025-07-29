public class dca extends dcr {
   public static float a = 1.5F;

   public dca(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.ja, aza.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof aub $$4) {
         cvo.a(cvy::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(azj.c.b(this));
      $$3.a(1, $$1);
      return bxj.a;
   }
}
