class byv extends byo {
   protected byv(byp $$0, int $$1, mc $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 1;
   }

   @Override
   public boolean a(aub $$0, cam $$1, int $$2) {
      if ($$1 instanceof auc $$3 && !$$1.am()) {
         jb $$4 = $$3.ad();
         if ($$4 != null) {
            $$0.C().a($$3, $$4);
            $$3.ac();
            return false;
         }
      }

      return true;
   }
}
