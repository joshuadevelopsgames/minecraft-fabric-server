public class fyx extends fxk {
   private float a = 0.5F;

   public fyx(xo $$0, fwz $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fyx(int $$0, int $$1, xo $$2, fwz $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fyx(int $$0, int $$1, int $$2, int $$3, xo $$4, fwz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fyx b(int $$0) {
      super.a($$0);
      return this;
   }

   private fyx b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fyx c() {
      return this.b(0.0F);
   }

   public fyx e() {
      return this.b(0.5F);
   }

   public fyx g() {
      return this.b(1.0F);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      xo $$4 = this.A();
      fwz $$5 = this.a();
      int $$6 = this.z();
      int $$7 = $$5.a($$4);
      int $$8 = this.E() + Math.round(this.a * ($$6 - $$7));
      int $$9 = this.F() + (this.y() - 9) / 2;
      bbm $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private bbm a(xo $$0, int $$1) {
      fwz $$2 = this.a();
      xt $$3 = $$2.a($$0, $$1 - $$2.a(xn.v));
      return ud.a().a(xt.a($$3, xn.v));
   }
}
