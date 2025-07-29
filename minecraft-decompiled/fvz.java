import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fvz {
   private static final fvq f = fwm.a(-1);
   public static final ame a = a("helmet");
   public static final ame b = a("chestplate");
   public static final ame c = a("leggings");
   public static final ame d = a("boots");
   public static final List<fvz.a> e = List.of(
      new fvz.a(dlh.d, dlj.a),
      new fvz.a(dlh.e, dlj.b),
      new fvz.a(dlh.f, dlj.c),
      new fvz.a(dlh.g, dlj.d),
      new fvz.a(dlh.h, dlj.e),
      new fvz.a(dlh.i, dlj.f),
      new fvz.a(dlh.j, dlj.g),
      new fvz.a(dlh.k, dlj.h),
      new fvz.a(dlh.l, dlj.i),
      new fvz.a(dlh.m, dlj.j),
      new fvz.a(dlh.n, dlj.k)
   );
   private final fwa g;
   private final BiConsumer<ame, fwn> h;

   public static ame a(String $$0) {
      return ame.b("trims/items/" + $$0 + "_trim");
   }

   public fvz(fwa $$0, BiConsumer<ame, fwn> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(dcr $$0) {
      this.g.a($$0, fwm.a(fwo.a($$0)));
   }

   private ame a(dcr $$0, fwp $$1) {
      return $$1.a(fwo.a($$0), fwr.b($$0), this.h);
   }

   private void b(dcr $$0, fwp $$1) {
      this.g.a($$0, fwm.a(this.a($$0, $$1)));
   }

   private ame a(dcr $$0, String $$1, fwp $$2) {
      return $$2.a(fwo.a($$0, $$1), fwr.k(fwr.a($$0, $$1)), this.h);
   }

   private ame a(dcr $$0, dcr $$1, fwp $$2) {
      return $$2.a(fwo.a($$0), fwr.b($$1), this.h);
   }

   private void b(dcr $$0, dcr $$1, fwp $$2) {
      this.g.a($$0, fwm.a(this.a($$0, $$1, $$2)));
   }

   private void a(dcr $$0, fvq $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(dcr $$0, String $$1, fvq $$2) {
      ame $$3 = this.a($$0, fwr.c($$0), fwr.a($$0, $$1));
      this.g.a($$0, fwm.a($$3, f, $$2));
   }

   private List<hok.a> b(dcr $$0) {
      List<hok.a> $$1 = new ArrayList<>();
      hoe.b $$2 = fwm.a(this.a($$0, "_16", fwq.bJ));
      $$1.add(fwm.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = bcb.b($$3 - 16, 32);
         hoe.b $$5 = fwm.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fwq.bJ));
         $$1.add(fwm.a($$5, $$3 - 0.5F));
      }

      $$1.add(fwm.a($$2, 31.5F));
      return $$1;
   }

   private void c(dcr $$0) {
      List<hok.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fwm.a(
               fwm.a(kq.ah),
               fwm.a(new hph(true, hpi.a.b), 32.0F, $$1),
               fwm.a(fwm.a(new hph(true, hpi.a.c), 32.0F, $$1), fwm.a(new hph(true, hpi.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(dcr $$0) {
      this.g.a($$0, fwm.a(new hph(true, hpi.a.d), 32.0F, this.b($$0)));
   }

   private void e(dcr $$0) {
      List<hok.a> $$1 = new ArrayList<>();
      hoe.b $$2 = fwm.a(this.a($$0, "_00", fwq.bJ));
      $$1.add(fwm.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hoe.b $$4 = fwm.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fwq.bJ));
         $$1.add(fwm.a($$4, $$3 - 0.5F));
      }

      $$1.add(fwm.a($$2, 63.5F));
      this.g.a($$0, fwm.a(fwm.a(new hpr(true, hpr.a.b), 64.0F, $$1), fwm.a(new hpr(true, hpr.a.a), 64.0F, $$1)));
   }

   private ame a(dcr $$0, ame $$1, ame $$2) {
      return fwq.bN.a($$0, fwr.c($$1, $$2), this.h);
   }

   private ame a(ame $$0, ame $$1, ame $$2) {
      return fwq.bN.a($$0, fwr.c($$1, $$2), this.h);
   }

   private void a(ame $$0, ame $$1, ame $$2, ame $$3) {
      fwq.bO.a($$0, fwr.a($$1, $$2, $$3), this.h);
   }

   private void a(dcr $$0, amd<dlc> $$1, ame $$2, boolean $$3) {
      ame $$4 = fwo.a($$0);
      ame $$5 = fwr.c($$0);
      ame $$6 = fwr.a($$0, "_overlay");
      List<hol.b<amd<dli>>> $$7 = new ArrayList<>(e.size());

      for (fvz.a $$8 : e) {
         ame $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         ame $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hoe.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fwm.a($$9, new fvn(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fwm.a($$9);
         }

         $$7.add(fwm.a($$8.b, $$11));
      }

      hoe.b $$13;
      if ($$3) {
         fwq.bN.a($$4, fwr.c($$5, $$6), this.h);
         $$13 = fwm.a($$4, new fvn(-6265536));
      } else {
         fwq.bJ.a($$4, fwr.k($$5), this.h);
         $$13 = fwm.a($$4);
      }

      this.g.a($$0, fwm.a(new hqh(), $$13, $$7));
   }

   private void f(dcr $$0) {
      hoe.b $$1 = fwm.a(this.a($$0, fwq.bJ));
      ame $$2 = this.a($$0, fwq.bT, "_open_back");
      ame $$3 = this.a($$0, fwq.bS, "_open_front");
      hoe.b $$4 = fwm.a(fwm.a($$2), new hnz.a(), fwm.a($$3));
      hoe.b $$5 = fwm.a(new hoq(), $$4, $$1);
      this.g.a($$0, fwm.a(new hqb(), $$1, fwm.a(dct.g, $$5)));
   }

   private ame a(dcr $$0, fwp $$1, String $$2) {
      ame $$3 = fwr.a($$0, $$2);
      return $$1.a($$0, fwr.k($$3), this.h);
   }

   private void g(dcr $$0) {
      hoe.b $$1 = fwm.a(fwo.a($$0));
      hoe.b $$2 = fwm.a(this.a($$0, "_pulling_0", fwq.bU));
      hoe.b $$3 = fwm.a(this.a($$0, "_pulling_1", fwq.bU));
      hoe.b $$4 = fwm.a(this.a($$0, "_pulling_2", fwq.bU));
      this.g.a($$0, fwm.a(fwm.a(), fwm.a(new hpt(false), 0.05F, $$2, fwm.a($$3, 0.65F), fwm.a($$4, 0.9F)), $$1));
   }

   private void h(dcr $$0) {
      hoe.b $$1 = fwm.a(fwo.a($$0));
      hoe.b $$2 = fwm.a(this.a($$0, "_pulling_0", fwq.bV));
      hoe.b $$3 = fwm.a(this.a($$0, "_pulling_1", fwq.bV));
      hoe.b $$4 = fwm.a(this.a($$0, "_pulling_2", fwq.bV));
      hoe.b $$5 = fwm.a(this.a($$0, "_arrow", fwq.bV));
      hoe.b $$6 = fwm.a(this.a($$0, "_firework", fwq.bV));
      this.g
         .a($$0, fwm.a(new hpw(), fwm.a(fwm.a(), fwm.a(new hpl(), $$2, fwm.a($$3, 0.58F), fwm.a($$4, 1.0F)), $$1), fwm.a(dbo.a.b, $$5), fwm.a(dbo.a.c, $$6)));
   }

   private void a(dcr $$0, hot $$1, hoe.b $$2, hoe.b $$3) {
      this.g.a($$0, fwm.a($$1, $$2, $$3));
   }

   private void i(dcr $$0) {
      hoe.b $$1 = fwm.a(this.a($$0, fwq.bJ));
      hoe.b $$2 = fwm.a(this.a($$0, "_broken", fwq.bJ));
      this.a($$0, new hop(), $$2, $$1);
   }

   private void j(dcr $$0) {
      hoe.b $$1 = fwm.a(fwo.a($$0));
      hoe.b $$2 = fwm.a(fwo.a($$0, "_brushing_0"));
      hoe.b $$3 = fwm.a(fwo.a($$0, "_brushing_1"));
      hoe.b $$4 = fwm.a(fwo.a($$0, "_brushing_2"));
      this.g.a($$0, fwm.a(new hps(10.0F), 0.1F, $$1, fwm.a($$2, 0.25F), fwm.a($$3, 0.5F), fwm.a($$4, 0.75F)));
   }

   private void k(dcr $$0) {
      hoe.b $$1 = fwm.a(this.a($$0, fwq.bM));
      hoe.b $$2 = fwm.a(this.a($$0, "_cast", fwq.bM));
      this.a($$0, new hox(), $$2, $$1);
   }

   private void l(dcr $$0) {
      hoe.b $$1 = fwm.a(fwo.a($$0));
      hoe.b $$2 = fwm.a(fwo.b("tooting_goat_horn"));
      this.a($$0, fwm.a(), $$2, $$1);
   }

   private void m(dcr $$0) {
      hoe.b $$1 = fwm.a(fwo.a($$0), new hqs.a());
      hoe.b $$2 = fwm.a(fwo.a($$0, "_blocking"), new hqs.a());
      this.a($$0, fwm.a(), $$2, $$1);
   }

   private static hoe.b a(hoe.b $$0, hoe.b $$1) {
      return fwm.a(new hqb(), $$1, fwm.a(List.of(dct.g, dct.h, dct.i), $$0));
   }

   private void n(dcr $$0) {
      hoe.b $$1 = fwm.a(this.a($$0, fwq.bJ));
      hoe.b $$2 = fwm.a(fwo.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(dcr $$0) {
      hoe.b $$1 = fwm.a(this.a($$0, fwq.bJ));
      hoe.b $$2 = fwm.a(fwo.a($$0, "_in_hand"), new hqy.a());
      hoe.b $$3 = fwm.a(fwo.a($$0, "_throwing"), new hqy.a());
      hoe.b $$4 = fwm.a(fwm.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(dcr $$0, ame $$1) {
      this.g.a($$0, fwm.a($$1, new fvt()));
   }

   private void p(dcr $$0) {
      ame $$1 = this.a($$0, fwo.b("potion_overlay"), fwo.a($$0));
      this.a($$0, $$1);
   }

   private void q(dcr $$0) {
      ame $$1 = this.a($$0, fwo.a($$0, "_head"), fwo.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(dcr $$0, int $$1) {
      ame $$2 = this.a($$0, fwq.bJ);
      this.g.a($$0, fwm.a($$2, new fvn($$1)));
   }

   private void r(dcr $$0) {
      ame $$1 = fwr.c($$0);
      ame $$2 = fwr.a($$0, "_overlay");
      ame $$3 = fwq.bJ.a($$0, fwr.k($$1), this.h);
      ame $$4 = fwo.a($$0, "_dyed");
      fwq.bN.a($$4, fwr.c($$1, $$2), this.h);
      this.g.a($$0, fwm.a(fwm.a(kq.K), fwm.a($$4, f, new fvn(0)), fwm.a($$3)));
   }

   public void a() {
      this.b(dcz.pd, fwq.bJ);
      this.b(dcz.pf, fwq.bJ);
      this.b(dcz.pe, fwq.bJ);
      this.b(dcz.pg, fwq.bJ);
      this.b(dcz.pI, fwq.bJ);
      this.b(dcz.pz, fwq.bJ);
      this.b(dcz.pv, fwq.bJ);
      this.b(dcz.wi, fwq.bJ);
      this.b(dcz.pB, fwq.bJ);
      this.b(dcz.vJ, fwq.bJ);
      this.b(dcz.ej, fwq.bL);
      this.b(dcz.tz, fwq.bJ);
      this.b(dcz.wN, fwq.bJ);
      this.b(dcz.wP, fwq.bJ);
      this.b(dcz.oZ, fwq.bJ);
      this.b(dcz.pa, fwq.bJ);
      this.b(dcz.sW, fwq.bJ);
      this.b(dcz.tN, fwq.bJ);
      this.b(dcz.tF, fwq.bL);
      this.b(dcz.sS, fwq.bJ);
      this.b(dcz.sX, fwq.bJ);
      this.b(dcz.xM, fwq.bJ);
      this.b(dcz.rW, fwq.bJ);
      this.b(dcz.py, fwq.bJ);
      this.b(dcz.qC, fwq.bJ);
      this.b(dcz.rS, fwq.bJ);
      this.b(dcz.vC, fwq.bL);
      this.b(dcz.sT, fwq.bJ);
      this.b(dcz.rF, fwq.bJ);
      this.b(dcz.oR, fwq.bM);
      this.b(dcz.oS, fwq.bM);
      this.b(dcz.pD, fwq.bJ);
      this.b(dcz.oN, fwq.bJ);
      this.b(dcz.tB, fwq.bJ);
      this.b(dcz.wJ, fwq.bJ);
      this.b(dcz.rT, fwq.bJ);
      this.e(dcz.sv);
      this.b(dcz.pC, fwq.bJ);
      this.b(dcz.rO, fwq.bJ);
      this.b(dcz.wp, fwq.bJ);
      this.c(dcz.sb);
      this.d(dcz.sc);
      this.b(dcz.tA, fwq.bJ);
      this.b(dcz.tC, fwq.bJ);
      this.b(dcz.sC, fwq.bJ);
      this.b(dcz.wr, fwq.bJ);
      this.b(dcz.rd, fwq.bJ);
      this.b(dcz.we, fwq.bJ);
      this.b(dcz.sD, fwq.bJ);
      this.b(dcz.tr, fwq.bJ);
      this.b(dcz.pL, fwq.bJ);
      this.b(dcz.pM, fwq.bJ);
      this.b(dcz.xE, fwq.bJ);
      this.b(dcz.sQ, fwq.bJ);
      this.b(dcz.ph, fwq.bJ);
      this.b(dcz.pi, fwq.bJ);
      this.b(dcz.pE, fwq.bJ);
      this.b(dcz.qo, fwq.bL);
      this.b(dcz.qp, fwq.bL);
      this.b(dcz.wl, fwq.bJ);
      this.b(dcz.qn, fwq.bL);
      this.b(dcz.qm, fwq.bL);
      this.b(dcz.ql, fwq.bL);
      this.b(dcz.wQ, fwq.bJ);
      this.b(dcz.tw, fwq.bJ);
      this.b(dcz.rY, fwq.bJ);
      this.b(dcz.rZ, fwq.bJ);
      this.b(dcz.sa, fwq.bJ);
      this.b(dcz.pF, fwq.bJ);
      this.b(dcz.vY, fwq.bJ);
      this.b(dcz.tR, fwq.bJ);
      this.b(dcz.tE, fwq.bJ);
      this.b(dcz.wI, fwq.bJ);
      this.b(dcz.vx, fwq.bJ);
      this.b(dcz.tM, fwq.bJ);
      this.b(dcz.xL, fwq.bJ);
      this.b(dcz.vW, fwq.bJ);
      this.b(dcz.vy, fwq.bJ);
      this.b(dcz.rb, fwq.bJ);
      this.b(dcz.px, fwq.bJ);
      this.b(dcz.xJ, fwq.bJ);
      this.b(dcz.xD, fwq.bJ);
      this.b(dcz.oO, fwq.bJ);
      this.b(dcz.tG, fwq.bJ);
      this.b(dcz.tJ, fwq.bJ);
      this.b(dcz.tS, fwq.bJ);
      this.b(dcz.xH, fwq.bJ);
      this.b(dcz.yb, fwq.bJ);
      this.b(dcz.sx, fwq.bJ);
      this.b(dcz.sF, fwq.bJ);
      this.b(dcz.vF, fwq.bJ);
      this.b(dcz.pN, fwq.bJ);
      this.b(dcz.rf, fwq.bJ);
      this.b(dcz.qe, fwq.bL);
      this.b(dcz.vM, fwq.bJ);
      this.b(dcz.qf, fwq.bL);
      this.b(dcz.wk, fwq.bJ);
      this.b(dcz.qd, fwq.bL);
      this.b(dcz.qc, fwq.bL);
      this.b(dcz.qb, fwq.bL);
      this.b(dcz.pO, fwq.bJ);
      this.b(dcz.tH, fwq.bJ);
      this.b(dcz.sO, fwq.bJ);
      this.b(dcz.sU, fwq.bJ);
      this.b(dcz.qz, fwq.bJ);
      this.b(dcz.xK, fwq.bJ);
      this.b(dcz.xz, fwq.bJ);
      this.b(dcz.yf, fwq.bJ);
      this.b(dcz.yi, fwq.bJ);
      this.b(dcz.oQ, fwq.bJ);
      this.b(dcz.sE, fwq.bJ);
      this.b(dcz.pJ, fwq.bJ);
      this.b(dcz.qj, fwq.bL);
      this.b(dcz.qk, fwq.bL);
      this.b(dcz.wj, fwq.bJ);
      this.b(dcz.pK, fwq.bJ);
      this.b(dcz.wY, fwq.bJ);
      this.b(dcz.qi, fwq.bL);
      this.b(dcz.qh, fwq.bL);
      this.b(dcz.qg, fwq.bL);
      this.b(dcz.vE, fwq.bJ);
      this.b(dcz.pb, fwq.bJ);
      this.b(dcz.pc, fwq.bJ);
      this.b(dcz.wZ, fwq.bJ);
      this.b(dcz.pG, fwq.bJ);
      this.b(dcz.rH, fwq.bJ);
      this.b(dcz.rK, fwq.bJ);
      this.b(dcz.sK, fwq.bJ);
      this.b(dcz.sP, fwq.bJ);
      this.b(dcz.sM, fwq.bJ);
      this.b(dcz.sJ, fwq.bJ);
      this.b(dcz.tO, fwq.bJ);
      this.b(dcz.pl, fwq.bJ);
      this.b(dcz.pm, fwq.bJ);
      this.b(dcz.pn, fwq.bJ);
      this.b(dcz.po, fwq.bJ);
      this.b(dcz.vL, fwq.bJ);
      this.b(dcz.tv, fwq.bJ);
      this.b(dcz.rL, fwq.bJ);
      this.b(dcz.oM, fwq.bJ);
      this.b(dcz.xG, fwq.bJ);
      this.b(dcz.qw, fwq.bJ);
      this.b(dcz.xw, fwq.bJ);
      this.b(dcz.xo, fwq.bK);
      this.b(dcz.xb, fwq.bK);
      this.b(dcz.xd, fwq.bK);
      this.b(dcz.xc, fwq.bK);
      this.b(dcz.xe, fwq.bK);
      this.b(dcz.xf, fwq.bK);
      this.b(dcz.xg, fwq.bK);
      this.b(dcz.xh, fwq.bK);
      this.b(dcz.xi, fwq.bK);
      this.b(dcz.xj, fwq.bK);
      this.b(dcz.xk, fwq.bK);
      this.b(dcz.xt, fwq.bK);
      this.b(dcz.xu, fwq.bK);
      this.b(dcz.xl, fwq.bK);
      this.b(dcz.xm, fwq.bK);
      this.b(dcz.xp, fwq.bK);
      this.b(dcz.xn, fwq.bK);
      this.b(dcz.xq, fwq.bK);
      this.b(dcz.xr, fwq.bK);
      this.b(dcz.xs, fwq.bK);
      this.b(dcz.xv, fwq.bK);
      this.b(dcz.wq, fwq.bJ);
      this.b(dcz.wo, fwq.bJ);
      this.b(dcz.xy, fwq.bJ);
      this.b(dcz.qt, fwq.bL);
      this.b(dcz.qu, fwq.bL);
      this.b(dcz.pP, fwq.bJ);
      this.b(dcz.qs, fwq.bL);
      this.b(dcz.pQ, fwq.bJ);
      this.b(dcz.qr, fwq.bL);
      this.b(dcz.qq, fwq.bL);
      this.b(dcz.vZ, fwq.bJ);
      this.b(dcz.wa, fwq.bJ);
      this.b(dcz.vU, fwq.bJ);
      this.b(dcz.oV, fwq.bJ);
      this.b(dcz.oW, fwq.bJ);
      this.b(dcz.sI, fwq.bJ);
      this.b(dcz.re, fwq.bJ);
      this.b(dcz.pj, fwq.bJ);
      this.b(dcz.pk, fwq.bJ);
      this.b(dcz.rV, fwq.bJ);
      this.b(dcz.oT, fwq.bJ);
      this.b(dcz.xI, fwq.bJ);
      this.b(dcz.sN, fwq.bJ);
      this.b(dcz.vK, fwq.bJ);
      this.b(dcz.wK, fwq.bJ);
      this.b(dcz.rc, fwq.bJ);
      this.b(dcz.rI, fwq.bJ);
      this.b(dcz.wc, fwq.bJ);
      this.b(dcz.wb, fwq.bJ);
      this.b(dcz.sB, fwq.bJ);
      this.b(dcz.rM, fwq.bJ);
      this.b(dcz.vV, fwq.bJ);
      this.b(dcz.sR, fwq.bJ);
      this.b(dcz.pH, fwq.bJ);
      this.b(dcz.wd, fwq.bJ);
      this.b(dcz.wg, fwq.bJ);
      this.b(dcz.wh, fwq.bJ);
      this.b(dcz.wf, fwq.bJ);
      this.b(dcz.sV, fwq.bJ);
      this.b(dcz.tD, fwq.bJ);
      this.b(dcz.ov, fwq.bJ);
      this.b(dcz.sz, fwq.bJ);
      this.b(dcz.rN, fwq.bJ);
      this.b(dcz.pu, fwq.bJ);
      this.b(dcz.tu, fwq.bJ);
      this.b(dcz.wX, fwq.bJ);
      this.b(dcz.xF, fwq.bJ);
      this.b(dcz.rX, fwq.bJ);
      this.b(dcz.rJ, fwq.bJ);
      this.b(dcz.yZ, fwq.bJ);
      this.b(dcz.wS, fwq.bJ);
      this.b(dcz.tL, fwq.bJ);
      this.b(dcz.oX, fwq.bJ);
      this.b(dcz.oY, fwq.bJ);
      this.b(dcz.qv, fwq.bL);
      this.b(dcz.pZ, fwq.bL);
      this.b(dcz.qa, fwq.bL);
      this.b(dcz.pY, fwq.bL);
      this.b(dcz.pX, fwq.bL);
      this.b(dcz.pW, fwq.bL);
      this.b(dcz.sZ, fwq.bJ);
      this.b(dcz.xB, fwq.bJ);
      this.b(dcz.oP, fwq.bJ);
      this.b(dcz.wW, fwq.bJ);
      this.b(dcz.sA, fwq.bJ);
      this.b(dcz.rP, fwq.bJ);
      this.b(dcz.rQ, fwq.bJ);
      this.b(dcz.rR, fwq.bJ);
      this.b(dcz.rG, fwq.bJ);
      this.b(dcz.qB, fwq.bJ);
      this.b(dcz.sH, fwq.bJ);
      this.b(dcz.vz, fwq.bJ);
      this.b(dcz.vD, fwq.cd);
      this.b(dcz.pU, fwq.bL);
      this.b(dcz.pV, fwq.bL);
      this.b(dcz.pT, fwq.bL);
      this.b(dcz.pS, fwq.bL);
      this.b(dcz.pR, fwq.bL);
      this.b(dcz.vA, fwq.bJ);
      this.b(dcz.vB, fwq.bJ);
      this.b(dcz.sL, fwq.bJ);
      this.b(dcz.zb, fwq.bJ);
      this.b(dcz.zc, fwq.bJ);
      this.b(dcz.zd, fwq.bJ);
      this.b(dcz.ze, fwq.bJ);
      this.b(dcz.zf, fwq.bJ);
      this.b(dcz.zg, fwq.bJ);
      this.b(dcz.zh, fwq.bJ);
      this.b(dcz.zi, fwq.bJ);
      this.b(dcz.zj, fwq.bJ);
      this.b(dcz.zk, fwq.bJ);
      this.b(dcz.zl, fwq.bJ);
      this.b(dcz.zm, fwq.bJ);
      this.b(dcz.zn, fwq.bJ);
      this.b(dcz.zo, fwq.bJ);
      this.b(dcz.zp, fwq.bJ);
      this.b(dcz.zq, fwq.bJ);
      this.b(dcz.zr, fwq.bJ);
      this.b(dcz.zs, fwq.bJ);
      this.b(dcz.zt, fwq.bJ);
      this.b(dcz.xa, dcz.qv, fwq.bL);
      this.b(dcz.rg, dcz.rf, fwq.bJ);
      this.a(dcz.pt, dld.g, a, false);
      this.a(dcz.qD, dld.b, a, true);
      this.a(dcz.qE, dld.b, b, true);
      this.a(dcz.qF, dld.b, c, true);
      this.a(dcz.qG, dld.b, d, true);
      this.a(dcz.qH, dld.c, a, false);
      this.a(dcz.qI, dld.c, b, false);
      this.a(dcz.qJ, dld.c, c, false);
      this.a(dcz.qK, dld.c, d, false);
      this.a(dcz.qL, dld.d, a, false);
      this.a(dcz.qM, dld.d, b, false);
      this.a(dcz.qN, dld.d, c, false);
      this.a(dcz.qO, dld.d, d, false);
      this.a(dcz.qP, dld.f, a, false);
      this.a(dcz.qQ, dld.f, b, false);
      this.a(dcz.qR, dld.f, c, false);
      this.a(dcz.qS, dld.f, d, false);
      this.a(dcz.qT, dld.e, a, false);
      this.a(dcz.qU, dld.e, b, false);
      this.a(dcz.qV, dld.e, c, false);
      this.a(dcz.qW, dld.e, d, false);
      this.a(dcz.qX, dld.h, a, false);
      this.a(dcz.qY, dld.h, b, false);
      this.a(dcz.qZ, dld.h, c, false);
      this.a(dcz.ra, dld.h, d, false);
      this.a(dcz.wm, -6265536);
      this.b(dcz.zu, fwq.bJ);
      this.b(dcz.zv, fwq.bJ);
      this.b(dcz.zw, fwq.bJ);
      this.b(dcz.zx, fwq.bJ);
      this.b(dcz.zy, fwq.bJ);
      this.b(dcz.zz, fwq.bJ);
      this.b(dcz.zA, fwq.bJ);
      this.b(dcz.zB, fwq.bJ);
      this.b(dcz.zC, fwq.bJ);
      this.b(dcz.zD, fwq.bJ);
      this.b(dcz.zE, fwq.bJ);
      this.b(dcz.zF, fwq.bJ);
      this.b(dcz.zG, fwq.bJ);
      this.b(dcz.zH, fwq.bJ);
      this.b(dcz.zI, fwq.bJ);
      this.b(dcz.zJ, fwq.bJ);
      this.b(dcz.zK, fwq.bJ);
      this.b(dcz.zL, fwq.bJ);
      this.b(dcz.zM, fwq.bJ);
      this.b(dcz.zN, fwq.bJ);
      this.b(dcz.zO, fwq.bJ);
      this.b(dcz.zP, fwq.bJ);
      this.b(dcz.zQ, fwq.bJ);
      this.b(dcz.Ai, fwq.bJ);
      this.b(dcz.Aj, fwq.bJ);
      this.b(dcz.Al, fwq.bJ);
      this.a(dcz.vX, new fvo());
      this.a(dcz.tt, "_markings", new fvs());
      this.f(dcz.sd);
      this.f(dcz.st);
      this.f(dcz.se);
      this.f(dcz.sl);
      this.f(dcz.sm);
      this.f(dcz.sh);
      this.f(dcz.sp);
      this.f(dcz.sn);
      this.f(dcz.si);
      this.f(dcz.ss);
      this.f(dcz.so);
      this.f(dcz.sg);
      this.f(dcz.sk);
      this.f(dcz.sr);
      this.f(dcz.sj);
      this.f(dcz.sq);
      this.f(dcz.sf);
      this.n(dcz.sw);
      this.o(dcz.xx);
      this.r(dcz.pw);
      this.b(dcz.ow, fwq.bJ);
      this.b(dcz.ox, fwq.bJ);
      this.b(dcz.oy, fwq.bJ);
      this.b(dcz.oz, fwq.bJ);
      this.b(dcz.oA, fwq.bJ);
      this.b(dcz.oB, fwq.bJ);
      this.b(dcz.oC, fwq.bJ);
      this.b(dcz.oD, fwq.bJ);
      this.b(dcz.oE, fwq.bJ);
      this.b(dcz.oF, fwq.bJ);
      this.b(dcz.oG, fwq.bJ);
      this.b(dcz.oH, fwq.bJ);
      this.b(dcz.oI, fwq.bJ);
      this.b(dcz.oJ, fwq.bJ);
      this.b(dcz.oK, fwq.bJ);
      this.b(dcz.oL, fwq.bJ);
      this.g(dcz.pA);
      this.h(dcz.xA);
      this.i(dcz.oU);
      this.j(dcz.za);
      this.k(dcz.su);
      this.l(dcz.xN);
      this.m(dcz.wV);
      this.q(dcz.wT);
      this.p(dcz.tK);
      this.p(dcz.wR);
      this.p(dcz.wU);
      this.b(dcz.tT, fwq.bJ);
      this.b(dcz.tU, fwq.bJ);
      this.b(dcz.tV, fwq.bJ);
      this.b(dcz.tW, fwq.bJ);
      this.b(dcz.tX, fwq.bJ);
      this.b(dcz.tY, fwq.bJ);
      this.b(dcz.tZ, fwq.bJ);
      this.b(dcz.ua, fwq.bJ);
      this.b(dcz.ub, fwq.bJ);
      this.b(dcz.uc, fwq.bJ);
      this.b(dcz.ud, fwq.bJ);
      this.b(dcz.ue, fwq.bJ);
      this.b(dcz.uf, fwq.bJ);
      this.b(dcz.ug, fwq.bJ);
      this.b(dcz.uh, fwq.bJ);
      this.b(dcz.ui, fwq.bJ);
      this.b(dcz.uj, fwq.bJ);
      this.b(dcz.uk, fwq.bJ);
      this.b(dcz.ul, fwq.bJ);
      this.b(dcz.um, fwq.bJ);
      this.b(dcz.un, fwq.bJ);
      this.b(dcz.uo, fwq.bJ);
      this.b(dcz.up, fwq.bJ);
      this.b(dcz.uq, fwq.bJ);
      this.b(dcz.ur, fwq.bJ);
      this.b(dcz.us, fwq.bJ);
      this.b(dcz.uu, fwq.bJ);
      this.b(dcz.uv, fwq.bJ);
      this.b(dcz.uw, fwq.bJ);
      this.b(dcz.ut, fwq.bJ);
      this.b(dcz.ux, fwq.bJ);
      this.b(dcz.uy, fwq.bJ);
      this.b(dcz.uz, fwq.bJ);
      this.b(dcz.uA, fwq.bJ);
      this.b(dcz.uB, fwq.bJ);
      this.b(dcz.uC, fwq.bJ);
      this.b(dcz.uD, fwq.bJ);
      this.b(dcz.uE, fwq.bJ);
      this.b(dcz.uF, fwq.bJ);
      this.b(dcz.uG, fwq.bJ);
      this.b(dcz.uH, fwq.bJ);
      this.b(dcz.uI, fwq.bJ);
      this.b(dcz.uJ, fwq.bJ);
      this.b(dcz.uK, fwq.bJ);
      this.b(dcz.uL, fwq.bJ);
      this.b(dcz.uM, fwq.bJ);
      this.b(dcz.uN, fwq.bJ);
      this.b(dcz.uO, fwq.bJ);
      this.b(dcz.uP, fwq.bJ);
      this.b(dcz.uQ, fwq.bJ);
      this.b(dcz.uR, fwq.bJ);
      this.b(dcz.uS, fwq.bJ);
      this.b(dcz.uT, fwq.bJ);
      this.b(dcz.uU, fwq.bJ);
      this.b(dcz.uV, fwq.bJ);
      this.b(dcz.uW, fwq.bJ);
      this.b(dcz.uX, fwq.bJ);
      this.b(dcz.uY, fwq.bJ);
      this.b(dcz.uZ, fwq.bJ);
      this.b(dcz.va, fwq.bJ);
      this.b(dcz.vb, fwq.bJ);
      this.b(dcz.vc, fwq.bJ);
      this.b(dcz.vd, fwq.bJ);
      this.b(dcz.ve, fwq.bJ);
      this.b(dcz.vf, fwq.bJ);
      this.b(dcz.vg, fwq.bJ);
      this.b(dcz.vh, fwq.bJ);
      this.b(dcz.vi, fwq.bJ);
      this.b(dcz.vj, fwq.bJ);
      this.b(dcz.vk, fwq.bJ);
      this.b(dcz.vl, fwq.bJ);
      this.b(dcz.vm, fwq.bJ);
      this.b(dcz.vn, fwq.bJ);
      this.b(dcz.vo, fwq.bJ);
      this.b(dcz.vp, fwq.bJ);
      this.b(dcz.vq, fwq.bJ);
      this.b(dcz.vr, fwq.bJ);
      this.b(dcz.vs, fwq.bJ);
      this.b(dcz.vt, fwq.bJ);
      this.b(dcz.vu, fwq.bJ);
      this.b(dcz.vv, fwq.bJ);
      this.b(dcz.vw, fwq.bJ);
      this.a(dcz.a);
      this.a(dcz.yT);
      this.a(dcz.yQ);
      this.a(dcz.yR);
      this.a(dcz.yS);
      this.a(dcz.ei);
      this.a(dcz.eh);
      this.a(dcz.eg);
      this.a(dcz.yU);
      this.a(dcz.sY);
      this.a(dcz.sy);
      this.a(dcz.qy);
      this.a(dcz.wn);
   }

   public record a(dlh a, amd<dli> b) {
   }
}
