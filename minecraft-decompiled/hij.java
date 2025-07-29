import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hij extends hit<hlk, gnz> {
   private static final Map<bzi.a, ame> a = ImmutableMap.of(
      bzi.a.b,
      ame.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bzi.a.c,
      ame.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bzi.a.d,
      ame.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hij(hgc<hlk, gnz> $$0) {
      super($$0);
   }

   public void a(fod $$0, gxn $$1, int $$2, hlk $$3, float $$4, float $$5) {
      if (!$$3.A) {
         bzi.a $$6 = $$3.c;
         if ($$6 != bzi.a.a) {
            ame $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
