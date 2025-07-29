public interface ghx {
   static ghx a(bbm $$0) {
      return new ghw($$0);
   }

   static ghx a(dau $$0) {
      return (ghx)(switch ($$0) {
         case dat $$1 -> new ghv($$1.a());
         case ghu.a $$2 -> new ghu($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fwz var1);

   int b(fwz var1);

   default boolean a() {
      return false;
   }

   default void a(fxb $$0, fwz $$1, int $$2, int $$3) {
   }

   default void a(fwz $$0, int $$1, int $$2, int $$3, int $$4, fxb $$5) {
   }
}
