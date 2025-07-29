import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebb<T extends eaz> {
   private static final Logger V = LogUtils.getLogger();
   public static final ebb<ebz> a = a("furnace", ebz::new, dqb.cO);
   public static final ebb<ebh> b = a("chest", ebh::new, dqb.cG);
   public static final ebb<ecy> c = a("trapped_chest", ecy::new, dqb.hw);
   public static final ebb<ebx> d = a("ender_chest", ebx::new, dqb.gf);
   public static final ebb<ece> e = a("jukebox", ece::new, dqb.ek);
   public static final ebb<ebu> f = a("dispenser", ebu::new, dqb.bb);
   public static final ebb<ebv> g = a("dropper", ebv::new, dqb.hJ);
   public static final ebb<ecn> h = a(
      "sign",
      ecn::new,
      dqb.cP,
      dqb.cQ,
      dqb.cR,
      dqb.cS,
      dqb.cT,
      dqb.cU,
      dqb.cV,
      dqb.cW,
      dqb.dd,
      dqb.de,
      dqb.df,
      dqb.dg,
      dqb.dh,
      dqb.di,
      dqb.dj,
      dqb.dk,
      dqb.pD,
      dqb.pF,
      dqb.pE,
      dqb.pG,
      dqb.cX,
      dqb.dl,
      dqb.cY,
      dqb.dm
   );
   public static final ebb<eca> i = a(
      "hanging_sign",
      eca::new,
      dqb.dn,
      dqb.do,
      dqb.dp,
      dqb.dq,
      dqb.dr,
      dqb.ds,
      dqb.dt,
      dqb.du,
      dqb.dv,
      dqb.dw,
      dqb.dx,
      dqb.dy,
      dqb.dz,
      dqb.dA,
      dqb.dB,
      dqb.dC,
      dqb.dD,
      dqb.dE,
      dqb.dF,
      dqb.dG,
      dqb.dI,
      dqb.dJ,
      dqb.dH,
      dqb.dK
   );
   public static final ebb<ecr> j = a("mob_spawner", ecr::new, dqb.cD);
   public static final ebb<ebp> k = a("creaking_heart", ebp::new, dqb.cE);
   public static final ebb<edw> l = a("piston", edw::new, dqb.ca);
   public static final ebb<ebd> m = a("brewing_stand", ebd::new, dqb.fR);
   public static final ebb<ebw> n = a("enchanting_table", ebw::new, dqb.fQ);
   public static final ebb<ecw> o = a("end_portal", ecw::new, dqb.fW);
   public static final ebb<eau> p = a("beacon", eau::new, dqb.gn);
   public static final ebb<ecp> q = a(
      "skull", ecp::new, dqb.hf, dqb.hg, dqb.hn, dqb.ho, dqb.hp, dqb.hq, dqb.hj, dqb.hk, dqb.hh, dqb.hi, dqb.hl, dqb.hm, dqb.hr, dqb.hs
   );
   public static final ebb<ebq> r = a("daylight_detector", ebq::new, dqb.hA);
   public static final ebb<ecc> s = a("hopper", ecc::new, dqb.hD);
   public static final ebb<ebl> t = a("comparator", ebl::new, dqb.hz);
   public static final ebb<ean> u = a(
      "banner",
      ean::new,
      dqb.jl,
      dqb.jm,
      dqb.jn,
      dqb.jo,
      dqb.jp,
      dqb.jq,
      dqb.jr,
      dqb.js,
      dqb.jt,
      dqb.ju,
      dqb.jv,
      dqb.jw,
      dqb.jx,
      dqb.jy,
      dqb.jz,
      dqb.jA,
      dqb.jB,
      dqb.jC,
      dqb.jD,
      dqb.jE,
      dqb.jF,
      dqb.jG,
      dqb.jH,
      dqb.jI,
      dqb.jJ,
      dqb.jK,
      dqb.jL,
      dqb.jM,
      dqb.jN,
      dqb.jO,
      dqb.jP,
      dqb.jQ
   );
   public static final ebb<ecs> v = a("structure_block", ecs::new, dqb.pH);
   public static final ebb<ecv> w = a("end_gateway", ecv::new, dqb.ll);
   public static final ebb<ebk> x = a("command_block", ebk::new, dqb.gm, dqb.ln, dqb.lm);
   public static final ebb<ecm> y = a(
      "shulker_box",
      ecm::new,
      dqb.lv,
      dqb.lL,
      dqb.lH,
      dqb.lI,
      dqb.lF,
      dqb.lD,
      dqb.lJ,
      dqb.lz,
      dqb.lE,
      dqb.lB,
      dqb.ly,
      dqb.lx,
      dqb.lC,
      dqb.lG,
      dqb.lK,
      dqb.lw,
      dqb.lA
   );
   public static final ebb<eav> z = a(
      "bed", eav::new, dqb.bu, dqb.bv, dqb.br, dqb.bs, dqb.bp, dqb.bn, dqb.bt, dqb.bj, dqb.bo, dqb.bl, dqb.bi, dqb.bh, dqb.bm, dqb.bq, dqb.bg, dqb.bk
   );
   public static final ebb<ebm> A = a("conduit", ebm::new, dqb.nE);
   public static final ebb<ear> B = a("barrel", ear::new, dqb.oB);
   public static final ebb<ecq> C = a("smoker", ecq::new, dqb.oC);
   public static final ebb<eay> D = a("blast_furnace", eay::new, dqb.oD);
   public static final ebb<ecf> E = a("lectern", ecf::new, dqb.oH);
   public static final ebb<eax> F = a("bell", eax::new, dqb.oK);
   public static final ebb<ecd> G = a("jigsaw", ecd::new, dqb.pI);
   public static final ebb<ebg> H = a("campfire", ebg::new, dqb.oN, dqb.oO);
   public static final ebb<eaw> I = a("beehive", eaw::new, dqb.pN, dqb.pO);
   public static final ebb<eck> J = a("sculk_sensor", eck::new, dqb.rz);
   public static final ebb<ebf> K = a("calibrated_sculk_sensor", ebf::new, dqb.rA);
   public static final ebb<ecj> L = a("sculk_catalyst", ecj::new, dqb.rD);
   public static final ebb<ecl> M = a("sculk_shrieker", ecl::new, dqb.rE);
   public static final ebb<ebj> N = a("chiseled_bookshelf", ebj::new, dqb.cw);
   public static final ebb<ebe> O = a("brushable_block", ebe::new, dqb.M, dqb.P);
   public static final ebb<ebr> P = a("decorated_pot", ebr::new, dqb.ua);
   public static final ebb<ebo> Q = a("crafter", ebo::new, dqb.ub);
   public static final ebb<ecz> R = a("trial_spawner", ecz::new, dqb.uc);
   public static final ebb<edi> S = a("vault", edi::new, dqb.ud);
   public static final ebb<ect> T = a("test_block", ect::new, dqb.pJ);
   public static final ebb<ecu> U = a("test_instance_block", ecu::new, dqb.pK);
   private static final Set<ebb<?>> W = Set.of(x, E, h, i, j, R);
   private final ebb.a<? extends T> X;
   private final Set<dpz> Y;
   private final jl.c<ebb<?>> Z = mm.j.f(this);

   @Nullable
   public static ame a(ebb<?> $$0) {
      return mm.j.b($$0);
   }

   private static <T extends eaz> ebb<T> a(String $$0, ebb.a<? extends T> $$1, dpz... $$2) {
      if ($$2.length == 0) {
         V.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      ag.a(blp.t, $$0);
      return jy.a(mm.j, $$0, new ebb<>($$1, Set.of($$2)));
   }

   private ebb(ebb.a<? extends T> $$0, Set<dpz> $$1) {
      this.X = $$0;
      this.Y = $$1;
   }

   public T a(jb $$0, eeb $$1) {
      return (T)this.X.create($$0, $$1);
   }

   public boolean a(eeb $$0) {
      return this.Y.contains($$0.b());
   }

   @Deprecated
   public jl.c<ebb<?>> a() {
      return this.Z;
   }

   @Nullable
   public T a(dly $$0, jb $$1) {
      eaz $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.q() == this ? $$2 : null);
   }

   public boolean b() {
      return W.contains(this);
   }

   @FunctionalInterface
   interface a<T extends eaz> {
      T create(jb var1, eeb var2);
   }
}
