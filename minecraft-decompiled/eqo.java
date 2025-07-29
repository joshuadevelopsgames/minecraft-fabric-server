import com.mojang.serialization.MapCodec;

public class eqo<P extends eqn> {
   public static final eqo<eqq> a = a("two_layers_feature_size", eqq.d);
   public static final eqo<eqp> b = a("three_layers_feature_size", eqp.d);
   private final MapCodec<P> c;

   private static <P extends eqn> eqo<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.Y, $$0, new eqo<>($$1));
   }

   private eqo(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}
