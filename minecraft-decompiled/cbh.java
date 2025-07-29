import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cbh {
   private static final Map<bzv<?>, cbh.a> a = Maps.newHashMap();

   private static <T extends cao> void a(bzv<T> $$0, cbf $$1, eka.a $$2, cbh.b<T> $$3) {
      cbh.a $$4 = a.put($$0, new cbh.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mm.f.b($$0));
      }
   }

   public static cbf a(bzv<?> $$0) {
      cbh.a $$1 = a.get($$0);
      return $$1 == null ? cbg.a : $$1.b;
   }

   public static boolean a(bzv<?> $$0, dmx $$1, jb $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static eka.a b(@Nullable bzv<?> $$0) {
      cbh.a $$1 = a.get($$0);
      return $$1 == null ? eka.a.f : $$1.a;
   }

   public static <T extends bzm> boolean a(bzv<T> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      cbh.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bzv.i, cbg.b, eka.a.f, cnu::a);
      a(bzv.B, cbg.b, eka.a.f, cnn::c);
      a(bzv.I, cbg.b, eka.a.f, cmc::b);
      a(bzv.L, cbg.b, eka.a.f, crj::a);
      a(bzv.ak, cbg.b, eka.a.f, crr::b);
      a(bzv.aZ, cbg.b, eka.a.f, cnn::c);
      a(bzv.bc, cbg.b, eka.a.f, cnn::c);
      a(bzv.bt, cbg.b, eka.a.f, cmc::b);
      a(bzv.bC, cbg.b, eka.a.f, cnl::b);
      a(bzv.f, cbg.d, eka.a.f, cnr::c);
      a(bzv.l, cbg.d, eka.a.f, clw::b);
      a(bzv.p, cbg.d, eka.a.f, crv::c);
      a(bzv.r, cbg.d, eka.a.f, crv::b);
      a(bzv.s, cbg.d, eka.a.f, crv::c);
      a(bzv.u, cbg.d, eka.a.f, cnz::c);
      a(bzv.w, cbg.d, eka.a.f, crv::b);
      a(bzv.A, cbg.d, eka.a.f, cmd::b);
      a(bzv.D, cbg.d, eka.a.f, cmd::b);
      a(bzv.F, cbg.d, eka.a.f, crv::b);
      a(bzv.J, cbg.d, eka.a.f, cmd::b);
      a(bzv.O, cbg.d, eka.a.f, crv::b);
      a(bzv.P, cbg.d, eka.a.f, crm::b);
      a(bzv.Q, cbg.d, eka.a.f, cao::a);
      a(bzv.ac, cbg.d, eka.a.f, coc::c);
      a(bzv.ae, cbg.d, eka.a.f, crp::b);
      a(bzv.af, cbg.d, eka.a.f, cmd::b);
      a(bzv.ag, cbg.d, eka.a.f, crv::b);
      a(bzv.ai, cbg.b, eka.a.f, cab::a);
      a(bzv.aj, cbg.d, eka.a.f, cok::c);
      a(bzv.an, cbg.d, eka.a.f, cmd::b);
      a(bzv.ao, cbg.d, eka.a.f, crs::a);
      a(bzv.ar, cbg.d, eka.a.f, cao::a);
      a(bzv.az, cbg.d, eka.a.f, cmd::b);
      a(bzv.aB, cbg.d, eka.a.f, cru::b);
      a(bzv.aG, cbg.d, eka.a.f, cmw::c);
      a(bzv.aH, cbg.d, eka.a.f, cmd::b);
      a(bzv.aK, cbg.d, eka.a.e, cmx::c);
      a(bzv.aQ, cbg.d, eka.a.e, cmz::c);
      a(bzv.aS, cbg.d, eka.a.f, cmd::b);
      a(bzv.al, cbg.d, eka.a.f, ctc::c);
      a(bzv.aT, cbg.d, eka.a.f, cti::b);
      a(bzv.aV, cbg.d, eka.a.f, crw::b);
      a(bzv.aW, cbg.d, eka.a.f, cnd::c);
      a(bzv.ba, cbg.d, eka.a.f, cnf::c);
      a(bzv.bd, cbg.d, eka.a.f, cmd::b);
      a(bzv.bg, cbg.d, eka.a.f, csc::b);
      a(bzv.bh, cbg.d, eka.a.f, crv::b);
      a(bzv.bi, cbg.d, eka.a.f, cow::c);
      a(bzv.bj, cbg.d, eka.a.f, cse::c);
      a(bzv.bn, cbg.d, eka.a.f, cao::a);
      a(bzv.bq, cbg.d, eka.a.f, crv::b);
      a(bzv.bu, cbg.d, eka.a.f, csh::a);
      a(bzv.bv, cbg.c, eka.a.f, csi::c);
      a(bzv.bD, cbg.d, eka.a.f, cnm::c);
      a(bzv.bF, cbg.d, eka.a.f, cao::a);
      a(bzv.bK, cbg.d, eka.a.f, crv::b);
      a(bzv.bL, cbg.d, eka.a.f, crv::b);
      a(bzv.bM, cbg.d, eka.a.f, crv::b);
      a(bzv.bO, cbg.d, eka.a.f, cpj::c);
      a(bzv.bP, cbg.d, eka.a.f, crv::c);
      a(bzv.E, cbg.d, eka.a.f, crv::b);
      a(bzv.bQ, cbg.d, eka.a.f, crv::b);
      a(bzv.bR, cbg.d, eka.a.f, cpa::c);
      a(bzv.bT, cbg.d, eka.a.f, csq::b);
      a(bzv.bS, cbg.d, eka.a.f, crv::b);
      a(bzv.v, cbg.d, eka.a.f, cmd::b);
      a(bzv.N, cbg.b, eka.a.f, crr::b);
      a(bzv.T, cbg.a, eka.a.f, crv::b);
      a(bzv.ab, cbg.a, eka.a.f, cms::c);
      a(bzv.ap, cbg.a, eka.a.f, crv::b);
      a(bzv.aP, cbg.a, eka.a.f, cmd::b);
      a(bzv.aR, cbg.a, eka.a.f, cao::a);
      a(bzv.bb, cbg.d, eka.a.f, crv::b);
      a(bzv.be, cbg.a, eka.a.f, cao::a);
      a(bzv.bA, cbg.a, eka.a.f, cmd::b);
      a(bzv.bE, cbg.a, eka.a.f, crv::b);
      a(bzv.bG, cbg.a, eka.a.f, crv::b);
      a(bzv.bH, cbg.d, eka.a.f, cao::a);
      a(bzv.bI, cbg.a, eka.a.f, crv::b);
   }

   record a(eka.a a, cbf b, cbh.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bzm> {
      boolean test(bzv<T> var1, dnl var2, bzu var3, jb var4, bck var5);
   }
}
