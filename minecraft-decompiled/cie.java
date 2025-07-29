public class cie extends chi {
   private final coq a;
   private int b;

   public cie(coq $$0) {
      this.a = $$0;
      this.a($$0);
   }

   @Override
   public void d() {
      this.a.hm();
      this.h();
   }

   private void h() {
      ayy $$0 = this.a.hl();
      if ($$0 != null) {
         this.a.a($$0);
      }
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public boolean b() {
      this.b++;
      if (this.b > 0 && this.a.ec().a(1000) < this.b) {
         this.a(this.a);
         return !this.a.fm() && this.a.ec().a(10) == 0;
      } else {
         return false;
      }
   }

   private void a(coq $$0) {
      this.b = -$$0.hq();
   }

   @Override
   public boolean X_() {
      return true;
   }
}
