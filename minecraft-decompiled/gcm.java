import org.joml.Matrix4f;

public class gcm extends gcq<gdf> {
   public gcm(gxn.a $$0) {
      super($$0);
   }

   @Override
   public Class<gdf> a() {
      return gdf.class;
   }

   protected void a(gdf $$0, fod $$1) {
      double $$2 = 0.0;
      $$1.a(0.0F, -5.0F, 0.0F);
      Matrix4f $$3 = $$1.c().a();

      for (btv $$4 : $$0.b()) {
         int $$5 = bcb.a($$4.a / 4.0) + 1;
         fog $$6 = this.a.getBuffer(gxz.A());
         int $$7 = baj.f($$4.a());
         int $$8 = baj.a($$7, -8355712);
         $$6.a($$3, 0.0F, 0.0F, 0.0F).a($$7);

         for (int $$9 = $$5; $$9 >= 0; $$9--) {
            float $$10 = (float)(($$2 + $$4.a * $$9 / $$5) * (float) (Math.PI * 2) / 100.0);
            float $$11 = bcb.a($$10) * 105.0F;
            float $$12 = bcb.b($$10) * 105.0F * 0.5F;
            $$6.a($$3, $$11, $$12, 0.0F).a($$7);
         }

         $$6 = this.a.getBuffer(gxz.z());

         for (int $$13 = $$5; $$13 > 0; $$13--) {
            float $$14 = (float)(($$2 + $$4.a * $$13 / $$5) * (float) (Math.PI * 2) / 100.0);
            float $$15 = bcb.a($$14) * 105.0F;
            float $$16 = bcb.b($$14) * 105.0F * 0.5F;
            float $$17 = (float)(($$2 + $$4.a * ($$13 - 1) / $$5) * (float) (Math.PI * 2) / 100.0);
            float $$18 = bcb.a($$17) * 105.0F;
            float $$19 = bcb.b($$17) * 105.0F * 0.5F;
            if (!(($$16 + $$19) / 2.0F < 0.0F)) {
               $$6.a($$3, $$15, $$16, 0.0F).a($$8);
               $$6.a($$3, $$15, $$16 + 10.0F, 0.0F).a($$8);
               $$6.a($$3, $$18, $$19 + 10.0F, 0.0F).a($$8);
               $$6.a($$3, $$18, $$19, 0.0F).a($$8);
            }
         }

         $$2 += $$4.a;
      }
   }

   @Override
   protected float a(int $$0, int $$1) {
      return $$0 / 2.0F;
   }

   @Override
   protected String b() {
      return "profiler chart";
   }
}
