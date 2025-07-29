import java.util.List;

public class dbg extends dcr {
   public dbg(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      List<bze> $$3 = $$0.a(bze.class, $$1.cV().g(2.0), $$0x -> $$0x != null && $$0x.bO() && $$0x.n() instanceof cps);
      dcv $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bze $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), ayz.cD, aza.g, 1.0F, 1.0F);
         $$0.a($$1, ejb.y, $$1.dv());
         if ($$1 instanceof auc $$6) {
            aq.T.a($$6, $$4, $$5);
         }

         return bxj.a.a(this.a($$4, $$1, new dcv(dcz.wQ)));
      } else {
         fio $$7 = a($$0, $$1, dmb.b.b);
         if ($$7.d() == fiq.a.a) {
            return bxj.e;
         } else {
            if ($$7.d() == fiq.a.b) {
               jb $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bxj.e;
               }

               if ($$0.b_($$8).a(azu.a)) {
                  $$0.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), ayz.cC, aza.g, 1.0F, 1.0F);
                  $$0.a($$1, ejb.y, $$8);
                  return bxj.a.a(this.a($$4, $$1, der.a(dcz.tK, des.a)));
               }
            }

            return bxj.e;
         }
      }
   }

   protected dcv a(dcv $$0, cut $$1, dcv $$2) {
      $$1.b(azj.c.b(this));
      return dcy.a($$0, $$1, $$2);
   }
}
