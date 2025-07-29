import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class cmt extends cmd {
   public static final float ck = 0.2375F;
   public static final int cl = 16;
   public static final int cm = 32;
   public static final int co = 64;
   public static final int cp = 16;
   public static final int cq = 20;
   public static final int cr = 600;
   public static final int cs = 4;
   private static final int cv = 60;
   private static final int cw = 10;
   public static final float ct = 2.0F;
   public static final Predicate<dcv> cu = $$0 -> $$0.a(azx.aE);
   private int cx = 0;
   private int cy;
   private static final alh<Boolean> cz = all.a(cmt.class, alj.k);
   private static final alh<Boolean> cA = all.a(cmt.class, alj.k);
   private static final float cB = 1.0F;

   public cmt(bzv<? extends cmt> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new crp.b(this, true, this::gH);
      this.cd = new cmt.d();
   }

   private void s(int $$0) {
      if (this.cy <= 0 && $$0 > 0 && this.ai() instanceof aub $$1) {
         this.e(this.dC(), this.dE(), this.dI());
         $$1.n().a.a(this, adu.a(this));
      }

      this.cy = $$0;
      this.gU();
   }

   private cjw c(dmu $$0) {
      return new cmt.a(this, $$0);
   }

   @Override
   protected void H() {
      this.ch.a(3, new cmt.c());
      this.ch.a(4, new ciq.a(this, 1.0, $$0 -> !this.gn() && !this.g_() ? $$0.a(azx.aF) : cu.test($$0), false, 7.0));
      this.ch.a(5, new crp.d(this, 16));
   }

   private void gI() {
      this.ce = new crp.b(this, true, this::gH);
      this.cd = new cmt.d();
      this.cg = this.b(this.ai());
      if (this.ai() instanceof aub $$0) {
         this.c($$0x -> true);
         this.H();
         ((cbm<cmt>)this.bO).b($$0, this);
         this.bO.a();
      }
   }

   private void gJ() {
      this.ce = new cgi(this, 180, true);
      this.cd = new cgk(this);
      this.cg = this.c(this.ai());
      this.s(0);
      this.c($$0 -> true);
   }

   @Override
   protected void h() {
      if (this.g_()) {
         this.gJ();
      } else {
         this.gI();
      }

      super.h();
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 20.0).a(cbs.F, 16.0).a(cbs.m, 0.05).a(cbs.w, 0.05).a(cbs.n, 16.0).a(cbs.i, 8.0);
   }

   @Override
   protected float c(float $$0) {
      return Math.min($$0, 1.0F);
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   public boolean eV() {
      return false;
   }

   @Override
   public void k(fis $$0) {
      float $$1 = (float)this.i(cbs.m) * 5.0F / 3.0F;
      this.a($$0, $$1, $$1, $$1);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      if (!$$1.w($$0)) {
         return 0.0F;
      } else {
         return $$1.w($$0.e()) && !$$1.w($$0.c(2)) ? 10.0F : 5.0F;
      }
   }

   @Override
   public boolean ek() {
      return this.g_() ? true : super.ek();
   }

   @Override
   protected boolean gF() {
      return false;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
   }

   @Override
   public float fl() {
      return 1.0F;
   }

   @Override
   public aza do() {
      return aza.g;
   }

   @Override
   public int W() {
      int $$0 = super.W();
      return this.cd() ? $$0 * 6 : $$0;
   }

   @Override
   protected ayy p() {
      return this.g_() ? ayz.ld : ayz.mx;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.g_() ? ayz.lf : ayz.mz;
   }

   @Override
   protected ayy f_() {
      return this.g_() ? ayz.le : ayz.my;
   }

   @Override
   public int gk() {
      return 1;
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.af.a($$0, bzu.e);
   }

   @Override
   public boolean gO() {
      return false;
   }

   @Override
   public float ep() {
      return this.g_() ? 0.2375F : 1.0F;
   }

   @Override
   public boolean i(dcv $$0) {
      return cu.test($$0);
   }

   @Override
   public boolean e(bzw $$0) {
      return $$0 != bzw.g ? super.e($$0) : this.bO() && !this.g_();
   }

   @Override
   protected boolean f(bzw $$0) {
      return $$0 == bzw.g;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      if (this.g_()) {
         return super.b($$0, $$1);
      } else {
         dcv $$2 = $$0.b($$1);
         if (!$$2.f()) {
            bxj $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if (this.gn() && !$$0.gh()) {
            this.g($$0);
            return bxj.a;
         } else {
            return super.b($$0, $$1);
         }
      }
   }

   private void g(cut $$0) {
      if (!this.ai().C) {
         $$0.o(this);
      }
   }

   @Override
   protected void q(bzm $$0) {
      if (!this.cd()) {
         this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.nj, this.do(), 1.0F, 1.0F);
      }

      super.q($$0);
      if (!this.ai().C) {
         if (!this.gV()) {
            this.s(0);
         } else if (this.cy > 10) {
            this.s(10);
         }
      }
   }

   @Override
   protected void r(bzm $$0) {
      super.r($$0);
      if (!this.ai().C) {
         this.s(10);
      }

      if (!this.cd()) {
         this.gu();
         this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.ni, this.do(), 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean s(bzm $$0) {
      return this.da().size() < 4;
   }

   @Nullable
   @Override
   public cam cY() {
      return (cam)(this.gn() && !this.gH() && this.db() instanceof cut $$1 ? $$1 : super.cY());
   }

   @Override
   protected fis b(cut $$0, fis $$1) {
      float $$2 = $$0.bC;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.bE != 0.0F) {
         float $$5 = bcb.b($$0.dR() * (float) (Math.PI / 180.0));
         float $$6 = -bcb.a($$0.dR() * (float) (Math.PI / 180.0));
         if ($$0.bE < 0.0F) {
            $$5 *= -0.5F;
            $$6 *= -0.5F;
         }

         $$4 = $$6;
         $$3 = $$5;
      }

      if ($$0.fy()) {
         $$4 += 0.5F;
      }

      return new fis($$2, $$4, $$3).c(3.9F * this.i(cbs.m));
   }

   protected fir i(cam $$0) {
      return new fir($$0.dR() * 0.5F, $$0.dP());
   }

   @Override
   protected void a(cut $$0, fis $$1) {
      super.a($$0, $$1);
      fir $$2 = this.i($$0);
      float $$3 = this.dP();
      float $$4 = bcb.h($$2.k - $$3);
      float $$5 = 0.08F;
      $$3 += $$4 * 0.08F;
      this.b($$3, $$2.j);
      this.aa = this.br = this.bt = $$3;
   }

   @Override
   protected cbm.b<cmt> ei() {
      return cmu.a();
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cmu.a(this.ei().a($$0));
   }

   @Override
   protected void a(aub $$0) {
      if (this.g_()) {
         btt $$1 = bts.a();
         $$1.a("happyGhastBrain");
         ((cbm<cmt>)this.bO).a($$0, this);
         $$1.c();
         $$1.a("happyGhastActivityUpdate");
         cmu.a(this);
         $$1.c();
      }

      this.gL();
      super.a($$0);
   }

   @Override
   public void g() {
      super.g();
      if (!this.ai().B_()) {
         if (this.cx > 0) {
            this.cx--;
         }

         this.x(this.cx > 0);
         if (this.cy > 0) {
            if (this.as > 60) {
               this.cy--;
            }

            this.s(this.cy);
         }

         if (this.gV()) {
            this.s(10);
         }
      }
   }

   @Override
   public void e_() {
      if (!this.ai().C) {
         this.c(this.gH());
      }

      super.e_();
      this.gT();
   }

   private int gK() {
      return !this.g_() && this.a(bzw.g).f() ? 64 : 32;
   }

   private void gL() {
      if (!this.R_() && !this.cd()) {
         int $$0 = this.gK();
         if (!this.gv() || !this.gs().a(this.dx(), $$0 + 16) || $$0 != this.gt()) {
            this.a(this.dx(), $$0);
         }
      }
   }

   private void gT() {
      if (this.ai() instanceof aub $$0 && this.bO() && this.bl == 0 && this.fa() != this.eL()) {
         boolean $$2 = $$0.G_().j() && (this.br() || $$0.s(this.dx()) != dnx.c.a);
         if (this.as % ($$2 ? 20 : 600) == 0) {
            this.d(1.0F);
         }
      }
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cz, false);
      $$0.a(cA, false);
   }

   private void x(boolean $$0) {
      this.ay.a(cz, $$0);
   }

   public boolean n() {
      return this.ay.a(cz);
   }

   private void gU() {
      this.ay.a(cA, this.cy > 0);
   }

   public boolean t() {
      return this.ay.a(cA);
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   public fis[] dK() {
      return cak.a(this, -0.03125, 0.4375, 0.46875, 0.03125);
   }

   @Override
   public fis F() {
      return fis.c;
   }

   @Override
   public double B() {
      return 10.0;
   }

   @Override
   public double A() {
      return 16.0;
   }

   @Override
   public void z() {
      super.z();
      this.Q().g();
   }

   @Override
   public void a(cak $$0) {
      if ($$0.D()) {
         this.cx = 5;
      }
   }

   @Override
   public void a(fdc $$0) {
      super.a($$0);
      $$0.a("still_timeout", this.cy);
   }

   @Override
   public void a(fda $$0) {
      super.a($$0);
      this.s($$0.a("still_timeout", 0));
   }

   public boolean gH() {
      return this.t() || this.cy > 0;
   }

   private boolean gV() {
      fin $$0 = this.cV();
      fin $$1 = new fin($$0.a - 1.0, $$0.e - 1.0E-5F, $$0.c - 1.0, $$0.d + 1.0, $$0.e + $$0.c() / 2.0, $$0.f + 1.0);

      for (cut $$2 : this.ai().A()) {
         if (!$$2.am()) {
            bzm $$3 = $$2.dh();
            if (!($$3 instanceof cmt) && $$1.d($$3.dv())) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected cgg O() {
      return new cmt.b();
   }

   @Override
   public boolean j(@Nullable bzm $$0) {
      if (!this.g_() && this.bO()) {
         if (this.ai().B_() && $$0 instanceof cut && $$0.dv().e >= this.cV().e) {
            return true;
         } else {
            return this.cd() && $$0 instanceof cmt ? true : this.gH();
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean dZ() {
      return !this.g_();
   }

   static class a extends cju {
      public a(cmt $$0, dmu $$1) {
         super($$0, $$1);
         this.d(false);
         this.a(true);
         this.a(48.0F);
      }

      @Override
      protected boolean a(fis $$0, fis $$1) {
         return a(this.a, $$0, $$1, false);
      }
   }

   class b extends cgg {
      public b() {
         super(cmt.this);
      }

      @Override
      public void a() {
         if (cmt.this.cd()) {
            cmt.this.bt = cmt.this.dP();
            cmt.this.br = cmt.this.bt;
         }

         super.a();
      }
   }

   class c extends chc {
      public c() {
         super(cmt.this);
      }

      @Override
      public boolean b() {
         return !cmt.this.gH() && super.b();
      }
   }

   class d extends cgk {
      d() {
         super(cmt.this);
      }

      @Override
      public void a() {
         if (cmt.this.gH()) {
            float $$0 = a(cmt.this.dP());
            cmt.this.v(cmt.this.dP() - $$0);
            cmt.this.r(cmt.this.dP());
         } else if (this.d > 0) {
            this.d--;
            double $$1 = this.e - cmt.this.dC();
            double $$2 = this.g - cmt.this.dI();
            cmt.this.v(-((float)bcb.d($$1, $$2)) * (180.0F / (float)Math.PI));
            cmt.this.br = cmt.this.dP();
            cmt.this.bt = cmt.this.br;
         } else {
            crp.a(this.a);
         }
      }

      public static float a(float $$0) {
         float $$1 = $$0 % 90.0F;
         if ($$1 >= 45.0F) {
            $$1 -= 90.0F;
         }

         if ($$1 < -45.0F) {
            $$1 += 90.0F;
         }

         return $$1;
      }
   }
}
