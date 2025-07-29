import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfg(List<dgj> d) {
   public static final Codec<dfg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dgj.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dfg::a)).apply($$0, dfg::new)
   );
   public static final zm<wx, dfg> b = zm.a(dgj.e.a(zk.a()), dfg::a, dfg::new);
   public static final dfg c = new dfg(List.of(new dgi(), new dgh(List.of(new byq(bys.j, 900, 1), new byq(bys.v, 100, 1), new byq(bys.l, 800, 0)))));

   public void a(dcv $$0, cam $$1) {
      for (dgj $$2 : this.d) {
         $$2.a($$1.ai(), $$0, $$1);
      }
   }

   public List<dgj> a() {
      return this.d;
   }
}
