import com.google.common.collect.UnmodifiableIterator;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;

public abstract class coq extends cmd implements cac, cat, caw {
   public static final int cv = 499;
   public static final int cw = 500;
   public static final double cx = 0.15;
   private static final float ck = (float)b(() -> 0.0);
   private static final float cl = (float)b(() -> 1.0);
   private static final float cm = (float)a(() -> 0.0);
   private static final float co = (float)a(() -> 1.0);
   private static final float cp = a($$0 -> 0);
   private static final float cq = a($$0 -> $$0 - 1);
   private static final float cr = 0.25F;
   private static final float cs = 0.5F;
   private static final clc.a ct = ($$0, $$1) -> $$0 instanceof coq $$2 && $$2.hc();
   private static final clc cu = clc.b().a(16.0).d().a(ct);
   private static final alh<Byte> cH = all.a(coq.class, alj.a);
   private static final int cI = 2;
   private static final int cJ = 8;
   private static final int cM = 16;
   private static final int cN = 32;
   private static final int cO = 64;
   public static final int cy = 3;
   private static final int cP = 0;
   private static final boolean cQ = false;
   private static final boolean cR = false;
   private static final boolean cS = false;
   private int cT;
   private int cU;
   private int cV;
   public int cz;
   public int cA;
   protected bxr cB;
   protected int cC = 0;
   protected float cD;
   protected boolean cE;
   private float cW;
   private float cX;
   private float cY;
   private float cZ;
   private float da;
   private float db;
   protected boolean cF = true;
   protected int cG;
   @Nullable
   private bzs<cam> dc;

   protected coq(bzv<? extends coq> $$0, dmu $$1) {
      super($$0, $$1);
      this.hf();
   }

   @Override
   protected void H() {
      this.ch.a(1, new cib(this, 1.2));
      this.ch.a(1, new cim(this, 1.2));
      this.ch.a(2, new cgu(this, 1.0, coq.class));
      this.ch.a(4, new chh(this, 1.0));
      this.ch.a(6, new civ(this, 0.7));
      this.ch.a(7, new chq(this, cut.class, 6.0F));
      this.ch.a(8, new cid(this));
      if (this.gI()) {
         this.ch.a(9, new cie(this));
      }

      this.gZ();
   }

   protected void gZ() {
      this.ch.a(0, new chc(this));
      this.ch.a(3, new ciq(this, 1.25, $$0 -> $$0.a(azx.aC), false));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cH, (byte)0);
   }

   protected boolean s(int $$0) {
      return (this.ay.a(cH) & $$0) != 0;
   }

   protected void d(int $$0, boolean $$1) {
      byte $$2 = this.ay.a(cH);
      if ($$1) {
         this.ay.a(cH, (byte)($$2 | $$0));
      } else {
         this.ay.a(cH, (byte)($$2 & ~$$0));
      }
   }

   public boolean gY() {
      return this.s(2);
   }

   @Nullable
   @Override
   public bzs<cam> d() {
      return this.dc;
   }

   public void j(@Nullable cam $$0) {
      this.dc = $$0 != null ? new bzs<>($$0) : null;
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
   }

   @Override
   public void z() {
      super.z();
      if (this.ha()) {
         this.A(false);
      }
   }

   @Override
   public boolean D() {
      return true;
   }

   @Override
   public fis[] E() {
      return cak.a(this, 0.04, 0.52, 0.23, 0.87);
   }

   public boolean ha() {
      return this.s(16);
   }

   public boolean hb() {
      return this.s(32);
   }

   public boolean hc() {
      return this.s(8);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   @Override
   public boolean e(bzw $$0) {
      return $$0 != bzw.h ? super.e($$0) : this.bO() && !this.g_() && this.gY();
   }

   public void b(cut $$0, dcv $$1) {
      if (this.a($$1, bzw.g)) {
         this.h($$1.b(1, $$0));
      }
   }

   @Override
   protected boolean f(bzw $$0) {
      return ($$0 == bzw.g || $$0 == bzw.h) && this.gY() || super.f($$0);
   }

   public int hd() {
      return this.cC;
   }

   public void t(int $$0) {
      this.cC = $$0;
   }

   public int u(int $$0) {
      int $$1 = bcb.a(this.hd() + $$0, 0, this.hi());
      this.t($$1);
      return $$1;
   }

   @Override
   public boolean bL() {
      return !this.cd();
   }

   private void m() {
      this.t();
      if (!this.be()) {
         ayy $$0 = this.gJ();
         if ($$0 != null) {
            this.ai().a(null, this.dC(), this.dE(), this.dI(), $$0, this.do(), 1.0F, 1.0F + (this.ar.i() - this.ar.i()) * 0.2F);
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      if ($$0 > 1.0) {
         this.a(ayz.nN, 0.4F, 1.0F);
      }

      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         this.a($$2, $$3);
         this.b($$0, $$1, $$2);
         this.eW();
         return true;
      }
   }

   public final int he() {
      return v(this.ac_());
   }

   public static int v(int $$0) {
      return $$0 * 3;
   }

   protected void hf() {
      bxr $$0 = this.cB;
      this.cB = new bxr(this.he());
      if ($$0 != null) {
         int $$1 = Math.min($$0.b(), this.cB.b());

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            dcv $$3 = $$0.a($$2);
            if (!$$3.f()) {
               this.cB.a($$2, $$3.v());
            }
         }
      }
   }

   @Override
   protected jl<ayy> a(bzw $$0, dcv $$1, dle $$2) {
      return (jl<ayy>)($$0 == bzw.h ? ayz.nO : super.a($$0, $$1, $$2));
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && this.ar.a(3) == 0) {
         this.hm();
      }

      return $$3;
   }

   protected boolean gI() {
      return true;
   }

   @Nullable
   protected ayy gJ() {
      return null;
   }

   @Nullable
   protected ayy hg() {
      return null;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      if (!$$1.n()) {
         eeb $$2 = this.ai().a_($$0.d());
         dxx $$3 = $$1.A();
         if ($$2.a(dqb.ed)) {
            $$3 = $$2.A();
         }

         if (this.cd() && this.cF) {
            this.cG++;
            if (this.cG > 5 && this.cG % 3 == 0) {
               this.a($$3);
            } else if (this.cG <= 5) {
               this.a(ayz.nQ, $$3.a() * 0.15F, $$3.b());
            }
         } else if (this.b($$3)) {
            this.a(ayz.nQ, $$3.a() * 0.15F, $$3.b());
         } else {
            this.a(ayz.nP, $$3.a() * 0.15F, $$3.b());
         }
      }
   }

   private boolean b(dxx $$0) {
      return $$0 == dxx.b || $$0 == dxx.aV || $$0 == dxx.B || $$0 == dxx.aW || $$0 == dxx.aU;
   }

   protected void a(dxx $$0) {
      this.a(ayz.nK, $$0.a() * 0.15F, $$0.b());
   }

   public static cbr.a hh() {
      return cmd.gM().a(cbs.p, 0.7).a(cbs.t, 53.0).a(cbs.w, 0.225F).a(cbs.C, 1.0).a(cbs.y, 6.0).a(cbs.l, 0.5);
   }

   @Override
   public int gk() {
      return 6;
   }

   public int hi() {
      return 100;
   }

   @Override
   protected float fk() {
      return 0.8F;
   }

   @Override
   public int W() {
      return 400;
   }

   @Override
   public void b(cut $$0) {
      if (!this.ai().C && (!this.cd() || this.z($$0)) && this.gY()) {
         $$0.a(this, this.cB);
      }
   }

   public bxj c(cut $$0, dcv $$1) {
      boolean $$2 = this.a($$0, $$1);
      if ($$2) {
         $$1.a(1, $$0);
      }

      return (bxj)(!$$2 && !this.ai().C ? bxj.e : bxj.b);
   }

   protected boolean a(cut $$0, dcv $$1) {
      boolean $$2 = false;
      float $$3 = 0.0F;
      int $$4 = 0;
      int $$5 = 0;
      if ($$1.a(dcz.qB)) {
         $$3 = 2.0F;
         $$4 = 20;
         $$5 = 3;
      } else if ($$1.a(dcz.sZ)) {
         $$3 = 1.0F;
         $$4 = 30;
         $$5 = 3;
      } else if ($$1.a(dqb.iL.h())) {
         $$3 = 20.0F;
         $$4 = 180;
      } else if ($$1.a(dcz.pz)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(dcz.vH)) {
         $$3 = 3.0F;
         $$4 = 60;
         $$5 = 3;
      } else if ($$1.a(dcz.vM)) {
         $$3 = 4.0F;
         $$4 = 60;
         $$5 = 5;
         if (!this.ai().C && this.gY() && this.Z_() == 0 && !this.gR()) {
            $$2 = true;
            this.h($$0);
         }
      } else if ($$1.a(dcz.rf) || $$1.a(dcz.rg)) {
         $$3 = 10.0F;
         $$4 = 240;
         $$5 = 10;
         if (!this.ai().C && this.gY() && this.Z_() == 0 && !this.gR()) {
            $$2 = true;
            this.h($$0);
         }
      }

      if (this.eL() < this.fa() && $$3 > 0.0F) {
         this.d($$3);
         $$2 = true;
      }

      if (this.g_() && $$4 > 0) {
         this.ai().a(me.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.ai().C) {
            this.b_($$4);
            $$2 = true;
         }
      }

      if ($$5 > 0 && ($$2 || !this.gY()) && this.hd() < this.hi() && !this.ai().C) {
         this.u($$5);
         $$2 = true;
      }

      if ($$2) {
         this.m();
         this.c(ejb.m);
      }

      return $$2;
   }

   protected void g(cut $$0) {
      this.A(false);
      this.hk();
      if (!this.ai().C) {
         $$0.v(this.dP());
         $$0.w(this.dR());
         $$0.o(this);
      }
   }

   @Override
   public boolean fm() {
      return super.fm() && this.cd() && this.gm() || this.ha() || this.hb();
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aB);
   }

   private void n() {
      this.cz = 1;
   }

   @Override
   protected void f(aub $$0) {
      super.f($$0);
      if (this.cB != null) {
         for (int $$1 = 0; $$1 < this.cB.b(); $$1++) {
            dcv $$2 = this.cB.a($$1);
            if (!$$2.f() && !djk.a($$2, djj.D)) {
               this.a($$0, $$2);
            }
         }
      }
   }

   @Override
   public void e_() {
      if (this.ar.a(200) == 0) {
         this.n();
      }

      super.e_();
      if (this.ai() instanceof aub $$0 && this.bO()) {
         if (this.ar.a(900) == 0 && this.bl == 0) {
            this.d(1.0F);
         }

         if (this.hj()) {
            if (!this.ha() && !this.cd() && this.ar.a(300) == 0 && $$0.a_(this.dx().e()).a(dqb.i)) {
               this.A(true);
            }

            if (this.ha() && ++this.cT > 50) {
               this.cT = 0;
               this.A(false);
            }
         }

         this.g($$0);
      }
   }

   protected void g(aub $$0) {
      if (this.hc() && this.g_() && !this.ha()) {
         cam $$1 = $$0.a(coq.class, cu, this, this.dC(), this.dE(), this.dI(), this.cV().g(16.0));
         if ($$1 != null && this.g($$1) > 4.0) {
            this.cg.a($$1, 0);
         }
      }
   }

   public boolean hj() {
      return true;
   }

   @Override
   public void g() {
      super.g();
      if (this.cU > 0 && ++this.cU > 30) {
         this.cU = 0;
         this.d(64, false);
      }

      if (this.cV > 0 && --this.cV <= 0) {
         this.hk();
      }

      if (this.cz > 0 && ++this.cz > 8) {
         this.cz = 0;
      }

      if (this.cA > 0) {
         this.cA++;
         if (this.cA > 300) {
            this.cA = 0;
         }
      }

      this.cX = this.cW;
      if (this.ha()) {
         this.cW = this.cW + ((1.0F - this.cW) * 0.4F + 0.05F);
         if (this.cW > 1.0F) {
            this.cW = 1.0F;
         }
      } else {
         this.cW = this.cW + ((0.0F - this.cW) * 0.4F - 0.05F);
         if (this.cW < 0.0F) {
            this.cW = 0.0F;
         }
      }

      this.cZ = this.cY;
      if (this.hb()) {
         this.cW = 0.0F;
         this.cX = this.cW;
         this.cY = this.cY + ((1.0F - this.cY) * 0.4F + 0.05F);
         if (this.cY > 1.0F) {
            this.cY = 1.0F;
         }
      } else {
         this.cE = false;
         this.cY = this.cY + ((0.8F * this.cY * this.cY * this.cY - this.cY) * 0.6F - 0.05F);
         if (this.cY < 0.0F) {
            this.cY = 0.0F;
         }
      }

      this.db = this.da;
      if (this.s(64)) {
         this.da = this.da + ((1.0F - this.da) * 0.7F + 0.05F);
         if (this.da > 1.0F) {
            this.da = 1.0F;
         }
      } else {
         this.da = this.da + ((0.0F - this.da) * 0.7F - 0.05F);
         if (this.da < 0.0F) {
            this.da = 0.0F;
         }
      }
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      if (this.cd() || this.g_()) {
         return super.b($$0, $$1);
      } else if (this.gY() && $$0.gh()) {
         this.b($$0);
         return bxj.a;
      } else {
         dcv $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bxj $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }

            if (this.a($$2, bzw.g) && !this.gn()) {
               this.b($$0, $$2);
               return bxj.a;
            }
         }

         this.g($$0);
         return bxj.a;
      }
   }

   private void t() {
      if (!this.ai().C) {
         this.cU = 1;
         this.d(64, true);
      }
   }

   public void A(boolean $$0) {
      this.d(16, $$0);
   }

   public void w(int $$0) {
      this.A(false);
      this.d(32, true);
      this.cV = $$0;
   }

   public void hk() {
      this.d(32, false);
      this.cV = 0;
   }

   @Nullable
   public ayy hl() {
      return this.p();
   }

   public void hm() {
      if (this.gI() && (this.dl() || !this.ai().C)) {
         this.w(20);
      }
   }

   public void hn() {
      if (!this.hb() && !this.ai().C) {
         this.hm();
         this.b(this.hg());
      }
   }

   public boolean i(cut $$0) {
      this.j($$0);
      this.y(true);
      if ($$0 instanceof auc) {
         aq.y.a((auc)$$0, this);
      }

      this.ai().a(this, (byte)7);
      return true;
   }

   @Override
   protected void a(cut $$0, fis $$1) {
      super.a($$0, $$1);
      fir $$2 = this.i((cam)$$0);
      this.b($$2.k, $$2.j);
      this.aa = this.br = this.bt = this.dP();
      if (this.di()) {
         if ($$1.f <= 0.0) {
            this.cG = 0;
         }

         if (this.aK()) {
            if (this.cD > 0.0F && !this.fy()) {
               this.b(this.cD, $$1);
            }

            this.cD = 0.0F;
         }
      }
   }

   protected fir i(cam $$0) {
      return new fir($$0.dR() * 0.5F, $$0.dP());
   }

   @Override
   protected fis b(cut $$0, fis $$1) {
      if (this.aK() && this.cD == 0.0F && this.hb() && !this.cE) {
         return fis.c;
      } else {
         float $$2 = $$0.bC * 0.5F;
         float $$3 = $$0.bE;
         if ($$3 <= 0.0F) {
            $$3 *= 0.25F;
         }

         return new fis($$2, 0.0, $$3);
      }
   }

   @Override
   protected float c(cut $$0) {
      return (float)this.i(cbs.w);
   }

   protected void b(float $$0, fis $$1) {
      double $$2 = this.z($$0);
      fis $$3 = this.dA();
      this.n($$3.d, $$2, $$3.f);
      this.aE = true;
      if ($$1.f > 0.0) {
         float $$4 = bcb.a(this.dP() * (float) (Math.PI / 180.0));
         float $$5 = bcb.b(this.dP() * (float) (Math.PI / 180.0));
         this.i(this.dA().b(-0.4F * $$4 * $$0, 0.0, 0.4F * $$5 * $$0));
      }
   }

   protected void ho() {
      this.a(ayz.nM, 0.4F, 1.0F);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("EatingHaystack", this.ha());
      $$0.a("Bred", this.hc());
      $$0.a("Temper", this.hd());
      $$0.a("Tame", this.gY());
      bzs.a(this.dc, $$0, "Owner");
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.A($$0.a("EatingHaystack", false));
      this.z($$0.a("Bred", false));
      this.t($$0.a("Temper", 0));
      this.y($$0.a("Tame", false));
      this.dc = bzs.a($$0, "Owner", this.ai());
   }

   @Override
   public boolean a(cmd $$0) {
      return false;
   }

   protected boolean hp() {
      return !this.cd() && !this.cc() && this.gY() && !this.g_() && this.eL() >= this.fa() && this.gR();
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return null;
   }

   protected void a(bzc $$0, coq $$1) {
      this.a($$0, $$1, cbs.t, cp, cq);
      this.a($$0, $$1, cbs.p, cm, co);
      this.a($$0, $$1, cbs.w, ck, cl);
   }

   private void a(bzc $$0, coq $$1, jl<cbn> $$2, double $$3, double $$4) {
      double $$5 = a(this.j($$2), $$0.j($$2), $$3, $$4, this.ar);
      $$1.h($$2).a($$5);
   }

   static double a(double $$0, double $$1, double $$2, double $$3, bck $$4) {
      if ($$3 <= $$2) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         $$0 = bcb.a($$0, $$2, $$3);
         $$1 = bcb.a($$1, $$2, $$3);
         double $$5 = 0.15 * ($$3 - $$2);
         double $$6 = Math.abs($$0 - $$1) + $$5 * 2.0;
         double $$7 = ($$0 + $$1) / 2.0;
         double $$8 = ($$4.j() + $$4.j() + $$4.j()) / 3.0 - 0.5;
         double $$9 = $$7 + $$6 * $$8;
         if ($$9 > $$3) {
            double $$10 = $$9 - $$3;
            return $$3 - $$10;
         } else if ($$9 < $$2) {
            double $$11 = $$2 - $$9;
            return $$2 + $$11;
         } else {
            return $$9;
         }
      }
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cX, this.cW);
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cZ, this.cY);
   }

   public float L(float $$0) {
      return bcb.h($$0, this.db, this.da);
   }

   @Override
   public void b(int $$0) {
      if (this.gm()) {
         if ($$0 < 0) {
            $$0 = 0;
         } else {
            this.cE = true;
            this.hm();
         }

         if ($$0 >= 90) {
            this.cD = 1.0F;
         } else {
            this.cD = 0.4F + 0.4F * $$0 / 90.0F;
         }
      }
   }

   @Override
   public boolean a() {
      return this.gm();
   }

   @Override
   public void c(int $$0) {
      this.cE = true;
      this.hm();
      this.ho();
   }

   @Override
   public void b() {
   }

   protected void B(boolean $$0) {
      mc $$1 = $$0 ? me.S : me.ah;

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ar.k() * 0.02;
         double $$4 = this.ar.k() * 0.02;
         double $$5 = this.ar.k() * 0.02;
         this.ai().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.B(true);
      } else if ($$0 == 6) {
         this.B(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void a(bzm $$0, bzm.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof cam) {
         ((cam)$$0).br = this.br;
      }
   }

   protected static float a(IntUnaryOperator $$0) {
      return 15.0F + $$0.applyAsInt(8) + $$0.applyAsInt(9);
   }

   protected static double a(DoubleSupplier $$0) {
      return 0.4F + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2;
   }

   protected static double b(DoubleSupplier $$0) {
      return (0.45F + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean eV() {
      return false;
   }

   @Override
   public cbd a_(int $$0) {
      int $$1 = $$0 - 500;
      return $$1 >= 0 && $$1 < this.cB.b() ? cbd.a(this.cB, $$1) : super.a_($$0);
   }

   @Nullable
   @Override
   public cam cY() {
      return (cam)(this.gm() && this.db() instanceof cut $$0 ? $$0 : super.cY());
   }

   @Nullable
   private fis a(fis $$0, cam $$1) {
      double $$2 = this.dC() + $$0.d;
      double $$3 = this.cV().b;
      double $$4 = this.dI() + $$0.f;
      jb.a $$5 = new jb.a();
      UnmodifiableIterator var10 = $$1.fV().iterator();

      while (var10.hasNext()) {
         cay $$6 = (cay)var10.next();
         $$5.b($$2, $$3, $$4);
         double $$7 = this.cV().e + 0.75;

         do {
            double $$8 = this.ai().j($$5);
            if ($$5.v() + $$8 > $$7) {
               break;
            }

            if (cxm.a($$8)) {
               fin $$9 = $$1.f($$6);
               fis $$10 = new fis($$2, $$5.v() + $$8, $$4);
               if (cxm.a(this.ai(), $$1, $$9.c($$10))) {
                  $$1.b($$6);
                  return $$10;
               }
            }

            $$5.c(jh.b);
         } while (!($$5.v() < $$7));
      }

      return null;
   }

   @Override
   public fis b(cam $$0) {
      fis $$1 = a(this.ds(), $$0.ds(), this.dP() + ($$0.fF() == cad.b ? 90.0F : -90.0F));
      fis $$2 = this.a($$1, $$0);
      if ($$2 != null) {
         return $$2;
      } else {
         fis $$3 = a(this.ds(), $$0.ds(), this.dP() + ($$0.fF() == cad.a ? 90.0F : -90.0F));
         fis $$4 = this.a($$3, $$0);
         return $$4 != null ? $$4 : this.dv();
      }
   }

   protected void a(bck $$0) {
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$3 == null) {
         $$3 = new bzc.a(0.2F);
      }

      this.a($$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public boolean a(bxc $$0) {
      return this.cB != $$0;
   }

   public int hq() {
      return this.W();
   }

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      return super.a($$0, $$1, $$2).e(new fis(0.0, 0.15 * this.cZ * $$2, -0.7 * this.cZ * $$2).b(-this.dP() * (float) (Math.PI / 180.0)));
   }

   public int ac_() {
      return 0;
   }
}
