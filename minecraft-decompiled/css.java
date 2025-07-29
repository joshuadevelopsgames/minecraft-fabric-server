import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class css {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<ckw<? extends ckv<? super csr>>> e = ImmutableList.of(ckw.c, ckw.f, ckw.d, ckw.B);
   static final List<cjo<?>> f = ImmutableList.of(
      cjo.o, cjo.h, cjo.C, cjo.F, cjo.p, cjo.n, cjo.aV, cjo.ba, cjo.aW, cjo.aX, cjo.aY, cjo.aZ, new cjo[]{cjo.bb, cjo.bc, cjo.y, cjo.z, cjo.u}
   );
   private static final int g = 100;

   protected static cbm<?> a(csr $$0, cbm<csr> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cwn.a));
      $$1.b(cwn.k);
      $$1.f();
      return $$1;
   }

   private static void a(cbm<csr> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new cdj(45, 90)));
   }

   private static void b(cbm<csr> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, cep.a(($$0x, $$1) -> $$1.eh().c(cjo.C))),
            Pair.of(1, cep.a(($$0x, $$1) -> $$1.gH())),
            Pair.of(2, new css.a(20, 40)),
            Pair.of(3, new cea(ImmutableList.of(Pair.of(new ccn(20, 100), 1), Pair.of(cdv.a(0.6F), 2))))
         )
      );
   }

   private static void b(csr $$0, cbm<csr> $$1) {
      $$1.a(
         cwn.k,
         ImmutableList.of(
            Pair.of(0, ces.a(ckv.a($$0, 100).negate()::test)), Pair.of(1, new csv()), Pair.of(2, new csu()), Pair.of(3, new csw()), Pair.of(4, new csx())
         ),
         ImmutableSet.of(Pair.of(cjo.p, cjp.a), Pair.of(cjo.n, cjp.b))
      );
   }

   static void a(csr $$0) {
      $$0.eh().a(ImmutableList.of(cwn.k, cwn.b));
   }

   public static class a extends cdn {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aub $$0, cao $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(ayz.cM);
         $$1.b(cay.p);
      }

      @Override
      protected void b(aub $$0, cao $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(cay.a);
         if ($$1.eh().a(cjo.p)) {
            $$1.eh().a(cjo.aW, bdk.a, 60L);
         }
      }
   }
}
