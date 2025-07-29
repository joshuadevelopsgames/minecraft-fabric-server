import javax.annotation.Nullable;

public class dds extends dbd {
   public dds(dpz $$0, dcr.a $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public dgo b(dgo $$0) {
      jb $$1 = $$0.a();
      dmu $$2 = $$0.q();
      eeb $$3 = $$2.a_($$1);
      dpz $$4 = this.c();
      if (!$$3.a($$4)) {
         return dwx.a($$2, $$1) == 7 ? null : $$0;
      } else {
         jh $$5;
         if ($$0.h()) {
            $$5 = $$0.m() ? $$0.k().g() : $$0.k();
         } else {
            $$5 = $$0.k() == jh.b ? $$0.g() : jh.b;
         }

         int $$7 = 0;
         jb.a $$8 = $$1.k().c($$5);

         while ($$7 < 7) {
            if (!$$2.C && !$$2.k($$8)) {
               cut $$9 = $$0.o();
               int $$10 = $$2.ao();
               if ($$9 instanceof auc && $$8.v() > $$10) {
                  ((auc)$$9).b(xo.a("build.tooHigh", $$10).a(o.m), true);
               }
               break;
            }

            $$3 = $$2.a_($$8);
            if (!$$3.a(this.c())) {
               if ($$3.a($$0)) {
                  return dgo.a($$0, $$8, $$5);
               }
               break;
            }

            $$8.c($$5);
            if ($$5.o().d()) {
               $$7++;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean b() {
      return false;
   }
}
