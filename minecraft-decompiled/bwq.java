import java.util.Arrays;

public class bwq implements bwr {
   private final bwr[] a;

   public bwq(bwr... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(bck $$0) {
      float $$1 = 1.0F;

      for (bwr $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
