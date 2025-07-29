public class czh extends cym {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final bxc r;

   public czh(int $$0, cus $$1) {
      this($$0, $$1, new bxr(9));
   }

   public czh(int $$0, cus $$1, bxc $$2) {
      super(czv.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.e_($$1.j);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(bxc $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new dak($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cut $$0) {
      return this.r.a($$0);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
