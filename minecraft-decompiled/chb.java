import java.util.EnumSet;
import javax.annotation.Nullable;

public class chb extends chi {
   protected final cau a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dmu f;

   public chb(cau $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.ai();
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.e() != null) {
         return false;
      } else if (!this.f.W()) {
         return false;
      } else if (!this.a.cb()) {
         return false;
      } else if (!this.f.h(this.a.dx())) {
         return false;
      } else {
         return !this.a.a(bzw.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      fis $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.d;
         this.c = $$0.e;
         this.d = $$0.f;
         return true;
      }
   }

   @Override
   public boolean c() {
      return !this.a.S().l();
   }

   @Override
   public void d() {
      this.a.S().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected fis i() {
      bck $$0 = this.a.ec();
      jb $$1 = this.a.dx();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jb $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return fis.c($$3);
         }
      }

      return null;
   }
}
