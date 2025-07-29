import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class cbt {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bzv<? extends cam>, cbr> b = ImmutableMap.builder()
      .put(bzv.d, cno.l().a())
      .put(bzv.f, cnr.m().a())
      .put(bzv.g, cqo.l().a())
      .put(bzv.i, cnu.gJ().a())
      .put(bzv.l, clw.l().a())
      .put(bzv.m, cme.gV().a())
      .put(bzv.p, cre.l().a())
      .put(bzv.r, crf.gJ().a())
      .put(bzv.v, cmg.gX().a())
      .put(bzv.u, cnz.m().a())
      .put(bzv.w, crg.l().a())
      .put(bzv.A, cmj.m().a())
      .put(bzv.B, clz.l().a())
      .put(bzv.D, cmn.m().a())
      .put(bzv.E, csz.m().a())
      .put(bzv.F, crh.l().a())
      .put(bzv.I, cmq.t().a())
      .put(bzv.J, cop.m().a())
      .put(bzv.L, crj.l().a())
      .put(bzv.N, crk.l().a())
      .put(bzv.O, crl.l().a())
      .put(bzv.P, crm.l().a())
      .put(bzv.Q, cps.m().a())
      .put(bzv.T, cro.m().a())
      .put(bzv.s, csr.l().a())
      .put(bzv.ab, cms.m().a())
      .put(bzv.ac, coc.gH().a())
      .put(bzv.ae, crp.n().a())
      .put(bzv.af, cmt.m().a())
      .put(bzv.ag, crq.l().a())
      .put(bzv.ai, cab.gH().a())
      .put(bzv.aj, cok.n().a())
      .put(bzv.ak, crr.t().a())
      .put(bzv.al, ctc.m().a())
      .put(bzv.an, coq.hh().a())
      .put(bzv.ao, cso.gK().a())
      .put(bzv.ap, crt.m().a())
      .put(bzv.ar, cmv.l().a())
      .put(bzv.az, cot.gT().a())
      .put(bzv.aB, cru.l().a())
      .put(bzv.aG, cmn.m().a())
      .put(bzv.aH, cop.m().a())
      .put(bzv.aK, cmx.m().a())
      .put(bzv.aP, cmy.gU().a())
      .put(bzv.aQ, cmz.gT().a())
      .put(bzv.aR, crv.gM().a())
      .put(bzv.aS, cna.m().a())
      .put(bzv.aT, cti.gN().a())
      .put(bzv.aU, ctl.n().a())
      .put(bzv.aV, cry.m().a())
      .put(bzv.bU, cut.gg().a())
      .put(bzv.aW, cnd.m().a())
      .put(bzv.aZ, clz.l().a())
      .put(bzv.ba, cnf.n().a())
      .put(bzv.bb, csa.l().a())
      .put(bzv.bc, clz.l().a())
      .put(bzv.bd, cpd.m().a())
      .put(bzv.be, csb.l().a())
      .put(bzv.bg, csc.l().a())
      .put(bzv.bh, crd.l().a())
      .put(bzv.bi, cow.m().a())
      .put(bzv.bj, crv.gM().a())
      .put(bzv.bl, cpg.m().a())
      .put(bzv.bn, cni.l().a())
      .put(bzv.bq, csg.m().a())
      .put(bzv.bt, cnj.gH().a())
      .put(bzv.bu, crd.l().a())
      .put(bzv.bv, csi.n().a())
      .put(bzv.bw, coh.gI().a())
      .put(bzv.bA, cot.gT().a())
      .put(bzv.bC, clz.l().a())
      .put(bzv.bD, cnm.t().a())
      .put(bzv.bE, csj.l().a())
      .put(bzv.bF, cuf.gQ().a())
      .put(bzv.bG, csk.m().a())
      .put(bzv.bI, ctw.l().a())
      .put(bzv.bH, cao.I().a())
      .put(bzv.bK, csl.m().a())
      .put(bzv.bL, cqm.m().a())
      .put(bzv.bM, crd.l().a())
      .put(bzv.bO, cpj.gU().a())
      .put(bzv.bP, csn.l().a())
      .put(bzv.bQ, cso.gK().a())
      .put(bzv.bR, cpa.m().a())
      .put(bzv.bS, cso.gK().a())
      .put(bzv.bT, csq.gQ().a())
      .build();

   public static cbr a(bzv<? extends cam> $$0) {
      return b.get($$0);
   }

   public static boolean b(bzv<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mm.f.s().filter($$0 -> $$0.f() != cap.h).filter($$0 -> !b((bzv<?>)$$0)).map(mm.f::b).forEach($$0 -> ag.b("Entity " + $$0 + " has no attributes"));
   }
}
