public interface fke extends bxc {
   dcv f();

   default dcv c(int $$0) {
      return this.f().a($$0);
   }

   void b(dcv var1);

   default dcv h() {
      return this.c(this.an_());
   }

   @Override
   default int b() {
      return 1;
   }

   @Override
   default boolean c() {
      return this.f().f();
   }

   @Override
   default void a() {
      this.h();
   }

   @Override
   default dcv b(int $$0) {
      return this.a($$0, this.an_());
   }

   @Override
   default dcv a(int $$0) {
      return $$0 == 0 ? this.f() : dcv.l;
   }

   @Override
   default dcv a(int $$0, int $$1) {
      return $$0 != 0 ? dcv.l : this.c($$1);
   }

   @Override
   default void a(int $$0, dcv $$1) {
      if ($$0 == 0) {
         this.b($$1);
      }
   }

   public interface a extends fke {
      eaz v();

      @Override
      default boolean a(cut $$0) {
         return bxc.a(this.v(), $$0);
      }
   }
}
