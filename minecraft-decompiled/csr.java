import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class csr extends crv {
   private static final int ck = 20;
   private static final int cl = 1;
   private static final int cm = 20;
   private static final int cn = 3;
   private static final int co = 5;
   private static final int cp = 10;
   private static final float cq = 3.0F;
   private static final int cr = 1;
   private static final int cs = 80;
   public bzd a = new bzd();
   public bzd b = new bzd();
   public bzd c = new bzd();
   public bzd d = new bzd();
   public bzd e = new bzd();
   public bzd f = new bzd();
   private int ct = 0;
   private int cu = 0;
   private static final cvp cv = ($$0, $$1, $$2) -> {
      $$1.ai().a(null, $$1, ayz.cF, $$1.do(), 1.0F, 1.0F);
      cvp.b.deflect($$0, $$1, $$2);
   };

   public static cbr.a l() {
      return cao.I().a(cbs.w, 0.63F).a(cbs.t, 30.0).a(cbs.n, 24.0).a(cbs.c, 3.0);
   }

   public csr(bzv<? extends crv> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.z, -1.0F);
      this.a(fbc.o, -1.0F);
      this.cc = 10;
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return css.a(this, this.ei().a($$0));
   }

   @Override
   public cbm<csr> eh() {
      return (cbm<csr>)super.eh();
   }

   @Override
   protected cbm.b<csr> ei() {
      return cbm.a(css.f, css.e);
   }

   @Override
   public void a(alh<?> $$0) {
      if (this.ai().B_() && aD.equals($$0)) {
         this.gJ();
         cay $$1 = this.aw();
         switch ($$1) {
            case q:
               this.e.b(this.as);
               break;
            case r:
               this.f.b(this.as);
               break;
            case p:
               this.b.b(this.as);
         }
      }

      super.a($$0);
   }

   private void gJ() {
      this.e.a();
      this.a.a();
      this.f.a();
      this.d.a();
   }

   @Override
   public void g() {
      cay $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.m().b(1 + this.ec().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.as);
            this.n();
      }

      this.a.b(this.as);
      if ($$0 != cay.p && this.b.b()) {
         this.c.a(this.as);
         this.b.a();
      }

      this.cu = this.cu == 0 ? this.ar.a(1, 80) : this.cu - 1;
      if (this.cu == 0) {
         this.t();
      }

      super.g();
   }

   public csr m() {
      this.ct = 0;
      return this;
   }

   public void n() {
      if (++this.ct <= 5) {
         eeb $$0 = !this.dy().l() ? this.dy() : this.bx();
         fis $$1 = this.dA();
         fis $$2 = this.dv().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.ai().a(new lw(me.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.cc()) {
         fis $$1 = this.cV().f();
         fis $$2 = new fis($$1.d, this.dv().e, $$1.f);
         eeb $$3 = !this.dy().l() ? this.dy() : this.bx();
         if ($$3.o() != dwn.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.ai().a(new lw(me.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void X() {
      if (this.e() == null || !this.aK()) {
         this.ai().a(this, this.p(), this.do(), 1.0F, 1.0F);
      }
   }

   public void t() {
      float $$0 = 0.7F + 0.4F * this.ar.i();
      float $$1 = 0.8F + 0.2F * this.ar.i();
      this.ai().a(this, ayz.cP, this.do(), $$1, $$0);
   }

   @Override
   public cvp a(cvo $$0) {
      if ($$0.ap() != bzv.t && $$0.ap() != bzv.bJ) {
         return this.ap().a(azs.r) ? cv : cvp.a;
      } else {
         return cvp.a;
      }
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected ayy f_() {
      return ayz.cN;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.cO;
   }

   @Override
   protected ayy p() {
      return this.aK() ? ayz.cH : ayz.cI;
   }

   public Optional<cam> gH() {
      return this.eh().c(cjo.y).map(byb::d).filter($$0 -> $$0 instanceof cam).map($$0 -> (cam)$$0);
   }

   public boolean m(fis $$0) {
      fis $$1 = this.dx().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("breezeBrain");
      this.eh().a($$0, this);
      $$1.b("breezeActivityUpdate");
      css.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a((cam)this);
      ahj.a(this);
   }

   @Override
   public boolean a(bzv<?> $$0) {
      return $$0 == bzv.bU || $$0 == bzv.ar;
   }

   @Override
   public int gh() {
      return 30;
   }

   @Override
   public int gj() {
      return 25;
   }

   public double gI() {
      return this.dE() + this.dt() / 2.0F + 0.3F;
   }

   @Override
   public boolean a(aub $$0, byb $$1) {
      return $$1.d() instanceof csr || super.a($$0, $$1);
   }

   @Override
   public double dr() {
      return this.cW();
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      if ($$0 > 3.0) {
         this.a(ayz.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }
}
