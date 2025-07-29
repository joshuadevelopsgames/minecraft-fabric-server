import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cvj extends cvo implements cvl {
   private static final alh<dcv> a = all.a(cvj.class, alj.h);
   private static final alh<OptionalInt> b = all.a(cvj.class, alj.v);
   private static final alh<Boolean> c = all.a(cvj.class, alj.k);
   private static final int d = 0;
   private static final int f = 0;
   private static final boolean g = false;
   private int h = 0;
   private int i = 0;
   @Nullable
   private cam j;

   public cvj(bzv<? extends cvj> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvj(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      super(bzv.aa, $$0);
      this.h = 0;
      this.a_($$1, $$2, $$3);
      this.ay.a(a, $$4.v());
      int $$5 = 1;
      dfk $$6 = $$4.a(kq.aj);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ar.a(0.0, 0.002297), 0.05, this.ar.a(0.0, 0.002297));
      this.i = 10 * $$5 + this.ar.a(6) + this.ar.a(7);
   }

   public cvj(dmu $$0, @Nullable bzm $$1, double $$2, double $$3, double $$4, dcv $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cvj(dmu $$0, dcv $$1, cam $$2) {
      this($$0, $$2, $$2.dC(), $$2.dE(), $$2.dI(), $$1);
      this.ay.a(b, OptionalInt.of($$2.ar()));
      this.j = $$2;
   }

   public cvj(dmu $$0, dcv $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ay.a(c, $$5);
   }

   public cvj(dmu $$0, dcv $$1, bzm $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(a, n());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.l();
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return super.j($$0, $$1, $$2) && !this.l();
   }

   @Override
   public void g() {
      super.g();
      fiq $$6;
      if (this.l()) {
         if (this.j == null) {
            this.ay.a(b).ifPresent($$0x -> {
               bzm $$1x = this.ai().a($$0x);
               if ($$1x instanceof cam) {
                  this.j = (cam)$$1x;
               }
            });
         }

         if (this.j != null) {
            fis $$4;
            if (this.j.fQ()) {
               fis $$0 = this.j.bW();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fis $$3 = this.j.dA();
               this.j.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.j.a(dcz.vW);
            } else {
               $$4 = fis.c;
            }

            this.a_(this.j.dC() + $$4.d, this.j.dE() + $$4.e, this.j.dI() + $$4.f);
            this.i(this.j.dA());
         }

         $$6 = cvq.a(this, this::b);
      } else {
         if (!this.f()) {
            double $$7 = this.ac ? 1.0 : 1.15;
            this.i(this.dA().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fis $$8 = this.dA();
         $$6 = cvq.a(this, this::b);
         this.a(caq.a, $$8);
         this.aL();
         this.i($$8);
      }

      if (!this.aq && this.bO() && $$6.d() != fiq.a.a) {
         this.b($$6);
         this.aE = true;
      }

      this.z();
      if (this.h == 0 && !this.be()) {
         this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.jC, aza.i, 3.0F, 1.0F);
      }

      this.h++;
      if (this.ai().C && this.h % 2 < 2) {
         this.ai().a(me.D, this.dC(), this.dE(), this.dI(), this.ar.k() * 0.05, -this.dA().e * 0.5, this.ar.k() * 0.05);
      }

      if (this.h > this.i && this.ai() instanceof aub $$10) {
         this.b($$10);
      }
   }

   private void b(aub $$0) {
      $$0.a(this, (byte)17);
      this.a(ejb.w, this.ah_());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fio $$0) {
      jb $$1 = new jb($$0.b());
      this.ai().a_($$1).a(this.ai(), $$1, this, cae.a);
      if (this.ai() instanceof aub $$2 && this.i()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean i() {
      return !this.m().isEmpty();
   }

   private void e(aub $$0) {
      float $$1 = 0.0F;
      List<dfj> $$2 = this.m();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + $$2.size() * 2;
      }

      if ($$1 > 0.0F) {
         if (this.j != null) {
            this.j.a($$0, this.ea().a(this, this.ah_()), 5.0F + $$2.size() * 2);
         }

         double $$3 = 5.0;
         fis $$4 = this.dv();

         for (cam $$6 : this.ai().a(cam.class, this.cV().g(5.0))) {
            if ($$6 != this.j && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fis $$9 = new fis($$6.dC(), $$6.e(0.5 * $$8), $$6.dI());
                  fiq $$10 = this.ai().a(new dmb($$4, $$9, dmb.a.a, dmb.b.a, this));
                  if ($$10.d() == fiq.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - this.f($$6)) / 5.0);
                  $$6.a($$0, this.ea().a(this, this.ah_()), $$11);
               }
            }
         }
      }
   }

   private boolean l() {
      return this.ay.a(b).isPresent();
   }

   @Override
   public boolean f() {
      return this.ay.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.ai().C) {
         fis $$1 = this.dA();
         this.ai().a(this.dC(), this.dE(), this.dI(), $$1.d, $$1.e, $$1.f, this.m());
      }

      super.b($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Life", this.h);
      $$0.a("LifeTime", this.i);
      $$0.a("FireworksItem", dcv.b, this.e());
      $$0.a("ShotAtAngle", this.ay.a(c).booleanValue());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.h = $$0.a("Life", 0);
      this.i = $$0.a("LifeTime", 0);
      this.ay.a(a, $$0.<dcv>a("FireworksItem", dcv.b).orElse(n()));
      this.ay.a(c, $$0.a("ShotAtAngle", false));
   }

   private List<dfj> m() {
      dcv $$0 = this.ay.a(a);
      dfk $$1 = $$0.a(kq.aj);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public dcv e() {
      return this.ay.a(a);
   }

   @Override
   public boolean cF() {
      return false;
   }

   private static dcv n() {
      return new dcv(dcz.vW);
   }

   @Override
   public DoubleDoubleImmutablePair a_(cam $$0, byb $$1) {
      double $$2 = $$0.dv().d - this.dv().d;
      double $$3 = $$0.dv().f - this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
