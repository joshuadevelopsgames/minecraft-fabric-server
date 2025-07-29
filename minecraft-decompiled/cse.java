import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cse extends cao implements crn {
   private static final alh<Integer> cj = all.a(cse.class, alj.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   private static final boolean ck = false;
   public float d;
   public float e;
   public float f;
   private boolean cl = false;

   public cse(bzv<? extends cse> $$0, dmu $$1) {
      super($$0, $$1);
      this.cR();
      this.ce = new cse.d(this);
   }

   @Override
   protected void H() {
      this.ch.a(1, new cse.b(this));
      this.ch.a(2, new cse.a(this));
      this.ch.a(3, new cse.e(this));
      this.ch.a(5, new cse.c(this));
      this.ci.a(1, new cjb<>(this, cut.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dE() - this.dE()) <= 4.0));
      this.ci.a(3, new cjb<>(this, cmv.class, true));
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cj, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = bcb.a($$0, 1, 127);
      this.ay.a(cj, $$2);
      this.ay();
      this.j_();
      this.h(cbs.t).a($$2 * $$2);
      this.h(cbs.w).a(0.2F + 0.1F * $$2);
      this.h(cbs.c).a($$2);
      if ($$1) {
         this.x(this.fa());
      }

      this.cc = $$2;
   }

   public int gH() {
      return this.ay.a(cj);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Size", this.gH() - 1);
      $$0.a("wasOnGround", this.cl);
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.a("Size", 0) + 1, false);
      super.a($$0);
      this.cl = $$0.a("wasOnGround", false);
   }

   public boolean gI() {
      return this.gH() <= 1;
   }

   protected mc m() {
      return me.X;
   }

   @Override
   protected boolean ag() {
      return this.gH() > 0;
   }

   @Override
   public void g() {
      this.f = this.e;
      this.e = this.e + (this.d - this.e) * 0.5F;
      super.g();
      if (this.aK() && !this.cl) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; $$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ar.i() * (float) (Math.PI * 2);
            float $$4 = this.ar.i() * 0.5F + 0.5F;
            float $$5 = bcb.a($$3) * $$1 * $$4;
            float $$6 = bcb.b($$3) * $$1 * $$4;
            this.ai().a(this.m(), this.dC() + $$5, this.dE(), this.dI() + $$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gF(), this.fk(), ((this.ar.i() - this.ar.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aK() && this.cl) {
         this.d = 1.0F;
      }

      this.cl = this.aK();
      this.t();
   }

   protected void t() {
      this.d *= 0.6F;
   }

   protected int n() {
      return this.ar.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(alh<?> $$0) {
      if (cj.equals($$0)) {
         this.j_();
         this.v(this.bt);
         this.br = this.bt;
         if (this.bm() && this.ar.a(20) == 0) {
            this.bv();
         }
      }

      super.a($$0);
   }

   @Override
   public bzv<? extends cse> ap() {
      return (bzv<? extends cse>)super.ap();
   }

   @Override
   public void a(bzm.e $$0) {
      int $$1 = this.gH();
      if (!this.ai().C && $$1 > 1 && this.eM()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ar.a(3);
         fjs $$6 = this.cu();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ($$7 % 2 - 0.5F) * $$3;
            float $$9 = ($$7 / 2 - 0.5F) * $$3;
            this.a(this.ap(), new bzg(bzh.b, false, false, $$6), bzu.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dC() + $$8, this.dE() + 0.5, this.dI() + $$9, this.ar.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bzm $$0) {
      super.h($$0);
      if ($$0 instanceof cmv && this.gD()) {
         this.i((cam)$$0);
      }
   }

   @Override
   public void a_(cut $$0) {
      if (this.gD()) {
         this.i($$0);
      }
   }

   protected void i(cam $$0) {
      if (this.ai() instanceof aub $$1 && this.bO() && this.h($$0) && this.F($$0)) {
         byb $$2 = this.ea().b((cam)this);
         if ($$0.a($$1, $$2, this.gE())) {
            this.a(ayz.yE, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
            djk.a($$1, (bzm)$$0, $$2);
         }
      }
   }

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      return new fis(0.0, $$1.b() - 0.015625 * this.gH() * $$2, 0.0);
   }

   protected boolean gD() {
      return !this.gI() && this.dl();
   }

   protected float gE() {
      return (float)this.i(cbs.c);
   }

   @Override
   protected ayy e(byb $$0) {
      return this.gI() ? ayz.zJ : ayz.yG;
   }

   @Override
   protected ayy f_() {
      return this.gI() ? ayz.zI : ayz.yF;
   }

   protected ayy gF() {
      return this.gI() ? ayz.zL : ayz.yI;
   }

   public static boolean c(bzv<cse> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      if ($$1.an() != bxg.a) {
         if (bzu.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.v($$3).a(azn.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.C($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dnt)) {
            return false;
         }

         dlz $$5 = new dlz($$3);
         boolean $$6 = ekz.a($$5.h, $$5.i, ((dnt)$$1).F(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fk() {
      return 0.4F * this.gH();
   }

   @Override
   public int gg() {
      return 0;
   }

   protected boolean gJ() {
      return this.gH() > 0;
   }

   @Override
   public void s() {
      fis $$0 = this.dA();
      this.n($$0.d, this.fn(), $$0.f);
      this.aE = true;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float l() {
      float $$0 = this.gI() ? 1.4F : 0.8F;
      return ((this.ar.i() - this.ar.i()) * 0.2F + 1.0F) * $$0;
   }

   protected ayy gG() {
      return this.gI() ? ayz.zK : ayz.yH;
   }

   @Override
   public bzp e(cay $$0) {
      return super.e($$0).a(this.gH());
   }

   static class a extends chi {
      private final cse a;
      private int b;

      public a(cse $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.b));
      }

      @Override
      public boolean b() {
         cam $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.Q() instanceof cse.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         cam $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         cam $$0 = this.a.e();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.Q() instanceof cse.d $$1) {
            $$1.a(this.a.dP(), this.a.gD());
         }
      }
   }

   static class b extends chi {
      private final cse a;

      public b(cse $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.c, chi.a.a));
         $$0.S().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bm() || this.a.bA()) && this.a.Q() instanceof cse.d;
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.ec().i() < 0.8F) {
            this.a.R().a();
         }

         if (this.a.Q() instanceof cse.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends chi {
      private final cse a;

      public c(cse $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.c, chi.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.cc();
      }

      @Override
      public void a() {
         if (this.a.Q() instanceof cse.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cgl {
      private float l;
      private int m;
      private final cse n;
      private boolean o;

      public d(cse $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dP() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cgl.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dP(), this.l, 90.0F));
         this.d.bt = this.d.dP();
         this.d.br = this.d.dP();
         if (this.k != cgl.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cgl.a.a;
            if (this.d.aK()) {
               this.d.B((float)(this.h * this.d.i(cbs.w)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.R().a();
                  if (this.n.gJ()) {
                     this.n.a(this.n.gG(), this.n.fk(), this.n.l());
                  }
               } else {
                  this.n.bC = 0.0F;
                  this.n.bE = 0.0F;
                  this.d.B(0.0F);
               }
            } else {
               this.d.B((float)(this.h * this.d.i(cbs.w)));
            }
         }
      }
   }

   static class e extends chi {
      private final cse a;
      private float b;
      private int c;

      public e(cse $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.b));
      }

      @Override
      public boolean b() {
         return this.a.e() == null && (this.a.aK() || this.a.bm() || this.a.bA() || this.a.d(bys.y)) && this.a.Q() instanceof cse.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ec().a(60));
            this.b = this.a.ec().a(360);
         }

         if (this.a.Q() instanceof cse.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
