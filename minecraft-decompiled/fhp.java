import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fhp {
   private static final Codec<fho> h = mm.G.q().dispatch(fho::b, fhn::a);
   public static final Codec<fho> a = Codec.lazyInitialized(() -> {
      Codec<fho> $$0 = Codec.withAlternative(h, fhs.a.codec());
      return Codec.either(fhl.b, $$0).xmap(Either::unwrap, $$0x -> $$0x instanceof fhl $$1 ? Either.left($$1) : Either.right($$0x));
   });
   public static final fhn b = a("constant", fhl.a);
   public static final fhn c = a("uniform", fhs.a);
   public static final fhn d = a("binomial", fhk.a);
   public static final fhn e = a("score", fhq.a);
   public static final fhn f = a("storage", fhr.a);
   public static final fhn g = a("enchantment_level", fhm.a);

   private static fhn a(String $$0, MapCodec<? extends fho> $$1) {
      return jy.a(mm.G, ame.b($$0), new fhn($$1));
   }
}
