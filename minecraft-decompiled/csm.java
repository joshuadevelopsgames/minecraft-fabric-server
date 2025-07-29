import javax.annotation.Nullable;

public class csm extends crd {
   public csm(bzv<? extends csm> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.i, 8.0F);
   }

   @Override
   protected void H() {
      this.ci.a(3, new cjb<>(this, cth.class, true));
      super.H();
   }

   @Override
   protected ayy p() {
      return ayz.Eg;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Ei;
   }

   @Override
   protected ayy f_() {
      return ayz.Eh;
   }

   @Override
   ayy m() {
      return ayz.Ej;
   }

   @Override
   public bae<dcr> ad() {
      return null;
   }

   @Override
   public boolean g(dcv $$0) {
      return !$$0.a(azx.cb) && super.g($$0);
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof crh $$4 && $$4.gI()) {
         $$4.gJ();
         this.a($$0, dcz.vO);
      }
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      this.a(bzw.a, new dcv(dcz.pW));
   }

   @Override
   protected void a(dnl $$0, bck $$1, bxh $$2) {
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cbe $$4 = super.a($$0, $$1, $$2, $$3);
      this.h(cbs.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof cam) {
            ((cam)$$1).b(new byq(bys.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cvb a(dcv $$0, float $$1, @Nullable dcv $$2) {
      cvb $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(byq $$0) {
      return $$0.a(bys.t) ? false : super.b($$0);
   }
}
