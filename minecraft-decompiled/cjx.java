import javax.annotation.Nullable;

public class cjx extends cjv {
   @Nullable
   private jb p;

   public cjx(cao $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public faz a(jb $$0, int $$1) {
      this.p = $$0;
      return super.a($$0, $$1);
   }

   @Override
   public faz a(bzm $$0, int $$1) {
      this.p = $$0.dx();
      return super.a($$0, $$1);
   }

   @Override
   public boolean a(bzm $$0, double $$1) {
      faz $$2 = this.a($$0, 0);
      if ($$2 != null) {
         return this.a($$2, $$1);
      } else {
         this.p = $$0.dx();
         this.d = $$1;
         return true;
      }
   }

   @Override
   public void d() {
      if (!this.l()) {
         super.d();
      } else {
         if (this.p != null) {
            if (!this.p.a(this.a.dv(), this.a.ds())
               && (!(this.a.dE() > this.p.v()) || !jb.a((double)this.p.u(), this.a.dE(), (double)this.p.w()).a(this.a.dv(), this.a.ds()))) {
               this.a.Q().a(this.p.u(), this.p.v(), this.p.w(), this.d);
            } else {
               this.p = null;
            }
         }
      }
   }
}
