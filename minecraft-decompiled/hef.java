import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class hef {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bzv<?>, hee<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hst.a, hee<gwf>> c = Map.of(hst.a.b, $$0 -> new hjn($$0, false), hst.a.a, $$0 -> new hjn($$0, true));

   private static <T extends bzm> void a(bzv<? extends T> $$0, hee<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bzv<?>, hed<?, ?>> a(hee.a $$0) {
      Builder<bzv<?>, hed<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mm.f.b((bzv<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hst.a, hed<? extends cut, ?>> b(hee.a $$0) {
      Builder<hst.a, hed<? extends cut, ?>> $$1 = ImmutableMap.builder();
      c.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create player model for " + $$2, var5);
         }
      });
      return $$1.build();
   }

   public static boolean a() {
      boolean $$0 = true;

      for (bzv<?> $$1 : mm.f) {
         if ($$1 != bzv.bU && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mm.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bzv.b, $$0 -> new hdh($$0, gqm.a));
      a(bzv.c, $$0 -> new hdh($$0, gqm.b));
      a(bzv.d, hcz::new);
      a(bzv.e, hfn::new);
      a(bzv.f, hda::new);
      a(bzv.g, hdb::new);
      a(bzv.h, hgu::new);
      a(bzv.i, hdd::new);
      a(bzv.j, $$0 -> new hga($$0, gqm.o));
      a(bzv.k, $$0 -> new hga($$0, gqm.p));
      a(bzv.l, hde::new);
      a(bzv.m, hdf::new);
      a(bzv.n, $$0 -> new hdh($$0, gqm.B));
      a(bzv.o, $$0 -> new hdh($$0, gqm.C));
      a(bzv.p, hdg::new);
      a(bzv.q, hds.a::new);
      a(bzv.r, hdi::new);
      a(bzv.s, hdj::new);
      a(bzv.t, hhf::new);
      a(bzv.u, hdk::new);
      a(bzv.v, hdl::new);
      a(bzv.w, hdm::new);
      a(bzv.x, $$0 -> new hdh($$0, gqm.V));
      a(bzv.y, $$0 -> new hdh($$0, gqm.W));
      a(bzv.z, $$0 -> new hfk($$0, gqm.Y));
      a(bzv.A, hdn::new);
      a(bzv.B, hdo::new);
      a(bzv.C, $$0 -> new hfk($$0, gqm.ai));
      a(bzv.D, hdp::new);
      a(bzv.E, hdq::new);
      a(bzv.F, hdr::new);
      a(bzv.G, $$0 -> new hdh($$0, gqm.at));
      a(bzv.H, $$0 -> new hdh($$0, gqm.au));
      a(bzv.I, hdt::new);
      a(bzv.J, $$0 -> new hdu<>($$0, hdu.a.a));
      a(bzv.K, hdv::new);
      a(bzv.L, hdw::new);
      a(bzv.M, hgs::new);
      a(bzv.N, hdx::new);
      a(bzv.O, hea::new);
      a(bzv.P, heb::new);
      a(bzv.Q, hdz::new);
      a(bzv.R, hgs::new);
      a(bzv.S, hdy::new);
      a(bzv.T, heh::new);
      a(bzv.U, heg::new);
      a(bzv.V, hgs::new);
      a(bzv.W, hei::new);
      a(bzv.X, $$0 -> new hgs<>($$0, 1.0F, true));
      a(bzv.Y, hej::new);
      a(bzv.Z, $$0 -> new hgs<>($$0, 3.0F, true));
      a(bzv.aa, hek::new);
      a(bzv.bV, hel::new);
      a(bzv.ab, hem::new);
      a(bzv.ac, hen::new);
      a(bzv.ad, $$0 -> new hfk($$0, gqm.ba));
      a(bzv.ae, heo::new);
      a(bzv.af, het::new);
      a(bzv.ag, $$0 -> new hep($$0, 6.0F));
      a(bzv.ah, hfc::new);
      a(bzv.ai, $$0 -> new heq($$0, new gpn($$0.a(gqm.bf)), new gpn($$0.a(gqm.bg))));
      a(bzv.aj, her::new);
      a(bzv.ak, hes::new);
      a(bzv.al, heu::new);
      a(bzv.am, $$0 -> new hfk($$0, gqm.bs));
      a(bzv.an, hev::new);
      a(bzv.ao, hex::new);
      a(bzv.ap, hez::new);
      a(bzv.aq, hfn::new);
      a(bzv.ar, hfa::new);
      a(bzv.as, hfb::new);
      a(bzv.at, hds.b::new);
      a(bzv.au, hfc::new);
      a(bzv.av, $$0 -> new hdh($$0, gqm.bH));
      a(bzv.aw, $$0 -> new hdh($$0, gqm.bI));
      a(bzv.ax, hfe::new);
      a(bzv.ay, hff::new);
      a(bzv.aY, hgs::new);
      a(bzv.az, $$0 -> new hfh($$0, gqm.bK, gqm.bL));
      a(bzv.aA, hfi::new);
      a(bzv.aB, hfj::new);
      a(bzv.aC, $$0 -> new hdh($$0, gqm.bQ));
      a(bzv.aD, $$0 -> new hdh($$0, gqm.bR));
      a(bzv.aE, hfn::new);
      a(bzv.aF, $$0 -> new hfk($$0, gqm.bS));
      a(bzv.aG, hfm::new);
      a(bzv.aH, $$0 -> new hdu<>($$0, hdu.a.b));
      a(bzv.aI, $$0 -> new hdh($$0, gqm.bZ));
      a(bzv.aJ, $$0 -> new hdh($$0, gqm.ca));
      a(bzv.aK, hfo::new);
      a(bzv.aL, hfp::new);
      a(bzv.aM, hfq::new);
      a(bzv.aN, $$0 -> new hdh($$0, gqm.cd));
      a(bzv.aO, $$0 -> new hdh($$0, gqm.ce));
      a(bzv.aP, hfr::new);
      a(bzv.aQ, hfs::new);
      a(bzv.aR, hft::new);
      a(bzv.aS, hfu::new);
      a(bzv.aT, $$0 -> new hfv($$0, gqm.ck, gqm.cl, gqm.cs, gqm.ct, gqm.cm, gqm.cn));
      a(bzv.aU, $$0 -> new hfv($$0, gqm.co, gqm.co, gqm.cp, gqm.cq, gqm.cp, gqm.cq));
      a(bzv.aV, hfw::new);
      a(bzv.aW, hfx::new);
      a(bzv.aZ, hfy::new);
      a(bzv.ba, hfz::new);
      a(bzv.bb, hgb::new);
      a(bzv.bc, hgd::new);
      a(bzv.bd, hge::new);
      a(bzv.be, hgg::new);
      a(bzv.bf, hgf::new);
      a(bzv.bg, hgh::new);
      a(bzv.bh, hgi::new);
      a(bzv.bi, $$0 -> new hgz($$0, hgz.a.a));
      a(bzv.bj, hgj::new);
      a(bzv.bk, $$0 -> new hgs<>($$0, 0.75F, true));
      a(bzv.bl, hgk::new);
      a(bzv.bm, hgs::new);
      a(bzv.bn, hgl::new);
      a(bzv.bo, $$0 -> new hfk($$0, gqm.dr));
      a(bzv.bp, hgm::new);
      a(bzv.bq, hgn::new);
      a(bzv.aX, hgs::new);
      a(bzv.br, $$0 -> new hdh($$0, gqm.dt));
      a(bzv.bs, $$0 -> new hdh($$0, gqm.du));
      a(bzv.bt, $$0 -> new hgo<>($$0, new gpn($$0.a(gqm.dv)), new gpn($$0.a(gqm.dw))));
      a(bzv.bu, hgp::new);
      a(bzv.bv, hgq::new);
      a(bzv.bw, hgr::new);
      a(bzv.bx, hds.c::new);
      a(bzv.by, hgw::new);
      a(bzv.bz, hgv::new);
      a(bzv.bA, $$0 -> new hfh($$0, gqm.dH, gqm.dI));
      a(bzv.bB, hgt::new);
      a(bzv.bC, hgx::new);
      a(bzv.bD, hgy::new);
      a(bzv.bE, hha::new);
      a(bzv.bF, hhb::new);
      a(bzv.bG, hhc::new);
      a(bzv.bH, hhd::new);
      a(bzv.bI, hhe::new);
      a(bzv.bJ, hhf::new);
      a(bzv.bK, hhg::new);
      a(bzv.bL, hhh::new);
      a(bzv.bM, hhi::new);
      a(bzv.bN, hhj::new);
      a(bzv.bO, hhk::new);
      a(bzv.bP, hhl::new);
      a(bzv.bQ, hhm::new);
      a(bzv.bR, $$0 -> new hgz($$0, hgz.a.b));
      a(bzv.bS, hhn::new);
      a(bzv.bT, $$0 -> new hho($$0, gqm.eE, gqm.eF, gqm.eI, gqm.eJ, gqm.eG, gqm.eH));
   }
}
