import java.util.List;

public class ddf extends dcr {
   public ddf(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      if ($$3.a(azo.R)) {
         cut $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bxj.e;
   }

   public static bxj a(cut $$0, dmu $$1, jb $$2) {
      cqt $$3 = null;
      List<cak> $$4 = cak.a($$1, fis.b($$2), $$1x -> $$1x.aj_() == $$0);
      boolean $$5 = false;

      for (cak $$6 : $$4) {
         if ($$3 == null) {
            $$3 = cqt.b($$1, $$2);
            $$3.l();
         }

         if ($$6.b_($$3)) {
            $$6.a_($$3, true);
            $$5 = true;
         }
      }

      if ($$5) {
         $$1.a(ejb.b, $$2, ejb.a.a($$0));
         return bxj.b;
      } else {
         return bxj.e;
      }
   }
}
