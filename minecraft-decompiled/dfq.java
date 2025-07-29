import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public record dfq(Map<String, dfq.a> c) {
   public static final dfq a = new dfq(Map.of());
   public static final Codec<dfq> b = Codec.unboundedMap(Codec.STRING, dfq.a.a).xmap(dfq::new, dfq::a);

   public dfq a(String $$0, dfq.a $$1) {
      return new dfq(ag.a(this.c, $$0, $$1));
   }

   public Map<String, dfq.a> a() {
      return this.c;
   }

   public record a(jl<fcb> b, double c, double d, float e) {
      public static final Codec<dfq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               fcb.b.fieldOf("type").forGetter(dfq.a::a),
               Codec.DOUBLE.fieldOf("x").forGetter(dfq.a::b),
               Codec.DOUBLE.fieldOf("z").forGetter(dfq.a::c),
               Codec.FLOAT.fieldOf("rotation").forGetter(dfq.a::d)
            )
            .apply($$0, dfq.a::new)
      );

      public jl<fcb> a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }

      public double c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }
}
