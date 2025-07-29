public class hiq extends hit<hmc, gop> {
   private final goi a;
   private final hly b = new hly();

   public hiq(hgc<hmc, gop> $$0, gqj $$1) {
      super($$0);
      this.a = new goi($$1.a(gqm.ch));
      this.b.c = goi.a.e;
   }

   public void a(fod $$0, gxn $$1, int $$2, hmc $$3, float $$4, float $$5) {
      cmz.b $$6 = $$3.aH;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cmz.b $$7 = $$3.aI;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fod $$0, gxn $$1, int $$2, hmc $$3, cmz.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.Q ? -1.3F : -1.5F, 0.0F);
      this.b.v = $$3.v;
      this.b.ag = $$3.ag;
      this.b.ah = $$3.ah;
      this.b.ad = $$5;
      this.b.ae = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(hfs.a($$4))), $$2, hri.d);
      $$0.b();
   }
}
