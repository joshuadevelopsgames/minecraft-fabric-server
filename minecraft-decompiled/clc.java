import javax.annotation.Nullable;

public class clc {
   public static final clc a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private clc.a g;

   private clc(boolean $$0) {
      this.c = $$0;
   }

   public static clc a() {
      return new clc(true);
   }

   public static clc b() {
      return new clc(false);
   }

   public clc c() {
      clc $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public clc a(double $$0) {
      this.d = $$0;
      return this;
   }

   public clc d() {
      this.e = false;
      return this;
   }

   public clc e() {
      this.f = false;
      return this;
   }

   public clc a(@Nullable clc.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(aub $$0, @Nullable cam $$1, cam $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.eF()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.eE() || $$0.an() == bxg.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.ap()) || $$1.t($$2))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$3 = this.f ? $$2.D($$1) : 1.0;
               double $$4 = Math.max(this.d * $$3, 2.0);
               double $$5 = $$1.h($$2.dC(), $$2.dE(), $$2.dI());
               if ($$5 > $$4 * $$4) {
                  return false;
               }
            }

            if (this.e && $$1 instanceof cao $$6 && !$$6.T().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(cam var1, aub var2);
   }
}
