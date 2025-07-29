public class dem extends dcr implements ddp {
   public static float a = 1.5F;

   public dem(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      if ($$0 instanceof aub $$4) {
         cvo.a(($$2x, $$3x, $$4x) -> new cwh($$1, $$0, $$1.dv().a(), $$1.bI().b(), $$1.dv().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.DU, aza.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(azj.c.b(this));
      $$3.a(1, $$1);
      return bxj.a;
   }

   @Override
   public cvo a(dmu $$0, jv $$1, dcv $$2, jh $$3) {
      bck $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fis $$8 = new fis($$5, $$6, $$7);
      cwh $$9 = new cwh($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cvo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public ddp.a a() {
      return ddp.a.a().a(($$0, $$1) -> dsf.a($$0, 1.0, fis.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
