import javax.annotation.Nullable;

public class hkl extends hkn {
   public float a;
   public float b;
   public boolean c;
   @Nullable
   public fis d;
   public boolean e;
   public boolean f;
   public double g;
   public float h;
   public final cpq i = new cpq();

   public cpq.a a(int $$0) {
      return this.i.a($$0, this.h);
   }

   public float a(int $$0, cpq.a $$1, cpq.a $$2) {
      double $$3;
      if (this.e) {
         $$3 = $$0 / Math.max(this.g / 4.0, 1.0);
      } else if (this.f) {
         $$3 = $$0;
      } else if ($$0 == 6) {
         $$3 = 0.0;
      } else {
         $$3 = $$2.a() - $$1.a();
      }

      return (float)$$3;
   }
}
