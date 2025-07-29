public abstract class gvt extends gvg {
   protected hrs E;

   protected gvt(grk $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected gvt(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   protected void a(hrs $$0) {
      this.E = $$0;
   }

   @Override
   protected float c() {
      return this.E.c();
   }

   @Override
   protected float d() {
      return this.E.d();
   }

   @Override
   protected float e() {
      return this.E.h();
   }

   @Override
   protected float f() {
      return this.E.i();
   }

   public void a(gvo $$0) {
      this.a($$0.a(this.r));
   }

   public void b(gvo $$0) {
      if (!this.o) {
         this.a($$0.a(this.s, this.t));
      }
   }
}
