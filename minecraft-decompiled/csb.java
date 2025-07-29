import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class csb extends cma implements crn {
   private static final ame d = ame.b("covered");
   private static final cbq e = new cbq(d, 20.0, cbq.a.a);
   protected static final alh<jh> a = all.a(csb.class, alj.q);
   protected static final alh<Byte> b = all.a(csb.class, alj.a);
   protected static final alh<Byte> c = all.a(csb.class, alj.a);
   private static final int f = 6;
   private static final byte ck = 16;
   private static final byte cl = 16;
   private static final int cm = 8;
   private static final int cn = 8;
   private static final int co = 5;
   private static final float cp = 0.05F;
   private static final byte cq = 0;
   private static final jh cr = jh.a;
   static final Vector3f cs = ag.a(() -> {
      kg $$0 = jh.d.q();
      return new Vector3f($$0.u(), $$0.v(), $$0.w());
   });
   private static final float ct = 3.0F;
   private float cu;
   private float cv;
   @Nullable
   private jb cw;
   private int cx;
   private static final float cy = 1.0F;

   public csb(bzv<? extends csb> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
      this.cd = new csb.d(this);
   }

   @Override
   protected void H() {
      this.ch.a(1, new chq(this, cut.class, 8.0F, 0.02F, true));
      this.ch.a(4, new csb.a());
      this.ch.a(7, new csb.f());
      this.ch.a(8, new cid(this));
      this.ci.a(1, new cja(this, this.getClass()).a());
      this.ci.a(2, new csb.e(this));
      this.ci.a(3, new csb.c(this));
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected ayy p() {
      return ayz.ya;
   }

   @Override
   public void X() {
      if (!this.gL()) {
         super.X();
      }
   }

   @Override
   protected ayy f_() {
      return ayz.yg;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.gL() ? ayz.yi : ayz.yh;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, cr);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static cbr.a l() {
      return cao.I().a(cbs.t, 30.0);
   }

   @Override
   protected cgg O() {
      return new csb.b(this);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<jh>a("AttachFace", jh.k).orElse(cr));
      this.ay.a(b, $$0.a("Peek", (byte)0));
      this.ay.a(c, $$0.a("Color", (byte)16));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("AttachFace", jh.k, this.n());
      $$0.a("Peek", this.ay.a(b).byteValue());
      $$0.a("Color", this.ay.a(c).byteValue());
   }

   @Override
   public void g() {
      super.g();
      if (!this.ai().C && !this.cc() && !this.a(this.dx(), this.n())) {
         this.gI();
      }

      if (this.gJ()) {
         this.gK();
      }

      if (this.ai().C) {
         if (this.cx > 0) {
            this.cx--;
         } else {
            this.cw = null;
         }
      }
   }

   private void gI() {
      jh $$0 = this.h(this.dx());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected fin c(fis $$0) {
      float $$1 = L(this.cv);
      jh $$2 = this.n().g();
      return a(this.eq(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - bcb.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gJ() {
      this.cu = this.cv;
      float $$0 = this.gN() * 0.01F;
      if (this.cv == $$0) {
         return false;
      } else {
         if (this.cv > $$0) {
            this.cv = bcb.a(this.cv - 0.05F, $$0, 1.0F);
         } else {
            this.cv = bcb.a(this.cv + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gK() {
      this.ay();
      float $$0 = L(this.cv);
      float $$1 = L(this.cu);
      jh $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.eq();
      if (!($$3 <= 0.0F)) {
         for (bzm $$5 : this.ai().a(this, a(this.eq(), $$2, $$1, $$0, this.dv()), bzt.f.and($$0x -> !$$0x.A(this)))) {
            if (!($$5 instanceof csb) && !$$5.aq) {
               $$5.a(caq.e, new fis($$3 * $$2.j(), $$3 * $$2.k(), $$3 * $$2.l()));
            }
         }
      }
   }

   public static fin a(float $$0, jh $$1, float $$2, fis $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fin a(float $$0, jh $$1, float $$2, float $$3, fis $$4) {
      fin $$5 = new fin(-$$0 * 0.5, 0.0, -$$0 * 0.5, $$0 * 0.5, $$0, $$0 * 0.5);
      double $$6 = Math.max($$2, $$3);
      double $$7 = Math.min($$2, $$3);
      fin $$8 = $$5.b($$1.j() * $$6 * $$0, $$1.k() * $$6 * $$0, $$1.l() * $$6 * $$0)
         .a(-$$1.j() * (1.0 + $$7) * $$0, -$$1.k() * (1.0 + $$7) * $$0, -$$1.l() * (1.0 + $$7) * $$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bzm $$0, boolean $$1) {
      if (this.ai().B_()) {
         this.cw = null;
         this.cx = 0;
      }

      this.a(jh.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bS() {
      super.bS();
      if (this.ai().C) {
         this.cw = this.dx();
      }

      this.bs = 0.0F;
      this.br = 0.0F;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.v(0.0F);
      this.bt = this.dP();
      this.bC();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(caq $$0, fis $$1) {
      if ($$0 == caq.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fis dA() {
      return fis.c;
   }

   @Override
   public void i(fis $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jb $$3 = this.dx();
      if (this.cc()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_(bcb.a($$0) + 0.5, bcb.a($$1 + 0.5), bcb.a($$2) + 0.5);
      }

      if (this.as != 0) {
         jb $$4 = this.dx();
         if (!$$4.equals($$3)) {
            this.ay.a(b, (byte)0);
            this.aE = true;
            if (this.ai().C && !this.cc() && !$$4.equals(this.cw)) {
               this.cw = $$3;
               this.cx = 6;
               this.an = this.dC();
               this.ao = this.dE();
               this.ap = this.dI();
            }
         }
      }
   }

   @Nullable
   protected jh h(jb $$0) {
      for (jh $$1 : jh.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jb $$0, jh $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jh $$2 = $$1.g();
         if (!this.ai().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fin $$3 = a(this.eq(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.ai().a(this, $$3);
         }
      }
   }

   private boolean i(jb $$0) {
      eeb $$1 = this.ai().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dqb.ca) && $$0.equals(this.dx());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gw() && this.bO()) {
         jb $$0 = this.dx();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jb $$2 = $$0.b(bcb.b(this.ar, -8, 8), bcb.b(this.ar, -8, 8), bcb.b(this.ar, -8, 8));
            if ($$2.v() > this.ai().L_() && this.ai().w($$2) && this.ai().F_().a($$2) && this.ai().a(this, new fin($$2).h(1.0E-6))) {
               jh $$3 = this.h($$2);
               if ($$3 != null) {
                  this.an();
                  this.a($$3);
                  this.a(ayz.yl, 1.0F, 1.0F);
                  this.a_($$2.u() + 0.5, $$2.v(), $$2.w() + 0.5);
                  this.ai().a(ejb.R, $$0, ejb.a.a(this));
                  this.ay.a(b, (byte)0);
                  this.g(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public cah l_() {
      return null;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.gL()) {
         bzm $$3 = $$1.c();
         if ($$3 instanceof cvb) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if (this.eL() < this.fa() * 0.5 && this.ar.a(4) == 0) {
            this.m();
         } else if ($$1.a(azp.j)) {
            bzm $$4 = $$1.c();
            if ($$4 != null && $$4.ap() == bzv.bf) {
               this.gM();
            }
         }

         return true;
      }
   }

   private boolean gL() {
      return this.gN() == 0;
   }

   private void gM() {
      fis $$0 = this.dv();
      fin $$1 = this.cV();
      if (!this.gL() && this.m()) {
         int $$2 = this.ai().a(bzv.be, $$1.g(8.0), bzm::bO).size();
         float $$3 = ($$2 - 1) / 5.0F;
         if (!(this.ai().A.i() < $$3)) {
            csb $$4 = bzv.be.a(this.ai(), bzu.e);
            if ($$4 != null) {
               $$4.a(this.t());
               $$4.f($$0);
               this.ai().b($$4);
            }
         }
      }
   }

   @Override
   public boolean j(@Nullable bzm $$0) {
      return this.bO();
   }

   public jh n() {
      return this.ay.a(a);
   }

   private void a(jh $$0) {
      this.ay.a(a, $$0);
   }

   @Override
   public void a(alh<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gN() {
      return this.ay.a(b);
   }

   void b(int $$0) {
      if (!this.ai().C) {
         this.h(cbs.a).c(d);
         if ($$0 == 0) {
            this.h(cbs.a).d(e);
            this.a(ayz.yf, 1.0F, 1.0F);
            this.c(ejb.j);
         } else {
            this.a(ayz.yj, 1.0F, 1.0F);
            this.c(ejb.k);
         }
      }

      this.ay.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cu, this.cv);
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      this.br = 0.0F;
      this.bs = 0.0F;
   }

   @Override
   public int gg() {
      return 180;
   }

   @Override
   public int gh() {
      return 180;
   }

   @Override
   public void h(bzm $$0) {
   }

   @Nullable
   public fis K(float $$0) {
      if (this.cw != null && this.cx > 0) {
         double $$1 = (this.cx - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= this.eq();
         jb $$2 = this.dx();
         double $$3 = ($$2.u() - this.cw.u()) * $$1;
         double $$4 = ($$2.v() - this.cw.v()) * $$1;
         double $$5 = ($$2.w() - this.cw.w()) * $$1;
         return new fis(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float c(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<dbt> $$0) {
      this.ay.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<dbt> t() {
      return Optional.ofNullable(this.gH());
   }

   @Nullable
   public dbt gH() {
      byte $$0 = this.ay.a(c);
      return $$0 != 16 && $$0 <= 15 ? dbt.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aS ? c((kp<T>)$$0, this.gH()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aS);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aS) {
         this.a(Optional.of(c(kq.aS, $$1)));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   class a extends chi {
      private int b;

      public a() {
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         cam $$0 = csb.this.e();
         return $$0 != null && $$0.bO() ? csb.this.ai().an() != bxg.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         csb.this.b(100);
      }

      @Override
      public void e() {
         csb.this.b(0);
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         if (csb.this.ai().an() != bxg.a) {
            this.b--;
            cam $$0 = csb.this.e();
            if ($$0 != null) {
               csb.this.P().a($$0, 180.0F, 180.0F);
               double $$1 = csb.this.g((bzm)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + csb.this.ar.a(10) * 20 / 2;
                     csb.this.ai().b(new cvr(csb.this.ai(), csb.this, $$0, csb.this.n().o()));
                     csb.this.a(ayz.yk, 2.0F, (csb.this.ar.i() - csb.this.ar.i()) * 0.2F + 1.0F);
                  }
               } else {
                  csb.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cgg {
      public b(cao $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cjb<cam> {
      public c(csb $$0) {
         super($$0, cam.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof crn);
      }

      @Override
      public boolean b() {
         return this.e.cu() == null ? false : super.b();
      }

      @Override
      protected fin a(double $$0) {
         jh $$1 = ((csb)this.e).n();
         if ($$1.o() == jh.a.a) {
            return this.e.cV().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jh.a.c ? this.e.cV().c($$0, $$0, 4.0) : this.e.cV().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cgk {
      public d(final cao $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jh $$0 = csb.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(csb.cs));
         kg $$2 = $$0.q();
         Vector3f $$3 = new Vector3f($$2.u(), $$2.v(), $$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dC();
         double $$5 = this.f - this.a.dG();
         double $$6 = this.g - this.a.dI();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(bcb.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cjb<cut> {
      public e(final csb $$0) {
         super($$0, cut.class, true);
      }

      @Override
      public boolean b() {
         return csb.this.ai().an() == bxg.a ? false : super.b();
      }

      @Override
      protected fin a(double $$0) {
         jh $$1 = ((csb)this.e).n();
         if ($$1.o() == jh.a.a) {
            return this.e.cV().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jh.a.c ? this.e.cV().c($$0, $$0, 4.0) : this.e.cV().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends chi {
      private int b;

      @Override
      public boolean b() {
         return csb.this.e() == null && csb.this.ar.a(b(40)) == 0 && csb.this.a(csb.this.dx(), csb.this.n());
      }

      @Override
      public boolean c() {
         return csb.this.e() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + csb.this.ar.a(3)));
         csb.this.b(30);
      }

      @Override
      public void e() {
         if (csb.this.e() == null) {
            csb.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
