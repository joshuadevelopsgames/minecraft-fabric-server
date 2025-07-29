import javax.annotation.Nullable;

public record gdh(gop b, ame c, float d, float e, float f, int g, int h, int i, int j, float k, @Nullable gcd l, @Nullable gcd m) implements gdj {
   public gdh(gop $$0, ame $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8, float $$9, @Nullable gcd $$10) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, gdj.a($$5, $$6, $$7, $$8, $$10));
   }

   public float j() {
      return this.e;
   }

   public float k() {
      return this.f;
   }

   @Override
   public int e() {
      return this.g;
   }

   @Override
   public int f() {
      return this.h;
   }

   @Override
   public int g() {
      return this.i;
   }

   @Override
   public int h() {
      return this.j;
   }

   @Override
   public float a() {
      return this.k;
   }

   @Nullable
   @Override
   public gcd i() {
      return this.l;
   }

   @Nullable
   @Override
   public gcd n() {
      return this.m;
   }
}
