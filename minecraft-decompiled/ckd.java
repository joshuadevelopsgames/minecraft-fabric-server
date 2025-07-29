public class ckd extends ckp {
   public static final float a = 8.0F;

   @Override
   protected boolean a(aub $$0, cam $$1, cam $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && ckv.c($$0, $$1, $$2);
   }

   private boolean a(cam $$0, cam $$1) {
      return !$$0.eh().a(cjo.V) && $$1.ap().a(azs.j);
   }

   private boolean b(cam $$0) {
      return $$0.ap().a(azs.i);
   }

   private boolean b(cam $$0, cam $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cjo<cam> b() {
      return cjo.C;
   }
}
