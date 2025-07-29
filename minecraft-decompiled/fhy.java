import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fhy {
   private static final Codec<fhx> d = mm.I.q().dispatch(fhx::a, fhw::a);
   public static final Codec<fhx> a = Codec.lazyInitialized(
      () -> Codec.either(fhu.b, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fhu $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fhw b = a("fixed", fhv.a);
   public static final fhw c = a("context", fhu.a);

   private static fhw a(String $$0, MapCodec<? extends fhx> $$1) {
      return jy.a(mm.I, ame.b($$0), new fhw($$1));
   }
}
