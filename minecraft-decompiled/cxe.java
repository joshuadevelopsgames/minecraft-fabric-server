import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cxe extends cxy implements cak {
   private static final alh<Boolean> r = all.a(cxe.class, alj.k);
   private static final alh<Boolean> s = all.a(cxe.class, alj.k);
   private static final alh<Integer> t = all.a(cxe.class, alj.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int u = 60;
   private static final float aM = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] aN = new float[2];
   private float aO;
   private float aP;
   private final cah aQ = new cah(this, 3);
   private boolean aR;
   private boolean aS;
   private boolean aT;
   private boolean aU;
   private double aV;
   private float aW;
   private cxe.a aX;
   private cxe.a aY;
   private double aZ;
   private boolean ba;
   private boolean bb;
   private float bc;
   private float bd;
   private float be;
   @Nullable
   private cak.a bf;
   private final Supplier<dcr> bg;

   public cxe(bzv<? extends cxe> $$0, dmu $$1, Supplier<dcr> $$2) {
      super($$0, $$1);
      this.bg = $$2;
      this.V = true;
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.X = $$0;
      this.Y = $$1;
      this.Z = $$2;
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(r, false);
      $$0.a(s, false);
      $$0.a(t, 0);
   }

   @Override
   public boolean i(bzm $$0) {
      return a(this, $$0);
   }

   public static boolean a(bzm $$0, bzm $$1) {
      return ($$1.j($$0) || $$1.bL()) && !$$0.A($$1);
   }

   @Override
   public boolean j(@Nullable bzm $$0) {
      return true;
   }

   @Override
   public boolean bL() {
      return true;
   }

   @Override
   public fis a(jh.a $$0, m.a $$1) {
      return cam.l(super.a($$0, $$1));
   }

   protected abstract double b(bzp var1);

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      float $$3 = this.m();
      if (this.da().size() > 1) {
         int $$4 = this.da().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cmd) {
            $$3 += 0.2F;
         }
      }

      return new fis(0.0, this.b($$1), $$3).b(-this.dP() * (float) (Math.PI / 180.0));
   }

   @Override
   public void a(boolean $$0, jb $$1) {
      if (this.ai() instanceof aub) {
         this.ba = true;
         this.bb = $$0;
         if (this.R() == 0) {
            this.m(60);
         }
      }

      if (!this.bq() && this.ar.a(100) == 0) {
         this.ai().a(this.dC(), this.dE(), this.dI(), this.aZ(), this.do(), 1.0F, 0.8F + 0.4F * this.ar.i(), false);
         this.ai().a(me.ap, this.dC() + this.ar.i(), this.dE() + 0.7, this.dI() + this.ar.i(), 0.0, 0.0, 0.0);
         this.a(ejb.O, this.cY());
      }
   }

   @Override
   public void h(bzm $$0) {
      if ($$0 instanceof cxe) {
         if ($$0.cV().b < this.cV().e) {
            super.h($$0);
         }
      } else if ($$0.cV().b <= this.cV().b) {
         super.h($$0);
      }
   }

   @Override
   public void q(float $$0) {
      this.l(-this.J());
      this.d(10);
      this.a(this.G() * 11.0F);
   }

   @Override
   public boolean bK() {
      return !this.dU();
   }

   @Override
   public cah l_() {
      return this.aQ;
   }

   @Override
   public jh cT() {
      return this.cS().h();
   }

   @Override
   public void g() {
      this.aY = this.aX;
      this.aX = this.L();
      if (this.aX != cxe.a.b && this.aX != cxe.a.c) {
         this.aO = 0.0F;
      } else {
         this.aO++;
      }

      if (!this.ai().C && this.aO >= 60.0F) {
         this.bR();
      }

      if (this.I() > 0) {
         this.d(this.I() - 1);
      }

      if (this.G() > 0.0F) {
         this.a(this.G() - 1.0F);
      }

      super.g();
      this.aQ.e();
      if (this.di()) {
         if (!(this.db() instanceof cut)) {
            this.a(false, false);
         }

         this.P();
         if (this.ai().C) {
            this.Q();
            this.ai().a(new aio(this.c(0), this.c(1)));
         }

         this.a(caq.a, this.dA());
      } else {
         this.i(fis.c);
      }

      this.aL();
      this.aL();
      this.K();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.be()
               && this.aN[$$0] % (float) (Math.PI * 2) <= (float) (Math.PI / 4)
               && (this.aN[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
               ayy $$1 = this.f();
               if ($$1 != null) {
                  fis $$2 = this.h(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.ai().a(null, this.dC() + $$3, this.dE(), this.dI() + $$4, $$1, this.do(), 1.0F, 0.8F + 0.4F * this.ar.i());
               }
            }

            this.aN[$$0] = this.aN[$$0] + (float) (Math.PI / 8);
         } else {
            this.aN[$$0] = 0.0F;
         }
      }

      List<bzm> $$5 = this.ai().a(this, this.cV().c(0.2F, -0.01F, 0.2F), bzt.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.ai().C && !(this.cY() instanceof cut);

         for (bzm $$7 : $$5) {
            if (!$$7.z(this)) {
               if ($$6
                  && this.da().size() < this.n()
                  && !$$7.cc()
                  && this.C($$7)
                  && $$7 instanceof cam
                  && !($$7 instanceof cnn)
                  && !($$7 instanceof cut)
                  && !($$7 instanceof csz)) {
                  $$7.o(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void K() {
      if (this.ai().C) {
         int $$0 = this.R();
         if ($$0 > 0) {
            this.bc += 0.05F;
         } else {
            this.bc -= 0.1F;
         }

         this.bc = bcb.a(this.bc, 0.0F, 1.0F);
         this.be = this.bd;
         this.bd = 10.0F * (float)Math.sin(0.5 * this.as) * this.bc;
      } else {
         if (!this.ba) {
            this.m(0);
         }

         int $$1 = this.R();
         if ($$1 > 0) {
            this.m(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.m(0);
               fis $$3 = this.dA();
               if (this.bb) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bR();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof cut) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.ba = false;
         }
      }
   }

   @Nullable
   protected ayy f() {
      return switch (this.L()) {
         case a, b, c -> ayz.cm;
         case d -> ayz.cl;
         default -> null;
      };
   }

   public void a(boolean $$0, boolean $$1) {
      this.ay.a(r, $$0);
      this.ay.a(s, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? bcb.b(this.aN[$$0] - (float) (Math.PI / 8), this.aN[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public cak.a T_() {
      return this.bf;
   }

   @Override
   public void a(@Nullable cak.a $$0) {
      this.bf = $$0;
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.88F * this.dt(), 0.64F * this.ds());
   }

   @Override
   public boolean D() {
      return true;
   }

   @Override
   public fis[] E() {
      return cak.a(this, 0.0, 0.64, 0.382, 0.88);
   }

   private cxe.a L() {
      cxe.a $$0 = this.O();
      if ($$0 != null) {
         this.aV = this.cV().e;
         return $$0;
      } else if (this.N()) {
         return cxe.a.a;
      } else {
         float $$1 = this.l();
         if ($$1 > 0.0F) {
            this.aW = $$1;
            return cxe.a.d;
         } else {
            return cxe.a.e;
         }
      }
   }

   public float i() {
      fin $$0 = this.cV();
      int $$1 = bcb.a($$0.a);
      int $$2 = bcb.c($$0.d);
      int $$3 = bcb.a($$0.e);
      int $$4 = bcb.c($$0.e - this.aZ);
      int $$5 = bcb.a($$0.c);
      int $$6 = bcb.c($$0.f);
      jb.a $$7 = new jb.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               fal $$12 = this.ai().b_($$7);
               if ($$12.a(azu.a)) {
                  $$9 = Math.max($$9, $$12.a(this.ai(), $$7));
               }

               if ($$9 >= 1.0F) {
                  continue label39;
               }
            }
         }

         if ($$9 < 1.0F) {
            return $$7.v() + $$9;
         }
      }

      return $$4 + 1;
   }

   public float l() {
      fin $$0 = this.cV();
      fin $$1 = new fin($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = bcb.a($$1.a) - 1;
      int $$3 = bcb.c($$1.d) + 1;
      int $$4 = bcb.a($$1.b) - 1;
      int $$5 = bcb.c($$1.e) + 1;
      int $$6 = bcb.a($$1.c) - 1;
      int $$7 = bcb.c($$1.f) + 1;
      fjm $$8 = fjj.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      jb.a $$11 = new jb.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     eeb $$16 = this.ai().a_($$11);
                     if (!($$16.b() instanceof dzt) && fjj.c($$16.g(this.ai(), $$11).a($$11), $$8, fiw.i)) {
                        $$9 += $$16.b().g();
                        $$10++;
                     }
                  }
               }
            }
         }
      }

      return $$9 / $$10;
   }

   private boolean N() {
      fin $$0 = this.cV();
      int $$1 = bcb.a($$0.a);
      int $$2 = bcb.c($$0.d);
      int $$3 = bcb.a($$0.b);
      int $$4 = bcb.c($$0.b + 0.001);
      int $$5 = bcb.a($$0.c);
      int $$6 = bcb.c($$0.f);
      boolean $$7 = false;
      this.aV = -Double.MAX_VALUE;
      jb.a $$8 = new jb.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               fal $$12 = this.ai().b_($$8);
               if ($$12.a(azu.a)) {
                  float $$13 = $$10 + $$12.a(this.ai(), $$8);
                  this.aV = Math.max((double)$$13, this.aV);
                  $$7 |= $$0.b < $$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cxe.a O() {
      fin $$0 = this.cV();
      double $$1 = $$0.e + 0.001;
      int $$2 = bcb.a($$0.a);
      int $$3 = bcb.c($$0.d);
      int $$4 = bcb.a($$0.e);
      int $$5 = bcb.c($$1);
      int $$6 = bcb.a($$0.c);
      int $$7 = bcb.c($$0.f);
      boolean $$8 = false;
      jb.a $$9 = new jb.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               fal $$13 = this.ai().b_($$9);
               if ($$13.a(azu.a) && $$1 < $$9.v() + $$13.a(this.ai(), $$9)) {
                  if (!$$13.b()) {
                     return cxe.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cxe.a.b : null;
   }

   @Override
   protected double bg() {
      return 0.04;
   }

   private void P() {
      double $$0 = -this.bh();
      double $$1 = 0.0;
      float $$2 = 0.05F;
      if (this.aY == cxe.a.e && this.aX != cxe.a.e && this.aX != cxe.a.d) {
         this.aV = this.e(1.0);
         double $$3 = this.i() - this.dt() + 0.101;
         if (this.ai().a(this, this.cV().d(0.0, $$3 - this.dE(), 0.0))) {
            this.a_(this.dC(), $$3, this.dI());
            this.i(this.dA().d(1.0, 0.0, 1.0));
            this.aZ = 0.0;
         }

         this.aX = cxe.a.a;
      } else {
         if (this.aX == cxe.a.a) {
            $$1 = (this.aV - this.dE()) / this.dt();
            $$2 = 0.9F;
         } else if (this.aX == cxe.a.c) {
            $$0 = -7.0E-4;
            $$2 = 0.9F;
         } else if (this.aX == cxe.a.b) {
            $$1 = 0.01F;
            $$2 = 0.45F;
         } else if (this.aX == cxe.a.e) {
            $$2 = 0.9F;
         } else if (this.aX == cxe.a.d) {
            $$2 = this.aW;
            if (this.cY() instanceof cut) {
               this.aW /= 2.0F;
            }
         }

         fis $$4 = this.dA();
         this.n($$4.d * $$2, $$4.e + $$0, $$4.f * $$2);
         this.aP *= $$2;
         if ($$1 > 0.0) {
            fis $$5 = this.dA();
            this.n($$5.d, ($$5.e + $$1 * (this.bg() / 0.65)) * 0.75, $$5.f);
         }
      }
   }

   private void Q() {
      if (this.cd()) {
         float $$0 = 0.0F;
         if (this.aR) {
            this.aP--;
         }

         if (this.aS) {
            this.aP++;
         }

         if (this.aS != this.aR && !this.aT && !this.aU) {
            $$0 += 0.005F;
         }

         this.v(this.dP() + this.aP);
         if (this.aT) {
            $$0 += 0.04F;
         }

         if (this.aU) {
            $$0 -= 0.005F;
         }

         this.i(this.dA().b(bcb.a(-this.dP() * (float) (Math.PI / 180.0)) * $$0, 0.0, bcb.b(this.dP() * (float) (Math.PI / 180.0)) * $$0));
         this.a(this.aS && !this.aR || this.aT, this.aR && !this.aS || this.aT);
      }
   }

   protected float m() {
      return 0.0F;
   }

   public boolean C(bzm $$0) {
      return $$0.ds() < this.ds();
   }

   @Override
   protected void a(bzm $$0, bzm.b $$1) {
      super.a($$0, $$1);
      if (!$$0.ap().a(azs.s)) {
         $$0.v($$0.dP() + this.aP);
         $$0.r($$0.cE() + this.aP);
         this.D($$0);
         if ($$0 instanceof cmd && this.da().size() == this.n()) {
            int $$2 = $$0.ar() % 2 == 0 ? 90 : 270;
            $$0.s(((cmd)$$0).br + $$2);
            $$0.r($$0.cE() + $$2);
         }
      }
   }

   @Override
   public fis b(cam $$0) {
      fis $$1 = a(this.ds() * bcb.g, $$0.ds(), $$0.dP());
      double $$2 = this.dC() + $$1.d;
      double $$3 = this.dI() + $$1.f;
      jb $$4 = jb.a($$2, this.cV().e, $$3);
      jb $$5 = $$4.e();
      if (!this.ai().B($$5)) {
         List<fis> $$6 = Lists.newArrayList();
         double $$7 = this.ai().j($$4);
         if (cxm.a($$7)) {
            $$6.add(new fis($$2, $$4.v() + $$7, $$3));
         }

         double $$8 = this.ai().j($$5);
         if (cxm.a($$8)) {
            $$6.add(new fis($$2, $$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fV().iterator();

         while (var14.hasNext()) {
            cay $$9 = (cay)var14.next();

            for (fis $$10 : $$6) {
               if (cxm.a(this.ai(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void D(bzm $$0) {
      $$0.s(this.dP());
      float $$1 = bcb.h($$0.dP() - this.dP());
      float $$2 = bcb.a($$1, -105.0F, 105.0F);
      $$0.aa += $$2 - $$1;
      $$0.v($$0.dP() + $$2 - $$1);
      $$0.r($$0.dP());
   }

   @Override
   public void l(bzm $$0) {
      this.D($$0);
   }

   @Override
   protected void a(fdc $$0) {
      this.a($$0, this.bf);
   }

   @Override
   protected void a(fda $$0) {
      this.b($$0);
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      bxj $$2 = super.a($$0, $$1);
      if ($$2 != bxj.e) {
         return $$2;
      } else {
         return (bxj)($$0.gh() || !(this.aO < 60.0F) || !this.ai().C && !$$0.o(this) ? bxj.e : bxj.a);
      }
   }

   @Override
   public void a(bzm.e $$0) {
      if (!this.ai().C && $$0.a() && this.R_()) {
         this.S_();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
      this.aZ = this.dA().e;
      if (!this.cc()) {
         if ($$1) {
            this.j();
         } else if (!this.ai().b_(this.dx().e()).a(azu.a) && $$0 < 0.0) {
            this.am -= (float)$$0;
         }
      }
   }

   public boolean c(int $$0) {
      return this.ay.a($$0 == 0 ? r : s) && this.cY() != null;
   }

   private void m(int $$0) {
      this.ay.a(t, $$0);
   }

   private int R() {
      return this.ay.a(t);
   }

   public float b(float $$0) {
      return bcb.h($$0, this.be, this.bd);
   }

   @Override
   protected boolean s(bzm $$0) {
      return this.da().size() < this.n() && !this.a(azu.a);
   }

   protected int n() {
      return 2;
   }

   @Nullable
   @Override
   public cam cY() {
      return this.db() instanceof cam $$0 ? $$0 : super.cY();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.aR = $$0;
      this.aS = $$1;
      this.aT = $$2;
      this.aU = $$3;
   }

   @Override
   public boolean bq() {
      return this.aX == cxe.a.b || this.aX == cxe.a.c;
   }

   @Override
   protected final dcr p() {
      return this.bg.get();
   }

   @Override
   public final dcv dM() {
      return new dcv(this.bg.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
