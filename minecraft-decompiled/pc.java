import java.util.List;

public class pc {
   private static final kb a = new kb()
      .a(mn.aU, qt::a)
      .a(mn.aO, qr::a)
      .a(mn.aP, rr::a)
      .a(mn.bg, sg::a)
      .a(mn.bj, rc::a)
      .a(mn.bi, rb::a)
      .a(mn.bh, qy::a)
      .a(mn.bk, qx::a)
      .a(mn.aK, rj::a)
      .a(mn.bb, dom::a)
      .a(mn.bd, qu::a)
      .a(mn.aS, ekh::a)
      .a(mn.bc, ekf::a)
      .a(mn.bt, euo::a)
      .a(mn.aX, eta::a)
      .a(mn.aM, xk::a)
      .a(mn.bq, dll::a)
      .a(mn.bp, dlj::a)
      .a(mn.bn, ede::a)
      .a(mn.br, cpn::a)
      .a(mn.bs, cpl::a)
      .a(mn.be, cqw::a)
      .a(mn.aR, bye::a)
      .a(mn.aJ, eaq::a)
      .a(mn.aW, djn::a)
      .a(mn.aV, dkw::a)
      .a(mn.ba, ddd::a)
      .a(mn.aZ, dcq::a)
      .a(mn.bf, cnc::a)
      .a(mn.aQ, cmp::a)
      .a(mn.aN, cml::a)
      .a(mn.bl, sv::a)
      .a(mn.bm, tb::a)
      .a(mn.aY, cof::a)
      .a(mn.aL, cmi::a)
      .a(mn.aT, arx::a);

   private static void a(jn.a $$0) {
      a($$0.e(mn.bg), $$0.e(mn.aK));
   }

   public static void a(jm<euc> $$0, jn<dnx> $$1) {
      $$1.c().forEach($$1x -> {
         ame $$2 = $$1x.h().a();
         List<jp<euc>> $$3 = ((dnx)$$1x.a()).d().c();
         $$3.stream().flatMap(jp::a).forEach($$3x -> $$3x.d().ifLeft($$2xx -> {
            jl.c<euc> $$3xx = $$0.b($$2xx);
            if (!a($$3xx.a())) {
               ag.b("Placed feature " + $$2xx.a() + " in biome " + $$2 + " is missing BiomeFilter.biome()");
            }
         }).ifRight($$1xxx -> {
            if (!a($$1xxx)) {
               ag.b("Placed inline feature in biome " + $$1x + " is missing BiomeFilter.biome()");
            }
         }));
      });
   }

   private static boolean a(euc $$0) {
      return $$0.c().contains(etq.a());
   }

   public static jn.a a() {
      jz.b $$0 = jz.a(mm.aJ);
      jn.a $$1 = a.a($$0);
      a($$1);
      return $$1;
   }
}
