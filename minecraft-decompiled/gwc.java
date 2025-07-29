public class gwc extends gtk {
   private static final int a = 12235202;

   protected gwc(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gvo $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = baj.b(12235202) / 255.0F;
      this.w = baj.c(12235202) / 255.0F;
      this.x = baj.d(12235202) / 255.0F;
   }

   public static class a implements guw<mi> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         bck $$8 = $$1.A;
         double $$9 = $$8.i() * -1.9 * $$8.i() * 0.1;
         double $$10 = $$8.i() * -0.5 * $$8.i() * 0.1 * 5.0;
         double $$11 = $$8.i() * -1.9 * $$8.i() * 0.1;
         return new gwc($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
