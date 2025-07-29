import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cns {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bwu h = bwu.a(5, 16);
   private static final ImmutableList<ckw<? extends ckv<? super cnr>>> i = ImmutableList.of(ckw.c, ckw.f, ckw.v, ckw.o, ckw.k);
   private static final ImmutableList<cjo<?>> j = ImmutableList.of(
      cjo.aa, cjo.y, cjo.z, cjo.n, cjo.o, cjo.F, cjo.u, cjo.h, cjo.P, cjo.Q, cjo.R, cjo.S, new cjo[]{cjo.s, cjo.L, cjo.H}
   );
   private static final cdo<cnr> k = cfq.a(
      (Function<cfq.b<cnr>, ? extends App<cfq.c<cnr>, cft<cnr>>>)($$0 -> $$0.group($$0.c(cjo.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
         if ($$1.n()) {
            $$1.gK();
            return true;
         } else {
            return false;
         }
      }))
   );

   public static cbm.b<cnr> a() {
      return cbm.a(j, i);
   }

   protected static cbm<?> a(cbm<cnr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<cnr> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new cns.b(2.0F), new cdj(45, 90), new cdn() {
         @Override
         protected boolean a(aub $$0, cao $$1) {
            return $$1 instanceof cnr $$2 && $$2.n() ? false : super.a($$0, $$1);
         }
      }, new ccj(cjo.Q), new ccj(cjo.R), k));
   }

   private static void c(cbm<cnr> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(1, new cbx(bzv.f, 1.0F, 1)),
            Pair.of(2, new cea(ImmutableList.of(Pair.of(new ccq($$0x -> 1.25F, $$0x -> $$0x.g_() ? 1.0 : 2.0), 1), Pair.of(cca.a(h, 1.25F), 1)))),
            Pair.of(3, new cdu(bwu.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new cea(ImmutableMap.of(cjo.n, cjp.b), ImmutableList.of(Pair.of(cdv.a(1.0F), 1), Pair.of(cek.a(1.0F, 3), 1), Pair.of(new ccn(30, 60), 1)))
            )
         )
      );
   }

   private static void d(cbm<cnr> $$0) {
      $$0.a(cwn.g, ImmutableList.of(Pair.of(0, new cns.a())), Set.of(Pair.of(cjo.H, cjp.a), Pair.of(cjo.aa, cjp.b)));
   }

   public static void a(cnr $$0) {
      $$0.eh().a(ImmutableList.of(cwn.g, cwn.b));
   }

   public static Predicate<dcv> b() {
      return $$0 -> $$0.a(azx.aH);
   }

   public static class a extends ccd<cnr> {
      static final int c = 5 * bdg.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aub $$0, cnr $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gH()) {
            $$1.a(cnr.a.c);
            if ($$1.aK()) {
               $$1.a(ayz.aj);
            }
         } else {
            cnr.a $$3 = $$1.gI();
            long $$4 = $$1.eh().e(cjo.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cnr.a.c) {
               if (this.f == 0 && $$1.aK() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < cnr.a.d.b()) {
                  $$1.a(ayz.an);
                  $$1.a(cnr.a.d);
               }
            } else if ($$3 == cnr.a.d && $$4 > cnr.a.d.b()) {
               $$1.a(cnr.a.c);
            }
         }
      }

      private int a(cnr $$0) {
         return cnr.a.c.b() + $$0.ec().a(100, 400);
      }

      protected boolean a(aub $$0, cnr $$1) {
         return $$1.aK();
      }

      protected boolean b(aub $$0, cnr $$1, long $$2) {
         return $$1.gI().a();
      }

      protected void c(aub $$0, cnr $$1, long $$2) {
         $$1.gJ();
      }

      protected void d(aub $$0, cnr $$1, long $$2) {
         if (!$$1.gT()) {
            $$1.gK();
         }
      }
   }

   public static class b extends cby<cnr> {
      public b(float $$0) {
         super($$0, $$0x -> azp.G);
      }

      protected void a(aub $$0, cnr $$1, long $$2) {
         $$1.gK();
         super.b($$0, $$1, $$2);
      }
   }
}
