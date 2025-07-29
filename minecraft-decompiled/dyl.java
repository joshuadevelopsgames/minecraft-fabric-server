public enum dyl {
   a {
      @Override
      public boolean a(eeb $$0, dly $$1, jb $$2, jh $$3) {
         return dpz.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final fjm d = dpz.b(2.0, 0.0, 10.0);

      @Override
      public boolean a(eeb $$0, dly $$1, jb $$2, jh $$3) {
         return !fjj.c($$0.h($$1, $$2).a($$3), this.d, fiw.c);
      }
   },
   c {
      private final fjm d = fjj.a(fjj.b(), dpz.b(12.0, 0.0, 16.0), fiw.e);

      @Override
      public boolean a(eeb $$0, dly $$1, jb $$2, jh $$3) {
         return !fjj.c($$0.h($$1, $$2).a($$3), this.d, fiw.c);
      }
   };

   public abstract boolean a(eeb var1, dly var2, jb var3, jh var4);
}
