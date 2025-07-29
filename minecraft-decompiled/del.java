import java.util.List;

public class del extends dcr implements ddp {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public del(dcr.a $$0) {
      super($$0);
   }

   public static dfm b() {
      return dfm.a().a(cbs.c, new cbq(h, 8.0, cbq.a.a), bzx.b).a(cbs.e, new cbq(i, -2.9F, cbq.a.a), bzx.b).a();
   }

   public static dfy c() {
      return new dfy(List.of(), 1.0F, 2, false);
   }

   @Override
   public dcx b(dcv $$0) {
      return dcx.f;
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      return 72000;
   }

   @Override
   public boolean a(dcv $$0, dmu $$1, cam $$2, int $$3) {
      if ($$2 instanceof cut $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = djk.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bo()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jl<ayy> $$8 = djk.b($$0, djj.C).orElse(ayz.Bj);
               $$4.b(azj.c.b(this));
               if ($$1 instanceof aub $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     dcv $$10 = $$0.b(1, $$4);
                     cwc $$11 = cvo.a(cwc::new, $$9, $$10, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.gc()) {
                        $$11.b = cvb.a.c;
                     }

                     $$1.a(null, $$11, $$8.a(), aza.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$12 = $$4.dP();
                  float $$13 = $$4.dR();
                  float $$14 = -bcb.a($$12 * (float) (Math.PI / 180.0)) * bcb.b($$13 * (float) (Math.PI / 180.0));
                  float $$15 = -bcb.a($$13 * (float) (Math.PI / 180.0));
                  float $$16 = bcb.b($$12 * (float) (Math.PI / 180.0)) * bcb.b($$13 * (float) (Math.PI / 180.0));
                  float $$17 = bcb.c($$14 * $$14 + $$15 * $$15 + $$16 * $$16);
                  $$14 *= $$7 / $$17;
                  $$15 *= $$7 / $$17;
                  $$16 *= $$7 / $$17;
                  $$4.i($$14, $$15, $$16);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aK()) {
                     float $$18 = 1.1999999F;
                     $$4.a(caq.a, new fis(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), aza.h, 1.0F, 1.0F);
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bxj.d;
      } else if (djk.a($$3, $$1) > 0.0F && !$$1.bo()) {
         return bxj.d;
      } else {
         $$1.c($$2);
         return bxj.c;
      }
   }

   @Override
   public cvo a(dmu $$0, jv $$1, dcv $$2, jh $$3) {
      cwc $$4 = new cwc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cvb.a.b;
      return $$4;
   }
}
