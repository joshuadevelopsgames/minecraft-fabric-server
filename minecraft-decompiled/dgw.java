public class dgw extends dhc {
   public dgw(dgz $$0) {
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
               if ($$5.c(kq.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(azx.bW)) {
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
            if ($$5.c(kq.V)) {
               if (!$$3.f()) {
                  return dcv.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(azx.bW)) {
                  return dcv.l;
               }

               $$2++;
            }
         }
      }

      dgf $$6 = $$3.a(kq.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dgf $$7 = $$6.b();
         if ($$7 == null) {
            return dcv.l;
         } else {
            dcv $$8 = $$3.c($$2);
            $$8.b(kq.V, $$7);
            return $$8;
         }
      } else {
         return dcv.l;
      }
   }

   @Override
   public ju<dcv> a(dha $$0) {
      ju<dcv> $$1 = ju.a($$0.a(), dcv.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         dcv $$3 = $$0.a($$2);
         dcv $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kq.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dhw<dgw> a() {
      return dhw.d;
   }
}
