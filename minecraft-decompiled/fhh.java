import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fhh {
   private static final Codec<fhg> d = mm.H.q().dispatch(fhg::a, fhf::a);
   public static final Codec<fhg> a = Codec.lazyInitialized(
      () -> Codec.either(fhe.c, d).xmap(Either::unwrap, $$0 -> $$0 instanceof fhe $$1 ? Either.left($$1) : Either.right($$0))
   );
   public static final fhf b = a("storage", fhi.a);
   public static final fhf c = a("context", fhe.b);

   private static fhf a(String $$0, MapCodec<? extends fhg> $$1) {
      return jy.a(mm.H, ame.b($$0), new fhf($$1));
   }
}
