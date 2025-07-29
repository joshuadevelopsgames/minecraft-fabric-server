import com.mojang.serialization.MapCodec;

public class exx extends eyu {
   public static final MapCodec<exx> a = MapCodec.unit(() -> exx.b);
   public static final exx b = new exx();

   private exx() {
   }

   @Override
   public boolean a(eeb $$0, bck $$1) {
      return true;
   }

   @Override
   protected eyv<?> a() {
      return eyv.a;
   }
}
