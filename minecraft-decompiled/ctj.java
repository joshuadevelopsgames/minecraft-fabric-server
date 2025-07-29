import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ctj {
   public static final int a = 8;
   public static final int b = 4;
   public static final dcr c = dcz.pO;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bwu d = bdg.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bwu o = bdg.a(10, 40);
   private static final bwu p = bdg.a(10, 30);
   private static final bwu q = bdg.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bwu A = bdg.a(5, 7);
   private static final bwu B = bdg.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static cbm<?> a(cti $$0, cbm<cti> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cwn.a));
      $$1.b(cwn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cti $$0, bck $$1) {
      int $$2 = d.a($$1);
      $$0.eh().a(cjo.ai, true, $$2);
   }

   private static void a(cbm<cti> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cdj(45, 90), new cdn(), cdb.a(), e(), f(), cts.a(), cto.a(119), ceq.a(300, ctj::a), cet.a()));
   }

   private static void b(cbm<cti> $$0) {
      $$0.a(
         cwn.b,
         10,
         ImmutableList.of(cec.a(ctj::b, 14.0F), cep.a(($$0x, $$1) -> $$1.gH(), ctj::b), cfq.a(cti::l, ctp.a()), d(), g(), b(), c(), cef.a(bzv.bU, 4))
      );
   }

   private static void b(cti $$0, cbm<cti> $$1) {
      $$1.a(
         cwn.k,
         10,
         ImmutableList.of(
            ces.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cfq.a(ctj::c, ccb.a(5, 0.75F)), cei.a(1.0F), cdk.a(20), new ccl(), ctn.a(), ccp.a(ctj::g, cjo.p)
         ),
         cjo.p
      );
   }

   private static void c(cbm<cti> $$0) {
      $$0.a(
         cwn.l,
         10,
         ImmutableList.of(
            d(),
            cec.a(ctj::b, 14.0F),
            cep.a(($$0x, $$1) -> $$1.gH(), ctj::b),
            cfq.a($$0x -> !$$0x.gO(), ccw.a(cjo.aj, 2, 1.0F)),
            cfq.a(cti::gO, ccw.a(cjo.aj, 4, 0.6F)),
            new cea(ImmutableList.of(Pair.of(cec.a(bzv.aT, 8.0F), 1), Pair.of(cdv.a(0.6F, 2, 1), 1), Pair.of(new ccn(10, 20), 1)))
         ),
         cjo.aj
      );
   }

   private static void d(cbm<cti> $$0) {
      $$0.a(cwn.m, 10, ImmutableList.of(ccx.a(ctj::t, 1.0F, true, 9), ctq.a(9), ctr.a(200, 200)), cjo.ae);
   }

   private static void e(cbm<cti> $$0) {
      $$0.a(cwn.n, 10, ImmutableList.of(ceh.b(cjo.A, 1.0F, 12, true), b(), c(), ccp.a(ctj::j, cjo.A)), cjo.A);
   }

   private static void f(cbm<cti> $$0) {
      $$0.a(
         cwn.o,
         10,
         ImmutableList.of(
            cdl.a(0.8F),
            cec.a(ctj::b, 8.0F),
            cfq.a(cfq.a(bzm::cc), cez.a(ImmutableList.builder().addAll(a()).add(Pair.of(cfq.a((Predicate<cti>)($$0x -> true)), 1)).build())),
            ccm.a(8, ctj::a)
         ),
         cjo.t
      );
   }

   private static ImmutableList<Pair<cdo<cam>, Integer>> a() {
      return ImmutableList.of(Pair.of(cec.a(bzv.bU, 8.0F), 1), Pair.of(cec.a(bzv.aT, 8.0F), 1), Pair.of(cec.a(8.0F), 1));
   }

   private static cea<cam> b() {
      return new cea<>(ImmutableList.builder().addAll(a()).add(Pair.of(new ccn(30, 60), 1)).build());
   }

   private static cea<cti> c() {
      return new cea<>(
         ImmutableList.of(
            Pair.of(cdv.a(0.6F), 2), Pair.of(cda.a(bzv.aT, 8, cjo.r, 0.6F, 2), 2), Pair.of(cfq.a(ctj::f, cek.a(0.6F, 3)), 2), Pair.of(new ccn(30, 60), 1)
         )
      );
   }

   private static cce<cau> d() {
      return ceh.a(cjo.ax, 1.0F, 8, false);
   }

   private static cce<cti> e() {
      return cci.a(cti::g_, cjo.N, cjo.A, B);
   }

   private static cce<cti> f() {
      return cci.a(ctj::g, cjo.as, cjo.A, A);
   }

   protected static void a(cti $$0) {
      cbm<cti> $$1 = $$0.eh();
      cwn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cwn.m, cwn.k, cwn.n, cwn.l, cwn.o, cwn.b));
      cwn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cjo.p));
      if (!$$1.a(cjo.t) && e($$0)) {
         $$0.bS();
      }

      if (!$$1.a(cjo.aj)) {
         $$1.b(cjo.ak);
      }

      $$0.y($$1.a(cjo.ak));
   }

   private static boolean e(cti $$0) {
      if (!$$0.g_()) {
         return false;
      } else {
         bzm $$1 = $$0.dm();
         return $$1 instanceof cti && ((cti)$$1).g_() || $$1 instanceof ctc && ((ctc)$$1).g_();
      }
   }

   protected static void a(aub $$0, cti $$1, cqz $$2) {
      i($$1);
      dcv $$3;
      if ($$2.e().a(dcz.tH)) {
         $$1.a($$2, $$2.e().M());
         $$3 = $$2.e();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eh().b(cjo.af);
         a($$0, $$1, $$3);
         d((cam)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(dcv.l);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(aub $$0, cti $$1, dcv $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bxi.b));
      }

      $$1.l($$2);
   }

   private static dcv a(cqz $$0) {
      dcv $$1 = $$0.e();
      dcv $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(aub $$0, cti $$1, boolean $$2) {
      dcv $$3 = $$1.b(bxi.b);
      $$1.a(bxi.b, dcv.l);
      if ($$1.gH()) {
         boolean $$4 = b($$3);
         if ($$2 && $$4) {
            a($$1, f($$1));
         } else if (!$$4) {
            boolean $$5 = !$$1.b($$0, $$3).f();
            if (!$$5) {
               c($$1, $$3);
            }
         }
      } else {
         boolean $$6 = !$$1.b($$0, $$3).f();
         if (!$$6) {
            dcv $$7 = $$1.fh();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(aub $$0, cti $$1) {
      if (p($$1) && !$$1.fi().f()) {
         $$1.a($$0, $$1.fi());
         $$1.a(bxi.b, dcv.l);
      }
   }

   private static void c(cti $$0, dcv $$1) {
      dcv $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cti $$0, List<dcv> $$1) {
      Optional<cut> $$2 = $$0.eh().c(cjo.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cti $$0, List<dcv> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cti $$0, cut $$1, List<dcv> $$2) {
      a($$0, $$2, $$1.dv());
   }

   private static void a(cti $$0, List<dcv> $$1, fis $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bxi.b);

         for (dcv $$3 : $$1) {
            ccf.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<dcv> f(cti $$0) {
      fdo $$1 = $$0.ai().q().bc().a(fdf.aK);
      List<dcv> $$2 = $$1.a(new fdm.a((aub)$$0.ai()).a(fgd.a, $$0).a(fgc.k));
      return $$2;
   }

   private static boolean a(cam $$0, cam $$1) {
      return $$1.ap() != bzv.al ? false : bck.a($$0.ai().ae()).i() < 0.1F;
   }

   protected static boolean a(cti $$0, dcv $$1) {
      if ($$0.g_() && $$1.a(azx.an)) {
         return false;
      } else if ($$1.a(azx.al)) {
         return false;
      } else if (r($$0) && $$0.eh().a(cjo.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(dcz.tH)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(dcv $$0) {
      return $$0.a(azx.am);
   }

   private static boolean a(cti $$0, bzm $$1) {
      return !($$1 instanceof cao $$2) ? false : !$$2.g_() || !$$2.bO() || g((cam)$$0) || g($$2) || $$2 instanceof cti && $$2.dm() == null;
   }

   private static boolean b(aub $$0, cti $$1, cam $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cti $$0) {
      cbm<cti> $$1 = $$0.eh();
      if ($$1.a(cjo.as)) {
         cam $$2 = $$1.c(cjo.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends cam> b(aub $$0, cti $$1) {
      cbm<cti> $$2 = $$1.eh();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<cam> $$3 = ccf.a($$1, cjo.ac);
         if ($$3.isPresent() && ckv.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cjo.ad)) {
               Optional<cut> $$4 = $$2.c(cjo.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<cao> $$5 = $$2.c(cjo.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cut> $$6 = $$2.c(cjo.an);
               return $$6.isPresent() && ckv.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(aub $$0, cut $$1, boolean $$2) {
      List<cti> $$3 = $$1.ai().a(cti.class, $$1.cV().g(16.0));
      $$3.stream().filter(ctj::c).filter($$2x -> !$$2 || ccf.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.P().c(dmq.Q)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bxj a(aub $$0, cti $$1, cut $$2, bxi $$3) {
      dcv $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         dcv $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((cam)$$1);
         i($$1);
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   protected static boolean b(cti $$0, dcv $$1) {
      return !r($$0) && !p($$0) && $$0.gH() && b($$1);
   }

   protected static void a(aub $$0, cti $$1, cam $$2) {
      if (!($$2 instanceof cti)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         cbm<cti> $$3 = $$1.eh();
         $$3.b(cjo.aj);
         $$3.b(cjo.ak);
         $$3.b(cjo.ae);
         if ($$2 instanceof cut) {
            $$3.a(cjo.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.ap() != $$2.ap()) {
               $$3.b(cjo.A);
            }
         });
         if ($$1.g_()) {
            $$3.a(cjo.A, $$2, 100L);
            if (ckv.d($$0, $$1, $$2)) {
               b($$0, (cth)$$1, $$2);
            }
         } else if ($$2.ap() == bzv.al && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cth)$$1, $$2);
         }
      }
   }

   protected static void a(aub $$0, cth $$1, cam $$2) {
      if (!$$1.eh().c(cwn.n)) {
         if (ckv.d($$0, $$1, $$2)) {
            if (!ccf.a($$1, $$2, 4.0)) {
               if ($$2.ap() == bzv.bU && $$0.P().c(dmq.Q)) {
                  d($$0, $$1, $$2);
                  a($$0, $$1);
               } else {
                  c($$0, $$1, $$2);
                  b($$0, $$1, $$2);
               }
            }
         }
      }
   }

   public static Optional<ayy> b(cti $$0) {
      return $$0.eh().g().map($$1 -> a($$0, $$1));
   }

   private static ayy a(cti $$0, cwn $$1) {
      if ($$1 == cwn.k) {
         return ayz.uV;
      } else if ($$0.t()) {
         return ayz.va;
      } else if ($$1 == cwn.n && h($$0)) {
         return ayz.va;
      } else if ($$1 == cwn.m) {
         return ayz.uT;
      } else if ($$1 == cwn.l) {
         return ayz.uW;
      } else if (e((cam)$$0)) {
         return ayz.uY;
      } else {
         return q($$0) ? ayz.va : ayz.uU;
      }
   }

   private static boolean h(cti $$0) {
      cbm<cti> $$1 = $$0.eh();
      return !$$1.a(cjo.A) ? false : $$1.c(cjo.A).get().a($$0, 12.0);
   }

   protected static List<cth> c(cti $$0) {
      return $$0.eh().c(cjo.ap).orElse(ImmutableList.of());
   }

   private static List<cth> d(cth $$0) {
      return $$0.eh().c(cjo.ao).orElse(ImmutableList.of());
   }

   public static boolean a(cam $$0) {
      for (bzw $$1 : bzx.i) {
         if ($$0.a($$1).a(azx.ao)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cti $$0) {
      $$0.eh().b(cjo.n);
      $$0.S().n();
   }

   private static cce<cam> g() {
      ced.a $$0 = new ced.a(o);
      return cci.a($$1 -> $$1.g_() && $$0.a($$1.ai().A), cjo.am, cjo.t, p);
   }

   protected static void b(aub $$0, cth $$1, cam $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.ap() != bzv.al || $$2x.l() && ((ctc)$$2).gI()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(aub $$0, cth $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(aub $$0, cth $$1, cam $$2) {
      if (ckv.d($$0, $$1, $$2)) {
         $$1.eh().b(cjo.F);
         $$1.eh().a(cjo.ac, $$2.cK(), 600L);
         if ($$2.ap() == bzv.al && $$1.l()) {
            b($$1);
         }

         if ($$2.ap() == bzv.bU && $$0.P().c(dmq.Q)) {
            $$1.eh().a(cjo.ad, true, 600L);
         }
      }
   }

   private static void d(aub $$0, cth $$1, cam $$2) {
      Optional<cut> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(aub $$0, cth $$1, cam $$2) {
      Optional<cam> $$3 = e($$1);
      cam $$4 = ccf.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<cam> e(cth $$0) {
      return ccf.a($$0, cjo.ac);
   }

   public static Optional<cam> d(cti $$0) {
      return $$0.eh().a(cjo.A) ? $$0.eh().c(cjo.A) : Optional.empty();
   }

   public static Optional<cut> a(cth $$0) {
      return $$0.eh().a(cjo.l) ? $$0.eh().c(cjo.l) : Optional.empty();
   }

   private static void a(cti $$0, cam $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cti).forEach($$1x -> b((cti)$$1x, $$1));
   }

   private static void b(cti $$0, cam $$1) {
      cbm<cti> $$2 = $$0.eh();
      cam $$3 = ccf.a($$0, $$2.c(cjo.A), $$1);
      $$3 = ccf.a($$0, $$2.c(cjo.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cti $$0) {
      cbm<cti> $$1 = $$0.eh();
      if (!$$1.a(cjo.A)) {
         return true;
      } else {
         cam $$2 = $$1.c(cjo.A).get();
         bzv<?> $$3 = $$2.ap();
         if ($$3 == bzv.al) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cjo.as, $$2) : false;
         }
      }
   }

   private static boolean k(cti $$0) {
      return !l($$0);
   }

   private static boolean l(cti $$0) {
      int $$1 = $$0.eh().c(cjo.at).orElse(0) + 1;
      int $$2 = $$0.eh().c(cjo.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cti $$0, cam $$1) {
      $$0.eh().b(cjo.ac);
      $$0.eh().b(cjo.p);
      $$0.eh().b(cjo.n);
      $$0.eh().a(cjo.A, $$1, q.a($$0.ai().A));
      b((cth)$$0);
   }

   protected static void b(cth $$0) {
      $$0.eh().a(cjo.ai, true, d.a($$0.ai().A));
   }

   private static void m(cti $$0) {
      $$0.eh().a(cjo.aw, true, 200L);
   }

   private static fis n(cti $$0) {
      fis $$1 = clj.a($$0, 4, 2);
      return $$1 == null ? $$0.dv() : $$1;
   }

   private static boolean o(cti $$0) {
      return $$0.eh().a(cjo.aw);
   }

   protected static boolean c(cth $$0) {
      return $$0.eh().c(cwn.b);
   }

   private static boolean c(cam $$0) {
      return $$0.b(dcz.xA);
   }

   private static void d(cam $$0) {
      $$0.eh().a(cjo.ae, true, 119L);
   }

   private static boolean p(cti $$0) {
      return $$0.eh().a(cjo.ae);
   }

   private static boolean b(dcv $$0) {
      return $$0.a(c);
   }

   private static boolean c(dcv $$0) {
      return $$0.a(azx.au);
   }

   private static boolean q(cti $$0) {
      return $$0.eh().a(cjo.ax);
   }

   private static boolean e(cam $$0) {
      return $$0.eh().a(cjo.av);
   }

   private static boolean f(cam $$0) {
      return !e($$0);
   }

   public static boolean b(cam $$0) {
      return $$0.ap() == bzv.bU && $$0.b(ctj::a);
   }

   private static boolean r(cti $$0) {
      return $$0.eh().a(cjo.ah);
   }

   private static boolean g(cam $$0) {
      return $$0.eh().a(cjo.y);
   }

   private static boolean s(cti $$0) {
      return !$$0.fi().f();
   }

   private static boolean t(cti $$0) {
      return $$0.fi().f() || !a($$0.fi());
   }

   public static boolean a(bzv<?> $$0) {
      return $$0 == bzv.bT || $$0 == bzv.bP;
   }
}
