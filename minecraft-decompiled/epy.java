import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class epy implements epm {
   public static final Codec<epy> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(epy::new, epb.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), euc.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<epb> b;
   public final jl<euc> c;

   public epy(List<epb> $$0, jl<euc> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ems<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
