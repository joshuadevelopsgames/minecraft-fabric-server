import com.mojang.serialization.MapCodec;

public class ero<P extends ern> {
   public static final ero<erw> a = a("simple_state_provider", erw.b);
   public static final ero<erx> b = a("weighted_state_provider", erx.b);
   public static final ero<ers> c = a("noise_threshold_provider", ers.b);
   public static final ero<err> d = a("noise_provider", err.g);
   public static final ero<erp> e = a("dual_noise_provider", erp.b);
   public static final ero<eru> f = a("rotated_block_provider", eru.b);
   public static final ero<ert> g = a("randomized_int_state_provider", ert.b);
   private final MapCodec<P> h;

   private static <P extends ern> ero<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.T, $$0, new ero<>($$1));
   }

   private ero(MapCodec<P> $$0) {
      this.h = $$0;
   }

   public MapCodec<P> a() {
      return this.h;
   }
}
