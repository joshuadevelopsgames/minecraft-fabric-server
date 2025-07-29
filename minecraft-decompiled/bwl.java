import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bwl extends bwo {
   public static final bwl a = new bwl(0);
   public static final MapCodec<bwl> b = Codec.INT.fieldOf("value").xmap(bwl::a, bwl::d);
   private final int f;

   public static bwl a(int $$0) {
      return $$0 == 0 ? a : new bwl($$0);
   }

   private bwl(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(bck $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bwp<?> c() {
      return bwp.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
