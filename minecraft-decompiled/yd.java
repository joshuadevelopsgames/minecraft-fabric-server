public interface yd {
   xo a();

   void a(auc var1, boolean var2, xk.a var3);

   static yd a(ye $$0) {
      return (yd)($$0.h() ? new yd.a($$0.d()) : new yd.b($$0));
   }

   public record a(xo a) implements yd {
      @Override
      public void a(auc $$0, boolean $$1, xk.a $$2) {
         $$0.g.a(this.a, $$2);
      }
   }

   public record b(ye a) implements yd {
      @Override
      public xo a() {
         return this.a.d();
      }

      @Override
      public void a(auc $$0, boolean $$1, xk.a $$2) {
         ye $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.g.a($$3, $$2);
         }
      }

      public ye b() {
         return this.a;
      }
   }
}
