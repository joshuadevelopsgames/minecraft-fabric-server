import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public record gxt(Map<ame, gxt.b> b, List<gxt.c> c) {
   public static final Codec<gxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.unboundedMap(ame.a, gxt.b.a).optionalFieldOf("targets", Map.of()).forGetter(gxt::a),
            gxt.c.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gxt::b)
         )
         .apply($$0, gxt::new)
   );

   public Map<ame, gxt.b> a() {
      return this.b;
   }

   public List<gxt.c> b() {
      return this.c;
   }

   public sealed interface a permits gxt.e, gxt.d {
      Codec<gxt.a> a = Codec.xor(gxt.e.b, gxt.d.b).xmap($$0 -> (gxt.a)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         return switch ($$0) {
            case gxt.e $$3 -> Either.left($$3);
            case gxt.d $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<ame> b();
   }

   public record b(Optional<Integer> b, Optional<Integer> c, boolean d, int e) {
      public static final Codec<gxt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               bbi.p.optionalFieldOf("width").forGetter(gxt.b::a),
               bbi.p.optionalFieldOf("height").forGetter(gxt.b::b),
               Codec.BOOL.optionalFieldOf("persistent", false).forGetter(gxt.b::c),
               bbi.m.optionalFieldOf("clear_color", 0).forGetter(gxt.b::d)
            )
            .apply($$0, gxt.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }

      public Optional<Integer> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }

   public record c(ame b, ame c, List<gxt.a> d, ame e, Map<String, List<gym>> f) {
      private static final Codec<List<gxt.a>> g = gxt.a.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gxt.a $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      private static final Codec<Map<String, List<gym>>> h = Codec.unboundedMap(Codec.STRING, gym.a.listOf());
      public static final Codec<gxt.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ame.a.fieldOf("vertex_shader").forGetter(gxt.c::b),
               ame.a.fieldOf("fragment_shader").forGetter(gxt.c::c),
               g.optionalFieldOf("inputs", List.of()).forGetter(gxt.c::d),
               ame.a.fieldOf("output").forGetter(gxt.c::e),
               h.optionalFieldOf("uniforms", Map.of()).forGetter(gxt.c::f)
            )
            .apply($$0, gxt.c::new)
      );

      public Stream<ame> a() {
         Stream<ame> $$0 = this.d.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.e));
      }
   }

   public record d(String c, ame d, boolean e, boolean f) implements gxt.a {
      public static final Codec<gxt.d> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.STRING.fieldOf("sampler_name").forGetter(gxt.d::a),
               ame.a.fieldOf("target").forGetter(gxt.d::c),
               Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gxt.d::d),
               Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gxt.d::e)
            )
            .apply($$0, gxt.d::new)
      );

      @Override
      public Set<ame> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public ame c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public record e(String c, ame d, int e, int f, boolean g) implements gxt.a {
      public static final Codec<gxt.e> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.STRING.fieldOf("sampler_name").forGetter(gxt.e::a),
               ame.a.fieldOf("location").forGetter(gxt.e::c),
               bbi.p.fieldOf("width").forGetter(gxt.e::d),
               bbi.p.fieldOf("height").forGetter(gxt.e::e),
               Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gxt.e::f)
            )
            .apply($$0, gxt.e::new)
      );

      @Override
      public Set<ame> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public ame c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public int e() {
         return this.f;
      }

      public boolean f() {
         return this.g;
      }
   }
}
