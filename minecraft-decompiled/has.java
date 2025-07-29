import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class has implements hac<ecp> {
   private final Function<dxm.a, gph> a;
   private static final Map<dxm.a, ame> b = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dxm.b.c, ame.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dxm.b.d, ame.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dxm.b.f, ame.b("textures/entity/zombie/zombie.png"));
      $$0.put(dxm.b.g, ame.b("textures/entity/creeper/creeper.png"));
      $$0.put(dxm.b.i, ame.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dxm.b.h, ame.b("textures/entity/piglin/piglin.png"));
      $$0.put(dxm.b.e, hsk.a());
   });

   @Nullable
   public static gph a(gqj $$0, dxm.a $$1) {
      if ($$1 instanceof dxm.b $$2) {
         return (gph)(switch ($$2) {
            case c -> new gpg($$0.a(gqm.dl));
            case d -> new gpg($$0.a(gqm.ef));
            case e -> new gpg($$0.a(gqm.cB));
            case f -> new gpg($$0.a(gqm.er));
            case g -> new gpg($$0.a(gqm.as));
            case i -> new gqg($$0.a(gqm.aF));
            case h -> new gol($$0.a(gqm.cr));
         });
      } else {
         return null;
      }
   }

   public has(had.a $$0) {
      gqj $$1 = $$0.f();
      this.a = ag.b($$1x -> a($$1, $$1x));
   }

   public void a(ecp $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      float $$7 = $$0.a($$1);
      eeb $$8 = $$0.m();
      boolean $$9 = $$8.b() instanceof dzr;
      jh $$10 = $$9 ? $$8.c(dzr.d) : null;
      int $$11 = $$9 ? efh.a($$10.g()) : $$8.c(dxm.e);
      float $$12 = efh.b($$11);
      dxm.a $$13 = ((dov)$$8.b()).b();
      gph $$14 = this.a.apply($$13);
      gxz $$15 = a($$13, $$0.c());
      a($$10, $$12, $$7, $$2, $$3, $$4, $$14, $$15);
   }

   public static void a(@Nullable jh $$0, float $$1, float $$2, fod $$3, gxn $$4, int $$5, gph $$6, gxz $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - $$0.j() * 0.25F, 0.25F, 0.5F - $$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fog $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hri.d);
      $$3.b();
   }

   public static gxz a(dxm.a $$0, @Nullable dfv $$1) {
      return $$0 == dxm.b.e && $$1 != null ? a(fue.R().ao().b($$1.g()).a()) : a($$0, null);
   }

   public static gxz a(dxm.a $$0, @Nullable ame $$1) {
      return gxz.h($$1 != null ? $$1 : b.get($$0));
   }

   public static gxz a(ame $$0) {
      return gxz.j($$0);
   }
}
