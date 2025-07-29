public class ccn implements cce<cam> {
   private final int a;
   private final int b;
   private ccd.a c = ccd.a.a;
   private long d;

   public ccn(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ccd.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aub $$0, cam $$1, long $$2) {
      this.c = ccd.a.b;
      int $$3 = this.a + $$0.H_().a(this.b + 1 - this.a);
      this.d = $$2 + $$3;
      return true;
   }

   @Override
   public final void f(aub $$0, cam $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aub $$0, cam $$1, long $$2) {
      this.c = ccd.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
