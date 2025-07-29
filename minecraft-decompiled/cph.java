import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class cph {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<ckw<? extends ckv<? super cpg>>> a = ImmutableList.of(ckw.c, ckw.f, ckw.d, ckw.A);
   static final List<cjo<?>> b = ImmutableList.of(
      cjo.o, cjo.n, cjo.F, cjo.u, cjo.aa, cjo.aS, cjo.aT, cjo.aU, cjo.aH, cjo.aR, cjo.h, cjo.s, new cjo[]{cjo.P, cjo.Q, cjo.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<dcv> a() {
      return $$0 -> $$0.a(azx.at);
   }

   protected static cbm<?> a(cbm<cpg> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   static cpg b(cpg $$0) {
      $$0.eh().b(cjo.aT);
      $$0.eh().b(cjo.aS);
      return $$0.a(cpg.a.a);
   }

   private static void b(cbm<cpg> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new cby<cpg>(2.0F) {
         protected void a(aub $$0, cpg $$1, long $$2) {
            cph.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new cdn(500, 700), new ccj(cjo.Q)));
   }

   private static void c(cbm<cpg> $$0) {
      $$0.a(cwn.v, ImmutableList.of(Pair.of(0, new cph.e())), Set.of(Pair.of(cjo.aa, cjp.b), Pair.of(cjo.aS, cjp.a), Pair.of(cjo.n, cjp.a)));
   }

   private static void d(cbm<cpg> $$0) {
      $$0.a(
         cwn.z,
         ImmutableList.of(Pair.of(0, new cph.a(160, 180)), Pair.of(0, new cph.c(40))),
         Set.of(Pair.of(cjo.aa, cjp.b), Pair.of(cjo.n, cjp.b), Pair.of(cjo.aT, cjp.a))
      );
   }

   private static void e(cbm<cpg> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, new cbx(bzv.bl) {
               @Override
               protected void a(aub $$0, cmd $$1, long $$2) {
                  cph.b((cpg)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new ccq($$0x -> 1.25F, $$0x -> $$0x.g_() ? 2.5 : 3.5) {
               @Override
               protected void b(aub $$0, cau $$1, long $$2) {
                  cph.b((cpg)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new cdj(45, 90)),
            Pair.of(3, new cph.b(40, 100)),
            Pair.of(
               4,
               new cea(
                  ImmutableList.of(
                     Pair.of(cek.a(1.0F, 3), 2),
                     Pair.of(new cph.d(40, 80), 1),
                     Pair.of(new cph.f(40, 80), 1),
                     Pair.of(cec.a(bzv.bU, 6.0F), 1),
                     Pair.of(cdv.a(1.0F), 1),
                     Pair.of(new ccn(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cjo.aT, cjp.b))
      );
   }

   static void a(cpg $$0) {
      $$0.eh().a(ImmutableList.of(cwn.z, cwn.v, cwn.b));
   }

   static class a extends ccd<cpg> {
      a(int $$0, int $$1) {
         super(Map.of(cjo.aa, cjp.b, cjo.n, cjp.b, cjo.aT, cjp.a, cjo.aH, cjp.b), $$0, $$1);
      }

      protected boolean a(aub $$0, cpg $$1) {
         return $$1.gH();
      }

      protected boolean a(aub $$0, cpg $$1, long $$2) {
         return $$1.eh().c(cjo.aT).isPresent() && $$1.gK() && !$$1.gR();
      }

      protected void b(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.f);
      }

      protected void c(aub $$0, cpg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eh().a(cjo.aH, bdk.a, 9600L);
         } else {
            cph.b($$1);
         }
      }
   }

   static class b extends ccd<cpg> {
      b(int $$0, int $$1) {
         super(Map.of(cjo.aU, cjp.a), $$0, $$1);
      }

      protected boolean a(aub $$0, cpg $$1, long $$2) {
         return true;
      }

      protected void b(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.b);
      }

      protected void c(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.a);
         $$1.eh().b(cjo.aU);
      }
   }

   static class c extends ccd<cpg> {
      c(int $$0) {
         super(Map.of(cjo.aa, cjp.b, cjo.n, cjp.b, cjo.aT, cjp.a, cjo.aH, cjp.a), $$0, $$0);
      }

      protected boolean a(aub $$0, cpg $$1) {
         return true;
      }

      protected boolean a(aub $$0, cpg $$1, long $$2) {
         return $$1.eh().c(cjo.aT).isPresent();
      }

      protected void b(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.g);
      }

      protected void c(aub $$0, cpg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cpg.a.a).x($$3);
         $$1.eh().b(cjo.aT);
         $$1.eh().a(cjo.aU, true);
      }
   }

   static class d extends ccd<cpg> {
      d(int $$0, int $$1) {
         super(Map.of(cjo.aa, cjp.b, cjo.aT, cjp.b, cjo.aS, cjp.b, cjo.aU, cjp.b, cjo.s, cjp.b), $$0, $$1);
      }

      protected boolean a(aub $$0, cpg $$1) {
         return !$$1.t();
      }

      protected boolean a(aub $$0, cpg $$1, long $$2) {
         return true;
      }

      protected void b(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.c);
      }

      protected void c(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.a);
      }
   }

   static class e extends ccd<cpg> {
      e() {
         super(Map.of(cjo.n, cjp.a, cjo.aa, cjp.b, cjo.aS, cjp.a), 600);
      }

      protected boolean a(aub $$0, cpg $$1) {
         return $$1.gH();
      }

      protected boolean a(aub $$0, cpg $$1, long $$2) {
         if (!$$1.gH()) {
            $$1.a(cpg.a.a);
            return false;
         } else {
            Optional<jb> $$3 = $$1.eh().c(cjo.n).map(cjr::a).map(cdr::b);
            Optional<jb> $$4 = $$1.eh().c(cjo.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.e);
      }

      protected void c(aub $$0, cpg $$1, long $$2) {
         if ($$1.gK() && $$1.gH()) {
            $$1.eh().a(cjo.aT, true);
         }

         $$1.eh().b(cjo.n);
         $$1.eh().b(cjo.aS);
      }
   }

   static class f extends ccd<cpg> {
      f(int $$0, int $$1) {
         super(Map.of(cjo.n, cjp.b, cjo.aS, cjp.b, cjo.aH, cjp.b), $$0, $$1);
      }

      protected boolean a(aub $$0, cpg $$1) {
         return !$$1.g_() && $$1.gH();
      }

      protected boolean a(aub $$0, cpg $$1, long $$2) {
         return $$1.gH();
      }

      protected void b(aub $$0, cpg $$1, long $$2) {
         $$1.a(cpg.a.d);
      }

      protected void c(aub $$0, cpg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cpg.a.a);
         if ($$3) {
            $$1.gJ().ifPresent($$1x -> {
               $$1.eh().a(cjo.aS, $$1x);
               $$1.eh().a(cjo.n, new cjr($$1x, 1.25F, 0));
            });
         }
      }
   }
}
