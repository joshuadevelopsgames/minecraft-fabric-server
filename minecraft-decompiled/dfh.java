import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dfh(Map<jl<dpz>, efe<?>> c) {
   public static final dfh a = new dfh(Map.of());
   public static final Codec<dfh> b = Codec.dispatchedMap(mm.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
      efe<?> $$2 = ((dpz)$$0.a()).l().a($$1);
      return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
   }, efe::f)).xmap(dfh::new, dfh::a);

   public dfh a(jl<dpz> $$0, efe<?> $$1) {
      return new dfh(ag.a(this.c, $$0, $$1));
   }

   public Map<jl<dpz>, efe<?>> a() {
      return this.c;
   }
}
