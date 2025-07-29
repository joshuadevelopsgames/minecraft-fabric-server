import java.util.function.Consumer;

public class nd implements mx {
   @Override
   public void a(jn.a $$0, Consumer<aj> $$1) {
      jm<dcr> $$2 = $$0.e(mn.N);
      aj $$3 = ai.a.a()
         .a(
            dqb.i,
            xo.c("advancements.story.root.title"),
            xo.c("advancements.story.root.description"),
            ame.b("gui/advancements/backgrounds/stone"),
            ap.a,
            false,
            false,
            false
         )
         .a("crafting_table", cl.a.a(dqb.cL))
         .a($$1, "story/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dcz.pT, xo.c("advancements.story.mine_stone.title"), xo.c("advancements.story.mine_stone.description"), null, ap.a, true, true, false)
         .a("get_stone", cl.a.a(cn.a.a().a($$2, azx.bj)))
         .a($$1, "story/mine_stone");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dcz.pY, xo.c("advancements.story.upgrade_tools.title"), xo.c("advancements.story.upgrade_tools.description"), null, ap.a, true, true, false)
         .a("stone_pickaxe", cl.a.a(dcz.pY))
         .a($$1, "story/upgrade_tools");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dcz.pK, xo.c("advancements.story.smelt_iron.title"), xo.c("advancements.story.smelt_iron.description"), null, ap.a, true, true, false)
         .a("iron", cl.a.a(dcz.pK))
         .a($$1, "story/smelt_iron");
      aj $$7 = ai.a.a()
         .a($$6)
         .a(dcz.qi, xo.c("advancements.story.iron_tools.title"), xo.c("advancements.story.iron_tools.description"), null, ap.a, true, true, false)
         .a("iron_pickaxe", cl.a.a(dcz.qi))
         .a($$1, "story/iron_tools");
      aj $$8 = ai.a.a()
         .a($$7)
         .a(dcz.pE, xo.c("advancements.story.mine_diamond.title"), xo.c("advancements.story.mine_diamond.description"), null, ap.a, true, true, false)
         .a("diamond", cl.a.a(dcz.pE))
         .a($$1, "story/mine_diamond");
      aj $$9 = ai.a.a()
         .a($$6)
         .a(dcz.rH, xo.c("advancements.story.lava_bucket.title"), xo.c("advancements.story.lava_bucket.description"), null, ap.a, true, true, false)
         .a("lava_bucket", cl.a.a(dcz.rH))
         .a($$1, "story/lava_bucket");
      aj $$10 = ai.a.a()
         .a($$6)
         .a(dcz.qM, xo.c("advancements.story.obtain_armor.title"), xo.c("advancements.story.obtain_armor.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("iron_helmet", cl.a.a(dcz.qL))
         .a("iron_chestplate", cl.a.a(dcz.qM))
         .a("iron_leggings", cl.a.a(dcz.qN))
         .a("iron_boots", cl.a.a(dcz.qO))
         .a($$1, "story/obtain_armor");
      ai.a.a()
         .a($$8)
         .a(dcz.vY, xo.c("advancements.story.enchant_item.title"), xo.c("advancements.story.enchant_item.description"), null, ap.a, true, true, false)
         .a("enchanted_item", bt.a.b())
         .a($$1, "story/enchant_item");
      aj $$11 = ai.a.a()
         .a($$9)
         .a(dqb.cy, xo.c("advancements.story.form_obsidian.title"), xo.c("advancements.story.form_obsidian.description"), null, ap.a, true, true, false)
         .a("obsidian", cl.a.a(dqb.cy))
         .a($$1, "story/form_obsidian");
      ai.a.a()
         .a($$10)
         .a(dcz.wV, xo.c("advancements.story.deflect_arrow.title"), xo.c("advancements.story.deflect_arrow.description"), null, ap.a, true, true, false)
         .a("deflected_projectile", by.a.a(bm.a.a().a(bn.a.a().a(du.a(azp.j))).a(true)))
         .a($$1, "story/deflect_arrow");
      ai.a.a()
         .a($$8)
         .a(dcz.qQ, xo.c("advancements.story.shiny_gear.title"), xo.c("advancements.story.shiny_gear.description"), null, ap.a, true, true, false)
         .a(am.a.b)
         .a("diamond_helmet", cl.a.a(dcz.qP))
         .a("diamond_chestplate", cl.a.a(dcz.qQ))
         .a("diamond_leggings", cl.a.a(dcz.qR))
         .a("diamond_boots", cl.a.a(dcz.qS))
         .a($$1, "story/shiny_gear");
      aj $$12 = ai.a.a()
         .a($$11)
         .a(dcz.px, xo.c("advancements.story.enter_the_nether.title"), xo.c("advancements.story.enter_the_nether.description"), null, ap.a, true, true, false)
         .a("entered_nether", bc.a.a(dmu.j))
         .a($$1, "story/enter_the_nether");
      ai.a.a()
         .a($$12)
         .a(
            dcz.rf,
            xo.c("advancements.story.cure_zombie_villager.title"),
            xo.c("advancements.story.cure_zombie_villager.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bl.a.b())
         .a($$1, "story/cure_zombie_villager");
      aj $$13 = ai.a.a()
         .a($$12)
         .a(dcz.tR, xo.c("advancements.story.follow_ender_eye.title"), xo.c("advancements.story.follow_ender_eye.description"), null, ap.a, true, true, false)
         .a("in_stronghold", df.a.a(cv.a.b($$0.e(mn.bj).b(eus.k))))
         .a($$1, "story/follow_ender_eye");
      ai.a.a()
         .a($$13)
         .a(dqb.fY, xo.c("advancements.story.enter_the_end.title"), xo.c("advancements.story.enter_the_end.description"), null, ap.a, true, true, false)
         .a("entered_end", bc.a.a(dmu.k))
         .a($$1, "story/enter_the_end");
   }
}
