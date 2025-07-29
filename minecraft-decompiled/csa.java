import java.util.function.Predicate;
import javax.annotation.Nullable;

public class csa extends cwk {
   private static final Predicate<bzm> e = $$0 -> !($$0 instanceof csa) && $$0.bO();
   private static final Predicate<bzm> f = $$0 -> e.test($$0) && !$$0.ap().equals(bzv.g);
   private static final Predicate<cam> ck = $$0 -> !($$0 instanceof csa) && $$0.bO() && $$0.di();
   private static final double cl = 0.3;
   private static final double cm = 0.35;
   private static final int cn = 8356754;
   private static final float co = 0.57254905F;
   private static final float cp = 0.5137255F;
   private static final float cq = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private static final int cr = 0;
   private static final int cs = 0;
   private static final int ct = 0;
   private int cu = 0;
   private int cv = 0;
   private int cw = 0;

   public csa(bzv<? extends csa> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 20;
      this.a(fbc.v, 0.0F);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(4, new chs(this, 1.0, true));
      this.ch.a(5, new civ(this, 0.4));
      this.ch.a(6, new chq(this, cut.class, 6.0F));
      this.ch.a(10, new chq(this, cao.class, 8.0F));
      this.ci.a(2, new cja(this, cwk.class).a());
      this.ci.a(3, new cjb<>(this, cut.class, true));
      this.ci.a(4, new cjb<>(this, cua.class, true, ($$0, $$1) -> !$$0.g_()));
      this.ci.a(4, new cjb<>(this, cmv.class, true));
   }

   @Override
   protected void Z() {
      boolean $$0 = !(this.cY() instanceof cao) || this.cY().ap().a(azs.c);
      boolean $$1 = !(this.dm() instanceof cxe);
      this.ch.a(chi.a.a, $$0);
      this.ch.a(chi.a.c, $$0 && $$1);
      this.ch.a(chi.a.b, $$0);
      this.ch.a(chi.a.d, $$0);
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 100.0).a(cbs.w, 0.3).a(cbs.q, 0.75).a(cbs.c, 12.0).a(cbs.d, 1.5).a(cbs.n, 32.0).a(cbs.C, 1.0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("AttackTick", this.cu);
      $$0.a("StunTick", this.cv);
      $$0.a("RoarTick", this.cw);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.cu = $$0.a("AttackTick", 0);
      this.cv = $$0.a("StunTick", 0);
      this.cw = $$0.a("RoarTick", 0);
   }

   @Override
   public ayy ag_() {
      return ayz.ws;
   }

   @Override
   public int gh() {
      return 45;
   }

   @Override
   public void e_() {
      super.e_();
      if (this.bO()) {
         if (this.fm()) {
            this.h(cbs.w).a(0.0);
         } else {
            double $$0 = this.e() != null ? 0.35 : 0.3;
            double $$1 = this.h(cbs.w).b();
            this.h(cbs.w).a(bcb.d(0.1, $$1, $$0));
         }

         if (this.ai() instanceof aub $$2 && this.ac && $$2.P().c(dmq.d)) {
            boolean $$3 = false;
            fin $$4 = this.cV().g(0.2);

            for (jb $$5 : jb.b(bcb.a($$4.a), bcb.a($$4.b), bcb.a($$4.c), bcb.a($$4.d), bcb.a($$4.e), bcb.a($$4.f))) {
               eeb $$6 = $$2.a_($$5);
               dpz $$7 = $$6.b();
               if ($$7 instanceof duq) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aK()) {
               this.s();
            }
         }

         if (this.cw > 0) {
            this.cw--;
            if (this.cw == 10) {
               this.gS();
            }
         }

         if (this.cu > 0) {
            this.cu--;
         }

         if (this.cv > 0) {
            this.cv--;
            this.gR();
            if (this.cv == 0) {
               this.a(ayz.wx, 1.0F, 1.0F);
               this.cw = 20;
            }
         }
      }
   }

   private void gR() {
      if (this.ar.a(6) == 0) {
         double $$0 = this.dC() - this.ds() * Math.sin(this.br * (float) (Math.PI / 180.0)) + (this.ar.j() * 0.6 - 0.3);
         double $$1 = this.dE() + this.dt() - 0.3;
         double $$2 = this.dI() + this.ds() * Math.cos(this.br * (float) (Math.PI / 180.0)) + (this.ar.j() * 0.6 - 0.3);
         this.ai().a(lx.a(me.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fm() {
      return super.fm() || this.cu > 0 || this.cv > 0 || this.cw > 0;
   }

   @Override
   public boolean F(bzm $$0) {
      return this.cv <= 0 && this.cw <= 0 ? super.F($$0) : false;
   }

   @Override
   protected void d(cam $$0) {
      if (this.cw == 0) {
         if (this.ar.j() < 0.5) {
            this.cv = 40;
            this.a(ayz.ww, 1.0F, 1.0F);
            this.ai().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.G($$0);
         }

         $$0.ag = true;
      }
   }

   private void gS() {
      if (this.bO() && this.ai() instanceof aub $$0) {
         Predicate<bzm> $$1 = $$0.P().c(dmq.d) ? e : f;

         for (cam $$3 : this.ai().a(cam.class, this.cV().g(4.0), $$1)) {
            if (!($$3 instanceof crc)) {
               $$3.a($$0, this.ea().b((cam)this), 6.0F);
            }

            if (!($$3 instanceof cut)) {
               this.G($$3);
            }
         }

         this.c(ejb.u);
         $$0.a(this, (byte)69);
      }
   }

   private void hb() {
      for (cam $$1 : this.ai().a(cam.class, this.cV().g(4.0), ck)) {
         this.G($$1);
      }
   }

   private void G(bzm $$0) {
      double $$1 = $$0.dC() - this.dC();
      double $$2 = $$0.dI() - this.dI();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cu = 10;
         this.a(ayz.wr, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cv = 40;
      } else if ($$0 == 69) {
         this.hc();
         this.hb();
      }

      super.b($$0);
   }

   private void hc() {
      fis $$0 = this.cV().f();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         double $$2 = this.ar.k() * 0.2;
         double $$3 = this.ar.k() * 0.2;
         double $$4 = this.ar.k() * 0.2;
         this.ai().a(me.ae, $$0.d, $$0.e, $$0.f, $$2, $$3, $$4);
      }
   }

   public int m() {
      return this.cu;
   }

   public int t() {
      return this.cv;
   }

   public int gQ() {
      return this.cw;
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      this.cu = 10;
      $$0.a(this, (byte)4);
      this.a(ayz.wr, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected ayy p() {
      return ayz.wq;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.wu;
   }

   @Override
   protected ayy f_() {
      return ayz.wt;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.wv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dmx $$0) {
      return !$$0.d(this.cV());
   }

   @Override
   public void a(aub $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gH() {
      return false;
   }

   @Override
   protected fin gz() {
      fin $$0 = super.gz();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
