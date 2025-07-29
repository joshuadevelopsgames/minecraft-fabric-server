import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class na implements mx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 384;
   private static final int c = 320;
   private static final int d = -64;
   private static final int e = 5;
   private static final Map<cap, Set<bzv<?>>> f = Map.of(cap.a, Set.of(bzv.ag, bzv.ap, bzv.bI));
   private static final List<bzv<?>> g = Arrays.asList(
      bzv.p,
      bzv.r,
      bzv.s,
      bzv.w,
      bzv.E,
      bzv.F,
      bzv.L,
      bzv.N,
      bzv.Q,
      bzv.O,
      bzv.P,
      bzv.T,
      bzv.ae,
      bzv.ak,
      bzv.al,
      bzv.ao,
      bzv.aB,
      bzv.aR,
      bzv.aT,
      bzv.aU,
      bzv.aV,
      bzv.bb,
      bzv.be,
      bzv.bg,
      bzv.bh,
      bzv.bj,
      bzv.bq,
      bzv.bu,
      bzv.bE,
      bzv.bG,
      bzv.bK,
      bzv.bM,
      bzv.bL,
      bzv.bP,
      bzv.bS,
      bzv.bQ,
      bzv.bT
   );

   private static ar<cu.a> a(cx.d $$0, Optional<bz> $$1) {
      return cu.a.a(Optional.of(bz.a.a().a(bq.c(cx.c.c(30.0))).a(ct.a($$0)).b()), $$1);
   }

   private static ar<ea.a> a(bz.a $$0, cn.a $$1) {
      return ea.a.a(bz.a.a().a(de.d.a().a($$0).b()), $$1);
   }

   @Override
   public void a(jn.a $$0, Consumer<aj> $$1) {
      jn<bzv<?>> $$2 = $$0.e(mn.D);
      jn<dcr> $$3 = $$0.e(mn.N);
      jn<dpz> $$4 = $$0.e(mn.i);
      aj $$5 = ai.a.a()
         .a(
            dcz.vL,
            xo.c("advancements.adventure.root.title"),
            xo.c("advancements.adventure.root.description"),
            ame.b("gui/advancements/backgrounds/adventure"),
            ap.a,
            false,
            false,
            false
         )
         .a(am.a.b)
         .a("killed_something", cq.a.b())
         .a("killed_by_something", cq.a.d())
         .a($$1, "adventure/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dqb.bu, xo.c("advancements.adventure.sleep_in_bed.title"), xo.c("advancements.adventure.sleep_in_bed.description"), null, ap.a, true, true, false)
         .a("slept_in_bed", df.a.b())
         .a($$1, "adventure/sleep_in_bed");
      a($$0, $$1, $$6, dol.a.b);
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dcz.pF, xo.c("advancements.adventure.trade.title"), xo.c("advancements.adventure.trade.description"), null, ap.a, true, true, false)
         .a("traded", dx.a.b())
         .a($$1, "adventure/trade");
      ai.a.a()
         .a($$7)
         .a(
            dcz.pF,
            xo.c("advancements.adventure.trade_at_world_height.title"),
            xo.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dx.a.a(bz.a.a().a(cv.a.a(cx.c.b(319.0)))))
         .a($$1, "adventure/trade_at_world_height");
      aj $$8 = a($$5, $$1, $$2, a(g, $$2));
      aj $$9 = ai.a.a()
         .a($$8)
         .a(dcz.pA, xo.c("advancements.adventure.shoot_arrow.title"), xo.c("advancements.adventure.shoot_arrow.description"), null, ap.a, true, true, false)
         .a("shot_arrow", dc.a.a(bm.a.a().a(bn.a.a().a(du.a(azp.j)).a(bz.a.a().a($$2, azs.f)))))
         .a($$1, "adventure/shoot_arrow");
      aj $$10 = ai.a.a()
         .a($$8)
         .a(dcz.xx, xo.c("advancements.adventure.throw_trident.title"), xo.c("advancements.adventure.throw_trident.description"), null, ap.a, true, true, false)
         .a("shot_trident", dc.a.a(bm.a.a().a(bn.a.a().a(du.a(azp.j)).a(bz.a.a().a($$2, bzv.bB)))))
         .a($$1, "adventure/throw_trident");
      ai.a.a()
         .a($$10)
         .a(
            dcz.xx,
            xo.c("advancements.adventure.very_very_frightening.title"),
            xo.c("advancements.adventure.very_very_frightening.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("struck_villager", bd.a.a(bz.a.a().a($$2, bzv.bF)))
         .a($$1, "adventure/very_very_frightening");
      ai.a.a()
         .a($$7)
         .a(
            dqb.ev,
            xo.c("advancements.adventure.summon_iron_golem.title"),
            xo.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("summoned_golem", dt.a.a(bz.a.a().a($$2, bzv.ar)))
         .a($$1, "adventure/summon_iron_golem");
      ai.a.a()
         .a($$9)
         .a(dcz.pB, xo.c("advancements.adventure.sniper_duel.title"), xo.c("advancements.adventure.sniper_duel.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_skeleton", cq.a.a(bz.a.a().a($$2, bzv.bh).a(bq.a(cx.c.b(50.0))), bn.a.a().a(du.a(azp.j))))
         .a($$1, "adventure/sniper_duel");
      ai.a.a()
         .a($$8)
         .a(
            dcz.wW,
            xo.c("advancements.adventure.totem_of_undying.title"),
            xo.c("advancements.adventure.totem_of_undying.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("used_totem", dz.a.a($$3, dcz.wW))
         .a($$1, "adventure/totem_of_undying");
      aj $$11 = ai.a.a()
         .a($$5)
         .a(dcz.xA, xo.c("advancements.adventure.ol_betsy.title"), xo.c("advancements.adventure.ol_betsy.description"), null, ap.a, true, true, false)
         .a("shot_crossbow", dk.a.a($$3, dcz.xA))
         .a($$1, "adventure/ol_betsy");
      ai.a.a()
         .a($$11)
         .a(
            dcz.xA,
            xo.c("advancements.adventure.whos_the_pillager_now.title"),
            xo.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cp.a.a($$3, bz.a.a().a($$2, bzv.aV)))
         .a($$1, "adventure/whos_the_pillager_now");
      ai.a.a()
         .a($$11)
         .a(
            dcz.xA,
            xo.c("advancements.adventure.two_birds_one_arrow.title"),
            xo.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(65))
         .a("two_birds", cp.a.a($$3, bz.a.a().a($$2, bzv.aR), bz.a.a().a($$2, bzv.aR)))
         .a($$1, "adventure/two_birds_one_arrow");
      ai.a.a()
         .a($$11)
         .a(dcz.xA, xo.c("advancements.adventure.arbalistic.title"), xo.c("advancements.adventure.arbalistic.description"), null, ap.b, true, true, true)
         .a(an.a.a(85))
         .a("arbalistic", cp.a.a($$3, cx.d.a(5)))
         .a($$1, "adventure/arbalistic");
      jn.b<eao> $$12 = $$0.e(mn.aJ);
      aj $$13 = ai.a.a()
         .a($$5)
         .a(
            cwj.a($$12),
            xo.c("advancements.adventure.voluntary_exile.title"),
            xo.c("advancements.adventure.voluntary_exile.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cq.a.a(bz.a.a().a($$2, azs.c).a(bw.a($$3, $$12))))
         .a($$1, "adventure/voluntary_exile");
      ai.a.a()
         .a($$13)
         .a(
            cwj.a($$12),
            xo.c("advancements.adventure.hero_of_the_village.title"),
            xo.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ap.b,
            true,
            true,
            true
         )
         .a(an.a.a(100))
         .a("hero_of_the_village", df.a.c())
         .a($$1, "adventure/hero_of_the_village");
      ai.a.a()
         .a($$5)
         .a(
            dqb.pP.h(),
            xo.c("advancements.adventure.honey_block_slide.title"),
            xo.c("advancements.adventure.honey_block_slide.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", dn.a.a(dqb.pP))
         .a($$1, "adventure/honey_block_slide");
      ai.a.a()
         .a($$9)
         .a(dqb.pM.h(), xo.c("advancements.adventure.bullseye.title"), xo.c("advancements.adventure.bullseye.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("bullseye", dw.a.a(cx.d.a(15), Optional.of(bz.a(bz.a.a().a(bq.a(cx.c.b(30.0)))))))
         .a($$1, "adventure/bullseye");
      ai.a.a()
         .a($$6)
         .a(
            dcz.qG,
            xo.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            xo.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", df.a.a($$4, $$3, dqb.ry, dcz.qG))
         .a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
      ai.a.a()
         .a($$5)
         .a(
            dcz.mC,
            xo.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            xo.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cx.d.a(0), Optional.of(bz.a.a().a($$2, bzv.bF).b())))
         .a($$1, "adventure/lightning_rod_with_villager_no_fire");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dcz.sw,
            xo.c("advancements.adventure.spyglass_at_parrot.title"),
            xo.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bz.a.a().a($$2, bzv.aQ), cn.a.a().a($$3, dcz.sw)))
         .a($$1, "adventure/spyglass_at_parrot");
      aj $$15 = ai.a.a()
         .a($$14)
         .a(
            dcz.sw,
            xo.c("advancements.adventure.spyglass_at_ghast.title"),
            xo.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bz.a.a().a($$2, bzv.ae), cn.a.a().a($$3, dcz.sw)))
         .a($$1, "adventure/spyglass_at_ghast");
      ai.a.a()
         .a($$6)
         .a(
            dcz.ft,
            xo.c("advancements.adventure.play_jukebox_in_meadows.title"),
            xo.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", co.a.a(cv.a.a().a(jp.a($$0.e(mn.aK).b(doe.E))).a(az.a.a().a($$4, dqb.ek)), cn.a.a().a(bo.a.a().a(la.n, le.b()).b())))
         .a($$1, "adventure/play_jukebox_in_meadows");
      ai.a.a()
         .a($$15)
         .a(
            dcz.sw,
            xo.c("advancements.adventure.spyglass_at_dragon.title"),
            xo.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bz.a.a().a($$2, bzv.Q), cn.a.a().a($$3, dcz.sw)))
         .a($$1, "adventure/spyglass_at_dragon");
      ai.a.a()
         .a($$5)
         .a(
            dcz.rG,
            xo.c("advancements.adventure.fall_from_world_height.title"),
            xo.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", br.a.a(bz.a.a().a(cv.a.a(cx.c.c(-59.0))), bq.b(cx.c.b(379.0)), cv.a.a(cx.c.b(319.0))))
         .a($$1, "adventure/fall_from_world_height");
      ai.a.a()
         .a($$8)
         .a(
            dqb.rD,
            xo.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            xo.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cq.a.c())
         .a($$1, "adventure/kill_mob_near_sculk_catalyst");
      ai.a.a()
         .a($$5)
         .a(
            dqb.rz,
            xo.c("advancements.adventure.avoid_vibration.title"),
            xo.c("advancements.adventure.avoid_vibration.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", df.a.d())
         .a($$1, "adventure/avoid_vibration");
      aj $$16 = a($$3, ai.a.a())
         .a($$5)
         .a(dcz.za, xo.c("advancements.adventure.salvage_sherd.title"), xo.c("advancements.adventure.salvage_sherd.description"), null, ap.a, true, true, false)
         .a($$1, "adventure/salvage_sherd");
      ai.a.a()
         .a($$16)
         .a(
            ebr.a(new ech(Optional.empty(), Optional.of(dcz.zF), Optional.empty(), Optional.of(dcz.zB))),
            xo.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            xo.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(
            "pot_crafted_using_only_sherds",
            dh.a.a(
               amd.a(mn.bA, ame.b("decorated_pot")),
               List.of(cn.a.a().a($$3, azx.bJ), cn.a.a().a($$3, azx.bJ), cn.a.a().a($$3, azx.bJ), cn.a.a().a($$3, azx.bJ))
            )
         )
         .a($$1, "adventure/craft_decorated_pot_using_only_sherds");
      aj $$17 = b(ai.a.a())
         .a($$5)
         .a(
            new dcv(dcz.zd),
            xo.c("advancements.adventure.trim_with_any_armor_pattern.title"),
            xo.c("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$1, "adventure/trim_with_any_armor_pattern");
      a(ai.a.a())
         .a($$17)
         .a(
            new dcv(dcz.zp),
            xo.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            xo.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(150))
         .a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
      ai.a.a()
         .a($$5)
         .a(
            dcz.eU,
            xo.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            xo.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("chiseled_bookshelf", a($$4, dqb.cw))
         .a("comparator", b($$4, dqb.cw))
         .a($$1, "adventure/read_power_of_chiseled_bookshelf");
      ai.a.a()
         .a($$5)
         .a(
            dcz.pv,
            xo.c("advancements.adventure.brush_armadillo.title"),
            xo.c("advancements.adventure.brush_armadillo.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("brush_armadillo", dd.a.b(cn.a.a().a($$3, dcz.za), Optional.of(bz.a(bz.a.a().a($$2, bzv.f)))))
         .a($$1, "adventure/brush_armadillo");
      aj $$18 = ai.a.a()
         .a($$5)
         .a(
            dqb.rq,
            xo.c("advancements.adventure.minecraft_trials_edition.title"),
            xo.c("advancements.adventure.minecraft_trials_edition.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("minecraft_trials_edition", df.a.a(cv.a.b($$0.e(mn.bj).b(eus.H))))
         .a($$1, "adventure/minecraft_trials_edition");
      ai.a.a()
         .a($$18)
         .a(dcz.zZ, xo.c("advancements.adventure.lighten_up.title"), xo.c("advancements.adventure.lighten_up.description"), null, ap.a, true, true, false)
         .a("lighten_up", co.a.a(cv.a.a().a(az.a.a().a($$4, dqb.sW, dqb.sV, dqb.sU, dqb.ta, dqb.sZ, dqb.sY).a(ds.a.a().a(dro.c, true))), cn.a.a().a($$3, nb.c)))
         .a($$1, "adventure/lighten_up");
      aj $$19 = ai.a.a()
         .a($$18)
         .a(
            dcz.Ai,
            xo.c("advancements.adventure.under_lock_and_key.title"),
            xo.c("advancements.adventure.under_lock_and_key.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("under_lock_and_key", co.a.a(cv.a.a().a(az.a.a().a($$4, dqb.ud).a(ds.a.a().a(dzk.d, false))), cn.a.a().a($$3, dcz.Ai)))
         .a($$1, "adventure/under_lock_and_key");
      ai.a.a()
         .a($$19)
         .a(dcz.Aj, xo.c("advancements.adventure.revaulting.title"), xo.c("advancements.adventure.revaulting.description"), null, ap.c, true, true, false)
         .a("revaulting", co.a.a(cv.a.a().a(az.a.a().a($$4, dqb.ud).a(ds.a.a().a(dzk.d, true))), cn.a.a().a($$3, dcz.Aj)))
         .a($$1, "adventure/revaulting");
      ai.a.a()
         .a($$18)
         .a(dcz.vz, xo.c("advancements.adventure.blowback.title"), xo.c("advancements.adventure.blowback.description"), null, ap.b, true, true, false)
         .a(an.a.a(40))
         .a("blowback", cq.a.a(bz.a.a().a($$2, bzv.s), bn.a.a().a(du.a(azp.j)).a(bz.a.a().a($$2, bzv.t))))
         .a($$1, "adventure/blowback");
      ai.a.a()
         .a($$5)
         .a(
            dcz.ts,
            xo.c("advancements.adventure.crafters_crafting_crafters.title"),
            xo.c("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crafter_crafted_crafter", dh.a.b(amd.a(mn.bA, ame.b("crafter"))))
         .a($$1, "adventure/crafters_crafting_crafters");
      ai.a.a()
         .a($$5)
         .a(dcz.yk, xo.c("advancements.adventure.use_lodestone.title"), xo.c("advancements.adventure.use_lodestone.description"), null, ap.a, true, true, false)
         .a("use_lodestone", co.a.a(cv.a.a().a(az.a.a().a($$4, dqb.pZ)), cn.a.a().a($$3, dcz.sb)))
         .a($$1, "adventure/use_lodestone");
      ai.a.a()
         .a($$18)
         .a(
            dcz.vz,
            xo.c("advancements.adventure.who_needs_rockets.title"),
            xo.c("advancements.adventure.who_needs_rockets.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("who_needs_rockets", cd.a.a(bq.b(cx.c.b(7.0)), bz.a.a().a($$2, bzv.bJ)))
         .a($$1, "adventure/who_needs_rockets");
      ai.a.a()
         .a($$18)
         .a(dcz.vD, xo.c("advancements.adventure.overoverkill.title"), xo.c("advancements.adventure.overoverkill.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("overoverkill", dc.a.a(bm.a.a().a(cx.c.b(100.0)).a(bn.a.a().a(du.a(azp.H)).a(bz.a.a().a($$2, bzv.bU).a(bw.a.a().f(cn.a.a().a($$3, dcz.vD)))))))
         .a($$1, "adventure/overoverkill");
      ai.a.a()
         .a($$5)
         .a(
            dqb.cE,
            xo.c("advancements.adventure.heart_transplanter.title"),
            xo.c("advancements.adventure.heart_transplanter.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(am.a.b)
         .a("place_creaking_heart_dormant", co.a.a(dqb.cE, eer.bE, eev.b))
         .a("place_creaking_heart_awake", co.a.a(dqb.cE, eer.bE, eev.c))
         .a("place_pale_oak_log", a($$4, azo.s))
         .a($$1, "adventure/heart_transplanter");
   }

   public static aj a(aj $$0, Consumer<aj> $$1, jm<bzv<?>> $$2, List<bzv<?>> $$3) {
      aj $$4 = a(ai.a.a(), $$2, $$3)
         .a($$0)
         .a(dcz.qg, xo.c("advancements.adventure.kill_a_mob.title"), xo.c("advancements.adventure.kill_a_mob.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a($$1, "adventure/kill_a_mob");
      a(ai.a.a(), $$2, $$3)
         .a($$4)
         .a(dcz.ql, xo.c("advancements.adventure.kill_all_mobs.title"), xo.c("advancements.adventure.kill_all_mobs.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a($$1, "adventure/kill_all_mobs");
      return $$4;
   }

   private static ar<co.a> a(jm<dpz> $$0, dpz $$1) {
      fgs.a[] $$2 = drk.f.a().stream().map($$1x -> {
         ds.a $$2x = ds.a.a().a(drk.f, $$1x);
         az.a $$3 = az.a.a().a($$0, dqb.hz).a($$2x);
         return fgq.a(cv.a.a().a($$3), new jb($$1x.g().q()));
      }).toArray(fgs.a[]::new);
      return co.a.a(fgr.a($$1), fgg.a($$2));
   }

   private static ar<co.a> b(jm<dpz> $$0, dpz $$1) {
      fgs.a[] $$2 = drk.f.a().stream().map($$2x -> {
         ds.a $$3 = ds.a.a().a(drk.f, $$2x);
         fgr.a $$4 = new fgr.a(dqb.hz).a($$3);
         fgs.a $$5 = fgq.a(cv.a.a().a(az.a.a().a($$0, $$1)), new jb($$2x.q()));
         return fgf.a($$4, $$5);
      }).toArray(fgs.a[]::new);
      return co.a.a(fgg.a($$2));
   }

   private static ar<co.a> a(jm<dpz> $$0, bae<dpz> $$1) {
      fgs.a[] $$2 = Stream.of(jh.values()).map($$2x -> {
         ds.a $$3 = ds.a.a().a(drv.b, $$2x.o());
         az.a $$4 = az.a.a().a($$0, $$1).a($$3);
         kg $$5 = $$2x.q();
         fgs.a $$6 = fgq.a(cv.a.a().a($$4));
         fgs.a $$7 = fgq.a(cv.a.a().a(az.a.a().a($$0, dqb.cE).a($$3)), new jb($$5));
         fgs.a $$8 = fgq.a(cv.a.a().a($$4), new jb($$5.o(2)));
         return fgf.a($$6, $$7, $$8);
      }).toArray(fgs.a[]::new);
      return co.a.a(fgg.a($$2));
   }

   private static ai.a a(ai.a $$0) {
      $$0.a(am.a.a);
      Set<dcr> $$1 = Set.of(dcz.zm, dcz.zk, dcz.zl, dcz.zg, dcz.zp, dcz.zi, dcz.zj, dcz.zn);
      ox.b().filter($$1x -> $$1.contains($$1x.a())).forEach($$1x -> $$0.a("armor_trimmed_" + $$1x.c().a(), dh.a.a($$1x.c())));
      return $$0;
   }

   private static ai.a b(ai.a $$0) {
      $$0.a(am.a.b);
      ox.b().map(ox.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + $$1.a(), dh.a.a((amd<dhm<?>>)$$1)));
      return $$0;
   }

   private static ai.a a(jm<dcr> $$0, ai.a $$1) {
      List<Pair<String, ar<cw.a>>> $$2 = List.of(
         Pair.of("desert_pyramid", cw.a.a(fdf.aY)),
         Pair.of("desert_well", cw.a.a(fdf.aX)),
         Pair.of("ocean_ruin_cold", cw.a.a(fdf.bc)),
         Pair.of("ocean_ruin_warm", cw.a.a(fdf.bb)),
         Pair.of("trail_ruins_rare", cw.a.a(fdf.ba)),
         Pair.of("trail_ruins_common", cw.a.a(fdf.aZ))
      );
      $$2.forEach($$1x -> $$1.a((String)$$1x.getFirst(), (ar<?>)$$1x.getSecond()));
      String $$3 = "has_sherd";
      $$1.a("has_sherd", cl.a.a(cn.a.a().a($$0, azx.bJ)));
      $$1.a(new am(List.of($$2.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return $$1;
   }

   protected static void a(jn.a $$0, Consumer<aj> $$1, aj $$2, dol.a $$3) {
      a(ai.a.a(), $$0, $$3.a().toList())
         .a($$2)
         .a(
            dcz.qS,
            xo.c("advancements.adventure.adventuring_time.title"),
            xo.c("advancements.adventure.adventuring_time.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(an.a.a(500))
         .a($$1, "adventure/adventuring_time");
   }

   private static ai.a a(ai.a $$0, jm<bzv<?>> $$1, List<bzv<?>> $$2) {
      $$2.forEach($$2x -> $$0.a(mm.f.b($$2x).toString(), cq.a.a(bz.a.a().a($$1, $$2x))));
      return $$0;
   }

   protected static ai.a a(ai.a $$0, jn.a $$1, List<amd<dnx>> $$2) {
      jm<dnx> $$3 = $$1.e(mn.aK);

      for (amd<dnx> $$4 : $$2) {
         $$0.a($$4.a().toString(), df.a.a(cv.a.a($$3.b($$4))));
      }

      return $$0;
   }

   private static List<bzv<?>> a(List<bzv<?>> $$0, jn<bzv<?>> $$1) {
      List<String> $$2 = new ArrayList<>();
      Set<? extends bzv<?>> $$3 = Set.copyOf($$0);
      Set<cap> $$4 = $$3.stream().map(bzv::f).collect(Collectors.toSet());
      Set<cap> $$5 = Sets.symmetricDifference(f.keySet(), $$4);
      if (!$$5.isEmpty()) {
         $$2.add(
            "Found EntityType with MobCategory only in either expected exceptions or kill_all_mobs advancement: %s"
               .formatted($$5.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))
         );
      }

      Set<bzv<?>> $$6 = Sets.intersection(f.values().stream().flatMap(Collection::stream).collect(Collectors.toSet()), $$3);
      if (!$$6.isEmpty()) {
         $$2.add(
            "Found EntityType in both expected exceptions and kill_all_mobs advancement: %s"
               .formatted($$6.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))
         );
      }

      Map<cap, Set<bzv<?>>> $$7 = $$1.c().map(jl.c::a).filter(Predicate.not($$3::contains)).collect(Collectors.groupingBy(bzv::f, Collectors.toSet()));
      f.forEach(
         ($$2x, $$3x) -> {
            Set<bzv<?>> $$4x = Sets.difference($$7.getOrDefault($$2x, Set.of()), $$3x);
            if (!$$4x.isEmpty()) {
               $$2.add(
                  "Found (new?) EntityType with MobCategory %s which are in neither expected exceptions nor kill_all_mobs advancement: %s"
                     .formatted($$2x, $$4x.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))
               );
            }
         }
      );
      if (!$$2.isEmpty()) {
         $$2.forEach(a::error);
         throw new IllegalStateException("Found inconsistencies with kill_all_mobs advancement");
      } else {
         return $$0;
      }
   }
}
