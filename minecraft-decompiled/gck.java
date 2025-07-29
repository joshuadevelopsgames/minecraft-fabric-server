public class gck extends gcq<gdd> {
   public gck(gxn.a $$0) {
      super($$0);
   }

   @Override
   public Class<gdd> a() {
      return gdd.class;
   }

   protected void a(gdd $$0, fod $$1) {
      fue.R().j.p().a(fnb.a.d);
      $$1.a(a.d.rotationDegrees(180.0F));
      $$1.a(a.b.rotationDegrees(25.0F));
      float $$2 = $$0.d();
      $$1.a((1.0F - $$2) * 0.2F, (1.0F - $$2) * 0.1F, (1.0F - $$2) * 0.25F);
      $$1.a(a.d.rotationDegrees(-(1.0F - $$2) * 90.0F - 90.0F));
      $$1.a(a.b.rotationDegrees(180.0F));
      float $$3 = $$0.j();
      float $$4 = bcb.a(bcb.i($$3 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$5 = bcb.a(bcb.i($$3 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      gmm $$6 = $$0.b();
      $$6.a(0.0F, $$4, $$5, $$2);
      ame $$7 = $$0.c();
      fog $$8 = this.a.getBuffer($$6.a($$7));
      $$6.a($$1, $$8, 15728880, hri.d);
   }

   @Override
   protected float a(int $$0, int $$1) {
      return 17 * $$1;
   }

   @Override
   protected String b() {
      return "book model";
   }
}
