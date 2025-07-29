import javax.annotation.Nullable;
import org.joml.Matrix3x2f;

public final class gcx implements gda {
   private final String a;
   private final Matrix3x2f b;
   private final hon c;
   private final int d;
   private final int e;
   @Nullable
   private final gcd f;
   @Nullable
   private final gcd g;
   @Nullable
   private final gcd h;

   public gcx(String $$0, Matrix3x2f $$1, hon $$2, int $$3, int $$4, @Nullable gcd $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = this.c().h() ? this.h() : null;
      this.h = this.a(this.g != null ? this.g : new gcd(this.d, this.e, 16, 16));
   }

   @Nullable
   private gcd h() {
      fin $$0 = this.c.g();
      int $$1 = bcb.c($$0.b() * 16.0);
      int $$2 = bcb.c($$0.c() * 16.0);
      if ($$1 <= 16 && $$2 <= 16) {
         return null;
      } else {
         float $$3 = (float)($$0.a * 16.0);
         float $$4 = (float)($$0.e * 16.0);
         int $$5 = bcb.d($$3);
         int $$6 = bcb.d($$4);
         int $$7 = this.d + $$5 + 8;
         int $$8 = this.e - $$6 + 8;
         return new gcd($$7, $$8, $$1, $$2);
      }
   }

   @Nullable
   private gcd a(gcd $$0) {
      gcd $$1 = $$0.b(this.b);
      return this.f != null ? this.f.b($$1) : $$1;
   }

   public String a() {
      return this.a;
   }

   public Matrix3x2f b() {
      return this.b;
   }

   public hon c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   @Nullable
   public gcd f() {
      return this.f;
   }

   @Nullable
   public gcd g() {
      return this.g;
   }

   @Nullable
   @Override
   public gcd n() {
      return this.h;
   }
}
