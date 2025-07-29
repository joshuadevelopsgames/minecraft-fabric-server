import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eqf implements epm {
   public static final Codec<eqf> a = bbi.c(euc.c).fieldOf("features").xmap(eqf::new, $$0 -> $$0.b).codec();
   public final jp<euc> b;

   public eqf(jp<euc> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ems<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
