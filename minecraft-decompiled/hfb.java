public class hfb extends hed<cqz, hln> {
   private static final float a = 0.0625F;
   private static final float h = 0.15F;
   private static final float i = 0.0625F;
   private final hof j;
   private final bck k = bck.a();

   public hfb(hee.a $$0) {
      super($$0);
      this.j = $$0.b();
      this.f = 0.15F;
      this.g = 0.75F;
   }

   public hln a() {
      return new hln();
   }

   public void a(cqz $$0, hln $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.v = $$0.f() + $$2;
      $$1.d = $$0.b;
      $$1.a($$0, $$0.e(), this.j);
   }

   public void a(hln $$0, fod $$1, gxn $$2, int $$3) {
      if (!$$0.a.e()) {
         $$1.a();
         fin $$4 = $$0.a.g();
         float $$5 = -((float)$$4.b) + 0.0625F;
         float $$6 = bcb.a($$0.v / 10.0F + $$0.d) * 0.1F + 0.1F;
         $$1.a(0.0F, $$6 + $$5, 0.0F);
         float $$7 = cqz.f($$0.v, $$0.d);
         $$1.a(a.d.rotation($$7));
         a($$1, $$2, $$3, $$0, this.k, $$4);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public static void a(fod $$0, gxn $$1, int $$2, hll $$3, bck $$4) {
      a($$0, $$1, $$2, $$3, $$4, $$3.a.g());
   }

   public static void a(fod $$0, gxn $$1, int $$2, hll $$3, bck $$4, fin $$5) {
      int $$6 = $$3.b;
      if ($$6 != 0) {
         $$4.b((long)$$3.c);
         hoh $$7 = $$3.a;
         float $$8 = (float)$$5.d();
         if ($$8 > 0.0625F) {
            $$7.a($$0, $$1, $$2, hri.d);

            for (int $$9 = 1; $$9 < $$6; $$9++) {
               $$0.a();
               float $$10 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               float $$11 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               float $$12 = ($$4.i() * 2.0F - 1.0F) * 0.15F;
               $$0.a($$10, $$11, $$12);
               $$7.a($$0, $$1, $$2, hri.d);
               $$0.b();
            }
         } else {
            float $$13 = $$8 * 1.5F;
            $$0.a(0.0F, 0.0F, -($$13 * ($$6 - 1) / 2.0F));
            $$7.a($$0, $$1, $$2, hri.d);
            $$0.a(0.0F, 0.0F, $$13);

            for (int $$14 = 1; $$14 < $$6; $$14++) {
               $$0.a();
               float $$15 = ($$4.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float $$16 = ($$4.i() * 2.0F - 1.0F) * 0.15F * 0.5F;
               $$0.a($$15, $$16, 0.0F);
               $$7.a($$0, $$1, $$2, hri.d);
               $$0.b();
               $$0.a(0.0F, 0.0F, $$13);
            }
         }
      }
   }
}
