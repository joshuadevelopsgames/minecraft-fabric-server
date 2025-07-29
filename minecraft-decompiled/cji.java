import javax.annotation.Nullable;

public abstract class cji extends chi {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   protected final cao e;
   protected final boolean f;
   private final boolean d;
   private int i;
   private int j;
   private int k;
   @Nullable
   protected cam g;
   protected int h = 60;

   public cji(cao $$0, boolean $$1) {
      this($$0, $$1, false);
   }

   public cji(cao $$0, boolean $$1, boolean $$2) {
      this.e = $$0;
      this.f = $$1;
      this.d = $$2;
   }

   @Override
   public boolean c() {
      cam $$0 = this.e.e();
      if ($$0 == null) {
         $$0 = this.g;
      }

      if ($$0 == null) {
         return false;
      } else if (!this.e.c($$0)) {
         return false;
      } else {
         fjz $$1 = this.e.cu();
         fjz $$2 = $$0.cu();
         if ($$1 != null && $$2 == $$1) {
            return false;
         } else {
            double $$3 = this.l();
            if (this.e.g((bzm)$$0) > $$3 * $$3) {
               return false;
            } else {
               if (this.f) {
                  if (this.e.T().a($$0)) {
                     this.k = 0;
                  } else if (++this.k > b(this.h)) {
                     return false;
                  }
               }

               this.e.g($$0);
               return true;
            }
         }
      }
   }

   protected double l() {
      return this.e.i(cbs.n);
   }

   @Override
   public void d() {
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   @Override
   public void e() {
      this.e.g(null);
      this.g = null;
   }

   protected boolean a(@Nullable cam $$0, clc $$1) {
      if ($$0 == null) {
         return false;
      } else if (!$$1.a(a(this.e), this.e, $$0)) {
         return false;
      } else if (!this.e.a($$0.dx())) {
         return false;
      } else {
         if (this.d) {
            if (--this.j <= 0) {
               this.i = 0;
            }

            if (this.i == 0) {
               this.i = this.a($$0) ? 1 : 2;
            }

            if (this.i == 2) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(cam $$0) {
      this.j = b(10 + this.e.ec().a(5));
      faz $$1 = this.e.S().a($$0, 0);
      if ($$1 == null) {
         return false;
      } else {
         fax $$2 = $$1.d();
         if ($$2 == null) {
            return false;
         } else {
            int $$3 = $$2.a - $$0.dB();
            int $$4 = $$2.c - $$0.dH();
            return $$3 * $$3 + $$4 * $$4 <= 2.25;
         }
      }
   }

   public cji c(int $$0) {
      this.h = $$0;
      return this;
   }
}
