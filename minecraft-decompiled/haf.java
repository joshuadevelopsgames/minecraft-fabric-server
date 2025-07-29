public class haf<T extends eaz & ebc> implements hac<T> {
   public haf(had.a $$0) {
   }

   @Override
   public void a(T $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      if (fue.R().t.gQ() || fue.R().t.am()) {
         ebc.a $$7 = $$0.b();
         if ($$7 != ebc.a.a) {
            ebc.b $$8 = $$0.c();
            jb $$9 = $$8.a();
            kg $$10 = $$8.b();
            if ($$10.u() >= 1 && $$10.v() >= 1 && $$10.w() >= 1) {
               float $$11 = 1.0F;
               float $$12 = 0.9F;
               float $$13 = 0.5F;
               fog $$14 = $$3.getBuffer(gxz.v());
               jb $$15 = $$9.a($$10);
               gyh.a($$2, $$14, $$9.u(), $$9.v(), $$9.w(), $$15.u(), $$15.v(), $$15.w(), 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
               if ($$7 == ebc.a.c && $$0.i() != null) {
                  this.a($$0, $$0.i(), $$9, $$10, $$3, $$2);
               }
            }
         }
      }
   }

   private void a(T $$0, dly $$1, jb $$2, kg $$3, gxn $$4, fod $$5) {
      fog $$6 = $$4.getBuffer(gxz.v());
      jb $$7 = $$0.aA_();
      jb $$8 = $$7.a((kg)$$2);

      for (jb $$9 : jb.c($$8, $$8.a($$3).b(-1, -1, -1))) {
         eeb $$10 = $$1.a_($$9);
         boolean $$11 = $$10.l();
         boolean $$12 = $$10.a(dqb.lt);
         boolean $$13 = $$10.a(dqb.iy);
         boolean $$14 = $$10.a(dqb.iz);
         boolean $$15 = $$12 || $$13 || $$14;
         if ($$11 || $$15) {
            float $$16 = $$11 ? 0.05F : 0.0F;
            double $$17 = $$9.u() - $$7.u() + 0.45F - $$16;
            double $$18 = $$9.v() - $$7.v() + 0.45F - $$16;
            double $$19 = $$9.w() - $$7.w() + 0.45F - $$16;
            double $$20 = $$9.u() - $$7.u() + 0.55F + $$16;
            double $$21 = $$9.v() - $$7.v() + 0.55F + $$16;
            double $$22 = $$9.w() - $$7.w() + 0.55F + $$16;
            if ($$11) {
               gyh.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$12) {
               gyh.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$13) {
               gyh.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$14) {
               gyh.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   private void a(T $$0, jb $$1, kg $$2, fog $$3, fod $$4) {
      dly $$5 = $$0.i();
      if ($$5 != null) {
         jb $$6 = $$0.aA_();
         fjb $$7 = new fiv($$2.u(), $$2.v(), $$2.w());

         for (jb $$8 : jb.c($$1, $$1.a($$2).b(-1, -1, -1))) {
            if ($$5.a_($$8).a(dqb.lt)) {
               $$7.c($$8.u() - $$1.u(), $$8.v() - $$1.v(), $$8.w() - $$1.w());
            }
         }

         $$7.a(($$4x, $$5x, $$6x, $$7x) -> {
            float $$8x = 0.48F;
            float $$9 = $$5x + $$1.u() - $$6.u() + 0.5F - 0.48F;
            float $$10 = $$6x + $$1.v() - $$6.v() + 0.5F - 0.48F;
            float $$11 = $$7x + $$1.w() - $$6.w() + 0.5F - 0.48F;
            float $$12 = $$5x + $$1.u() - $$6.u() + 0.5F + 0.48F;
            float $$13 = $$6x + $$1.v() - $$6.v() + 0.5F + 0.48F;
            float $$14 = $$7x + $$1.w() - $$6.w() + 0.5F + 0.48F;
            gyh.a($$4, $$3, $$4x, $$9, $$10, $$11, $$12, $$13, $$14, 0.75F, 0.75F, 1.0F, 0.2F);
         });
      }
   }

   @Override
   public boolean aY_() {
      return true;
   }

   @Override
   public int aZ_() {
      return 96;
   }
}
