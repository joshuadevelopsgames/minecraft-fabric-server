import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cod {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bwu e = bwu.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(coc $$0, bck $$1) {
      $$0.eh().a(cjo.T, e.a($$1));
   }

   protected static cbm<?> a(cbm<coc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<coc> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cby(2.0F), new cdj(45, 90), new cdn(), new ccj(cjo.Q), new ccj(cjo.T)));
   }

   private static void c(cbm<coc> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(0, new cbx(bzv.ac)),
            Pair.of(1, new ccq($$0x -> 1.25F)),
            Pair.of(2, cep.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eh().c(cjo.C))),
            Pair.of(3, cfa.a(6, 1.0F)),
            Pair.of(
               4,
               new cea(
                  ImmutableMap.of(cjo.n, cjp.b),
                  ImmutableList.of(Pair.of(cdv.a(1.0F), 1), Pair.of(cek.a(1.0F, 3), 1), Pair.of(new cck(), 3), Pair.of(cfq.a(bzm::aK), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cjo.U, cjp.b), Pair.of(cjo.Y, cjp.b))
      );
   }

   private static void d(cbm<coc> $$0) {
      $$0.a(
         cwn.t,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(1, new ccq($$0x -> 1.25F)),
            Pair.of(2, cep.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eh().c(cjo.C))),
            Pair.of(3, cfa.a(8, 1.5F)),
            Pair.of(
               5,
               new ccr(
                  ImmutableMap.of(cjo.n, cjp.b),
                  ImmutableSet.of(),
                  ccr.a.a,
                  ccr.b.b,
                  ImmutableList.of(Pair.of(cdv.c(0.75F), 1), Pair.of(cdv.a(1.0F, true), 1), Pair.of(cek.a(1.0F, 3), 1), Pair.of(cfq.a(bzm::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cjo.U, cjp.b), Pair.of(cjo.Y, cjp.a))
      );
   }

   private static void e(cbm<coc> $$0) {
      $$0.a(
         cwn.u,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(1, cep.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eh().c(cjo.C))),
            Pair.of(2, cfb.a(8, 1.0F)),
            Pair.of(3, cfd.a(dqb.tY)),
            Pair.of(4, new cea(ImmutableList.of(Pair.of(cdv.a(1.0F), 2), Pair.of(cek.a(1.0F, 3), 1), Pair.of(new cck(), 2), Pair.of(cfq.a(bzm::aK), 1))))
         ),
         ImmutableSet.of(Pair.of(cjo.U, cjp.b), Pair.of(cjo.Z, cjp.a))
      );
   }

   private static void f(cbm<coc> $$0) {
      $$0.a(
         cwn.q,
         ImmutableList.of(Pair.of(0, new cde(e, ayz.kE)), Pair.of(1, new cdf<>(e, 2, 4, 3.5714288F, $$0x -> ayz.kD, azo.bW, 0.5F, cod::a))),
         ImmutableSet.of(Pair.of(cjo.P, cjp.b), Pair.of(cjo.s, cjp.b), Pair.of(cjo.T, cjp.b), Pair.of(cjo.Y, cjp.b))
      );
   }

   private static void g(cbm<coc> $$0) {
      $$0.a(cwn.s, 0, ImmutableList.of(ces.a(), new cog(ayz.kF, ayz.kA)), cjo.p);
   }

   private static <E extends cao> boolean a(E $$0, jb $$1) {
      dmu $$2 = $$0.ai();
      jb $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         eeb $$4 = $$2.a_($$1);
         eeb $$5 = $$2.a_($$3);
         if (!$$4.a(azo.bW) && !$$5.a(azo.bW)) {
            fbe $$6 = new fbe($$0.ai(), $$0);
            fbc $$7 = fbh.a($$6, $$1.k());
            fbc $$8 = fbh.a($$6, $$3.k());
            return $$7 != fbc.e && (!$$4.l() || $$8 != fbc.e) ? cdg.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(coc $$0) {
      return !ccf.a($$0);
   }

   public static void a(coc $$0) {
      $$0.eh().a(ImmutableList.of(cwn.s, cwn.u, cwn.q, cwn.t, cwn.b));
   }

   public static Predicate<dcv> a() {
      return $$0 -> $$0.a(azx.aJ);
   }
}
