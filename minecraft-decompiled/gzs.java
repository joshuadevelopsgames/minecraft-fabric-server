import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record gzs(Optional<gzp> b, gzc.b c) {
   public static final Codec<gzs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gzp.a.optionalFieldOf("when").forGetter(gzs::a), gzc.b.c.fieldOf("apply").forGetter(gzs::b)).apply($$0, gzs::new)
   );

   public <O, S extends eed<O, S>> Predicate<S> a(eec<O, S> $$0) {
      return this.b.<Predicate<S>>map($$1 -> $$1.instantiate($$0)).orElse($$0x -> true);
   }

   public Optional<gzp> a() {
      return this.b;
   }

   public gzc.b b() {
      return this.c;
   }
}
