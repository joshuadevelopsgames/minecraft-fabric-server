public class bza extends byo {
   public static final int c = 40;

   protected bza(byp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(aub $$0, cam $$1, int $$2) {
      $$1.a($$0, $$1.ea().r(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
