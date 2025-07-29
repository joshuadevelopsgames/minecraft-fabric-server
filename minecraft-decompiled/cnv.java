import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cnv {
   private static final bwu a = bwu.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static cbm<?> a(cbm<cnu> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<cnu> $$0) {
      $$0.a(cwn.p, ImmutableList.of(Pair.of(0, new cnw()), Pair.of(1, ccp.a(ccf::a, cjo.O))), ImmutableSet.of(Pair.of(cjo.O, cjp.a)), ImmutableSet.of(cjo.O));
   }

   private static void c(cbm<cnu> $$0) {
      $$0.a(cwn.k, 0, ImmutableList.of(ces.a(cnu::a), cei.a(cnv::b), cdk.a(20), ccp.a(ccf::a, cjo.p)), cjo.p);
   }

   private static void d(cbm<cnu> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cdj(45, 90), new cdn(), cnx.a(), new ccj(cjo.Q)));
   }

   private static void e(cbm<cnu> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(1, new cbx(bzv.i, 0.2F, 2)),
            Pair.of(2, new cea(ImmutableList.of(Pair.of(new ccq(cnv::d), 1), Pair.of(cca.a(a, cnv::c, cjo.L, false), 1)))),
            Pair.of(3, cep.a(cnv::a)),
            Pair.of(3, cfc.a(6, 0.15F)),
            Pair.of(
               4,
               new ccr(
                  ImmutableMap.of(cjo.n, cjp.b),
                  ImmutableSet.of(),
                  ccr.a.a,
                  ccr.b.b,
                  ImmutableList.of(
                     Pair.of(cdv.c(0.5F), 2),
                     Pair.of(cdv.a(0.15F, false), 2),
                     Pair.of(cek.a(cnv::a, cnv::d, 3), 3),
                     Pair.of(cfq.a(bzm::bm), 5),
                     Pair.of(cfq.a(bzm::aK), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(cam $$0) {
      dmu $$1 = $$0.ai();
      Optional<cdr> $$2 = $$0.eh().c(cjo.o);
      if ($$2.isPresent()) {
         jb $$3 = $$2.get().b();
         return $$1.B($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cnu $$0) {
      cbm<cnu> $$1 = $$0.eh();
      cwn $$2 = $$1.g().orElse(null);
      if ($$2 != cwn.p) {
         $$1.a(ImmutableList.of(cwn.p, cwn.k, cwn.b));
         if ($$2 == cwn.k && $$1.g().orElse(null) != cwn.k) {
            $$1.a(cjo.V, true, 2400L);
         }
      }
   }

   private static float b(cam $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(cam $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(cam $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends cam> a(aub $$0, cnu $$1) {
      return ccf.a($$1) ? Optional.empty() : $$1.eh().c(cjo.C);
   }

   public static Predicate<dcv> a() {
      return $$0 -> $$0.a(azx.aX);
   }
}
