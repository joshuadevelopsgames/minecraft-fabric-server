import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class eks {
   private static final eeb a = dqb.hK.m();
   private static final eeb b = dqb.hL.m();
   private static final eeb c = dqb.jc.m();
   private static final eeb d = dqb.hO.m();
   private static final eeb e = dqb.hW.m();
   private static final eeb f = dqb.hY.m();
   private static final eeb g = dqb.hS.m();
   private static final eeb h = dqb.je.m();
   private static final eeb i = dqb.ef.m();
   private final eeb j;
   private final int k;
   private final eeb[] l;
   private final ezo m;
   private final ezo n;
   private final ezo o;
   private final ezo p;
   private final ezo q;
   private final ezo r;
   private final ezo s;
   private final ekn t;
   private final ezo u;
   private final ezo v;

   public eks(eko $$0, eeb $$1, int $$2, ekn $$3) {
      this.j = $$1;
      this.k = $$2;
      this.t = $$3;
      this.m = $$0.a(ekj.P);
      this.l = a($$3.a(ame.b("clay_bands")));
      this.u = $$0.a(ekj.N);
      this.v = $$0.a(ekj.O);
      this.n = $$0.a(ekj.Q);
      this.o = $$0.a(ekj.R);
      this.p = $$0.a(ekj.S);
      this.q = $$0.a(ekj.T);
      this.r = $$0.a(ekj.U);
      this.s = $$0.a(ekj.V);
   }

   public void a(eko $$0, dnz $$1, jy<dnx> $$2, boolean $$3, ekx $$4, final efy $$5, eke $$6, ekr.o $$7) {
      final jb.a $$8 = new jb.a();
      final dlz $$9 = $$5.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      efv $$12 = new efv() {
         @Override
         public eeb a(int $$0) {
            return $$5.a_($$8.q($$0));
         }

         @Override
         public void a(int $$0, eeb $$1x) {
            dmw $$2x = $$5.B();
            if ($$2x.d($$0)) {
               $$5.a($$8.q($$0), $$1x);
               if (!$$1x.y().c()) {
                  $$5.e($$8);
               }
            }
         }

         @Override
         public String toString() {
            return "ChunkBlockColumn " + $$9;
         }
      };
      ekr.g $$13 = new ekr.g(this, $$0, $$5, $$6, $$1::a, $$2, $$4);
      ekr.u $$14 = $$7.apply($$13);
      jb.a $$15 = new jb.a();

      for (int $$16 = 0; $$16 < 16; $$16++) {
         for (int $$17 = 0; $$17 < 16; $$17++) {
            int $$18 = $$10 + $$16;
            int $$19 = $$11 + $$17;
            int $$20 = $$5.a(eka.a.a, $$16, $$17) + 1;
            $$8.p($$18).r($$19);
            jl<dnx> $$21 = $$1.a($$15.d($$18, $$3 ? 0 : $$20, $$19));
            if ($$21.a(doe.C)) {
               this.a($$12, $$18, $$19, $$20, $$5);
            }

            int $$22 = $$5.a(eka.a.a, $$16, $$17) + 1;
            $$13.a($$18, $$19);
            int $$23 = 0;
            int $$24 = Integer.MIN_VALUE;
            int $$25 = Integer.MAX_VALUE;
            int $$26 = $$5.L_();

            for (int $$27 = $$22; $$27 >= $$26; $$27--) {
               eeb $$28 = $$12.a($$27);
               if ($$28.l()) {
                  $$23 = 0;
                  $$24 = Integer.MIN_VALUE;
               } else if (!$$28.y().c()) {
                  if ($$24 == Integer.MIN_VALUE) {
                     $$24 = $$27 + 1;
                  }
               } else {
                  if ($$25 >= $$27) {
                     $$25 = ehy.g;

                     for (int $$29 = $$27 - 1; $$29 >= $$26 - 1; $$29--) {
                        eeb $$30 = $$12.a($$29);
                        if (!this.a($$30)) {
                           $$25 = $$29 + 1;
                           break;
                        }
                     }
                  }

                  $$23++;
                  int $$31 = $$27 - $$25 + 1;
                  $$13.a($$23, $$31, $$24, $$18, $$27, $$19);
                  if ($$28 == this.j) {
                     eeb $$32 = $$14.tryApply($$18, $$27, $$19);
                     if ($$32 != null) {
                        $$12.a($$27, $$32);
                     }
                  }
               }
            }

            if ($$21.a(doe.X) || $$21.a(doe.Y)) {
               this.a($$13.c(), $$21.a(), $$12, $$15, $$18, $$19, $$20);
            }
         }
      }
   }

   protected int a(int $$0, int $$1) {
      double $$2 = this.u.a($$0, 0.0, $$1);
      return (int)($$2 * 2.75 + 3.0 + this.t.a($$0, 0, $$1).j() * 0.25);
   }

   protected double b(int $$0, int $$1) {
      return this.v.a($$0, 0.0, $$1);
   }

   private boolean a(eeb $$0) {
      return !$$0.l() && $$0.y().c();
   }

   public int a() {
      return this.k;
   }

   @Deprecated
   public Optional<eeb> a(ekr.o $$0, emb $$1, Function<jb, jl<dnx>> $$2, efy $$3, eke $$4, jb $$5, boolean $$6) {
      ekr.g $$7 = new ekr.g(this, $$1.d(), $$3, $$4, $$2, $$1.c().f(mn.aK), $$1);
      ekr.u $$8 = $$0.apply($$7);
      int $$9 = $$5.u();
      int $$10 = $$5.v();
      int $$11 = $$5.w();
      $$7.a($$9, $$11);
      $$7.a(1, 1, $$6 ? $$10 + 1 : Integer.MIN_VALUE, $$9, $$10, $$11);
      eeb $$12 = $$8.tryApply($$9, $$10, $$11);
      return Optional.ofNullable($$12);
   }

   private void a(efv $$0, int $$1, int $$2, int $$3, dmw $$4) {
      double $$5 = 0.2;
      double $$6 = Math.min(Math.abs(this.p.a($$1, 0.0, $$2) * 8.25), this.n.a($$1 * 0.2, 0.0, $$2 * 0.2) * 15.0);
      if (!($$6 <= 0.0)) {
         double $$7 = 0.75;
         double $$8 = 1.5;
         double $$9 = Math.abs(this.o.a($$1 * 0.75, 0.0, $$2 * 0.75) * 1.5);
         double $$10 = 64.0 + Math.min($$6 * $$6 * 2.5, Math.ceil($$9 * 50.0) + 24.0);
         int $$11 = bcb.a($$10);
         if ($$3 <= $$11) {
            for (int $$12 = $$11; $$12 >= $$4.L_(); $$12--) {
               eeb $$13 = $$0.a($$12);
               if ($$13.a(this.j.b())) {
                  break;
               }

               if ($$13.a(dqb.J)) {
                  return;
               }
            }

            for (int $$14 = $$11; $$14 >= $$4.L_() && $$0.a($$14).l(); $$14--) {
               $$0.a($$14, this.j);
            }
         }
      }
   }

   private void a(int $$0, dnx $$1, efv $$2, jb.a $$3, int $$4, int $$5, int $$6) {
      double $$7 = 1.28;
      double $$8 = Math.min(Math.abs(this.s.a($$4, 0.0, $$5) * 8.25), this.q.a($$4 * 1.28, 0.0, $$5 * 1.28) * 15.0);
      if (!($$8 <= 1.8)) {
         double $$9 = 1.17;
         double $$10 = 1.5;
         double $$11 = Math.abs(this.r.a($$4 * 1.17, 0.0, $$5 * 1.17) * 1.5);
         double $$12 = Math.min($$8 * $$8 * 1.2, Math.ceil($$11 * 40.0) + 14.0);
         if ($$1.d($$3.d($$4, this.k, $$5), this.k)) {
            $$12 -= 2.0;
         }

         double $$13;
         if ($$12 > 2.0) {
            $$13 = this.k - $$12 - 7.0;
            $$12 += this.k;
         } else {
            $$12 = 0.0;
            $$13 = 0.0;
         }

         double $$15 = $$12;
         bck $$16 = this.t.a($$4, 0, $$5);
         int $$17 = 2 + $$16.a(4);
         int $$18 = this.k + 18 + $$16.a(10);
         int $$19 = 0;

         for (int $$20 = Math.max($$6, (int)$$12 + 1); $$20 >= $$0; $$20--) {
            if ($$2.a($$20).l() && $$20 < (int)$$15 && $$16.j() > 0.01
               || $$2.a($$20).a(dqb.J) && $$20 > (int)$$13 && $$20 < this.k && $$13 != 0.0 && $$16.j() > 0.15) {
               if ($$19 <= $$17 && $$20 > $$18) {
                  $$2.a($$20, i);
                  $$19++;
               } else {
                  $$2.a($$20, h);
               }
            }
         }
      }
   }

   private static eeb[] a(bck $$0) {
      eeb[] $$1 = new eeb[192];
      Arrays.fill($$1, c);

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$2 += $$0.a(5) + 1;
         if ($$2 < $$1.length) {
            $$1[$$2] = b;
         }
      }

      a($$0, $$1, 1, d);
      a($$0, $$1, 2, e);
      a($$0, $$1, 1, f);
      int $$3 = $$0.a(9, 15);
      int $$4 = 0;

      for (int $$5 = 0; $$4 < $$3 && $$5 < $$1.length; $$5 += $$0.a(16) + 4) {
         $$1[$$5] = a;
         if ($$5 - 1 > 0 && $$0.h()) {
            $$1[$$5 - 1] = g;
         }

         if ($$5 + 1 < $$1.length && $$0.h()) {
            $$1[$$5 + 1] = g;
         }

         $$4++;
      }

      return $$1;
   }

   private static void a(bck $$0, eeb[] $$1, int $$2, eeb $$3) {
      int $$4 = $$0.a(6, 15);

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         int $$6 = $$2 + $$0.a(3);
         int $$7 = $$0.a($$1.length);

         for (int $$8 = 0; $$7 + $$8 < $$1.length && $$8 < $$6; $$8++) {
            $$1[$$7 + $$8] = $$3;
         }
      }
   }

   protected eeb a(int $$0, int $$1, int $$2) {
      int $$3 = (int)Math.round(this.m.a($$0, 0.0, $$2) * 4.0);
      return this.l[($$1 + $$3 + this.l.length) % this.l.length];
   }
}
