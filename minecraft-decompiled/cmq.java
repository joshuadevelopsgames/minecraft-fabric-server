import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmq extends cmc {
   private static final alh<Boolean> cn = all.a(cmq.class, alj.k);
   private static final alh<Integer> co = all.a(cmq.class, alj.b);
   static final clc cp = clc.b().a(10.0).d();
   public static final int ck = 4800;
   private static final int cq = 2400;
   public static final Predicate<cqz> cl = $$0 -> !$$0.n() && $$0.bO() && $$0.bm();
   public static final float cm = 0.65F;
   private static final boolean cr = false;
   @Nullable
   jb cs;

   public cmq(bzv<? extends cmq> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cgn(this, 85, 10, 0.02F, 0.1F, true);
      this.cd = new cgm(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.j(this.cv());
      this.w(0.0F);
      cbe $$4 = Objects.requireNonNullElseGet($$3, () -> new bzc.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cmq b(aub $$0, bzc $$1) {
      return bzv.I.a($$0, bzu.e);
   }

   @Override
   public float ep() {
      return this.g_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public boolean m() {
      return this.ay.a(cn);
   }

   public void x(boolean $$0) {
      this.ay.a(cn, $$0);
   }

   public int n() {
      return this.ay.a(co);
   }

   public void s(int $$0) {
      this.ay.a(co, $$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cn, false);
      $$0.a(co, 2400);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("GotFish", this.m());
      $$0.a("Moistness", this.n());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("GotFish", false));
      this.s($$0.a("Moistness", 2400));
   }

   @Override
   protected void H() {
      this.ch.a(0, new cgt(this));
      this.ch.a(0, new cis(this));
      this.ch.a(1, new cmq.a(this));
      this.ch.a(2, new cmq.b(this, 4.0));
      this.ch.a(4, new cig(this, 1.0, 10));
      this.ch.a(4, new cid(this));
      this.ch.a(5, new chq(this, cut.class, 6.0F));
      this.ch.a(5, new cgy(this, 10));
      this.ch.a(6, new chs(this, 1.2F, true));
      this.ch.a(8, new cmq.c());
      this.ch.a(8, new chd(this));
      this.ch.a(9, new cgp<>(this, crr.class, 8.0F, 1.0, 1.0));
      this.ci.a(1, new cja(this, crr.class).a());
   }

   public static cbr.a t() {
      return cao.I().a(cbs.t, 10.0).a(cbs.w, 1.2F).a(cbs.c, 3.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjy(this, $$0);
   }

   @Override
   public void gA() {
      this.a(ayz.hv, 1.0F, 1.0F);
   }

   @Override
   public boolean c(cam $$0) {
      return !this.g_() && super.c($$0);
   }

   @Override
   public int cv() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cv();
   }

   @Override
   public int gg() {
      return 1;
   }

   @Override
   public int gh() {
      return 1;
   }

   @Override
   protected boolean p(bzm $$0) {
      return true;
   }

   @Override
   protected boolean f(bzw $$0) {
      return $$0 == bzw.a && this.fU();
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      if (this.a(bzw.a).f()) {
         dcv $$2 = $$1.e();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bzw.a, $$2);
            this.g(bzw.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.gw()) {
         this.j(this.cv());
      } else {
         if (this.bo()) {
            this.s(2400);
         } else {
            this.s(this.n() - 1);
            if (this.n() <= 0) {
               this.a(this.ea().t(), 1.0F);
            }

            if (this.aK()) {
               this.i(this.dA().b((this.ar.i() * 2.0F - 1.0F) * 0.2F, 0.5, (this.ar.i() * 2.0F - 1.0F) * 0.2F));
               this.v(this.ar.i() * 360.0F);
               this.e(false);
               this.aE = true;
            }
         }

         if (this.ai().C && this.bm() && this.dA().h() > 0.03) {
            fis $$0 = this.h(0.0F);
            float $$1 = bcb.b(this.dP() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = bcb.a(this.dP() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ar.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.ai().a(me.av, this.dC() - $$0.d * $$3 + $$1, this.dE() - $$0.e, this.dI() - $$0.f * $$3 + $$2, 0.0, 0.0, 0.0);
               this.ai().a(me.av, this.dC() - $$0.d * $$3 - $$1, this.dE() - $$0.e, this.dI() - $$0.f * $$3 - $$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(me.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(mc $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ar.k() * 0.01;
         double $$3 = this.ar.k() * 0.01;
         double $$4 = this.ar.k() * 0.01;
         this.ai().a($$0, this.d(1.0), this.dF() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(azx.bb)) {
         if (!this.ai().C) {
            this.a(ayz.hx, 1.0F, 1.0F);
         }

         if (this.g_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.d), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.hy;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.hw;
   }

   @Nullable
   @Override
   protected ayy p() {
      return this.bm() ? ayz.hu : ayz.ht;
   }

   @Override
   protected ayy aZ() {
      return ayz.hB;
   }

   @Override
   protected ayy aY() {
      return ayz.hC;
   }

   protected boolean gH() {
      jb $$0 = this.S().h();
      return $$0 != null ? $$0.a(this.dv(), 12.0) : false;
   }

   @Override
   public void k(fis $$0) {
      if (this.bm()) {
         this.a(this.fu(), $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.9));
         if (this.e() == null) {
            this.i(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.k($$0);
      }
   }

   @Override
   public boolean v() {
      return true;
   }

   static class a extends chi {
      private final cmq a;
      private boolean b;

      a(cmq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean W_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.m() && this.a.cw() >= 100;
      }

      @Override
      public boolean c() {
         jb $$0 = this.a.cs;
         return $$0 == null ? false : !jb.a((double)$$0.u(), this.a.dE(), (double)$$0.w()).a(this.a.dv(), 4.0) && !this.b && this.a.cw() >= 100;
      }

      @Override
      public void d() {
         if (this.a.ai() instanceof aub) {
            aub $$0 = (aub)this.a.ai();
            this.b = false;
            this.a.S().n();
            jb $$1 = this.a.dx();
            jb $$2 = $$0.a(baa.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.cs = $$2;
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         jb $$0 = this.a.cs;
         if ($$0 == null || jb.a((double)$$0.u(), this.a.dE(), (double)$$0.w()).a(this.a.dv(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         if (this.a.cs != null) {
            dmu $$0 = this.a.ai();
            if (this.a.gH() || this.a.S().l()) {
               fis $$1 = fis.b(this.a.cs);
               fis $$2 = clg.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
               if ($$2 == null) {
                  $$2 = clg.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
               }

               if ($$2 != null) {
                  jb $$3 = jb.a((jv)$$2);
                  if (!$$0.b_($$3).a(azu.a) || !$$0.a_($$3).a(fba.b)) {
                     $$2 = clg.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
                  }
               }

               if ($$2 == null) {
                  this.b = true;
                  return;
               }

               this.a.P().a($$2.d, $$2.e, $$2.f, this.a.gh() + 20, this.a.gg());
               this.a.S().a($$2.d, $$2.e, $$2.f, 1.3);
               if ($$0.A.a(this.a(80)) == 0) {
                  $$0.a(this.a, (byte)38);
               }
            }
         }
      }
   }

   static class b extends chi {
      private final cmq a;
      private final double b;
      @Nullable
      private cut c;

      b(cmq $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cmq.cp, this.a);
         return this.c == null ? false : this.c.cn() && this.a.e() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cn() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new byq(bys.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.S().n();
      }

      @Override
      public void a() {
         this.a.P().a(this.c, this.a.gh() + 20, this.a.gg());
         if (this.a.g(this.c) < 6.25) {
            this.a.S().n();
         } else {
            this.a.S().a(this.c, this.b);
         }

         if (this.c.cn() && this.c.ai().A.a(6) == 0) {
            this.c.b(new byq(bys.D, 100), this.a);
         }
      }
   }

   class c extends chi {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cmq.this.as) {
            return false;
         } else {
            List<cqz> $$0 = cmq.this.ai().a(cqz.class, cmq.this.cV().c(8.0, 8.0, 8.0), cmq.cl);
            return !$$0.isEmpty() || !cmq.this.a(bzw.a).f();
         }
      }

      @Override
      public void d() {
         List<cqz> $$0 = cmq.this.ai().a(cqz.class, cmq.this.cV().c(8.0, 8.0, 8.0), cmq.cl);
         if (!$$0.isEmpty()) {
            cmq.this.S().a($$0.get(0), 1.2F);
            cmq.this.a(ayz.hA, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         dcv $$0 = cmq.this.a(bzw.a);
         if (!$$0.f()) {
            this.a($$0);
            cmq.this.a(bzw.a, dcv.l);
            this.b = cmq.this.as + cmq.this.ar.a(100);
         }
      }

      @Override
      public void a() {
         List<cqz> $$0 = cmq.this.ai().a(cqz.class, cmq.this.cV().c(8.0, 8.0, 8.0), cmq.cl);
         dcv $$1 = cmq.this.a(bzw.a);
         if (!$$1.f()) {
            this.a($$1);
            cmq.this.a(bzw.a, dcv.l);
         } else if (!$$0.isEmpty()) {
            cmq.this.S().a($$0.get(0), 1.2F);
         }
      }

      private void a(dcv $$0) {
         if (!$$0.f()) {
            double $$1 = cmq.this.dG() - 0.3F;
            cqz $$2 = new cqz(cmq.this.ai(), cmq.this.dC(), $$1, cmq.this.dI(), $$0);
            $$2.b(40);
            $$2.b(cmq.this);
            float $$3 = 0.3F;
            float $$4 = cmq.this.ar.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cmq.this.ar.i();
            $$2.n(
               0.3F * -bcb.a(cmq.this.dP() * (float) (Math.PI / 180.0)) * bcb.b(cmq.this.dR() * (float) (Math.PI / 180.0)) + bcb.b($$4) * $$5,
               0.3F * bcb.a(cmq.this.dR() * (float) (Math.PI / 180.0)) * 1.5F,
               0.3F * bcb.b(cmq.this.dP() * (float) (Math.PI / 180.0)) * bcb.b(cmq.this.dR() * (float) (Math.PI / 180.0)) + bcb.a($$4) * $$5
            );
            cmq.this.ai().b($$2);
         }
      }
   }
}
