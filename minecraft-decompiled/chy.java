import java.util.EnumSet;

public class chy extends chi {
   private final cao a;
   private cam b;
   private int c;

   public chy(cao $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      cam $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (!this.b.bO()) {
         return false;
      } else {
         return this.a.g((bzm)this.b) > 225.0 ? false : !this.a.S().l() || this.b();
      }
   }

   @Override
   public void e() {
      this.b = null;
      this.a.S().n();
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      this.a.P().a(this.b, 30.0F, 30.0F);
      double $$0 = this.a.ds() * 2.0F * (this.a.ds() * 2.0F);
      double $$1 = this.a.h(this.b.dC(), this.b.dE(), this.b.dI());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.S().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.c(a(this.a), this.b);
         }
      }
   }
}
