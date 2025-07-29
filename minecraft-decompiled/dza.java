import com.mojang.serialization.MapCodec;

public class dza extends dtu {
   public static final MapCodec<dza> b = b(dza::new);

   protected dza(eea.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dza> a() {
      return b;
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.a();
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(eeb $$0) {
      return true;
   }
}
