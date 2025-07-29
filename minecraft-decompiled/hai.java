public class hai implements hac<ebg> {
   private static final float a = 0.375F;
   private final hfd b;

   public hai(had.a $$0) {
      this.b = $$0.e();
   }

   public void a(ebg $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      jh $$7 = $$0.m().c(dqp.e);
      ju<dcv> $$8 = $$0.c();
      int $$9 = (int)$$0.aA_().a();

      for (int $$10 = 0; $$10 < $$8.size(); $$10++) {
         dcv $$11 = $$8.get($$10);
         if ($$11 != dcv.l) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            jh $$12 = jh.b(($$10 + $$7.e()) % 4);
            float $$13 = -$$12.p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$11, dct.i, $$4, $$5, $$2, $$3, $$0.i(), $$9 + $$10);
            $$2.b();
         }
      }
   }
}
