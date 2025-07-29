class byw extends byo {
   protected byw(byp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(aub $$0, cam $$1, int $$2) {
      if ($$1.eL() < $$1.fa()) {
         $$1.d(1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 50 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
