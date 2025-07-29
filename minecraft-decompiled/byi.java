class byi extends byo {
   protected byi(byp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(aub $$0, cam $$1, int $$2) {
      return $$1.fD() > 0.0F;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(cam $$0, int $$1) {
      super.a($$0, $$1);
      $$0.E(Math.max($$0.fD(), (float)(4 * (1 + $$1))));
   }
}
