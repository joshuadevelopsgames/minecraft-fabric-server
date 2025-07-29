import com.mojang.serialization.MapCodec;

public class dph extends dpj {
   public static final MapCodec<dph> a = b(dph::new);
   private static final fjm c = dpz.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dph> a() {
      return a;
   }

   protected dph(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }
}
