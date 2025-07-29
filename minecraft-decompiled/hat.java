public class hat implements hac<ecr> {
   private final hec a;

   public hat(had.a $$0) {
      this.a = $$0.c();
   }

   public void a(ecr $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      dmu $$7 = $$0.i();
      if ($$7 != null) {
         dlu $$8 = $$0.c();
         bzm $$9 = $$8.b($$7, $$0.aA_());
         if ($$9 != null) {
            a($$1, $$2, $$3, $$4, $$9, this.a, $$8.b(), $$8.a());
         }
      }
   }

   public static void a(float $$0, fod $$1, gxn $$2, int $$3, bzm $$4, hec $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.ds(), $$4.dt());
      if ($$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)bcb.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
