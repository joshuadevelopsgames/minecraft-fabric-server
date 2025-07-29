import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record tt<EnvironmentType>(EnvironmentType b, ame c, int d, int e, boolean f, dwu g, boolean h, int i, int j, boolean k) {
   public static final MapCodec<tt<jl<tu>>> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            tu.b.fieldOf("environment").forGetter(tt::a),
            ame.a.fieldOf("structure").forGetter(tt::b),
            bbi.p.fieldOf("max_ticks").forGetter(tt::c),
            bbi.o.optionalFieldOf("setup_ticks", 0).forGetter(tt::d),
            Codec.BOOL.optionalFieldOf("required", true).forGetter(tt::e),
            dwu.f.optionalFieldOf("rotation", dwu.a).forGetter(tt::f),
            Codec.BOOL.optionalFieldOf("manual_only", false).forGetter(tt::g),
            bbi.p.optionalFieldOf("max_attempts", 1).forGetter(tt::h),
            bbi.p.optionalFieldOf("required_successes", 1).forGetter(tt::i),
            Codec.BOOL.optionalFieldOf("sky_access", false).forGetter(tt::j)
         )
         .apply($$0, tt::new)
   );

   public tt(EnvironmentType $$0, ame $$1, int $$2, int $$3, boolean $$4, dwu $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, 1, 1, false);
   }

   public tt(EnvironmentType $$0, ame $$1, int $$2, int $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, dwu.a);
   }

   public <T> tt<T> a(Function<EnvironmentType, T> $$0) {
      return new tt<>($$0.apply(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
   }

   public EnvironmentType a() {
      return this.b;
   }

   public ame b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public dwu f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public int h() {
      return this.i;
   }

   public int i() {
      return this.j;
   }

   public boolean j() {
      return this.k;
   }
}
