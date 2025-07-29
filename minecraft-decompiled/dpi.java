import com.mojang.serialization.MapCodec;

public class dpi extends dpj {
   public static final MapCodec<dpi> a = b(dpi::new);
   private static final fjm c = dpz.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   protected dpi(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }
}
