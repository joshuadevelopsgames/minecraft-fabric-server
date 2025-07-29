import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bwk extends bwm {
   public static final bwk a = new bwk(0.0F);
   public static final MapCodec<bwk> b = Codec.FLOAT.fieldOf("value").xmap(bwk::a, bwk::d);
   private final float d;

   public static bwk a(float $$0) {
      return $$0 == 0.0F ? a : new bwk($$0);
   }

   private bwk(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(bck $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public bwn<?> c() {
      return bwn.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
