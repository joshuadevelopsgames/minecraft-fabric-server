public class dcd extends dcr implements ddp {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public dcd(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      cut $$2 = $$0.o();
      if ($$2 != null && $$2.fQ()) {
         return bxj.e;
      } else {
         if ($$1 instanceof aub $$3) {
            dcv $$4 = $$0.n();
            fis $$5 = $$0.l();
            jh $$6 = $$0.k();
            cvo.a(new cvj($$1, $$0.o(), $$5.d + $$6.j() * 0.15, $$5.e + $$6.k() * 0.15, $$5.f + $$6.l() * 0.15, $$4), $$3, $$4);
            $$4.h(1);
         }

         return bxj.a;
      }
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      if ($$1.fQ()) {
         dcv $$3 = $$1.b($$2);
         if ($$0 instanceof aub $$4) {
            if ($$1.e(null)) {
               $$0.a(null, $$1, ayz.pc, aza.g, 1.0F, 1.0F);
            }

            cvo.a(new cvj($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(azj.c.b(this));
         }

         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   @Override
   public cvo a(dmu $$0, jv $$1, dcv $$2, jh $$3) {
      return new cvj($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public ddp.a a() {
      return ddp.a.a().a(dcd::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fis a(lk $$0, jh $$1) {
      return $$0.a().b($$1.j() * 0.5000099999997474, $$1.k() * 0.5000099999997474, $$1.l() * 0.5000099999997474);
   }
}
