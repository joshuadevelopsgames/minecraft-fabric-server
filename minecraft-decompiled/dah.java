public class dah extends cym {
   private static final int m = 27;
   private final bxc n;

   public dah(int $$0, cus $$1) {
      this($$0, $$1, new bxr(27));
   }

   public dah(int $$0, cus $$1, bxc $$2) {
      super(czv.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.e_($$1.j);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new dai($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cut $$0) {
      return this.n.a($$0);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
