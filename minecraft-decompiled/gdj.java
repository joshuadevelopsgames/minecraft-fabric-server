import javax.annotation.Nullable;
import org.joml.Matrix3x2f;

public interface gdj extends gda {
   Matrix3x2f a = new Matrix3x2f();

   int e();

   int g();

   int f();

   int h();

   float a();

   default Matrix3x2f aU_() {
      return a;
   }

   @Nullable
   gcd i();

   @Nullable
   static gcd a(int $$0, int $$1, int $$2, int $$3, @Nullable gcd $$4) {
      gcd $$5 = new gcd($$0, $$1, $$2 - $$0, $$3 - $$1);
      return $$4 != null ? $$4.b($$5) : $$5;
   }
}
