import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asu(int c, xo d, boolean e, String f, int g, Optional<asu.a> h) implements asq {
   public static final MapCodec<asu> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               art.b.optionalFieldOf("width", 200).forGetter(asu::b),
               xq.a.fieldOf("label").forGetter(asu::c),
               Codec.BOOL.optionalFieldOf("label_visible", true).forGetter(asu::d),
               Codec.STRING.optionalFieldOf("initial", "").forGetter(asu::e),
               bbi.p.optionalFieldOf("max_length", 32).forGetter(asu::f),
               asu.a.b.optionalFieldOf("multiline").forGetter(asu::g)
            )
            .apply($$0, asu::new)
      )
      .validate($$0 -> $$0.f.length() > $$0.f() ? DataResult.error(() -> "Default text length exceeds allowed size") : DataResult.success($$0));

   @Override
   public MapCodec<asu> a() {
      return a;
   }

   public int b() {
      return this.c;
   }

   public xo c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public String e() {
      return this.f;
   }

   public int f() {
      return this.g;
   }

   public Optional<asu.a> g() {
      return this.h;
   }

   public record a(Optional<Integer> c, Optional<Integer> d) {
      public static final int a = 512;
      public static final Codec<asu.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(bbi.p.optionalFieldOf("max_lines").forGetter(asu.a::a), bbi.a(1, 512).optionalFieldOf("height").forGetter(asu.a::b))
            .apply($$0, asu.a::new)
      );

      public Optional<Integer> a() {
         return this.c;
      }

      public Optional<Integer> b() {
         return this.d;
      }
   }
}
