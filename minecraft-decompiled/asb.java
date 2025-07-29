import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asb(arr h, Optional<aro> i, int j, int k) implements arp {
   public static final MapCodec<asb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            arr.a.forGetter(asb::A_),
            aro.a.optionalFieldOf("exit_action").forGetter(asb::c),
            bbi.p.optionalFieldOf("columns", 2).forGetter(asb::b),
            b.optionalFieldOf("button_width", 150).forGetter(asb::e)
         )
         .apply($$0, asb::new)
   );

   @Override
   public MapCodec<asb> a() {
      return a;
   }

   @Override
   public arr A_() {
      return this.h;
   }

   @Override
   public Optional<aro> c() {
      return this.i;
   }

   @Override
   public int b() {
      return this.j;
   }

   public int e() {
      return this.k;
   }
}
