import java.util.EnumSet;

public class chs extends chi {
   protected final cau a;
   private final double b;
   private final boolean c;
   private faz d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public chs(cau $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      long $$0 = this.a.ai().ae();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         cam $$1 = this.a.e();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bO()) {
            return false;
         } else {
            this.d = this.a.S().a($$1, 0);
            return this.d != null ? true : this.a.h($$1);
         }
      }
   }

   @Override
   public boolean c() {
      cam $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bO()) {
         return false;
      } else if (!this.c) {
         return !this.a.S().l();
      } else {
         return !this.a.a($$0.dx()) ? false : !($$0 instanceof cut $$1 && ($$1.am() || $$1.gI()));
      }
   }

   @Override
   public void d() {
      this.a.S().a(this.d, this.b);
      this.a.w(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void e() {
      cam $$0 = this.a.e();
      if (!bzt.e.test($$0)) {
         this.a.g(null);
      }

      this.a.w(false);
      this.a.S().n();
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      cam $$0 = this.a.e();
      if ($$0 != null) {
         this.a.P().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.T().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.h(this.e, this.f, this.g) >= 1.0 || this.a.ec().i() < 0.05F)) {
            this.e = $$0.dC();
            this.f = $$0.dE();
            this.g = $$0.dI();
            this.h = 4 + this.a.ec().a(7);
            double $$1 = this.a.g((bzm)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.S().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(cam $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bxi.a);
         this.a.c(a(this.a), $$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(cam $$0) {
      return this.i() && this.a.h($$0) && this.a.T().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
