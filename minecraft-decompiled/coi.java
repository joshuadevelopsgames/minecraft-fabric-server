import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class coi {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static cbm<?> a(cbm<coh> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<coh> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cby(2.0F), new cdj(45, 90), new cdn(), new ccj(cjo.Q)));
   }

   private static void c(cbm<coh> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(1, new ccq($$0x -> 1.25F)),
            Pair.of(
               2,
               new ccr(
                  ImmutableMap.of(cjo.n, cjp.b),
                  ImmutableSet.of(),
                  ccr.a.a,
                  ccr.b.b,
                  ImmutableList.of(Pair.of(cdv.c(0.5F), 2), Pair.of(cek.a(0.5F, 3), 3), Pair.of(cfq.a(bzm::bm), 5))
               )
            )
         )
      );
   }

   public static void a(coh $$0) {
      $$0.eh().a(ImmutableList.of(cwn.b));
   }
}
