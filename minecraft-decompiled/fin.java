import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fin {
   private static final double g = 1.0E-7;
   public final double a;
   public final double b;
   public final double c;
   public final double d;
   public final double e;
   public final double f;

   public fin(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      this.a = Math.min($$0, $$3);
      this.b = Math.min($$1, $$4);
      this.c = Math.min($$2, $$5);
      this.d = Math.max($$0, $$3);
      this.e = Math.max($$1, $$4);
      this.f = Math.max($$2, $$5);
   }

   public fin(jb $$0) {
      this($$0.u(), $$0.v(), $$0.w(), $$0.u() + 1, $$0.v() + 1, $$0.w() + 1);
   }

   public fin(fis $$0, fis $$1) {
      this($$0.d, $$0.e, $$0.f, $$1.d, $$1.e, $$1.f);
   }

   public static fin a(euq $$0) {
      return new fin($$0.h(), $$0.i(), $$0.j(), $$0.k() + 1, $$0.l() + 1, $$0.m() + 1);
   }

   public static fin a(fis $$0) {
      return new fin($$0.d, $$0.e, $$0.f, $$0.d + 1.0, $$0.e + 1.0, $$0.f + 1.0);
   }

   public static fin a(jb $$0, jb $$1) {
      return new fin(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()) + 1,
         Math.max($$0.v(), $$1.v()) + 1,
         Math.max($$0.w(), $$1.w()) + 1
      );
   }

   public fin a(double $$0) {
      return new fin($$0, this.b, this.c, this.d, this.e, this.f);
   }

   public fin b(double $$0) {
      return new fin(this.a, $$0, this.c, this.d, this.e, this.f);
   }

   public fin c(double $$0) {
      return new fin(this.a, this.b, $$0, this.d, this.e, this.f);
   }

   public fin d(double $$0) {
      return new fin(this.a, this.b, this.c, $$0, this.e, this.f);
   }

   public fin e(double $$0) {
      return new fin(this.a, this.b, this.c, this.d, $$0, this.f);
   }

   public fin f(double $$0) {
      return new fin(this.a, this.b, this.c, this.d, this.e, $$0);
   }

   public double a(jh.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public double b(jh.a $$0) {
      return $$0.a(this.d, this.e, this.f);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof fin $$1)) {
         return false;
      } else if (Double.compare($$1.a, this.a) != 0) {
         return false;
      } else if (Double.compare($$1.b, this.b) != 0) {
         return false;
      } else if (Double.compare($$1.c, this.c) != 0) {
         return false;
      } else if (Double.compare($$1.d, this.d) != 0) {
         return false;
      } else {
         return Double.compare($$1.e, this.e) != 0 ? false : Double.compare($$1.f, this.f) == 0;
      }
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.a);
      int $$1 = (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.b);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.c);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.d);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.e);
      $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
      $$0 = Double.doubleToLongBits(this.f);
      return 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
   }

   public fin a(double $$0, double $$1, double $$2) {
      double $$3 = this.a;
      double $$4 = this.b;
      double $$5 = this.c;
      double $$6 = this.d;
      double $$7 = this.e;
      double $$8 = this.f;
      if ($$0 < 0.0) {
         $$3 -= $$0;
      } else if ($$0 > 0.0) {
         $$6 -= $$0;
      }

      if ($$1 < 0.0) {
         $$4 -= $$1;
      } else if ($$1 > 0.0) {
         $$7 -= $$1;
      }

      if ($$2 < 0.0) {
         $$5 -= $$2;
      } else if ($$2 > 0.0) {
         $$8 -= $$2;
      }

      return new fin($$3, $$4, $$5, $$6, $$7, $$8);
   }

   public fin b(fis $$0) {
      return this.b($$0.d, $$0.e, $$0.f);
   }

   public fin b(double $$0, double $$1, double $$2) {
      double $$3 = this.a;
      double $$4 = this.b;
      double $$5 = this.c;
      double $$6 = this.d;
      double $$7 = this.e;
      double $$8 = this.f;
      if ($$0 < 0.0) {
         $$3 += $$0;
      } else if ($$0 > 0.0) {
         $$6 += $$0;
      }

      if ($$1 < 0.0) {
         $$4 += $$1;
      } else if ($$1 > 0.0) {
         $$7 += $$1;
      }

      if ($$2 < 0.0) {
         $$5 += $$2;
      } else if ($$2 > 0.0) {
         $$8 += $$2;
      }

      return new fin($$3, $$4, $$5, $$6, $$7, $$8);
   }

   public fin c(double $$0, double $$1, double $$2) {
      double $$3 = this.a - $$0;
      double $$4 = this.b - $$1;
      double $$5 = this.c - $$2;
      double $$6 = this.d + $$0;
      double $$7 = this.e + $$1;
      double $$8 = this.f + $$2;
      return new fin($$3, $$4, $$5, $$6, $$7, $$8);
   }

   public fin g(double $$0) {
      return this.c($$0, $$0, $$0);
   }

   public fin a(fin $$0) {
      double $$1 = Math.max(this.a, $$0.a);
      double $$2 = Math.max(this.b, $$0.b);
      double $$3 = Math.max(this.c, $$0.c);
      double $$4 = Math.min(this.d, $$0.d);
      double $$5 = Math.min(this.e, $$0.e);
      double $$6 = Math.min(this.f, $$0.f);
      return new fin($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public fin b(fin $$0) {
      double $$1 = Math.min(this.a, $$0.a);
      double $$2 = Math.min(this.b, $$0.b);
      double $$3 = Math.min(this.c, $$0.c);
      double $$4 = Math.max(this.d, $$0.d);
      double $$5 = Math.max(this.e, $$0.e);
      double $$6 = Math.max(this.f, $$0.f);
      return new fin($$1, $$2, $$3, $$4, $$5, $$6);
   }

   public fin d(double $$0, double $$1, double $$2) {
      return new fin(this.a + $$0, this.b + $$1, this.c + $$2, this.d + $$0, this.e + $$1, this.f + $$2);
   }

   public fin a(jb $$0) {
      return new fin(this.a + $$0.u(), this.b + $$0.v(), this.c + $$0.w(), this.d + $$0.u(), this.e + $$0.v(), this.f + $$0.w());
   }

   public fin c(fis $$0) {
      return this.d($$0.d, $$0.e, $$0.f);
   }

   public fin a(Vector3f $$0) {
      return this.d($$0.x, $$0.y, $$0.z);
   }

   public boolean c(fin $$0) {
      return this.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return this.a < $$3 && this.d > $$0 && this.b < $$4 && this.e > $$1 && this.c < $$5 && this.f > $$2;
   }

   public boolean a(fis $$0, fis $$1) {
      return this.a(
         Math.min($$0.d, $$1.d), Math.min($$0.e, $$1.e), Math.min($$0.f, $$1.f), Math.max($$0.d, $$1.d), Math.max($$0.e, $$1.e), Math.max($$0.f, $$1.f)
      );
   }

   public boolean b(jb $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$0.u() + 1, $$0.v() + 1, $$0.w() + 1);
   }

   public boolean d(fis $$0) {
      return this.e($$0.d, $$0.e, $$0.f);
   }

   public boolean e(double $$0, double $$1, double $$2) {
      return $$0 >= this.a && $$0 < this.d && $$1 >= this.b && $$1 < this.e && $$2 >= this.c && $$2 < this.f;
   }

   public double a() {
      double $$0 = this.b();
      double $$1 = this.c();
      double $$2 = this.d();
      return ($$0 + $$1 + $$2) / 3.0;
   }

   public double b() {
      return this.d - this.a;
   }

   public double c() {
      return this.e - this.b;
   }

   public double d() {
      return this.f - this.c;
   }

   public fin f(double $$0, double $$1, double $$2) {
      return this.c(-$$0, -$$1, -$$2);
   }

   public fin h(double $$0) {
      return this.g(-$$0);
   }

   public Optional<fis> b(fis $$0, fis $$1) {
      return a(this.a, this.b, this.c, this.d, this.e, this.f, $$0, $$1);
   }

   public static Optional<fis> a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, fis $$6, fis $$7) {
      double[] $$8 = new double[]{1.0};
      double $$9 = $$7.d - $$6.d;
      double $$10 = $$7.e - $$6.e;
      double $$11 = $$7.f - $$6.f;
      jh $$12 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, null, $$9, $$10, $$11);
      if ($$12 == null) {
         return Optional.empty();
      } else {
         double $$13 = $$8[0];
         return Optional.of($$6.b($$13 * $$9, $$13 * $$10, $$13 * $$11));
      }
   }

   @Nullable
   public static fio a(Iterable<fin> $$0, fis $$1, fis $$2, jb $$3) {
      double[] $$4 = new double[]{1.0};
      jh $$5 = null;
      double $$6 = $$2.d - $$1.d;
      double $$7 = $$2.e - $$1.e;
      double $$8 = $$2.f - $$1.f;

      for (fin $$9 : $$0) {
         $$5 = a($$9.a($$3), $$1, $$4, $$5, $$6, $$7, $$8);
      }

      if ($$5 == null) {
         return null;
      } else {
         double $$10 = $$4[0];
         return new fio($$1.b($$10 * $$6, $$10 * $$7, $$10 * $$8), $$5, $$3, false);
      }
   }

   @Nullable
   private static jh a(fin $$0, fis $$1, double[] $$2, @Nullable jh $$3, double $$4, double $$5, double $$6) {
      return a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private static jh a(
      double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, fis $$6, double[] $$7, @Nullable jh $$8, double $$9, double $$10, double $$11
   ) {
      if ($$9 > 1.0E-7) {
         $$8 = a($$7, $$8, $$9, $$10, $$11, $$0, $$1, $$4, $$2, $$5, jh.e, $$6.d, $$6.e, $$6.f);
      } else if ($$9 < -1.0E-7) {
         $$8 = a($$7, $$8, $$9, $$10, $$11, $$3, $$1, $$4, $$2, $$5, jh.f, $$6.d, $$6.e, $$6.f);
      }

      if ($$10 > 1.0E-7) {
         $$8 = a($$7, $$8, $$10, $$11, $$9, $$1, $$2, $$5, $$0, $$3, jh.a, $$6.e, $$6.f, $$6.d);
      } else if ($$10 < -1.0E-7) {
         $$8 = a($$7, $$8, $$10, $$11, $$9, $$4, $$2, $$5, $$0, $$3, jh.b, $$6.e, $$6.f, $$6.d);
      }

      if ($$11 > 1.0E-7) {
         $$8 = a($$7, $$8, $$11, $$9, $$10, $$2, $$0, $$3, $$1, $$4, jh.c, $$6.f, $$6.d, $$6.e);
      } else if ($$11 < -1.0E-7) {
         $$8 = a($$7, $$8, $$11, $$9, $$10, $$5, $$0, $$3, $$1, $$4, jh.d, $$6.f, $$6.d, $$6.e);
      }

      return $$8;
   }

   @Nullable
   private static jh a(
      double[] $$0,
      @Nullable jh $$1,
      double $$2,
      double $$3,
      double $$4,
      double $$5,
      double $$6,
      double $$7,
      double $$8,
      double $$9,
      jh $$10,
      double $$11,
      double $$12,
      double $$13
   ) {
      double $$14 = ($$5 - $$11) / $$2;
      double $$15 = $$12 + $$14 * $$3;
      double $$16 = $$13 + $$14 * $$4;
      if (0.0 < $$14 && $$14 < $$0[0] && $$6 - 1.0E-7 < $$15 && $$15 < $$7 + 1.0E-7 && $$8 - 1.0E-7 < $$16 && $$16 < $$9 + 1.0E-7) {
         $$0[0] = $$14;
         return $$10;
      } else {
         return $$1;
      }
   }

   public boolean a(fis $$0, List<fin> $$1) {
      fis $$2 = this.f();
      fis $$3 = $$2.e($$0);

      for (fin $$4 : $$1) {
         fin $$5 = $$4.c(this.b() * 0.5, this.c() * 0.5, this.d() * 0.5);
         if ($$5.d($$3) || $$5.d($$2)) {
            return true;
         }

         if ($$5.b($$2, $$3).isPresent()) {
            return true;
         }
      }

      return false;
   }

   public double e(fis $$0) {
      double $$1 = Math.max(Math.max(this.a - $$0.d, $$0.d - this.d), 0.0);
      double $$2 = Math.max(Math.max(this.b - $$0.e, $$0.e - this.e), 0.0);
      double $$3 = Math.max(Math.max(this.c - $$0.f, $$0.f - this.f), 0.0);
      return bcb.f($$1, $$2, $$3);
   }

   public double d(fin $$0) {
      double $$1 = Math.max(Math.max(this.a - $$0.d, $$0.a - this.d), 0.0);
      double $$2 = Math.max(Math.max(this.b - $$0.e, $$0.b - this.e), 0.0);
      double $$3 = Math.max(Math.max(this.c - $$0.f, $$0.c - this.f), 0.0);
      return bcb.f($$1, $$2, $$3);
   }

   @Override
   public String toString() {
      return "AABB[" + this.a + ", " + this.b + ", " + this.c + "] -> [" + this.d + ", " + this.e + ", " + this.f + "]";
   }

   public boolean e() {
      return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
   }

   public fis f() {
      return new fis(bcb.d(0.5, this.a, this.d), bcb.d(0.5, this.b, this.e), bcb.d(0.5, this.c, this.f));
   }

   public fis g() {
      return new fis(bcb.d(0.5, this.a, this.d), this.b, bcb.d(0.5, this.c, this.f));
   }

   public fis h() {
      return new fis(this.a, this.b, this.c);
   }

   public fis i() {
      return new fis(this.d, this.e, this.f);
   }

   public static fin a(fis $$0, double $$1, double $$2, double $$3) {
      return new fin($$0.d - $$1 / 2.0, $$0.e - $$2 / 2.0, $$0.f - $$3 / 2.0, $$0.d + $$1 / 2.0, $$0.e + $$2 / 2.0, $$0.f + $$3 / 2.0);
   }

   public static class a {
      private float a = Float.POSITIVE_INFINITY;
      private float b = Float.POSITIVE_INFINITY;
      private float c = Float.POSITIVE_INFINITY;
      private float d = Float.NEGATIVE_INFINITY;
      private float e = Float.NEGATIVE_INFINITY;
      private float f = Float.NEGATIVE_INFINITY;

      public void a(Vector3fc $$0) {
         this.a = Math.min(this.a, $$0.x());
         this.b = Math.min(this.b, $$0.y());
         this.c = Math.min(this.c, $$0.z());
         this.d = Math.max(this.d, $$0.x());
         this.e = Math.max(this.e, $$0.y());
         this.f = Math.max(this.f, $$0.z());
      }

      public fin a() {
         return new fin(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
