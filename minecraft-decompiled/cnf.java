import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cnf extends cmd {
   public static final double ck = 0.6;
   public static final double cl = 0.8;
   public static final double cm = 1.0;
   public static final double co = 2.2;
   public static final double cp = 1.4;
   private static final alh<Integer> cq = all.a(cnf.class, alj.b);
   private static final int cr = 0;
   private static final ame cs = ame.b("killer_bunny");
   private static final int ct = 3;
   private static final int cu = 5;
   private static final ame cv = ame.b("evil");
   private static final int cw = 8;
   private static final int cx = 40;
   private int cy;
   private int cz;
   private boolean cA;
   private int cB;
   int cC = 0;

   public cnf(bzv<? extends cnf> $$0, dmu $$1) {
      super($$0, $$1);
      this.cf = new cnf.c(this);
      this.ce = new cnf.d(this);
      this.i(0.0);
   }

   @Override
   protected void H() {
      this.ch.a(1, new chc(this));
      this.ch.a(1, new cgx(this, this.ai()));
      this.ch.a(1, new cnf.e(this, 2.2));
      this.ch.a(2, new cgu(this, 0.8));
      this.ch.a(3, new ciq(this, 1.0, $$0 -> $$0.a(azx.aR), false));
      this.ch.a(4, new cnf.a<>(this, cut.class, 8.0F, 2.2, 2.2));
      this.ch.a(4, new cnf.a<>(this, cpj.class, 10.0F, 2.2, 2.2));
      this.ch.a(4, new cnf.a<>(this, crv.class, 4.0F, 2.2, 2.2));
      this.ch.a(5, new cnf.f(this));
      this.ch.a(6, new civ(this, 0.6));
      this.ch.a(11, new chq(this, cut.class, 10.0F));
   }

   @Override
   protected float fn() {
      float $$0 = 0.3F;
      if (this.ce.c() <= 0.6) {
         $$0 = 0.2F;
      }

      faz $$1 = this.cg.j();
      if ($$1 != null && !$$1.c()) {
         fis $$2 = $$1.a(this);
         if ($$2.e > this.dE() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.ac || this.bB && this.ce.e() > this.dE() + 0.5) {
         $$0 = 0.5F;
      }

      return super.z($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.ce.c();
      if ($$0 > 0.0) {
         double $$1 = this.dA().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fis(0.0, 0.0, 1.0));
         }
      }

      if (!this.ai().C) {
         this.ai().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cz == 0 ? 0.0F : (this.cy + $$0) / this.cz;
   }

   public void i(double $$0) {
      this.S().a($$0);
      this.ce.a(this.ce.d(), this.ce.e(), this.ce.f(), $$0);
   }

   @Override
   public void t(boolean $$0) {
      super.t($$0);
      if ($$0) {
         this.a(this.t(), this.fk(), ((this.ar.i() - this.ar.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public void m() {
      this.t(true);
      this.cz = 10;
      this.cy = 0;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cq, cnf.g.h.m);
   }

   @Override
   public void a(aub $$0) {
      if (this.cB > 0) {
         this.cB--;
      }

      if (this.cC > 0) {
         this.cC = this.cC - this.ar.a(3);
         if (this.cC < 0) {
            this.cC = 0;
         }
      }

      if (this.aK()) {
         if (!this.cA) {
            this.t(false);
            this.gL();
         }

         if (this.gH() == cnf.g.g && this.cB == 0) {
            cam $$1 = this.e();
            if ($$1 != null && this.g((bzm)$$1) < 16.0) {
               this.c($$1.dC(), $$1.dI());
               this.ce.a($$1.dC(), $$1.dE(), $$1.dI(), this.ce.c());
               this.m();
               this.cA = true;
            }
         }

         cnf.c $$2 = (cnf.c)this.cf;
         if (!$$2.c()) {
            if (this.ce.b() && this.cB == 0) {
               faz $$3 = this.cg.j();
               fis $$4 = new fis(this.ce.d(), this.ce.e(), this.ce.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.m();
            }
         } else if (!$$2.d()) {
            this.gI();
         }
      }

      this.cA = this.aK();
   }

   @Override
   public boolean by() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(bcb.d($$1 - this.dI(), $$0 - this.dC()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gI() {
      ((cnf.c)this.cf).a(true);
   }

   private void gJ() {
      ((cnf.c)this.cf).a(false);
   }

   private void gK() {
      if (this.ce.c() < 2.2) {
         this.cB = 10;
      } else {
         this.cB = 1;
      }
   }

   private void gL() {
      this.gK();
      this.gJ();
   }

   @Override
   public void e_() {
      super.e_();
      if (this.cy != this.cz) {
         this.cy++;
      } else if (this.cz != 0) {
         this.cy = 0;
         this.cz = 0;
         this.t(false);
      }
   }

   public static cbr.a n() {
      return cmd.gM().a(cbs.t, 3.0).a(cbs.w, 0.3F).a(cbs.c, 3.0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("RabbitType", cnf.g.j, this.gH());
      $$0.a("MoreCarrotTicks", this.cC);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cnf.g>a("RabbitType", cnf.g.j).orElse(cnf.g.h));
      this.cC = $$0.a("MoreCarrotTicks", 0);
   }

   protected ayy t() {
      return ayz.wo;
   }

   @Override
   protected ayy p() {
      return ayz.wk;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.wn;
   }

   @Override
   protected ayy f_() {
      return ayz.wm;
   }

   @Override
   public void gA() {
      if (this.gH() == cnf.g.g) {
         this.a(ayz.wl, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public aza do() {
      return this.gH() == cnf.g.g ? aza.f : aza.g;
   }

   @Nullable
   public cnf b(aub $$0, bzc $$1) {
      cnf $$2 = bzv.ba.a($$0, bzu.e);
      if ($$2 != null) {
         cnf.g $$3 = a($$0, this.dx());
         if (this.ar.a(20) != 0) {
            if ($$1 instanceof cnf $$4 && this.ar.h()) {
               $$3 = $$4.gH();
            } else {
               $$3 = this.gH();
            }
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aR);
   }

   public cnf.g gH() {
      return cnf.g.a(this.ay.a(cq));
   }

   private void a(cnf.g $$0) {
      if ($$0 == cnf.g.g) {
         this.h(cbs.a).a(8.0);
         this.ch.a(4, new chs(this, 1.4, true));
         this.ci.a(1, new cja(this).a());
         this.ci.a(2, new cjb<>(this, cut.class, true));
         this.ci.a(2, new cjb<>(this, cpj.class, true));
         this.h(cbs.c).a(new cbq(cv, 5.0, cbq.a.a));
         if (!this.i_()) {
            this.b(xo.c(ag.a("entity", cs)));
         }
      } else {
         this.h(cbs.c).c(cv);
      }

      this.ay.a(cq, $$0.m);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aG ? c((kp<T>)$$0, this.gH()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aG) {
         this.a(c(kq.aG, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cnf.g $$4 = a($$0, this.dx());
      if ($$3 instanceof cnf.b) {
         $$4 = ((cnf.b)$$3).a;
      } else {
         $$3 = new cnf.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cnf.g a(dmv $$0, jb $$1) {
      jl<dnx> $$2 = $$0.v($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(azn.an)) {
         return $$3 < 80 ? cnf.g.b : cnf.g.d;
      } else if ($$2.a(azn.am)) {
         return cnf.g.e;
      } else {
         return $$3 < 50 ? cnf.g.a : ($$3 < 90 ? cnf.g.f : cnf.g.c);
      }
   }

   public static boolean c(bzv<cnf> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.ci) && a((dlv)$$1, $$3);
   }

   boolean gT() {
      return this.cC <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bz();
         this.cz = 10;
         this.cy = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.6F * this.cW(), this.ds() * 0.4F);
   }

   static class a<T extends cam> extends cgp<T> {
      private final cnf i;

      public a(cnf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gH() != cnf.g.g && super.b();
      }
   }

   public static class b extends bzc.a {
      public final cnf.g a;

      public b(cnf.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cgj {
      private final cnf b;
      private boolean c;

      public c(cnf $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.m();
            this.a = false;
         }
      }
   }

   static class d extends cgl {
      private final cnf l;
      private double m;

      public d(cnf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aK() && !this.l.bB && !((cnf.c)this.l.cf).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cgl.a.d) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bm()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cib {
      private final cnf a;

      public e(cnf $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends chv {
      private final cnf g;
      private boolean h;
      private boolean i;

      public f(cnf $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).P().c(dmq.d)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gT();
         }

         return super.b();
      }

      @Override
      public boolean c() {
         return this.i && super.c();
      }

      @Override
      public void a() {
         super.a();
         this.g.P().a(this.e.u() + 0.5, this.e.v() + 1, this.e.w() + 0.5, 10.0F, this.g.gg());
         if (this.m()) {
            dmu $$0 = this.g.ai();
            jb $$1 = this.e.d();
            eeb $$2 = $$0.a_($$1);
            dpz $$3 = $$2.b();
            if (this.i && $$3 instanceof dqt) {
               int $$4 = $$2.c(dqt.f);
               if ($$4 == 0) {
                  $$0.a($$1, dqb.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dqt.f, $$4 - 1), 2);
                  $$0.a(ejb.c, $$1, ejb.a.a(this.g));
                  $$0.c(2001, $$1, dpz.j($$2));
               }

               this.g.cC = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dmx $$0, jb $$1) {
         eeb $$2 = $$0.a_($$1);
         if ($$2.a(dqb.cN) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dqt && ((dqt)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bda {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      public static final cnf.g h = a;
      private static final IntFunction<cnf.g> l = baq.a(cnf.g::a, values(), h);
      public static final Codec<cnf.g> i = bda.a(cnf.g::values);
      @Deprecated
      public static final Codec<cnf.g> j = Codec.INT.xmap(l::apply, cnf.g::a);
      public static final zm<ByteBuf, cnf.g> k = zk.a(l, cnf.g::a);
      final int m;
      private final String n;

      private g(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public String c() {
         return this.n;
      }

      public int a() {
         return this.m;
      }

      public static cnf.g a(int $$0) {
         return l.apply($$0);
      }
   }
}
