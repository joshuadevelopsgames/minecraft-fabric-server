import com.mojang.serialization.MapCodec;

public class eyl extends eyx {
   public static final MapCodec<eyl> a = MapCodec.unit(() -> eyl.b);
   public static final eyl b = new eyl();

   private eyl() {
   }

   @Override
   protected eyz<?> a() {
      return eyz.j;
   }
}
