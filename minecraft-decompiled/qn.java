import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static void a(qq<ewi> $$0) {
      jm<ewi> $$1 = $$0.a(mn.bk);
      jl<ewi> $$2 = $$1.b(qx.a);
      qx.a(
         $$0,
         "bastion/mobs/piglin",
         new ewi(
            $$2,
            ImmutableList.of(
               Pair.of(ewg.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ewg.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ewg.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ewg.b("bastion/mobs/empty"), 1)
            ),
            ewi.a.b
         )
      );
      qx.a(
         $$0, "bastion/mobs/hoglin", new ewi($$2, ImmutableList.of(Pair.of(ewg.b("bastion/mobs/hoglin"), 2), Pair.of(ewg.b("bastion/mobs/empty"), 1)), ewi.a.b)
      );
      qx.a(
         $$0, "bastion/blocks/gold", new ewi($$2, ImmutableList.of(Pair.of(ewg.b("bastion/blocks/air"), 3), Pair.of(ewg.b("bastion/blocks/gold"), 1)), ewi.a.b)
      );
      qx.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ewi(
            $$2,
            ImmutableList.of(
               Pair.of(ewg.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ewg.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ewg.b("bastion/mobs/sword_piglin"), 1)
            ),
            ewi.a.b
         )
      );
   }
}
