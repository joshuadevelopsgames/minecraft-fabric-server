import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gwi extends gwf {
   public static final Logger h = LogUtils.getLogger();
   private static final int cV = 20;
   private static final int cW = 600;
   private static final int cX = 100;
   private static final float cY = 0.6F;
   private static final double cZ = 0.35;
   private static final double da = 0.13962634F;
   public static final float i = 0.2F;
   public final grl j;
   private final azk db;
   private final ftp dc;
   private final bde dd = new bde(20, 1280);
   private final List<hva> de = Lists.newArrayList();
   private int df = 0;
   private double dg;
   private double dh;
   private double di;
   private float dj;
   private float dk;
   private boolean dl;
   private boolean dm;
   private boolean dn;
   private boolean do;
   private int dp;
   private boolean dq;
   public gwg k = new gwg();
   private cur dr;
   protected final fue cM;
   protected int cN;
   public int cO;
   public float cP;
   public float cQ;
   public float cR;
   public float cS;
   private int ds;
   private float dt;
   public float cT;
   public float cU;
   private boolean du;
   @Nullable
   private bxi dv;
   private boolean dw;
   private boolean dx = true;
   private int dy;
   private boolean dz;
   private int dA;
   private boolean dB = true;
   private boolean dC = false;

   public gwi(fue $$0, grk $$1, grl $$2, azk $$3, ftp $$4, cur $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cM = $$0;
      this.j = $$2;
      this.db = $$3;
      this.dc = $$4;
      this.dr = $$5;
      this.do = $$6;
      this.de.add(new hvt(this, $$0.al()));
      this.de.add(new hvf(this));
      this.de.add(new hve(this, $$0.al(), $$1.I_()));
   }

   @Override
   public void d(float $$0) {
   }

   @Override
   public boolean a(bzm $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cxg) {
            this.cM.al().a((hvr)(new hvl(this, (cxg)$$0, true)));
            this.cM.al().a((hvr)(new hvl(this, (cxg)$$0, false)));
         } else if ($$0 instanceof cmt) {
            this.cM.al().a((hvr)(new hvk(this, (cmt)$$0)));
         }

         return true;
      }
   }

   @Override
   public void ab() {
      super.ab();
      this.dw = false;
   }

   @Override
   public float i(float $$0) {
      return this.dR();
   }

   @Override
   public float j(float $$0) {
      return this.cc() ? super.j($$0) : this.dP();
   }

   @Override
   public void g() {
      this.gU();
      if (this.gT()) {
         this.dd.b();
         super.g();
         if (!this.dr.equals(this.k.a)) {
            this.j.b(new aiv(this.k.a));
            this.dr = this.k.a;
         }

         if (this.cc()) {
            this.j.b(new aim.c(this.dP(), this.dR(), this.aK(), this.ac));
            bzm $$0 = this.dh();
            if ($$0 != this && $$0.di()) {
               this.j.b(ain.a($$0));
               this.J();
            }
         } else {
            this.I();
         }

         for (hva $$1 : this.de) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (hva $$0 : this.de) {
         if ($$0 instanceof hve) {
            return ((hve)$$0).b();
         }
      }

      return 0.0F;
   }

   private void I() {
      this.J();
      if (this.z()) {
         double $$0 = this.dC() - this.dg;
         double $$1 = this.dE() - this.dh;
         double $$2 = this.dI() - this.di;
         double $$3 = this.dP() - this.dj;
         double $$4 = this.dR() - this.dk;
         this.dp++;
         boolean $$5 = bcb.f($$0, $$1, $$2) > bcb.k(2.0E-4) || this.dp >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new aim.b(this.dv(), this.dP(), this.dR(), this.aK(), this.ac));
         } else if ($$5) {
            this.j.b(new aim.a(this.dv(), this.aK(), this.ac));
         } else if ($$6) {
            this.j.b(new aim.c(this.dP(), this.dR(), this.aK(), this.ac));
         } else if (this.dl != this.aK() || this.dm != this.ac) {
            this.j.b(new aim.d(this.aK(), this.ac));
         }

         if ($$5) {
            this.dg = this.dC();
            this.dh = this.dE();
            this.di = this.dI();
            this.dp = 0;
         }

         if ($$6) {
            this.dj = this.dP();
            this.dk = this.dR();
         }

         this.dl = this.aK();
         this.dm = this.ac;
         this.dx = this.cM.n.K().c();
      }
   }

   private void J() {
      boolean $$0 = this.cm();
      if ($$0 != this.do) {
         aiu.a $$1 = $$0 ? aiu.a.b : aiu.a.c;
         this.j.b(new aiu(this, $$1));
         this.do = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ait.a $$1 = $$0 ? ait.a.d : ait.a.e;
      dcv $$2 = this.gs().a($$0);
      this.j.b(new ait($$1, jb.c, jh.a));
      return !$$2.f();
   }

   @Override
   public void a(bxi $$0) {
      super.a($$0);
      this.j.b(new ajm($$0));
   }

   @Override
   public void gp() {
      this.j.b(new ahy(ahy.a.a));
      fuc.c();
   }

   @Override
   public void p() {
      this.j.b(new aie(this.cn.l));
      this.e();
   }

   public void e() {
      super.p();
      this.cM.a(null);
   }

   public void I(float $$0) {
      if (this.dq) {
         float $$1 = this.eL() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.aw = 10;
            }
         } else {
            this.bA = $$1;
            this.aw = 20;
            this.x($$0);
            this.bk = 10;
            this.bj = this.bk;
         }
      } else {
         this.x($$0);
         this.dq = true;
      }
   }

   @Override
   public void x() {
      this.j.b(new ais(this.gt()));
   }

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public boolean fP() {
      return !this.gt().b && super.fP();
   }

   @Override
   public boolean by() {
      return !this.gt().b && super.by();
   }

   protected void h() {
      this.j.b(new aiu(this, aiu.a.d, bcb.d(this.v() * 100.0F)));
   }

   public void k() {
      this.j.b(new aiu(this, aiu.a.f));
   }

   public azk l() {
      return this.db;
   }

   public ftp m() {
      return this.dc;
   }

   public void a(diu $$0) {
      if (this.dc.b($$0)) {
         this.dc.c($$0);
         this.j.b(new aiy($$0));
      }
   }

   @Override
   public int G() {
      return this.df;
   }

   public void a(int $$0) {
      this.df = $$0;
   }

   @Override
   public void a(xo $$0, boolean $$1) {
      this.cM.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jb $$2 = jb.a($$0, this.dE(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - $$2.u();
         double $$4 = $$1 - $$2.w();
         jh $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jh[] $$7 = new jh[]{jh.e, jh.f, jh.c, jh.d};

         for (jh $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jh.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            fis $$11 = this.dA();
            if ($$5.o() == jh.a.a) {
               this.n(0.1 * $$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * $$5.l());
            }
         }
      }
   }

   private boolean c(jb $$0) {
      fin $$1 = this.cV();
      fin $$2 = new fin($$0.u(), $$1.b, $$0.w(), $$0.u() + 1.0, $$1.e, $$0.w() + 1.0).h(1.0E-7);
      return this.ai().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cD = $$0;
      this.cC = $$1;
      this.cB = $$2;
      this.cO = this.as;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 >= 24 && $$0 <= 28) {
         this.a($$0 - 24);
      } else {
         super.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.dB = $$0;
   }

   public boolean n() {
      return this.dB;
   }

   public void y(boolean $$0) {
      this.dC = $$0;
   }

   public boolean t() {
      return this.dC;
   }

   @Override
   public void a(ayy $$0, float $$1, float $$2) {
      this.ai().a(this.dC(), this.dE(), this.dI(), $$0, this.do(), $$1, $$2, false);
   }

   @Override
   public void a(ayy $$0, aza $$1, float $$2, float $$3) {
      this.ai().a(this.dC(), this.dE(), this.dI(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public void c(bxi $$0) {
      dcv $$1 = this.b($$0);
      if (!$$1.f() && !this.fG()) {
         super.c($$0);
         this.du = true;
         this.dv = $$0;
      }
   }

   @Override
   public boolean fG() {
      return this.du;
   }

   @Override
   public void fM() {
      super.fM();
      this.du = false;
   }

   @Override
   public bxi fH() {
      return Objects.requireNonNullElse(this.dv, bxi.a);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (aZ.equals($$0)) {
         boolean $$1 = (this.ay.a(aZ) & 1) > 0;
         bxi $$2 = (this.ay.a(aZ) & 2) > 0 ? bxi.b : bxi.a;
         if ($$1 && !this.du) {
            this.c($$2);
         } else if (!$$1 && this.du) {
            this.fM();
         }
      }

      if (az.equals($$0) && this.fQ() && !this.dz) {
         this.cM.al().a((hvr)(new hvg(this)));
      }
   }

   @Nullable
   public caw u() {
      return this.dn() instanceof caw $$0 && $$0.a() ? $$0 : null;
   }

   public float v() {
      return this.dt;
   }

   @Override
   public boolean X() {
      return this.cM.aU();
   }

   @Override
   public void a(ecn $$0, boolean $$1) {
      if ($$0 instanceof eca $$2) {
         this.cM.a(new ggy($$2, $$1, this.cM.aU()));
      } else {
         this.cM.a(new ghl($$0, $$1, this.cM.aU()));
      }
   }

   @Override
   public void a(dlt $$0) {
      this.cM.a(new ghi($$0));
   }

   @Override
   public void a(ebk $$0) {
      this.cM.a(new ggl($$0));
   }

   @Override
   public void a(ecs $$0) {
      this.cM.a(new ghp($$0));
   }

   @Override
   public void a(ect $$0) {
      this.cM.a(new ghq($$0));
   }

   @Override
   public void a(ecu $$0) {
      this.cM.a(new ghr($$0));
   }

   @Override
   public void a(ecd $$0) {
      this.cM.a(new ghd($$0));
   }

   @Override
   public void b(jl<art> $$0) {
      this.j.a($$0, this.cM.z);
   }

   @Override
   public void a(dcv $$0, bxi $$1) {
      dge $$2 = $$0.a(kq.U);
      if ($$2 != null) {
         this.cM.a(new ggg(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bzm $$0) {
      this.cM.g.a($$0, me.f);
   }

   @Override
   public void c(bzm $$0) {
      this.cM.g.a($$0, me.r);
   }

   @Override
   public boolean cg() {
      return this.k.a.f();
   }

   @Override
   public boolean cl() {
      return this.dn;
   }

   public boolean y() {
      return this.cl() || this.cp();
   }

   @Override
   public void fw() {
      if (this.z()) {
         fir $$0 = this.a(this.k.b());
         this.bC = $$0.j;
         this.bE = $$0.k;
         this.bB = this.k.a.e();
         this.cR = this.cP;
         this.cS = this.cQ;
         this.cQ = this.cQ + (this.dR() - this.cQ) * 0.5F;
         this.cP = this.cP + (this.dP() - this.cP) * 0.5F;
      } else {
         super.fw();
      }
   }

   private fir a(fir $$0) {
      if ($$0.c() == 0.0F) {
         return $$0;
      } else {
         fir $$1 = $$0.a(0.98F);
         if (this.fG() && !this.cc()) {
            $$1 = $$1.a(0.2F);
         }

         if (this.y()) {
            float $$2 = (float)this.i(cbs.A);
            $$1 = $$1.a($$2);
         }

         return b($$1);
      }
   }

   private static fir b(fir $$0) {
      float $$1 = $$0.b();
      if ($$1 <= 0.0F) {
         return $$0;
      } else {
         fir $$2 = $$0.a(1.0F / $$1);
         float $$3 = c($$2);
         float $$4 = Math.min($$1 * $$3, 1.0F);
         return $$2.a($$4);
      }
   }

   private static float c(fir $$0) {
      float $$1 = Math.abs($$0.j);
      float $$2 = Math.abs($$0.k);
      float $$3 = $$2 > $$1 ? $$1 / $$2 : $$2 / $$1;
      return bcb.c(1.0F + bcb.l($$3));
   }

   protected boolean z() {
      return this.cM.ap() == this;
   }

   public void A() {
      this.b(cay.a);
      if (this.ai() != null) {
         for (double $$0 = this.dE(); $$0 > this.ai().L_() && $$0 <= this.ai().ao(); $$0++) {
            this.a_(this.dC(), $$0, this.dI());
            if (this.ai().g(this)) {
               break;
            }
         }

         this.i(fis.c);
         this.w(0.0F);
      }

      this.x(this.fa());
      this.bl = 0;
   }

   @Override
   public void e_() {
      if (this.cN > 0) {
         this.cN--;
      }

      if (!(this.cM.z instanceof ger)) {
         this.z(this.B() == dvz.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.k.c();
      cup $$3 = this.gt();
      this.dn = !$$3.b && !this.cn() && !this.cc() && this.h(cay.f) && (this.cg() || !this.fY() && !this.h(cay.a));
      this.k.a();
      this.cM.aC().a(this.k);
      boolean $$4 = false;
      if (this.dy > 0) {
         this.dy--;
         $$4 = true;
         this.k.d();
      }

      if (!this.aq) {
         this.c(this.dC() - this.ds() * 0.35, this.dI() + this.ds() * 0.35);
         this.c(this.dC() - this.ds() * 0.35, this.dI() - this.ds() * 0.35);
         this.c(this.dC() + this.ds() * 0.35, this.dI() - this.ds() * 0.35);
         this.c(this.dC() + this.ds() * 0.35, this.dI() + this.ds() * 0.35);
      }

      if ($$1 || this.fG() && !this.cc() || this.k.a.b()) {
         this.cN = 0;
      }

      if (this.R()) {
         if (!$$2) {
            if (this.cN > 0) {
               this.i(true);
            } else {
               this.cN = 7;
            }
         }

         if (this.k.a.g()) {
            this.i(true);
         }
      }

      if (this.cm()) {
         if (this.cn()) {
            if (this.N()) {
               this.i(false);
            }
         } else if (this.L()) {
            this.i(false);
         }
      }

      boolean $$5 = false;
      if ($$3.c) {
         if (this.cM.r.g()) {
            if (!$$3.b) {
               $$3.b = true;
               $$5 = true;
               this.x();
            }
         } else if (!$$0 && this.k.a.e() && !$$4) {
            if (this.cp == 0) {
               this.cp = 7;
            } else if (!this.cn()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aK()) {
                  this.s();
               }

               $$5 = true;
               this.x();
               this.cp = 0;
            }
         }
      }

      if (this.k.a.e() && !$$5 && !$$0 && !this.eV() && this.gz()) {
         this.j.b(new aiu(this, aiu.a.g));
      }

      this.dz = this.fQ();
      if (this.bm() && this.k.a.f() && this.er()) {
         this.fp();
      }

      if (this.a(azu.a)) {
         int $$6 = this.am() ? 10 : 1;
         this.dA = bcb.a(this.dA + $$6, 0, 600);
      } else if (this.dA > 0) {
         this.a(azu.a);
         this.dA = bcb.a(this.dA - 10, 0, 600);
      }

      if ($$3.b && this.z()) {
         int $$7 = 0;
         if (this.k.a.f()) {
            $$7--;
         }

         if (this.k.a.e()) {
            $$7++;
         }

         if ($$7 != 0) {
            this.i(this.dA().b(0.0, $$7 * $$3.a() * 3.0F, 0.0));
         }
      }

      caw $$8 = this.u();
      if ($$8 != null && $$8.c() == 0) {
         if (this.ds < 0) {
            this.ds++;
            if (this.ds == 0) {
               this.dt = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.ds = -10;
            $$8.b(bcb.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.k.a.e()) {
            this.ds = 0;
            this.dt = 0.0F;
         } else if ($$0) {
            this.ds++;
            if (this.ds < 10) {
               this.dt = this.ds * 0.1F;
            } else {
               this.dt = 0.8F + 2.0F / (this.ds - 9) * 0.1F;
            }
         }
      } else {
         this.dt = 0.0F;
      }

      super.e_();
      if (this.aK() && $$3.b && !this.cM.r.g()) {
         $$3.b = false;
         this.x();
      }
   }

   private boolean L() {
      return this.O() || this.cc() && !this.d(this.dm()) || !this.k.c() || !this.S() || this.ac && !this.af || this.bm() && !this.bq();
   }

   private boolean N() {
      return this.O() || this.cc() && !this.d(this.dm()) || !this.bm() || !this.k.c() && !this.aK() && !this.k.a.f() || !this.S();
   }

   private boolean O() {
      return this.d(bys.o);
   }

   public dvz.a B() {
      return this.aF == null ? dvz.a.b : this.aF.a();
   }

   @Override
   protected void es() {
      this.bl++;
      if (this.bl == 20) {
         this.a(bzm.e.a);
      }
   }

   private void z(boolean $$0) {
      this.cU = this.cT;
      float $$1 = 0.0F;
      if ($$0 && this.aF != null && this.aF.e()) {
         if (this.cM.z != null && !this.cM.z.aQ_() && !(this.cM.z instanceof gdx) && !(this.cM.z instanceof gew)) {
            if (this.cM.z instanceof gfz) {
               this.p();
            }

            this.cM.a(null);
         }

         if (this.cT == 0.0F) {
            this.cM.al().a(hvm.b(ayz.vX, this.ar.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.aF.a(false);
      } else if (this.cT > 0.0F) {
         $$1 = -0.05F;
      }

      this.cT = bcb.a(this.cT + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.dw = false;
      if (this.dn() instanceof cxe $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.dw = this.dw | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean C() {
      return this.dw;
   }

   @Override
   public void a(caq $$0, fis $$1) {
      double $$2 = this.dC();
      double $$3 = this.dI();
      super.a($$0, $$1);
      float $$4 = (float)(this.dC() - $$2);
      float $$5 = (float)(this.dI() - $$3);
      this.f($$4, $$5);
      this.g = this.g + bcb.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.dx;
   }

   @Override
   public boolean ha() {
      return this.cM.n.L().c();
   }

   @Override
   protected void f(float $$0, float $$1) {
      if (this.P()) {
         fis $$2 = this.dv();
         fis $$3 = $$2.b($$0, 0.0, $$1);
         fis $$4 = new fis($$0, 0.0, $$1);
         float $$5 = this.fu();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fir $$7 = this.k.b();
            float $$8 = $$5 * $$7.j;
            float $$9 = $$5 * $$7.k;
            float $$10 = bcb.a(this.dP() * (float) (Math.PI / 180.0));
            float $$11 = bcb.b(this.dP() * (float) (Math.PI / 180.0));
            $$4 = new fis($$8 * $$11 - $$9 * $$10, $$4.e, $$9 * $$11 + $$8 * $$10);
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = bcb.j($$6);
         fis $$13 = $$4.c((double)$$12);
         fis $$14 = this.bY();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fix $$16 = fix.a((bzm)this);
            jb $$17 = jb.a(this.dC(), this.cV().e, this.dI());
            eeb $$18 = this.ai().a_($$17);
            if ($$18.b(this.ai(), $$17, $$16).c()) {
               $$17 = $$17.d();
               eeb $$19 = this.ai().a_($$17);
               if ($$19.b(this.ai(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.d(bys.h)) {
                     $$21 += (this.e(bys.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fis $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.ds();
                  float $$26 = this.dt();
                  fin $$27 = new fin($$2, $$24.b(0.0, $$26, 0.0)).c($$25, 0.0, $$25);
                  fis $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fis $$28 = $$13.c(new fis(0.0, 1.0, 0.0));
                  fis $$29 = $$28.c((double)($$25 * 0.5F));
                  fis $$30 = $$23.d($$29);
                  fis $$31 = $$24.d($$29);
                  fis $$32 = $$23.e($$29);
                  fis $$33 = $$24.e($$29);
                  Iterable<fjm> $$34 = this.ai().d(this, $$27);
                  Iterator<fin> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fin $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fis $$38 = $$37.f();
                        jb $$39 = jb.a((jv)$$38);

                        for (int $$40 = 1; $$40 < $$21; $$40++) {
                           jb $$41 = $$39.b($$40);
                           eeb $$42 = this.ai().a_($$41);
                           fjm $$43;
                           if (!($$43 = $$42.b(this.ai(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jh.a.b) + $$41.v();
                              if ($$36 - this.dE() > $$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              eeb $$44 = this.ai().a_($$17);
                              if (!$$44.b(this.ai(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)($$36 - this.dE());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dy = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(fis $$0) {
      float $$1 = this.dP() * (float) (Math.PI / 180.0);
      double $$2 = bcb.a($$1);
      double $$3 = bcb.b($$1);
      double $$4 = this.bC * $$3 - this.bE * $$2;
      double $$5 = this.bE * $$3 + this.bC * $$2;
      double $$6 = bcb.k($$4) + bcb.k($$5);
      double $$7 = bcb.k($$0.d) + bcb.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean P() {
      return this.D() && this.dy <= 0 && this.aK() && !this.gj() && !this.cc() && this.Q() && this.aV() >= 1.0;
   }

   private boolean Q() {
      return this.k.b().c() > 0.0F;
   }

   private boolean R() {
      return !this.cm()
         && this.k.c()
         && this.S()
         && !this.fG()
         && !this.O()
         && (!this.cc() || this.d(this.dm()))
         && (!this.fQ() || this.bq())
         && (!this.y() || this.bq())
         && (!this.bm() || this.bq());
   }

   private boolean d(bzm $$0) {
      return $$0.dS() && $$0.di();
   }

   private boolean S() {
      return this.cc() || this.gD().a() > 6.0F || this.gt().c;
   }

   public float E() {
      if (!this.a(azu.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if (this.dA >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = bcb.a(this.dA / 100.0F, 0.0F, 1.0F);
            float $$3 = this.dA < 100.0F ? 0.0F : bcb.a((this.dA - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dmr $$0) {
      if ($$0 == dmr.d) {
         this.i(this.dA().a(jh.a.b, 0.0));
      }
   }

   @Override
   public boolean bq() {
      return this.cA;
   }

   @Override
   protected boolean gk() {
      boolean $$0 = this.cA;
      boolean $$1 = super.gk();
      if (this.am()) {
         return this.cA;
      } else {
         if (!$$0 && $$1) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.x, aza.i, 1.0F, 1.0F, false);
            this.cM.al().a((hvr)(new hvu.b(this)));
         }

         if ($$0 && !$$1) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.y, aza.i, 1.0F, 1.0F, false);
         }

         return this.cA;
      }
   }

   @Override
   public fis u(float $$0) {
      if (this.cM.n.aH().a()) {
         float $$1 = bcb.h($$0 * 0.5F, this.dP(), this.aa) * (float) (Math.PI / 180.0);
         float $$2 = bcb.h($$0 * 0.5F, this.dR(), this.ab) * (float) (Math.PI / 180.0);
         double $$3 = this.fF() == cad.b ? -1.0 : 1.0;
         fis $$4 = new fis(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.n($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(dcv $$0, dcv $$1, cyw $$2) {
      this.cM.aC().a($$0, $$1, $$2);
   }

   @Override
   public float dQ() {
      return this.dP();
   }

   @Override
   public void g(dcv $$0) {
      this.cM.r.a($$0);
   }

   @Override
   public boolean gw() {
      return this.dd.c();
   }

   public bde F() {
      return this.dd;
   }

   public cur H() {
      return this.dr;
   }
}
