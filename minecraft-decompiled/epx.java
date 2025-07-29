import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class epx implements epm {
   public static final Codec<epx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(euc.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), euc.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, epx::new)
   );
   public final jl<euc> b;
   public final jl<euc> c;

   public epx(jl<euc> $$0, jl<euc> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ems<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
