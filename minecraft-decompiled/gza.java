import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;

public record gza(Optional<gza.b> b, Optional<gza.a> c) {
   static final Logger d = LogUtils.getLogger();
   public static final Codec<gza> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gza.b.a.optionalFieldOf("variants").forGetter(gza::a), gza.a.a.optionalFieldOf("multipart").forGetter(gza::b)).apply($$0, gza::new)
      )
      .validate($$0 -> $$0.a().isEmpty() && $$0.b().isEmpty() ? DataResult.error(() -> "Neither 'variants' nor 'multipart' found") : DataResult.success($$0));

   public Map<eeb, gzc.c> a(eec<dpz, eeb> $$0, Supplier<String> $$1) {
      Map<eeb, gzc.c> $$2 = new IdentityHashMap<>();
      this.b.ifPresent($$3 -> $$3.a($$0, $$1, ($$1xx, $$2xx) -> {
         gzc.c $$3x = $$2.put($$1xx, $$2xx);
         if ($$3x != null) {
            throw new IllegalArgumentException("Overlapping definition on state: " + $$1xx);
         }
      }));
      this.c.ifPresent($$2x -> {
         List<eeb> $$3 = $$0.a();
         gzc.c $$4 = $$2x.a($$0);

         for (eeb $$5 : $$3) {
            $$2.putIfAbsent($$5, $$4);
         }
      });
      return $$2;
   }

   public Optional<gza.b> a() {
      return this.b;
   }

   public Optional<gza.a> b() {
      return this.c;
   }

   public record a(List<gzs> b) {
      public static final Codec<gza.a> a = bbi.b(gzs.a.listOf()).xmap(gza.a::new, gza.a::a);

      public gzr.c a(eec<dpz, eeb> $$0) {
         Builder<gzr.a<gzc.b>> $$1 = ImmutableList.builderWithExpectedSize(this.b.size());

         for (gzs $$2 : this.b) {
            $$1.add(new gzr.a<>($$2.a($$0), $$2.b()));
         }

         return new gzr.c($$1.build());
      }

      public List<gzs> a() {
         return this.b;
      }
   }

   public record b(Map<String, gzc.b> b) {
      public static final Codec<gza.b> a = bbi.d(Codec.unboundedMap(Codec.STRING, gzc.b.c)).xmap(gza.b::new, gza.b::a);

      public void a(eec<dpz, eeb> $$0, Supplier<String> $$1, BiConsumer<eeb, gzc.c> $$2) {
         this.b.forEach(($$3, $$4) -> {
            try {
               Predicate<eed<dpz, eeb>> $$5 = gzn.a($$0, $$3);
               gzc.c $$6 = $$4.a();
               UnmodifiableIterator var7 = $$0.a().iterator();

               while (var7.hasNext()) {
                  eeb $$7 = (eeb)var7.next();
                  if ($$5.test($$7)) {
                     $$2.accept($$7, $$6);
                  }
               }
            } catch (Exception var9) {
               gza.d.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1.get(), $$3, var9.getMessage()});
            }
         });
      }

      public Map<String, gzc.b> a() {
         return this.b;
      }
   }
}
