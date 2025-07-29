import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record arz(arr h, List<aro> i, Optional<aro> j, int k) implements arp {
   public static final MapCodec<arz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            arr.a.forGetter(arz::A_),
            bbi.b(aro.a.listOf()).fieldOf("actions").forGetter(arz::e),
            aro.a.optionalFieldOf("exit_action").forGetter(arz::c),
            bbi.p.optionalFieldOf("columns", 2).forGetter(arz::b)
         )
         .apply($$0, arz::new)
   );

   @Override
   public MapCodec<arz> a() {
      return a;
   }

   @Override
   public arr A_() {
      return this.h;
   }

   public List<aro> e() {
      return this.i;
   }

   @Override
   public Optional<aro> c() {
      return this.j;
   }

   @Override
   public int b() {
      return this.k;
   }
}
