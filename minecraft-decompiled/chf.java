import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chf extends chi {
   private final cao a;
   private final Predicate<cao> b;
   @Nullable
   private cao c;
   private final double d;
   private final cjw e;
   private int f;
   private final float g;
   private float h;
   private final float i;

   public chf(cao $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.b = $$1x -> $$1x != null && $$0.getClass() != $$1x.getClass();
      this.d = $$1;
      this.e = $$0.S();
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
      if (!($$0.S() instanceof cjv) && !($$0.S() instanceof cju)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean b() {
      List<cao> $$0 = this.a.ai().a(cao.class, this.a.cV().g(this.i), this.b);
      if (!$$0.isEmpty()) {
         for (cao $$1 : $$0) {
            if (!$$1.cs()) {
               this.c = $$1;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean c() {
      return this.c != null && !this.e.l() && this.a.g(this.c) > this.g * this.g;
   }

   @Override
   public void d() {
      this.f = 0;
      this.h = this.a.a(fbc.j);
      this.a.a(fbc.j, 0.0F);
   }

   @Override
   public void e() {
      this.c = null;
      this.e.n();
      this.a.a(fbc.j, this.h);
   }

   @Override
   public void a() {
      if (this.c != null && !this.a.R_()) {
         this.a.P().a(this.c, 10.0F, this.a.gg());
         if (--this.f <= 0) {
            this.f = this.a(10);
            double $$0 = this.a.dC() - this.c.dC();
            double $$1 = this.a.dE() - this.c.dE();
            double $$2 = this.a.dI() - this.c.dI();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if (!($$3 <= this.g * this.g)) {
               this.e.a(this.c, this.d);
            } else {
               this.e.n();
               cgk $$4 = this.c.P();
               if ($$3 <= this.g || $$4.e() == this.a.dC() && $$4.f() == this.a.dE() && $$4.g() == this.a.dI()) {
                  double $$5 = this.c.dC() - this.a.dC();
                  double $$6 = this.c.dI() - this.a.dI();
                  this.e.a(this.a.dC() - $$5, this.a.dE(), this.a.dI() - $$6, this.d);
               }
            }
         }
      }
   }
}
