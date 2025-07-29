import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewl {
   public static MapCodec<? extends ewk> a(jy<MapCodec<? extends ewk>> $$0) {
      jy.a($$0, "random", ewo.a);
      jy.a($$0, "random_group", ewn.a);
      return jy.a($$0, "direct", ewj.a);
   }

   public static void a(qq<ewi> $$0, jl<ewi> $$1, List<ewk> $$2) {
      $$2.stream().flatMap(ewk::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qx.a($$0, $$2x, new ewi($$1, List.of(Pair.of(ewg.b($$2x), 1)), ewi.a.b)));
   }
}
