import com.google.common.collect.Maps;
import java.util.Map;

public class hih extends hit<hlg, gnv> {
   private static final ame a = ame.b("invisible");
   private static final Map<cou, ame> b = Maps.newEnumMap(
      Map.of(
         cou.a,
         a,
         cou.b,
         ame.b("textures/entity/horse/horse_markings_white.png"),
         cou.c,
         ame.b("textures/entity/horse/horse_markings_whitefield.png"),
         cou.d,
         ame.b("textures/entity/horse/horse_markings_whitedots.png"),
         cou.e,
         ame.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hih(hgc<hlg, gnv> $$0) {
      super($$0);
   }

   public void a(fod $$0, gxn $$1, int $$2, hlg $$3, float $$4, float $$5) {
      ame $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.A) {
         fog $$7 = $$1.getBuffer(gxz.j($$6));
         this.d().a($$0, $$7, $$2, hfg.a($$3, 0.0F));
      }
   }
}
