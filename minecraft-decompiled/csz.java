import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csz extends crv {
   private static final alh<Boolean> cn = all.a(csz.class, alj.k);
   private static final alh<Boolean> co = all.a(csz.class, alj.k);
   private static final alh<Boolean> cp = all.a(csz.class, alj.k);
   private static final alh<Optional<jb>> cq = all.a(csz.class, alj.p);
   private static final int cr = 15;
   private static final int cs = 1;
   private static final float ct = 3.0F;
   private static final float cu = 32.0F;
   private static final float cv = 144.0F;
   public static final int a = 40;
   private static final float cw = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   public static final int e = 8;
   public static final int f = 45;
   private static final int cx = 4;
   private int cy;
   public final bzd ck = new bzd();
   public final bzd cl = new bzd();
   public final bzd cm = new bzd();
   private int cz;
   private boolean cA;
   private int cB;
   private int cC;

   public csz(bzv<? extends csz> $$0, dmu $$1) {
      super($$0, $$1);
      this.cd = new csz.c(this);
      this.ce = new csz.d(this);
      this.cf = new csz.b(this);
      cjv $$2 = (cjv)this.S();
      $$2.a(true);
      this.cc = 0;
   }

   public void h(jb $$0) {
      this.i($$0);
      this.a(fbc.q, 8.0F);
      this.a(fbc.f, 8.0F);
      this.a(fbc.i, 8.0F);
      this.a(fbc.o, 0.0F);
      this.a(fbc.n, 0.0F);
   }

   public boolean l() {
      return this.gI() != null;
   }

   @Override
   protected cgg O() {
      return new csz.a(this);
   }

   @Override
   protected cbm.b<csz> ei() {
      return cta.a();
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cta.b(this, this.ei().a($$0));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cn, true);
      $$0.a(co, false);
      $$0.a(cp, false);
      $$0.a(cq, Optional.empty());
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.t, 1.0).a(cbs.w, 0.4F).a(cbs.c, 3.0).a(cbs.n, 32.0).a(cbs.C, 1.0625);
   }

   public boolean n() {
      return this.ay.a(cn);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      if (!($$1 instanceof cam)) {
         return false;
      } else {
         this.cy = 15;
         this.ai().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      jb $$3 = this.gI();
      if ($$3 == null || $$1.a(azp.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.cz <= 0 && !this.eM()) {
         cut $$4 = this.i($$1);
         bzm $$5 = $$1.c();
         if (!($$5 instanceof cam) && !($$5 instanceof cvo) && $$4 == null) {
            return false;
         } else {
            this.cz = 8;
            this.ai().a(this, (byte)66);
            this.c(ejb.u);
            if (this.ai().c_($$3) instanceof ebp $$6 && $$6.b(this)) {
               if ($$4 != null) {
                  $$6.c();
               }

               this.h($$1);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public cut i(byb $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bL() {
      return super.bL() && this.n();
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public cbm<csz> eh() {
      return (cbm<csz>)super.eh();
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("creakingBrain");
      this.eh().a((aub)this.ai(), this);
      $$1.c();
      cta.a(this);
   }

   @Override
   public void e_() {
      if (this.cz > 0) {
         this.cz--;
      }

      if (this.cy > 0) {
         this.cy--;
      }

      if (!this.ai().C) {
         boolean $$0 = this.ay.a(cn);
         boolean $$1 = this.gP();
         if ($$1 != $$0) {
            this.c(ejb.u);
            if ($$1) {
               this.b(ayz.gt);
            } else {
               this.aa();
               this.b(ayz.gs);
            }
         }

         this.ay.a(cn, $$1);
      }

      super.e_();
   }

   @Override
   public void g() {
      if (!this.ai().C) {
         jb $$0 = this.gI();
         if ($$0 != null) {
            boolean $$2 = this.ai().c_($$0) instanceof ebp $$1 && $$1.b(this);
            if (!$$2) {
               this.x(0.0F);
            }
         }
      }

      super.g();
      if (this.ai().C) {
         this.gS();
         this.gO();
      }
   }

   @Override
   protected void es() {
      if (this.l() && this.gK()) {
         this.bl++;
         if (!this.ai().B_() && this.bl > 45 && !this.dU()) {
            this.t();
         }
      } else {
         super.es();
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.bp.a($$1, 0.4F, 1.0F);
   }

   private void gS() {
      this.ck.a(this.cy > 0, this.as);
      this.cl.a(this.cz > 0, this.as);
      this.cm.a(this.gK(), this.as);
   }

   public void t() {
      if (this.ai() instanceof aub $$0) {
         fin $$1 = this.cV();
         fis $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lw(me.bi, dqb.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lw(me.bi, dqb.cE.m().b(drv.c, eev.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.f_());
      this.a(bzm.e.b);
   }

   public void j(byb $$0) {
      this.i($$0);
      this.a($$0);
      this.b(ayz.gw);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.cz = 8;
         this.h(this.ea().p());
      } else if ($$0 == 4) {
         this.cy = 15;
         this.gA();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bl() {
      return this.l() || super.bl();
   }

   @Override
   protected boolean s(bzm $$0) {
      return !this.l() && super.s($$0);
   }

   @Override
   protected boolean bT() {
      return !this.l() && super.bT();
   }

   @Override
   protected void q(bzm $$0) {
      if (this.l()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return !this.l() && super.o($$0);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new csz.e(this, $$0);
   }

   public boolean gH() {
      List<cut> $$0 = this.bO.c(cjo.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.cC = 0;
         return false;
      } else {
         fin $$1 = this.cV();

         for (cut $$2 : $$0) {
            if ($$1.d($$2.bI())) {
               this.cC++;
               return this.cC > 4;
            }
         }

         this.cC = 0;
         return false;
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      $$0.<jb>a("home_pos", jb.a).ifPresent(this::h);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("home_pos", jb.a, this.gI());
   }

   public void i(jb $$0) {
      this.ay.a(cq, Optional.of($$0));
   }

   @Nullable
   public jb gI() {
      return this.ay.a(cq).orElse(null);
   }

   public void gJ() {
      this.ay.a(cp, true);
   }

   public boolean gK() {
      return this.ay.a(cp);
   }

   public boolean gN() {
      return this.cA;
   }

   public void gO() {
      if (this.bl > this.cB) {
         this.cB = this.bl + this.ec().a(this.cA ? 2 : this.bl / 4, this.cA ? 8 : this.bl / 2);
         this.cA = !this.cA;
      }
   }

   @Override
   public void gA() {
      this.b(ayz.gp);
   }

   @Override
   protected ayy p() {
      return this.gR() ? null : ayz.gm;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.l() ? ayz.gv : super.e($$0);
   }

   @Override
   protected ayy f_() {
      return ayz.gq;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.gr, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gP() {
      List<cut> $$0 = this.bO.c(cjo.j).orElse(List.of());
      boolean $$1 = this.gR();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gQ();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cut $$3 : $$0) {
            if (this.c((cam)$$3) && !this.t($$3)) {
               $$2 = true;
               if ((!$$1 || cam.bd.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dG(), this.dE() + 0.5 * this.eq(), (this.dG() + this.dE()) / 2.0})) {
                  if ($$1) {
                     return false;
                  }

                  if ($$3.g(this) < 144.0) {
                     this.g($$3);
                     return false;
                  }
               }
            }
         }

         if (!$$2 && $$1) {
            this.gQ();
         }

         return true;
      }
   }

   public void g(cut $$0) {
      this.eh().a(cjo.p, $$0);
      this.c(ejb.u);
      this.b(ayz.gn);
      this.x(true);
   }

   public void gQ() {
      this.eh().b(cjo.p);
      this.c(ejb.u);
      this.b(ayz.go);
      this.x(false);
   }

   public void x(boolean $$0) {
      this.ay.a(co, $$0);
   }

   public boolean gR() {
      return this.ay.a(co);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return 0.0F;
   }

   class a extends cgg {
      public a(final csz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (csz.this.n()) {
            super.a();
         }
      }
   }

   class b extends cgj {
      public b(final csz $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (csz.this.n()) {
            super.b();
         } else {
            csz.this.t(false);
         }
      }
   }

   class c extends cgk {
      public c(final csz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (csz.this.n()) {
            super.a();
         }
      }
   }

   class d extends cgl {
      public d(final csz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (csz.this.n()) {
            super.a();
         }
      }
   }

   class e extends cjv {
      e(final csz $$0, final dmu $$1) {
         super($$0, $$1);
      }

      @Override
      public void d() {
         if (csz.this.n()) {
            super.d();
         }
      }

      @Override
      protected fbb a(int $$0) {
         this.o = csz.this.new f();
         this.o.a(true);
         return new fbb(this.o, $$0);
      }
   }

   class f extends fbh {
      private static final int m = 1024;

      @Override
      public fbc a(fbe $$0, int $$1, int $$2, int $$3) {
         jb $$4 = csz.this.gI();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new kg($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? fbc.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
