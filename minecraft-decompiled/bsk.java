import javax.annotation.Nullable;

public abstract class bsk<S> implements bsr<S> {
   private bsk.b[] a = new bsk.b[256];
   private final bso<S> b;
   private final bst c = new bst();
   private bsk.d[] d = new bsk.d[16];
   private int e;
   private final bsk<S>.c f = new bsk.c();

   protected bsk(bso<S> $$0) {
      this.b = $$0;
   }

   @Override
   public bst a() {
      return this.c;
   }

   @Override
   public bso<S> b() {
      return this.b;
   }

   @Nullable
   @Override
   public <T> T a(bsq<S, T> $$0) {
      int $$1 = this.g();
      bsk.b $$2 = this.b($$1);
      int $$3 = $$2.a($$0.a());
      if ($$3 != -1) {
         bsk.a<T> $$4 = $$2.a($$3);
         if ($$4 != null) {
            if ($$4 == bsk.a.a) {
               return null;
            }

            this.a($$4.c);
            return $$4.b;
         }
      } else {
         $$3 = $$2.b($$0.a());
      }

      T $$5 = $$0.b().a(this);
      bsk.a<T> $$6;
      if ($$5 == null) {
         $$6 = bsk.a.a();
      } else {
         int $$7 = this.g();
         $$6 = new bsk.a<>($$5, $$7);
      }

      $$2.a($$3, $$6);
      return $$5;
   }

   private bsk.b b(int $$0) {
      int $$1 = this.a.length;
      if ($$0 >= $$1) {
         int $$2 = ag.a($$1, $$0 + 1);
         bsk.b[] $$3 = new bsk.b[$$2];
         System.arraycopy(this.a, 0, $$3, 0, $$1);
         this.a = $$3;
      }

      bsk.b $$4 = this.a[$$0];
      if ($$4 == null) {
         $$4 = new bsk.b();
         this.a[$$0] = $$4;
      }

      return $$4;
   }

   @Override
   public bsl c() {
      int $$0 = this.d.length;
      if (this.e >= $$0) {
         int $$1 = ag.a($$0, this.e + 1);
         bsk.d[] $$2 = new bsk.d[$$1];
         System.arraycopy(this.d, 0, $$2, 0, $$0);
         this.d = $$2;
      }

      int $$3 = this.e++;
      bsk.d $$4 = this.d[$$3];
      if ($$4 == null) {
         $$4 = new bsk.d();
         this.d[$$3] = $$4;
      } else {
         $$4.c();
      }

      return $$4;
   }

   @Override
   public void d() {
      this.e--;
   }

   @Override
   public bsr<S> e() {
      return this.f;
   }

   record a<T>(@Nullable T b, int c) {
      public static final bsk.a<?> a = new bsk.a(null, -1);

      public static <T> bsk.a<T> a() {
         return (bsk.a<T>)a;
      }
   }

   static class b {
      public static final int a = 2;
      private static final int b = -1;
      private Object[] c = new Object[16];
      private int d;

      public int a(bsj<?> $$0) {
         for (int $$1 = 0; $$1 < this.d; $$1 += 2) {
            if (this.c[$$1] == $$0) {
               return $$1;
            }
         }

         return -1;
      }

      public int b(bsj<?> $$0) {
         int $$1 = this.d;
         this.d += 2;
         int $$2 = $$1 + 1;
         int $$3 = this.c.length;
         if ($$2 >= $$3) {
            int $$4 = ag.a($$3, $$2 + 1);
            Object[] $$5 = new Object[$$4];
            System.arraycopy(this.c, 0, $$5, 0, $$3);
            this.c = $$5;
         }

         this.c[$$1] = $$0;
         return $$1;
      }

      @Nullable
      public <T> bsk.a<T> a(int $$0) {
         return (bsk.a<T>)this.c[$$0 + 1];
      }

      public void a(int $$0, bsk.a<?> $$1) {
         this.c[$$0 + 1] = $$1;
      }
   }

   class c implements bsr<S> {
      private final bso<S> b = new bso.b<>();

      @Override
      public bso<S> b() {
         return this.b;
      }

      @Override
      public bst a() {
         return bsk.this.a();
      }

      @Nullable
      @Override
      public <T> T a(bsq<S, T> $$0) {
         return bsk.this.a($$0);
      }

      @Override
      public S f() {
         return bsk.this.f();
      }

      @Override
      public int g() {
         return bsk.this.g();
      }

      @Override
      public void a(int $$0) {
         bsk.this.a($$0);
      }

      @Override
      public bsl c() {
         return bsk.this.c();
      }

      @Override
      public void d() {
         bsk.this.d();
      }

      @Override
      public bsr<S> e() {
         return this;
      }
   }

   static class d implements bsl {
      private boolean b;

      @Override
      public void a() {
         this.b = true;
      }

      @Override
      public boolean b() {
         return this.b;
      }

      public void c() {
         this.b = false;
      }
   }
}
