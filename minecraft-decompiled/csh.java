import javax.annotation.Nullable;

public class csh extends crd {
   public csh(bzv<? extends csh> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public static boolean a(bzv<csh> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      jb $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dqb.ry));

      return b($$0, $$1, $$2, $$3, $$4) && (bzu.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected ayy p() {
      return ayz.AP;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.AR;
   }

   @Override
   protected ayy f_() {
      return ayz.AQ;
   }

   @Override
   ayy m() {
      return ayz.AS;
   }

   @Override
   protected cvb a(dcv $$0, float $$1, @Nullable dcv $$2) {
      cvb $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cve) {
         ((cve)$$3).a(new byq(bys.b, 600));
      }

      return $$3;
   }
}
