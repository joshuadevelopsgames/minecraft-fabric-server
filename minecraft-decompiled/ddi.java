import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import javax.annotation.Nullable;

public class ddi extends dcr {
   public static final int a = 128;
   public static final int b = 128;

   public ddi(dcr.a $$0) {
      super($$0);
   }

   public static dcv a(aub $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      dcv $$6 = new dcv(dcz.tt);
      fce $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.aj());
      $$6.b(kq.M, $$7);
      return $$6;
   }

   @Nullable
   public static fcg a(@Nullable fce $$0, dmu $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static fcg b(dcv $$0, dmu $$1) {
      fce $$2 = $$0.a(kq.M);
      return a($$2, $$1);
   }

   private static fce a(aub $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, amd<dmu> $$6) {
      fcg $$7 = fcg.a($$1, $$2, (byte)$$3, $$4, $$5, $$6);
      fce $$8 = $$0.y();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dmu $$0, bzm $$1, fcg $$2) {
      if ($$0.aj() == $$2.f && $$1 instanceof cut) {
         int $$3 = 1 << $$2.g;
         int $$4 = $$2.d;
         int $$5 = $$2.e;
         int $$6 = bcb.a($$1.dC() - $$4) / $$3 + 64;
         int $$7 = bcb.a($$1.dI() - $$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.G_().h()) {
            $$8 /= 2;
         }

         fcg.a $$9 = $$2.a((cut)$$1);
         $$9.b++;
         jb.a $$10 = new jb.a();
         jb.a $$11 = new jb.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = bcb.i($$13 - $$6) + bcb.i($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<fap> $$20 = LinkedHashMultiset.create();
                     egi $$21 = $$0.d(ke.a($$18), ke.a($$19));
                     if (!$$21.F()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.G_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dqb.j.m().a((dly)$$0, jb.c), 10);
                           } else {
                              $$20.add(dqb.b.m().a((dly)$$0, jb.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(eka.a.b, $$10.u(), $$10.w()) + 1;
                                 eeb $$31;
                                 if ($$27 <= $$0.L_()) {
                                    $$31 = dqb.I.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == fap.a && $$27 > $$0.L_());

                                    if ($$27 > $$0.L_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       eeb $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.L_() && !$$30.y().c());

                                       $$31 = this.a($$0, $$31, $$10);
                                    }
                                 }

                                 $$2.a($$0, $$10.u(), $$10.w());
                                 $$23 += (double)$$27 / ($$3 * $$3);
                                 $$20.add($$31.a($$0, $$10));
                              }
                           }
                        }

                        $$22 /= $$3 * $$3;
                        fap $$32 = (fap)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), fap.a);
                        fap.a $$34;
                        if ($$32 == fap.m) {
                           double $$33 = $$22 * 0.1 + ($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = fap.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = fap.a.a;
                           } else {
                              $$34 = fap.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / ($$3 + 4) + (($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = fap.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = fap.a.a;
                           } else {
                              $$34 = fap.a.b;
                           }
                        }

                        $$14 = $$23;
                        if ($$15 >= 0 && $$16 < $$8 * $$8 && (!$$17 || ($$13 + $$15 & 1) != 0)) {
                           $$12 |= $$2.a($$13, $$15, $$32.b($$34));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private eeb a(dmu $$0, eeb $$1, jb $$2) {
      fal $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jh.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aub $$0, dcv $$1) {
      fcg $$2 = b($$1, (dmu)$$0);
      if ($$2 != null) {
         if ($$0.aj() == $$2.f) {
            int $$3 = 1 << $$2.g;
            int $$4 = $$2.d;
            int $$5 = $$2.e;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            jb.a $$9 = new jb.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jl<dnx> $$12 = $$0.v($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(azn.ab);
               }
            }

            for (int $$13 = 1; $$13 < 127; $$13++) {
               for (int $$14 = 1; $$14 < 127; $$14++) {
                  int $$15 = 0;

                  for (int $$16 = -1; $$16 < 2; $$16++) {
                     for (int $$17 = -1; $$17 < 2; $$17++) {
                        if (($$16 != 0 || $$17 != 0) && a($$6, $$13 + $$16, $$14 + $$17)) {
                           $$15++;
                        }
                     }
                  }

                  fap.a $$18 = fap.a.d;
                  fap $$19 = fap.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = fap.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(bcb.a($$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = fap.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = fap.a.b;
                              break;
                           case 2:
                              $$18 = fap.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = fap.a;
                     } else if ($$15 > 5) {
                        $$18 = fap.a.b;
                     } else if ($$15 > 3) {
                        $$18 = fap.a.a;
                     } else if ($$15 > 1) {
                        $$18 = fap.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = fap.A;
                     if ($$15 > 3) {
                        $$18 = fap.a.b;
                     } else {
                        $$18 = fap.a.d;
                     }
                  }

                  if ($$19 != fap.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(dcv $$0, aub $$1, bzm $$2, @Nullable bzw $$3) {
      fcg $$4 = b($$0, (dmu)$$1);
      if ($$4 != null) {
         if ($$2 instanceof cut $$5) {
            $$4.a($$5, $$0);
         }

         if (!$$4.i && $$3 != null && $$3.a() == bzw.a.a) {
            this.a($$1, $$2, $$4);
         }
      }
   }

   @Override
   public void a(dcv $$0, dmu $$1) {
      dfs $$2 = $$0.e(kq.O);
      if ($$2 != null) {
         if ($$1 instanceof aub $$3) {
            switch ($$2) {
               case a:
                  b($$0, $$3);
                  break;
               case b:
                  a($$0, $$3);
            }
         }
      }
   }

   private static void a(dcv $$0, aub $$1) {
      fcg $$2 = b($$0, (dmu)$$1);
      if ($$2 != null) {
         fce $$3 = $$1.y();
         $$1.a($$3, $$2.b());
         $$0.b(kq.M, $$3);
      }
   }

   private static void b(dcv $$0, aub $$1) {
      fcg $$2 = b($$0, (dmu)$$1);
      if ($$2 != null) {
         fce $$3 = $$1.y();
         fcg $$4 = $$2.a();
         $$1.a($$3, $$4);
         $$0.b(kq.M, $$3);
      }
   }

   @Override
   public bxj a(dgq $$0) {
      eeb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(azo.ao)) {
         if (!$$0.q().C) {
            fcg $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bxj.d;
            }
         }

         return bxj.a;
      } else {
         return super.a($$0);
      }
   }
}
