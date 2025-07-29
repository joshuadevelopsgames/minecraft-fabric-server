import javax.annotation.Nullable;
import org.joml.Matrix3x2f;

public record gdi(gcx b, int c, int d, int e, int f) implements gdj {
   @Override
   public float a() {
      return 16.0F;
   }

   @Override
   public Matrix3x2f aU_() {
      return this.b.b();
   }

   @Nullable
   @Override
   public gcd i() {
      return this.b.f();
   }

   @Nullable
   @Override
   public gcd n() {
      return this.b.n();
   }

   public gcx c() {
      return this.b;
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
}
