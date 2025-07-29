import java.util.List;

public class rp {
   public static final amd<ems<?, ?>> a = rr.a("monster_room");
   public static final amd<ems<?, ?>> b = rr.a("fossil_coal");
   public static final amd<ems<?, ?>> c = rr.a("fossil_diamonds");
   public static final amd<ems<?, ?>> d = rr.a("dripstone_cluster");
   public static final amd<ems<?, ?>> e = rr.a("large_dripstone");
   public static final amd<ems<?, ?>> f = rr.a("pointed_dripstone");
   public static final amd<ems<?, ?>> g = rr.a("underwater_magma");
   public static final amd<ems<?, ?>> h = rr.a("glow_lichen");
   public static final amd<ems<?, ?>> i = rr.a("rooted_azalea_tree");
   public static final amd<ems<?, ?>> j = rr.a("cave_vine");
   public static final amd<ems<?, ?>> k = rr.a("cave_vine_in_moss");
   public static final amd<ems<?, ?>> l = rr.a("moss_vegetation");
   public static final amd<ems<?, ?>> m = rr.a("moss_patch");
   public static final amd<ems<?, ?>> n = rr.a("moss_patch_bonemeal");
   public static final amd<ems<?, ?>> o = rr.a("dripleaf");
   public static final amd<ems<?, ?>> p = rr.a("clay_with_dripleaves");
   public static final amd<ems<?, ?>> q = rr.a("clay_pool_with_dripleaves");
   public static final amd<ems<?, ?>> r = rr.a("lush_caves_clay");
   public static final amd<ems<?, ?>> s = rr.a("moss_patch_ceiling");
   public static final amd<ems<?, ?>> t = rr.a("spore_blossom");
   public static final amd<ems<?, ?>> u = rr.a("amethyst_geode");
   public static final amd<ems<?, ?>> v = rr.a("sculk_patch_deep_dark");
   public static final amd<ems<?, ?>> w = rr.a("sculk_patch_ancient_city");
   public static final amd<ems<?, ?>> x = rr.a("sculk_vein");

   private static jl<euc> a(jh $$0) {
      return sg.a(
         enh.x,
         new epc(
            List.of(
               epc.a(new bwv(bvt.<bwo>b().a(bwu.a(0, 4), 2).a(bwl.a(0), 1).a()), ern.a(dqb.tp.m().b(eer.T, $$0))),
               epc.a(bwl.a(1), ern.a(dqb.to.m().b(eer.T, $$0)))
            ),
            jh.b,
            elh.d,
            true
         )
      );
   }

   private static jl<euc> a() {
      return sg.a(
         enh.U,
         new eqe(
            new erx(
               bvt.<eeb>b().a(dqb.tq.m().b(dxp.d, jh.f), 1).a(dqb.tq.m().b(dxp.d, jh.e), 1).a(dqb.tq.m().b(dxp.d, jh.c), 1).a(dqb.tq.m().b(dxp.d, jh.d), 1)
            )
         )
      );
   }

   public static void a(qq<ems<?, ?>> $$0) {
      jm<ems<?, ?>> $$1 = $$0.a(mn.aP);
      jm<eyy> $$2 = $$0.a(mn.bh);
      rr.a($$0, a, enh.D);
      List<ame> $$3 = List.of(
         ame.b("fossil/spine_1"),
         ame.b("fossil/spine_2"),
         ame.b("fossil/spine_3"),
         ame.b("fossil/spine_4"),
         ame.b("fossil/skull_1"),
         ame.b("fossil/skull_2"),
         ame.b("fossil/skull_3"),
         ame.b("fossil/skull_4")
      );
      List<ame> $$4 = List.of(
         ame.b("fossil/spine_1_coal"),
         ame.b("fossil/spine_2_coal"),
         ame.b("fossil/spine_3_coal"),
         ame.b("fossil/spine_4_coal"),
         ame.b("fossil/skull_1_coal"),
         ame.b("fossil/skull_2_coal"),
         ame.b("fossil/skull_3_coal"),
         ame.b("fossil/skull_4_coal")
      );
      jl<eyy> $$5 = $$2.b(qy.D);
      rr.a($$0, b, enh.q, new enm($$3, $$4, $$5, $$2.b(qy.E), 4));
      rr.a($$0, c, enh.q, new enm($$3, $$4, $$5, $$2.b(qy.F), 4));
      rr.a($$0, d, enh.al, new epj(12, bwu.a(3, 6), bwu.a(2, 8), 1, 3, bwu.a(2, 4), bwt.b(0.3F, 0.7F), bwi.a(0.1F, 0.3F, 0.1F, 0.9F), 0.1F, 3, 8));
      rr.a($$0, e, enh.am, new epp(30, bwu.a(3, 19), bwt.b(0.4F, 2.0F), 0.33F, bwt.b(0.3F, 0.9F), bwt.b(0.4F, 1.0F), bwt.b(0.0F, 0.3F), 4, 0.6F));
      rr.a(
         $$0,
         f,
         enh.ai,
         new eqf(
            jp.a(
               sg.a(enh.an, new epv(0.2F, 0.7F, 0.5F, 0.5F), etv.a(jh.a, elh.c(), elh.d, 12), euh.a(bwl.a(1))),
               sg.a(enh.an, new epv(0.2F, 0.7F, 0.5F, 0.5F), etv.a(jh.b, elh.c(), elh.d, 12), euh.a(bwl.a(-1)))
            )
         )
      );
      rr.a($$0, g, enh.C, new eqk(5, 1, 0.5F));
      dvh $$6 = (dvh)dqb.fy;
      rr.a($$0, h, enh.B, new epr($$6, 20, false, true, true, 0.5F, jp.a(dpz::p, dqb.b, dqb.g, dqb.e, dqb.c, dqb.td, dqb.rw, dqb.ri, dqb.tu)));
      rr.a(
         $$0,
         i,
         enh.A,
         new eqc(
            sg.a($$1.b(rw.z)),
            3,
            3,
            azo.bA,
            ern.a(dqb.ts),
            20,
            100,
            3,
            2,
            ern.a(dqb.tr),
            20,
            2,
            elh.a(elh.b(elh.c(List.of(dqb.a, dqb.nJ, dqb.nI)), elh.a(azo.cu)), elh.a(jh.a.q(), azo.co))
         )
      );
      erx $$7 = new erx(bvt.<eeb>b().a(dqb.tf.m(), 4).a(dqb.tf.m().b(dqx.A_, true), 1));
      ert $$8 = new ert(new erx(bvt.<eeb>b().a(dqb.te.m(), 4).a(dqb.te.m().b(dqx.A_, true), 1)), dqy.e, bwu.a(23, 25));
      rr.a(
         $$0,
         j,
         enh.x,
         new epc(
            List.of(epc.a(new bwv(bvt.<bwo>b().a(bwu.a(0, 19), 2).a(bwu.a(0, 2), 3).a(bwu.a(0, 6), 10).a()), $$7), epc.a(bwl.a(1), $$8)), jh.a, elh.c, true
         )
      );
      rr.a($$0, k, enh.x, new epc(List.of(epc.a(new bwv(bvt.<bwo>b().a(bwu.a(0, 3), 5).a(bwu.a(1, 7), 1).a()), $$7), epc.a(bwl.a(1), $$8)), jh.a, elh.c, true));
      rr.a($$0, l, enh.U, new eqe(new erx(bvt.<eeb>b().a(dqb.ti.m(), 4).a(dqb.th.m(), 7).a(dqb.tj.m(), 25).a(dqb.bA.m(), 50).a(dqb.jj.m(), 10))));
      rr.a($$0, m, enh.y, new eql(azo.by, ern.a(dqb.tn), sg.a($$1.b(l)), ets.b, bwl.a(1), 0.0F, 5, 0.8F, bwu.a(4, 7), 0.3F));
      rr.a($$0, n, enh.y, new eql(azo.by, ern.a(dqb.tn), sg.a($$1.b(l)), ets.b, bwl.a(1), 0.0F, 5, 0.6F, bwu.a(1, 2), 0.75F));
      rr.a($$0, o, enh.ai, new eqf(jp.a(a(), a(jh.f), a(jh.e), a(jh.d), a(jh.c))));
      rr.a($$0, p, enh.y, new eql(azo.bz, ern.a(dqb.ei), sg.a($$1.b(o)), ets.b, bwl.a(3), 0.8F, 2, 0.05F, bwu.a(4, 7), 0.7F));
      rr.a($$0, q, enh.z, new eql(azo.bz, ern.a(dqb.ei), sg.a($$1.b(o)), ets.b, bwl.a(3), 0.8F, 5, 0.1F, bwu.a(4, 7), 0.7F));
      rr.a($$0, r, enh.aj, new epx(sg.a($$1.b(p)), sg.a($$1.b(q))));
      rr.a($$0, s, enh.y, new eql(azo.by, ern.a(dqb.tn), sg.a($$1.b(k)), ets.a, bwu.a(1, 2), 0.0F, 5, 0.08F, bwu.a(4, 7), 0.3F));
      rr.a($$0, t, enh.U, new eqe(ern.a(dqb.tg)));
      rr.a(
         $$0,
         u,
         enh.ak,
         new epn(
            new ejx(
               ern.a(dqb.a),
               ern.a(dqb.rc),
               ern.a(dqb.rd),
               ern.a(dqb.rw),
               ern.a(dqb.tP),
               List.of(dqb.rh.m(), dqb.rg.m(), dqb.rf.m(), dqb.re.m()),
               azo.bT,
               azo.bV
            ),
            new ejz(1.7, 2.2, 3.2, 4.2),
            new ejy(0.95, 2.0, 2),
            0.35,
            0.083,
            true,
            bwu.a(4, 6),
            bwu.a(3, 4),
            bwu.a(1, 2),
            -16,
            16,
            0.05,
            1
         )
      );
      rr.a($$0, v, enh.ao, new eqd(10, 32, 64, 0, 1, bwl.a(0), 0.5F));
      rr.a($$0, w, enh.ao, new eqd(10, 32, 64, 0, 1, bwu.a(1, 3), 0.5F));
      dvh $$9 = (dvh)dqb.rC;
      rr.a($$0, x, enh.B, new epr($$9, 20, true, true, true, 1.0F, jp.a(dpz::p, dqb.b, dqb.g, dqb.e, dqb.c, dqb.td, dqb.rw, dqb.ri, dqb.tu)));
   }
}
