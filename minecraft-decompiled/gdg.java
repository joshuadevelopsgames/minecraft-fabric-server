import javax.annotation.Nullable;

public record gdg(gof b, efp c, int d, int e, int f, int g, float h, @Nullable gcd i, @Nullable gcd j) implements gdj {
   public gdg(gof $$0, efp $$1, int $$2, int $$3, int $$4, int $$5, float $$6, @Nullable gcd $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, gdj.a($$2, $$3, $$4, $$5, $$7));
   }

   @Override
   public int e() {
      return this.d;
   }

   @Override
   public int f() {
      return this.e;
   }

   @Override
   public int g() {
      return this.f;
   }

   @Override
   public int h() {
      return this.g;
   }

   @Override
   public float a() {
      return this.h;
   }

   @Nullable
   @Override
   public gcd n() {
      return this.j;
   }
}
