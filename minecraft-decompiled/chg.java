import java.util.EnumSet;
import javax.annotation.Nullable;

public class chg extends chi {
   private final cbi a;
   @Nullable
   private cam b;
   private final double c;
   private final cjw d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public chg(cbi $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.S();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
      if (!($$0.S() instanceof cjv) && !($$0.S() instanceof cju)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      cam $$0 = this.a.U_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gK()) {
         return false;
      } else if (this.a.g($$0) < this.g * this.g) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (this.d.l()) {
         return false;
      } else {
         return this.a.gK() ? false : !(this.a.g(this.b) <= this.f * this.f);
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(fbc.j);
      this.a.a(fbc.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.n();
      this.a.a(fbc.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gJ();
      if (!$$0) {
         this.a.P().a(this.b, 10.0F, this.a.gg());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gI();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
