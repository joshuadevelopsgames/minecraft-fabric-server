public class ebl extends eaz {
   private static final int a = 0;
   private int b = 0;

   public ebl(jb $$0, eeb $$1) {
      super(ebb.t, $$0, $$1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("OutputSignal", this.b);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.b = $$0.a("OutputSignal", 0);
   }

   public int a() {
      return this.b;
   }

   public void a(int $$0) {
      this.b = $$0;
   }
}
