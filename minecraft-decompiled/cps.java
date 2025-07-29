import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cps extends cao implements crn {
   private static final Logger cm = LogUtils.getLogger();
   public static final alh<Integer> a = all.a(cps.class, alj.b);
   private static final clc cn = clc.a().a(64.0);
   private static final int co = 200;
   private static final int cp = 400;
   private static final float cq = 0.25F;
   private static final String cr = "DragonDeathTime";
   private static final String cs = "DragonPhase";
   private static final int ct = 0;
   public final cpq b = new cpq();
   private final cpp[] cu;
   public final cpp c;
   private final cpp cv;
   private final cpp cw;
   private final cpp cx;
   private final cpp cy;
   private final cpp cz;
   private final cpp cA;
   private final cpp cB;
   public float d;
   public float e;
   public boolean f;
   public int cj = 0;
   public float ck;
   @Nullable
   public cpr cl;
   @Nullable
   private eib cC;
   private jb cD = jb.c;
   private final cqj cE;
   private int cF = 100;
   private float cG;
   private final fax[] cH = new fax[24];
   private final int[] cI = new int[24];
   private final fav cJ = new fav();

   public cps(bzv<? extends cps> $$0, dmu $$1) {
      super(bzv.Q, $$1);
      this.c = new cpp(this, "head", 1.0F, 1.0F);
      this.cv = new cpp(this, "neck", 3.0F, 3.0F);
      this.cw = new cpp(this, "body", 5.0F, 3.0F);
      this.cx = new cpp(this, "tail", 2.0F, 2.0F);
      this.cy = new cpp(this, "tail", 2.0F, 2.0F);
      this.cz = new cpp(this, "tail", 2.0F, 2.0F);
      this.cA = new cpp(this, "wing", 4.0F, 2.0F);
      this.cB = new cpp(this, "wing", 4.0F, 2.0F);
      this.cu = new cpp[]{this.c, this.cv, this.cw, this.cx, this.cy, this.cz, this.cA, this.cB};
      this.x(this.fa());
      this.aq = true;
      this.cE = new cqj(this);
   }

   public void a(eib $$0) {
      this.cC = $$0;
   }

   @Override
   public void c(jb $$0) {
      this.cD = $$0;
   }

   public jb l() {
      return this.cD;
   }

   public static cbr.a m() {
      return cao.I().a(cbs.t, 200.0).a(cbs.i, 16.0);
   }

   @Override
   public boolean bd() {
      float $$0 = bcb.b(this.e * (float) (Math.PI * 2));
      float $$1 = bcb.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void bc() {
      if (this.ai().C && !this.be()) {
         this.ai().a(this.dC(), this.dE(), this.dI(), ayz.iK, this.do(), 5.0F, 0.8F + this.ar.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, cqi.k.b());
   }

   @Override
   public void e_() {
      this.aR();
      if (this.ai().C) {
         this.x(this.eL());
         if (!this.be() && !this.cE.a().a() && --this.cF < 0) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.iL, this.do(), 2.5F, 0.8F + this.ar.i() * 0.3F, false);
            this.cF = 200 + this.ar.a(200);
         }
      }

      if (this.cC == null && this.ai() instanceof aub $$0) {
         eib $$1 = $$0.G();
         if ($$1 != null && this.cK().equals($$1.i())) {
            this.cC = $$1;
         }
      }

      this.d = this.e;
      if (this.eM()) {
         float $$2 = (this.ar.i() - 0.5F) * 8.0F;
         float $$3 = (this.ar.i() - 0.5F) * 4.0F;
         float $$4 = (this.ar.i() - 0.5F) * 8.0F;
         this.ai().a(me.w, this.dC() + $$2, this.dE() + 2.0 + $$3, this.dI() + $$4, 0.0, 0.0, 0.0);
      } else {
         this.gG();
         fis $$5 = this.dA();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.cE.a().a()) {
            this.e += 0.1F;
         } else if (this.f) {
            this.e += $$6 * 0.5F;
         } else {
            this.e += $$6;
         }

         this.v(bcb.h(this.dP()));
         if (this.gw()) {
            this.e = 0.5F;
         } else {
            this.b.a(this.dE(), this.dP());
            if (this.ai() instanceof aub $$7) {
               cqc $$9 = this.cE.a();
               $$9.a($$7);
               if (this.cE.a() != $$9) {
                  $$9 = this.cE.a();
                  $$9.a($$7);
               }

               fis $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dC();
                  double $$12 = $$10.e - this.dE();
                  double $$13 = $$10.f - this.dI();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = bcb.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.i(this.dA().b(0.0, $$12 * 0.01, 0.0));
                  this.v(bcb.h(this.dP()));
                  fis $$17 = $$10.a(this.dC(), this.dE(), this.dI()).d();
                  fis $$18 = new fis(bcb.a(this.dP() * (float) (Math.PI / 180.0)), this.dA().e, -bcb.b(this.dP() * (float) (Math.PI / 180.0))).d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = bcb.a(bcb.h(180.0F - (float)bcb.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dP()), -50.0F, 50.0F);
                     this.ck *= 0.8F;
                     this.ck = this.ck + $$20 * $$9.g();
                     this.v(this.dP() + this.ck * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fis(0.0, 0.0, -1.0));
                  if (this.f) {
                     this.a(caq.a, this.dA().c(0.8F));
                  } else {
                     this.a(caq.a, this.dA());
                  }

                  fis $$23 = this.dA().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.i(this.dA().d($$24, 0.91F, $$24));
               }
            } else {
               this.bF.e();
               this.cE.a().b();
            }

            if (!this.ai().B_()) {
               this.aL();
            }

            this.br = this.dP();
            fis[] $$25 = new fis[this.cu.length];

            for (int $$26 = 0; $$26 < this.cu.length; $$26++) {
               $$25[$$26] = new fis(this.cu[$$26].dC(), this.cu[$$26].dE(), this.cu[$$26].dI());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = bcb.b($$27);
            float $$29 = bcb.a($$27);
            float $$30 = this.dP() * (float) (Math.PI / 180.0);
            float $$31 = bcb.a($$30);
            float $$32 = bcb.b($$30);
            this.a(this.cw, $$31 * 0.5F, 0.0, -$$32 * 0.5F);
            this.a(this.cA, $$32 * 4.5F, 2.0, $$31 * 4.5F);
            this.a(this.cB, $$32 * -4.5F, 2.0, $$31 * -4.5F);
            if (this.ai() instanceof aub $$33 && this.bj == 0) {
               this.a($$33, $$33.a(this, this.cA.cV().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bzt.e));
               this.a($$33, $$33.a(this, this.cB.cV().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bzt.e));
               this.b($$33, $$33.a(this, this.c.cV().g(1.0), bzt.e));
               this.b($$33, $$33.a(this, this.cv.cV().g(1.0), bzt.e));
            }

            float $$34 = bcb.a(this.dP() * (float) (Math.PI / 180.0) - this.ck * 0.01F);
            float $$35 = bcb.b(this.dP() * (float) (Math.PI / 180.0) - this.ck * 0.01F);
            float $$36 = this.gF();
            this.a(this.c, $$34 * 6.5F * $$28, $$36 + $$29 * 6.5F, -$$35 * 6.5F * $$28);
            this.a(this.cv, $$34 * 5.5F * $$28, $$36 + $$29 * 5.5F, -$$35 * 5.5F * $$28);
            cpq.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               cpp $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.cx;
               }

               if ($$38 == 1) {
                  $$39 = this.cy;
               }

               if ($$38 == 2) {
                  $$39 = this.cz;
               }

               cpq.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dP() * (float) (Math.PI / 180.0) + this.i($$40.b() - $$37.b()) * (float) (Math.PI / 180.0);
               float $$42 = bcb.a($$41);
               float $$43 = bcb.b($$41);
               float $$44 = 1.5F;
               float $$45 = ($$38 + 1) * 2.0F;
               this.a($$39, -($$31 * 1.5F + $$42 * $$45) * $$28, $$40.a() - $$37.a() - ($$45 + 1.5F) * $$29 + 1.5, ($$32 * 1.5F + $$43 * $$45) * $$28);
            }

            if (this.ai() instanceof aub $$46) {
               this.f = this.a($$46, this.c.cV()) | this.a($$46, this.cv.cV()) | this.a($$46, this.cw.cV());
               if (this.cC != null) {
                  this.cC.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.cu.length; $$47++) {
               this.cu[$$47].X = $$25[$$47].d;
               this.cu[$$47].Y = $$25[$$47].e;
               this.cu[$$47].Z = $$25[$$47].f;
               this.cu[$$47].an = $$25[$$47].d;
               this.cu[$$47].ao = $$25[$$47].e;
               this.cu[$$47].ap = $$25[$$47].f;
            }
         }
      }
   }

   private void a(cpp $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dC() + $$1, this.dE() + $$2, this.dI() + $$3);
   }

   private float gF() {
      if (this.cE.a().a()) {
         return -1.0F;
      } else {
         cpq.a $$0 = this.b.a(5);
         cpq.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gG() {
      if (this.cl != null) {
         if (this.cl.dU()) {
            this.cl = null;
         } else if (this.as % 10 == 0 && this.eL() < this.fa()) {
            this.x(this.eL() + 1.0F);
         }
      }

      if (this.ar.a(10) == 0) {
         List<cpr> $$0 = this.ai().a(cpr.class, this.cV().g(32.0));
         cpr $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cpr $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cl = $$1;
      }
   }

   private void a(aub $$0, List<bzm> $$1) {
      double $$2 = (this.cw.cV().a + this.cw.cV().d) / 2.0;
      double $$3 = (this.cw.cV().c + this.cw.cV().f) / 2.0;

      for (bzm $$4 : $$1) {
         if ($$4 instanceof cam $$5) {
            double $$6 = $$4.dC() - $$2;
            double $$7 = $$4.dI() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.i($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cE.a().a() && $$5.ey() < $$4.as - 2) {
               byb $$9 = this.ea().b((cam)this);
               $$4.a($$0, $$9, 5.0F);
               djk.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(aub $$0, List<bzm> $$1) {
      for (bzm $$2 : $$1) {
         if ($$2 instanceof cam) {
            byb $$3 = this.ea().b((cam)this);
            $$2.a($$0, $$3, 10.0F);
            djk.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)bcb.d($$0);
   }

   private boolean a(aub $$0, fin $$1) {
      int $$2 = bcb.a($$1.a);
      int $$3 = bcb.a($$1.b);
      int $$4 = bcb.a($$1.c);
      int $$5 = bcb.a($$1.d);
      int $$6 = bcb.a($$1.e);
      int $$7 = bcb.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               jb $$13 = new jb($$10, $$11, $$12);
               eeb $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(azo.aJ)) {
                  if ($$0.P().c(dmq.d) && !$$14.a(azo.aI)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         jb $$15 = new jb($$2 + this.ar.a($$5 - $$2 + 1), $$3 + this.ar.a($$6 - $$3 + 1), $$4 + this.ar.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(aub $$0, cpp $$1, byb $$2, float $$3) {
      if (this.cE.a().h() == cqi.j) {
         return false;
      } else {
         $$3 = this.cE.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof cut || $$2.a(azp.y)) {
               float $$4 = this.eL();
               this.d($$0, $$2, $$3);
               if (this.eM() && !this.cE.a().a()) {
                  this.x(1.0F);
                  this.cE.a(cqi.j);
               }

               if (this.cE.a().a()) {
                  this.cG = this.cG + $$4 - this.eL();
                  if (this.cG > 0.25F * this.fa()) {
                     this.cG = 0.0F;
                     this.cE.a(cqi.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      return this.a($$0, this.cw, $$1, $$2);
   }

   protected void d(aub $$0, byb $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(aub $$0) {
      this.a(bzm.e.a);
      this.c(ejb.p);
      if (this.cC != null) {
         this.cC.b(this);
         this.cC.a(this);
      }
   }

   @Override
   protected void es() {
      if (this.cC != null) {
         this.cC.b(this);
      }

      this.cj++;
      if (this.cj >= 180 && this.cj <= 200) {
         float $$0 = (this.ar.i() - 0.5F) * 8.0F;
         float $$1 = (this.ar.i() - 0.5F) * 4.0F;
         float $$2 = (this.ar.i() - 0.5F) * 8.0F;
         this.ai().a(me.v, this.dC() + $$0, this.dE() + 2.0 + $$1, this.dI() + $$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.cC != null && !this.cC.f()) {
         $$3 = 12000;
      }

      if (this.ai() instanceof aub $$4) {
         if (this.cj > 150 && this.cj % 5 == 0 && $$4.P().c(dmq.g)) {
            caa.a($$4, this.dv(), bcb.d($$3 * 0.08F));
         }

         if (this.cj == 1 && !this.be()) {
            $$4.b(1028, this.dx(), 0);
         }
      }

      fis $$5 = new fis(0.0, 0.1F, 0.0);
      this.a(caq.a, $$5);

      for (cpp $$6 : this.cu) {
         $$6.bC();
         $$6.b($$6.dv().e($$5));
      }

      if (this.cj == 200 && this.ai() instanceof aub $$7) {
         if ($$7.P().c(dmq.g)) {
            caa.a($$7, this.dv(), bcb.d($$3 * 0.2F));
         }

         if (this.cC != null) {
            this.cC.a(this);
         }

         this.a(bzm.e.a);
         this.c(ejb.p);
      }
   }

   public int n() {
      if (this.cH[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = bcb.d(60.0F * bcb.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * $$0)));
               $$4 = bcb.d(60.0F * bcb.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * $$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = bcb.d(40.0F * bcb.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * $$2)));
               $$4 = bcb.d(40.0F * bcb.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * $$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = bcb.d(20.0F * bcb.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * var7)));
               $$4 = bcb.d(20.0F * bcb.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * var7)));
            }

            int $$9 = Math.max(73, this.ai().a(eka.a.f, new jb($$3, 0, $$4)).v() + $$1);
            this.cH[$$0] = new fax($$3, $$9, $$4);
         }

         this.cI[0] = 6146;
         this.cI[1] = 8197;
         this.cI[2] = 8202;
         this.cI[3] = 16404;
         this.cI[4] = 32808;
         this.cI[5] = 32848;
         this.cI[6] = 65696;
         this.cI[7] = 131392;
         this.cI[8] = 131712;
         this.cI[9] = 263424;
         this.cI[10] = 526848;
         this.cI[11] = 525313;
         this.cI[12] = 1581057;
         this.cI[13] = 3166214;
         this.cI[14] = 2138120;
         this.cI[15] = 6373424;
         this.cI[16] = 4358208;
         this.cI[17] = 12910976;
         this.cI[18] = 9044480;
         this.cI[19] = 9706496;
         this.cI[20] = 15216640;
         this.cI[21] = 13688832;
         this.cI[22] = 11763712;
         this.cI[23] = 8257536;
      }

      return this.q(this.dC(), this.dE(), this.dI());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      fax $$5 = new fax(bcb.a($$0), bcb.a($$1), bcb.a($$2));
      int $$6 = 0;
      if (this.cC == null || this.cC.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cH[$$7] != null) {
            float $$8 = this.cH[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public faz a(int $$0, int $$1, @Nullable fax $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         fax $$4 = this.cH[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      fax $$5 = this.cH[$$0];
      fax $$6 = this.cH[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cJ.a();
      this.cJ.a($$5);
      fax $$7 = $$5;
      int $$8 = 0;
      if (this.cC == null || this.cC.e() == 0) {
         $$8 = 12;
      }

      while (!this.cJ.e()) {
         fax $$9 = this.cJ.c();
         if ($$9.equals($$6)) {
            if ($$2 != null) {
               $$2.h = $$6;
               $$6 = $$2;
            }

            return this.a($$5, $$6);
         }

         if ($$9.a($$6) < $$7.a($$6)) {
            $$7 = $$9;
         }

         $$9.i = true;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 24; $$11++) {
            if (this.cH[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cI[$$10] & 1 << $$12) > 0) {
               fax $$13 = this.cH[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cJ.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cJ.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         cm.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private faz a(fax $$0, fax $$1) {
      List<fax> $$2 = Lists.newArrayList();
      fax $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new faz($$2, new jb($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("DragonPhase", this.cE.a().h().b());
      $$0.a("DragonDeathTime", this.cj);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      $$0.e("DragonPhase").ifPresent($$0x -> this.cE.a(cqi.a($$0x)));
      this.cj = $$0.a("DragonDeathTime", 0);
   }

   @Override
   public void dJ() {
   }

   public cpp[] t() {
      return this.cu;
   }

   @Override
   public boolean bK() {
      return false;
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected ayy p() {
      return ayz.iH;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.iM;
   }

   @Override
   protected float fk() {
      return 5.0F;
   }

   public fis J(float $$0) {
      cqc $$1 = this.cE.a();
      cqi<? extends cqc> $$2 = $$1.h();
      fis $$8;
      if ($$2 == cqi.d || $$2 == cqi.e) {
         jb $$3 = this.ai().a(eka.a.f, enf.a(this.cD));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dv())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dR();
         float $$7 = 1.5F;
         this.w(-$$5 * 1.5F * 5.0F);
         $$8 = this.h($$0);
         this.w($$6);
      } else if ($$1.a()) {
         float $$9 = this.dR();
         float $$10 = 1.5F;
         this.w(-45.0F);
         $$8 = this.h($$0);
         this.w($$9);
      } else {
         $$8 = this.h($$0);
      }

      return $$8;
   }

   public void a(aub $$0, cpr $$1, jb $$2, byb $$3) {
      cut $$5;
      if ($$3.d() instanceof cut $$4) {
         $$5 = $$4;
      } else {
         $$5 = $$0.a(cn, $$2.u(), $$2.v(), $$2.w());
      }

      if ($$1 == this.cl) {
         this.a($$0, this.c, this.ea().d($$1, $$5), 10.0F);
      }

      this.cE.a().a($$1, $$2, $$3, $$5);
   }

   @Override
   public void a(alh<?> $$0) {
      if (a.equals($$0) && this.ai().C) {
         this.cE.a(cqi.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public cqj gD() {
      return this.cE;
   }

   @Nullable
   public eib gE() {
      return this.cC;
   }

   @Override
   public boolean b(byq $$0, @Nullable bzm $$1) {
      return false;
   }

   @Override
   protected boolean p(bzm $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      cpp[] $$1 = this.t();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(cam $$0) {
      return $$0.eE();
   }

   @Override
   protected float c(float $$0) {
      return 1.0F;
   }
}
