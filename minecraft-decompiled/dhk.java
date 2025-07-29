import java.util.Map;

public class dhk extends dia {
   public dhk(dgz $$0) {
      super("", $$0, dib.a(Map.of('#', dhi.a(dcz.rV), 'x', dhi.a(dcz.tt)), "###", "#x#", "###"), new dcv(dcz.vL));
   }

   @Override
   public boolean a(dha $$0, dmu $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         dcv $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            fcg $$3 = ddi.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public dcv a(dha $$0, jn.a $$1) {
      dcv $$2 = c($$0).c(1);
      $$2.b(kq.O, dfs.b);
      return $$2;
   }

   private static dcv c(dha $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         dcv $$2 = $$0.a($$1);
         if ($$2.c(kq.M)) {
            return $$2;
         }
      }

      return dcv.l;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dhw<dhk> a() {
      return dhw.f;
   }
}
