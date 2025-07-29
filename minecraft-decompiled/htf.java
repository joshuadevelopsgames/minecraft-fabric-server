import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record htf(int c, Optional<Integer> d) {
   public static final Codec<htf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bbi.o.fieldOf("index").forGetter(htf::a), bbi.p.optionalFieldOf("time").forGetter(htf::b)).apply($$0, htf::new)
   );
   public static final Codec<htf> b = Codec.either(bbi.o, a)
      .xmap($$0 -> (htf)$$0.map(htf::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public htf(int $$0) {
      this($$0, Optional.empty());
   }

   public int a(int $$0) {
      return this.d.orElse($$0);
   }

   public int a() {
      return this.c;
   }

   public Optional<Integer> b() {
      return this.d;
   }
}
