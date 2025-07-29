import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class czf extends cyn {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final cyz y;
   private final cut z;
   private boolean A;

   public czf(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public czf(int $$0, cus $$1, cyz $$2) {
      super(czv.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.j;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cym $$0, aub $$1, cut $$2, cze $$3, daf $$4, @Nullable dhr<dhb> $$5) {
      dha $$6 = $$3.aB_();
      auc $$7 = (auc)$$2;
      dcv $$8 = dcv.l;
      Optional<dhr<dhb>> $$9 = $$1.q().aI().a(dhx.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dhr<dhb> $$10 = $$9.get();
         dhb $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            dcv $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.L())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.g.b(new adm($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(bxc $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof aub $$2) {
               a(this, $$2, this.z, this.m, this.n, null);
            }
         });
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(aub $$0, dhr<dhb> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.y, $$0, dqb.cL);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            $$4.h().c($$4, $$0);
            if (!this.a($$4, 10, 46, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return dcv.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return dcv.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(dcv $$0, dak $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public dak m() {
      return this.k.get(0);
   }

   @Override
   public List<dak> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public dac am_() {
      return dac.a;
   }

   @Override
   protected cut q() {
      return this.z;
   }
}
