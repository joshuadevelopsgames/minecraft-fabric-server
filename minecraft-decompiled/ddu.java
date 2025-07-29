import java.util.List;

public class ddu extends dcr {
   public ddu(dcr.a $$0) {
      super($$0);
   }

   public static dfy a() {
      jm<dpz> $$0 = mm.a(mm.e);
      return new dfy(
         List.of(dfy.a.a(jp.a(dqb.bz.p()), 15.0F), dfy.a.b($$0.b(azo.L), 15.0F), dfy.a.b($$0.b(azo.a), 5.0F), dfy.a.b(jp.a(dqb.fx.p(), dqb.fy.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public boolean a(dcv $$0, dmu $$1, eeb $$2, jb $$3, cam $$4) {
      dfy $$5 = $$0.a(kq.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B_() && !$$2.a(azo.aQ) && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bzw.a);
         }

         return true;
      }
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dtt $$5 && !$$5.q($$3)) {
         cut $$6 = $$0.o();
         dcv $$7 = $$0.n();
         if ($$6 instanceof auc) {
            aq.N.a((auc)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, ayz.me, aza.e, 1.0F, 1.0F);
         eeb $$8 = $$5.p($$3);
         $$1.c($$2, $$8);
         $$1.a(ejb.c, $$2, ejb.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, cam.d($$0.p()));
         }

         return bxj.a;
      } else {
         return super.a($$0);
      }
   }
}
