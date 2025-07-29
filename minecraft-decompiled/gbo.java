import java.util.function.Consumer;

public class gbo implements gbl {
   private final gbj a;
   private final gbo.a b;
   private int c = 0;

   private gbo(gbo.a $$0) {
      this(0, 0, $$0);
   }

   public gbo(int $$0, int $$1, gbo.a $$2) {
      this.a = new gbj($$0, $$1);
      this.b = $$2;
   }

   public gbo a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public gbn b() {
      return this.a.b();
   }

   public gbn c() {
      return this.a.c();
   }

   public <T extends gbm> T a(T $$0, gbn $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends gbm> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends gbm> T a(T $$0, Consumer<gbn> $$1) {
      return this.b.a(this.a, $$0, this.c++, ag.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<gbm> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int z() {
      return this.a.z();
   }

   @Override
   public int y() {
      return this.a.y();
   }

   @Override
   public void j(int $$0) {
      this.a.j($$0);
   }

   @Override
   public void k(int $$0) {
      this.a.k($$0);
   }

   @Override
   public int E() {
      return this.a.E();
   }

   @Override
   public int F() {
      return this.a.F();
   }

   public static gbo d() {
      return new gbo(gbo.a.b);
   }

   public static gbo e() {
      return new gbo(gbo.a.a);
   }

   public static enum a {
      a,
      b;

      void a(gbj $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends gbm> T a(gbj $$0, T $$1, int $$2, gbn $$3) {
         return (T)(switch (this) {
            case a -> (gbm)$$0.a($$1, 0, $$2, $$3);
            case b -> (gbm)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
