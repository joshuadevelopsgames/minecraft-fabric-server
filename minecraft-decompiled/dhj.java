public class dhj extends dhc {
   public dhj(dgz $$0) {
      super($$0);
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dcv $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kq.M)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dcz.vL)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      int $$2 = 0;
      dcv $$3 = dcv.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dcv $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kq.M)) {
               if (!$$3.f()) {
                  return dcv.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(dcz.vL)) {
                  return dcv.l;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : dcv.l;
   }

   @Override
   public dhw<dhj> a() {
      return dhw.e;
   }
}
