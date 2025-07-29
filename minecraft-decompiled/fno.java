public interface fno {
   fno a = new fno() {
      @Override
      public <T> T a(fnq<T> $$0) {
         T $$1 = $$0.f();
         $$0.b($$1);
         return $$1;
      }

      @Override
      public <T> void a(fnq<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fnq<T> var1);

   <T> void a(fnq<T> var1, T var2);
}
