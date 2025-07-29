import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bzy(amd<fdo> c, Map<bzw, Float> d) {
   public static final Codec<Map<bzw, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bzw.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bzy::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bzw.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bzy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(fdo.a.fieldOf("loot_table").forGetter(bzy::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bzy::b)).apply($$0, bzy::new)
   );

   public bzy(amd<fdo> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bzw, Float> a(float $$0) {
      return a(List.of(bzw.values()), $$0);
   }

   private static Map<bzw, Float> a(List<bzw> $$0, float $$1) {
      Map<bzw, Float> $$2 = Maps.newHashMap();

      for (bzw $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public amd<fdo> a() {
      return this.c;
   }

   public Map<bzw, Float> b() {
      return this.d;
   }
}
