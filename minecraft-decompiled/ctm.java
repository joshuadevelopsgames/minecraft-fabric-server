import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ctm {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static cbm<?> a(ctl $$0, cbm<ctl> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cwn.a));
      $$1.b(cwn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ctl $$0) {
      jk $$1 = jk.a($$0.ai().aj(), $$0.dx());
      $$0.eh().a(cjo.b, $$1);
   }

   private static void b(ctl $$0, cbm<ctl> $$1) {
      $$1.a(cwn.a, 0, ImmutableList.of(new cdj(45, 90), new cdn(), cdb.a(), cet.a()));
   }

   private static void c(ctl $$0, cbm<ctl> $$1) {
      $$1.a(cwn.b, 10, ImmutableList.of(cep.a(ctm::a), a(), b(), cef.a(bzv.bU, 4)));
   }

   private static void d(ctl $$0, cbm<ctl> $$1) {
      $$1.a(cwn.k, 10, ImmutableList.of(ces.a(($$1x, $$2) -> !a($$1x, (cth)$$0, $$2)), cei.a(1.0F), cdk.a(20)), cjo.p);
   }

   private static cea<ctl> a() {
      return new cea<>(
         ImmutableList.of(
            Pair.of(cec.a(bzv.bU, 8.0F), 1),
            Pair.of(cec.a(bzv.aT, 8.0F), 1),
            Pair.of(cec.a(bzv.aU, 8.0F), 1),
            Pair.of(cec.a(8.0F), 1),
            Pair.of(new ccn(30, 60), 1)
         )
      );
   }

   private static cea<ctl> b() {
      return new cea<>(
         ImmutableList.of(
            Pair.of(cdv.a(0.6F), 2),
            Pair.of(cda.a(bzv.aT, 8, cjo.r, 0.6F, 2), 2),
            Pair.of(cda.a(bzv.aU, 8, cjo.r, 0.6F, 2), 2),
            Pair.of(cev.a(cjo.b, 0.6F, 2, 100), 2),
            Pair.of(ceu.a(cjo.b, 0.6F, 5), 2),
            Pair.of(new ccn(30, 60), 1)
         )
      );
   }

   protected static void b(ctl $$0) {
      cbm<ctl> $$1 = $$0.eh();
      cwn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cwn.k, cwn.b));
      cwn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cjo.p));
   }

   private static boolean a(aub $$0, cth $$1, cam $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends cam> a(aub $$0, cth $$1) {
      Optional<cam> $$2 = ccf.a($$1, cjo.ac);
      if ($$2.isPresent() && ckv.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends cam> $$3 = $$1.eh().c(cjo.l);
         return $$3.isPresent() ? $$3 : $$1.eh().c(cjo.N);
      }
   }

   protected static void a(aub $$0, ctl $$1, cam $$2) {
      if (!($$2 instanceof cth)) {
         ctj.a($$0, $$1, $$2);
      }
   }

   protected static void a(ctl $$0, cam $$1) {
      $$0.eh().b(cjo.F);
      $$0.eh().a(cjo.ac, $$1.cK(), 600L);
   }

   protected static void c(ctl $$0) {
      if ($$0.ai().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ctl $$0) {
      $$0.eh().g().ifPresent($$1 -> {
         if ($$1 == cwn.k) {
            $$0.gN();
         }
      });
   }
}
