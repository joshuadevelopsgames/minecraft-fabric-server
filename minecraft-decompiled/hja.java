public class hja extends hit<hmp, gpk> {
   private final gys a;

   public hja(hgc<hmp, gpk> $$0, gys $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fod $$0, gxn $$1, int $$2, hmp $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.A || $$3.ar) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            eeb $$7 = dqb.ev.m();
            gzc $$8 = this.a.a($$7);
            int $$9 = hfg.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            fog $$10 = $$3.ar && $$3.A ? $$1.getBuffer(gxz.s(hrr.c)) : $$1.getBuffer(gxe.c($$7));
            gyu.a($$0.c(), $$10, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
