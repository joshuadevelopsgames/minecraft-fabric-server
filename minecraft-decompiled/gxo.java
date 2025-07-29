import javax.annotation.Nullable;

public class gxo {
   private final gxo.b a;
   final jb b;

   public gxo(ke $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 * 2 + 1;
      int $$5 = bcb.c($$4);
      int $$6 = $$1 * 16;
      jb $$7 = $$0.j();
      this.b = $$0.k();
      int $$8 = $$7.u() - $$6;
      int $$9 = $$8 + $$5 * 16 - 1;
      int $$10 = $$5 >= $$2 ? $$3 : $$7.v() - $$6;
      int $$11 = $$10 + $$5 * 16 - 1;
      int $$12 = $$7.w() - $$6;
      int $$13 = $$12 + $$5 * 16 - 1;
      this.a = new gxo.b(new euq($$8, $$10, $$12, $$9, $$11, $$13));
   }

   public boolean a(hbl.a $$0) {
      return this.a.a($$0);
   }

   public void a(gxo.e $$0, hbq $$1, int $$2) {
      this.a.a($$0, false, $$1, 0, $$2, true);
   }

   boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, int $$6) {
      int $$7 = this.b.u();
      int $$8 = this.b.v();
      int $$9 = this.b.w();
      return $$7 > $$0 - $$6 && $$7 < $$3 + $$6 && $$8 > $$1 - $$6 && $$8 < $$4 + $$6 && $$9 > $$2 - $$6 && $$9 < $$5 + $$6;
   }

   static enum a {
      a(4, 2, 1),
      b(4, 1, 2),
      c(2, 4, 1),
      d(1, 4, 2),
      e(2, 1, 4),
      f(1, 2, 4);

      final int g;
      final int h;
      final int i;

      private a(final int $$0, final int $$1, final int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public static gxo.a a(int $$0, int $$1, int $$2) {
         if ($$0 > $$1 && $$0 > $$2) {
            return $$1 > $$2 ? a : b;
         } else if ($$1 > $$0 && $$1 > $$2) {
            return $$0 > $$2 ? c : d;
         } else {
            return $$0 > $$1 ? e : f;
         }
      }
   }

   class b implements gxo.d {
      private final gxo.d[] b = new gxo.d[8];
      private final euq c;
      private final int d;
      private final int e;
      private final int f;
      private final gxo.a g;
      private final boolean h;
      private final boolean i;
      private final boolean j;

      public b(final euq $$0) {
         this.c = $$0;
         this.d = this.c.h() + this.c.d() / 2;
         this.e = this.c.i() + this.c.e() / 2;
         this.f = this.c.j() + this.c.f() / 2;
         int $$1 = gxo.this.b.u() - this.d;
         int $$2 = gxo.this.b.v() - this.e;
         int $$3 = gxo.this.b.w() - this.f;
         this.g = gxo.a.a(Math.abs($$1), Math.abs($$2), Math.abs($$3));
         this.h = $$1 < 0;
         this.i = $$2 < 0;
         this.j = $$3 < 0;
      }

      public boolean a(hbl.a $$0) {
         long $$1 = $$0.f();
         boolean $$2 = ke.c(ke.b($$1)) - this.d < 0;
         boolean $$3 = ke.c(ke.c($$1)) - this.e < 0;
         boolean $$4 = ke.c(ke.d($$1)) - this.f < 0;
         boolean $$5 = $$2 != this.h;
         boolean $$6 = $$3 != this.i;
         boolean $$7 = $$4 != this.j;
         int $$8 = a(this.g, $$5, $$6, $$7);
         if (this.c()) {
            boolean $$9 = this.b[$$8] != null;
            this.b[$$8] = gxo.this.new c($$0);
            return !$$9;
         } else if (this.b[$$8] != null) {
            gxo.b $$10 = (gxo.b)this.b[$$8];
            return $$10.a($$0);
         } else {
            euq $$11 = this.a($$2, $$3, $$4);
            gxo.b $$12 = gxo.this.new b($$11);
            this.b[$$8] = $$12;
            return $$12.a($$0);
         }
      }

      private static int a(gxo.a $$0, boolean $$1, boolean $$2, boolean $$3) {
         int $$4 = 0;
         if ($$1) {
            $$4 += $$0.g;
         }

         if ($$2) {
            $$4 += $$0.h;
         }

         if ($$3) {
            $$4 += $$0.i;
         }

         return $$4;
      }

      private boolean c() {
         return this.c.d() == 32;
      }

      private euq a(boolean $$0, boolean $$1, boolean $$2) {
         int $$3;
         int $$4;
         if ($$0) {
            $$3 = this.c.h();
            $$4 = this.d - 1;
         } else {
            $$3 = this.d;
            $$4 = this.c.k();
         }

         int $$7;
         int $$8;
         if ($$1) {
            $$7 = this.c.i();
            $$8 = this.e - 1;
         } else {
            $$7 = this.e;
            $$8 = this.c.l();
         }

         int $$11;
         int $$12;
         if ($$2) {
            $$11 = this.c.j();
            $$12 = this.f - 1;
         } else {
            $$11 = this.f;
            $$12 = this.c.m();
         }

         return new euq($$3, $$7, $$11, $$4, $$8, $$12);
      }

      @Override
      public void a(gxo.e $$0, boolean $$1, hbq $$2, int $$3, int $$4, boolean $$5) {
         boolean $$6 = $$1;
         if (!$$1) {
            int $$7 = $$2.a(this.c);
            $$1 = $$7 == -2;
            $$6 = $$7 == -2 || $$7 == -1;
         }

         if ($$6) {
            $$5 = $$5 && gxo.this.a(this.c.h(), this.c.i(), this.c.j(), this.c.k(), this.c.l(), this.c.m(), $$4);
            $$0.visit(this, $$1, $$3, $$5);

            for (gxo.d $$8 : this.b) {
               if ($$8 != null) {
                  $$8.a($$0, $$1, $$2, $$3 + 1, $$4, $$5);
               }
            }
         }
      }

      @Nullable
      @Override
      public hbl.a a() {
         return null;
      }

      @Override
      public fin b() {
         return new fin(this.c.h(), this.c.i(), this.c.j(), this.c.k() + 1, this.c.l() + 1, this.c.m() + 1);
      }
   }

   final class c implements gxo.d {
      private final hbl.a b;

      c(final hbl.a $$0) {
         this.b = $$0;
      }

      @Override
      public void a(gxo.e $$0, boolean $$1, hbq $$2, int $$3, int $$4, boolean $$5) {
         fin $$6 = this.b.b();
         if ($$1 || $$2.a(this.a().b())) {
            $$5 = $$5 && gxo.this.a($$6.a, $$6.b, $$6.c, $$6.d, $$6.e, $$6.f, $$4);
            $$0.visit(this, $$1, $$3, $$5);
         }
      }

      @Override
      public hbl.a a() {
         return this.b;
      }

      @Override
      public fin b() {
         return this.b.b();
      }
   }

   public interface d {
      void a(gxo.e var1, boolean var2, hbq var3, int var4, int var5, boolean var6);

      @Nullable
      hbl.a a();

      fin b();
   }

   @FunctionalInterface
   public interface e {
      void visit(gxo.d var1, boolean var2, int var3, boolean var4);
   }
}
