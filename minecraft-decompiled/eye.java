import com.mojang.serialization.MapCodec;

public class eye extends eyu {
   public static final MapCodec<eye> a = eeb.a.fieldOf("block_state").xmap(eye::new, $$0 -> $$0.b);
   private final eeb b;

   public eye(eeb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eeb $$0, bck $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eyv<?> a() {
      return eyv.c;
   }
}
