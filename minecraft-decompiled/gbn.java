public interface gbn {
   gbn a(int var1);

   gbn a(int var1, int var2);

   gbn a(int var1, int var2, int var3, int var4);

   gbn b(int var1);

   gbn c(int var1);

   gbn d(int var1);

   gbn e(int var1);

   gbn f(int var1);

   gbn g(int var1);

   gbn a(float var1, float var2);

   gbn a(float var1);

   gbn b(float var1);

   default gbn a() {
      return this.a(0.0F);
   }

   default gbn b() {
      return this.a(0.5F);
   }

   default gbn c() {
      return this.a(1.0F);
   }

   default gbn d() {
      return this.b(0.0F);
   }

   default gbn e() {
      return this.b(0.5F);
   }

   default gbn f() {
      return this.b(1.0F);
   }

   gbn g();

   gbn.a h();

   static gbn i() {
      return new gbn.a();
   }

   public static class a implements gbn {
      public int a;
      public int b;
      public int c;
      public int d;
      public float e;
      public float f;

      public a() {
      }

      public a(gbn.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
         this.c = $$0.c;
         this.d = $$0.d;
         this.e = $$0.e;
         this.f = $$0.f;
      }

      public gbn.a h(int $$0) {
         return this.b($$0, $$0);
      }

      public gbn.a b(int $$0, int $$1) {
         return this.m($$0).n($$1);
      }

      public gbn.a b(int $$0, int $$1, int $$2, int $$3) {
         return this.i($$0).k($$2).j($$1).l($$3);
      }

      public gbn.a i(int $$0) {
         this.a = $$0;
         return this;
      }

      public gbn.a j(int $$0) {
         this.b = $$0;
         return this;
      }

      public gbn.a k(int $$0) {
         this.c = $$0;
         return this;
      }

      public gbn.a l(int $$0) {
         this.d = $$0;
         return this;
      }

      public gbn.a m(int $$0) {
         return this.i($$0).k($$0);
      }

      public gbn.a n(int $$0) {
         return this.j($$0).l($$0);
      }

      public gbn.a b(float $$0, float $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public gbn.a c(float $$0) {
         this.e = $$0;
         return this;
      }

      public gbn.a d(float $$0) {
         this.f = $$0;
         return this;
      }

      public gbn.a j() {
         return new gbn.a(this);
      }

      @Override
      public gbn.a h() {
         return this;
      }
   }
}
