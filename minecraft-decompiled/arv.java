import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record arv(arr h, jp<art> i, Optional<aro> j, int k, int l) implements arp {
   public static final MapCodec<arv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            arr.a.forGetter(arv::A_),
            art.e.fieldOf("dialogs").forGetter(arv::e),
            aro.a.optionalFieldOf("exit_action").forGetter(arv::c),
            bbi.p.optionalFieldOf("columns", 2).forGetter(arv::b),
            b.optionalFieldOf("button_width", 150).forGetter(arv::f)
         )
         .apply($$0, arv::new)
   );

   @Override
   public MapCodec<arv> a() {
      return a;
   }

   @Override
   public arr A_() {
      return this.h;
   }

   public jp<art> e() {
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

   public int f() {
      return this.l;
   }
}
