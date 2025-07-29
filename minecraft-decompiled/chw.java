import java.util.EnumSet;

public class chw extends chi {
   private final cau a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public chw(cau $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.gr()) {
         return false;
      } else {
         fis $$0 = clg.a(this.a, 16, 7, fis.c(this.a.gs()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.d;
            this.c = $$0.e;
            this.d = $$0.f;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.S().l();
   }

   @Override
   public void d() {
      this.a.S().a(this.b, this.c, this.d, this.e);
   }
}
