import com.mojang.serialization.MapCodec;

class elt implements elh {
   public static elt a = new elt();
   public static final MapCodec<elt> e = MapCodec.unit(() -> a);

   private elt() {
   }

   public boolean a(dnt $$0, jb $$1) {
      return true;
   }

   @Override
   public eli<?> a() {
      return eli.l;
   }
}
