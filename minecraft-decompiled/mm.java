import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mm {
   private static final Logger aK = LogUtils.getLogger();
   private static final Map<ame, Supplier<?>> aL = Maps.newLinkedHashMap();
   private static final kh<kh<?>> aM = new jt<>(amd.a(mn.a), Lifecycle.stable());
   public static final jg<ejb> a = a(mn.J, "step", ejb::a);
   public static final jy<ayy> b = a(mn.as, $$0 -> ayz.oF);
   public static final jg<fak> c = b(mn.H, "empty", $$0 -> fam.a);
   public static final jy<byo> d = a(mn.Z, bys::a);
   public static final jg<dpz> e = b(mn.i, "air", $$0 -> dqb.a);
   public static final jg<bzv<?>> f = b(mn.D, "pig", $$0 -> bzv.aS);
   public static final jg<dcr> g = b(mn.N, "air", $$0 -> dcz.a);
   public static final jy<dep> h = a(mn.ah, des::a);
   public static final jy<md<?>> i = a(mn.ab, $$0 -> me.b);
   public static final jy<ebb<?>> j = b(mn.e, $$0 -> ebb.a);
   public static final jy<ame> k = a(mn.p, $$0 -> azj.F);
   public static final jg<egz> l = a(mn.l, "empty", $$0 -> egz.c);
   public static final jy<eyv<?>> m = a(mn.ao, $$0 -> eyv.a);
   public static final jy<ezj<?>> n = a(mn.an, $$0 -> ezj.b);
   public static final jy<eyo<?>> o = a(mn.ag, $$0 -> eyo.a);
   public static final jy<czv<?>> p = a(mn.Y, $$0 -> czv.i);
   public static final jy<dhx<?>> q = a(mn.al, $$0 -> dhx.a);
   public static final jy<dhw<?>> r = a(mn.ak, $$0 -> dhw.b);
   public static final jy<cbn> s = a(mn.c, cbs::a);
   public static final jy<ejg<?>> t = a(mn.af, $$0 -> ejg.a);
   public static final jy<ik<?, ?>> u = a(mn.m, il::a);
   public static final jy<azi<?>> v = a(mn.au, $$0 -> azj.c);
   public static final jg<cuk> w = a(mn.aI, "plains", cuk::a);
   public static final jg<cui> x = a(mn.aH, "none", cui::a);
   public static final jy<cls> y = a(mn.ad, clt::a);
   public static final jg<cjo<?>> z = a(mn.X, "dummy", $$0 -> cjo.a);
   public static final jg<ckw<?>> A = a(mn.aq, "dummy", $$0 -> ckw.a);
   public static final jy<cwp> B = a(mn.ap, $$0 -> cwp.c);
   public static final jy<cwn> C = a(mn.b, $$0 -> cwn.b);
   public static final jy<fea> D = a(mn.S, $$0 -> fdx.b);
   public static final jy<fey<?>> E = a(mn.P, $$0 -> fez.e);
   public static final jy<fgt> F = a(mn.O, $$0 -> fgu.a);
   public static final jy<fhn> G = a(mn.R, $$0 -> fhp.b);
   public static final jy<fhf> H = a(mn.Q, $$0 -> fhh.c);
   public static final jy<fhw> I = a(mn.T, $$0 -> fhy.c);
   public static final jy<bwn<?>> J = a(mn.G, $$0 -> bwn.a);
   public static final jy<bwp<?>> K = a(mn.M, $$0 -> bwp.a);
   public static final jy<etg<?>> L = a(mn.K, $$0 -> etg.a);
   public static final jy<eli<?>> M = a(mn.f, $$0 -> eli.k);
   public static final jy<emg<?>> N = a(mn.j, $$0 -> emg.a);
   public static final jy<enh<?>> O = a(mn.F, $$0 -> enh.J);
   public static final jy<evw<?>> P = a(mn.aw, $$0 -> evw.a);
   public static final jy<evp> Q = a(mn.av, $$0 -> evp.c);
   public static final jy<evh<?>> R = a(mn.az, $$0 -> evh.f);
   public static final jy<eug<?>> S = a(mn.ac, $$0 -> eug.f);
   public static final jy<ero<?>> T = a(mn.g, $$0 -> ero.a);
   public static final jy<eqz<?>> U = a(mn.I, $$0 -> eqz.a);
   public static final jy<esv<?>> V = a(mn.aG, $$0 -> esv.a);
   public static final jy<erl<?>> W = a(mn.am, $$0 -> erl.a);
   public static final jy<esj<?>> X = a(mn.aF, $$0 -> esj.b);
   public static final jy<eqo<?>> Y = a(mn.E, $$0 -> eqo.a);
   public static final jy<MapCodec<? extends dob>> Z = a(mn.d, doc::a);
   public static final jy<MapCodec<? extends efz>> aa = a(mn.k, egb::a);
   public static final jy<MapCodec<? extends ekr.f>> ab = a(mn.V, ekr.f::a);
   public static final jy<MapCodec<? extends ekr.o>> ac = a(mn.W, ekr.o::a);
   public static final jy<MapCodec<? extends ejt>> ad = a(mn.t, eju::a);
   public static final jy<MapCodec<? extends dpz>> ae = a(mn.h, dqa::a);
   public static final jy<eyz<?>> af = a(mn.ay, $$0 -> eyz.e);
   public static final jy<ewh<?>> ag = a(mn.ax, $$0 -> ewh.d);
   public static final jy<MapCodec<? extends ewk>> ah = a(mn.ae, ewl::a);
   public static final jy<ebs> ai = a(mn.s, ebt::a);
   public static final jy<dbm> aj = a(mn.o, dbn::a);
   public static final jy<at<?>> ak = a(mn.bo, aq::a);
   public static final jy<zf<?>> al = a(mn.aa, zg::a);
   public static final jy<kp<?>> am = a(mn.r, kq::a);
   public static final jy<MapCodec<? extends ca>> an = a(mn.C, cb::a);
   public static final jy<kz.b<?>> ao = a(mn.q, la::a);
   public static final jy<fcb> ap = a(mn.U, fcc::a);
   public static final jy<kp<?>> aq = a(mn.w, djj::a);
   public static final jy<MapCodec<? extends djp>> ar = a(mn.y, djp::a);
   public static final jy<MapCodec<? extends djz>> as = a(mn.x, djz::a);
   public static final jy<MapCodec<? extends dka>> at = a(mn.z, dka::b);
   public static final jy<MapCodec<? extends dkb>> au = a(mn.B, dkb::a);
   public static final jy<MapCodec<? extends dkq>> av = a(mn.A, dkr::a);
   public static final jy<dgj.a<?>> aw = a(mn.n, $$0 -> dgj.a.a);
   public static final jy<dis.a<?>> ax = a(mn.aj, div::a);
   public static final jy<diy.i<?>> ay = a(mn.ar, dja::a);
   public static final jy<dhp> az = a(mn.ai, dho::a);
   public static final jy<aui> aA = a(mn.aE, $$0 -> aui.i);
   public static final jy<MapCodec<? extends tu>> aB = a(mn.aB, tu::a);
   public static final jy<MapCodec<? extends ta>> aC = a(mn.aD, ta::a);
   public static final jy<MapCodec<? extends cwx>> aD = a(mn.at, cwy::a);
   public static final jy<MapCodec<? extends art>> aE = a(mn.v, arw::a);
   public static final jy<MapCodec<? extends asd>> aF = a(mn.aA, ase::a);
   public static final jy<MapCodec<? extends asq>> aG = a(mn.L, asr::a);
   public static final jy<MapCodec<? extends ask>> aH = a(mn.u, asl::a);
   public static final jy<Consumer<sy>> aI = a(mn.aC, sm::a);
   public static final jy<? extends jy<?>> aJ = aM;

   private static <T> jy<T> a(amd<? extends jy<T>> $$0, mm.a<T> $$1) {
      return a($$0, new jt<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jy<T> b(amd<? extends jy<T>> $$0, mm.a<T> $$1) {
      return a($$0, new jt<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jg<T> a(amd<? extends jy<T>> $$0, String $$1, mm.a<T> $$2) {
      return a($$0, new jf<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jg<T> b(amd<? extends jy<T>> $$0, String $$1, mm.a<T> $$2) {
      return a($$0, new jf<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kh<T>> R a(amd<? extends jy<T>> $$0, R $$1, mm.a<T> $$2) {
      amg.a(() -> "registry " + $$0.a());
      ame $$3 = $$0.a();
      aL.put($$3, () -> $$2.run($$1));
      aM.a((amd<kh<?>>)$$0, $$1, jx.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aJ);
   }

   private static void b() {
      aL.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aK.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aJ.n();

      for (jy<?> $$0 : aJ) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends jy<?>> void b(jy<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            ag.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jg) {
            ame $$2 = ((jg)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jm<T> a(jy<T> $$0) {
      return ((kh)$$0).p();
   }

   private static void c(jy<?> $$0) {
      ((jt)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jy<T> var1);
   }
}
