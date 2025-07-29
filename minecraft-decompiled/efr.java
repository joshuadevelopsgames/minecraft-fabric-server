public interface efr {
   void a(eft var1, double var2);

   void a(eft var1, double var2, double var4, long var6);

   void a(eft var1, double var2, double var4);

   void a(eft var1, int var2);

   void b(eft var1, int var2);

   void b(eft var1, double var2);

   void c(eft var1, double var2);

   public static class a implements efr {
      private final eft a;

      public a(eft $$0) {
         this.a = $$0;
      }

      @Override
      public void a(eft $$0, double $$1) {
         this.a.a($$1);
      }

      @Override
      public void a(eft $$0, double $$1, double $$2, long $$3) {
         this.a.a($$1, $$2, $$3);
      }

      @Override
      public void a(eft $$0, double $$1, double $$2) {
         this.a.d($$1, $$2);
      }

      @Override
      public void a(eft $$0, int $$1) {
         this.a.b($$1);
      }

      @Override
      public void b(eft $$0, int $$1) {
         this.a.c($$1);
      }

      @Override
      public void b(eft $$0, double $$1) {
         this.a.c($$1);
      }

      @Override
      public void c(eft $$0, double $$1) {
         this.a.b($$1);
      }
   }
}
