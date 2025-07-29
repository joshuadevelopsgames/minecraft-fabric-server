import com.mojang.serialization.MapCodec;

public class dzi extends dts {
   public static final MapCodec<dzi> c = b(dzi::new);
   private static final fjm e = dpz.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dzi> a() {
      return c;
   }

   public dzi(eea.d $$0) {
      super($$0, jh.b, e, false);
   }

   @Override
   protected dtt c() {
      return (dtt)dqb.pi;
   }
}
