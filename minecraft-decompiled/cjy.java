public class cjy extends cjw {
   private boolean p;

   public cjy(cao $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected fbb a(int $$0) {
      this.p = this.a.ap() == bzv.I;
      this.o = new fbf(this.p);
      this.o.a(false);
      return new fbb(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bp();
   }

   @Override
   protected fis b() {
      return new fis(this.a.dC(), this.a.e(0.5), this.a.dI());
   }

   @Override
   protected double a(fis $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fis $$0, fis $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jb $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean c() {
      return false;
   }
}
