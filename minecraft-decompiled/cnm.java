import javax.annotation.Nullable;

public class cnm extends cmd {
   private static final alh<Boolean> cl = all.a(cnm.class, alj.k);
   private static final alh<Boolean> cm = all.a(cnm.class, alj.k);
   private static final float co = 0.3F;
   private static final bzp cp = bzv.bD.n().a(bzo.a().a(bzn.a, 0.0F, bzv.bD.m(), -0.25F)).a(0.3F);
   private static final boolean cq = false;
   int cr;
   public static final clc.a ck = ($$0, $$1) -> $$0.g_() && !$$0.bm();
   jb cs = jb.c;
   @Nullable
   jb ct;
   boolean cu;

   public cnm(bzv<? extends cnm> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.j, 0.0F);
      this.a(fbc.t, -1.0F);
      this.a(fbc.s, -1.0F);
      this.a(fbc.r, -1.0F);
      this.ce = new cnm.e(this);
   }

   public void h(jb $$0) {
      this.cs = $$0;
   }

   public boolean m() {
      return this.ay.a(cl);
   }

   void x(boolean $$0) {
      this.ay.a(cl, $$0);
   }

   public boolean n() {
      return this.ay.a(cm);
   }

   void y(boolean $$0) {
      this.cr = $$0 ? 1 : 0;
      this.ay.a(cm, $$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("home_pos", jb.a, this.cs);
      $$0.a("has_egg", this.m());
   }

   @Override
   protected void a(fda $$0) {
      this.h($$0.<jb>a("home_pos", jb.a).orElse(this.dx()));
      super.a($$0);
      this.x($$0.a("has_egg", false));
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.h(this.dx());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bzv<cnm> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$3.v() < $$1.Q() + 4 && dzg.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void H() {
      this.ch.a(0, new cnm.f(this, 1.2));
      this.ch.a(1, new cnm.a(this, 1.0));
      this.ch.a(1, new cnm.d(this, 1.0));
      this.ch.a(2, new ciq(this, 1.1, $$0 -> $$0.a(azx.aU), false));
      this.ch.a(3, new cnm.c(this, 1.0));
      this.ch.a(4, new cnm.b(this, 1.0));
      this.ch.a(7, new cnm.i(this, 1.0));
      this.ch.a(8, new chq(this, cut.class, 8.0F));
      this.ch.a(9, new cnm.h(this, 1.0, 100));
   }

   public static cbr.a t() {
      return cmd.gM().a(cbs.t, 30.0).a(cbs.w, 0.25).a(cbs.C, 1.0);
   }

   @Override
   public boolean cN() {
      return false;
   }

   @Override
   public int W() {
      return 200;
   }

   @Nullable
   @Override
   protected ayy p() {
      return !this.bm() && this.aK() && !this.g_() ? ayz.BI : super.p();
   }

   @Override
   protected void g(float $$0) {
      super.g($$0 * 1.5F);
   }

   @Override
   protected ayy aY() {
      return ayz.BT;
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return this.g_() ? ayz.BP : ayz.BO;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return this.g_() ? ayz.BK : ayz.BJ;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      ayy $$2 = this.g_() ? ayz.BS : ayz.BR;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean gO() {
      return super.gO() && !this.m();
   }

   @Override
   protected float aX() {
      return this.ak + 0.15F;
   }

   @Override
   public float ep() {
      return this.g_() ? 0.3F : 1.0F;
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cnm.g(this, $$0);
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.bD.a($$0, bzu.e);
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aU);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      if (!this.cu && $$1.b_($$0).a(azu.a)) {
         return 10.0F;
      } else {
         return dzg.a($$1, $$0) ? 10.0F : $$1.y($$0);
      }
   }

   @Override
   public void e_() {
      super.e_();
      if (this.bO() && this.n() && this.cr >= 1 && this.cr % 5 == 0) {
         jb $$0 = this.dx();
         if (dzg.a(this.ai(), $$0)) {
            this.ai().c(2001, $$0, dpz.j(this.ai().a_($$0.e())));
            this.c(ejb.u);
         }
      }
   }

   @Override
   protected void h() {
      super.h();
      if (!this.g_() && this.ai() instanceof aub $$0 && $$0.P().c(dmq.g)) {
         this.a($$0, dcz.pu, 1);
      }
   }

   @Override
   public void k(fis $$0) {
      if (this.bm()) {
         this.a(0.1F, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.9));
         if (this.e() == null && (!this.cu || !this.cs.a(this.dv(), 20.0))) {
            this.i(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.k($$0);
      }
   }

   @Override
   public boolean v() {
      return false;
   }

   @Override
   public void a(aub $$0, cal $$1) {
      this.a($$0, this.ea().c(), Float.MAX_VALUE);
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cp : super.e($$0);
   }

   static class a extends cgu {
      private final cnm d;

      a(cnm $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.m();
      }

      @Override
      protected void g() {
         auc $$0 = this.a.gQ();
         if ($$0 == null && this.c.gQ() != null) {
            $$0 = this.c.gQ();
         }

         if ($$0 != null) {
            $$0.a(azj.Q);
            aq.p.a($$0, this.a, this.c, null);
         }

         this.d.x(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gS();
         this.c.gS();
         bck $$1 = this.a.ec();
         if (a(this.b).P().c(dmq.g)) {
            this.b.b(new caa(this.b, this.a.dC(), this.a.dE(), this.a.dI(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends chi {
      private final cnm a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cnm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         if (this.a.g_()) {
            return false;
         } else if (this.a.m()) {
            return true;
         } else {
            return this.a.ec().a(b(700)) != 0 ? false : !this.a.cs.a(this.a.dv(), 64.0);
         }
      }

      @Override
      public void d() {
         this.a.cu = true;
         this.c = false;
         this.d = 0;
      }

      @Override
      public void e() {
         this.a.cu = false;
      }

      @Override
      public boolean c() {
         return !this.a.cs.a(this.a.dv(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void a() {
         jb $$0 = this.a.cs;
         boolean $$1 = $$0.a(this.a.dv(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.S().l()) {
            fis $$2 = fis.c($$0);
            fis $$3 = clg.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = clg.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.ai().a_(jb.a((jv)$$3)).a(dqb.J)) {
               $$3 = clg.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.S().a($$3.d, $$3.e, $$3.f, this.b);
         }
      }
   }

   static class c extends chv {
      private static final int g = 1200;
      private final cnm h;

      c(cnm $$0, double $$1) {
         super($$0, $$0.g_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean c() {
         return !this.h.bm() && this.d <= 1200 && this.a(this.h.ai(), this.e);
      }

      @Override
      public boolean b() {
         if (this.h.g_() && !this.h.bm()) {
            return super.b();
         } else {
            return !this.h.cu && !this.h.bm() && !this.h.m() ? super.b() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dmx $$0, jb $$1) {
         return $$0.a_($$1).a(dqb.J);
      }
   }

   static class d extends chv {
      private final cnm g;

      d(cnm $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return this.g.m() && this.g.cs.a(this.g.dv(), 9.0) ? super.b() : false;
      }

      @Override
      public boolean c() {
         return super.c() && this.g.m() && this.g.cs.a(this.g.dv(), 9.0);
      }

      @Override
      public void a() {
         super.a();
         jb $$0 = this.g.dx();
         if (!this.g.bm() && this.m()) {
            if (this.g.cr < 1) {
               this.g.y(true);
            } else if (this.g.cr > this.a(200)) {
               dmu $$1 = this.g.ai();
               $$1.a(null, $$0, ayz.BQ, aza.e, 0.3F, 0.9F + $$1.A.i() * 0.2F);
               jb $$2 = this.e.d();
               eeb $$3 = dqb.mL.m().b(dzg.c, this.g.ar.a(4) + 1);
               $$1.a($$2, $$3, 3);
               $$1.a(ejb.i, $$2, ejb.a.a(this.g, $$3));
               this.g.x(false);
               this.g.y(false);
               this.g.r(600);
            }

            if (this.g.n()) {
               this.g.cr++;
            }
         }
      }

      @Override
      protected boolean a(dmx $$0, jb $$1) {
         return !$$0.w($$1.d()) ? false : dzg.b($$0, $$1);
      }
   }

   static class e extends cgl {
      private final cnm l;

      e(cnm $$0) {
         super($$0);
         this.l = $$0;
      }

      private void h() {
         if (this.l.bm()) {
            this.l.i(this.l.dA().b(0.0, 0.005, 0.0));
            if (!this.l.cs.a(this.l.dv(), 16.0)) {
               this.l.B(Math.max(this.l.fu() / 2.0F, 0.08F));
            }

            if (this.l.g_()) {
               this.l.B(Math.max(this.l.fu() / 3.0F, 0.06F));
            }
         } else if (this.l.aK()) {
            this.l.B(Math.max(this.l.fu() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.h();
         if (this.k == cgl.a.b && !this.l.S().l()) {
            double $$0 = this.e - this.l.dC();
            double $$1 = this.f - this.l.dE();
            double $$2 = this.g - this.l.dI();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.B(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(bcb.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dP(), $$4, 90.0F));
               this.l.br = this.l.dP();
               float $$5 = (float)(this.h * this.l.i(cbs.w));
               this.l.B(bcb.h(0.125F, this.l.fu(), $$5));
               this.l.i(this.l.dA().b(0.0, this.l.fu() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class f extends cib {
      f(cnm $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b() {
         if (!this.h()) {
            return false;
         } else {
            jb $$0 = this.a(this.c.ai(), this.c, 7);
            if ($$0 != null) {
               this.e = $$0.u();
               this.f = $$0.v();
               this.g = $$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends cjt {
      g(cnm $$0, dmu $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(jb $$0) {
         return this.a instanceof cnm $$1 && $$1.ct != null ? this.b.a_($$0).a(dqb.J) : !this.b.a_($$0.e()).l();
      }
   }

   static class h extends cif {
      private final cnm i;

      h(cnm $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.b.bm() && !this.i.cu && !this.i.m() ? super.b() : false;
      }
   }

   static class i extends chi {
      private final cnm a;
      private final double b;
      private boolean c;

      i(cnm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean b() {
         return !this.a.cu && !this.a.m() && this.a.bm();
      }

      @Override
      public void d() {
         int $$0 = 512;
         int $$1 = 4;
         bck $$2 = this.a.ar;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ($$4 + this.a.dE() > this.a.ai().Q() - 1) {
            $$4 = 0;
         }

         this.a.ct = jb.a($$3 + this.a.dC(), $$4 + this.a.dE(), $$5 + this.a.dI());
         this.c = false;
      }

      @Override
      public void a() {
         if (this.a.ct == null) {
            this.c = true;
         } else {
            if (this.a.S().l()) {
               fis $$0 = fis.c(this.a.ct);
               fis $$1 = clg.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
               if ($$1 == null) {
                  $$1 = clg.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
               }

               if ($$1 != null) {
                  int $$2 = bcb.a($$1.d);
                  int $$3 = bcb.a($$1.f);
                  int $$4 = 34;
                  if (!this.a.ai().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                     $$1 = null;
                  }
               }

               if ($$1 == null) {
                  this.c = true;
                  return;
               }

               this.a.S().a($$1.d, $$1.e, $$1.f, this.b);
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.S().l() && !this.c && !this.a.cu && !this.a.gR() && !this.a.m();
      }

      @Override
      public void e() {
         this.a.ct = null;
         super.e();
      }
   }
}
