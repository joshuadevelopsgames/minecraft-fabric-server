import com.mojang.serialization.MapCodec;

public class eae extends dtt {
   public static final MapCodec<eae> c = b(eae::new);
   private static final fjm g = dpz.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<eae> a() {
      return c;
   }

   public eae(eea.d $$0) {
      super($$0, jh.a, g, false, 0.1);
   }

   @Override
   protected int a(bck $$0) {
      return dvn.a($$0);
   }

   @Override
   protected dpz b() {
      return dqb.ph;
   }

   @Override
   protected boolean h(eeb $$0) {
      return dvn.a($$0);
   }
}
