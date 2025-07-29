import java.util.EnumSet;
import javax.annotation.Nullable;

public class crj extends cso implements crz {
   public static final float a = 0.03F;
   boolean f;

   public crj(bzv<? extends crj> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new crj.d(this);
      this.a(fbc.j, 0.0F);
   }

   public static cbr.a l() {
      return cso.gK().a(cbs.C, 1.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjt(this, $$0);
   }

   @Override
   protected void m() {
      this.ch.a(1, new crj.c(this, 1.0));
      this.ch.a(2, new crj.f(this, 1.0, 40, 10.0F));
      this.ch.a(2, new crj.a(this, 1.0, false));
      this.ch.a(5, new crj.b(this, 1.0));
      this.ch.a(6, new crj.e(this, 1.0, this.ai().Q()));
      this.ch.a(7, new cif(this, 1.0));
      this.ci.a(1, new cja(this, crj.class).a(csq.class));
      this.ci.a(2, new cjb<>(this, cut.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.ci.a(3, new cjb<>(this, cua.class, false));
      this.ci.a(3, new cjb<>(this, cmv.class, true));
      this.ci.a(3, new cjb<>(this, cnu.class, true, false));
      this.ci.a(5, new cjb<>(this, cnm.class, 10, true, false, cnm.ck));
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bzw.b).f() && $$0.H_().i() < 0.03F) {
         this.a(bzw.b, new dcv(dcz.xy));
         this.g(bzw.b);
      }

      return $$3;
   }

   public static boolean a(bzv<crj> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      if (!$$1.b_($$3.e()).a(azu.a) && !bzu.a($$2)) {
         return false;
      } else {
         jl<dnx> $$5 = $$1.v($$3);
         boolean $$6 = $$1.an() != bxg.a && (bzu.b($$2) || a($$1, $$3, $$4)) && (bzu.a($$2) || $$1.b_($$3).a(azu.a));
         if (!$$6 || !bzu.a($$2) && $$2 != bzu.j) {
            return $$5.a(azn.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dmv $$0, jb $$1) {
      return $$1.v() < $$0.Q() - 5;
   }

   @Override
   protected ayy p() {
      return this.bm() ? ayz.il : ayz.ik;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.bm() ? ayz.ip : ayz.io;
   }

   @Override
   protected ayy f_() {
      return this.bm() ? ayz.in : ayz.im;
   }

   @Override
   protected ayy n() {
      return ayz.ir;
   }

   @Override
   protected ayy aY() {
      return ayz.is;
   }

   @Override
   protected boolean t() {
      return true;
   }

   @Override
   protected dcv gH() {
      return dcv.l;
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      if ($$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bzw.a, new dcv(dcz.xx));
         } else {
            this.a(bzw.a, new dcv(dcz.su));
         }
      }
   }

   @Override
   protected boolean a(dcv $$0, dcv $$1, bzw $$2) {
      return $$1.a(dcz.xy) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean gI() {
      return false;
   }

   @Override
   public boolean a(dmx $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable cam $$0) {
      return $$0 != null ? !this.ai().W() || $$0.bm() : false;
   }

   @Override
   public boolean cN() {
      return !this.cn();
   }

   boolean gQ() {
      if (this.f) {
         return true;
      } else {
         cam $$0 = this.e();
         return $$0 != null && $$0.bm();
      }
   }

   @Override
   public void k(fis $$0) {
      if (this.bq() && this.gQ()) {
         this.a(0.01F, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.9));
      } else {
         super.k($$0);
      }
   }

   @Override
   public void bs() {
      if (!this.ai().C) {
         this.j(this.dl() && this.bq() && this.gQ());
      }
   }

   @Override
   public boolean co() {
      return this.cn();
   }

   protected boolean gJ() {
      faz $$0 = this.S().j();
      if ($$0 != null) {
         jb $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.h($$1.u(), $$1.v(), $$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(cam $$0, float $$1) {
      dcv $$2 = this.fh();
      dcv $$3 = $$2.a(dcz.xx) ? $$2 : new dcv(dcz.xx);
      cwc $$4 = new cwc(this.ai(), this, $$3);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.ai() instanceof aub $$9) {
         cvo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, 14 - this.ai().an().a() * 4);
      }

      this.a(ayz.iq, 1.0F, 1.0F / (this.ec().i() * 0.4F + 0.8F));
   }

   @Override
   public bae<dcr> ad() {
      return azx.bY;
   }

   public void x(boolean $$0) {
      this.f = $$0;
   }

   static class a extends cix {
      private final crj b;

      public a(crj $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.i(this.b.e());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.i(this.b.e());
      }
   }

   static class b extends chv {
      private final crj g;

      public b(crj $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.ai().W() && this.g.bm() && this.g.dE() >= this.g.ai().Q() - 3;
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dmx $$0, jb $$1) {
         jb $$2 = $$1.d();
         return $$0.w($$2) && $$0.w($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends chi {
      private final cau a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dmu f;

      public c(cau $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.ai();
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.W()) {
            return false;
         } else if (this.a.bm()) {
            return false;
         } else {
            fis $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.S().l();
      }

      @Override
      public void d() {
         this.a.S().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private fis h() {
         bck $$0 = this.a.ec();
         jb $$1 = this.a.dx();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jb $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dqb.J)) {
               return fis.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cgl {
      private final crj l;

      public d(crj $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         cam $$0 = this.l.e();
         if (this.l.gQ() && this.l.bm()) {
            if ($$0 != null && $$0.dE() > this.l.dE() || this.l.f) {
               this.l.i(this.l.dA().b(0.0, 0.002, 0.0));
            }

            if (this.k != cgl.a.b || this.l.S().l()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dC();
            double $$2 = this.f - this.l.dE();
            double $$3 = this.g - this.l.dI();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(bcb.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dP(), $$5, 90.0F));
            this.l.br = this.l.dP();
            float $$6 = (float)(this.h * this.l.i(cbs.w));
            float $$7 = bcb.h(0.125F, this.l.fu(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dA().b($$7 * $$1 * 0.005, $$7 * $$2 * 0.1, $$7 * $$3 * 0.005));
         } else {
            if (!this.l.aK()) {
               this.l.i(this.l.dA().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends chi {
      private final crj a;
      private final double b;
      private final int c;
      private boolean d;

      public e(crj $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.ai().W() && this.a.bm() && this.a.dE() < this.c - 2;
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dE() < this.c - 1 && (this.a.S().l() || this.a.gJ())) {
            fis $$0 = clg.a(this.a, 4, 8, new fis(this.a.dC(), this.c - 1, this.a.dI()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.S().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.x(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.x(false);
      }
   }

   static class f extends cih {
      private final crj a;

      public f(crz $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (crj)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fh().a(dcz.xx);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bxi.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fM();
         this.a.w(false);
      }
   }
}
