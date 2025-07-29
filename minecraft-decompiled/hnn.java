import org.joml.Vector3f;

public abstract class hnn extends hns {
   @Override
   public int a(grk $$0, ftm $$1, int $$2, float $$3) {
      float $$4 = bcb.a(bcb.b($$0.f($$3) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
      dnz $$5 = $$0.I_();
      fis $$6 = $$1.d().a(2.0, 2.0, 2.0).c(0.25);
      fis $$7 = $$0.d().a(bba.a($$6, ($$1x, $$2x, $$3x) -> fis.a($$5.a($$1x, $$2x, $$3x).a().e())), $$4);
      float $$8 = (float)$$7.a();
      float $$9 = (float)$$7.b();
      float $$10 = (float)$$7.c();
      if ($$2 >= 4) {
         float $$11 = bcb.a($$0.a($$3)) > 0.0F ? -1.0F : 1.0F;
         Vector3f $$12 = new Vector3f($$11, 0.0F, 0.0F);
         float $$13 = $$1.n().dot($$12);
         if ($$13 > 0.0F && $$0.d().a($$0.f($$3))) {
            int $$14 = $$0.d().b($$0.f($$3));
            $$13 *= baj.i($$14);
            $$8 = bcb.h($$13, $$8, baj.j($$14));
            $$9 = bcb.h($$13, $$9, baj.k($$14));
            $$10 = bcb.h($$13, $$10, baj.l($$14));
         }
      }

      int $$15 = $$0.a($$1.d(), $$3);
      float $$16 = baj.j($$15);
      float $$17 = baj.k($$15);
      float $$18 = baj.l($$15);
      float $$19 = 0.25F + 0.75F * $$2 / 32.0F;
      $$19 = 1.0F - (float)Math.pow($$19, 0.25);
      $$8 += ($$16 - $$8) * $$19;
      $$9 += ($$17 - $$9) * $$19;
      $$10 += ($$18 - $$10) * $$19;
      float $$20 = $$0.d($$3);
      if ($$20 > 0.0F) {
         float $$21 = 1.0F - $$20 * 0.5F;
         float $$22 = 1.0F - $$20 * 0.4F;
         $$8 *= $$21;
         $$9 *= $$21;
         $$10 *= $$22;
      }

      float $$23 = $$0.b($$3);
      if ($$23 > 0.0F) {
         float $$24 = 1.0F - $$23 * 0.5F;
         $$8 *= $$24;
         $$9 *= $$24;
         $$10 *= $$24;
      }

      return baj.a(1.0F, $$8, $$9, $$10);
   }
}
