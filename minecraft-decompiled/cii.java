import java.util.EnumSet;

public class cii<T extends crv & crz> extends chi {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public cii(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean b() {
      return this.a.e() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(dcz.pA);
   }

   @Override
   public boolean c() {
      return (this.b() || !this.a.S().l()) && this.h();
   }

   @Override
   public void d() {
      super.d();
      this.a.w(true);
   }

   @Override
   public void e() {
      super.e();
      this.a.w(false);
      this.f = 0;
      this.e = -1;
      this.a.fM();
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      cam $$0 = this.a.e();
      if ($$0 != null) {
         double $$1 = this.a.h($$0.dC(), $$0.dE(), $$0.dI());
         boolean $$2 = this.a.T().a($$0);
         boolean $$3 = this.f > 0;
         if ($$2 != $$3) {
            this.f = 0;
         }

         if ($$2) {
            this.f++;
         } else {
            this.f--;
         }

         if (!($$1 > this.d) && this.f >= 20) {
            this.a.S().n();
            this.i++;
         } else {
            this.a.S().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if (this.a.ec().i() < 0.3) {
               this.g = !this.g;
            }

            if (this.a.ec().i() < 0.3) {
               this.h = !this.h;
            }

            this.i = 0;
         }

         if (this.i > -1) {
            if ($$1 > this.d * 0.75F) {
               this.h = false;
            } else if ($$1 < this.d * 0.25F) {
               this.h = true;
            }

            this.a.Q().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            if (this.a.dn() instanceof cao $$4) {
               $$4.a($$0, 30.0F, 30.0F);
            }

            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.P().a($$0, 30.0F, 30.0F);
         }

         if (this.a.fG()) {
            if (!$$2 && this.f < -60) {
               this.a.fM();
            } else if ($$2) {
               int $$5 = this.a.fK();
               if ($$5 >= 20) {
                  this.a.fM();
                  this.a.a($$0, dbh.a($$5));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(cvq.a(this.a, dcz.pA));
         }
      }
   }
}
