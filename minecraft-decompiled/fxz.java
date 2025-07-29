public class fxz extends fyj {
   public static final int a = 4;
   private final boolean b;
   private final boolean c;
   private final int d;

   public fxz(int $$0, xo $$1, fwz $$2) {
      this($$0, $$1, $$2, 4);
   }

   public fxz(int $$0, xo $$1, fwz $$2, int $$3) {
      this($$0, $$1, $$2, true, true, $$3);
   }

   public fxz(int $$0, xo $$1, fwz $$2, boolean $$3, boolean $$4, int $$5) {
      super($$1, $$2);
      this.d($$0);
      this.b(true);
      this.j = true;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   public void b(int $$0) {
      this.d($$0 - this.d * 4);
   }

   @Override
   protected void a(gbt $$0) {
      $$0.a(gbs.a, this.A());
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.E() - this.d;
      int $$5 = this.F() - this.d;
      int $$6 = this.z() + this.d * 2;
      int $$7 = this.y() + this.d * 2;
      int $$8 = baj.a(this.l, this.b ? (this.aM_() ? -1 : -6250336) : -1);
      if (this.c) {
         $$0.a($$4 + 1, $$5, $$4 + $$6, $$5 + $$7, baj.a(this.l, -16777216));
      }

      if (this.aM_() || this.b) {
         $$0.b($$4, $$5, $$6, $$7, $$8);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(hwx $$0) {
   }
}
