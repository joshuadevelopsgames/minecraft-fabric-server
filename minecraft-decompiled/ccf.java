import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccf {
   private ccf() {
   }

   public static void a(cam $$0, cam $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(cbm<?> $$0, cam $$1) {
      Optional<cjq> $$2 = $$0.c(cjo.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(cbm<?> $$0, cjo<? extends cam> $$1, bzv<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ap() == $$2);
   }

   private static boolean a(cbm<?> $$0, cjo<? extends cam> $$1, Predicate<cam> $$2) {
      return $$0.c($$1).filter($$2).filter(cam::bO).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(cam $$0, cam $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(cam $$0, cam $$1) {
      $$0.eh().a(cjo.o, new cco($$1, true));
   }

   private static void b(cam $$0, cam $$1, float $$2, int $$3) {
      a($$0, (bzm)$$1, $$2, $$3);
      a($$1, (bzm)$$0, $$2, $$3);
   }

   public static void a(cam $$0, bzm $$1, float $$2, int $$3) {
      a($$0, new cco($$1, true), $$2, $$3);
   }

   public static void a(cam $$0, jb $$1, float $$2, int $$3) {
      a($$0, new ccg($$1), $$2, $$3);
   }

   public static void a(cam $$0, cdr $$1, float $$2, int $$3) {
      cjr $$4 = new cjr($$1, $$2, $$3);
      $$0.eh().a(cjo.o, $$1);
      $$0.eh().a(cjo.n, $$4);
   }

   public static void a(cam $$0, dcv $$1, fis $$2) {
      fis $$3 = new fis(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(cam $$0, dcv $$1, fis $$2, fis $$3, float $$4) {
      double $$5 = $$0.dG() - $$4;
      cqz $$6 = new cqz($$0.ai(), $$0.dC(), $$5, $$0.dI(), $$1);
      $$6.b($$0);
      fis $$7 = $$2.d($$0.dv());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.i();
      $$0.ai().b($$6);
   }

   public static ke a(aub $$0, ke $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return ke.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(cao $$0, cam $$1, int $$2) {
      if ($$0.fh().h() instanceof ddq $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, $$4);
      } else {
         return $$0.h($$1);
      }
   }

   public static boolean a(cam $$0, cam $$1, double $$2) {
      Optional<cam> $$3 = $$0.eh().c(cjo.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dv());
         double $$5 = $$0.g($$1.dv());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(cam $$0, cam $$1) {
      cbm<?> $$2 = $$0.eh();
      return !$$2.a(cjo.h) ? false : $$2.c(cjo.h).get().a($$1);
   }

   public static cam a(cam $$0, Optional<cam> $$1, cam $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static cam a(cam $$0, cam $$1, cam $$2) {
      fis $$3 = $$1.dv();
      fis $$4 = $$2.dv();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<cam> a(cam $$0, cjo<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eh().c($$1);
      return $$2.<bzm>map($$1x -> ((aub)$$0.ai()).b($$1x)).map($$0x -> $$0x instanceof cam $$1x ? $$1x : null);
   }

   @Nullable
   public static fis a(cau $$0, int $$1, int $$2) {
      fis $$3 = clg.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.ai().a_(jb.a((jv)$$3)).a(fba.b) && $$4++ < 10) {
         $$3 = clg.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(cam $$0) {
      return $$0.eh().a(cjo.s);
   }
}
