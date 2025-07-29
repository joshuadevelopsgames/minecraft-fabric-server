import javax.annotation.Nullable;

public class dbf extends dcr {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public dbf(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      jb $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().c(ejb.C);
            $$1.c(1505, $$2, 15);
         }

         return bxj.a;
      } else {
         eeb $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().c(ejb.C);
               $$1.c(1505, $$3, 15);
            }

            return bxj.a;
         } else {
            return bxj.e;
         }
      }
   }

   public static boolean a(dcv $$0, dmu $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dqc $$4 && $$4.a((dmx)$$1, $$2, $$3)) {
         if ($$1 instanceof aub) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((aub)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean a(dcv $$0, dmu $$1, jb $$2, @Nullable jh $$3) {
      if ($$1.a_($$2).a(dqb.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aub)) {
            return true;
         } else {
            bck $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jb $$6 = $$2;
               eeb $$7 = dqb.bG.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jl<dnx> $$9 = $$1.v($$6);
               if ($$9.a(azn.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mm.e.a(azo.az, $$1.A).map($$0x -> ((dpz)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dpk.d)) {
                        $$7 = $$7.b(dpk.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mm.e.a(azo.ax, $$1.A).map($$0x -> ((dpz)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(azo.az, $$0x -> $$0x.b(dpk.d))) {
                  for (int $$10 = 0; !$$7.a((dmx)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dpk.d, jh.c.a.a($$4));
                  }
               }

               if ($$7.a((dmx)$$1, $$6)) {
                  eeb $$11 = $$1.a_($$6);
                  if ($$11.a(dqb.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dqb.bG) && ((dqc)dqb.bG).a((dmx)$$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dqc)dqb.bG).a((aub)$$1, $$4, $$6, $$11);
                  }
               }
            }

            $$0.h(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void a(dmv $$0, jb $$1, int $$2) {
      eeb $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dqc $$4) {
         jb $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               bcf.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, me.Q);
               break;
            case b:
               bcf.a($$0, $$5, $$2, me.Q);
         }
      } else if ($$3.a(dqb.J)) {
         bcf.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, me.Q);
      }
   }
}
