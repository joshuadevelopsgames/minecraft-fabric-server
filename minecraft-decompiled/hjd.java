public abstract class hjd<M extends gop> extends hit<hmc, M> {
   private final gof a;
   private final ame b;
   private final hjd.a c;

   public hjd(hfg<?, hmc, M> $$0, gof $$1, ame $$2, hjd.a $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   protected abstract int a(hmc var1);

   private void a(fod $$0, gxn $$1, int $$2, float $$3, float $$4, float $$5) {
      float $$6 = bcb.c($$3 * $$3 + $$5 * $$5);
      float $$7 = (float)(Math.atan2($$3, $$5) * 180.0F / (float)Math.PI);
      float $$8 = (float)(Math.atan2($$4, $$6) * 180.0F / (float)Math.PI);
      $$0.a(a.d.rotationDegrees($$7 - 90.0F));
      $$0.a(a.f.rotationDegrees($$8));
      this.a.a($$0, $$1.getBuffer(this.a.a(this.b)), $$2, hri.d);
   }

   public void a(fod $$0, gxn $$1, int $$2, hmc $$3, float $$4, float $$5) {
      int $$6 = this.a($$3);
      if ($$6 > 0) {
         bck $$7 = bck.a((long)$$3.aJ);

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            $$0.a();
            gqn $$9 = this.d().a($$7);
            gqn.a $$10 = $$9.a($$7);
            $$9.a($$0);
            float $$11 = $$7.i();
            float $$12 = $$7.i();
            float $$13 = $$7.i();
            if (this.c == hjd.a.b) {
               int $$14 = $$7.a(3);
               switch ($$14) {
                  case 0:
                     $$11 = a($$11);
                     break;
                  case 1:
                     $$12 = a($$12);
                     break;
                  default:
                     $$13 = a($$13);
               }
            }

            $$0.a(bcb.h($$11, $$10.b, $$10.e) / 16.0F, bcb.h($$12, $$10.c, $$10.f) / 16.0F, bcb.h($$13, $$10.d, $$10.g) / 16.0F);
            this.a($$0, $$1, $$2, -($$11 * 2.0F - 1.0F), -($$12 * 2.0F - 1.0F), -($$13 * 2.0F - 1.0F));
            $$0.b();
         }
      }
   }

   private static float a(float $$0) {
      return $$0 > 0.5F ? 1.0F : 0.5F;
   }

   public static enum a {
      a,
      b;
   }
}
