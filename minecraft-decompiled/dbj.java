import javax.annotation.Nullable;

public class dbj extends dcr implements dbr {
   private final fak a;

   public dbj(fak $$0, dcr.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      fio $$4 = a($$0, $$1, this.a == fam.a ? dmb.b.b : dmb.b.a);
      if ($$4.d() == fiq.a.a) {
         return bxj.e;
      } else if ($$4.d() != fiq.a.b) {
         return bxj.e;
      } else {
         jb $$5 = $$4.b();
         jh $$6 = $$4.c();
         jb $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bxj.d;
         } else if (this.a == fam.a) {
            eeb $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dqh $$9) {
               dcv $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(azj.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ejb.y, $$5);
                  dcv $$11 = dcy.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     aq.k.a((auc)$$1, $$10);
                  }

                  return bxj.a.a($$11);
               }
            }

            return bxj.d;
         } else {
            eeb $$12 = $$0.a_($$5);
            jb $$13 = $$12.b() instanceof dux && this.a == fam.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof auc) {
                  aq.z.a((auc)$$1, $$13, $$3);
               }

               $$1.b(azj.c.b(this));
               dcv $$14 = dcy.a($$3, $$1, b($$3, $$1));
               return bxj.a.a($$14);
            } else {
               return bxj.d;
            }
         }
      }
   }

   public static dcv b(dcv $$0, cut $$1) {
      return !$$1.gc() ? new dcv(dcz.rF) : $$0;
   }

   @Override
   public void a(@Nullable cam $$0, dmu $$1, dcv $$2, jb $$3) {
   }

   @Override
   public boolean a(@Nullable cam $$0, dmu $$1, jb $$2, @Nullable fio $$3) {
      if (!(this.a instanceof faj $$4)) {
         return false;
      } else {
         eeb $$6 = $$1.a_($$2);
         dpz $$7 = $$6.b();
         boolean $$8 = $$6.a(this.a);
         boolean $$10 = $$6.l() || $$8 || $$7 instanceof dux $$9 && $$9.a($$0, $$1, $$2, $$6, this.a);
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.b().a($$3.c()), null);
         } else if ($$1.G_().i() && this.a.a(azu.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, ayz.jH, aza.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(me.aa, $$11 + Math.random(), $$12 + Math.random(), $$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else if ($$7 instanceof dux $$15 && this.a == fam.c) {
            $$15.a($$1, $$2, $$6, $$4.a(false));
            this.a($$0, $$1, $$2);
            return true;
         } else {
            if (!$$1.C && $$8 && !$$6.n()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.y().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cam $$0, dmv $$1, jb $$2) {
      ayy $$3 = this.a.a(azu.b) ? ayz.dg : ayz.dd;
      $$1.a($$0, $$2, $$3, aza.e, 1.0F, 1.0F);
      $$1.a($$0, ejb.z, $$2);
   }
}
