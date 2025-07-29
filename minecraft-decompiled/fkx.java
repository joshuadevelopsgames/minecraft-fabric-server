import java.util.Optional;

public interface fkx extends fkt {
   int a_ = 332;

   boolean ge();

   Optional<fkx.c> f(auc var1);

   fkt.a gf();

   static boolean a(cam $$0, auc $$1) {
      if ($$1.am()) {
         return false;
      } else if (!$$0.am() && !$$0.B($$1)) {
         double $$2 = Math.min($$0.i(cbs.H), $$1.i(cbs.I));
         return $$0.f((bzm)$$1) >= $$2;
      } else {
         return true;
      }
   }

   static boolean a(dlz $$0, auc $$1) {
      return $$1.V().b($$0.h, $$0.i);
   }

   static boolean b(cam $$0, auc $$1) {
      return $$0.f((bzm)$$1) > 332.0F;
   }

   public interface a extends fkx.c {
      int a();

      @Override
      default boolean b() {
         return this.a() > 1;
      }
   }

   public interface b extends fkx.c {
      int a();

      @Override
      default boolean b() {
         return this.a() > 1;
      }
   }

   public interface c {
      void c();

      void d();

      void e();

      boolean b();
   }

   public static class d implements fkx.c {
      private final cam a;
      private final fkt.a b;
      private final auc c;
      private float d;

      public d(cam $$0, fkt.a $$1, auc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         fis $$3 = $$2.dv().d($$0.dv()).k();
         this.d = (float)bcb.d($$3.c(), $$3.a());
      }

      @Override
      public boolean b() {
         return fkx.a(this.a, this.c) || fkx.a(this.a.dz(), this.c) || !fkx.b(this.a, this.c);
      }

      @Override
      public void c() {
         this.c.g.b(ahc.a(this.a.cK(), this.b, this.d));
      }

      @Override
      public void d() {
         this.c.g.b(ahc.a(this.a.cK()));
      }

      @Override
      public void e() {
         fis $$0 = this.c.dv().d(this.a.dv()).k();
         float $$1 = (float)bcb.d($$0.c(), $$0.a());
         if (bcb.e($$1 - this.d) > 0.008726646F) {
            this.c.g.b(ahc.b(this.a.cK(), this.b, $$1));
            this.d = $$1;
         }
      }
   }

   public static class e implements fkx.a {
      private final cam a;
      private final fkt.a b;
      private final auc c;
      private jb d;

      public e(cam $$0, fkt.a $$1, auc $$2) {
         this.a = $$0;
         this.c = $$2;
         this.b = $$1;
         this.d = $$0.dx();
      }

      @Override
      public void c() {
         this.c.g.b(ahc.a(this.a.cK(), this.b, this.d));
      }

      @Override
      public void d() {
         this.c.g.b(ahc.a(this.a.cK()));
      }

      @Override
      public void e() {
         jb $$0 = this.a.dx();
         if ($$0.k(this.d) > 0) {
            this.c.g.b(ahc.b(this.a.cK(), this.b, $$0));
            this.d = $$0;
         }
      }

      @Override
      public int a() {
         return this.d.k(this.a.dx());
      }

      @Override
      public boolean b() {
         return fkx.a.super.b() || fkx.a(this.a, this.c);
      }
   }

   public static class f implements fkx.b {
      private final cam a;
      private final fkt.a b;
      private final auc c;
      private dlz d;

      public f(cam $$0, fkt.a $$1, auc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$0.dz();
      }

      @Override
      public int a() {
         return this.d.a(this.a.dz());
      }

      @Override
      public void c() {
         this.c.g.b(ahc.a(this.a.cK(), this.b, this.d));
      }

      @Override
      public void d() {
         this.c.g.b(ahc.a(this.a.cK()));
      }

      @Override
      public void e() {
         dlz $$0 = this.a.dz();
         if ($$0.a(this.d) > 0) {
            this.c.g.b(ahc.b(this.a.cK(), this.b, $$0));
            this.d = $$0;
         }
      }

      @Override
      public boolean b() {
         return !fkx.b.super.b() && !fkx.a(this.a, this.c) ? fkx.a(this.d, this.c) : true;
      }
   }
}
