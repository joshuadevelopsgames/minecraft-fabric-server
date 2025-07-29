import java.util.function.Consumer;

public class ne implements mx {
   @Override
   public void a(jn.a $$0, Consumer<aj> $$1) {
      jm<bzv<?>> $$2 = $$0.e(mn.D);
      aj $$3 = ai.a.a()
         .a(
            dqb.fY,
            xo.c("advancements.end.root.title"),
            xo.c("advancements.end.root.description"),
            ame.b("gui/advancements/backgrounds/end"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_end", bc.a.a(dmu.k))
         .a($$1, "end/root");
      aj $$4 = ai.a.a()
         .a($$3)
         .a(dqb.hp, xo.c("advancements.end.kill_dragon.title"), xo.c("advancements.end.kill_dragon.description"), null, ap.a, true, true, false)
         .a("killed_dragon", cq.a.a(bz.a.a().a($$2, bzv.Q)))
         .a($$1, "end/kill_dragon");
      aj $$5 = ai.a.a()
         .a($$4)
         .a(dcz.tE, xo.c("advancements.end.enter_end_gateway.title"), xo.c("advancements.end.enter_end_gateway.description"), null, ap.a, true, true, false)
         .a("entered_end_gateway", bv.a.a(dqb.ll))
         .a($$1, "end/enter_end_gateway");
      ai.a.a()
         .a($$4)
         .a(dcz.wI, xo.c("advancements.end.respawn_dragon.title"), xo.c("advancements.end.respawn_dragon.description"), null, ap.c, true, true, false)
         .a("summoned_dragon", dt.a.a(bz.a.a().a($$2, bzv.Q)))
         .a($$1, "end/respawn_dragon");
      aj $$6 = ai.a.a()
         .a($$5)
         .a(dqb.lc, xo.c("advancements.end.find_end_city.title"), xo.c("advancements.end.find_end_city.description"), null, ap.a, true, true, false)
         .a("in_city", df.a.a(cv.a.b($$0.e(mn.bj).b(eus.q))))
         .a($$1, "end/find_end_city");
      ai.a.a()
         .a($$4)
         .a(dcz.wQ, xo.c("advancements.end.dragon_breath.title"), xo.c("advancements.end.dragon_breath.description"), null, ap.c, true, true, false)
         .a("dragon_breath", cl.a.a(dcz.wQ))
         .a($$1, "end/dragon_breath");
      ai.a.a()
         .a($$6)
         .a(dcz.wX, xo.c("advancements.end.levitate.title"), xo.c("advancements.end.levitate.description"), null, ap.b, true, true, false)
         .a(an.a.a(50))
         .a("levitated", cr.a.a(bq.b(cx.c.b(50.0))))
         .a($$1, "end/levitate");
      ai.a.a()
         .a($$6)
         .a(dcz.oU, xo.c("advancements.end.elytra.title"), xo.c("advancements.end.elytra.description"), null, ap.c, true, true, false)
         .a("elytra", cl.a.a(dcz.oU))
         .a($$1, "end/elytra");
      ai.a.a()
         .a($$4)
         .a(dqb.fZ, xo.c("advancements.end.dragon_egg.title"), xo.c("advancements.end.dragon_egg.description"), null, ap.c, true, true, false)
         .a("dragon_egg", cl.a.a(dqb.fZ))
         .a($$1, "end/dragon_egg");
   }
}
