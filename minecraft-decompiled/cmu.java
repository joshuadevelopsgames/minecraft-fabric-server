import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.Set;

public class cmu {
   private static final float a = 1.0F;
   private static final float b = 1.25F;
   private static final float c = 1.1F;
   private static final double d = 3.0;
   private static final bwu e = bwu.a(3, 16);
   private static final ImmutableList<ckw<? extends ckv<? super cmt>>> f = ImmutableList.of(ckw.c, ckw.f, ckw.w, ckw.p, ckw.d);
   private static final ImmutableList<cjo<?>> g = ImmutableList.of(
      cjo.n, cjo.o, cjo.F, cjo.u, cjo.h, cjo.P, cjo.Q, cjo.S, cjo.s, cjo.aa, cjo.y, cjo.L, new cjo[]{cjo.j, cjo.k, cjo.l, cjo.m}
   );

   public static cbm.b<cmt> a() {
      return cbm.a(g, f);
   }

   protected static cbm<?> a(cbm<cmt> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<cmt> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new cby(2.0F, 0), new cdj(45, 90), new cdn(), new ccj(cjo.Q)));
   }

   private static void c(cbm<cmt> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(1, new ccq($$0x -> 1.25F, $$0x -> 3.0, true)),
            Pair.of(2, cca.a(e, $$0x -> 1.1F, cjo.k, true)),
            Pair.of(3, cca.a(e, $$0x -> 1.1F, cjo.L, true)),
            Pair.of(4, new cea(ImmutableList.of(Pair.of(cdv.b(1.0F), 1), Pair.of(cek.a(1.0F, 3), 1))))
         )
      );
   }

   private static void d(cbm<cmt> $$0) {
      $$0.a(cwn.g, ImmutableList.of(), Set.of(Pair.of(cjo.aa, cjp.a)));
   }

   public static void a(cmt $$0) {
      $$0.eh().a(ImmutableList.of(cwn.g, cwn.b));
   }
}
