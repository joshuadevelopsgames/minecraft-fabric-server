import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cvb extends cvo {
   private static final double d = 2.0;
   private static final int f = 7;
   private static final float g = 0.6F;
   private static final float h = 0.99F;
   private static final short i = 0;
   private static final byte j = 0;
   private static final boolean k = false;
   private static final boolean l = false;
   private static final byte m = 0;
   private static final alh<Byte> n = all.a(cvb.class, alj.a);
   private static final alh<Byte> o = all.a(cvb.class, alj.a);
   private static final alh<Boolean> p = all.a(cvb.class, alj.k);
   private static final int q = 1;
   private static final int r = 2;
   @Nullable
   private eeb s;
   protected int a;
   public cvb.a b = cvb.a.a;
   public int c = 0;
   private int t = 0;
   private double u = 2.0;
   private ayy aM = this.i();
   @Nullable
   private IntOpenHashSet aN;
   @Nullable
   private List<bzm> aO;
   private dcv aP = this.n();
   @Nullable
   private dcv aQ = null;

   protected cvb(bzv<? extends cvb> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected cvb(bzv<? extends cvb> $$0, double $$1, double $$2, double $$3, dmu $$4, dcv $$5, @Nullable dcv $$6) {
      this($$0, $$4);
      this.aP = $$5.v();
      this.c($$5);
      bdk $$7 = $$5.e(kq.u);
      if ($$7 != null) {
         this.b = cvb.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof aub $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.aQ = $$6.v();
         int $$9 = djk.a($$8, $$6, this.aP);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cvb(bzv<? extends cvb> $$0, cam $$1, dmu $$2, dcv $$3, @Nullable dcv $$4) {
      this($$0, $$1.dC(), $$1.dG() - 0.1F, $$1.dI(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(ayy $$0) {
      this.aM = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cV().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cO();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(n, (byte)0);
      $$0.a(o, (byte)0);
      $$0.a(p, false);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.t = 0;
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      super.k($$0, $$1, $$2);
      this.t = 0;
      if (this.e() && bcb.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (!this.ax && this.c <= 0 && $$0.equals(p) && this.e()) {
         this.c = 7;
      }
   }

   @Override
   public void g() {
      boolean $$0 = !this.v();
      fis $$1 = this.dA();
      jb $$2 = this.dx();
      eeb $$3 = this.ai().a_($$2);
      if (!$$3.l() && $$0) {
         fjm $$4 = $$3.g(this.ai(), $$2);
         if (!$$4.c()) {
            fis $$5 = this.dv();

            for (fin $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.i(fis.c);
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.c > 0) {
         this.c--;
      }

      if (this.bo()) {
         this.aI();
      }

      if (this.e() && $$0) {
         if (!this.ai().B_()) {
            if (this.s != $$3 && this.x()) {
               this.A();
            } else {
               this.f();
            }
         }

         this.a++;
         if (this.bO()) {
            this.aL();
         }

         if (!this.ai().C) {
            this.d(this.aH() > 0);
         }
      } else {
         this.a = 0;
         fis $$7 = this.dv();
         if (this.bm()) {
            this.b(this.u());
            this.a($$7);
         }

         if (this.s()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.ai().a(me.f, $$7.d + $$1.d * $$8 / 4.0, $$7.e + $$1.e * $$8 / 4.0, $$7.f + $$1.f * $$8 / 4.0, -$$1.d, -$$1.e + 0.2, -$$1.f);
            }
         }

         float $$9;
         if (!$$0) {
            $$9 = (float)(bcb.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(bcb.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(bcb.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(f(this.dR(), $$11));
         this.v(f(this.dP(), $$9));
         if ($$0) {
            fio $$12 = this.ai().b(new dmb($$7, $$7.e($$1), dmb.a.a, dmb.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aL();
         }

         if (!this.bm()) {
            this.b(0.99F);
         }

         if ($$0 && !this.e()) {
            this.bi();
         }

         super.g();
      }
   }

   private void b(fio $$0) {
      while (this.bO()) {
         fis $$1 = this.dv();
         fip $$2 = this.b($$1, $$0.g());
         fis $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.aF != null && this.aF.e()) {
            this.bZ();
         }

         if ($$2 == null) {
            if (this.bO() && $$0.d() != fiq.a.a) {
               this.b((fiq)$$0);
               this.aE = true;
            }
            break;
         } else if (this.bO() && !this.aq) {
            cvp $$4 = this.b($$2);
            this.aE = true;
            if (this.t() > 0 && $$4 == cvp.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fis $$1 = this.dA();
      this.i($$1.c((double)$$0));
   }

   private void a(fis $$0) {
      fis $$1 = this.dA();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.ai().a(me.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bg() {
      return 0.05;
   }

   private boolean x() {
      return this.e() && this.ai().b(new fin(this.dv(), this.dv()).g(0.06));
   }

   private void A() {
      this.a(false);
      fis $$0 = this.dA();
      this.i($$0.d(this.ar.i() * 0.2F, this.ar.i() * 0.2F, this.ar.i() * 0.2F));
      this.t = 0;
   }

   protected boolean e() {
      return this.ay.a(p);
   }

   protected void a(boolean $$0) {
      this.ay.a(p, $$0);
   }

   @Override
   public boolean cN() {
      return !this.e();
   }

   @Override
   public void a(caq $$0, fis $$1) {
      super.a($$0, $$1);
      if ($$0 != caq.a && this.x()) {
         this.A();
      }
   }

   protected void f() {
      this.t++;
      if (this.t >= 1200) {
         this.at();
      }
   }

   private void B() {
      if (this.aO != null) {
         this.aO.clear();
      }

      if (this.aN != null) {
         this.aN.clear();
      }
   }

   @Override
   protected void b(dcr $$0) {
      this.aQ = null;
   }

   @Override
   public void a(boolean $$0, jb $$1) {
      if (!this.e()) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.e()) {
         super.m($$0);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.e()) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      bzm $$1 = $$0.a();
      float $$2 = (float)this.dA().g();
      double $$3 = this.u;
      bzm $$4 = this.ah_();
      byb $$5 = this.ea().a(this, (bzm)($$4 != null ? $$4 : this));
      if (this.ed() != null && this.ai() instanceof aub $$6) {
         $$3 = djk.a($$6, this.ed(), $$1, $$5, (float)$$3);
      }

      int $$7 = bcb.c(bcb.a($$2 * $$3, 0.0, 2.147483647E9));
      if (this.t() > 0) {
         if (this.aN == null) {
            this.aN = new IntOpenHashSet(5);
         }

         if (this.aO == null) {
            this.aO = Lists.newArrayListWithCapacity(5);
         }

         if (this.aN.size() >= this.t() + 1) {
            this.at();
            return;
         }

         this.aN.add($$1.ar());
      }

      if (this.s()) {
         long $$8 = this.ar.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + $$7, 2147483647L);
      }

      if ($$4 instanceof cam $$9) {
         $$9.C($$1);
      }

      boolean $$10 = $$1.ap() == bzv.O;
      int $$11 = $$1.aH();
      if (this.cb() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, $$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof cam $$12) {
            if (!this.ai().C && this.t() <= 0) {
               $$12.o($$12.fc() + 1);
            }

            this.a($$12, $$5);
            if (this.ai() instanceof aub $$13) {
               djk.a($$13, $$12, $$5, this.ed());
            }

            this.a($$12);
            if ($$12 instanceof cut && $$4 instanceof auc $$14 && !this.be() && $$12 != $$14) {
               $$14.g.b(new adx(adx.h, 0.0F));
            }

            if (!$$1.bO() && this.aO != null) {
               this.aO.add($$12);
            }

            if (!this.ai().C && $$4 instanceof auc $$15) {
               if (this.aO != null) {
                  aq.H.a($$15, this.aO, this.aQ);
               } else if (!$$1.bO()) {
                  aq.H.a($$15, List.of($$1), this.aQ);
               }
            }
         }

         this.a(this.aM, 1.0F, 1.2F / (this.ar.i() * 0.2F + 0.9F));
         if (this.t() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cvp.b, $$1, this.ah_(), false);
         this.i(this.dA().c(0.2));
         if (this.ai() instanceof aub $$16 && this.dA().h() < 1.0E-7) {
            if (this.b == cvb.a.b) {
               this.a($$16, this.m(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(cam $$0, byb $$1) {
      double $$3 = this.aQ != null && this.ai() instanceof aub $$2 ? djk.d($$2, this.aQ, $$0, $$1, 0.0F) : 0.0F;
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.i(cbs.q));
         fis $$5 = this.dA().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.i($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fio $$0) {
      this.s = this.ai().a_($$0.b());
      super.a($$0);
      dcv $$1 = this.ed();
      if (this.ai() instanceof aub $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fis $$3 = this.dA();
      fis $$4 = new fis(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fis $$5 = $$4.c(0.05F);
      this.b(this.dv().d($$5));
      this.i(fis.c);
      this.a(this.l(), 1.0F, 1.2F / (this.ar.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(ayz.aE);
      this.B();
   }

   protected void a(aub $$0, fio $$1, dcv $$2) {
      fis $$3 = $$1.b().a($$1.g());
      djk.a($$0, $$2, this.ah_() instanceof cam $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.aQ = null);
   }

   @Override
   public dcv ed() {
      return this.aQ;
   }

   protected ayy i() {
      return ayz.aE;
   }

   protected final ayy l() {
      return this.aM;
   }

   protected void a(cam $$0) {
   }

   @Nullable
   protected fip b(fis $$0, fis $$1) {
      return cvq.a(this.ai(), this, $$0, $$1, this.cV().b(this.dA()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bzm $$0) {
      return $$0 instanceof cut && this.ah_() instanceof cut $$1 && !$$1.a((cut)$$0) ? false : super.b($$0) && (this.aN == null || !this.aN.contains($$0.ar()));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("life", (short)this.t);
      $$0.b("inBlockState", eeb.a, this.s);
      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.e());
      $$0.a("pickup", cvb.a.d, this.b);
      $$0.a("damage", this.u);
      $$0.a("crit", this.s());
      $$0.a("PierceLevel", this.t());
      $$0.a("SoundEvent", mm.b.q(), this.aM);
      $$0.a("item", dcv.b, this.aP);
      $$0.b("weapon", dcv.b, this.aQ);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.t = $$0.a("life", (short)0);
      this.s = $$0.<eeb>a("inBlockState", eeb.a).orElse(null);
      this.c = $$0.a("shake", (byte)0) & 255;
      this.a($$0.a("inGround", false));
      this.u = $$0.a("damage", 2.0);
      this.b = $$0.<cvb.a>a("pickup", cvb.a.d).orElse(cvb.a.a);
      this.b($$0.a("crit", false));
      this.a($$0.a("PierceLevel", (byte)0));
      this.aM = $$0.<ayy>a("SoundEvent", mm.b.q()).orElse(this.i());
      this.a($$0.<dcv>a("item", dcv.b).orElse(this.n()));
      this.aQ = $$0.<dcv>a("weapon", dcv.b).orElse(null);
   }

   @Override
   public void c(@Nullable bzm $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case cut $$1 when this.b == cvb.a.a -> cvb.a.b;
         case cas $$2 -> cvb.a.a;
         case null, default -> this.b;
      };
   }

   @Override
   public void a_(cut $$0) {
      if (!this.ai().C && (this.e() || this.v()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cut $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gs().g(this.m());
         case c -> $$0.gc();
      };
   }

   protected dcv m() {
      return this.aP.v();
   }

   protected abstract dcv n();

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   public dcv q() {
      return this.aP;
   }

   public void h(double $$0) {
      this.u = $$0;
   }

   @Override
   public boolean cF() {
      return this.ap().a(azs.H);
   }

   public void b(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.ay.a(o, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.ay.a(n);
      if ($$1) {
         this.ay.a(n, (byte)($$2 | $$0));
      } else {
         this.ay.a(n, (byte)($$2 & ~$$0));
      }
   }

   protected void a(dcv $$0) {
      if (!$$0.f()) {
         this.aP = $$0;
      } else {
         this.aP = this.n();
      }
   }

   public boolean s() {
      byte $$0 = this.ay.a(n);
      return ($$0 & 1) != 0;
   }

   public byte t() {
      return this.ay.a(o);
   }

   public void a(float $$0) {
      this.h($$0 * 2.0F + this.ar.a(this.ai().an().a() * 0.11, 0.57425));
   }

   protected float u() {
      return 0.6F;
   }

   public void r(boolean $$0) {
      this.aq = $$0;
      this.a(2, $$0);
   }

   public boolean v() {
      return !this.ai().C ? this.aq : (this.ay.a(n) & 2) != 0;
   }

   @Override
   public boolean bK() {
      return super.bK() && !this.e();
   }

   @Override
   public cbd a_(int $$0) {
      return $$0 == 0 ? cbd.a(this::q, this::a) : super.a_($$0);
   }

   @Override
   protected boolean w() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static final Codec<cvb.a> d = Codec.BYTE.xmap(cvb.a::a, $$0 -> (byte)$$0.ordinal());

      public static cvb.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
