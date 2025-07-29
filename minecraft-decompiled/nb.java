import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class nb implements mx {
   public static final List<bzv<?>> a = List.of(
      bzv.an,
      bzv.J,
      bzv.aH,
      bzv.bd,
      bzv.D,
      bzv.aG,
      bzv.aS,
      bzv.A,
      bzv.bO,
      bzv.aK,
      bzv.ba,
      bzv.az,
      bzv.v,
      bzv.aP,
      bzv.ab,
      bzv.m,
      bzv.al,
      bzv.bv,
      bzv.aj,
      bzv.i,
      bzv.u,
      bzv.f
   );
   public static final List<bzv<?>> b = List.of(bzv.bD, bzv.ac, bzv.bl);
   private static final dcr[] d = new dcr[]{dcz.sy, dcz.sA, dcz.sB, dcz.sz};
   private static final dcr[] e = new dcr[]{dcz.rO, dcz.rP, dcz.rM, dcz.rN};
   private static final dcr[] f = new dcr[]{
      dcz.pz,
      dcz.qw,
      dcz.qC,
      dcz.rc,
      dcz.rd,
      dcz.rf,
      dcz.rg,
      dcz.sy,
      dcz.sz,
      dcz.sA,
      dcz.sB,
      dcz.sC,
      dcz.sD,
      dcz.tr,
      dcz.tv,
      dcz.tz,
      dcz.tA,
      dcz.tB,
      dcz.tC,
      dcz.tD,
      dcz.tL,
      dcz.vH,
      dcz.vI,
      dcz.vJ,
      dcz.vK,
      dcz.vM,
      dcz.vV,
      dcz.wd,
      dcz.we,
      dcz.wf,
      dcz.wq,
      dcz.wr,
      dcz.wJ,
      dcz.wN,
      dcz.wP,
      dcz.tw,
      dcz.xB,
      dcz.ya,
      dcz.yi,
      dcz.yb
   };
   public static final dcr[] c = new dcr[]{dcz.pU, dcz.qe, dcz.pZ, dcz.qj, dcz.qo, dcz.qt};
   private static final Comparator<jl.c<?>> g = Comparator.comparing($$0 -> $$0.h().a());

   @Override
   public void a(jn.a $$0, Consumer<aj> $$1) {
      jm<bzv<?>> $$2 = $$0.e(mn.D);
      jm<dcr> $$3 = $$0.e(mn.N);
      jm<dpz> $$4 = $$0.e(mn.i);
      jn<coe> $$5 = $$0.e(mn.aY);
      jn<cmh> $$6 = $$0.e(mn.aL);
      jn<cpm> $$7 = $$0.e(mn.br);
      jn.b<dji> $$8 = $$0.e(mn.aW);
      aj $$9 = ai.a.a()
         .a(
            dqb.iL,
            xo.c("advancements.husbandry.root.title"),
            xo.c("advancements.husbandry.root.description"),
            ame.b("gui/advancements/backgrounds/husbandry"),
            ap.a,
            false,
            false,
            false
         )
         .a("consumed_item", bi.a.b())
         .a($$1, "husbandry/root");
      aj $$10 = ai.a.a()
         .a($$9)
         .a(dcz.qB, xo.c("advancements.husbandry.plant_seed.title"), xo.c("advancements.husbandry.plant_seed.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("wheat", co.a.a(dqb.cM))
         .a("pumpkin_stem", co.a.a(dqb.fv))
         .a("melon_stem", co.a.a(dqb.fw))
         .a("beetroots", co.a.a(dqb.lj))
         .a("nether_wart", co.a.a(dqb.fP))
         .a("torchflower", co.a.a(dqb.lg))
         .a("pitcher_pod", co.a.a(dqb.lh))
         .a($$1, "husbandry/plant_seed");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(
            dcz.qB,
            xo.c("advancements.husbandry.breed_an_animal.title"),
            xo.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("bred", ba.a.b())
         .a($$1, "husbandry/breed_an_animal");
      a($$11, $$1, $$2, a.stream(), b.stream());
      a(ai.a.a(), $$3)
         .a($$10)
         .a(dcz.pz, xo.c("advancements.husbandry.balanced_diet.title"), xo.c("advancements.husbandry.balanced_diet.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "husbandry/balanced_diet");
      ai.a.a()
         .a($$10)
         .a(dcz.qu, xo.c("advancements.husbandry.netherite_hoe.title"), xo.c("advancements.husbandry.netherite_hoe.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_hoe", cl.a.a(dcz.qu))
         .a($$1, "husbandry/obtain_netherite_hoe");
      aj $$12 = ai.a.a()
         .a($$9)
         .a(
            dcz.wn,
            xo.c("advancements.husbandry.tame_an_animal.title"),
            xo.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("tamed_animal", dv.a.b())
         .a($$1, "husbandry/tame_an_animal");
      aj $$13 = c(ai.a.a(), $$3)
         .a($$9)
         .a(am.a.b)
         .a(
            dcz.su,
            xo.c("advancements.husbandry.fishy_business.title"),
            xo.c("advancements.husbandry.fishy_business.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/fishy_business");
      aj $$14 = b(ai.a.a(), $$3)
         .a($$13)
         .a(am.a.b)
         .a(
            dcz.rM,
            xo.c("advancements.husbandry.tactical_fishing.title"),
            xo.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tactical_fishing");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(am.a.b)
         .a(mm.g.b(dcz.rQ).a(), ce.a.a(cn.a.a().a($$3, dcz.rQ)))
         .a(
            dcz.rQ,
            xo.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            xo.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/axolotl_in_a_bucket");
      ai.a.a()
         .a($$15)
         .a("kill_axolotl_target", bs.a.a(bz.a.a().a($$2, bzv.i)))
         .a(
            dcz.rP,
            xo.c("advancements.husbandry.kill_axolotl_target.title"),
            xo.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/kill_axolotl_target");
      a(ai.a.a(), $$6)
         .a($$12)
         .a(
            dcz.sy,
            xo.c("advancements.husbandry.complete_catalogue.title"),
            xo.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(50))
         .a($$1, "husbandry/complete_catalogue");
      b(ai.a.a(), $$7)
         .a($$12)
         .a(dcz.sY, xo.c("advancements.husbandry.whole_pack.title"), xo.c("advancements.husbandry.whole_pack.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a($$1, "husbandry/whole_pack");
      aj $$16 = ai.a.a()
         .a($$9)
         .a("safely_harvest_honey", co.a.a(cv.a.a().a(az.a.a().a($$4, azo.aM)).a(true), cn.a.a().a($$3, dcz.tJ)))
         .a(
            dcz.yi,
            xo.c("advancements.husbandry.safely_harvest_honey.title"),
            xo.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/safely_harvest_honey");
      aj $$17 = ai.a.a()
         .a($$16)
         .a(dcz.yf, xo.c("advancements.husbandry.wax_on.title"), xo.c("advancements.husbandry.wax_on.description"), null, ap.a, true, true, false)
         .a("wax_on", co.a.a(cv.a.a().a(az.a.a().a($$4, dcm.a.get().keySet())), cn.a.a().a($$3, dcz.yf)))
         .a($$1, "husbandry/wax_on");
      ai.a.a()
         .a($$17)
         .a(dcz.pZ, xo.c("advancements.husbandry.wax_off.title"), xo.c("advancements.husbandry.wax_off.description"), null, ap.a, true, true, false)
         .a("wax_off", co.a.a(cv.a.a().a(az.a.a().a($$4, dcm.b.get().keySet())), cn.a.a().a($$3, c)))
         .a($$1, "husbandry/wax_off");
      aj $$18 = ai.a.a()
         .a($$9)
         .a(mm.g.b(dcz.rR).a(), ce.a.a(cn.a.a().a($$3, dcz.rR)))
         .a(
            dcz.rR,
            xo.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            xo.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/tadpole_in_a_bucket");
      aj $$19 = a($$2, $$3, $$5, ai.a.a())
         .a($$18)
         .a(
            dcz.wn,
            xo.c("advancements.husbandry.leash_all_frog_variants.title"),
            xo.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/leash_all_frog_variants");
      ai.a.a()
         .a($$19)
         .a(dcz.yW, xo.c("advancements.husbandry.froglights.title"), xo.c("advancements.husbandry.froglights.description"), null, ap.b, true, true, false)
         .a("froglights", cl.a.a(dcz.yV, dcz.yX, dcz.yW))
         .a($$1, "husbandry/froglights");
      ai.a.a()
         .a($$9)
         .a("silk_touch_nest", ay.a.a(dqb.pN, cn.a.a().a(bo.a.a().a(la.b, lb.a(List.of(new bu($$8.b(djn.v), cx.d.b(1))))).b()), cx.d.a(3)))
         .a(
            dqb.pN,
            xo.c("advancements.husbandry.silk_touch_nest.title"),
            xo.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "husbandry/silk_touch_nest");
      ai.a.a()
         .a($$9)
         .a(
            dcz.oV,
            xo.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            xo.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", dr.a.a(bz.a.a().a(bz.a.a().a($$2, azs.I).b(bz.a.a().a($$2, bzv.aj)))))
         .a($$1, "husbandry/ride_a_boat_with_a_goat");
      ai.a.a()
         .a($$9)
         .a(
            dcz.sF,
            xo.c("advancements.husbandry.make_a_sign_glow.title"),
            xo.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", co.a.a(cv.a.a().a(az.a.a().a($$4, azo.aH)), cn.a.a().a($$3, dcz.sF)))
         .a($$1, "husbandry/make_a_sign_glow");
      aj $$20 = ai.a.a()
         .a($$9)
         .a(
            dcz.tr,
            xo.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            xo.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", db.a.a(Optional.empty(), Optional.empty(), Optional.of(bz.a(bz.a.a().a($$2, bzv.d)))))
         .a($$1, "husbandry/allay_deliver_item_to_player");
      ai.a.a()
         .a($$20)
         .a(
            dcz.mK,
            xo.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            xo.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", co.a.b(cv.a.a().a(az.a.a().a($$4, dqb.bf)), cn.a.a().a($$3, dcz.ta)))
         .a($$1, "husbandry/allay_deliver_cake_to_note_block");
      aj $$21 = ai.a.a()
         .a($$9)
         .a(
            dcz.kU,
            xo.c("advancements.husbandry.obtain_sniffer_egg.title"),
            xo.c("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("obtain_sniffer_egg", cl.a.a(dcz.kU))
         .a($$1, "husbandry/obtain_sniffer_egg");
      aj $$22 = ai.a.a()
         .a($$21)
         .a(dcz.wL, xo.c("advancements.husbandry.feed_snifflet.title"), xo.c("advancements.husbandry.feed_snifflet.description"), null, ap.a, true, true, true)
         .a("feed_snifflet", dd.a.b(cn.a.a().a($$3, azx.at), Optional.of(bz.a(bz.a.a().a($$2, bzv.bl).a(bx.a.a().g(true))))))
         .a($$1, "husbandry/feed_snifflet");
      ai.a.a()
         .a($$22)
         .a(
            dcz.wM,
            xo.c("advancements.husbandry.plant_any_sniffer_seed.title"),
            xo.c("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a(am.a.b)
         .a("torchflower", co.a.a(dqb.lg))
         .a("pitcher_pod", co.a.a(dqb.lh))
         .a($$1, "husbandry/plant_any_sniffer_seed");
      ai.a.a()
         .a($$12)
         .a(
            dcz.tu,
            xo.c("advancements.husbandry.remove_wolf_armor.title"),
            xo.c("advancements.husbandry.remove_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("remove_wolf_armor", dd.a.a(cn.a.a().a($$3, dcz.pw), Optional.of(bz.a(bz.a.a().a($$2, bzv.bO)))))
         .a($$1, "husbandry/remove_wolf_armor");
      ai.a.a()
         .a($$12)
         .a(
            dcz.pw,
            xo.c("advancements.husbandry.repair_wolf_armor.title"),
            xo.c("advancements.husbandry.repair_wolf_armor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "repair_wolf_armor",
            dd.a.b(cn.a.a().a($$3, dcz.pv), Optional.of(bz.a(bz.a.a().a($$2, bzv.bO).a(bw.a.a().e(cn.a.a().a($$3, dcz.pw).a(bo.a.a().a(kk.a(kq.e, 0)).b()))))))
         )
         .a($$1, "husbandry/repair_wolf_armor");
      ai.a.a()
         .a($$9)
         .a(
            dcz.kV,
            xo.c("advancements.husbandry.place_dried_ghast_in_water.title"),
            xo.c("advancements.husbandry.place_dried_ghast_in_water.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("place_dried_ghast_in_water", co.a.a(dqb.mN, eer.I, true))
         .a($$1, "husbandry/place_dried_ghast_in_water");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jm<bzv<?>> $$2, Stream<bzv<?>> $$3, Stream<bzv<?>> $$4) {
      return a(ai.a.a(), $$3, $$2, $$4)
         .a($$0)
         .a(
            dcz.vM,
            xo.c("advancements.husbandry.breed_all_animals.title"),
            xo.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(100))
         .a($$1, "husbandry/bred_all_animals");
   }

   private static ai.a a(jm<bzv<?>> $$0, jm<dcr> $$1, jn<coe> $$2, ai.a $$3) {
      a($$2)
         .forEach(
            $$3x -> $$3.a(
               $$3x.h().a().toString(), dd.a.b(cn.a.a().a($$1, dcz.wn), Optional.of(bz.a(bz.a.a().a($$0, bzv.ac).a(bo.a.a().a(kk.a(kq.aK, $$3x)).b()))))
            )
         );
      return $$3;
   }

   private static <T> Stream<jl.c<T>> a(jn<T> $$0) {
      return $$0.c().sorted(g);
   }

   private static ai.a a(ai.a $$0, jm<dcr> $$1) {
      for (dcr $$2 : f) {
         $$0.a(mm.g.b($$2).a(), bi.a.a($$1, $$2));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, Stream<bzv<?>> $$1, jm<bzv<?>> $$2, Stream<bzv<?>> $$3) {
      $$1.forEach($$2x -> $$0.a(bzv.a($$2x).toString(), ba.a.a(bz.a.a().a($$2, $$2x))));
      $$3.forEach(
         $$2x -> $$0.a(bzv.a($$2x).toString(), ba.a.a(Optional.of(bz.a.a().a($$2, $$2x).b()), Optional.of(bz.a.a().a($$2, $$2x).b()), Optional.empty()))
      );
      return $$0;
   }

   private static ai.a b(ai.a $$0, jm<dcr> $$1) {
      for (dcr $$2 : e) {
         $$0.a(mm.g.b($$2).a(), ce.a.a(cn.a.a().a($$1, $$2)));
      }

      return $$0;
   }

   private static ai.a c(ai.a $$0, jm<dcr> $$1) {
      for (dcr $$2 : d) {
         $$0.a(mm.g.b($$2).a(), cg.a.a(Optional.empty(), Optional.empty(), Optional.of(cn.a.a().a($$1, $$2).b())));
      }

      return $$0;
   }

   private static ai.a a(ai.a $$0, jn<cmh> $$1) {
      a($$1).forEach($$1x -> $$0.a($$1x.h().a().toString(), dv.a.a(bz.a.a().a(bo.a.a().a(kk.a(kq.aP, $$1x)).b()))));
      return $$0;
   }

   private static ai.a b(ai.a $$0, jn<cpm> $$1) {
      a($$1).forEach($$1x -> $$0.a($$1x.h().a().toString(), dv.a.a(bz.a.a().a(bo.a.a().a(kk.a(kq.aw, $$1x)).b()))));
      return $$0;
   }
}
