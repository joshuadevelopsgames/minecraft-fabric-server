import java.util.EnumSet;

public class cij<T extends crv & crz & cri> extends chi {
   public static final bwu a = bdg.a(1, 2);
   private final T b;
   private cij.a c = cij.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cij(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(dcz.xA);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.S().l()) && this.h();
   }

   private boolean i() {
      return this.b.e() != null && this.b.e().bO();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.g(null);
      this.f = 0;
      if (this.b.fG()) {
         this.b.fM();
         this.b.b(false);
         this.b.fI().b(kq.P, dez.a);
      }
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      cam $$0 = this.b.e();
      if ($$0 != null) {
         boolean $$1 = this.b.T().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bzm)$$0);
         boolean $$4 = ($$3 > this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.S().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ec());
            }
         } else {
            this.h = 0;
            this.b.S().n();
         }

         this.b.P().a($$0, 30.0F, 30.0F);
         if (this.c == cij.a.a) {
            if (!$$4) {
               this.b.c(cvq.a(this.b, dcz.xA));
               this.c = cij.a.b;
               this.b.b(true);
            }
         } else if (this.c == cij.a.b) {
            if (!this.b.fG()) {
               this.c = cij.a.a;
            }

            int $$5 = this.b.fK();
            dcv $$6 = this.b.fI();
            if ($$5 >= dbo.b($$6, this.b)) {
               this.b.fL();
               this.c = cij.a.c;
               this.g = 20 + this.b.ec().a(20);
               this.b.b(false);
            }
         } else if (this.c == cij.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cij.a.d;
            }
         } else if (this.c == cij.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cij.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cij.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
