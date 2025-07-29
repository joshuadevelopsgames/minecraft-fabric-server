import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dtc extends dpm {
   public static final MapCodec<dtc> b = b(dtc::new);
   public static final int c = 15;
   public static final efb d = eer.az;
   public static final ees e = dvu.b;
   public static final ees f = dvu.c;
   public static final ees g = dvu.d;
   public static final ees h = dvu.e;
   public static final ees i = dvu.f;
   public static final Map<jh, ees> D = dvu.h.entrySet().stream().filter($$0 -> $$0.getKey() != jh.a).collect(ag.a());
   private final Function<eeb, fjm> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dpz> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dpz> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dtc> a() {
      return b;
   }

   public dtc(eea.d $$0) {
      super($$0, 1.0F);
      this.l(this.C.b().b(d, 0).b(e, false).b(f, false).b(g, false).b(h, false).b(i, false));
      this.R = this.q();
   }

   private Function<eeb, fjm> q() {
      Map<jh, fjm> $$0 = fjj.d(dpz.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fjm $$2 = fjj.a();

         for (Entry<jh, ees> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fjj.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new efe[]{d});
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dqb.a.m();
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected eeb b(dly $$0, jb $$1) {
      jb $$2 = $$1.e();
      eeb $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jh.b)) {
         eeb $$4 = this.m();

         for (jh $$5 : jh.values()) {
            ees $$6 = D.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, this.g($$0.a_($$1.a($$5))));
            }
         }

         return $$4;
      } else {
         return this.m();
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jh.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.P().c(dmq.b)) {
         if ($$1.P().c(dmq.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            eeb $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.G_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((dmu)$$1, $$2) && $$3.i() < 0.2F + $$6 * 0.03F) {
               $$1.a($$2, false);
            } else {
               int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
               if ($$6 != $$7) {
                  $$0 = $$0.b(d, $$7);
                  $$1.a($$2, $$0, 260);
               }

               if (!$$5) {
                  if (!this.d($$1, $$2)) {
                     jb $$8 = $$2.e();
                     if (!$$1.a_($$8).c($$1, $$8, jh.b) || $$6 > 3) {
                        $$1.a($$2, false);
                     }

                     return;
                  }

                  if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                     $$1.a($$2, false);
                     return;
                  }
               }

               boolean $$9 = $$1.v($$2).a(azn.ad);
               int $$10 = $$9 ? -50 : 0;
               this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
               jb.a $$11 = new jb.a();

               for (int $$12 = -1; $$12 <= 1; $$12++) {
                  for (int $$13 = -1; $$13 <= 1; $$13++) {
                     for (int $$14 = -1; $$14 <= 4; $$14++) {
                        if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                           int $$15 = 100;
                           if ($$14 > 1) {
                              $$15 += ($$14 - 1) * 100;
                           }

                           $$11.a($$2, $$12, $$14, $$13);
                           int $$16 = this.a((dmx)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((dmu)$$1, $$11))) {
                                 int $$18 = Math.min(15, $$6 + $$3.a(5) / 4);
                                 $$1.a($$11, this.a($$1, $$11, $$18), 3);
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

   protected boolean a(dmu $$0, jb $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(eeb $$0) {
      return $$0.b(eer.I) && $$0.c(eer.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(eeb $$0) {
      return $$0.b(eer.I) && $$0.c(eer.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(dmu $$0, jb $$1, int $$2, bck $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         eeb $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dpz $$8 = $$6.b();
         if ($$8 instanceof dyx) {
            dyx.a($$0, $$1);
         }
      }
   }

   private eeb a(dmx $$0, jb $$1, int $$2) {
      eeb $$3 = a((dly)$$0, $$1);
      return $$3.a(dqb.cB) ? $$3.b(d, $$2) : $$3;
   }

   private boolean d(dly $$0, jb $$1) {
      for (jh $$2 : jh.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dmx $$0, jb $$1) {
      if (!$$0.w($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jh $$3 : jh.values()) {
            eeb $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(eeb $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(bck $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dpz $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dtc $$0 = (dtc)dqb.cB;
      $$0.a(dqb.n, 5, 20);
      $$0.a(dqb.o, 5, 20);
      $$0.a(dqb.p, 5, 20);
      $$0.a(dqb.q, 5, 20);
      $$0.a(dqb.r, 5, 20);
      $$0.a(dqb.s, 5, 20);
      $$0.a(dqb.t, 5, 20);
      $$0.a(dqb.v, 5, 20);
      $$0.a(dqb.w, 5, 20);
      $$0.a(dqb.x, 5, 20);
      $$0.a(dqb.y, 5, 20);
      $$0.a(dqb.jV, 5, 20);
      $$0.a(dqb.jW, 5, 20);
      $$0.a(dqb.jX, 5, 20);
      $$0.a(dqb.jY, 5, 20);
      $$0.a(dqb.jZ, 5, 20);
      $$0.a(dqb.ka, 5, 20);
      $$0.a(dqb.kb, 5, 20);
      $$0.a(dqb.kc, 5, 20);
      $$0.a(dqb.kd, 5, 20);
      $$0.a(dqb.ke, 5, 20);
      $$0.a(dqb.kf, 5, 20);
      $$0.a(dqb.fA, 5, 20);
      $$0.a(dqb.ky, 5, 20);
      $$0.a(dqb.kz, 5, 20);
      $$0.a(dqb.kA, 5, 20);
      $$0.a(dqb.kB, 5, 20);
      $$0.a(dqb.kC, 5, 20);
      $$0.a(dqb.kD, 5, 20);
      $$0.a(dqb.kE, 5, 20);
      $$0.a(dqb.kF, 5, 20);
      $$0.a(dqb.kG, 5, 20);
      $$0.a(dqb.el, 5, 20);
      $$0.a(dqb.kH, 5, 20);
      $$0.a(dqb.kI, 5, 20);
      $$0.a(dqb.kJ, 5, 20);
      $$0.a(dqb.kK, 5, 20);
      $$0.a(dqb.kL, 5, 20);
      $$0.a(dqb.kM, 5, 20);
      $$0.a(dqb.kN, 5, 20);
      $$0.a(dqb.kO, 5, 20);
      $$0.a(dqb.kP, 5, 20);
      $$0.a(dqb.cF, 5, 20);
      $$0.a(dqb.gk, 5, 20);
      $$0.a(dqb.gj, 5, 20);
      $$0.a(dqb.gl, 5, 20);
      $$0.a(dqb.iq, 5, 20);
      $$0.a(dqb.ir, 5, 20);
      $$0.a(dqb.is, 5, 20);
      $$0.a(dqb.it, 5, 20);
      $$0.a(dqb.iu, 5, 20);
      $$0.a(dqb.iv, 5, 20);
      $$0.a(dqb.iw, 5, 20);
      $$0.a(dqb.X, 5, 5);
      $$0.a(dqb.Y, 5, 5);
      $$0.a(dqb.Z, 5, 5);
      $$0.a(dqb.aa, 5, 5);
      $$0.a(dqb.ab, 5, 5);
      $$0.a(dqb.ac, 5, 5);
      $$0.a(dqb.ae, 5, 5);
      $$0.a(dqb.ad, 5, 5);
      $$0.a(dqb.af, 5, 5);
      $$0.a(dqb.ai, 5, 5);
      $$0.a(dqb.aq, 5, 5);
      $$0.a(dqb.aj, 5, 5);
      $$0.a(dqb.ak, 5, 5);
      $$0.a(dqb.al, 5, 5);
      $$0.a(dqb.am, 5, 5);
      $$0.a(dqb.an, 5, 5);
      $$0.a(dqb.ao, 5, 5);
      $$0.a(dqb.ap, 5, 5);
      $$0.a(dqb.ar, 5, 5);
      $$0.a(dqb.as, 5, 5);
      $$0.a(dqb.aB, 5, 5);
      $$0.a(dqb.aC, 5, 5);
      $$0.a(dqb.aD, 5, 5);
      $$0.a(dqb.aE, 5, 5);
      $$0.a(dqb.aF, 5, 5);
      $$0.a(dqb.aG, 5, 5);
      $$0.a(dqb.aH, 5, 5);
      $$0.a(dqb.aI, 5, 5);
      $$0.a(dqb.aJ, 5, 5);
      $$0.a(dqb.at, 5, 5);
      $$0.a(dqb.au, 5, 5);
      $$0.a(dqb.av, 5, 5);
      $$0.a(dqb.aw, 5, 5);
      $$0.a(dqb.ax, 5, 5);
      $$0.a(dqb.ay, 5, 5);
      $$0.a(dqb.u, 5, 5);
      $$0.a(dqb.az, 5, 5);
      $$0.a(dqb.aA, 5, 5);
      $$0.a(dqb.ag, 5, 20);
      $$0.a(dqb.aK, 30, 60);
      $$0.a(dqb.aL, 30, 60);
      $$0.a(dqb.aM, 30, 60);
      $$0.a(dqb.aN, 30, 60);
      $$0.a(dqb.aO, 30, 60);
      $$0.a(dqb.aP, 30, 60);
      $$0.a(dqb.aQ, 30, 60);
      $$0.a(dqb.aR, 30, 60);
      $$0.a(dqb.aS, 30, 60);
      $$0.a(dqb.cv, 30, 20);
      $$0.a(dqb.cu, 15, 100);
      $$0.a(dqb.bA, 60, 100);
      $$0.a(dqb.bB, 60, 100);
      $$0.a(dqb.bC, 60, 100);
      $$0.a(dqb.bE, 60, 100);
      $$0.a(dqb.bF, 60, 100);
      $$0.a(dqb.jf, 60, 100);
      $$0.a(dqb.jg, 60, 100);
      $$0.a(dqb.jh, 60, 100);
      $$0.a(dqb.ji, 60, 100);
      $$0.a(dqb.jj, 60, 100);
      $$0.a(dqb.jk, 60, 100);
      $$0.a(dqb.cb, 60, 100);
      $$0.a(dqb.cd, 60, 100);
      $$0.a(dqb.ui, 60, 100);
      $$0.a(dqb.uj, 60, 100);
      $$0.a(dqb.ce, 60, 100);
      $$0.a(dqb.cf, 60, 100);
      $$0.a(dqb.cg, 60, 100);
      $$0.a(dqb.ch, 60, 100);
      $$0.a(dqb.ci, 60, 100);
      $$0.a(dqb.cj, 60, 100);
      $$0.a(dqb.ck, 60, 100);
      $$0.a(dqb.cl, 60, 100);
      $$0.a(dqb.cm, 60, 100);
      $$0.a(dqb.co, 60, 100);
      $$0.a(dqb.cc, 60, 100);
      $$0.a(dqb.li, 60, 100);
      $$0.a(dqb.cn, 60, 100);
      $$0.a(dqb.tk, 60, 100);
      $$0.a(dqb.tl, 60, 100);
      $$0.a(dqb.tm, 60, 100);
      $$0.a(dqb.eh, 60, 100);
      $$0.a(dqb.bK, 30, 60);
      $$0.a(dqb.bL, 30, 60);
      $$0.a(dqb.bM, 30, 60);
      $$0.a(dqb.bN, 30, 60);
      $$0.a(dqb.bO, 30, 60);
      $$0.a(dqb.bP, 30, 60);
      $$0.a(dqb.bQ, 30, 60);
      $$0.a(dqb.bR, 30, 60);
      $$0.a(dqb.bS, 30, 60);
      $$0.a(dqb.bT, 30, 60);
      $$0.a(dqb.bU, 30, 60);
      $$0.a(dqb.bV, 30, 60);
      $$0.a(dqb.bW, 30, 60);
      $$0.a(dqb.bX, 30, 60);
      $$0.a(dqb.bY, 30, 60);
      $$0.a(dqb.bZ, 30, 60);
      $$0.a(dqb.fx, 15, 100);
      $$0.a(dqb.jd, 5, 5);
      $$0.a(dqb.iL, 60, 20);
      $$0.a(dqb.pM, 15, 20);
      $$0.a(dqb.iM, 60, 20);
      $$0.a(dqb.iN, 60, 20);
      $$0.a(dqb.iO, 60, 20);
      $$0.a(dqb.iP, 60, 20);
      $$0.a(dqb.iQ, 60, 20);
      $$0.a(dqb.iR, 60, 20);
      $$0.a(dqb.iS, 60, 20);
      $$0.a(dqb.iT, 60, 20);
      $$0.a(dqb.iU, 60, 20);
      $$0.a(dqb.iV, 60, 20);
      $$0.a(dqb.iW, 60, 20);
      $$0.a(dqb.iX, 60, 20);
      $$0.a(dqb.iY, 60, 20);
      $$0.a(dqb.iZ, 60, 20);
      $$0.a(dqb.ja, 60, 20);
      $$0.a(dqb.jb, 60, 20);
      $$0.a(dqb.uf, 5, 100);
      $$0.a(dqb.ug, 5, 100);
      $$0.a(dqb.uh, 5, 100);
      $$0.a(dqb.mK, 30, 60);
      $$0.a(dqb.nG, 60, 60);
      $$0.a(dqb.oz, 60, 60);
      $$0.a(dqb.oH, 30, 20);
      $$0.a(dqb.pL, 5, 20);
      $$0.a(dqb.oP, 60, 100);
      $$0.a(dqb.pO, 5, 20);
      $$0.a(dqb.pN, 30, 20);
      $$0.a(dqb.aT, 30, 60);
      $$0.a(dqb.aU, 30, 60);
      $$0.a(dqb.te, 15, 60);
      $$0.a(dqb.tf, 15, 60);
      $$0.a(dqb.tg, 60, 100);
      $$0.a(dqb.th, 30, 60);
      $$0.a(dqb.ti, 30, 60);
      $$0.a(dqb.to, 60, 100);
      $$0.a(dqb.tp, 60, 100);
      $$0.a(dqb.tq, 60, 100);
      $$0.a(dqb.tr, 30, 60);
      $$0.a(dqb.fy, 15, 100);
      $$0.a(dqb.um, 60, 100);
      $$0.a(dqb.bD, 60, 100);
   }
}
