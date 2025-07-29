import java.util.EnumSet;
import java.util.List;

public class chp extends chi {
   public final cot a;
   private double b;
   private static final int c = 8;
   private int d;

   public chp(cot $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.R_() && !this.a.hr()) {
         List<bzm> $$0 = this.a.ai().a(this.a, this.a.cV().c(9.0, 4.0, 9.0), $$0x -> {
            bzv<?> $$1x = $$0x.ap();
            return $$1x == bzv.az || $$1x == bzv.bA;
         });
         cot $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bzm $$3 : $$0) {
            cot $$4 = (cot)$$3;
            if ($$4.hr() && !$$4.gX()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bzm $$6 : $$0) {
               cot $$7 = (cot)$$6;
               if ($$7.R_() && !$$7.gX()) {
                  double $$8 = this.a.g($$7);
                  if (!($$8 > $$2)) {
                     $$2 = $$8;
                     $$1 = $$7;
                  }
               }
            }
         }

         if ($$1 == null) {
            return false;
         } else if ($$2 < 4.0) {
            return false;
         } else if (!$$1.R_() && !this.a($$1, 1)) {
            return false;
         } else {
            this.a.a($$1);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean c() {
      if (this.a.hr() && this.a.hs().bO() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.hs());
         if ($$0 > 676.0) {
            if (this.b <= 3.0) {
               this.b *= 1.2;
               this.d = b(40);
               return true;
            }

            if (this.d == 0) {
               return false;
            }
         }

         if (this.d > 0) {
            this.d--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void e() {
      this.a.gW();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.hr()) {
         if (!(this.a.aj_() instanceof cqt)) {
            cot $$0 = this.a.hs();
            double $$1 = this.a.f($$0);
            float $$2 = 2.0F;
            fis $$3 = new fis($$0.dC() - this.a.dC(), $$0.dE() - this.a.dE(), $$0.dI() - this.a.dI()).d().c(Math.max($$1 - 2.0, 0.0));
            this.a.S().a(this.a.dC() + $$3.d, this.a.dE() + $$3.e, this.a.dI() + $$3.f, this.b);
         }
      }
   }

   private boolean a(cot $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.hr()) {
         return $$0.hs().R_() ? true : this.a($$0.hs(), ++$$1);
      } else {
         return false;
      }
   }
}
