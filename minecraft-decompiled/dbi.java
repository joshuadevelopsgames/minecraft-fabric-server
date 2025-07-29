public class dbi extends dcr {
   public static final int a = 10;
   private static final int b = 200;

   public dbi(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      cut $$1 = $$0.o();
      if ($$1 != null && this.a($$1).d() == fiq.a.b) {
         $$1.c($$0.p());
      }

      return bxj.c;
   }

   @Override
   public dcx b(dcv $$0) {
      return dcx.j;
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      return 200;
   }

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, int $$3) {
      if ($$3 >= 0 && $$1 instanceof cut $$4) {
         fiq $$6 = this.a($$4);
         if ($$6 instanceof fio $$7 && $$6.d() == fiq.a.b) {
            int $$9 = this.a($$2, $$1) - $$3 + 1;
            boolean $$10 = $$9 % 10 == 5;
            if ($$10) {
               jb $$11 = $$7.b();
               eeb $$12 = $$0.a_($$11);
               cad $$13 = $$1.fH() == bxi.a ? $$4.fF() : $$4.fF().e();
               if ($$12.D() && $$12.o() != dwn.a) {
                  this.a($$0, $$7, $$12, $$1.h(0.0F), $$13);
               }

               ayy $$15;
               if ($$12.b() instanceof dqf $$14) {
                  $$15 = $$14.c();
               } else {
                  $$15 = ayz.cS;
               }

               $$0.a($$4, $$11, $$15, aza.e);
               if ($$0 instanceof aub $$17 && $$0.c_($$11) instanceof ebe $$18) {
                  boolean $$19 = $$18.a($$0.ae(), $$17, $$4, $$7.c(), $$2);
                  if ($$19) {
                     bzw $$20 = $$2.equals($$4.a(bzw.b)) ? bzw.b : bzw.a;
                     $$2.a(1, $$4, $$20);
                  }
               }
            }
         } else {
            $$1.fL();
         }
      } else {
         $$1.fL();
      }
   }

   private fiq a(cut $$0) {
      return cvq.a($$0, bzt.h, $$0.gV());
   }

   private void a(dmu $$0, fio $$1, eeb $$2, fis $$3, cad $$4) {
      double $$5 = 3.0;
      int $$6 = $$4 == cad.b ? 1 : -1;
      int $$7 = $$0.H_().b(7, 12);
      lw $$8 = new lw(me.b, $$2);
      jh $$9 = $$1.c();
      dbi.a $$10 = dbi.a.a($$3, $$9);
      fis $$11 = $$1.g();

      for (int $$12 = 0; $$12 < $$7; $$12++) {
         $$0.a(
            $$8,
            $$11.d - ($$9 == jh.e ? 1.0E-6F : 0.0F),
            $$11.e,
            $$11.f - ($$9 == jh.c ? 1.0E-6F : 0.0F),
            $$10.a() * $$6 * 3.0 * $$0.H_().j(),
            0.0,
            $$10.c() * $$6 * 3.0 * $$0.H_().j()
         );
      }
   }

   record a(double a, double b, double c) {
      private static final double d = 1.0;
      private static final double e = 0.1;

      public static dbi.a a(fis $$0, jh $$1) {
         double $$2 = 0.0;

         return switch ($$1) {
            case a, b -> new dbi.a($$0.c(), 0.0, -$$0.a());
            case c -> new dbi.a(1.0, 0.0, -0.1);
            case d -> new dbi.a(-1.0, 0.0, 0.1);
            case e -> new dbi.a(-0.1, 0.0, -1.0);
            case f -> new dbi.a(0.1, 0.0, 1.0);
         };
      }
   }
}
