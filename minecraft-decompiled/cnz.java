import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnz extends coq {
   public static final float ck = 0.45F;
   public static final int cl = 55;
   public static final int cm = 30;
   private static final float cH = 0.1F;
   private static final float cI = 1.4285F;
   private static final float cJ = 22.2222F;
   private static final int cM = 5;
   private static final int cN = 40;
   private static final int cO = 52;
   private static final int cP = 80;
   private static final float cQ = 1.43F;
   private static final long cR = 0L;
   public static final alh<Boolean> co = all.a(cnz.class, alj.k);
   public static final alh<Long> cp = all.a(cnz.class, alj.c);
   public final bzd cq = new bzd();
   public final bzd cr = new bzd();
   public final bzd cs = new bzd();
   public final bzd ct = new bzd();
   public final bzd cu = new bzd();
   private static final bzp cS = bzp.b(bzv.u.l(), bzv.u.m() - 1.43F).b(0.845F);
   private int cT = 0;
   private int cU = 0;

   public cnz(bzv<? extends cnz> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cnz.c();
      this.cd = new cnz.b();
      cjv $$2 = (cjv)this.S();
      $$2.a(true);
      $$2.c(true);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("LastPoseTick", this.ay.a(cp).longValue());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      long $$1 = $$0.a("LastPoseTick", 0L);
      if ($$1 < 0L) {
         this.b(cay.k);
      }

      this.a($$1);
   }

   public static cbr.a m() {
      return hh().a(cbs.t, 32.0).a(cbs.w, 0.09F).a(cbs.p, 0.42F).a(cbs.C, 1.5);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(co, false);
      $$0.a(cp, 0L);
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      coa.a(this, $$0.H_());
      this.b($$0.a().ae());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bzv<cnz> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cn) && a($$1, $$3);
   }

   @Override
   protected cbm.b<cnz> ei() {
      return coa.a();
   }

   @Override
   protected void H() {
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return coa.a(this.ei().a($$0));
   }

   @Override
   public bzp e(cay $$0) {
      return $$0 == cay.k ? cS.a(this.ep()) : super.e($$0);
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("camelBrain");
      cbm<?> $$2 = this.eh();
      ((cbm<cnz>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      coa.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void g() {
      super.g();
      if (this.t() && this.cT < 50 && (this.aK() || this.bp() || this.cc())) {
         this.x(false);
      }

      if (this.cT > 0) {
         this.cT--;
         if (this.cT == 0) {
            this.ai().a(null, this.dx(), ayz.dD, aza.g, 1.0F, 1.0F);
         }
      }

      if (this.ai().B_()) {
         this.hr();
      }

      if (this.n()) {
         this.gi();
      }

      if (this.gK() && this.bm()) {
         this.gW();
      }
   }

   private void hr() {
      if (this.cU <= 0) {
         this.cU = this.ar.a(40) + 80;
         this.ct.a(this.as);
      } else {
         this.cU--;
      }

      if (this.gL()) {
         this.cs.a();
         this.cu.a();
         if (this.hs()) {
            this.cq.b(this.as);
            this.cr.a();
         } else {
            this.cq.a();
            this.cr.b(this.as);
         }
      } else {
         this.cq.a();
         this.cr.a();
         this.cu.a(this.t(), this.as);
         this.cs.a(this.gT() && this.gX() >= 0L, this.as);
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.aw() == cay.a && !this.cu.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.bp.a($$1, 0.2F, this.g_() ? 3.0F : 1.0F);
   }

   @Override
   public void k(fis $$0) {
      if (this.n() && this.aK()) {
         this.i(this.dA().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.k($$0);
   }

   @Override
   protected void a(cut $$0, fis $$1) {
      super.a($$0, $$1);
      if ($$0.bE > 0.0F && this.gK() && !this.gT()) {
         this.gV();
      }
   }

   public boolean n() {
      return this.gK() || this.gT();
   }

   @Override
   protected float c(cut $$0) {
      float $$1 = $$0.cm() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.i(cbs.w) + $$1;
   }

   @Override
   protected fir i(cam $$0) {
      return this.n() ? new fir(this.dR(), this.dP()) : super.i($$0);
   }

   @Override
   protected fis b(cut $$0, fis $$1) {
      return this.n() ? fis.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.n() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.gm() && this.cT <= 0 && this.aK()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dS() {
      return true;
   }

   @Override
   protected void b(float $$0, fis $$1) {
      double $$2 = this.fn();
      this.j(this.bW().d(1.0, 0.0, 1.0).d().c(22.2222F * $$0 * this.i(cbs.w) * this.aW()).b(0.0, 1.4285F * $$0 * $$2, 0.0));
      this.cT = 55;
      this.x(true);
      this.aE = true;
   }

   public boolean t() {
      return this.ay.a(co);
   }

   public void x(boolean $$0) {
      this.ay.a(co, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(ayz.dC);
      this.c(ejb.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cT;
   }

   @Override
   protected ayy p() {
      return ayz.dB;
   }

   @Override
   protected ayy f_() {
      return ayz.dE;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.dG;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      if ($$1.a(azo.bt)) {
         this.a(ayz.dL, 1.0F, 1.0F);
      } else {
         this.a(ayz.dK, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aG);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$0.gh() && !this.g_()) {
         this.b($$0);
         return bxj.a;
      } else {
         bxj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.i($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.da().size() < 2 && !this.g_()) {
               this.g($$0);
            }

            return bxj.a;
         }
      }
   }

   @Override
   public void z() {
      super.z();
      if (this.gK() && !this.gT() && this.gH()) {
         this.gV();
      }
   }

   @Override
   public fis[] E() {
      return cak.a(this, 0.02, 0.48, 0.25, 0.82);
   }

   public boolean gH() {
      return this.g(this.gK() ? cay.a : cay.k);
   }

   @Override
   protected boolean a(cut $$0, dcv $$1) {
      if (!this.i($$1)) {
         return false;
      } else {
         boolean $$2 = this.eL() < this.fa();
         if ($$2) {
            this.d(2.0F);
         }

         boolean $$3 = this.gY() && this.Z_() == 0 && this.gO();
         if ($$3) {
            this.h($$0);
         }

         boolean $$4 = this.g_();
         if ($$4) {
            this.ai().a(me.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.ai().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.be()) {
               ayy $$5 = this.gJ();
               if ($$5 != null) {
                  this.ai().a(null, this.dC(), this.dE(), this.dI(), $$5, this.do(), 1.0F, 1.0F + (this.ar.i() - this.ar.i()) * 0.2F);
               }
            }

            this.c(ejb.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gI() {
      return false;
   }

   @Override
   public boolean a(cmd $$0) {
      return $$0 != this && $$0 instanceof cnz $$1 && this.hp() && $$1.hp();
   }

   @Nullable
   public cnz b(aub $$0, bzc $$1) {
      return bzv.u.a($$0, bzu.e);
   }

   @Nullable
   @Override
   protected ayy gJ() {
      return ayz.dF;
   }

   @Override
   protected void c(aub $$0, byb $$1, float $$2) {
      this.gW();
      super.c($$0, $$1, $$2);
   }

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      int $$3 = Math.max(this.da().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dU() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.da().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cmd) {
            $$5 += 0.2F;
         }
      }

      return new fis(0.0, $$6, $$5 * $$2).b(-this.dP() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ep() {
      return this.g_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, bzp $$2, float $$3) {
      double $$4 = $$2.b() - 0.375F * $$3;
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gT();
      boolean $$9 = this.gK();
      if ($$8) {
         int $$10 = $$9 ? 40 : 52;
         int $$11;
         float $$12;
         if ($$9) {
            $$11 = 28;
            $$12 = $$0 ? 0.5F : 0.1F;
         } else {
            $$11 = $$0 ? 24 : 32;
            $$12 = $$0 ? 0.6F : 0.35F;
         }

         float $$15 = bcb.a((float)this.gX() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < $$11;
         float $$17 = $$16 ? $$15 / $$11 : ($$15 - $$11) / ($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? bcb.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : bcb.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += $$7;
      }

      return $$4;
   }

   @Override
   public fis a_(float $$0) {
      bzp $$1 = this.a(this.aw());
      float $$2 = this.ep();
      return new fis(0.0, this.a(true, $$0, $$1, $$2) - 0.2F * $$2, $$1.a() * 0.56F);
   }

   @Override
   public int gh() {
      return 30;
   }

   @Override
   protected boolean s(bzm $$0) {
      return this.da().size() <= 2;
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   public boolean gK() {
      return this.ay.a(cp) < 0L;
   }

   public boolean gL() {
      return this.gX() < 0L != this.gK();
   }

   public boolean gT() {
      long $$0 = this.gX();
      return $$0 < (this.gK() ? 40 : 52);
   }

   private boolean hs() {
      return this.gK() && this.gX() < 40L && this.gX() >= 0L;
   }

   public void gU() {
      if (!this.gK()) {
         this.b(ayz.dI);
         this.b(cay.k);
         this.c(ejb.u);
         this.a(-this.ai().ae());
      }
   }

   public void gV() {
      if (this.gK()) {
         this.b(ayz.dJ);
         this.b(cay.a);
         this.c(ejb.u);
         this.a(this.ai().ae());
      }
   }

   public void gW() {
      this.b(cay.a);
      this.c(ejb.u);
      this.b(this.ai().ae());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.ay.a(cp, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gX() {
      return this.ai().ae() - Math.abs(this.ay.a(cp));
   }

   @Override
   protected jl<ayy> a(bzw $$0, dcv $$1, dle $$2) {
      return (jl<ayy>)($$0 == bzw.h ? ayz.dH : super.a($$0, $$1, $$2));
   }

   @Override
   public void a(alh<?> $$0) {
      if (!this.ax && co.equals($$0)) {
         this.cT = this.cT == 0 ? 55 : this.cT;
      }

      super.a($$0);
   }

   @Override
   public boolean gY() {
      return true;
   }

   @Override
   public void b(cut $$0) {
      if (!this.ai().C) {
         $$0.a(this, this.cB);
      }
   }

   @Override
   protected cgg O() {
      return new cnz.a(this);
   }

   class a extends cgg {
      public a(final cnz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cnz.this.n()) {
            super.a();
         }
      }
   }

   class b extends cgk {
      b() {
         super(cnz.this);
      }

      @Override
      public void a() {
         if (!cnz.this.cZ()) {
            super.a();
         }
      }
   }

   class c extends cgl {
      public c() {
         super(cnz.this);
      }

      @Override
      public void a() {
         if (this.k == cgl.a.b && !cnz.this.R_() && cnz.this.gK() && !cnz.this.gT() && cnz.this.gH()) {
            cnz.this.gV();
         }

         super.a();
      }
   }
}
