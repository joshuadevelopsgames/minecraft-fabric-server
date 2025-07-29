import com.mojang.serialization.MapCodec;

public class dzh extends dtt {
   public static final MapCodec<dzh> c = b(dzh::new);
   private static final fjm g = dpz.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dzh> a() {
      return c;
   }

   public dzh(eea.d $$0) {
      super($$0, jh.b, g, false, 0.1);
   }

   @Override
   protected int a(bck $$0) {
      return dvn.a($$0);
   }

   @Override
   protected dpz b() {
      return dqb.pj;
   }

   @Override
   protected boolean h(eeb $$0) {
      return dvn.a($$0);
   }
}
