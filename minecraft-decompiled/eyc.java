import com.mojang.serialization.MapCodec;

public class eyc extends eyu {
   public static final MapCodec<eyc> a = mm.e.q().fieldOf("block").xmap(eyc::new, $$0 -> $$0.b);
   private final dpz b;

   public eyc(dpz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eeb $$0, bck $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eyv<?> a() {
      return eyv.b;
   }
}
