public class dbx extends dcr {
   public dbx(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      if ($$0 instanceof aub $$4) {
         $$3.a(1, $$1);
         $$1.b(azj.c.b(this));
         $$4.a(null, $$1, ayz.BX, $$1.do(), 1.0F, 1.0F);
         dcv $$6 = ddi.a($$4, $$1.dB(), $$1.dH(), (byte)0, true, false);
         if ($$3.f()) {
            return bxj.a.a($$6);
         } else {
            if (!$$1.gs().g($$6.v())) {
               $$1.a($$6, false);
            }

            return bxj.a;
         }
      } else {
         return bxj.a;
      }
   }
}
