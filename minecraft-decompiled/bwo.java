import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bwo {
   private static final Codec<Either<Integer, bwo>> a = Codec.either(Codec.INT, mm.K.q().dispatch(bwo::c, bwp::codec));
   public static final Codec<bwo> c = a.xmap(
      $$0 -> (bwo)$$0.map(bwl::a, $$0x -> $$0x), $$0 -> $$0.c() == bwp.a ? Either.left(((bwl)$$0).d()) : Either.right($$0)
   );
   public static final Codec<bwo> d = b(0, Integer.MAX_VALUE);
   public static final Codec<bwo> e = b(1, Integer.MAX_VALUE);

   public static Codec<bwo> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends bwo> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return $$2.validate($$2x -> a($$0, $$1, $$2x));
   }

   private static <T extends bwo> DataResult<T> a(int $$0, int $$1, T $$2) {
      if ($$2.a() < $$0) {
         return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
      } else {
         return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
      }
   }

   public abstract int a(bck var1);

   public abstract int a();

   public abstract int b();

   public abstract bwp<?> c();
}
