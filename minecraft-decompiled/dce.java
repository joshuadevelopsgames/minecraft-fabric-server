public class dce extends dcr {
   public dce(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      if ($$1.cG != null) {
         if (!$$0.C) {
            int $$4 = $$1.cG.a($$3);
            $$3.a($$4, $$1, cam.d($$2));
         }

         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.jJ, aza.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.c(ejb.C);
      } else {
         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.jL, aza.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aub $$5) {
            int $$6 = (int)(djk.b($$5, $$3, $$1) * 20.0F);
            int $$7 = djk.a($$5, $$3, $$1);
            cvo.a(new cvk($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(azj.c.b(this));
         $$1.c(ejb.D);
      }

      return bxj.a;
   }
}
