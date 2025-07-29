import java.util.function.Consumer;

public class day extends dcr {
   public day(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      jh $$1 = $$0.k();
      if ($$1 == jh.a) {
         return bxj.d;
      } else {
         dmu $$2 = $$0.q();
         dgo $$3 = new dgo($$0);
         jb $$4 = $$3.a();
         dcv $$5 = $$0.n();
         fis $$6 = fis.c($$4);
         fin $$7 = bzv.g.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aub $$8) {
               Consumer<cqo> $$9 = bzv.a($$8, $$5, $$0.o());
               cqo $$10 = bzv.g.b($$8, $$9, $$4, bzu.m, true, true);
               if ($$10 == null) {
                  return bxj.d;
               }

               float $$11 = bcb.d((bcb.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dC(), $$10.dE(), $$10.dI(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dC(), $$10.dE(), $$10.dI(), ayz.aD, aza.e, 0.75F, 0.8F);
               $$10.a(ejb.t, $$0.o());
            }

            $$5.h(1);
            return bxj.a;
         } else {
            return bxj.d;
         }
      }
   }
}
