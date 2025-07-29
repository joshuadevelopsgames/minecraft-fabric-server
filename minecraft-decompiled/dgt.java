import java.util.ArrayList;
import java.util.List;

public class dgt extends dhc {
   public dgt(dgz $$0) {
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
               if ($$5.a(azx.bT)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof dbu)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      List<dbu> $$2 = new ArrayList<>();
      dcv $$3 = dcv.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dcv $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(azx.bT)) {
               if (!$$3.f()) {
                  return dcv.l;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof dbu $$6)) {
                  return dcv.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dfi.a($$3, $$2) : dcv.l;
   }

   @Override
   public dhw<dgt> a() {
      return dhw.c;
   }
}
