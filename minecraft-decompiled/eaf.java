import com.mojang.serialization.MapCodec;

public class eaf extends dts {
   public static final MapCodec<eaf> c = b(eaf::new);
   private static final fjm e = dpz.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<eaf> a() {
      return c;
   }

   public eaf(eea.d $$0) {
      super($$0, jh.a, e, false);
   }

   @Override
   protected dtt c() {
      return (dtt)dqb.pg;
   }
}
