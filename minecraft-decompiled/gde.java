import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public record gde(hkn b, Vector3f c, Quaternionf d, @Nullable Quaternionf e, int f, int g, int h, int i, float j, @Nullable gcd k, @Nullable gcd l)
   implements gdj {
   public gde(hkn $$0, Vector3f $$1, Quaternionf $$2, @Nullable Quaternionf $$3, int $$4, int $$5, int $$6, int $$7, float $$8, @Nullable gcd $$9) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, gdj.a($$4, $$5, $$6, $$7, $$9));
   }

   @Nullable
   public Quaternionf j() {
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
