public class crs extends cso {
   public crs(bzv<? extends crs> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public static boolean a(bzv<crs> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bzu.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean af_() {
      return false;
   }

   @Override
   protected ayy p() {
      return ayz.nX;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.oa;
   }

   @Override
   protected ayy f_() {
      return ayz.nZ;
   }

   @Override
   protected ayy n() {
      return ayz.ob;
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fh().f() && $$1 instanceof cam) {
         float $$3 = this.ai().d_(this.dx()).b();
         ((cam)$$1).b(new byq(bys.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gI() {
      return true;
   }

   @Override
   protected void ae_() {
      this.b(bzv.bQ);
      if (!this.be()) {
         this.ai().a(null, 1041, this.dx(), 0);
      }
   }

   @Override
   protected dcv gH() {
      return dcv.l;
   }
}
