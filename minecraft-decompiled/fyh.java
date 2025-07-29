import java.util.function.Consumer;

public class fyh extends fxl {
   private static final int c = 1;
   private static final int d = -3092272;
   private static final String e = "_";
   private static final int f = -2039584;
   private static final int m = -857677600;
   private static final int n = 300;
   private final fwz o;
   private final xo p;
   private final fyk q;
   private final int r;
   private final boolean s;
   private final int u;
   private long v = ag.c();

   fyh(fwz $$0, int $$1, int $$2, int $$3, int $$4, xo $$5, xo $$6, int $$7, boolean $$8, int $$9, boolean $$10, boolean $$11) {
      super($$1, $$2, $$3, $$4, $$6, $$10, $$11);
      this.o = $$0;
      this.s = $$8;
      this.r = $$7;
      this.u = $$9;
      this.p = $$5;
      this.q = new fyk($$0, $$3 - this.b());
      this.q.a(this::s);
   }

   public void a(int $$0) {
      this.q.a($$0);
   }

   public void b(int $$0) {
      this.q.b($$0);
   }

   public void b(Consumer<String> $$0) {
      this.q.a($$0);
   }

   public void a(String $$0) {
      this.a($$0, false);
   }

   public void a(String $$0, boolean $$1) {
      this.q.a($$0, $$1);
   }

   public String q() {
      return this.q.d();
   }

   @Override
   public void a(gbt $$0) {
      $$0.a(gbs.a, xo.a("gui.narrate.editBox", this.A(), this.q()));
   }

   @Override
   public void a(double $$0, double $$1) {
      this.q.a(get.t());
      this.c($$0, $$1);
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.q.a(true);
      this.c($$0, $$1);
      this.q.a(get.t());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.q.f($$0);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.k && this.aM_() && bdb.a($$0)) {
         this.q.b(Character.toString($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2, float $$3) {
      String $$4 = this.q.d();
      if ($$4.isEmpty() && !this.aM_()) {
         $$0.a(this.o, (xt)this.p, this.e(), this.p(), this.g - this.b(), -857677600);
      } else {
         int $$5 = this.q.e();
         boolean $$6 = this.aM_() && (ag.c() - this.v) / 300L % 2L == 0L;
         boolean $$7 = $$5 < $$4.length();
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = this.p();

         for (fyk.a $$11 : this.q.i()) {
            boolean $$12 = this.a($$10, $$10 + 9);
            int $$13 = this.e();
            if ($$6 && $$7 && $$5 >= $$11.a() && $$5 < $$11.b()) {
               if ($$12) {
                  String $$14 = $$4.substring($$11.a(), $$5);
                  $$0.a(this.o, $$14, $$13, $$10, this.r, this.s);
                  $$8 = $$13 + this.o.b($$14);
                  $$0.a($$8, $$10 - 1, $$8 + 1, $$10 + 1 + 9, this.u);
                  $$0.a(this.o, $$4.substring($$5, $$11.b()), $$8, $$10, this.r, this.s);
               }
            } else {
               if ($$12) {
                  String $$15 = $$4.substring($$11.a(), $$11.b());
                  $$0.a(this.o, $$15, $$13, $$10, this.r, this.s);
                  $$8 = $$13 + this.o.b($$15) - 1;
               }

               $$9 = $$10;
            }

            $$10 += 9;
         }

         if ($$6 && !$$7 && this.a($$9, $$9 + 9)) {
            $$0.a(this.o, "_", $$8, $$9, this.u, this.s);
         }

         if (this.q.j()) {
            fyk.a $$16 = this.q.f();
            int $$17 = this.e();
            $$10 = this.p();

            for (fyk.a $$18 : this.q.i()) {
               if ($$16.a() > $$18.b()) {
                  $$10 += 9;
               } else {
                  if ($$18.a() > $$16.b()) {
                     break;
                  }

                  if (this.a($$10, $$10 + 9)) {
                     int $$19 = this.o.b($$4.substring($$18.a(), Math.max($$16.a(), $$18.a())));
                     int $$20;
                     if ($$16.b() > $$18.b()) {
                        $$20 = this.g - this.a();
                     } else {
                        $$20 = this.o.b($$4.substring($$18.a(), $$16.b()));
                     }

                     $$0.d($$17 + $$19, $$10, $$17 + $$20, $$10 + 9);
                  }

                  $$10 += 9;
               }
            }
         }
      }
   }

   @Override
   protected void a(fxb $$0) {
      super.a($$0);
      if (this.q.b()) {
         int $$1 = this.q.a();
         xo $$2 = xo.a("gui.multiLineEditBox.character_limit", this.q.d().length(), $$1);
         $$0.b(this.o, $$2, this.E() + this.g - this.o.a($$2), this.F() + this.h + 4, -6250336);
      }
   }

   @Override
   public int c() {
      return 9 * this.q.g();
   }

   @Override
   protected double o() {
      return 9.0 / 2.0;
   }

   private void s() {
      double $$0 = this.g();
      fyk.a $$1 = this.q.d((int)($$0 / 9.0));
      if (this.q.e() <= $$1.a()) {
         $$0 = this.q.h() * 9;
      } else {
         fyk.a $$2 = this.q.d((int)(($$0 + this.h) / 9.0) - 1);
         if (this.q.e() > $$2.b()) {
            $$0 = this.q.h() * 9 - this.h + 9 + this.b();
         }
      }

      this.a($$0);
   }

   private void c(double $$0, double $$1) {
      double $$2 = $$0 - this.E() - this.a();
      double $$3 = $$1 - this.F() - this.a() + this.g();
      this.q.a($$2, $$3);
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if ($$0) {
         this.v = ag.c();
      }
   }

   public static fyh.a r() {
      return new fyh.a();
   }

   public static class a {
      private int a;
      private int b;
      private xo c = xn.a;
      private int d = -2039584;
      private boolean e = true;
      private int f = -3092272;
      private boolean g = true;
      private boolean h = true;

      public fyh.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public fyh.a b(int $$0) {
         this.b = $$0;
         return this;
      }

      public fyh.a a(xo $$0) {
         this.c = $$0;
         return this;
      }

      public fyh.a c(int $$0) {
         this.d = $$0;
         return this;
      }

      public fyh.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      public fyh.a d(int $$0) {
         this.f = $$0;
         return this;
      }

      public fyh.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public fyh.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public fyh a(fwz $$0, int $$1, int $$2, xo $$3) {
         return new fyh($$0, this.a, this.b, $$1, $$2, this.c, $$3, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
