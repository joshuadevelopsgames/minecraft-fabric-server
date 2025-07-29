import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dhg extends dhc {
   private static final dhi d = dhi.a(dcz.vX);

   public dhg(dgz $$0) {
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
               if ($$5.h() instanceof dbu) {
                  $$2 = true;
               } else {
                  if (!d.a($$5)) {
                     return false;
                  }

                  if ($$3) {
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
      IntList $$2 = new IntArrayList();
      dcv $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dcv $$5 = $$0.a($$4);
         if ($$5.h() instanceof dbu $$7) {
            $$2.add($$7.a().f());
         } else if (d.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kq.ai, dfj.a, $$2, dfj::a);
         return $$3;
      } else {
         return dcv.l;
      }
   }

   @Override
   public dhw<dhg> a() {
      return dhw.i;
   }
}
