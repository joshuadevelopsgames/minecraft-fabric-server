import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cqs extends cqr {
   private static final alh<dcv> d = all.a(cqs.class, alj.h);
   private static final alh<Integer> e = all.a(cqs.class, alj.b);
   public static final int c = 8;
   private static final float f = 0.0625F;
   private static final float g = 0.75F;
   private static final float h = 0.75F;
   private static final byte i = 0;
   private static final float j = 1.0F;
   private static final boolean k = false;
   private static final boolean l = false;
   private float m = 1.0F;
   private boolean n = false;

   public cqs(bzv<? extends cqs> $$0, dmu $$1) {
      super($$0, $$1);
      this.l(false);
   }

   public cqs(dmu $$0, jb $$1, jh $$2) {
      this(bzv.au, $$0, $$1, $$2);
   }

   public cqs(bzv<? extends cqs> $$0, dmu $$1, jb $$2, jh $$3) {
      super($$0, $$1, $$2);
      this.b($$3);
      this.l(false);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(d, dcv.l);
      $$0.a(e, 0);
   }

   @Override
   protected void b(jh $$0) {
      Validate.notNull($$0);
      super.a($$0);
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v($$0.e() * 90);
      } else {
         this.w(-90 * $$0.f().a());
         this.v(0.0F);
      }

      this.ab = this.dR();
      this.aa = this.dP();
      this.e();
   }

   @Override
   protected final void e() {
      super.e();
      this.e(this.dC(), this.dE(), this.dI());
   }

   @Override
   protected fin a(jb $$0, jh $$1) {
      float $$2 = 0.46875F;
      fis $$3 = fis.b($$0).a($$1, -0.46875);
      jh.a $$4 = $$1.o();
      double $$5 = $$4 == jh.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jh.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jh.a.c ? 0.0625 : 0.75;
      return fin.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean f() {
      if (this.n) {
         return true;
      } else if (!this.ai().g(this)) {
         return false;
      } else {
         eeb $$0 = this.ai().a_(this.a.a(this.cS().g()));
         return $$0.e() || this.cS().o().d() && dsc.n($$0) ? this.ai().a(this, this.cV(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(caq $$0, fis $$1) {
      if (!this.n) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.n) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public void c(aub $$0) {
      this.d(this.v());
      super.c($$0);
   }

   private boolean a(byb $$0) {
      return !$$0.a(azp.l) && !this.v().f();
   }

   private static boolean e(byb $$0) {
      return $$0.a(azp.d) || $$0.h();
   }

   @Override
   public boolean b(byb $$0) {
      return this.n && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (!this.n) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ejb.c, $$1.d());
            this.a(this.l(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public ayy l() {
      return ayz.oC;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cO();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(aub $$0, @Nullable bzm $$1) {
      this.a(this.m(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ejb.c, $$1);
   }

   public ayy m() {
      return ayz.oA;
   }

   @Override
   public void u() {
      this.a(this.n(), 1.0F, 1.0F);
   }

   public ayy n() {
      return ayz.oB;
   }

   private void a(aub $$0, @Nullable bzm $$1, boolean $$2) {
      if (!this.n) {
         dcv $$3 = this.v();
         this.b(dcv.l);
         if (!$$0.P().c(dmq.j)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else if ($$1 instanceof cut $$4 && $$4.gc()) {
            this.d($$3);
         } else {
            if ($$2) {
               this.a($$0, this.s());
            }

            if (!$$3.f()) {
               $$3 = $$3.v();
               this.d($$3);
               if (this.ar.i() < this.m) {
                  this.a($$0, $$3);
               }
            }
         }
      }
   }

   private void d(dcv $$0) {
      fce $$1 = this.a($$0);
      if ($$1 != null) {
         fcg $$2 = ddi.a($$1, this.ai());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public dcv v() {
      return this.au().a(d);
   }

   @Nullable
   public fce a(dcv $$0) {
      return $$0.a(kq.M);
   }

   public boolean w() {
      return this.v().c(kq.M);
   }

   public void b(dcv $$0) {
      this.a($$0, true);
   }

   public void a(dcv $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.au().a(d, $$0);
      if (!$$0.f()) {
         this.a(this.p(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.ai().b(this.a, dqb.a);
      }
   }

   public ayy p() {
      return ayz.oz;
   }

   @Override
   public cbd a_(int $$0) {
      return $$0 == 0 ? cbd.a(this::v, this::b) : super.a_($$0);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if ($$0.equals(d)) {
         this.e(this.v());
      }
   }

   private void e(dcv $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.e();
   }

   public int x() {
      return this.au().a(e);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.au().a(e, $$0 % 8);
      if ($$1 && this.a != null) {
         this.ai().b(this.a, dqb.a);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      dcv $$1 = this.v();
      if (!$$1.f()) {
         $$0.a("Item", dcv.b, $$1);
      }

      $$0.a("ItemRotation", (byte)this.x());
      $$0.a("ItemDropChance", this.m);
      $$0.a("Facing", jh.k, this.cS());
      $$0.a("Invisible", this.cs());
      $$0.a("Fixed", this.n);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      dcv $$1 = $$0.<dcv>a("Item", dcv.b).orElse(dcv.l);
      dcv $$2 = this.v();
      if (!$$2.f() && !dcv.a($$1, $$2)) {
         this.d($$2);
      }

      this.a($$1, false);
      this.a($$0.a("ItemRotation", (byte)0), false);
      this.m = $$0.a("ItemDropChance", 1.0F);
      this.b($$0.<jh>a("Facing", jh.k).orElse(jh.a));
      this.l($$0.a("Invisible", false));
      this.n = $$0.a("Fixed", false);
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      boolean $$3 = !this.v().f();
      boolean $$4 = !$$2.f();
      if (this.n) {
         return bxj.e;
      } else if (!$$0.ai().C) {
         if (!$$3) {
            if ($$4 && !this.dU()) {
               fcg $$5 = ddi.b($$2, this.ai());
               if ($$5 != null && $$5.a(256)) {
                  return bxj.d;
               } else {
                  this.b($$2);
                  this.a(ejb.c, $$0);
                  $$2.a(1, $$0);
                  return bxj.a;
               }
            } else {
               return bxj.e;
            }
         } else {
            this.a(this.q(), 1.0F, 1.0F);
            this.b(this.x() + 1);
            this.a(ejb.c, $$0);
            return bxj.a;
         }
      } else {
         return (bxj)(!$$3 && !$$4 ? bxj.e : bxj.a);
      }
   }

   public ayy q() {
      return ayz.oD;
   }

   public int y() {
      return this.v().f() ? 0 : this.x() % 8 + 1;
   }

   @Override
   public zw<acq> a(atz $$0) {
      return new acr(this, this.cS().d(), this.i());
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      this.b(jh.a($$0.p()));
   }

   @Override
   public dcv dM() {
      dcv $$0 = this.v();
      return $$0.f() ? this.s() : $$0.v();
   }

   protected dcv s() {
      return new dcv(dcz.vE);
   }

   @Override
   public float dQ() {
      jh $$0 = this.cS();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return bcb.b(180 + $$0.e() * 90 + this.x() * 45 + $$1);
   }
}
