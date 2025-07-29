import javax.annotation.Nullable;

class cyq extends dak {
   private final cam a;
   private final bzw b;
   @Nullable
   private final ame g;

   public cyq(bxc $$0, cam $$1, bzw $$2, int $$3, int $$4, int $$5, @Nullable ame $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(dcv $$0, dcv $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(dcv $$0) {
      return this.a.a($$0, this.b);
   }

   @Override
   public boolean b() {
      return this.a.e(this.b);
   }

   @Override
   public boolean a(cut $$0) {
      dcv $$1 = this.g();
      return !$$1.f() && !$$0.gI() && djk.a($$1, djj.E) ? false : super.a($$0);
   }

   @Nullable
   @Override
   public ame c() {
      return this.g;
   }
}
