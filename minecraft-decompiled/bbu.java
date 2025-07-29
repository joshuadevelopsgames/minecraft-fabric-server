import com.mojang.serialization.MapCodec;

public record bbu<A>(MapCodec<A> a) {
   public static <A> bbu<A> a(MapCodec<A> $$0) {
      return new bbu<>($$0);
   }
}
