import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class erx extends ern {
   public static final MapCodec<erx> b = bvt.b(eeb.a).comapFlatMap(erx::a, $$0 -> $$0.c).fieldOf("entries");
   private final bvt<eeb> c;

   private static DataResult<erx> a(bvt<eeb> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new erx($$0));
   }

   public erx(bvt<eeb> $$0) {
      this.c = $$0;
   }

   public erx(bvt.a<eeb> $$0) {
      this($$0.a());
   }

   @Override
   protected ero<?> a() {
      return ero.b;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      return this.c.b($$0);
   }
}
