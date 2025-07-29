import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class eun {
   public static final Codec<eun> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(amd.a(mn.bv), ehz.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, eun::new)
      )
      .validate(eun::a);
   public static final Codec<jl<eun>> b = ama.a(mn.bt, a);
   private final Map<amd<ehz>, ehz> c;

   public eun(Map<amd<ehz>, ehz> $$0) {
      this.c = $$0;
   }

   private ImmutableMap<amd<ehz>, ehz> c() {
      Builder<amd<ehz>, ehz> $$0 = ImmutableMap.builder();
      ekv.a(this.c.keySet().stream()).forEach($$1 -> {
         ehz $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2);
         }
      });
      return $$0.build();
   }

   public ekv a() {
      return new ekv(this.c());
   }

   public Optional<ehz> b() {
      return Optional.ofNullable(this.c.get(ehz.b));
   }

   private static DataResult<eun> a(eun $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
