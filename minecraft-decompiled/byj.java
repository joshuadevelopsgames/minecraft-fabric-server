class byj extends byo {
   protected byj(byp $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(aub $$0, cam $$1, int $$2) {
      if ($$1 instanceof auc $$3 && !$$3.am() && $$0.an() != bxg.a && $$0.c($$3.dx())) {
         cwj $$4 = $$0.d($$3.dx());
         if ($$4 == null || $$4.l() < $$4.k()) {
            $$3.a(new byq(bys.I, 600, $$2));
            $$3.c($$3.dx());
            return false;
         }
      }

      return true;
   }
}
