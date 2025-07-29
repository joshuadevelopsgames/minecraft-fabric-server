import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dol {
   public static final Codec<dol> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dol.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), amc.c(mn.aK)).apply($$0, dol::new)
   );
   public static final Codec<jl<dol>> b = ama.a(mn.bb, a);
   private final dol.a c;
   private final dog.c<jl<dnx>> d;

   public dol(dol.a $$0, jm<dnx> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dog.c<jl<dnx>> a() {
      return this.d;
   }

   public static Map<dol.a, dog.c<amd<dnx>>> b() {
      return dol.a.f.values().stream().collect(Collectors.toMap($$0 -> (dol.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public record a(ame d, dol.a.a e) {
      public static final dol.a a = new dol.a(
         ame.b("nether"),
         new dol.a.a() {
            @Override
            public <T> dog.c<T> apply(Function<amd<dnx>, T> $$0) {
               return new dog.c<>(
                  List.of(
                     Pair.of(dog.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(doe.ad)),
                     Pair.of(dog.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(doe.ag)),
                     Pair.of(dog.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(doe.af)),
                     Pair.of(dog.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(doe.ae)),
                     Pair.of(dog.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(doe.ah))
                  )
               );
            }
         }
      );
      public static final dol.a b = new dol.a(ame.b("overworld"), new dol.a.a() {
         @Override
         public <T> dog.c<T> apply(Function<amd<dnx>, T> $$0) {
            return dol.a.a($$0);
         }
      });
      static final Map<ame, dol.a> f = Stream.of(a, b).collect(Collectors.toMap(dol.a::b, $$0 -> (dol.a)$$0));
      public static final Codec<dol.a> c = ame.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dog.c<T> a(Function<amd<dnx>, T> $$0) {
         Builder<Pair<dog.d, T>> $$1 = ImmutableList.builder();
         new don().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dog.c<>($$1.build());
      }

      public Stream<amd<dnx>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<amd<dnx>>map(Pair::getSecond).distinct();
      }

      public ame b() {
         return this.d;
      }

      public dol.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dog.c<T> apply(Function<amd<dnx>, T> var1);
      }
   }
}
