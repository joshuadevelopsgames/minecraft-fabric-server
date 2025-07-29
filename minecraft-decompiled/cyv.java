public class cyv extends cym {
   private final bxc m;
   private final int n;

   private cyv(czv<?> $$0, int $$1, cus $$2, int $$3) {
      this($$0, $$1, $$2, new bxr(9 * $$3), $$3);
   }

   public static cyv a(int $$0, cus $$1) {
      return new cyv(czv.a, $$0, $$1, 1);
   }

   public static cyv b(int $$0, cus $$1) {
      return new cyv(czv.b, $$0, $$1, 2);
   }

   public static cyv c(int $$0, cus $$1) {
      return new cyv(czv.c, $$0, $$1, 3);
   }

   public static cyv d(int $$0, cus $$1) {
      return new cyv(czv.d, $$0, $$1, 4);
   }

   public static cyv e(int $$0, cus $$1) {
      return new cyv(czv.e, $$0, $$1, 5);
   }

   public static cyv f(int $$0, cus $$1) {
      return new cyv(czv.f, $$0, $$1, 6);
   }

   public static cyv a(int $$0, cus $$1, bxc $$2) {
      return new cyv(czv.c, $$0, $$1, $$2, 3);
   }

   public static cyv b(int $$0, cus $$1, bxc $$2) {
      return new cyv(czv.f, $$0, $$1, $$2, 6);
   }

   public cyv(czv<?> $$0, int $$1, cus $$2, bxc $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.e_($$2.j);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(bxc $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new dak($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cut $$0) {
      return this.m.a($$0);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
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
      this.m.c($$0);
   }

   public bxc l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
