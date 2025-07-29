import java.util.EnumSet;
import javax.annotation.Nullable;

public class csj extends crv implements cbk {
   public static final float a = 45.836624F;
   public static final int b = bcb.f((float) (Math.PI * 5.0 / 4.0));
   protected static final alh<Byte> c = all.a(csj.class, alj.a);
   private static final int d = 1;
   @Nullable
   private bzs<cao> e;
   @Nullable
   private jb f;
   private boolean ck;
   private int cl;

   public csj(bzv<? extends csj> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new csj.c(this);
      this.cc = 3;
   }

   @Override
   public boolean bd() {
      return this.as % b == 0;
   }

   @Override
   protected boolean aO() {
      return !this.dU();
   }

   @Override
   public void g() {
      this.aq = true;
      super.g();
      this.aq = false;
      this.g(true);
      if (this.ck && --this.cl <= 0) {
         this.cl = 20;
         this.a(this.ea().j(), 1.0F);
      }
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(4, new csj.a());
      this.ch.a(8, new csj.d());
      this.ch.a(9, new chq(this, cut.class, 3.0F, 1.0F));
      this.ch.a(10, new chq(this, cao.class, 8.0F));
      this.ci.a(1, new cja(this, cwk.class).a());
      this.ci.a(2, new csj.b(this));
      this.ci.a(3, new cjb<>(this, cut.class, true));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 14.0).a(cbs.c, 4.0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.f = $$0.<jb>a("bound_pos", jb.a).orElse(null);
      $$0.e("life_ticks").ifPresentOrElse(this::b, () -> this.ck = false);
      this.e = bzs.a($$0, "owner");
   }

   @Override
   public void y(bzm $$0) {
      super.y($$0);
      if ($$0 instanceof csj $$1) {
         this.e = $$1.e;
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("bound_pos", jb.a, this.f);
      if (this.ck) {
         $$0.a("life_ticks", this.cl);
      }

      bzs.a(this.e, $$0, "owner");
   }

   @Nullable
   public cao m() {
      return bzs.a(this.e, this.ai(), cao.class);
   }

   @Nullable
   public jb n() {
      return this.f;
   }

   public void h(@Nullable jb $$0) {
      this.f = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.ay.a(c);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.ay.a(c);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ay.a(c, (byte)($$2 & 0xFF));
   }

   public boolean t() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(cao $$0) {
      this.e = new bzs<>($$0);
   }

   public void b(int $$0) {
      this.ck = true;
      this.cl = $$0;
   }

   @Override
   protected ayy p() {
      return ayz.Cr;
   }

   @Override
   protected ayy f_() {
      return ayz.Ct;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Cu;
   }

   @Override
   public float bB() {
      return 1.0F;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      this.a(bzw.a, new dcv(dcz.qg));
      this.a(bzw.a, 0.0F);
   }

   class a extends chi {
      public a() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         cam $$0 = csj.this.e();
         return $$0 != null && $$0.bO() && !csj.this.Q().b() && csj.this.ar.a(b(7)) == 0 ? csj.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return csj.this.Q().b() && csj.this.t() && csj.this.e() != null && csj.this.e().bO();
      }

      @Override
      public void d() {
         cam $$0 = csj.this.e();
         if ($$0 != null) {
            fis $$1 = $$0.bI();
            csj.this.ce.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         csj.this.x(true);
         csj.this.a(ayz.Cs, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         csj.this.x(false);
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         cam $$0 = csj.this.e();
         if ($$0 != null) {
            if (csj.this.cV().c($$0.cV())) {
               csj.this.c(a(csj.this.ai()), $$0);
               csj.this.x(false);
            } else {
               double $$1 = csj.this.g($$0);
               if ($$1 < 9.0) {
                  fis $$2 = $$0.bI();
                  csj.this.ce.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cji {
      private final clc b = clc.b().d().e();

      public b(final cau $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         cao $$0 = csj.this.m();
         return $$0 != null && $$0.e() != null && this.a($$0.e(), this.b);
      }

      @Override
      public void d() {
         cao $$0 = csj.this.m();
         csj.this.g($$0 != null ? $$0.e() : null);
         super.d();
      }
   }

   class c extends cgl {
      public c(final csj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cgl.a.b) {
            fis $$0 = new fis(this.e - csj.this.dC(), this.f - csj.this.dE(), this.g - csj.this.dI());
            double $$1 = $$0.g();
            if ($$1 < csj.this.cV().a()) {
               this.k = cgl.a.a;
               csj.this.i(csj.this.dA().c(0.5));
            } else {
               csj.this.i(csj.this.dA().e($$0.c(this.h * 0.05 / $$1)));
               if (csj.this.e() == null) {
                  fis $$2 = csj.this.dA();
                  csj.this.v(-((float)bcb.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  csj.this.br = csj.this.dP();
               } else {
                  double $$3 = csj.this.e().dC() - csj.this.dC();
                  double $$4 = csj.this.e().dI() - csj.this.dI();
                  csj.this.v(-((float)bcb.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  csj.this.br = csj.this.dP();
               }
            }
         }
      }
   }

   class d extends chi {
      public d() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         return !csj.this.Q().b() && csj.this.ar.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jb $$0 = csj.this.n();
         if ($$0 == null) {
            $$0 = csj.this.dx();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jb $$2 = $$0.b(csj.this.ar.a(15) - 7, csj.this.ar.a(11) - 5, csj.this.ar.a(15) - 7);
            if (csj.this.ai().w($$2)) {
               csj.this.ce.a($$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, 0.25);
               if (csj.this.e() == null) {
                  csj.this.P().a($$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
