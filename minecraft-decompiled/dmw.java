public interface dmw {
   int M_();

   int L_();

   default int ao() {
      return this.L_() + this.M_() - 1;
   }

   default int ap() {
      return this.ar() - this.aq() + 1;
   }

   default int aq() {
      return ke.a(this.L_());
   }

   default int ar() {
      return ke.a(this.ao());
   }

   default boolean d(int $$0) {
      return $$0 >= this.L_() && $$0 <= this.ao();
   }

   default boolean u(jb $$0) {
      return this.e($$0.v());
   }

   default boolean e(int $$0) {
      return $$0 < this.L_() || $$0 > this.ao();
   }

   default int f(int $$0) {
      return this.g(ke.a($$0));
   }

   default int g(int $$0) {
      return $$0 - this.aq();
   }

   default int h(int $$0) {
      return $$0 + this.aq();
   }

   static dmw e(final int $$0, final int $$1) {
      return new dmw() {
         @Override
         public int M_() {
            return $$1;
         }

         @Override
         public int L_() {
            return $$0;
         }
      };
   }
}
