import java.util.ArrayList;
import java.util.List;

public class dhf extends dhc {
   private static final dhi d = dhi.a(dcz.rV);
   private static final dhi e = dhi.a(dcz.qz);
   private static final dhi f = dhi.a(dcz.vX);

   public dhf(dgz $$0) {
      super($$0);
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dcv $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (d.a($$5)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else if (e.a($$5)) {
                  if (++$$3 > 3) {
                     return false;
                  }
               } else if (!f.a($$5)) {
                  return false;
               }
            }
         }

         return $$2 && $$3 >= 1;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      List<dfj> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dcv $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (e.a($$5)) {
               $$3++;
            } else if (f.a($$5)) {
               dfj $$6 = $$5.a(kq.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      dcv $$7 = new dcv(dcz.vW, 3);
      $$7.b(kq.aj, new dfk($$3, $$2));
      return $$7;
   }

   @Override
   public dhw<dhf> a() {
      return dhw.g;
   }
}
