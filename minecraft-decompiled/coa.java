import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class coa {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bwu f = bwu.a(5, 16);
   private static final ImmutableList<ckw<? extends ckv<? super cnz>>> g = ImmutableList.of(ckw.c, ckw.f, ckw.u, ckw.o);
   private static final ImmutableList<cjo<?>> h = ImmutableList.of(
      cjo.aa, cjo.y, cjo.z, cjo.n, cjo.o, cjo.F, cjo.u, cjo.h, cjo.P, cjo.Q, cjo.R, cjo.S, new cjo[]{cjo.s, cjo.L}
   );

   protected static void a(cnz $$0, bck $$1) {
   }

   public static cbm.b<cnz> a() {
      return cbm.a(h, g);
   }

   protected static cbm<?> a(cbm<cnz> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<cnz> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new coa.a(4.0F), new cdj(45, 90), new cdn(), new ccj(cjo.Q), new ccj(cjo.R)));
   }

   private static void c(cbm<cnz> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ced.a(bzv.bU, 6.0F, bwu.a(30, 60))),
            Pair.of(1, new cbx(bzv.u)),
            Pair.of(
               2,
               new cea(
                  ImmutableList.of(Pair.of(new ccq($$0x -> 2.5F, $$0x -> $$0x.g_() ? 2.5 : 3.5), 1), Pair.of(cfq.a(Predicate.not(cnz::n), cca.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cdu(bwu.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new cea(
                  ImmutableMap.of(cjo.n, cjp.b),
                  ImmutableList.of(
                     Pair.of(cfq.a(Predicate.not(cnz::n), cdv.a(2.0F)), 1),
                     Pair.of(cfq.a(Predicate.not(cnz::n), cek.a(2.0F, 3)), 1),
                     Pair.of(new coa.b(20), 1),
                     Pair.of(new ccn(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cnz $$0) {
      $$0.eh().a(ImmutableList.of(cwn.b));
   }

   public static Predicate<dcv> b() {
      return $$0 -> $$0.a(azx.aG);
   }

   public static class a extends cby<cnz> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aub $$0, cnz $$1, long $$2) {
         $$1.gW();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends ccd<cnz> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aub $$0, cnz $$1) {
         return !$$1.bm() && $$1.gX() >= this.c && !$$1.R_() && $$1.aK() && !$$1.cZ() && $$1.gH();
      }

      protected void a(aub $$0, cnz $$1, long $$2) {
         if ($$1.gK()) {
            $$1.gV();
         } else if (!$$1.gE()) {
            $$1.gU();
         }
      }
   }
}
