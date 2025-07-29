import com.google.common.collect.ImmutableList;
import java.util.List;

public class qy {
   private static final amd<eyy> N = a("empty");
   public static final amd<eyy> a = a("zombie_plains");
   public static final amd<eyy> b = a("zombie_savanna");
   public static final amd<eyy> c = a("zombie_snowy");
   public static final amd<eyy> d = a("zombie_taiga");
   public static final amd<eyy> e = a("zombie_desert");
   public static final amd<eyy> f = a("mossify_10_percent");
   public static final amd<eyy> g = a("mossify_20_percent");
   public static final amd<eyy> h = a("mossify_70_percent");
   public static final amd<eyy> i = a("street_plains");
   public static final amd<eyy> j = a("street_savanna");
   public static final amd<eyy> k = a("street_snowy_or_taiga");
   public static final amd<eyy> l = a("farm_plains");
   public static final amd<eyy> m = a("farm_savanna");
   public static final amd<eyy> n = a("farm_snowy");
   public static final amd<eyy> o = a("farm_taiga");
   public static final amd<eyy> p = a("farm_desert");
   public static final amd<eyy> q = a("outpost_rot");
   public static final amd<eyy> r = a("bottom_rampart");
   public static final amd<eyy> s = a("treasure_rooms");
   public static final amd<eyy> t = a("housing");
   public static final amd<eyy> u = a("side_wall_degradation");
   public static final amd<eyy> v = a("stable_degradation");
   public static final amd<eyy> w = a("bastion_generic_degradation");
   public static final amd<eyy> x = a("rampart_degradation");
   public static final amd<eyy> y = a("entrance_replacement");
   public static final amd<eyy> z = a("bridge");
   public static final amd<eyy> A = a("roof");
   public static final amd<eyy> B = a("high_wall");
   public static final amd<eyy> C = a("high_rampart");
   public static final amd<eyy> D = a("fossil_rot");
   public static final amd<eyy> E = a("fossil_coal");
   public static final amd<eyy> F = a("fossil_diamonds");
   public static final amd<eyy> G = a("ancient_city_start_degradation");
   public static final amd<eyy> H = a("ancient_city_generic_degradation");
   public static final amd<eyy> I = a("ancient_city_walls_degradation");
   public static final amd<eyy> J = a("trail_ruins_houses_archaeology");
   public static final amd<eyy> K = a("trail_ruins_roads_archaeology");
   public static final amd<eyy> L = a("trail_ruins_tower_top_archaeology");
   public static final amd<eyy> M = a("trial_chambers_copper_bulb_degradation");

   private static amd<eyy> a(String $$0) {
      return amd.a(mn.bh, ame.b($$0));
   }

   private static void a(qq<eyy> $$0, amd<eyy> $$1, List<eyx> $$2) {
      $$0.a($$1, new eyy($$2));
   }

   public static void a(qq<eyy> $$0) {
      jm<dpz> $$1 = $$0.a(mn.i);
      eyp $$2 = new eyp(new eyr(dqb.qa, 0.01F), exx.b, dqb.ql.m());
      eyp $$3 = new eyp(new eyr(dqb.ql, 0.5F), exx.b, dqb.qa.m());
      a($$0, N, ImmutableList.of());
      a(
         $$0,
         a,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.m, 0.8F), exx.b, dqb.cx.m()),
                  new eyp(new ezc(azo.n), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cz), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cA), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.m, 0.07F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.cx, 0.07F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.hK, 0.07F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.X, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.n, 0.1F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.cF, 0.1F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.aq, 0.02F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.fq, 0.5F), exx.b, dqb.bz.m()),
                  new eyp[]{
                     new eyp(new eye(dqb.fq.m().b(dug.a, true).b(dug.c, true)), exx.b, dqb.im.m().b(dug.a, true).b(dug.c, true)),
                     new eyp(new eye(dqb.fq.m().b(dug.b, true).b(dug.d, true)), exx.b, dqb.im.m().b(dug.b, true).b(dug.d, true)),
                     new eyp(new eyr(dqb.cM, 0.3F), exx.b, dqb.gT.m()),
                     new eyp(new eyr(dqb.cM, 0.2F), exx.b, dqb.gU.m()),
                     new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.lj.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         b,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new ezc(azo.n), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cz), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cA), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.r, 0.2F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.iq, 0.2F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.ab, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.ax, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.hL, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.hO, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.hY, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.fq, 0.5F), exx.b, dqb.bz.m()),
                  new eyp(new eye(dqb.fq.m().b(dug.a, true).b(dug.c, true)), exx.b, dqb.im.m().b(dug.a, true).b(dug.c, true)),
                  new eyp[]{
                     new eyp(new eye(dqb.fq.m().b(dug.b, true).b(dug.d, true)), exx.b, dqb.im.m().b(dug.b, true).b(dug.d, true)),
                     new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.fw.m())
                  }
               )
            )
         )
      );
      a(
         $$0,
         c,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new ezc(azo.n), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cz), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cA), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.oL), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.o, 0.2F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.jW, 0.4F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.aj, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.aC, 0.05F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.fq, 0.5F), exx.b, dqb.bz.m()),
                  new eyp(new eye(dqb.fq.m().b(dug.a, true).b(dug.c, true)), exx.b, dqb.im.m().b(dug.a, true).b(dug.c, true)),
                  new eyp(new eye(dqb.fq.m().b(dug.b, true).b(dug.d, true)), exx.b, dqb.im.m().b(dug.b, true).b(dug.d, true)),
                  new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.gT.m()),
                  new eyp[]{new eyp(new eyr(dqb.cM, 0.8F), exx.b, dqb.gU.m())}
               )
            )
         )
      );
      a(
         $$0,
         d,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.m, 0.8F), exx.b, dqb.cx.m()),
                  new eyp(new ezc(azo.n), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cz), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cA), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.oN), exx.b, dqb.oN.m().b(dqp.b, false)),
                  new eyp(new eyr(dqb.m, 0.08F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.Y, 0.08F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.fq, 0.5F), exx.b, dqb.bz.m()),
                  new eyp(new eye(dqb.fq.m().b(dug.a, true).b(dug.c, true)), exx.b, dqb.im.m().b(dug.a, true).b(dug.c, true)),
                  new eyp(new eye(dqb.fq.m().b(dug.b, true).b(dug.d, true)), exx.b, dqb.im.m().b(dug.b, true).b(dug.d, true)),
                  new eyp(new eyr(dqb.cM, 0.3F), exx.b, dqb.fv.m()),
                  new eyp(new eyr(dqb.cM, 0.2F), exx.b, dqb.gU.m()),
                  new eyp[0]
               )
            )
         )
      );
      a(
         $$0,
         e,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new ezc(azo.n), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cz), exx.b, dqb.a.m()),
                  new eyp(new eyc(dqb.cA), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.kv, 0.08F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.be, 0.1F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.jc, 0.08F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.nS, 0.08F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.of, 0.08F), exx.b, dqb.bz.m()),
                  new eyp(new eyr(dqb.cM, 0.2F), exx.b, dqb.lj.m()),
                  new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.fw.m())
               )
            )
         )
      );
      a($$0, f, ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.m, 0.1F), exx.b, dqb.cx.m())))));
      a($$0, g, ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.m, 0.2F), exx.b, dqb.cx.m())))));
      a($$0, h, ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.m, 0.7F), exx.b, dqb.cx.m())))));
      a(
         $$0,
         i,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyc(dqb.lk), new eyc(dqb.J), dqb.n.m()),
                  new eyp(new eyr(dqb.lk, 0.1F), exx.b, dqb.i.m()),
                  new eyp(new eyc(dqb.i), new eyc(dqb.J), dqb.J.m()),
                  new eyp(new eyc(dqb.j), new eyc(dqb.J), dqb.J.m())
               )
            )
         )
      );
      a(
         $$0,
         j,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyc(dqb.lk), new eyc(dqb.J), dqb.r.m()),
                  new eyp(new eyr(dqb.lk, 0.2F), exx.b, dqb.i.m()),
                  new eyp(new eyc(dqb.i), new eyc(dqb.J), dqb.J.m()),
                  new eyp(new eyc(dqb.j), new eyc(dqb.J), dqb.J.m())
               )
            )
         )
      );
      a(
         $$0,
         k,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyc(dqb.lk), new eyc(dqb.J), dqb.o.m()),
                  new eyp(new eyc(dqb.lk), new eyc(dqb.ee), dqb.o.m()),
                  new eyp(new eyr(dqb.lk, 0.2F), exx.b, dqb.i.m()),
                  new eyp(new eyc(dqb.i), new eyc(dqb.J), dqb.J.m()),
                  new eyp(new eyc(dqb.j), new eyc(dqb.J), dqb.J.m())
               )
            )
         )
      );
      a(
         $$0,
         l,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.cM, 0.3F), exx.b, dqb.gT.m()),
                  new eyp(new eyr(dqb.cM, 0.2F), exx.b, dqb.gU.m()),
                  new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.lj.m())
               )
            )
         )
      );
      a($$0, m, ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.fw.m())))));
      a(
         $$0,
         n,
         ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.gT.m()), new eyp(new eyr(dqb.cM, 0.8F), exx.b, dqb.gU.m()))))
      );
      a(
         $$0,
         o,
         ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.cM, 0.3F), exx.b, dqb.fv.m()), new eyp(new eyr(dqb.cM, 0.2F), exx.b, dqb.gU.m()))))
      );
      a(
         $$0,
         p,
         ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.cM, 0.2F), exx.b, dqb.lj.m()), new eyp(new eyr(dqb.cM, 0.1F), exx.b, dqb.fw.m()))))
      );
      a($$0, q, ImmutableList.of(new eyd(0.05F)));
      a(
         $$0,
         r,
         ImmutableList.of(
            new eyt(ImmutableList.of(new eyp(new eyr(dqb.lp, 0.75F), exx.b, dqb.qg.m()), new eyp(new eyr(dqb.qg, 0.15F), exx.b, dqb.qf.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         s,
         ImmutableList.of(
            new eyt(ImmutableList.of(new eyp(new eyr(dqb.qf, 0.35F), exx.b, dqb.qg.m()), new eyp(new eyr(dqb.qh, 0.1F), exx.b, dqb.qg.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         t,
         ImmutableList.of(
            new eyt(ImmutableList.of(new eyp(new eyr(dqb.qf, 0.3F), exx.b, dqb.qg.m()), new eyp(new eyr(dqb.qa, 1.0E-4F), exx.b, dqb.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         u,
         ImmutableList.of(
            new eyt(ImmutableList.of(new eyp(new eyr(dqb.qh, 0.5F), exx.b, dqb.a.m()), new eyp(new eyr(dqb.cr, 0.1F), exx.b, dqb.qg.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         v,
         ImmutableList.of(
            new eyt(ImmutableList.of(new eyp(new eyr(dqb.qf, 0.1F), exx.b, dqb.qg.m()), new eyp(new eyr(dqb.qa, 1.0E-4F), exx.b, dqb.a.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         w,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.qf, 0.3F), exx.b, dqb.qg.m()),
                  new eyp(new eyr(dqb.qa, 1.0E-4F), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.cr, 0.3F), exx.b, dqb.qg.m()),
                  $$3,
                  $$2
               )
            )
         )
      );
      a(
         $$0,
         x,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.qf, 0.4F), exx.b, dqb.qg.m()),
                  new eyp(new eyr(dqb.qa, 0.01F), exx.b, dqb.qg.m()),
                  new eyp(new eyr(dqb.qf, 1.0E-4F), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.qa, 1.0E-4F), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.cr, 0.3F), exx.b, dqb.qg.m()),
                  $$3,
                  $$2
               )
            )
         )
      );
      a(
         $$0,
         y,
         ImmutableList.of(
            new eyt(ImmutableList.of(new eyp(new eyr(dqb.qh, 0.5F), exx.b, dqb.a.m()), new eyp(new eyr(dqb.cr, 0.6F), exx.b, dqb.qg.m()), $$3, $$2))
         )
      );
      a(
         $$0,
         z,
         ImmutableList.of(new eyt(ImmutableList.of(new eyp(new eyr(dqb.qf, 0.3F), exx.b, dqb.qg.m()), new eyp(new eyr(dqb.qa, 1.0E-4F), exx.b, dqb.a.m()))))
      );
      a(
         $$0,
         A,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.qf, 0.3F), exx.b, dqb.qg.m()),
                  new eyp(new eyr(dqb.qf, 0.15F), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.qf, 0.3F), exx.b, dqb.qa.m())
               )
            )
         )
      );
      a(
         $$0,
         B,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.qf, 0.01F), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.qf, 0.5F), exx.b, dqb.qg.m()),
                  new eyp(new eyr(dqb.qf, 0.3F), exx.b, dqb.qa.m()),
                  $$3
               )
            )
         )
      );
      a(
         $$0,
         C,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(new eyp(new eyr(dqb.cr, 0.3F), exx.b, dqb.qg.m()), new eyp(exx.b, exx.b, new exy(0.0F, 0.05F, 0, 100, jh.a.b), dqb.a.m()), $$3)
            )
         )
      );
      a($$0, D, ImmutableList.of(new eyd(0.9F), new eyq(azo.bT)));
      a($$0, E, ImmutableList.of(new eyd(0.1F), new eyq(azo.bT)));
      a($$0, F, ImmutableList.of(new eyd(0.1F), new eyt(ImmutableList.of(new eyp(new eyc(dqb.U), exx.b, dqb.cJ.m()))), new eyq(azo.bT)));
      a(
         $$0,
         G,
         ImmutableList.of(
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.tH, 0.3F), exx.b, dqb.tM.m()),
                  new eyp(new eyr(dqb.tD, 0.3F), exx.b, dqb.tN.m()),
                  new eyp(new eyr(dqb.oM, 0.05F), exx.b, dqb.a.m())
               )
            ),
            new eyq(azo.bT)
         )
      );
      a(
         $$0,
         H,
         ImmutableList.of(
            new eyd($$1.b(azo.bZ), 0.95F),
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.tH, 0.3F), exx.b, dqb.tM.m()),
                  new eyp(new eyr(dqb.tD, 0.3F), exx.b, dqb.tN.m()),
                  new eyp(new eyr(dqb.oM, 0.05F), exx.b, dqb.a.m())
               )
            ),
            new eyq(azo.bT)
         )
      );
      a(
         $$0,
         I,
         ImmutableList.of(
            new eyd($$1.b(azo.bZ), 0.95F),
            new eyt(
               ImmutableList.of(
                  new eyp(new eyr(dqb.tH, 0.3F), exx.b, dqb.tM.m()),
                  new eyp(new eyr(dqb.tD, 0.3F), exx.b, dqb.tN.m()),
                  new eyp(new eyr(dqb.tF, 0.3F), exx.b, dqb.a.m()),
                  new eyp(new eyr(dqb.oM, 0.05F), exx.b, dqb.a.m())
               )
            ),
            new eyq(azo.bT)
         )
      );
      a(
         $$0,
         J,
         List.of(
            new eyt(
               List.of(
                  new eyp(new eyr(dqb.O, 0.2F), exx.b, dqb.j.m()),
                  new eyp(new eyr(dqb.O, 0.1F), exx.b, dqb.k.m()),
                  new eyp(new eyr(dqb.fe, 0.1F), exx.b, dqb.fd.m())
               )
            ),
            a(fdf.aZ, 6),
            a(fdf.ba, 3)
         )
      );
      a(
         $$0,
         K,
         List.of(
            new eyt(
               List.of(
                  new eyp(new eyr(dqb.O, 0.2F), exx.b, dqb.j.m()),
                  new eyp(new eyr(dqb.O, 0.1F), exx.b, dqb.k.m()),
                  new eyp(new eyr(dqb.fe, 0.1F), exx.b, dqb.fd.m())
               )
            ),
            a(fdf.aZ, 2)
         )
      );
      a($$0, L, List.of(a(fdf.aZ, 2)));
      a(
         $$0,
         M,
         List.of(
            new eyt(
               List.of(
                  new eyp(new eyr(dqb.sX, 0.1F), exx.b, dqb.ta.m().b(dro.c, true)),
                  new eyp(new eyr(dqb.sX, 0.33333334F), exx.b, dqb.sZ.m().b(dro.c, true)),
                  new eyp(new eyr(dqb.sX, 0.5F), exx.b, dqb.sY.m().b(dro.c, true))
               )
            ),
            new eyq(azo.bT)
         )
      );
   }

   private static eyf a(amd<fdo> $$0, int $$1) {
      return new eyf(new eyt(List.of(new eyp(new ezc(azo.cB), exx.b, eym.b, dqb.P.m(), new eze($$0)))), bwl.a($$1));
   }
}
