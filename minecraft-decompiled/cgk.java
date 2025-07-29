import java.util.Optional;

public class cgk implements cgh {
   protected final cao a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public cgk(cao $$0) {
      this.a = $$0;
   }

   public void a(fis $$0) {
      this.a($$0.d, $$0.e, $$0.f);
   }

   public void a(bzm $$0) {
      this.a($$0.dC(), $$0.dG(), $$0.dI());
   }

   public void a(bzm $$0, float $$1, float $$2) {
      this.a($$0.dC(), $$0.dG(), $$0.dI(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, this.a.gj(), this.a.gg());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = 2;
   }

   public void a() {
      if (this.c()) {
         this.a.w(0.0F);
      }

      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0 -> this.a.bt = this.a(this.a.bt, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.w(this.a(this.a.dR(), $$0, this.c)));
      } else {
         this.a.bt = this.a(this.a.bt, this.a.br, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.S().l()) {
         this.a.bt = bcb.c(this.a.bt, this.a.br, (float)this.a.gh());
      }
   }

   protected boolean c() {
      return true;
   }

   public boolean d() {
      return this.d > 0;
   }

   public double e() {
      return this.e;
   }

   public double f() {
      return this.f;
   }

   public double g() {
      return this.g;
   }

   protected Optional<Float> h() {
      double $$0 = this.e - this.a.dC();
      double $$1 = this.f - this.a.dG();
      double $$2 = this.g - this.a.dI();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(bcb.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.dC();
      double $$1 = this.g - this.a.dI();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(bcb.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }
}
