import com.google.common.primitives.Floats;
import it.unimi.dsi.fastutil.ints.IntArrays;
import org.joml.Vector3f;

public interface foi {
   foi a = a(0.0F, 0.0F, 0.0F);
   foi b = a((foi.a)($$0 -> -$$0.z()));

   static foi a(float $$0, float $$1, float $$2) {
      return a(new Vector3f($$0, $$1, $$2));
   }

   static foi a(Vector3f $$0) {
      return a($$0::distanceSquared);
   }

   static foi a(foi.a $$0) {
      return $$1 -> {
         float[] $$2 = new float[$$1.length];
         int[] $$3 = new int[$$1.length];

         for (int $$4 = 0; $$4 < $$1.length; $$3[$$4] = $$4++) {
            $$2[$$4] = $$0.apply($$1[$$4]);
         }

         IntArrays.mergeSort($$3, ($$1x, $$2x) -> Floats.compare($$2[$$2x], $$2[$$1x]));
         return $$3;
      };
   }

   int[] sort(Vector3f[] var1);

   public interface a {
      float apply(Vector3f var1);
   }
}
