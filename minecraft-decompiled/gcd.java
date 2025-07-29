import javax.annotation.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Vector2f;

public record gcd(gcc a, int b, int c) {
   private static final gcd d = new gcd(0, 0, 0, 0);

   public gcd(int $$0, int $$1, int $$2, int $$3) {
      this(new gcc($$0, $$1), $$2, $$3);
   }

   public static gcd a() {
      return d;
   }

   public static gcd a(gca $$0, int $$1, int $$2, int $$3, int $$4) {
      return switch ($$0) {
         case a -> new gcd($$1, $$2, $$3, $$4);
         case b -> new gcd($$2, $$1, $$4, $$3);
      };
   }

   public gcd a(gcb $$0) {
      return new gcd(this.a.a($$0), this.b, this.c);
   }

   public int a(gca $$0) {
      return switch ($$0) {
         case a -> this.b;
         case b -> this.c;
      };
   }

   public int b(gcb $$0) {
      gca $$1 = $$0.a();
      return $$0.c() ? this.a.a($$1) + this.a($$1) - 1 : this.a.a($$1);
   }

   public gcd c(gcb $$0) {
      int $$1 = this.b($$0);
      gca $$2 = $$0.a().a();
      int $$3 = this.b($$2.c());
      int $$4 = this.a($$2);
      return a($$0.a(), $$1, $$3, 1, $$4).a($$0);
   }

   public boolean a(gcd $$0) {
      return this.a($$0, gca.a) && this.a($$0, gca.b);
   }

   public boolean a(gcd $$0, gca $$1) {
      int $$2 = this.b($$1.c());
      int $$3 = $$0.b($$1.c());
      int $$4 = this.b($$1.b());
      int $$5 = $$0.b($$1.b());
      return Math.max($$2, $$3) <= Math.min($$4, $$5);
   }

   public int b(gca $$0) {
      return (this.b($$0.b()) + this.b($$0.c())) / 2;
   }

   @Nullable
   public gcd b(gcd $$0) {
      int $$1 = Math.max(this.d(), $$0.d());
      int $$2 = Math.max(this.b(), $$0.b());
      int $$3 = Math.min(this.e(), $$0.e());
      int $$4 = Math.min(this.c(), $$0.c());
      return $$1 < $$3 && $$2 < $$4 ? new gcd($$1, $$2, $$3 - $$1, $$4 - $$2) : null;
   }

   public boolean c(gcd $$0) {
      return this.d() < $$0.e() && this.e() > $$0.d() && this.b() < $$0.c() && this.c() > $$0.b();
   }

   public boolean d(gcd $$0) {
      return $$0.d() >= this.d() && $$0.b() >= this.b() && $$0.e() <= this.e() && $$0.c() <= this.c();
   }

   public int b() {
      return this.a.b();
   }

   public int c() {
      return this.a.b() + this.c;
   }

   public int d() {
      return this.a.a();
   }

   public int e() {
      return this.a.a() + this.b;
   }

   public boolean a(int $$0, int $$1) {
      return $$0 >= this.d() && $$0 < this.e() && $$1 >= this.b() && $$1 < this.c();
   }

   public gcd a(Matrix3x2f $$0) {
      Vector2f $$1 = $$0.transformPosition(this.d(), this.b(), new Vector2f());
      Vector2f $$2 = $$0.transformPosition(this.e(), this.c(), new Vector2f());
      return new gcd(bcb.d($$1.x), bcb.d($$1.y), bcb.d($$2.x - $$1.x), bcb.d($$2.y - $$1.y));
   }

   public gcd b(Matrix3x2f $$0) {
      Vector2f $$1 = $$0.transformPosition(this.d(), this.b(), new Vector2f());
      Vector2f $$2 = $$0.transformPosition(this.e(), this.b(), new Vector2f());
      Vector2f $$3 = $$0.transformPosition(this.d(), this.c(), new Vector2f());
      Vector2f $$4 = $$0.transformPosition(this.e(), this.c(), new Vector2f());
      float $$5 = Math.min(Math.min($$1.x(), $$3.x()), Math.min($$2.x(), $$4.x()));
      float $$6 = Math.max(Math.max($$1.x(), $$3.x()), Math.max($$2.x(), $$4.x()));
      float $$7 = Math.min(Math.min($$1.y(), $$3.y()), Math.min($$2.y(), $$4.y()));
      float $$8 = Math.max(Math.max($$1.y(), $$3.y()), Math.max($$2.y(), $$4.y()));
      return new gcd(bcb.d($$5), bcb.d($$7), bcb.f($$6 - $$5), bcb.f($$8 - $$7));
   }

   public gcc f() {
      return this.a;
   }

   public int g() {
      return this.b;
   }

   public int h() {
      return this.c;
   }
}
