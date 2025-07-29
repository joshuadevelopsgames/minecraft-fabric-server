import java.util.EnumSet;

public class cim extends chi {
   private final coq a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public cim(coq $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.gY() && this.a.cd()) {
         fis $$0 = clg.a(this.a, 5, 4);
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.d;
            this.d = $$0.e;
            this.e = $$0.f;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.a.S().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean c() {
      return !this.a.gY() && !this.a.S().l() && this.a.cd();
   }

   @Override
   public void a() {
      if (!this.a.gY() && this.a.ec().a(this.a(50)) == 0) {
         bzm $$0 = this.a.db();
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof cut $$1) {
            int $$2 = this.a.hd();
            int $$3 = this.a.hi();
            if ($$3 > 0 && this.a.ec().a($$3) < $$2) {
               this.a.i($$1);
               return;
            }

            this.a.u(5);
         }

         this.a.bR();
         this.a.hn();
         this.a.ai().a(this.a, (byte)6);
      }
   }
}
