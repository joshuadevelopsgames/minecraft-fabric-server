public class gvm extends gtz {
   gvm(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gvo $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements guw<mi> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gvm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
