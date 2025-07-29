public class cxt extends cxg {
   private final dlu b = new dlu() {
      @Override
      public void a(dmu $$0, jb $$1, int $$2) {
         $$0.a(cxt.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cxt(bzv<? extends cxt> $$0, dmu $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected dcr p() {
      return dcz.oM;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.oM);
   }

   private Runnable c(dmu $$0) {
      return $$0 instanceof aub ? () -> this.b.a((aub)$$0, this.dx()) : () -> this.b.a($$0, this.dx());
   }

   @Override
   public eeb u() {
      return dqb.cD.m();
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.b.a(this.ai(), this.dx(), $$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.ai(), $$0);
   }

   @Override
   public void g() {
      super.g();
      this.c.run();
   }

   public dlu e() {
      return this.b;
   }
}
