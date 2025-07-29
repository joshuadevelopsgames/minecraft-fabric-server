import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ffm extends few {
   public static final MapCodec<ffm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               fev.e.a(dfj.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c), bbi.n.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
            )
         )
         .apply($$0, ffm::new)
   );
   public static final dfk b = new dfk(0, List.of());
   private final Optional<fev.e<dfj>> c;
   private final Optional<Integer> d;

   protected ffm(List<fgs> $$0, Optional<fev.e<dfj>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.aj, b, this::a);
      return $$0;
   }

   private dfk a(dfk $$0) {
      return new dfk(this.d.orElseGet($$0::a), this.c.<List<dfj>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fey<ffm> b() {
      return fez.K;
   }
}
