import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cvo extends bzm implements cbk {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   protected bzs<bzm> e;
   private boolean c = false;
   private boolean d = false;
   @Nullable
   private bzm f;

   cvo(bzv<? extends cvo> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected void a(@Nullable bzs<bzm> $$0) {
      this.e = $$0;
   }

   public void c(@Nullable bzm $$0) {
      this.a($$0 != null ? new bzs<>($$0) : null);
   }

   @Nullable
   @Override
   public bzm ah_() {
      return bzs.a(this.e, this.ai(), bzm.class);
   }

   public bzm y() {
      return (bzm)MoreObjects.firstNonNull(this.ah_(), this);
   }

   @Override
   protected void a(fdc $$0) {
      bzs.a(this.e, $$0, "Owner");
      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bzm $$0) {
      return this.e != null && this.e.a($$0);
   }

   @Override
   protected void a(fda $$0) {
      this.a(bzs.a($$0, "Owner"));
      this.c = $$0.a("LeftOwner", false);
      this.d = $$0.a("HasBeenShot", false);
   }

   @Override
   public void y(bzm $$0) {
      super.y($$0);
      if ($$0 instanceof cvo $$1) {
         this.e = $$1.e;
      }
   }

   @Override
   public void g() {
      if (!this.d) {
         this.a(ejb.K, this.ah_());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.f();
      }

      super.g();
   }

   private boolean f() {
      bzm $$0 = this.ah_();
      if ($$0 != null) {
         fin $$1 = this.cV().b(this.dA()).g(1.0);
         return $$0.dh().dc().filter(bzt.h).noneMatch($$1x -> $$1.c($$1x.cV()));
      } else {
         return true;
      }
   }

   public fis d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fis($$0, $$1, $$2).d().b(this.ar.a(0.0, 0.0172275 * $$4), this.ar.a(0.0, 0.0172275 * $$4), this.ar.a(0.0, 0.0172275 * $$4)).c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fis $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.aE = true;
      double $$6 = $$5.i();
      this.v((float)(bcb.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(bcb.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.aa = this.dP();
      this.ab = this.dR();
   }

   public void a(bzm $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -bcb.a($$2 * (float) (Math.PI / 180.0)) * bcb.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -bcb.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = bcb.b($$2 * (float) (Math.PI / 180.0)) * bcb.b($$1 * (float) (Math.PI / 180.0));
      this.c($$6, $$7, $$8, $$4, $$5);
      fis $$9 = $$0.ae();
      this.i(this.dA().b($$9.d, $$0.aK() ? 0.0 : $$9.e, $$9.f));
   }

   @Override
   public void a(boolean $$0, jb $$1) {
      double $$2 = $$0 ? -0.03 : 0.1;
      this.i(this.dA().b(0.0, $$2, 0.0));
      a(this.ai(), $$1);
   }

   @Override
   public void m(boolean $$0) {
      double $$1 = $$0 ? -0.03 : 0.06;
      this.i(this.dA().b(0.0, $$1, 0.0));
      this.j();
   }

   public static <T extends cvo> T a(cvo.a<T> $$0, aub $$1, dcv $$2, cam $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dR(), $$3.dP(), $$4, $$5, $$6));
   }

   public static <T extends cvo> T a(cvo.a<T> $$0, aub $$1, dcv $$2, cam $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cvo> T a(T $$0, aub $$1, dcv $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cvo> T a(T $$0, aub $$1, dcv $$2) {
      return a($$0, $$1, $$2, $$0x -> {});
   }

   public static <T extends cvo> T a(T $$0, aub $$1, dcv $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(aub $$0, dcv $$1) {
      djk.a($$0, $$1, this, $$0x -> {});
      if (this instanceof cvb $$2) {
         dcv $$3 = $$2.ed();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            djk.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cvp b(fiq $$0) {
      if ($$0.d() == fiq.a.c) {
         fip $$1 = (fip)$$0;
         bzm $$2 = $$1.a();
         cvp $$3 = $$2.a(this);
         if ($$3 != cvp.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.ah_(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      } else if (this.w() && $$0 instanceof fio $$4 && $$4.f()) {
         cvp $$5 = cvp.b;
         if (this.a($$5, null, this.ah_(), false)) {
            this.i(this.dA().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cvp.a;
   }

   protected boolean w() {
      return false;
   }

   public boolean a(cvp $$0, @Nullable bzm $$1, @Nullable bzm $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ar);
      if (!this.ai().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bzm $$0, boolean $$1) {
   }

   protected void b(dcr $$0) {
   }

   protected void a(fiq $$0) {
      fiq.a $$1 = $$0.d();
      if ($$1 == fiq.a.c) {
         fip $$2 = (fip)$$0;
         bzm $$3 = $$2.a();
         if ($$3.ap().a(azs.H) && $$3 instanceof cvo $$4) {
            $$4.a(cvp.c, this.ah_(), this.ah_(), true);
         }

         this.a($$2);
         this.ai().a(ejb.J, $$0.g(), ejb.a.a(this, null));
      } else if ($$1 == fiq.a.b) {
         fio $$5 = (fio)$$0;
         this.a($$5);
         jb $$6 = $$5.b();
         this.ai().a(ejb.J, $$6, ejb.a.a(this, this.ai().a_($$6)));
      }
   }

   protected void a(fip $$0) {
   }

   protected void a(fio $$0) {
      eeb $$1 = this.ai().a_($$0.b());
      $$1.a(this.ai(), $$1, $$0, this);
   }

   protected boolean b(bzm $$0) {
      if (!$$0.bJ()) {
         return false;
      } else {
         bzm $$1 = this.ah_();
         return $$1 == null || this.c || !$$1.A($$0);
      }
   }

   protected void z() {
      fis $$0 = this.dA();
      double $$1 = $$0.i();
      this.w(f(this.ab, (float)(bcb.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(f(this.aa, (float)(bcb.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return bcb.h(0.2F, $$0, $$1);
   }

   @Override
   public zw<acq> a(atz $$0) {
      bzm $$1 = this.ah_();
      return new acr(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      bzm $$1 = this.ai().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(aub $$0, jb $$1) {
      bzm $$2 = this.ah_();
      return $$2 instanceof cut ? $$2.c($$0, $$1) : $$2 == null || $$0.P().c(dmq.d);
   }

   public boolean a(aub $$0) {
      return this.ap().a(azs.g) && $$0.P().c(dmq.h);
   }

   @Override
   public boolean bK() {
      return this.ap().a(azs.H);
   }

   @Override
   public float bV() {
      return this.bK() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(cam $$0, byb $$1) {
      double $$2 = this.dA().d;
      double $$3 = this.dA().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int ca() {
      return 2;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (!this.d($$1)) {
         this.bG();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cvo> {
      T create(aub var1, cam var2, dcv var3);
   }
}
