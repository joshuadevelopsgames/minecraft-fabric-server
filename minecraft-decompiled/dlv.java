public interface dlv extends dly {
   float a(jh var1, boolean var2);

   faa C_();

   int a(jb var1, dme var2);

   default int a(dnd $$0, jb $$1) {
      return this.C_().a($$0).b($$1);
   }

   default int b(jb $$0, int $$1) {
      return this.C_().a($$0, $$1);
   }

   default boolean h(jb $$0) {
      return this.a(dnd.a, $$0) >= 15;
   }
}
