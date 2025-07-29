public class ddo extends dcr {
   public ddo(dcr.a $$0) {
      super($$0);
   }

   @Override
   public dcv m() {
      dcv $$0 = super.m();
      $$0.b(kq.R, new der(des.a));
      return $$0;
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      cut $$3 = $$0.o();
      dcv $$4 = $$0.n();
      der $$5 = $$4.a(kq.R, der.a);
      eeb $$6 = $$1.a_($$2);
      if ($$0.k() != jh.a && $$6.a(azo.cp) && $$5.a(des.a)) {
         $$1.a(null, $$2, ayz.kV, aza.e, 1.0F, 1.0F);
         $$3.a($$0.p(), dcy.a($$4, $$3, new dcv(dcz.tJ)));
         $$3.b(azj.c.b($$4.h()));
         if (!$$1.C) {
            aub $$7 = (aub)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(me.ap, $$2.u() + $$1.A.j(), $$2.v() + 1, $$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, ayz.cB, aza.e, 1.0F, 1.0F);
         $$1.a(null, ejb.z, $$2);
         $$1.c($$2, dqb.tt.m());
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   @Override
   public xo a(dcv $$0) {
      der $$1 = $$0.a(kq.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}
