public class dcf extends dcr {
   public dcf(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      cut $$1 = $$0.o();
      dmu $$2 = $$0.q();
      jb $$3 = $$0.a();
      eeb $$4 = $$2.a_($$3);
      if (!dqp.i($$4) && !dqq.h($$4) && !dqr.h($$4)) {
         jb $$5 = $$3.a($$0.k());
         if (dpm.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, ayz.jM, aza.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            eeb $$6 = dpm.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ejb.i, $$3);
            dcv $$7 = $$0.n();
            if ($$1 instanceof auc) {
               aq.z.a((auc)$$1, $$5, $$7);
               $$7.a(1, $$1, cam.d($$0.p()));
            }

            return bxj.a;
         } else {
            return bxj.d;
         }
      } else {
         $$2.a($$1, $$3, ayz.jM, aza.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(eer.u, true), 11);
         $$2.a($$1, ejb.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, cam.d($$0.p()));
         }

         return bxj.a;
      }
   }
}
