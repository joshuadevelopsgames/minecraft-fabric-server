import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmg extends cbi {
   public static final double co = 0.6;
   public static final double cp = 0.8;
   public static final double cq = 1.33;
   private static final alh<jl<cmh>> cr = all.a(cmg.class, alj.x);
   private static final alh<Boolean> cs = all.a(cmg.class, alj.k);
   private static final alh<Boolean> ct = all.a(cmg.class, alj.k);
   private static final alh<Integer> cu = all.a(cmg.class, alj.b);
   private static final amd<cmh> cv = cmi.b;
   private static final dbt cw = dbt.o;
   @Nullable
   private cmg.a<cut> cx;
   @Nullable
   private ciq cy;
   private float cz;
   private float cA;
   private float cB;
   private float cC;
   private boolean cD;
   private float cE;
   private float cF;

   public cmg(bzv<? extends cmg> $$0, dmu $$1) {
      super($$0, $$1);
      this.gZ();
   }

   @Override
   protected void H() {
      this.cy = new cmg.c(this, 0.6, $$0 -> $$0.a(azx.aA), true);
      this.ch.a(1, new chc(this));
      this.ch.a(1, new cbi.a(1.5));
      this.ch.a(2, new cin(this));
      this.ch.a(3, new cmg.b(this));
      this.ch.a(4, this.cy);
      this.ch.a(5, new cgv(this, 1.1, 8));
      this.ch.a(6, new chg(this, 1.0, 10.0F, 5.0F));
      this.ch.a(7, new cgw(this, 0.8));
      this.ch.a(8, new cho(this, 0.3F));
      this.ch.a(9, new chy(this));
      this.ch.a(10, new cgu(this, 0.8));
      this.ch.a(11, new civ(this, 0.8, 1.0000001E-5F));
      this.ch.a(12, new chq(this, cut.class, 10.0F));
      this.ci.a(1, new cje<>(this, cnf.class, false, null));
      this.ci.a(1, new cje<>(this, cnm.class, false, cnm.ck));
   }

   public jl<cmh> gT() {
      return this.ay.a(cr);
   }

   private void b(jl<cmh> $$0) {
      this.ay.a(cr, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      if ($$0 == kq.aP) {
         return c((kp<T>)$$0, this.gT());
      } else {
         return $$0 == kq.aQ ? c((kp<T>)$$0, this.gV()) : super.a($$0);
      }
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aP);
      this.a($$0, kq.aQ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aP) {
         this.b(c(kq.aP, $$1));
         return true;
      } else if ($$0 == kq.aQ) {
         this.a(c(kq.aQ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void A(boolean $$0) {
      this.ay.a(cs, $$0);
   }

   public boolean gU() {
      return this.ay.a(cs);
   }

   void B(boolean $$0) {
      this.ay.a(ct, $$0);
   }

   boolean ha() {
      return this.ay.a(ct);
   }

   public dbt gV() {
      return dbt.a(this.ay.a(cu));
   }

   private void a(dbt $$0) {
      this.ay.a(cu, $$0.a());
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cr, cxc.a(this.eb(), cv));
      $$0.a(cs, false);
      $$0.a(ct, false);
      $$0.a(cu, cw.a());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      cxc.a($$0, this.gT());
      $$0.a("CollarColor", dbt.s, this.gV());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      cxc.a($$0, mn.aL).ifPresent(this::b);
      this.a($$0.<dbt>a("CollarColor", dbt.s).orElse(cw));
   }

   @Override
   public void a(aub $$0) {
      if (this.Q().b()) {
         double $$1 = this.Q().c();
         if ($$1 == 0.6) {
            this.b(cay.f);
            this.i(false);
         } else if ($$1 == 1.33) {
            this.b(cay.a);
            this.i(true);
         } else {
            this.b(cay.a);
            this.i(false);
         }
      } else {
         this.b(cay.a);
         this.i(false);
      }
   }

   @Nullable
   @Override
   protected ayy p() {
      if (this.m()) {
         if (this.gR()) {
            return ayz.eb;
         } else {
            return this.ar.a(4) == 0 ? ayz.ec : ayz.dU;
         }
      } else {
         return ayz.dV;
      }
   }

   @Override
   public int W() {
      return 120;
   }

   public void gW() {
      this.b(ayz.dY);
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.ea;
   }

   @Override
   protected ayy f_() {
      return ayz.dW;
   }

   public static cbr.a gX() {
      return cmd.gM().a(cbs.t, 10.0).a(cbs.w, 0.3F).a(cbs.c, 3.0);
   }

   @Override
   protected void gN() {
      this.a(ayz.dX, 1.0F, 1.0F);
   }

   @Override
   public void g() {
      super.g();
      if (this.cy != null && this.cy.k() && !this.m() && this.as % 100 == 0) {
         this.a(ayz.dZ, 1.0F, 1.0F);
      }

      this.hb();
   }

   private void hb() {
      if ((this.gU() || this.ha()) && this.as % 5 == 0) {
         this.a(ayz.eb, 0.6F + 0.4F * (this.ar.i() - this.ar.i()), 1.0F);
      }

      this.hc();
      this.hd();
      this.cD = false;
      if (this.gU()) {
         jb $$0 = this.dx();

         for (cut $$2 : this.ai().a(cut.class, new fin($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fY()) {
               this.cD = true;
               break;
            }
         }
      }
   }

   public boolean gY() {
      return this.cD;
   }

   private void hc() {
      this.cA = this.cz;
      this.cC = this.cB;
      if (this.gU()) {
         this.cz = Math.min(1.0F, this.cz + 0.15F);
         this.cB = Math.min(1.0F, this.cB + 0.08F);
      } else {
         this.cz = Math.max(0.0F, this.cz - 0.22F);
         this.cB = Math.max(0.0F, this.cB - 0.13F);
      }
   }

   private void hd() {
      this.cF = this.cE;
      if (this.ha()) {
         this.cE = Math.min(1.0F, this.cE + 0.1F);
      } else {
         this.cE = Math.max(0.0F, this.cE - 0.13F);
      }
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cA, this.cz);
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cC, this.cB);
   }

   public float L(float $$0) {
      return bcb.h($$0, this.cF, this.cE);
   }

   @Nullable
   public cmg b(aub $$0, bzc $$1) {
      cmg $$2 = bzv.v.a($$0, bzu.e);
      if ($$2 != null && $$1 instanceof cmg $$3) {
         if (this.ar.h()) {
            $$2.b(this.gT());
         } else {
            $$2.b($$3.gT());
         }

         if (this.m()) {
            $$2.a(this.d());
            $$2.a(true, true);
            dbt $$4 = this.gV();
            dbt $$5 = $$3.gV();
            $$2.a(dbt.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cmd $$0) {
      if (!this.m()) {
         return false;
      } else {
         return !($$0 instanceof cmg $$1) ? false : $$1.m() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      cxc.a(cwz.a($$0, this.dx()), mn.aL).ifPresent(this::b);
      return $$3;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      dcr $$3 = $$2.h();
      if (this.m()) {
         if (this.j($$0)) {
            if ($$3 instanceof dbu $$4) {
               dbt $$5 = $$4.a();
               if ($$5 != this.gV()) {
                  if (!this.ai().B_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gp();
                  }

                  return bxj.a;
               }
            } else if (this.i($$2) && this.eL() < this.fa()) {
               if (!this.ai().B_()) {
                  this.a($$0, $$1, $$2);
                  cyj $$6 = $$2.a(kq.v);
                  this.d($$6 != null ? $$6.a() : 1.0F);
                  this.gN();
               }

               return bxj.a;
            }

            bxj $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gH());
               return bxj.a;
            }

            return $$7;
         }
      } else if (this.i($$2)) {
         if (!this.ai().B_()) {
            this.a($$0, $$1, $$2);
            this.i($$0);
            this.gp();
            this.gN();
         }

         return bxj.a;
      }

      bxj $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gp();
      }

      return $$8;
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aA);
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && this.as > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gZ();
   }

   protected void gZ() {
      if (this.cx == null) {
         this.cx = new cmg.a<>(this, cut.class, 16.0F, 0.8, 1.33);
      }

      this.ch.a(this.cx);
      if (!this.m()) {
         this.ch.a(4, this.cx);
      }
   }

   private void i(cut $$0) {
      if (this.ar.a(3) == 0) {
         this.g($$0);
         this.z(true);
         this.ai().a(this, (byte)7);
      } else {
         this.ai().a(this, (byte)6);
      }
   }

   @Override
   public boolean ch() {
      return this.cl() || super.ch();
   }

   static class a<T extends cam> extends cgp<T> {
      private final cmg i;

      public a(cmg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bzt.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.m() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.m() && super.c();
      }
   }

   static class b extends chi {
      private final cmg a;
      @Nullable
      private cut b;
      @Nullable
      private jb c;
      private int d;

      public b(cmg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.m()) {
            return false;
         } else if (this.a.gH()) {
            return false;
         } else {
            cam $$0 = this.a.U_();
            if ($$0 instanceof cut $$1) {
               this.b = $$1;
               if (!$$0.fY()) {
                  return false;
               }

               if (this.a.g((bzm)this.b) > 100.0) {
                  return false;
               }

               jb $$2 = this.b.dx();
               eeb $$3 = this.a.ai().a_($$2);
               if ($$3.a(azo.Q)) {
                  this.c = $$3.d(dps.f).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new jb($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cmg $$1 : this.a.ai().a(cmg.class, new fin(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gU() || $$1.ha())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.m() && !this.a.gH() && this.b != null && this.b.fY() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.S().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.ai().f(1.0F);
         if (this.b.gy() >= 100 && $$0 > 0.77 && $$0 < 0.8 && this.a.ai().H_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.S().n();
      }

      private void i() {
         bck $$0 = this.a.ec();
         jb.a $$1 = new jb.a();
         $$1.g(this.a.R_() ? this.a.aj_().dx() : this.a.dx());
         this.a.b($$1.u() + $$0.a(11) - 5, $$1.v() + $$0.a(5) - 2, $$1.w() + $$0.a(11) - 5, false);
         $$1.g(this.a.dx());
         this.a
            .a(
               a(this.a),
               fdf.aq,
               ($$1x, $$2) -> $$1x.b(
                  new cqz(
                     $$1x,
                     (double)$$1.u() - bcb.a(this.a.br * (float) (Math.PI / 180.0)),
                     $$1.v(),
                     (double)$$1.w() + bcb.b(this.a.br * (float) (Math.PI / 180.0)),
                     $$2
                  )
               )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.S().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bzm)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends ciq {
      @Nullable
      private cut d;
      private final cmg e;

      public c(cmg $$0, double $$1, Predicate<dcv> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.e = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.d == null && this.a.ec().a(this.a(600)) == 0) {
            this.d = this.c;
         } else if (this.a.ec().a(this.a(500)) == 0) {
            this.d = null;
         }
      }

      @Override
      protected boolean h() {
         return this.d != null && this.d.equals(this.c) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.e.m();
      }
   }
}
