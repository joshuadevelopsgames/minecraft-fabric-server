import java.util.Optional;
import java.util.function.Consumer;

public class nc implements mx {
   @Override
   public void a(jn.a $$0, Consumer<aj> $$1) {
      jm<bzv<?>> $$2 = $$0.e(mn.D);
      jm<dcr> $$3 = $$0.e(mn.N);
      jm<dpz> $$4 = $$0.e(mn.i);
      aj $$5 = ai.a.a()
         .a(
            dqb.lr,
            xo.c("advancements.nether.root.title"),
            xo.c("advancements.nether.root.description"),
            ame.b("gui/advancements/backgrounds/nether"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_nether", bc.a.a(dmu.j))
         .a($$1, "nether/root");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dcz.vy, xo.c("advancements.nether.return_to_sender.title"), xo.c("advancements.nether.return_to_sender.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("killed_ghast", cq.a.a(bz.a.a().a($$2, bzv.ae), bn.a.a().a(du.a(azp.j)).a(bz.a.a().a($$2, bzv.Z))))
         .a($$1, "nether/return_to_sender");
      aj $$7 = ai.a.a()
         .a($$5)
         .a(dqb.fM, xo.c("advancements.nether.find_fortress.title"), xo.c("advancements.nether.find_fortress.description"), null, ap.a, true, true, false)
         .a("fortress", df.a.a(cv.a.b($$0.e(mn.bj).b(eus.o))))
         .a($$1, "nether/find_fortress");
      ai.a.a()
         .a($$5)
         .a(dcz.vL, xo.c("advancements.nether.fast_travel.title"), xo.c("advancements.nether.fast_travel.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("travelled", br.a.a(bq.a(cx.c.b(7000.0))))
         .a($$1, "nether/fast_travel");
      ai.a.a()
         .a($$6)
         .a(dcz.tG, xo.c("advancements.nether.uneasy_alliance.title"), xo.c("advancements.nether.uneasy_alliance.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("killed_ghast", cq.a.a(bz.a.a().a($$2, bzv.ae).a(cv.a.a(dmu.i))))
         .a($$1, "nether/uneasy_alliance");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dqb.hh, xo.c("advancements.nether.get_wither_skull.title"), xo.c("advancements.nether.get_wither_skull.description"), null, ap.a, true, true, false)
         .a("wither_skull", cl.a.a(dqb.hh))
         .a($$1, "nether/get_wither_skull");
      aj $$9 = ai.a.a()
         .a($$8)
         .a(dcz.vU, xo.c("advancements.nether.summon_wither.title"), xo.c("advancements.nether.summon_wither.description"), null, ap.a, true, true, false)
         .a("summoned", dt.a.a(bz.a.a().a($$2, bzv.bL)))
         .a($$1, "nether/summon_wither");
      aj $$10 = ai.a.a()
         .a($$7)
         .a(dcz.tF, xo.c("advancements.nether.obtain_blaze_rod.title"), xo.c("advancements.nether.obtain_blaze_rod.description"), null, ap.a, true, true, false)
         .a("blaze_rod", cl.a.a(dcz.tF))
         .a($$1, "nether/obtain_blaze_rod");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dqb.gn, xo.c("advancements.nether.create_beacon.title"), xo.c("advancements.nether.create_beacon.description"), null, ap.a, true, true, false)
         .a("beacon", bh.a.a(cx.d.b(1)))
         .a($$1, "nether/create_beacon");
      ai.a.a()
         .a($$11)
         .a(
            dqb.gn,
            xo.c("advancements.nether.create_full_beacon.title"),
            xo.c("advancements.nether.create_full_beacon.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("beacon", bh.a.a(cx.d.a(4)))
         .a($$1, "nether/create_full_beacon");
      aj $$12 = ai.a.a()
         .a($$10)
         .a(dcz.tK, xo.c("advancements.nether.brew_potion.title"), xo.c("advancements.nether.brew_potion.description"), null, ap.a, true, true, false)
         .a("potion", bb.a.b())
         .a($$1, "nether/brew_potion");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(dcz.rL, xo.c("advancements.nether.all_potions.title"), xo.c("advancements.nether.all_potions.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a(
            "all_effects",
            bs.a.a(
               cy.a.a()
                  .a(bys.a)
                  .a(bys.b)
                  .a(bys.e)
                  .a(bys.h)
                  .a(bys.j)
                  .a(bys.l)
                  .a(bys.m)
                  .a(bys.n)
                  .a(bys.p)
                  .a(bys.r)
                  .a(bys.s)
                  .a(bys.B)
                  .a(bys.k)
                  .a(bys.L)
                  .a(bys.M)
                  .a(bys.J)
                  .a(bys.K)
            )
         )
         .a($$1, "nether/all_potions");
      ai.a.a()
         .a($$13)
         .a(dcz.rF, xo.c("advancements.nether.all_effects.title"), xo.c("advancements.nether.all_effects.description"), null, ap.b, true, true, true)
         .a(an.a.a(1000))
         .a(
            "all_effects",
            bs.a.a(
               cy.a.a()
                  .a(bys.a)
                  .a(bys.b)
                  .a(bys.e)
                  .a(bys.h)
                  .a(bys.j)
                  .a(bys.l)
                  .a(bys.m)
                  .a(bys.n)
                  .a(bys.p)
                  .a(bys.r)
                  .a(bys.s)
                  .a(bys.t)
                  .a(bys.c)
                  .a(bys.d)
                  .a(bys.y)
                  .a(bys.x)
                  .a(bys.v)
                  .a(bys.q)
                  .a(bys.i)
                  .a(bys.k)
                  .a(bys.B)
                  .a(bys.C)
                  .a(bys.D)
                  .a(bys.o)
                  .a(bys.E)
                  .a(bys.F)
                  .a(bys.G)
                  .a(bys.L)
                  .a(bys.M)
                  .a(bys.J)
                  .a(bys.K)
                  .a(bys.H)
                  .a(bys.I)
            )
         )
         .a($$1, "nether/all_effects");
      aj $$14 = ai.a.a()
         .a($$5)
         .a(
            dcz.aE,
            xo.c("advancements.nether.obtain_ancient_debris.title"),
            xo.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ancient_debris", cl.a.a(dcz.aE))
         .a($$1, "nether/obtain_ancient_debris");
      ai.a.a()
         .a($$14)
         .a(dcz.qY, xo.c("advancements.nether.netherite_armor.title"), xo.c("advancements.nether.netherite_armor.description"), null, ap.b, true, true, false)
         .a(an.a.a(100))
         .a("netherite_armor", cl.a.a(dcz.qX, dcz.qY, dcz.qZ, dcz.ra))
         .a($$1, "nether/netherite_armor");
      aj $$15 = ai.a.a()
         .a($$5)
         .a(
            dcz.yl,
            xo.c("advancements.nether.obtain_crying_obsidian.title"),
            xo.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", cl.a.a(dcz.yl))
         .a($$1, "nether/obtain_crying_obsidian");
      ai.a.a()
         .a($$15)
         .a(
            dcz.yy,
            xo.c("advancements.nether.charge_respawn_anchor.title"),
            xo.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", co.a.a(cv.a.a().a(az.a.a().a($$4, dqb.pU).a(ds.a.a().a(dwp.d, 4))), cn.a.a().a($$3, dqb.et)))
         .a($$1, "nether/charge_respawn_anchor");
      aj $$16 = ai.a.a()
         .a($$5)
         .a(dcz.oS, xo.c("advancements.nether.ride_strider.title"), xo.c("advancements.nether.ride_strider.description"), null, ap.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", cm.a.a(Optional.of(bz.a(bz.a.a().a(bz.a.a().a($$2, bzv.bv)))), Optional.of(cn.a.a().a($$3, dcz.oS).b()), cx.d.c))
         .a($$1, "nether/ride_strider");
      ai.a.a()
         .a($$16)
         .a(
            dcz.oS,
            xo.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            xo.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", br.a.a(bz.a.a().a(cv.a.a(dmu.i)).a(bz.a.a().a($$2, bzv.bv)), bq.a(cx.c.b(50.0))))
         .a($$1, "nether/ride_strider_in_overworld_lava");
      na.a(ai.a.a(), $$0, dol.a.a.a().toList())
         .a($$16)
         .a(dcz.ra, xo.c("advancements.nether.explore_nether.title"), xo.c("advancements.nether.explore_nether.description"), null, ap.b, true, true, false)
         .a(an.a.a(500))
         .a($$1, "nether/explore_nether");
      aj $$17 = ai.a.a()
         .a($$5)
         .a(dcz.yu, xo.c("advancements.nether.find_bastion.title"), xo.c("advancements.nether.find_bastion.description"), null, ap.a, true, true, false)
         .a("bastion", df.a.a(cv.a.b($$0.e(mn.bj).b(eus.s))))
         .a($$1, "nether/find_bastion");
      ai.a.a()
         .a($$17)
         .a(dqb.cG, xo.c("advancements.nether.loot_bastion.title"), xo.c("advancements.nether.loot_bastion.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("loot_bastion_other", cw.a.a(fdf.L))
         .a("loot_bastion_treasure", cw.a.a(fdf.K))
         .a("loot_bastion_hoglin_stable", cw.a.a(fdf.N))
         .a("loot_bastion_bridge", cw.a.a(fdf.M))
         .a($$1, "nether/loot_bastion");
      bj $$18 = bj.a(
         fgv.a(fdj.b.a, bz.a.a().a(bw.a.a().a(cn.a.a().a($$3, azx.ao)))).invert().build(),
         fgv.a(fdj.b.a, bz.a.a().a(bw.a.a().b(cn.a.a().a($$3, azx.ao)))).invert().build(),
         fgv.a(fdj.b.a, bz.a.a().a(bw.a.a().c(cn.a.a().a($$3, azx.ao)))).invert().build(),
         fgv.a(fdj.b.a, bz.a.a().a(bw.a.a().d(cn.a.a().a($$3, azx.ao)))).invert().build()
      );
      ai.a.a()
         .a($$5)
         .a(am.a.b)
         .a(dcz.pO, xo.c("advancements.nether.distract_piglin.title"), xo.c("advancements.nether.distract_piglin.description"), null, ap.a, true, true, false)
         .a("distract_piglin", db.a.a($$18, Optional.of(cn.a.a().a($$3, azx.am).b()), Optional.of(bz.a(bz.a.a().a($$2, bzv.aT).a(bx.a.a().g(false))))))
         .a("distract_piglin_directly", dd.a.a(Optional.of($$18), cn.a.a().a($$3, ctj.c), Optional.of(bz.a(bz.a.a().a($$2, bzv.aT).a(bx.a.a().g(false))))))
         .a($$1, "nether/distract_piglin");
   }
}
