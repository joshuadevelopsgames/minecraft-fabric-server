import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface djp {
   Codec<djp> a = mm.ar.q().dispatch(djp::a, $$0 -> $$0);
   Codec<djp> b = Codec.either(djp.b.c, a)
      .xmap($$0 -> (djp)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof djp.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends djp> a(jy<MapCodec<? extends djp>> $$0) {
      jy.a($$0, "clamped", djp.a.c);
      jy.a($$0, "fraction", djp.c.c);
      jy.a($$0, "levels_squared", djp.d.c);
      jy.a($$0, "linear", djp.e.c);
      return jy.a($$0, "lookup", djp.f.c);
   }

   static djp.b a(float $$0) {
      return new djp.b($$0);
   }

   static djp.e a(float $$0, float $$1) {
      return new djp.e($$0, $$1);
   }

   static djp.e b(float $$0) {
      return a($$0, $$0);
   }

   static djp.f a(List<Float> $$0, djp $$1) {
      return new djp.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends djp> a();

   public record a(djp d, float e, float f) implements djp {
      public static final MapCodec<djp.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  djp.b.fieldOf("value").forGetter(djp.a::b), Codec.FLOAT.fieldOf("min").forGetter(djp.a::c), Codec.FLOAT.fieldOf("max").forGetter(djp.a::d)
               )
               .apply($$0, djp.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return bcb.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<djp.a> a() {
         return c;
      }

      public djp b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public record b(float e) implements djp {
      public static final Codec<djp.b> c = Codec.FLOAT.xmap(djp.b::new, djp.b::b);
      public static final MapCodec<djp.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(djp.b::b)).apply($$0, djp.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<djp.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public record c(djp d, djp e) implements djp {
      public static final MapCodec<djp.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(djp.b.fieldOf("numerator").forGetter(djp.c::b), djp.b.fieldOf("denominator").forGetter(djp.c::c)).apply($$0, djp.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<djp.c> a() {
         return c;
      }

      public djp b() {
         return this.d;
      }

      public djp c() {
         return this.e;
      }
   }

   public record d(float d) implements djp {
      public static final MapCodec<djp.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(djp.d::b)).apply($$0, djp.d::new)
      );

      @Override
      public float a(int $$0) {
         return bcb.i($$0) + this.d;
      }

      @Override
      public MapCodec<djp.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public record e(float d, float e) implements djp {
      public static final MapCodec<djp.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(djp.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(djp.e::c))
            .apply($$0, djp.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * ($$0 - 1);
      }

      @Override
      public MapCodec<djp.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public record f(List<Float> d, djp e) implements djp {
      public static final MapCodec<djp.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(djp.f::b), djp.b.fieldOf("fallback").forGetter(djp.f::c)).apply($$0, djp.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<djp.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public djp c() {
         return this.e;
      }
   }
}
