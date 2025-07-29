public abstract class cvv extends cvw implements cvl {
   private static final alh<dcv> a = all.a(cvv.class, alj.h);

   public cvv(bzv<? extends cvv> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvv(bzv<? extends cvv> $$0, double $$1, double $$2, double $$3, dmu $$4, dcv $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cvv(bzv<? extends cvv> $$0, cam $$1, dmu $$2, dcv $$3) {
      this($$0, $$1.dC(), $$1.dG() - 0.1F, $$1.dI(), $$2, $$3);
      this.c($$1);
   }

   public void a(dcv $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract dcr f();

   @Override
   public dcv e() {
      return this.au().a(a);
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(a, new dcv(this.f()));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Item", dcv.b, this.e());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<dcv>a("Item", dcv.b).orElseGet(() -> new dcv(this.f())));
   }
}
