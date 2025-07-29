import com.mojang.serialization.MapCodec;

public class ezc extends eyu {
   public static final MapCodec<ezc> a = bae.a(mn.i).fieldOf("tag").xmap(ezc::new, $$0 -> $$0.b);
   private final bae<dpz> b;

   public ezc(bae<dpz> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eeb $$0, bck $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eyv<?> a() {
      return eyv.d;
   }
}
