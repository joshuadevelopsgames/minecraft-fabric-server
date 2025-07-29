public class czn extends cym {
   public static final int m = 5;
   private final bxc n;

   public czn(int $$0, cus $$1) {
      this($$0, $$1, new bxr(5));
   }

   public czn(int $$0, cus $$1, bxc $$2) {
      super(czv.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.e_($$1.j);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new dak($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
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
