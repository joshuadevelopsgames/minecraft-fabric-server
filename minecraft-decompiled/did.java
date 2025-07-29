public class did extends dhc {
   public did(dgz $$0) {
      super($$0);
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dcv $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof dbb) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dcz.wV)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  eap $$6 = $$5.a(kq.am, eap.a);
                  if (!$$6.b().isEmpty()) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      dcv $$2 = dcv.l;
      dcv $$3 = dcv.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dcv $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof dbb) {
               $$2 = $$5;
            } else if ($$5.a(dcz.wV)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kq.am, $$2.a(kq.am));
         $$3.b(kq.an, ((dbb)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public dhw<did> a() {
      return dhw.l;
   }
}
