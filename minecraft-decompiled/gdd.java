import javax.annotation.Nullable;

public record gdd(gmm b, ame c, float d, float e, int f, int g, int h, int i, float j, @Nullable gcd k, @Nullable gcd l) implements gdj {
   public gdd(gmm $$0, ame $$1, float $$2, float $$3, int $$4, int $$5, int $$6, int $$7, float $$8, @Nullable gcd $$9) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, gdj.a($$4, $$5, $$6, $$7, $$9));
   }

   public float j() {
      return this.e;
   }

   @Override
   public int e() {
      return this.f;
   }

   @Override
   public int f() {
      return this.g;
   }

   @Override
   public int g() {
      return this.h;
   }

   @Override
   public int h() {
      return this.i;
   }

   @Override
   public float a() {
      return this.j;
   }

   @Nullable
   @Override
   public gcd i() {
      return this.k;
   }

   @Nullable
   @Override
   public gcd n() {
      return this.l;
   }
}
