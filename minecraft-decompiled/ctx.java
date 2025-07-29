import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ctx {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = bcb.f(100.0F);
   public static final int a = bcb.f(133.59999F);
   public static final int b = bcb.f(84.0F);
   private static final int i = bcb.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<ckw<? extends ckv<? super ctw>>> k = List.of(ckw.d, ckw.z);
   private static final List<cjo<?>> l = List.of(
      cjo.g,
      cjo.h,
      cjo.k,
      cjo.l,
      cjo.N,
      cjo.o,
      cjo.n,
      cjo.F,
      cjo.u,
      cjo.p,
      cjo.q,
      cjo.C,
      cjo.az,
      cjo.aA,
      cjo.aB,
      cjo.aC,
      cjo.aD,
      cjo.aE,
      cjo.aF,
      cjo.aG,
      cjo.aH,
      cjo.aI,
      cjo.aJ,
      cjo.aK,
      cjo.aL,
      cjo.aM
   );
   private static final cce<ctw> m = cfq.a(
      (Function<cfq.b<ctw>, ? extends App<cfq.c<ctw>, cft<ctw>>>)($$0 -> $$0.group($$0.a(cjo.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
         if ($$0.a($$1).isPresent()) {
            $$1.a(bdk.a, 1200L);
         }

         return true;
      }))
   );

   public static void a(ctw $$0) {
      $$0.eh().a(ImmutableList.of(cwn.y, cwn.z, cwn.x, cwn.k, cwn.w, cwn.v, cwn.b));
   }

   protected static cbm<?> a(ctw $$0, Dynamic<?> $$1) {
      cbm.b<ctw> $$2 = cbm.a(l, k);
      cbm<ctw> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cwn.a));
      $$3.b(cwn.b);
      $$3.f();
      return $$3;
   }

   private static void a(cbm<ctw> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), cgb.a(), new cdj(45, 90), new cdn()));
   }

   private static void b(cbm<ctw> $$0) {
      $$0.a(cwn.y, 5, ImmutableList.of(new cfx(a)), cjo.aD);
   }

   private static void c(cbm<ctw> $$0) {
      $$0.a(cwn.z, ImmutableList.of(Pair.of(0, new cfy()), Pair.of(1, new cfw(h))), ImmutableSet.of(Pair.of(cjo.az, cjp.b), Pair.of(cjo.aF, cjp.b)));
   }

   private static void d(cbm<ctw> $$0) {
      $$0.a(
         cwn.b,
         10,
         ImmutableList.of(
            cga.a(ctw::t), cge.a(), new cea(ImmutableMap.of(cjo.aC, cjp.b), ImmutableList.of(Pair.of(cdv.a(0.5F), 2), Pair.of(new ccn(30, 60), 1)))
         )
      );
   }

   private static void e(cbm<ctw> $$0) {
      $$0.a(cwn.w, 5, ImmutableList.of(cga.a(ctw::t), ccw.a(cjo.aA, 2, 0.7F)), cjo.aA);
   }

   private static void f(cbm<ctw> $$0) {
      $$0.a(cwn.v, 5, ImmutableList.of(cga.a(ctw::t), new cgc(i)), cjo.aC);
   }

   private static void g(cbm<ctw> $$0) {
      $$0.a(cwn.x, 10, ImmutableList.of(new cfz()), cjo.az);
   }

   private static void a(ctw $$0, cbm<ctw> $$1) {
      $$1.a(
         cwn.k,
         10,
         ImmutableList.of(
            m,
            ces.a(($$1x, $$2) -> !$$0.n().d() || !$$0.G($$2), ctx::a, false),
            cec.a($$1x -> a($$0, $$1x), (float)$$0.i(cbs.n)),
            cei.a(1.2F),
            new cgd(),
            cdk.a(18)
         ),
         cjo.p
      );
   }

   private static boolean a(ctw $$0, cam $$1) {
      return $$0.eh().c(cjo.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(aub $$0, ctw $$1, cam $$2) {
      if (!$$1.G($$2)) {
         $$1.H($$2);
      }

      a((cam)$$1);
   }

   public static void a(cam $$0) {
      if ($$0.eh().a(cjo.aF)) {
         $$0.eh().a(cjo.aF, bdk.a, 1200L);
      }
   }

   public static void a(ctw $$0, jb $$1) {
      if ($$0.ai().F_().a($$1) && !$$0.t().isPresent() && !$$0.eh().c(cjo.p).isPresent()) {
         a((cam)$$0);
         $$0.eh().a(cjo.aH, bdk.a, 100L);
         $$0.eh().a(cjo.o, new ccg($$1), 100L);
         $$0.eh().a(cjo.aA, $$1, 100L);
         $$0.eh().b(cjo.n);
      }
   }
}
