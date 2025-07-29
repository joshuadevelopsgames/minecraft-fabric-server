public class dbz extends dcr {
   public dbz(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      if (!$$3.a(dqb.fX) || $$3.c(dsr.c)) {
         return bxj.e;
      } else if ($$1.C) {
         return bxj.a;
      } else {
         eeb $$4 = $$3.b(dsr.c, true);
         dpz.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dqb.fX);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         eeg.b $$5 = dsr.b().a($$1, $$2);
         if ($$5 != null) {
            jb $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  jb $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dqb.fW.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bxj.a;
      }
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      return 0;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      fio $$4 = a($$0, $$1, dmb.b.a);
      if ($$4.d() == fiq.a.b && $$0.a_($$4.b()).a(dqb.fX)) {
         return bxj.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof aub $$5) {
            jb $$6 = $$5.a(baa.a, $$1.dx(), 100, false);
            if ($$6 == null) {
               return bxj.c;
            }

            cvh $$7 = new cvh($$0, $$1.dC(), $$1.e(0.5), $$1.dI());
            $$7.a($$3);
            $$7.a(fis.a($$6));
            $$0.a(ejb.K, $$7.dv(), ejb.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof auc $$8) {
               aq.n.a($$8, $$6);
            }

            float $$9 = bcb.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.iP, aza.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(azj.c.b(this));
         }

         return bxj.b;
      }
   }
}
