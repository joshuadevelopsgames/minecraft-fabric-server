public class czl extends dak {
   private final cut a;
   private int b;

   public czl(cut $$0, bxc $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(dcv $$0) {
      return false;
   }

   @Override
   public dcv a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cut $$0, dcv $$1) {
      this.c_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(dcv $$0, int $$1) {
      this.b += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(dcv $$0) {
      $$0.a(this.a, this.b);
      if (this.a instanceof auc $$1 && this.c instanceof eam $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
