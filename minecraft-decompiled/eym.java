import com.mojang.serialization.MapCodec;

public class eym extends eyn {
   public static final MapCodec<eym> a = MapCodec.unit(() -> eym.b);
   public static final eym b = new eym();

   private eym() {
   }

   @Override
   public boolean a(jb $$0, jb $$1, jb $$2, bck $$3) {
      return true;
   }

   @Override
   protected eyo<?> a() {
      return eyo.a;
   }
}
