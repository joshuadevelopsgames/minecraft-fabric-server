import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class bwm implements bwr {
   private static final Codec<Either<Float, bwm>> a = Codec.either(Codec.FLOAT, mm.J.q().dispatch(bwm::c, bwn::codec));
   public static final Codec<bwm> c = a.xmap(
      $$0 -> (bwm)$$0.map(bwk::a, $$0x -> $$0x), $$0 -> $$0.c() == bwn.a ? Either.left(((bwk)$$0).d()) : Either.right($$0)
   );

   public static Codec<bwm> a(float $$0, float $$1) {
      return c.validate($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      });
   }

   public abstract float a();

   public abstract float b();

   public abstract bwn<?> c();
}
