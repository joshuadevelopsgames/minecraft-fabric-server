import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cot extends cop implements crz {
   private static final int ck = 5;
   private static final alh<Integer> cl = all.a(cot.class, alj.b);
   private static final alh<Integer> cm = all.a(cot.class, alj.b);
   private static final bzp co = bzv.az.n().a(bzo.a().a(bzn.a, 0.0F, bzv.az.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cp;
   @Nullable
   private cot cq;
   @Nullable
   private cot cr;

   public cot(bzv<? extends cot> $$0, dmu $$1) {
      super($$0, $$1);
      this.S().a(40.0F);
   }

   public boolean gK() {
      return false;
   }

   private void x(int $$0) {
      this.ay.a(cl, Math.max(1, Math.min(5, $$0)));
   }

   private void b(bck $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gL() {
      return this.ay.a(cl);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Variant", cot.d.g, this.gU());
      $$0.a("Strength", this.gL());
   }

   @Override
   protected void a(fda $$0) {
      this.x($$0.a("Strength", 0));
      super.a($$0);
      this.a($$0.<cot.d>a("Variant", cot.d.g).orElse(cot.d.e));
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cim(this, 1.2));
      this.ch.a(2, new chp(this, 2.1F));
      this.ch.a(3, new cih(this, 1.25, 40, 20.0F));
      this.ch.a(3, new cib(this, 1.2));
      this.ch.a(4, new cgu(this, 1.0));
      this.ch.a(5, new ciq(this, 1.25, $$0 -> $$0.a(azx.aM), false));
      this.ch.a(6, new chh(this, 1.0));
      this.ch.a(7, new civ(this, 0.7));
      this.ch.a(8, new chq(this, cut.class, 6.0F));
      this.ch.a(9, new cid(this));
      this.ci.a(1, new cot.c(this));
      this.ci.a(2, new cot.a(this));
   }

   public static cbr.a gT() {
      return m();
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cl, 0);
      $$0.a(cm, 0);
   }

   public cot.d gU() {
      return cot.d.a(this.ay.a(cm));
   }

   private void a(cot.d $$0) {
      this.ay.a(cm, $$0.j);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aN ? c((kp<T>)$$0, this.gU()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aN) {
         this.a(c(kq.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aL);
   }

   @Override
   protected boolean a(cut $$0, dcv $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(dcz.qB)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dqb.iL.h())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gY() && this.Z_() == 0 && this.gO()) {
            $$5 = true;
            this.h($$0);
         }
      }

      if (this.eL() < this.fa() && $$4 > 0.0F) {
         this.d($$4);
         $$5 = true;
      }

      if (this.g_() && $$2 > 0) {
         this.ai().a(me.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.ai().C) {
            this.b_($$2);
            $$5 = true;
         }
      }

      if ($$3 > 0 && ($$5 || !this.gY()) && this.hd() < this.hi() && !this.ai().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.be()) {
         ayy $$6 = this.gJ();
         if ($$6 != null) {
            this.ai().a(null, this.dC(), this.dE(), this.dI(), this.gJ(), this.do(), 1.0F, 1.0F + (this.ar.i() - this.ar.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fm() {
      return this.eM() || this.ha();
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      this.b($$4);
      cot.d $$5;
      if ($$3 instanceof cot.b) {
         $$5 = ((cot.b)$$3).a;
      } else {
         $$5 = ag.a(cot.d.values(), $$4);
         $$3 = new cot.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gI() {
      return false;
   }

   @Override
   protected ayy hg() {
      return ayz.pi;
   }

   @Override
   protected ayy p() {
      return ayz.ph;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.pm;
   }

   @Override
   protected ayy f_() {
      return ayz.pk;
   }

   @Nullable
   @Override
   protected ayy gJ() {
      return ayz.pl;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.po, 0.15F, 1.0F);
   }

   @Override
   protected void t() {
      this.a(ayz.pj, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ac_() {
      return this.n() ? this.gL() : 0;
   }

   @Override
   public boolean e(bzw $$0) {
      return true;
   }

   @Override
   public int hi() {
      return 30;
   }

   @Override
   public boolean a(cmd $$0) {
      return $$0 != this && $$0 instanceof cot && this.hp() && ((cot)$$0).hp();
   }

   @Nullable
   public cot b(aub $$0, bzc $$1) {
      cot $$2 = this.gV();
      if ($$2 != null) {
         this.a($$1, $$2);
         cot $$3 = (cot)$$1;
         int $$4 = this.ar.a(Math.max(this.gL(), $$3.gL())) + 1;
         if (this.ar.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ar.h() ? this.gU() : $$3.gU());
      }

      return $$2;
   }

   @Nullable
   protected cot gV() {
      return bzv.az.a(this.ai(), bzu.e);
   }

   private void k(cam $$0) {
      cvn $$1 = new cvn(this.ai(), this);
      double $$2 = $$0.dC() - this.dC();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dE();
      double $$4 = $$0.dI() - this.dI();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.ai() instanceof aub $$6) {
         cvo.a($$1, $$6, dcv.l, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.be()) {
         this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.pn, this.do(), 1.0F, 1.0F + (this.ar.i() - this.ar.i()) * 0.2F);
      }

      this.cp = true;
   }

   void C(boolean $$0) {
      this.cp = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0) {
            this.a($$2, $$3);
            this.b($$0, $$1, $$2);
         }

         this.eW();
         return true;
      }
   }

   public void gW() {
      if (this.cq != null) {
         this.cq.cr = null;
      }

      this.cq = null;
   }

   public void a(cot $$0) {
      this.cq = $$0;
      this.cq.cr = this;
   }

   public boolean gX() {
      return this.cr != null;
   }

   public boolean hr() {
      return this.cq != null;
   }

   @Nullable
   public cot hs() {
      return this.cq;
   }

   @Override
   protected double gG() {
      return 2.0;
   }

   @Override
   public boolean D() {
      return false;
   }

   @Override
   protected void g(aub $$0) {
      if (!this.hr() && this.g_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean hj() {
      return false;
   }

   @Override
   public void a(cam $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.75 * this.cW(), this.ds() * 0.5);
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? co : super.e($$0);
   }

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cjb<cpj> {
      public a(cot $$0) {
         super($$0, cpj.class, 16, false, true, ($$0x, $$1) -> !((cpj)$$0x).m());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bzc.a {
      public final cot.d a;

      b(cot.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cja {
      public c(cot $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cot $$0 && $$0.cp) {
            $$0.C(false);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static enum d implements bda {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final cot.d e = a;
      private static final IntFunction<cot.d> i = baq.a(cot.d::a, values(), baq.a.c);
      public static final Codec<cot.d> f = bda.a(cot.d::values);
      @Deprecated
      public static final Codec<cot.d> g = Codec.INT.xmap(i::apply, cot.d::a);
      public static final zm<ByteBuf, cot.d> h = zk.a(i, cot.d::a);
      final int j;
      private final String k;

      private d(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      public int a() {
         return this.j;
      }

      public static cot.d a(int $$0) {
         return i.apply($$0);
      }

      @Override
      public String c() {
         return this.k;
      }
   }
}
