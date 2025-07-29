public abstract class cvi extends cvc implements cvl {
   private static final float d = 12.25F;
   private static final alh<dcv> f = all.a(cvi.class, alj.h);

   public cvi(bzv<? extends cvi> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvi(bzv<? extends cvi> $$0, double $$1, double $$2, double $$3, fis $$4, dmu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cvi(bzv<? extends cvi> $$0, cam $$1, fis $$2, dmu $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(dcv $$0) {
      if ($$0.f()) {
         this.au().a(f, this.n());
      } else {
         this.au().a(f, $$0.c(1));
      }
   }

   @Override
   protected void aP() {
   }

   @Override
   public dcv e() {
      return this.au().a(f);
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(f, this.n());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Item", dcv.b, this.e());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<dcv>a("Item", dcv.b).orElse(this.n()));
   }

   private dcv n() {
      return new dcv(dcz.vy);
   }

   @Override
   public cbd a_(int $$0) {
      return $$0 == 0 ? cbd.a(this::e, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.as < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
