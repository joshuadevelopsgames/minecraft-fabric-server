import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qq<ewi> $$0) {
      jm<eyy> $$1 = $$0.a(mn.bh);
      jl<eyy> $$2 = $$1.b(qy.y);
      jl<eyy> $$3 = $$1.b(qy.w);
      jl<eyy> $$4 = $$1.b(qy.z);
      jl<eyy> $$5 = $$1.b(qy.x);
      jm<ewi> $$6 = $$0.a(mn.bk);
      jl<ewi> $$7 = $$6.b(qx.a);
      qx.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ewi(
            $$7,
            ImmutableList.of(
               Pair.of(ewg.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ewg.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ewi.a.b
         )
      );
      qx.a($$0, "bastion/bridge/bridge_pieces", new ewi($$7, ImmutableList.of(Pair.of(ewg.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ewi.a.b));
      qx.a(
         $$0,
         "bastion/bridge/legs",
         new ewi($$7, ImmutableList.of(Pair.of(ewg.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ewg.b("bastion/bridge/legs/leg_1", $$3), 1)), ewi.a.b)
      );
      qx.a(
         $$0,
         "bastion/bridge/walls",
         new ewi(
            $$7,
            ImmutableList.of(Pair.of(ewg.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ewg.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ewi.a.b
         )
      );
      qx.a(
         $$0,
         "bastion/bridge/ramparts",
         new ewi(
            $$7,
            ImmutableList.of(Pair.of(ewg.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ewg.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ewi.a.b
         )
      );
      qx.a($$0, "bastion/bridge/rampart_plates", new ewi($$7, ImmutableList.of(Pair.of(ewg.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ewi.a.b));
      qx.a(
         $$0,
         "bastion/bridge/connectors",
         new ewi(
            $$7,
            ImmutableList.of(
               Pair.of(ewg.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ewg.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ewi.a.b
         )
      );
   }
}
