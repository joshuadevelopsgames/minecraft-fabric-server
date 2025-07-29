import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Function;

public class eoc extends enh<epu> {
   public eoc(Codec<epu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epu> $$0) {
      bck $$1 = $$0.d();
      jb $$2 = $$0.e();
      dnt $$3 = $$0.b();
      epu $$4 = $$0.f();
      float $$5 = $$1.i() * (float) Math.PI;
      float $$6 = $$4.c / 8.0F;
      int $$7 = bcb.f(($$4.c / 16.0F * 2.0F + 1.0F) / 2.0F);
      double $$8 = $$2.u() + Math.sin($$5) * $$6;
      double $$9 = $$2.u() - Math.sin($$5) * $$6;
      double $$10 = $$2.w() + Math.cos($$5) * $$6;
      double $$11 = $$2.w() - Math.cos($$5) * $$6;
      int $$12 = 2;
      double $$13 = $$2.v() + $$1.a(3) - 2;
      double $$14 = $$2.v() + $$1.a(3) - 2;
      int $$15 = $$2.u() - bcb.f($$6) - $$7;
      int $$16 = $$2.v() - 2 - $$7;
      int $$17 = $$2.w() - bcb.f($$6) - $$7;
      int $$18 = 2 * (bcb.f($$6) + $$7);
      int $$19 = 2 * (2 + $$7);

      for (int $$20 = $$15; $$20 <= $$15 + $$18; $$20++) {
         for (int $$21 = $$17; $$21 <= $$17 + $$18; $$21++) {
            if ($$16 <= $$3.a(eka.a.c, $$20, $$21)) {
               return this.a($$3, $$1, $$4, $$8, $$9, $$10, $$11, $$13, $$14, $$15, $$16, $$17, $$18, $$19);
            }
         }
      }

      return false;
   }

   protected boolean a(
      dnt $$0, bck $$1, epu $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, int $$9, int $$10, int $$11, int $$12, int $$13
   ) {
      int $$14 = 0;
      BitSet $$15 = new BitSet($$12 * $$13 * $$12);
      jb.a $$16 = new jb.a();
      int $$17 = $$2.c;
      double[] $$18 = new double[$$17 * 4];

      for (int $$19 = 0; $$19 < $$17; $$19++) {
         float $$20 = (float)$$19 / $$17;
         double $$21 = bcb.d((double)$$20, $$3, $$4);
         double $$22 = bcb.d((double)$$20, $$7, $$8);
         double $$23 = bcb.d((double)$$20, $$5, $$6);
         double $$24 = $$1.j() * $$17 / 16.0;
         double $$25 = ((bcb.a((float) Math.PI * $$20) + 1.0F) * $$24 + 1.0) / 2.0;
         $$18[$$19 * 4 + 0] = $$21;
         $$18[$$19 * 4 + 1] = $$22;
         $$18[$$19 * 4 + 2] = $$23;
         $$18[$$19 * 4 + 3] = $$25;
      }

      for (int $$26 = 0; $$26 < $$17 - 1; $$26++) {
         if (!($$18[$$26 * 4 + 3] <= 0.0)) {
            for (int $$27 = $$26 + 1; $$27 < $$17; $$27++) {
               if (!($$18[$$27 * 4 + 3] <= 0.0)) {
                  double $$28 = $$18[$$26 * 4 + 0] - $$18[$$27 * 4 + 0];
                  double $$29 = $$18[$$26 * 4 + 1] - $$18[$$27 * 4 + 1];
                  double $$30 = $$18[$$26 * 4 + 2] - $$18[$$27 * 4 + 2];
                  double $$31 = $$18[$$26 * 4 + 3] - $$18[$$27 * 4 + 3];
                  if ($$31 * $$31 > $$28 * $$28 + $$29 * $$29 + $$30 * $$30) {
                     if ($$31 > 0.0) {
                        $$18[$$27 * 4 + 3] = -1.0;
                     } else {
                        $$18[$$26 * 4 + 3] = -1.0;
                     }
                  }
               }
            }
         }
      }

      try (efw $$32 = new efw($$0)) {
         for (int $$33 = 0; $$33 < $$17; $$33++) {
            double $$34 = $$18[$$33 * 4 + 3];
            if (!($$34 < 0.0)) {
               double $$35 = $$18[$$33 * 4 + 0];
               double $$36 = $$18[$$33 * 4 + 1];
               double $$37 = $$18[$$33 * 4 + 2];
               int $$38 = Math.max(bcb.a($$35 - $$34), $$9);
               int $$39 = Math.max(bcb.a($$36 - $$34), $$10);
               int $$40 = Math.max(bcb.a($$37 - $$34), $$11);
               int $$41 = Math.max(bcb.a($$35 + $$34), $$38);
               int $$42 = Math.max(bcb.a($$36 + $$34), $$39);
               int $$43 = Math.max(bcb.a($$37 + $$34), $$40);

               for (int $$44 = $$38; $$44 <= $$41; $$44++) {
                  double $$45 = ($$44 + 0.5 - $$35) / $$34;
                  if ($$45 * $$45 < 1.0) {
                     for (int $$46 = $$39; $$46 <= $$42; $$46++) {
                        double $$47 = ($$46 + 0.5 - $$36) / $$34;
                        if ($$45 * $$45 + $$47 * $$47 < 1.0) {
                           for (int $$48 = $$40; $$48 <= $$43; $$48++) {
                              double $$49 = ($$48 + 0.5 - $$37) / $$34;
                              if ($$45 * $$45 + $$47 * $$47 + $$49 * $$49 < 1.0 && !$$0.e($$46)) {
                                 int $$50 = $$44 - $$9 + ($$46 - $$10) * $$12 + ($$48 - $$11) * $$12 * $$13;
                                 if (!$$15.get($$50)) {
                                    $$15.set($$50);
                                    $$16.d($$44, $$46, $$48);
                                    if ($$0.f_($$16)) {
                                       egj $$51 = $$32.a($$16);
                                       if ($$51 != null) {
                                          int $$52 = ke.b($$44);
                                          int $$53 = ke.b($$46);
                                          int $$54 = ke.b($$48);
                                          eeb $$55 = $$51.a($$52, $$53, $$54);

                                          for (epu.a $$56 : $$2.b) {
                                             if (a($$55, $$32::b, $$1, $$2, $$56, $$16)) {
                                                $$51.a($$52, $$53, $$54, $$56.c, false);
                                                $$14++;
                                                break;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return $$14 > 0;
   }

   public static boolean a(eeb $$0, Function<jb, eeb> $$1, bck $$2, epu $$3, epu.a $$4, jb.a $$5) {
      if (!$$4.b.a($$0, $$2)) {
         return false;
      } else {
         return a($$2, $$3.d) ? true : !a($$1, $$5);
      }
   }

   protected static boolean a(bck $$0, float $$1) {
      if ($$1 <= 0.0F) {
         return true;
      } else {
         return $$1 >= 1.0F ? false : $$0.i() >= $$1;
      }
   }
}
