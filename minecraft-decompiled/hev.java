import com.google.common.collect.Maps;
import java.util.Map;

public final class hev extends hcu<cos, hlg, gnv> {
   private static final Map<coz, ame> a = Maps.newEnumMap(
      Map.of(
         coz.a,
         ame.b("textures/entity/horse/horse_white.png"),
         coz.b,
         ame.b("textures/entity/horse/horse_creamy.png"),
         coz.c,
         ame.b("textures/entity/horse/horse_chestnut.png"),
         coz.d,
         ame.b("textures/entity/horse/horse_brown.png"),
         coz.e,
         ame.b("textures/entity/horse/horse_black.png"),
         coz.f,
         ame.b("textures/entity/horse/horse_gray.png"),
         coz.g,
         ame.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public hev(hee.a $$0) {
      super($$0, new gnv($$0.a(gqm.bt)), new gnv($$0.a(gqm.bw)));
      this.a(new hih(this));
      this.a(new hix<>(this, $$0.h(), htz.d.e, $$0x -> $$0x.i, new gnv($$0.a(gqm.bu)), new gnv($$0.a(gqm.bx))));
      this.a(new hix<>(this, $$0.h(), htz.d.j, $$0x -> $$0x.b, new gni($$0.a(gqm.bv)), new gni($$0.a(gqm.by))));
   }

   public ame a(hlg $$0) {
      return a.get($$0.a);
   }

   public hlg b() {
      return new hlg();
   }

   public void a(cos $$0, hlg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
      $$1.h = $$0.n();
      $$1.i = $$0.gl().v();
   }
}
