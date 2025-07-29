import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cmy extends cmd {
   private static final alh<Integer> cm = all.a(cmy.class, alj.b);
   private static final alh<Integer> co = all.a(cmy.class, alj.b);
   private static final alh<Integer> cp = all.a(cmy.class, alj.b);
   private static final alh<Byte> cq = all.a(cmy.class, alj.a);
   private static final alh<Byte> cr = all.a(cmy.class, alj.a);
   private static final alh<Byte> cs = all.a(cmy.class, alj.a);
   static final clc ct = clc.b().a(8.0);
   private static final bzp cu = bzv.aP.n().a(0.5F).a(bzo.a().a(bzn.a, 0.0F, 0.40625F, 0.0F));
   private static final int cv = 2;
   private static final int cw = 4;
   private static final int cx = 8;
   private static final int cy = 16;
   private static final int cz = 5;
   public static final int ck = 32;
   private static final int cA = 32;
   boolean cB;
   boolean cC;
   public int cl;
   private fis cD;
   private float cE;
   private float cF;
   private float cG;
   private float cH;
   private float cI;
   private float cJ;
   cmy.g cM;

   public cmy(bzv<? extends cmy> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cmy.h(this);
      if (!this.g_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bzw $$0) {
      return $$0 == bzw.a && this.fU();
   }

   public int m() {
      return this.ay.a(cm);
   }

   public void s(int $$0) {
      this.ay.a(cm, $$0);
   }

   public boolean n() {
      return this.v(2);
   }

   public boolean t() {
      return this.v(8);
   }

   public void x(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gH() {
      return this.v(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gI() {
      return this.ay.a(cp) > 0;
   }

   public void z(boolean $$0) {
      this.ay.a(cp, $$0 ? 1 : 0);
   }

   private int he() {
      return this.ay.a(cp);
   }

   private void u(int $$0) {
      this.ay.a(cp, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gJ() {
      return this.ay.a(co);
   }

   public void t(int $$0) {
      this.ay.a(co, $$0);
   }

   public cmy.a gK() {
      return cmy.a.a(this.ay.a(cq));
   }

   public void a(cmy.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cmy.a.a(this.ar);
      }

      this.ay.a(cq, (byte)$$0.a());
   }

   public cmy.a gL() {
      return cmy.a.a(this.ay.a(cr));
   }

   public void b(cmy.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cmy.a.a(this.ar);
      }

      this.ay.a(cr, (byte)$$0.a());
   }

   public boolean gT() {
      return this.v(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cm, 0);
      $$0.a(co, 0);
      $$0.a(cq, (byte)0);
      $$0.a(cr, (byte)0);
      $$0.a(cs, (byte)0);
      $$0.a(cp, 0);
   }

   private boolean v(int $$0) {
      return (this.ay.a(cs) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.ay.a(cs);
      if ($$1) {
         this.ay.a(cs, (byte)($$2 | $$0));
      } else {
         this.ay.a(cs, (byte)($$2 & ~$$0));
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("MainGene", cmy.a.h, this.gK());
      $$0.a("HiddenGene", cmy.a.h, this.gL());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cmy.a>a("MainGene", cmy.a.h).orElse(cmy.a.a));
      this.b($$0.<cmy.a>a("HiddenGene", cmy.a.h).orElse(cmy.a.a));
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      cmy $$2 = bzv.aP.a($$0, bzu.e);
      if ($$2 != null) {
         if ($$1 instanceof cmy $$3) {
            $$2.a(this, $$3);
         }

         $$2.hc();
      }

      return $$2;
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(2, new cmy.i(this, 2.0));
      this.ch.a(2, new cmy.d(this, 1.0));
      this.ch.a(3, new cmy.b(this, 1.2F, true));
      this.ch.a(4, new ciq(this, 1.0, $$0 -> $$0.a(azx.aO), false));
      this.ch.a(6, new cmy.c<>(this, cut.class, 8.0F, 2.0, 2.0));
      this.ch.a(6, new cmy.c<>(this, crv.class, 4.0F, 2.0, 2.0));
      this.ch.a(7, new cmy.k());
      this.ch.a(8, new cmy.f(this));
      this.ch.a(8, new cmy.l(this));
      this.cM = new cmy.g(this, cut.class, 6.0F);
      this.ch.a(9, this.cM);
      this.ch.a(10, new cid(this));
      this.ch.a(12, new cmy.j(this));
      this.ch.a(13, new chh(this, 1.25));
      this.ch.a(14, new civ(this, 1.0));
      this.ci.a(1, new cmy.e(this).a(new Class[0]));
   }

   public static cbr.a gU() {
      return cmd.gM().a(cbs.w, 0.15F).a(cbs.c, 6.0);
   }

   public cmy.a gV() {
      return cmy.a.a(this.gK(), this.gL());
   }

   public boolean gW() {
      return this.gV() == cmy.a.b;
   }

   public boolean gX() {
      return this.gV() == cmy.a.c;
   }

   public boolean gY() {
      return this.gV() == cmy.a.d;
   }

   public boolean gZ() {
      return this.gV() == cmy.a.e;
   }

   public boolean ha() {
      return this.gV() == cmy.a.f;
   }

   @Override
   public boolean gy() {
      return this.gV() == cmy.a.g;
   }

   @Override
   public boolean v() {
      return false;
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      if (!this.gy()) {
         this.cC = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gA() {
      this.a(ayz.tR, 1.0F, 1.0F);
   }

   @Override
   public void g() {
      super.g();
      if (this.gX()) {
         if (this.ai().ag() && !this.bm()) {
            this.x(true);
            this.z(false);
         } else if (!this.gI()) {
            this.x(false);
         }
      }

      cam $$0 = this.e();
      if ($$0 == null) {
         this.cB = false;
         this.cC = false;
      }

      if (this.m() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.m() == 29 || this.m() == 14) {
            this.a(ayz.tN, 1.0F, 1.0F);
         }

         this.s(this.m() - 1);
      }

      if (this.n()) {
         this.t(this.gJ() + 1);
         if (this.gJ() > 20) {
            this.A(false);
            this.hl();
         } else if (this.gJ() == 1) {
            this.a(ayz.tH, 1.0F, 1.0F);
         }
      }

      if (this.gT()) {
         this.hk();
      } else {
         this.cl = 0;
      }

      if (this.t()) {
         this.w(0.0F);
      }

      this.hh();
      this.hf();
      this.hi();
      this.hj();
   }

   public boolean hb() {
      return this.gX() && this.ai().ag();
   }

   private void hf() {
      if (!this.gI() && this.t() && !this.hb() && !this.a(bzw.a).f() && this.ar.a(80) == 1) {
         this.z(true);
      } else if (this.a(bzw.a).f() || !this.t()) {
         this.z(false);
      }

      if (this.gI()) {
         this.hg();
         if (!this.ai().C && this.he() > 80 && this.ar.a(20) == 1) {
            if (this.he() > 100 && this.a(bzw.a).a(azx.aP)) {
               if (!this.ai().C) {
                  this.a(bzw.a, dcv.l);
                  this.c(ejb.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.u(this.he() + 1);
      }
   }

   private void hg() {
      if (this.he() % 5 == 0) {
         this.a(ayz.tL, 0.5F + 0.5F * this.ar.a(2), (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fis $$1 = new fis((this.ar.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, (this.ar.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dR() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dP() * (float) (Math.PI / 180.0));
            double $$2 = -this.ar.i() * 0.6 - 0.3;
            fis $$3 = new fis((this.ar.i() - 0.5) * 0.8, $$2, 1.0 + (this.ar.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.br * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dC(), this.dG() + 1.0, this.dI());
            this.ai().a(new ma(me.U, this.a(bzw.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void hh() {
      this.cF = this.cE;
      if (this.t()) {
         this.cE = Math.min(1.0F, this.cE + 0.15F);
      } else {
         this.cE = Math.max(0.0F, this.cE - 0.19F);
      }
   }

   private void hi() {
      this.cH = this.cG;
      if (this.gH()) {
         this.cG = Math.min(1.0F, this.cG + 0.15F);
      } else {
         this.cG = Math.max(0.0F, this.cG - 0.19F);
      }
   }

   private void hj() {
      this.cJ = this.cI;
      if (this.gT()) {
         this.cI = Math.min(1.0F, this.cI + 0.15F);
      } else {
         this.cI = Math.max(0.0F, this.cI - 0.19F);
      }
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cF, this.cE);
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cH, this.cG);
   }

   public float L(float $$0) {
      return bcb.h($$0, this.cJ, this.cI);
   }

   private void hk() {
      this.cl++;
      if (this.cl > 32) {
         this.B(false);
      } else {
         if (!this.ai().C) {
            fis $$0 = this.dA();
            if (this.cl == 1) {
               float $$1 = this.dP() * (float) (Math.PI / 180.0);
               float $$2 = this.g_() ? 0.1F : 0.2F;
               this.cD = new fis($$0.d + -bcb.a($$1) * $$2, 0.0, $$0.f + bcb.b($$1) * $$2);
               this.i(this.cD.b(0.0, 0.27, 0.0));
            } else if (this.cl != 7.0F && this.cl != 15.0F && this.cl != 23.0F) {
               this.n(this.cD.d, $$0.e, this.cD.f);
            } else {
               this.n(0.0, this.aK() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void hl() {
      fis $$0 = this.dA();
      dmu $$1 = this.ai();
      $$1.a(
         me.aj,
         this.dC() - (this.ds() + 1.0F) * 0.5 * bcb.a(this.br * (float) (Math.PI / 180.0)),
         this.dG() - 0.1F,
         this.dI() + (this.ds() + 1.0F) * 0.5 * bcb.b(this.br * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(ayz.tI, 1.0F, 1.0F);

      for (cmy $$3 : $$1.a(cmy.class, this.cV().g(10.0))) {
         if (!$$3.g_() && $$3.aK() && !$$3.bm() && $$3.hd()) {
            $$3.s();
         }
      }

      if (this.ai() instanceof aub $$4 && $$4.P().c(dmq.g)) {
         this.a($$4, fdf.aH, this::a);
      }
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      if (this.a(bzw.a).f() && b($$1)) {
         this.a($$1);
         dcv $$2 = $$1.e();
         this.a(bzw.a, $$2);
         this.g(bzw.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      this.a(cmy.a.a($$4));
      this.b(cmy.a.a($$4));
      this.hc();
      if ($$3 == null) {
         $$3 = new bzc.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cmy $$0, @Nullable cmy $$1) {
      if ($$1 == null) {
         if (this.ar.h()) {
            this.a($$0.hm());
            this.b(cmy.a.a(this.ar));
         } else {
            this.a(cmy.a.a(this.ar));
            this.b($$0.hm());
         }
      } else if (this.ar.h()) {
         this.a($$0.hm());
         this.b($$1.hm());
      } else {
         this.a($$1.hm());
         this.b($$0.hm());
      }

      if (this.ar.a(32) == 0) {
         this.a(cmy.a.a(this.ar));
      }

      if (this.ar.a(32) == 0) {
         this.b(cmy.a.a(this.ar));
      }
   }

   private cmy.a hm() {
      return this.ar.h() ? this.gK() : this.gL();
   }

   public void hc() {
      if (this.ha()) {
         this.h(cbs.t).a(10.0);
      }

      if (this.gW()) {
         this.h(cbs.w).a(0.07F);
      }
   }

   void hn() {
      if (!this.bm()) {
         this.G(0.0F);
         this.S().n();
         this.x(true);
      }
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (this.hb()) {
         return bxj.e;
      } else if (this.gH()) {
         this.y(false);
         return bxj.a;
      } else if (this.i($$2)) {
         if (this.e() != null) {
            this.cB = true;
         }

         if (this.g_()) {
            this.a($$0, $$1, $$2);
            this.a((int)(-this.Z_() / 20 * 0.1F), true);
         } else if (!this.ai().C && this.Z_() == 0 && this.gO()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
         } else {
            if (!(this.ai() instanceof aub $$3) || this.t() || this.bm()) {
               return bxj.e;
            }

            this.hn();
            this.z(true);
            dcv $$4 = this.a(bzw.a);
            if (!$$4.f() && !$$0.gc()) {
               this.a($$3, $$4);
            }

            this.a(bzw.a, new dcv($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bxj.b;
      } else {
         return bxj.e;
      }
   }

   @Nullable
   @Override
   protected ayy p() {
      if (this.gy()) {
         return ayz.tO;
      } else {
         return this.gX() ? ayz.tP : ayz.tJ;
      }
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.tM, 0.15F, 1.0F);
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aO);
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.tK;
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return ayz.tQ;
   }

   public boolean hd() {
      return !this.gH() && !this.hb() && !this.gI() && !this.gT() && !this.t();
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cu : super.e($$0);
   }

   private static boolean b(cqz $$0) {
      return $$0.e().a(azx.aP) && $$0.bO() && !$$0.n();
   }

   public static enum a implements bda {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final Codec<cmy.a> h = bda.a(cmy.a::values);
      private static final IntFunction<cmy.a> i = baq.a(cmy.a::a, values(), baq.a.a);
      private static final int j = 6;
      private final int k;
      private final String l;
      private final boolean m;

      private a(final int $$0, final String $$1, final boolean $$2) {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
      }

      public int a() {
         return this.k;
      }

      @Override
      public String c() {
         return this.l;
      }

      public boolean b() {
         return this.m;
      }

      static cmy.a a(cmy.a $$0, cmy.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cmy.a a(int $$0) {
         return i.apply($$0);
      }

      public static cmy.a a(bck $$0) {
         int $$1 = $$0.a(16);
         if ($$1 == 0) {
            return b;
         } else if ($$1 == 1) {
            return c;
         } else if ($$1 == 2) {
            return d;
         } else if ($$1 == 4) {
            return g;
         } else if ($$1 < 9) {
            return f;
         } else {
            return $$1 < 11 ? e : a;
         }
      }
   }

   static class b extends chs {
      private final cmy b;

      public b(cmy $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.hd() && super.b();
      }
   }

   static class c<T extends cam> extends cgp<T> {
      private final cmy i;

      public c(cmy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bzt.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gX() && this.i.hd() && super.b();
      }
   }

   static class d extends cgu {
      private final cmy d;
      private int e;

      public d(cmy $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.m() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.as) {
               this.d.s(32);
               this.e = this.d.as + 600;
               if (this.d.dl()) {
                  cut $$0 = this.b.a(cmy.ct, this.d);
                  this.d.cM.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jb $$0 = this.d.dx();
         jb.a $$1 = new jb.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dqb.nG)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cja {
      private final cmy a;

      public e(cmy $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.cB && !this.a.cC) {
            return super.c();
         } else {
            this.a.g(null);
            return false;
         }
      }

      @Override
      protected void a(cao $$0, cam $$1) {
         if ($$0 instanceof cmy && $$0.gy()) {
            $$0.g($$1);
         }
      }
   }

   static class f extends chi {
      private final cmy a;
      private int b;

      public f(cmy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.as && this.a.gW() && this.a.hd() && this.a.ar.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bm() && (this.a.gW() || this.a.ar.a(b(600)) != 1) ? this.a.ar.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.y(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
         this.b = this.a.as + 200;
      }
   }

   static class g extends chq {
      private final cmy h;

      public g(cmy $$0, Class<? extends cam> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(cam $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.ec().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               aub $$0 = a(this.b);
               if (this.f == cut.class) {
                  this.c = $$0.a(this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
               } else {
                  this.c = $$0.a(this.b.ai().a(this.f, this.b.cV().c(this.d, 3.0, this.d), $$0x -> true), this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
               }
            }

            return this.h.hd() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cgl {
      private final cmy l;

      public h(cmy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.hd()) {
            super.a();
         }
      }
   }

   static class i extends cib {
      private final cmy a;

      public i(cmy $$0, double $$1) {
         super($$0, $$1, azp.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.t()) {
            this.a.S().n();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends chi {
      private final cmy a;

      public j(cmy $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.a, chi.a.b, chi.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.g_() || this.a.gY()) && this.a.aK()) {
            if (!this.a.hd()) {
               return false;
            } else {
               float $$0 = this.a.dP() * (float) (Math.PI / 180.0);
               float $$1 = -bcb.a($$0);
               float $$2 = bcb.b($$0);
               int $$3 = Math.abs($$1) > 0.5 ? bcb.j((double)$$1) : 0;
               int $$4 = Math.abs($$2) > 0.5 ? bcb.j((double)$$2) : 0;
               if (this.a.ai().a_(this.a.dx().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gY() && this.a.ar.a(b(60)) == 1 ? true : this.a.ar.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         this.a.B(true);
      }

      @Override
      public boolean W_() {
         return false;
      }
   }

   class k extends chi {
      private int b;

      public k() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cmy.this.as || cmy.this.g_() || cmy.this.bm() || !cmy.this.hd() || cmy.this.m() > 0) {
            return false;
         } else {
            return !cmy.this.a(bzw.a).f() ? true : !cmy.this.ai().a(cqz.class, cmy.this.cV().c(6.0, 6.0, 6.0), cmy::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cmy.this.bm() && (cmy.this.gW() || cmy.this.ar.a(b(600)) != 1) ? cmy.this.ar.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cmy.this.t() && !cmy.this.a(bzw.a).f()) {
            cmy.this.hn();
         }
      }

      @Override
      public void d() {
         if (cmy.this.a(bzw.a).f()) {
            List<cqz> $$0 = cmy.this.ai().a(cqz.class, cmy.this.cV().c(8.0, 8.0, 8.0), cmy::b);
            if (!$$0.isEmpty()) {
               cmy.this.S().a($$0.getFirst(), 1.2F);
            }
         } else {
            cmy.this.hn();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         dcv $$0 = cmy.this.a(bzw.a);
         if (!$$0.f()) {
            cmy.this.a(a(cmy.this.ai()), $$0);
            cmy.this.a(bzw.a, dcv.l);
            int $$1 = cmy.this.gW() ? cmy.this.ar.a(50) + 10 : cmy.this.ar.a(150) + 10;
            this.b = cmy.this.as + $$1 * 20;
         }

         cmy.this.x(false);
      }
   }

   static class l extends chi {
      private final cmy a;

      public l(cmy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.g_() && this.a.hd()) {
            return this.a.ha() && this.a.ar.a(b(500)) == 1 ? true : this.a.ar.a(b(6000)) == 1;
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         this.a.A(true);
      }
   }
}
