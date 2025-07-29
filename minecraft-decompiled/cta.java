import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cta {
   protected static final ImmutableList<? extends ckw<? extends ckv<? super csz>>> a = ImmutableList.of(ckw.c, ckw.d);
   protected static final ImmutableList<? extends cjo<?>> b = ImmutableList.of(cjo.g, cjo.h, cjo.k, cjo.l, cjo.m, cjo.o, cjo.n, cjo.F, cjo.u, cjo.p, cjo.q);

   static void a(cbm<csz> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex<csz>(0.8F) {
         protected boolean a(aub $$0, csz $$1) {
            return $$1.n() && super.a($$0, (cam)$$1);
         }
      }, new cdj(45, 90), new cdn()));
   }

   static void b(cbm<csz> $$0) {
      $$0.a(
         cwn.b,
         10,
         ImmutableList.of(
            cep.a(($$0x, $$1) -> $$1.gR(), ($$0x, $$1) -> $$1.eh().c(cjo.l)),
            ced.a(8.0F, bwu.a(30, 60)),
            new cea(ImmutableList.of(Pair.of(cdv.a(0.3F), 2), Pair.of(cek.a(0.3F, 3), 2), Pair.of(new ccn(30, 60), 1)))
         )
      );
   }

   static void a(csz $$0, cbm<csz> $$1) {
      $$1.a(cwn.k, 10, ImmutableList.of(cei.a(1.0F), cdk.a(csz::n, 40), ces.a(($$1x, $$2) -> !a($$0, $$2))), ImmutableSet.of(Pair.of(cjo.p, cjp.a)));
   }

   private static boolean a(csz $$0, cam $$1) {
      Optional<List<cut>> $$2 = $$0.eh().c(cjo.m);
      return $$2.<Boolean>map($$1x -> $$1 instanceof cut $$2x && $$1x.contains($$2x)).orElse(false);
   }

   public static cbm.b<csz> a() {
      return cbm.a(b, a);
   }

   public static cbm<csz> b(csz $$0, cbm<csz> $$1) {
      a($$1);
      b($$1);
      a($$0, $$1);
      $$1.a(ImmutableSet.of(cwn.a));
      $$1.b(cwn.b);
      $$1.f();
      return $$1;
   }

   public static void a(csz $$0) {
      if (!$$0.n()) {
         $$0.eh().f();
      } else {
         $$0.eh().a(ImmutableList.of(cwn.k, cwn.b));
      }
   }
}
