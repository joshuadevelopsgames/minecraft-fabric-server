import java.util.EnumSet;
import javax.annotation.Nullable;

public class cip extends chi {
   private final crh a;
   @Nullable
   private cam b;

   public cip(crh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      cam $$0 = this.a.e();
      return this.a.n() > 0 || $$0 != null && this.a.g($$0) < 9.0;
   }

   @Override
   public void d() {
      this.a.S().n();
      this.b = this.a.e();
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      if (this.b == null) {
         this.a.b(-1);
      } else if (this.a.g(this.b) > 49.0) {
         this.a.b(-1);
      } else if (!this.a.T().a(this.b)) {
         this.a.b(-1);
      } else {
         this.a.b(1);
      }
   }
}
