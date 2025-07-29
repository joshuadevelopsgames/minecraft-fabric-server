import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ass(int c, xo d, String e, ass.a f) implements asq {
   public static final MapCodec<ass> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            art.b.optionalFieldOf("width", 200).forGetter(ass::b),
            xq.a.fieldOf("label").forGetter(ass::c),
            Codec.STRING.optionalFieldOf("label_format", "options.generic_value").forGetter(ass::d),
            ass.a.a.forGetter(ass::e)
         )
         .apply($$0, ass::new)
   );

   @Override
   public MapCodec<ass> a() {
      return a;
   }

   public xo a(String $$0) {
      return xo.a(this.e, this.d, $$0);
   }

   public int b() {
      return this.c;
   }

   public xo c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public ass.a e() {
      return this.f;
   }

   public record a(float b, float c, Optional<Float> d, Optional<Float> e) {
      public static final MapCodec<ass.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  Codec.FLOAT.fieldOf("start").forGetter(ass.a::b),
                  Codec.FLOAT.fieldOf("end").forGetter(ass.a::c),
                  Codec.FLOAT.optionalFieldOf("initial").forGetter(ass.a::d),
                  bbi.r.optionalFieldOf("step").forGetter(ass.a::e)
               )
               .apply($$0, ass.a::new)
         )
         .validate($$0 -> {
            if ($$0.d.isPresent()) {
               double $$1 = $$0.d.get().floatValue();
               double $$2 = Math.min($$0.b, $$0.c);
               double $$3 = Math.max($$0.b, $$0.c);
               if ($$1 < $$2 || $$1 > $$3) {
                  return DataResult.error(() -> "Initial value " + $$1 + " is outside of range [" + $$2 + ", " + $$3 + "]");
               }
            }

            return DataResult.success($$0);
         });

      public float a(float $$0) {
         float $$1 = bcb.h($$0, this.b, this.c);
         if (this.e.isEmpty()) {
            return $$1;
         } else {
            float $$2 = this.e.get();
            float $$3 = this.f();
            float $$4 = $$1 - $$3;
            int $$5 = Math.round($$4 / $$2);
            float $$6 = $$3 + $$5 * $$2;
            if (!this.b($$6)) {
               return $$6;
            } else {
               int $$7 = $$5 - bcb.j((double)$$5);
               return $$3 + $$7 * $$2;
            }
         }
      }

      private boolean b(float $$0) {
         float $$1 = this.c($$0);
         return $$1 < 0.0 || $$1 > 1.0;
      }

      private float f() {
         return this.d.isPresent() ? this.d.get() : (this.b + this.c) / 2.0F;
      }

      public float a() {
         float $$0 = this.f();
         return this.c($$0);
      }

      private float c(float $$0) {
         return this.b == this.c ? 0.5F : bcb.f($$0, this.b, this.c);
      }
   }
}
