public abstract class deh extends ddo implements ddp {
   public static float a = 0.5F;

   public deh(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      if ($$0 instanceof aub $$4) {
         cvo.a(this::a, $$4, $$3, $$1, -20.0F, a, 1.0F);
      }

      $$1.b(azj.c.b(this));
      $$3.a(1, $$1);
      return bxj.a;
   }

   protected abstract cvd a(aub var1, cam var2, dcv var3);

   protected abstract cvd a(dmu var1, jv var2, dcv var3);

   @Override
   public cvo a(dmu $$0, jv $$1, dcv $$2, jh $$3) {
      return this.a($$0, $$1, $$2);
   }

   @Override
   public ddp.a a() {
      return ddp.a.a().a(ddp.a.a.c() * 0.5F).b(ddp.a.a.d() * 1.25F).a();
   }
}
