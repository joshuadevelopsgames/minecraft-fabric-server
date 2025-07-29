public class chn extends chi {
   private final cnh a;
   private boolean b;

   public chn(cnh $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      if (!(this.a.U_() instanceof auc $$0)) {
         return false;
      } else {
         boolean $$1 = !$$0.am() && !$$0.gt().b && !$$0.bm() && !$$0.aI;
         return !this.a.gH() && $$1 && this.a.gX();
      }
   }

   @Override
   public boolean W_() {
      return !this.b;
   }

   @Override
   public void d() {
      this.b = false;
   }

   @Override
   public void a() {
      if (!this.b && !this.a.t() && !this.a.R_()) {
         if (this.a.U_() instanceof auc $$0 && this.a.cV().c($$0.cV())) {
            this.b = this.a.b($$0);
         }
      }
   }
}
