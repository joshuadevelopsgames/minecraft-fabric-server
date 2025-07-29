import java.util.List;

public class dby extends dcr {
   public dby(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      if (!$$3.a(dqb.cy) && !$$3.a(dqb.I)) {
         return bxj.d;
      } else {
         jb $$4 = $$2.d();
         if (!$$1.w($$4)) {
            return bxj.d;
         } else {
            double $$5 = $$4.u();
            double $$6 = $$4.v();
            double $$7 = $$4.w();
            List<bzm> $$8 = $$1.a_(null, new fin($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bxj.d;
            } else {
               if ($$1 instanceof aub) {
                  cpr $$9 = new cpr($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ejb.t, $$4);
                  eib $$10 = ((aub)$$1).G();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bxj.a;
            }
         }
      }
   }
}
