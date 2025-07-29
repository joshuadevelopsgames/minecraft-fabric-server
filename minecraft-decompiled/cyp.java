import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cyp extends czq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final Logger u = LogUtils.getLogger();
   private static final boolean v = false;
   public static final int p = 50;
   private int w;
   @Nullable
   private String x;
   private final czg y = czg.a();
   private boolean z = false;
   private static final int A = 0;
   private static final int B = 1;
   private static final int C = 1;
   private static final int D = 1;
   private static final int E = 2;
   private static final int F = 1;
   private static final int G = 1;
   private static final int H = 27;
   private static final int I = 76;
   private static final int J = 134;
   private static final int K = 47;

   public cyp(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public cyp(int $$0, cus $$1, cyz $$2) {
      super(czv.i, $$0, $$1, $$2, o());
      this.a(this.y);
   }

   private static czr o() {
      return czr.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.a(azo.J);
   }

   @Override
   protected boolean a(cut $$0, boolean $$1) {
      return ($$0.gc() || $$0.cB >= this.y.b()) && this.y.b() > 0;
   }

   @Override
   protected void a(cut $$0, dcv $$1) {
      if (!$$0.gc()) {
         $$0.c(-this.y.b());
      }

      if (this.w > 0) {
         dcv $$2 = this.s.a(1);
         if (!$$2.f() && $$2.M() > this.w) {
            $$2.h(this.w);
            this.s.a(1, $$2);
         } else {
            this.s.a(1, dcv.l);
         }
      } else if (!this.z) {
         this.s.a(1, dcv.l);
      }

      this.y.a(0);
      if ($$0 instanceof auc $$3 && !bdb.h(this.x) && !this.s.a(0).y().getString().equals(this.x)) {
         $$3.W().a(this.x);
      }

      this.s.a(0, dcv.l);
      this.q.a(($$1x, $$2) -> {
         eeb $$3x = $$1x.a_($$2);
         if (!$$0.gc() && $$3x.a(azo.J) && $$0.ec().i() < 0.12F) {
            eeb $$4 = doz.e($$3x);
            if ($$4 == null) {
               $$1x.a($$2, false);
               $$1x.c(1029, $$2, 0);
            } else {
               $$1x.a($$2, $$4, 2);
               $$1x.c(1030, $$2, 0);
            }
         } else {
            $$1x.c(1030, $$2, 0);
         }
      });
   }

   @Override
   public void l() {
      dcv $$0 = this.s.a(0);
      this.z = false;
      this.y.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.f() && djk.a($$0)) {
         dcv $$4 = $$0.v();
         dcv $$5 = this.s.a(1);
         djo.a $$6 = new djo.a(djk.b($$4));
         $$2 += (long)$$0.a(kq.r, Integer.valueOf(0)).intValue() + $$5.a(kq.r, Integer.valueOf(0)).intValue();
         this.w = 0;
         if (!$$5.f()) {
            boolean $$7 = $$5.c(kq.J);
            if ($$4.m() && $$0.c($$5)) {
               int $$8 = Math.min($$4.o(), $$4.p() / 4);
               if ($$8 <= 0) {
                  this.t.a(0, dcv.l);
                  this.y.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.M(); $$9++) {
                  int $$10 = $$4.o() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.o(), $$4.p() / 4);
               }

               this.w = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.h()) || !$$4.m())) {
                  this.t.a(0, dcv.l);
                  this.y.a(0);
                  return;
               }

               if ($$4.m() && !$$7) {
                  int $$11 = $$0.p() - $$0.o();
                  int $$12 = $$5.p() - $$5.o();
                  int $$13 = $$12 + $$4.p() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.p() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.o()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               djo $$16 = djk.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<jl<dji>> $$19 : $$16.b()) {
                  jl<dji> $$20 = (jl<dji>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  dji $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.r.gc() || $$0.a(dcz.vY)) {
                     $$24 = true;
                  }

                  for (jl<dji> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !dji.a($$20, $$25)) {
                        $$24 = false;
                        $$1++;
                     }
                  }

                  if (!$$24) {
                     $$18 = true;
                  } else {
                     $$17 = true;
                     if ($$22 > $$23.e()) {
                        $$22 = $$23.e();
                     }

                     $$6.a($$20, $$22);
                     int $$26 = $$23.c();
                     if ($$7) {
                        $$26 = Math.max(1, $$26 / 2);
                     }

                     $$1 += $$26 * $$22;
                     if ($$0.M() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.t.a(0, dcv.l);
                  this.y.a(0);
                  return;
               }
            }
         }

         if (this.x != null && !bdb.h(this.x)) {
            if (!this.x.equals($$0.y().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(kq.g, xo.b(this.x));
            }
         } else if ($$0.c(kq.g)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.e(kq.g);
         }

         int $$27 = $$1 <= 0 ? 0 : (int)bcb.a($$2 + $$1, 0L, 2147483647L);
         this.y.a($$27);
         if ($$1 <= 0) {
            $$4 = dcv.l;
         }

         if ($$3 == $$1 && $$3 > 0) {
            if (this.y.b() >= 40) {
               this.y.a(39);
            }

            this.z = true;
         }

         if (this.y.b() >= 40 && !this.r.gc()) {
            $$4 = dcv.l;
         }

         if (!$$4.f()) {
            int $$28 = $$4.a(kq.r, Integer.valueOf(0));
            if ($$28 < $$5.a(kq.r, Integer.valueOf(0))) {
               $$28 = $$5.a(kq.r, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$28 = e($$28);
            }

            $$4.b(kq.r, $$28);
            djk.a($$4, $$6.b());
         }

         this.t.a(0, $$4);
         this.d();
      } else {
         this.t.a(0, dcv.l);
         this.y.a(0);
      }
   }

   public static int e(int $$0) {
      return (int)Math.min($$0 * 2L + 1L, 2147483647L);
   }

   public boolean a(String $$0) {
      String $$1 = b($$0);
      if ($$1 != null && !$$1.equals(this.x)) {
         this.x = $$1;
         if (this.b(2).h()) {
            dcv $$2 = this.b(2).g();
            if (bdb.h($$1)) {
               $$2.e(kq.g);
            } else {
               $$2.b(kq.g, xo.b($$1));
            }
         }

         this.l();
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private static String b(String $$0) {
      String $$1 = bdb.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int m() {
      return this.y.b();
   }
}
