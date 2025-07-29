public class fxy extends fxl {
   private final fwz c;
   private final fyj d;

   public fxy(int $$0, int $$1, int $$2, int $$3, xo $$4, fwz $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = new fyj($$4, $$5).d(this.z() - this.b());
   }

   public fxy a(int $$0) {
      this.d.c($$0);
      return this;
   }

   @Override
   public void h(int $$0) {
      super.h($$0);
      this.d.d(this.z() - this.b());
   }

   @Override
   protected int c() {
      return this.d.y();
   }

   @Override
   protected double o() {
      return 9.0;
   }

   @Override
   protected void b(fxb $$0) {
      super.b($$0);
   }

   public boolean q() {
      return super.j();
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2, float $$3) {
      $$0.e().pushMatrix();
      $$0.e().translate(this.e(), this.p());
      this.d.a($$0, $$1, $$2, $$3);
      $$0.e().popMatrix();
   }

   @Override
   protected void a(gbt $$0) {
      $$0.a(gbs.a, this.A());
   }

   @Override
   public void b(xo $$0) {
      super.b($$0);
      this.d.b($$0);
   }
}
