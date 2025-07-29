import java.util.List;
import javax.annotation.Nullable;

public record gdf(List<btv> b, int c, int d, int e, int f, @Nullable gcd g, @Nullable gcd h) implements gdj {
   public gdf(List<btv> $$0, int $$1, int $$2, int $$3, int $$4, @Nullable gcd $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, gdj.a($$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public float a() {
      return 1.0F;
   }

   @Override
   public int e() {
      return this.c;
   }

   @Override
   public int f() {
      return this.d;
   }

   @Override
   public int g() {
      return this.e;
   }

   @Override
   public int h() {
      return this.f;
   }

   @Nullable
   @Override
   public gcd i() {
      return this.g;
   }

   @Nullable
   @Override
   public gcd n() {
      return this.h;
   }
}
