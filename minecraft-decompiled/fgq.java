import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fgq(Optional<cv> b, jb c) implements fgs {
   private static final MapCodec<jb> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kg::u),
            Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kg::v),
            Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kg::w)
         )
         .apply($$0, jb::new)
   );
   public static final MapCodec<fgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(fgq::c), g.forGetter(fgq::d)).apply($$0, fgq::new)
   );

   @Override
   public fgt b() {
      return fgu.n;
   }

   public boolean a(fdj $$0) {
      fis $$1 = $$0.c(fgd.f);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + this.c.u(), $$1.b() + this.c.v(), $$1.c() + this.c.w()));
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.f);
   }

   public static fgs.a a(cv.a $$0) {
      return () -> new fgq(Optional.of($$0.b()), jb.c);
   }

   public static fgs.a a(cv.a $$0, jb $$1) {
      return () -> new fgq(Optional.of($$0.b()), $$1);
   }

   public Optional<cv> c() {
      return this.b;
   }

   public jb d() {
      return this.c;
   }
}
