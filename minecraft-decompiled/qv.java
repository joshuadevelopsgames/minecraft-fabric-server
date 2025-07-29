import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static final amd<ewi> a = qx.a("pillager_outpost/base_plates");

   public static void a(qq<ewi> $$0) {
      jm<eyy> $$1 = $$0.a(mn.bh);
      jl<eyy> $$2 = $$1.b(qy.q);
      jm<ewi> $$3 = $$0.a(mn.bk);
      jl<ewi> $$4 = $$3.b(qx.a);
      $$0.a(a, new ewi($$4, ImmutableList.of(Pair.of(ewg.a("pillager_outpost/base_plate"), 1)), ewi.a.b));
      qx.a(
         $$0,
         "pillager_outpost/towers",
         new ewi(
            $$4,
            ImmutableList.of(Pair.of(ewg.b(ImmutableList.of(ewg.a("pillager_outpost/watchtower"), ewg.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ewi.a.b
         )
      );
      qx.a($$0, "pillager_outpost/feature_plates", new ewi($$4, ImmutableList.of(Pair.of(ewg.a("pillager_outpost/feature_plate"), 1)), ewi.a.a));
      qx.a(
         $$0,
         "pillager_outpost/features",
         new ewi(
            $$4,
            ImmutableList.of(
               Pair.of(ewg.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ewg.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ewg.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ewg.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ewg.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ewg.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ewg.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ewg.i(), 6)
            ),
            ewi.a.b
         )
      );
   }
}
