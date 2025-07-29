import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class fjj {
   public static final double a = 1.0E-7;
   public static final double b = 1.0E-6;
   private static final fjm d = ag.a(() -> {
      fjb $$0 = new fiv(1, 1, 1);
      $$0.c(0, 0, 0);
      return new fiz($$0);
   });
   private static final fis e = new fis(0.5, 0.5, 0.5);
   public static final fjm c = a(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final fjm f = new fiu(
      new fiv(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static fjm a() {
      return f;
   }

   public static fjm b() {
      return d;
   }

   public static fjm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$0 > $$3) && !($$1 > $$4) && !($$2 > $$5)) {
         return b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static fjm b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      if (!($$3 - $$0 < 1.0E-7) && !($$4 - $$1 < 1.0E-7) && !($$5 - $$2 < 1.0E-7)) {
         int $$6 = a($$0, $$3);
         int $$7 = a($$1, $$4);
         int $$8 = a($$2, $$5);
         if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fiu(
               d.a, DoubleArrayList.wrap(new double[]{$$0, $$3}), DoubleArrayList.wrap(new double[]{$$1, $$4}), DoubleArrayList.wrap(new double[]{$$2, $$5})
            );
         } else if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return b();
         } else {
            int $$9 = 1 << $$6;
            int $$10 = 1 << $$7;
            int $$11 = 1 << $$8;
            fiv $$12 = fiv.a(
               $$9,
               $$10,
               $$11,
               (int)Math.round($$0 * $$9),
               (int)Math.round($$1 * $$10),
               (int)Math.round($$2 * $$11),
               (int)Math.round($$3 * $$9),
               (int)Math.round($$4 * $$10),
               (int)Math.round($$5 * $$11)
            );
            return new fiz($$12);
         }
      } else {
         return a();
      }
   }

   public static fjm a(fin $$0) {
      return b($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
   }

   @VisibleForTesting
   protected static int a(double $$0, double $$1) {
      if (!($$0 < -1.0E-7) && !($$1 > 1.0000001)) {
         for (int $$2 = 0; $$2 <= 3; $$2++) {
            int $$3 = 1 << $$2;
            double $$4 = $$0 * $$3;
            double $$5 = $$1 * $$3;
            boolean $$6 = Math.abs($$4 - Math.round($$4)) < 1.0E-7 * $$3;
            boolean $$7 = Math.abs($$5 - Math.round($$5)) < 1.0E-7 * $$3;
            if ($$6 && $$7) {
               return $$2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   protected static long a(int $$0, int $$1) {
      return (long)$$0 * ($$1 / IntMath.gcd($$0, $$1));
   }

   public static fjm a(fjm $$0, fjm $$1) {
      return a($$0, $$1, fiw.o);
   }

   public static fjm a(fjm $$0, fjm... $$1) {
      return Arrays.stream($$1).reduce($$0, fjj::a);
   }

   public static fjm a(fjm $$0, fjm $$1, fiw $$2) {
      return b($$0, $$1, $$2).d();
   }

   public static fjm b(fjm $$0, fjm $$1, fiw $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ag.b(new IllegalArgumentException());
      } else if ($$0 == $$1) {
         return $$2.apply(true, true) ? $$0 : a();
      } else {
         boolean $$3 = $$2.apply(true, false);
         boolean $$4 = $$2.apply(false, true);
         if ($$0.c()) {
            return $$4 ? $$1 : a();
         } else if ($$1.c()) {
            return $$3 ? $$0 : a();
         } else {
            fje $$5 = a(1, $$0.a(jh.a.a), $$1.a(jh.a.a), $$3, $$4);
            fje $$6 = a($$5.size() - 1, $$0.a(jh.a.b), $$1.a(jh.a.b), $$3, $$4);
            fje $$7 = a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(jh.a.c), $$1.a(jh.a.c), $$3, $$4);
            fiv $$8 = fiv.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
            return (fjm)($$5 instanceof fja && $$6 instanceof fja && $$7 instanceof fja ? new fiz($$8) : new fiu($$8, $$5.a(), $$6.a(), $$7.a()));
         }
      }
   }

   public static boolean c(fjm $$0, fjm $$1, fiw $$2) {
      if ($$2.apply(false, false)) {
         throw (IllegalArgumentException)ag.b(new IllegalArgumentException());
      } else {
         boolean $$3 = $$0.c();
         boolean $$4 = $$1.c();
         if (!$$3 && !$$4) {
            if ($$0 == $$1) {
               return $$2.apply(true, true);
            } else {
               boolean $$5 = $$2.apply(true, false);
               boolean $$6 = $$2.apply(false, true);

               for (jh.a $$7 : iy.d) {
                  if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }

                  if ($$1.c($$7) < $$0.b($$7) - 1.0E-7) {
                     return $$5 || $$6;
                  }
               }

               fje $$8 = a(1, $$0.a(jh.a.a), $$1.a(jh.a.a), $$5, $$6);
               fje $$9 = a($$8.size() - 1, $$0.a(jh.a.b), $$1.a(jh.a.b), $$5, $$6);
               fje $$10 = a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(jh.a.c), $$1.a(jh.a.c), $$5, $$6);
               return a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
            }
         } else {
            return $$2.apply(!$$3, !$$4);
         }
      }
   }

   private static boolean a(fje $$0, fje $$1, fje $$2, fjb $$3, fjb $$4, fiw $$5) {
      return !$$0.a(($$5x, $$6, $$7) -> $$1.a(($$6x, $$7x, $$8) -> $$2.a(($$7xx, $$8x, $$9) -> !$$5.apply($$3.e($$5x, $$6x, $$7xx), $$4.e($$6, $$7x, $$8x)))));
   }

   public static double a(jh.a $$0, fin $$1, Iterable<fjm> $$2, double $$3) {
      for (fjm $$4 : $$2) {
         if (Math.abs($$3) < 1.0E-7) {
            return 0.0;
         }

         $$3 = $$4.a($$0, $$1, $$3);
      }

      return $$3;
   }

   public static boolean a(fjm $$0, fjm $$1, jh $$2) {
      if ($$0 == b() && $$1 == b()) {
         return true;
      } else if ($$1.c()) {
         return false;
      } else {
         jh.a $$3 = $$2.o();
         jh.b $$4 = $$2.f();
         fjm $$5 = $$4 == jh.b.a ? $$0 : $$1;
         fjm $$6 = $$4 == jh.b.a ? $$1 : $$0;
         fiw $$7 = $$4 == jh.b.a ? fiw.e : fiw.c;
         return DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)
            && !c(new fjk($$5, $$3, $$5.a.c($$3) - 1), new fjk($$6, $$3, 0), $$7);
      }
   }

   public static boolean b(fjm $$0, fjm $$1, jh $$2) {
      if ($$0 != b() && $$1 != b()) {
         jh.a $$3 = $$2.o();
         jh.b $$4 = $$2.f();
         fjm $$5 = $$4 == jh.b.a ? $$0 : $$1;
         fjm $$6 = $$4 == jh.b.a ? $$1 : $$0;
         if (!DoubleMath.fuzzyEquals($$5.c($$3), 1.0, 1.0E-7)) {
            $$5 = a();
         }

         if (!DoubleMath.fuzzyEquals($$6.b($$3), 0.0, 1.0E-7)) {
            $$6 = a();
         }

         return !c(b(), b(new fjk($$5, $$3, $$5.a.c($$3) - 1), new fjk($$6, $$3, 0), fiw.o), fiw.e);
      } else {
         return true;
      }
   }

   public static boolean b(fjm $$0, fjm $$1) {
      if ($$0 == b() || $$1 == b()) {
         return true;
      } else {
         return $$0.c() && $$1.c() ? false : !c(b(), b($$0, $$1, fiw.o), fiw.e);
      }
   }

   @VisibleForTesting
   protected static fje a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
      int $$5 = $$1.size() - 1;
      int $$6 = $$2.size() - 1;
      if ($$1 instanceof fiy && $$2 instanceof fiy) {
         long $$7 = a($$5, $$6);
         if ($$0 * $$7 <= 256L) {
            return new fja($$5, $$6);
         }
      }

      if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
         return new fjh($$1, $$2, false);
      } else if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
         return new fjh($$2, $$1, true);
      } else {
         return (fje)($$5 == $$6 && Objects.equals($$1, $$2) ? new fjd($$1) : new fjf($$1, $$2, $$3, $$4));
      }
   }

   public static fjm a(fjm $$0, h $$1) {
      return a($$0, $$1, e);
   }

   public static fjm a(fjm $$0, h $$1, fis $$2) {
      if ($$1 == h.a) {
         return $$0;
      } else {
         fjb $$3 = $$0.a.a($$1);
         if ($$0 instanceof fiz && e.equals($$2)) {
            return new fiz($$3);
         } else {
            jh.a $$4 = $$1.b(jh.a.a);
            jh.a $$5 = $$1.b(jh.a.b);
            jh.a $$6 = $$1.b(jh.a.c);
            DoubleList $$7 = $$0.a($$4);
            DoubleList $$8 = $$0.a($$5);
            DoubleList $$9 = $$0.a($$6);
            boolean $$10 = $$1.a($$4);
            boolean $$11 = $$1.a($$5);
            boolean $$12 = $$1.a($$6);
            boolean $$13 = $$4.a($$10, $$11, $$12);
            boolean $$14 = $$5.a($$10, $$11, $$12);
            boolean $$15 = $$6.a($$10, $$11, $$12);
            return new fiu($$3, a($$7, $$13, $$2.a($$4), $$2.d), a($$8, $$14, $$2.a($$5), $$2.e), a($$9, $$15, $$2.a($$6), $$2.f));
         }
      }
   }

   @VisibleForTesting
   static DoubleList a(DoubleList $$0, boolean $$1, double $$2, double $$3) {
      if (!$$1 && $$2 == $$3) {
         return $$0;
      } else {
         int $$4 = $$0.size();
         DoubleList $$5 = new DoubleArrayList($$4);
         int $$6 = $$1 ? -1 : 1;

         for (int $$7 = $$1 ? $$4 - 1 : 0; $$7 >= 0 && $$7 < $$4; $$7 += $$6) {
            $$5.add($$3 + $$6 * ($$0.getDouble($$7) - $$2));
         }

         return $$5;
      }
   }

   public static boolean c(fjm $$0, fjm $$1) {
      return !c($$0, $$1, fiw.g);
   }

   public static Map<jh.a, fjm> a(fjm $$0) {
      return a($$0, e);
   }

   public static Map<jh.a, fjm> a(fjm $$0, fis $$1) {
      return Maps.newEnumMap(Map.of(jh.a.c, $$0, jh.a.a, a($$0, h.a(i.a, i.b), $$1)));
   }

   public static Map<jh.a, fjm> b(fjm $$0) {
      return b($$0, e);
   }

   public static Map<jh.a, fjm> b(fjm $$0, fis $$1) {
      return Maps.newEnumMap(Map.of(jh.a.c, $$0, jh.a.a, a($$0, h.a(i.a, i.b), $$1), jh.a.b, a($$0, h.a(i.b, i.a), $$1)));
   }

   public static Map<jh, fjm> c(fjm $$0) {
      return c($$0, e);
   }

   public static Map<jh, fjm> c(fjm $$0, fis $$1) {
      return Maps.newEnumMap(Map.of(jh.c, $$0, jh.f, a($$0, h.a(i.a, i.b), $$1), jh.d, a($$0, h.a(i.a, i.c), $$1), jh.e, a($$0, h.a(i.a, i.d), $$1)));
   }

   public static Map<jh, fjm> d(fjm $$0) {
      return d($$0, e);
   }

   public static Map<jh, fjm> d(fjm $$0, fis $$1) {
      return Maps.newEnumMap(
         Map.of(
            jh.c,
            $$0,
            jh.f,
            a($$0, h.a(i.a, i.b), $$1),
            jh.d,
            a($$0, h.a(i.a, i.c), $$1),
            jh.e,
            a($$0, h.a(i.a, i.d), $$1),
            jh.b,
            a($$0, h.a(i.d, i.a), $$1),
            jh.a,
            a($$0, h.a(i.b, i.a), $$1)
         )
      );
   }

   public static Map<eem, Map<jh, fjm>> e(fjm $$0) {
      return Map.of(eem.b, c($$0), eem.a, c(a($$0, h.a(i.d, i.a))), eem.c, c(a($$0, h.a(i.b, i.c))));
   }

   public interface a {
      void consume(double var1, double var3, double var5, double var7, double var9, double var11);
   }
}
