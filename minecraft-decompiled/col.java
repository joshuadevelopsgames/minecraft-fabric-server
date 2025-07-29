import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class col {
   public static final int a = 20;
   public static final int b = 7;
   private static final bwu i = bwu.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bwu o = bwu.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bwu p = bwu.a(600, 6000);
   private static final bwu q = bwu.a(100, 300);
   private static final clc r = clc.a().a(($$0, $$1) -> !$$0.ap().equals(bzv.aj) && ($$1.P().c(dmq.d) || !$$0.ap().equals(bzv.g)) && $$1.F_().a($$0.cV()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cok $$0, bck $$1) {
      $$0.eh().a(cjo.T, o.a($$1));
      $$0.eh().a(cjo.W, p.a($$1));
   }

   protected static cbm<?> a(cbm<cok> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<cok> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new cby(2.0F), new cdj(45, 90), new cdn(), new ccj(cjo.Q), new ccj(cjo.T), new ccj(cjo.W)));
   }

   private static void c(cbm<cok> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(0, new cbx(bzv.aj)),
            Pair.of(1, new ccq($$0x -> 1.25F)),
            Pair.of(2, cca.a(i, 1.25F)),
            Pair.of(3, new cea(ImmutableList.of(Pair.of(cdv.a(1.0F), 2), Pair.of(cek.a(1.0F, 3), 2), Pair.of(new ccn(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cjo.X, cjp.b), Pair.of(cjo.U, cjp.b))
      );
   }

   private static void d(cbm<cok> $$0) {
      $$0.a(
         cwn.q,
         ImmutableList.of(Pair.of(0, new cde(o, ayz.lS)), Pair.of(1, new cdg<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gT() ? ayz.lO : ayz.lF))),
         ImmutableSet.of(Pair.of(cjo.P, cjp.b), Pair.of(cjo.s, cjp.b), Pair.of(cjo.n, cjp.b), Pair.of(cjo.T, cjp.b))
      );
   }

   private static void e(cbm<cok> $$0) {
      $$0.a(
         cwn.r,
         ImmutableList.of(
            Pair.of(0, new cdt($$0x -> $$0x.gT() ? q : p, r, 3.0F, $$0x -> $$0x.g_() ? 1.0 : 2.5, $$0x -> $$0x.gT() ? ayz.lR : ayz.lI, $$0x -> ayz.lJ)),
            Pair.of(1, new cds<>($$0x -> $$0x.gT() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gT() ? ayz.lQ : ayz.lH))
         ),
         ImmutableSet.of(Pair.of(cjo.P, cjp.b), Pair.of(cjo.s, cjp.b), Pair.of(cjo.W, cjp.b))
      );
   }

   public static void a(cok $$0) {
      $$0.eh().a(ImmutableList.of(cwn.r, cwn.q, cwn.b));
   }

   public static Predicate<dcv> a() {
      return $$0 -> $$0.a(azx.ax);
   }
}
