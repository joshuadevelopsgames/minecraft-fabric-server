import org.joml.Vector3f;

public class fuv {
   public static Vector3f a(float $$0, float $$1, float $$2) {
      return new Vector3f($$0, -$$1, $$2);
   }

   public static Vector3f b(float $$0, float $$1, float $$2) {
      return new Vector3f($$0 * (float) (Math.PI / 180.0), $$1 * (float) (Math.PI / 180.0), $$2 * (float) (Math.PI / 180.0));
   }

   public static Vector3f a(double $$0, double $$1, double $$2) {
      return new Vector3f((float)($$0 - 1.0), (float)($$1 - 1.0), (float)($$2 - 1.0));
   }
}
