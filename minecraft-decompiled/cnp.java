import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cnp {
   private static final float a = 1.0F;
   private static final float b = 2.25F;
   private static final float c = 1.75F;
   private static final float d = 2.5F;
   private static final int e = 4;
   private static final int f = 16;
   private static final int g = 6;
   private static final int h = 30;
   private static final int i = 60;
   private static final int j = 600;
   private static final int k = 32;
   private static final int l = 20;

   protected static cbm<?> a(cbm<cno> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.f();
      return $$0;
   }

   private static void b(cbm<cno> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cex(0.8F), new cby(2.5F), new cdj(45, 90), new cdn(), new ccj(cjo.aP), new ccj(cjo.aQ)));
   }

   private static void c(cbm<cno> $$0) {
      $$0.a(
         cwn.b,
         ImmutableList.of(
            Pair.of(0, ccx.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new cct(cnp::b, 2.25F, 20)),
            Pair.of(2, cer.a(cnp::b, Predicate.not(cnp::c), 4, 16, 2.25F)),
            Pair.of(3, ced.a(6.0F, bwu.a(30, 60))),
            Pair.of(4, new cea(ImmutableList.of(Pair.of(cdv.b(1.0F), 2), Pair.of(cek.a(1.0F, 3), 2), Pair.of(new ccn(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cno $$0) {
      $$0.eh().a(ImmutableList.of(cwn.b));
   }

   public static void a(cam $$0, jb $$1) {
      cbm<?> $$2 = $$0.eh();
      jk $$3 = jk.a($$0.ai().aj(), $$1);
      Optional<jk> $$4 = $$2.c(cjo.aO);
      if ($$4.isEmpty()) {
         $$2.a(cjo.aO, $$3);
         $$2.a(cjo.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cjo.aP, 600);
      }
   }

   private static Optional<cdr> b(cam $$0) {
      cbm<?> $$1 = $$0.eh();
      Optional<jk> $$2 = $$1.c(cjo.aO);
      if ($$2.isPresent()) {
         jk $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new ccg($$3.b().d()));
         }

         $$1.b(cjo.aO);
      }

      return d($$0);
   }

   private static boolean c(cam $$0) {
      cbm<?> $$1 = $$0.eh();
      return $$1.a(cjo.M);
   }

   private static boolean a(cam $$0, cbm<?> $$1, jk $$2) {
      Optional<Integer> $$3 = $$1.c(cjo.aP);
      dmu $$4 = $$0.ai();
      return $$2.a($$4.aj(), $$0.dx(), 1024) && $$4.a_($$2.b()).a(dqb.bf) && $$3.isPresent();
   }

   private static Optional<cdr> d(cam $$0) {
      return a($$0).map($$0x -> new cco($$0x, true));
   }

   public static Optional<auc> a(cam $$0) {
      dmu $$1 = $$0.ai();
      if (!$$1.B_() && $$1 instanceof aub $$2) {
         Optional<UUID> $$3 = $$0.eh().c(cjo.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof auc $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
