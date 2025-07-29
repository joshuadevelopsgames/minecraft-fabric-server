import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class ecc extends eci implements ecb {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private static final int g = -1;
   private ju<dcv> h = ju.a(5, dcv.l);
   private int i = -1;
   private long j;
   private jh k;

   public ecc(jb $$0, eeb $$1) {
      super(ebb.s, $$0, $$1);
      this.k = $$1.c(dua.b);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.h = ju.a(this.b(), dcv.l);
      if (!this.c_($$0)) {
         bxd.a($$0, this.h);
      }

      this.i = $$0.a("TransferCooldown", -1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.d_($$0)) {
         bxd.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public dcv a(int $$0, int $$1) {
      this.f_(null);
      return bxd.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.f_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(eeb $$0) {
      super.c($$0);
      this.k = $$0.c(dua.b);
   }

   @Override
   protected xo j() {
      return xo.c("container.hopper");
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecc $$3) {
      $$3.i--;
      $$3.j = $$0.ae();
      if (!$$3.u()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ecb)$$3));
      }
   }

   private static boolean a(dmu $$0, jb $$1, eeb $$2, ecc $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.u() && $$2.c(dua.c)) {
            boolean $$5 = false;
            if (!$$3.c()) {
               $$5 = a($$0, $$1, $$3);
            }

            if (!$$3.k()) {
               $$5 |= $$4.getAsBoolean();
            }

            if ($$5) {
               $$3.d(8);
               a($$0, $$1, $$2);
               return true;
            }
         }

         return false;
      }
   }

   private boolean k() {
      for (dcv $$0 : this.h) {
         if ($$0.f() || $$0.M() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dmu $$0, jb $$1, ecc $$2) {
      bxc $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jh $$4 = $$2.k.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               dcv $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.M();
                  dcv $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
                  if ($$8.f()) {
                     $$3.e();
                     return true;
                  }

                  $$6.e($$7);
                  if ($$7 == 1) {
                     $$2.a($$5, $$6);
                  }
               }
            }

            return false;
         }
      }
   }

   private static int[] a(bxc $$0, jh $$1) {
      if ($$0 instanceof bxu $$2) {
         return $$2.a($$1);
      } else {
         int $$3 = $$0.b();
         if ($$3 < f.length) {
            int[] $$4 = f[$$3];
            if ($$4 != null) {
               return $$4;
            } else {
               int[] $$5 = c($$3);
               f[$$3] = $$5;
               return $$5;
            }
         } else {
            return c($$3);
         }
      }
   }

   private static int[] c(int $$0) {
      int[] $$1 = new int[$$0];
      int $$2 = 0;

      while ($$2 < $$1.length) {
         $$1[$$2] = $$2++;
      }

      return $$1;
   }

   private static boolean b(bxc $$0, jh $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         dcv $$4 = $$0.a($$3);
         if ($$4.M() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dmu $$0, ecb $$1) {
      jb $$2 = jb.a($$1.A(), $$1.B() + 1.0, $$1.C());
      eeb $$3 = $$0.a_($$2);
      bxc $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jh $$5 = jh.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.D() && $$3.m($$0, $$2) && !$$3.a(azo.cH);
         if (!$$7) {
            for (cqz $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(ecb $$0, bxc $$1, int $$2, jh $$3) {
      dcv $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         dcv $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.f()) {
            $$1.e();
            return true;
         }

         $$4.e($$5);
         if ($$5 == 1) {
            $$1.a($$2, $$4);
         }
      }

      return false;
   }

   public static boolean a(bxc $$0, cqz $$1) {
      boolean $$2 = false;
      dcv $$3 = $$1.e().v();
      dcv $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(dcv.l);
         $$1.at();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static dcv a(@Nullable bxc $$0, bxc $$1, dcv $$2, @Nullable jh $$3) {
      if ($$1 instanceof bxu $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.f(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }
      } else {
         int $$7 = $$1.b();

         for (int $$8 = 0; $$8 < $$7 && !$$2.f(); $$8++) {
            $$2 = b($$0, $$1, $$2, $$8, $$3);
         }
      }

      return $$2;
   }

   private static boolean a(bxc $$0, dcv $$1, int $$2, @Nullable jh $$3) {
      return !$$0.b($$2, $$1) ? false : !($$0 instanceof bxu $$4 && !$$4.a($$2, $$1, $$3));
   }

   private static boolean a(bxc $$0, bxc $$1, dcv $$2, int $$3, jh $$4) {
      return !$$1.a($$0, $$3, $$2) ? false : !($$1 instanceof bxu $$5 && !$$5.b($$3, $$2, $$4));
   }

   private static dcv b(@Nullable bxc $$0, bxc $$1, dcv $$2, int $$3, @Nullable jh $$4) {
      dcv $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = dcv.l;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ecc $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ecc $$12 && $$10.j >= $$12.j) {
                  $$11 = 1;
               }

               $$10.d(8 - $$11);
            }

            $$1.e();
         }
      }

      return $$2;
   }

   @Nullable
   private static bxc b(dmu $$0, jb $$1, ecc $$2) {
      return a($$0, $$1.a($$2.k));
   }

   @Nullable
   private static bxc a(dmu $$0, ecb $$1, jb $$2, eeb $$3) {
      return a($$0, $$2, $$3, $$1.A(), $$1.B() + 1.0, $$1.C());
   }

   public static List<cqz> b(dmu $$0, ecb $$1) {
      fin $$2 = $$1.al_().d($$1.A() - 0.5, $$1.B() - 0.5, $$1.C() - 0.5);
      return $$0.a(cqz.class, $$2, bzt.a);
   }

   @Nullable
   public static bxc a(dmu $$0, jb $$1) {
      return a($$0, $$1, $$0.a_($$1), $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5);
   }

   @Nullable
   private static bxc a(dmu $$0, jb $$1, eeb $$2, double $$3, double $$4, double $$5) {
      bxc $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bxc b(dmu $$0, jb $$1, eeb $$2) {
      dpz $$3 = $$2.b();
      if ($$3 instanceof bxv) {
         return ((bxv)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof bxc $$5) {
         if ($$5 instanceof ebh && $$3 instanceof drd) {
            $$5 = drd.a((drd)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bxc a(dmu $$0, double $$1, double $$2, double $$3) {
      List<bzm> $$4 = $$0.a((bzm)null, new fin($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bzt.d);
      return !$$4.isEmpty() ? (bxc)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(dcv $$0, dcv $$1) {
      return $$0.M() <= $$0.k() && dcv.c($$0, $$1);
   }

   @Override
   public double A() {
      return this.o.u() + 0.5;
   }

   @Override
   public double B() {
      return this.o.v() + 0.5;
   }

   @Override
   public double C() {
      return this.o.w() + 0.5;
   }

   @Override
   public boolean D() {
      return true;
   }

   private void d(int $$0) {
      this.i = $$0;
   }

   private boolean u() {
      return this.i > 0;
   }

   private boolean v() {
      return this.i > 8;
   }

   @Override
   protected ju<dcv> f() {
      return this.h;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.h = $$0;
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, bzm $$3, ecc $$4) {
      if ($$3 instanceof cqz $$5 && !$$5.e().f() && $$3.cV().d(-$$1.u(), -$$1.v(), -$$1.w()).c($$4.al_())) {
         a($$0, $$1, $$2, $$4, () -> a((bxc)$$4, $$5));
      }
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return new czn($$0, $$1, this);
   }
}
