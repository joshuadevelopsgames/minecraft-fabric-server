import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ctd {
   public static final int a = 8;
   public static final int b = 4;
   private static final bwu c = bdg.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bwu j = bwu.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static cbm<?> a(cbm<ctc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<ctc> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cdj(45, 90), new cdn()));
   }

   private static void c(cbm<ctc> $$0) {
      $$0.a(
         cwn.b,
         10,
         ImmutableList.of(
            ccc.a(cjo.ax, 200),
            new cbx(bzv.al, 0.6F, 2),
            ceh.a(cjo.ax, 1.0F, 8, true),
            cep.a(ctd::a),
            cfq.a(ctc::n, ceh.b(cjo.ar, 0.4F, 8, false)),
            ced.a(8.0F, bwu.a(30, 60)),
            cca.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(cbm<ctc> $$0) {
      $$0.a(
         cwn.k,
         10,
         ImmutableList.of(
            ccc.a(cjo.ax, 200), new cbx(bzv.al, 0.6F, 2), cei.a(1.0F), cfq.a(ctc::n, cdk.a(40)), cfq.a(bzc::g_, cdk.a(15)), ces.a(), ccp.a(ctd::h, cjo.p)
         ),
         cjo.p
      );
   }

   private static void e(cbm<ctc> $$0) {
      $$0.a(cwn.n, 10, ImmutableList.of(ceh.b(cjo.A, 1.3F, 15, false), a(), ced.a(8.0F, bwu.a(30, 60)), ccp.a(ctd::d, cjo.A)), cjo.A);
   }

   private static cea<ctc> a() {
      return new cea<>(ImmutableList.of(Pair.of(cdv.a(0.4F), 2), Pair.of(cek.a(0.4F, 3), 2), Pair.of(new ccn(30, 60), 1)));
   }

   protected static void a(ctc $$0) {
      cbm<ctc> $$1 = $$0.eh();
      cwn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cwn.k, cwn.n, cwn.b));
      cwn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cjo.p));
   }

   protected static void a(ctc $$0, cam $$1) {
      if (!$$0.g_()) {
         if ($$1.ap() == bzv.aT && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(ctc $$0, cam $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(ctc $$0, cam $$1) {
      cbm<ctc> $$3 = $$0.eh();
      cam $$2 = ccf.a($$0, $$3.c(cjo.A), $$1);
      $$2 = ccf.a($$0, $$3.c(cjo.p), $$2);
      d($$0, $$2);
   }

   private static void d(ctc $$0, cam $$1) {
      $$0.eh().b(cjo.p);
      $$0.eh().b(cjo.n);
      $$0.eh().a(cjo.A, $$1, c.a($$0.ai().A));
   }

   private static Optional<? extends cam> a(aub $$0, ctc $$1) {
      return !c($$1) && !h($$1) ? $$1.eh().c(cjo.l) : Optional.empty();
   }

   static boolean a(ctc $$0, jb $$1) {
      Optional<jb> $$2 = $$0.eh().c(cjo.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(ctc $$0) {
      return $$0.n() && !e($$0);
   }

   private static boolean e(ctc $$0) {
      if ($$0.g_()) {
         return false;
      } else {
         int $$1 = $$0.eh().c(cjo.at).orElse(0);
         int $$2 = $$0.eh().c(cjo.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(aub $$0, ctc $$1, cam $$2) {
      cbm<ctc> $$3 = $$1.eh();
      $$3.b(cjo.ay);
      $$3.b(cjo.s);
      if ($$1.g_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(aub $$0, ctc $$1, cam $$2) {
      if (!$$1.eh().c(cwn.n) || $$2.ap() != bzv.aT) {
         if ($$2.ap() != bzv.al) {
            if (!ccf.a($$1, $$2, 4.0)) {
               if (ckv.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(ctc $$0, cam $$1) {
      cbm<ctc> $$2 = $$0.eh();
      $$2.b(cjo.F);
      $$2.b(cjo.s);
      $$2.a(cjo.p, $$1, 200L);
   }

   private static void f(ctc $$0, cam $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(ctc $$0, cam $$1) {
      if (!c($$0)) {
         Optional<cam> $$2 = $$0.eh().c(cjo.p);
         cam $$3 = ccf.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<ayy> b(ctc $$0) {
      return $$0.eh().g().map($$1 -> a($$0, $$1));
   }

   private static ayy a(ctc $$0, cwn $$1) {
      if ($$1 == cwn.n || $$0.gH()) {
         return ayz.nr;
      } else if ($$1 == cwn.k) {
         return ayz.nm;
      } else {
         return g($$0) ? ayz.nr : ayz.nl;
      }
   }

   private static List<ctc> f(ctc $$0) {
      return $$0.eh().c(cjo.aq).orElse(ImmutableList.of());
   }

   private static boolean g(ctc $$0) {
      return $$0.eh().a(cjo.ax);
   }

   private static boolean h(ctc $$0) {
      return $$0.eh().a(cjo.s);
   }

   protected static boolean c(ctc $$0) {
      return $$0.eh().a(cjo.ay);
   }
}
