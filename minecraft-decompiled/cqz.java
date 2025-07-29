import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cqz extends bzm implements cbk {
   private static final alh<dcv> c = all.a(cqz.class, alj.h);
   private static final float d = 0.1F;
   public static final float a = 0.2125F;
   private static final int e = 6000;
   private static final int f = 32767;
   private static final int g = -32768;
   private static final int h = 5;
   private static final short i = 0;
   private static final short j = 0;
   private int k = 0;
   private int l = 0;
   private int m = 5;
   @Nullable
   private bzs<bzm> n;
   @Nullable
   private UUID o;
   public final float b;

   public cqz(bzv<? extends cqz> $$0, dmu $$1) {
      super($$0, $$1);
      this.b = this.ar.i() * (float) Math.PI * 2.0F;
      this.v(this.ar.i() * 360.0F);
   }

   public cqz(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public cqz(dmu $$0, double $$1, double $$2, double $$3, dcv $$4, double $$5, double $$6, double $$7) {
      this(bzv.as, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private cqz(cqz $$0) {
      super($$0.ap(), $$0.ai());
      this.a($$0.e().v());
      this.x($$0);
      this.k = $$0.k;
      this.b = $$0.b;
   }

   @Override
   public boolean bk() {
      return this.e().a(azx.U);
   }

   @Nullable
   @Override
   public bzm ah_() {
      return bzs.a(this.n, this.ai(), bzm.class);
   }

   @Override
   public void y(bzm $$0) {
      super.y($$0);
      if ($$0 instanceof cqz $$1) {
         this.n = $$1.n;
      }
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(c, dcv.l);
   }

   @Override
   protected double bg() {
      return 0.04;
   }

   @Override
   public void g() {
      if (this.e().f()) {
         this.at();
      } else {
         super.g();
         if (this.l > 0 && this.l != 32767) {
            this.l--;
         }

         this.X = this.dC();
         this.Y = this.dE();
         this.Z = this.dI();
         fis $$0 = this.dA();
         if (this.bm() && this.b(azu.a) > 0.1F) {
            this.v();
         } else if (this.bA() && this.b(azu.b) > 0.1F) {
            this.w();
         } else {
            this.bi();
         }

         if (this.ai().C) {
            this.aq = false;
         } else {
            this.aq = !this.ai().a(this, this.cV().h(1.0E-7));
            if (this.aq) {
               this.l(this.dC(), (this.cV().b + this.cV().e) / 2.0, this.dI());
            }
         }

         if (!this.aK() || this.dA().j() > 1.0E-5F || (this.as + this.ar()) % 4 == 0) {
            this.a(caq.a, this.dA());
            this.aL();
            float $$1 = 0.98F;
            if (this.aK()) {
               $$1 = this.ai().a_(this.aT()).b().g() * 0.98F;
            }

            this.i(this.dA().d($$1, 0.98, $$1));
            if (this.aK()) {
               fis $$2 = this.dA();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = bcb.a(this.X) != bcb.a(this.dC()) || bcb.a(this.Y) != bcb.a(this.dE()) || bcb.a(this.Z) != bcb.a(this.dI());
         int $$4 = $$3 ? 2 : 40;
         if (this.as % $$4 == 0 && !this.ai().C && this.y()) {
            this.x();
         }

         if (this.k != -32768) {
            this.k++;
         }

         this.aE = this.aE | this.bt();
         if (!this.ai().C) {
            double $$5 = this.dA().d($$0).h();
            if ($$5 > 0.01) {
               this.aE = true;
            }
         }

         if (!this.ai().C && this.k >= 6000) {
            this.at();
         }
      }
   }

   @Override
   public jb aT() {
      return this.f(0.999999F);
   }

   private void v() {
      this.h(0.99F);
   }

   private void w() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fis $$1 = this.dA();
      this.n($$1.d * $$0, $$1.e + ($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void x() {
      if (this.y()) {
         for (cqz $$1 : this.ai().a(cqz.class, this.cV().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.y())) {
            if ($$1.y()) {
               this.a($$1);
               if (this.dU()) {
                  break;
               }
            }
         }
      }
   }

   private boolean y() {
      dcv $$0 = this.e();
      return this.bO() && this.l != 32767 && this.k != -32768 && this.k < 6000 && $$0.M() < $$0.k();
   }

   private void a(cqz $$0) {
      dcv $$1 = this.e();
      dcv $$2 = $$0.e();
      if (Objects.equals(this.o, $$0.o) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(dcv $$0, dcv $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : dcv.c($$0, $$1);
   }

   public static dcv a(dcv $$0, dcv $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      dcv $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cqz $$0, dcv $$1, dcv $$2) {
      dcv $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cqz $$0, dcv $$1, cqz $$2, dcv $$3) {
      a($$0, $$1, $$3);
      $$0.l = Math.max($$0.l, $$2.l);
      $$0.k = Math.min($$0.k, $$2.k);
      if ($$3.f()) {
         $$2.at();
      }
   }

   @Override
   public boolean bl() {
      return !this.e().a(this.ea().a()) || super.bl();
   }

   @Override
   protected boolean aG() {
      return this.m <= 0 ? true : this.as % 10 == 0;
   }

   @Override
   public final boolean b(byb $$0) {
      return this.d($$0) ? false : this.e().a($$0);
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.P().c(dmq.d) && $$1.d() instanceof cao) {
         return false;
      } else if (!this.e().a($$1)) {
         return false;
      } else {
         this.bG();
         this.m = (int)(this.m - $$2);
         this.a(ejb.o, $$1.d());
         if (this.m <= 0) {
            this.e().a(this);
            this.at();
         }

         return true;
      }
   }

   @Override
   public boolean a(dmn $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("Health", (short)this.m);
      $$0.a("Age", (short)this.k);
      $$0.a("PickupDelay", (short)this.l);
      bzs.a(this.n, $$0, "Thrower");
      $$0.b("Owner", kf.a, this.o);
      if (!this.e().f()) {
         $$0.a("Item", dcv.b, this.e());
      }
   }

   @Override
   protected void a(fda $$0) {
      this.m = $$0.a("Health", (short)5);
      this.k = $$0.a("Age", (short)0);
      this.l = $$0.a("PickupDelay", (short)0);
      this.o = $$0.<UUID>a("Owner", kf.a).orElse(null);
      this.n = bzs.a($$0, "Thrower");
      this.a($$0.<dcv>a("Item", dcv.b).orElse(dcv.l));
      if (this.e().f()) {
         this.at();
      }
   }

   @Override
   public void a_(cut $$0) {
      if (!this.ai().C) {
         dcv $$1 = this.e();
         dcr $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.l == 0 && (this.o == null || this.o.equals($$0.cK())) && $$0.gs().g($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.at();
               $$1.e($$3);
            }

            $$0.a(azj.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xo aj() {
      xo $$0 = this.al();
      return $$0 != null ? $$0 : this.e().A();
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Nullable
   @Override
   public bzm b(fbl $$0) {
      bzm $$1 = super.b($$0);
      if (!this.ai().C && $$1 instanceof cqz $$2) {
         $$2.x();
      }

      return $$1;
   }

   public dcv e() {
      return this.au().a(c);
   }

   public void a(dcv $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.e().a((bzm)this);
      }
   }

   @Override
   public void b(@Nullable UUID $$0) {
      this.o = $$0;
   }

   public void b(bzm $$0) {
      this.n = new bzs<>($$0);
   }

   public int f() {
      return this.k;
   }

   public void i() {
      this.l = 10;
   }

   @Override
   public void l() {
      this.l = 0;
   }

   public void m() {
      this.l = 32767;
   }

   public void b(int $$0) {
      this.l = $$0;
   }

   public boolean n() {
      return this.l > 0;
   }

   public void q() {
      this.k = -32768;
   }

   public void s() {
      this.k = -6000;
   }

   public void t() {
      this.m();
      this.k = 5999;
   }

   public static float f(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public cqz u() {
      return new cqz(this);
   }

   @Override
   public aza do() {
      return aza.i;
   }

   @Override
   public float dQ() {
      return 180.0F - f(this.f() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public cbd a_(int $$0) {
      return $$0 == 0 ? cbd.a(this::e, this::a) : super.a_($$0);
   }
}
