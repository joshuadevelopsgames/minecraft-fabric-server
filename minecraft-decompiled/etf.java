import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class etf {
   private static final Codec<Either<eku, etf>> a = Codec.either(eku.a, mm.L.q().dispatch(etf::a, etg::codec));
   public static final Codec<etf> c = a.xmap(
      $$0 -> (etf)$$0.map(ete::a, $$0x -> $$0x), $$0 -> $$0.a() == etg.a ? Either.left(((ete)$$0).b()) : Either.right($$0)
   );

   public abstract int a(bck var1, ekx var2);

   public abstract etg<?> a();
}
