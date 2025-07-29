import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class fbk {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final eea.f e = ($$0, $$1, $$2) -> $$0.a(dqb.cy);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final jh.a h;
   private final jh i;
   private final int j;
   private final jb k;
   private final int l;
   private final int m;

   private fbk(jh.a $$0, int $$1, jh $$2, jb $$3, int $$4, int $$5) {
      this.h = $$0;
      this.j = $$1;
      this.i = $$2;
      this.k = $$3;
      this.m = $$4;
      this.l = $$5;
   }

   public static Optional<fbk> a(dmv $$0, jb $$1, jh.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.j == 0, $$2);
   }

   public static Optional<fbk> a(dmv $$0, jb $$1, Predicate<fbk> $$2, jh.a $$3) {
      Optional<fbk> $$4 = Optional.of(a((dly)$$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jh.a $$5 = $$3 == jh.a.a ? jh.a.c : jh.a.a;
         return Optional.of(a((dly)$$0, $$1, $$5)).filter($$2);
      }
   }

   public static fbk a(dly $$0, jb $$1, jh.a $$2) {
      jh $$3 = $$2 == jh.a.a ? jh.e : jh.d;
      jb $$4 = a($$0, $$3, $$1);
      if ($$4 == null) {
         return new fbk($$2, 0, $$3, $$1, 0, 0);
      } else {
         int $$5 = a($$0, $$4, $$3);
         if ($$5 == 0) {
            return new fbk($$2, 0, $$3, $$4, 0, 0);
         } else {
            MutableInt $$6 = new MutableInt();
            int $$7 = a($$0, $$4, $$3, $$5, $$6);
            return new fbk($$2, $$6.getValue(), $$3, $$4, $$5, $$7);
         }
      }
   }

   @Nullable
   private static jb a(dly $$0, jh $$1, jb $$2) {
      int $$3 = Math.max($$0.L_(), $$2.v() - 21);

      while ($$2.v() > $$3 && a($$0.a_($$2.e()))) {
         $$2 = $$2.e();
      }

      jh $$4 = $$1.g();
      int $$5 = b($$0, $$2, $$4) - 1;
      return $$5 < 0 ? null : $$2.a($$4, $$5);
   }

   private static int a(dly $$0, jb $$1, jh $$2) {
      int $$3 = b($$0, $$1, $$2);
      return $$3 >= 2 && $$3 <= 21 ? $$3 : 0;
   }

   private static int b(dly $$0, jb $$1, jh $$2) {
      jb.a $$3 = new jb.a();

      for (int $$4 = 0; $$4 <= 21; $$4++) {
         $$3.g($$1).c($$2, $$4);
         eeb $$5 = $$0.a_($$3);
         if (!a($$5)) {
            if (e.test($$5, $$0, $$3)) {
               return $$4;
            }
            break;
         }

         eeb $$6 = $$0.a_($$3.c(jh.a));
         if (!e.test($$6, $$0, $$3)) {
            break;
         }
      }

      return 0;
   }

   private static int a(dly $$0, jb $$1, jh $$2, int $$3, MutableInt $$4) {
      jb.a $$5 = new jb.a();
      int $$6 = a($$0, $$1, $$2, $$5, $$3, $$4);
      return $$6 >= 3 && $$6 <= 21 && a($$0, $$1, $$2, $$5, $$3, $$6) ? $$6 : 0;
   }

   private static boolean a(dly $$0, jb $$1, jh $$2, jb.a $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         jb.a $$7 = $$3.g($$1).c(jh.b, $$5).c($$2, $$6);
         if (!e.test($$0.a_($$7), $$0, $$7)) {
            return false;
         }
      }

      return true;
   }

   private static int a(dly $$0, jb $$1, jh $$2, jb.a $$3, int $$4, MutableInt $$5) {
      for (int $$6 = 0; $$6 < 21; $$6++) {
         $$3.g($$1).c(jh.b, $$6).c($$2, -1);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         $$3.g($$1).c(jh.b, $$6).c($$2, $$4);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$3.g($$1).c(jh.b, $$6).c($$2, $$7);
            eeb $$8 = $$0.a_($$3);
            if (!a($$8)) {
               return $$6;
            }

            if ($$8.a(dqb.eu)) {
               $$5.increment();
            }
         }
      }

      return 21;
   }

   private static boolean a(eeb $$0) {
      return $$0.l() || $$0.a(azo.aQ) || $$0.a(dqb.eu);
   }

   public boolean a() {
      return this.m >= 2 && this.m <= 21 && this.l >= 3 && this.l <= 21;
   }

   public void a(dmv $$0) {
      eeb $$1 = dqb.eu.m().b(dvl.b, this.h);
      jb.c(this.k, this.k.a(jh.b, this.l - 1).a(this.i, this.m - 1)).forEach($$2 -> $$0.a($$2, $$1, 18));
   }

   public boolean b() {
      return this.a() && this.j == this.m * this.l;
   }

   public static fis a(m.a $$0, jh.a $$1, fis $$2, bzp $$3) {
      double $$4 = (double)$$0.b - $$3.a();
      double $$5 = (double)$$0.c - $$3.b();
      jb $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = $$6.a($$1) + $$3.a() / 2.0;
         $$8 = bcb.a(bcb.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         jh.a $$10 = jh.a.b;
         $$11 = bcb.a(bcb.c($$2.a($$10) - $$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      jh.a $$13 = $$1 == jh.a.a ? jh.a.c : jh.a.a;
      double $$14 = $$2.a($$13) - ($$6.a($$13) + 0.5);
      return new fis($$8, $$11, $$14);
   }

   public static fis a(fis $$0, aub $$1, bzm $$2, bzp $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = $$3.b() / 2.0;
         fis $$5 = $$0.b(0.0, $$4, 0.0);
         fjm $$6 = fjj.a(fin.a($$5, $$3.a(), 0.0, $$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<fis> $$7 = $$1.a($$2, $$6, $$5, $$3.a(), $$3.b(), $$3.a());
         Optional<fis> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}
