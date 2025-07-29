public class din extends dhc {
   public din(dgz $$0) {
      super($$0);
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               dcv $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(dcz.wU)) {
                     return false;
                  }
               } else if (!$$4.a(dcz.pB)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      dcv $$2 = $$0.a(1, 1);
      if (!$$2.a(dcz.wU)) {
         return dcv.l;
      } else {
         dcv $$3 = new dcv(dcz.wT, 8);
         $$3.b(kq.R, $$2.a(kq.R));
         return $$3;
      }
   }

   @Override
   public dhw<din> a() {
      return dhw.j;
   }
}
