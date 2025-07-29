import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cvr extends cvo {
   private static final double a = 0.15;
   @Nullable
   private bzs<bzm> b;
   @Nullable
   private jh c;
   private int d;
   private double f;
   private double g;
   private double h;

   public cvr(bzv<? extends cvr> $$0, dmu $$1) {
      super($$0, $$1);
      this.aq = true;
   }

   public cvr(dmu $$0, cam $$1, bzm $$2, jh.a $$3) {
      this(bzv.bf, $$0);
      this.c($$1);
      fis $$4 = $$1.cV().f();
      this.b($$4.d, $$4.e, $$4.f, this.dP(), this.dR());
      this.b = new bzs<>($$2);
      this.c = jh.b;
      this.a($$3, $$2);
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (this.b != null) {
         $$0.a("Target", kf.a, this.b.c());
      }

      $$0.b("Dir", jh.k, this.c);
      $$0.a("Steps", this.d);
      $$0.a("TXD", this.f);
      $$0.a("TYD", this.g);
      $$0.a("TZD", this.h);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d = $$0.a("Steps", 0);
      this.f = $$0.a("TXD", 0.0);
      this.g = $$0.a("TYD", 0.0);
      this.h = $$0.a("TZD", 0.0);
      this.c = $$0.<jh>a("Dir", jh.k).orElse(null);
      this.b = bzs.a($$0, "Target");
   }

   @Override
   protected void a(all.a $$0) {
   }

   @Nullable
   private jh e() {
      return this.c;
   }

   private void a(@Nullable jh $$0) {
      this.c = $$0;
   }

   private void a(@Nullable jh.a $$0, @Nullable bzm $$1) {
      double $$2 = 0.5;
      jb $$3;
      if ($$1 == null) {
         $$3 = this.dx().e();
      } else {
         $$2 = $$1.dt() * 0.5;
         $$3 = jb.a($$1.dC(), $$1.dE() + $$2, $$1.dI());
      }

      double $$5 = $$3.u() + 0.5;
      double $$6 = $$3.v() + $$2;
      double $$7 = $$3.w() + 0.5;
      jh $$8 = null;
      if (!$$3.a(this.dv(), 2.0)) {
         jb $$9 = this.dx();
         List<jh> $$10 = Lists.newArrayList();
         if ($$0 != jh.a.a) {
            if ($$9.u() < $$3.u() && this.ai().w($$9.i())) {
               $$10.add(jh.f);
            } else if ($$9.u() > $$3.u() && this.ai().w($$9.h())) {
               $$10.add(jh.e);
            }
         }

         if ($$0 != jh.a.b) {
            if ($$9.v() < $$3.v() && this.ai().w($$9.d())) {
               $$10.add(jh.b);
            } else if ($$9.v() > $$3.v() && this.ai().w($$9.e())) {
               $$10.add(jh.a);
            }
         }

         if ($$0 != jh.a.c) {
            if ($$9.w() < $$3.w() && this.ai().w($$9.g())) {
               $$10.add(jh.d);
            } else if ($$9.w() > $$3.w() && this.ai().w($$9.f())) {
               $$10.add(jh.c);
            }
         }

         $$8 = jh.b(this.ar);
         if ($$10.isEmpty()) {
            for (int $$11 = 5; !this.ai().w($$9.a($$8)) && $$11 > 0; $$11--) {
               $$8 = jh.b(this.ar);
            }
         } else {
            $$8 = $$10.get(this.ar.a($$10.size()));
         }

         $$5 = this.dC() + $$8.j();
         $$6 = this.dE() + $$8.k();
         $$7 = this.dI() + $$8.l();
      }

      this.a($$8);
      double $$12 = $$5 - this.dC();
      double $$13 = $$6 - this.dE();
      double $$14 = $$7 - this.dI();
      double $$15 = Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14);
      if ($$15 == 0.0) {
         this.f = 0.0;
         this.g = 0.0;
         this.h = 0.0;
      } else {
         this.f = $$12 / $$15 * 0.15;
         this.g = $$13 / $$15 * 0.15;
         this.h = $$14 / $$15 * 0.15;
      }

      this.aE = true;
      this.d = 10 + this.ar.a(5) * 10;
   }

   @Override
   public void dJ() {
      if (this.ai().an() == bxg.a) {
         this.at();
      }
   }

   @Override
   protected double bg() {
      return 0.04;
   }

   @Override
   public void g() {
      super.g();
      bzm $$0 = !this.ai().B_() ? bzs.a(this.b, this.ai(), bzm.class) : null;
      fiq $$1 = null;
      if (!this.ai().C) {
         if ($$0 == null) {
            this.b = null;
         }

         if ($$0 == null || !$$0.bO() || $$0 instanceof cut && $$0.am()) {
            this.bi();
         } else {
            this.f = bcb.a(this.f * 1.025, -1.0, 1.0);
            this.g = bcb.a(this.g * 1.025, -1.0, 1.0);
            this.h = bcb.a(this.h * 1.025, -1.0, 1.0);
            fis $$2 = this.dA();
            this.i($$2.b((this.f - $$2.d) * 0.2, (this.g - $$2.e) * 0.2, (this.h - $$2.f) * 0.2));
         }

         $$1 = cvq.a(this, this::b);
      }

      fis $$3 = this.dA();
      this.b(this.dv().e($$3));
      this.aL();
      if (this.aF != null && this.aF.e()) {
         this.bZ();
      }

      if ($$1 != null && this.bO() && $$1.d() != fiq.a.a) {
         this.b($$1);
      }

      cvq.a(this, 0.5F);
      if (this.ai().C) {
         this.ai().a(me.t, this.dC() - $$3.d, this.dE() - $$3.e + 0.15, this.dI() - $$3.f, 0.0, 0.0, 0.0);
      } else if ($$0 != null) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o(), $$0);
            }
         }

         if (this.c != null) {
            jb $$4 = this.dx();
            jh.a $$5 = this.c.o();
            if (this.ai().a($$4.a(this.c), this)) {
               this.a($$5, $$0);
            } else {
               jb $$6 = $$0.dx();
               if ($$5 == jh.a.a && $$4.u() == $$6.u() || $$5 == jh.a.c && $$4.w() == $$6.w() || $$5 == jh.a.b && $$4.v() == $$6.v()) {
                  this.a($$5, $$0);
               }
            }
         }
      }
   }

   @Override
   protected boolean aO() {
      return !this.dU();
   }

   @Override
   protected boolean b(bzm $$0) {
      return super.b($$0) && !$$0.aq;
   }

   @Override
   public boolean cb() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bB() {
      return 1.0F;
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      bzm $$1 = $$0.a();
      bzm $$2 = this.ah_();
      cam $$3 = $$2 instanceof cam ? (cam)$$2 : null;
      byb $$4 = this.ea().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.ai() instanceof aub $$6) {
            djk.a($$6, $$1, $$4);
         }

         if ($$1 instanceof cam $$7) {
            $$7.b(new byq(bys.y, 200), (bzm)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(fio $$0) {
      super.a($$0);
      ((aub)this.ai()).a(me.w, this.dC(), this.dE(), this.dI(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(ayz.yd, 1.0F, 1.0F);
   }

   private void f() {
      this.at();
      this.ai().a(ejb.o, this.dv(), ejb.a.a(this));
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      this.f();
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public boolean b(byb $$0) {
      return true;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      this.a(ayz.ye, 1.0F, 1.0F);
      $$0.a(me.f, this.dC(), this.dE(), this.dI(), 15, 0.2, 0.2, 0.2, 0.0);
      this.f();
      return true;
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
