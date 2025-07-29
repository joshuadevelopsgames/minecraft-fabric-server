import com.mojang.serialization.MapCodec;

public class dyv extends dza {
   public static final MapCodec<dyv> a = b(dyv::new);

   @Override
   public MapCodec<dyv> a() {
      return a;
   }

   public dyv(eea.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return false;
   }

   @Override
   protected int i_(eeb $$0) {
      return 15;
   }
}
