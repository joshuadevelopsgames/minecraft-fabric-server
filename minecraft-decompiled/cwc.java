import javax.annotation.Nullable;

public class cwc extends cvb {
   private static final alh<Byte> f = all.a(cwc.class, alj.a);
   private static final alh<Boolean> g = all.a(cwc.class, alj.k);
   private static final float h = 0.99F;
   private static final boolean i = false;
   private boolean j = false;
   public int d;

   public cwc(bzv<? extends cwc> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cwc(dmu $$0, cam $$1, dcv $$2) {
      super(bzv.bB, $$1, $$0, $$2, null);
      this.ay.a(f, this.b($$2));
      this.ay.a(g, $$2.C());
   }

   public cwc(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      super(bzv.bB, $$1, $$2, $$3, $$0, $$4, $$4);
      this.ay.a(f, this.b($$4));
      this.ay.a(g, $$4.C());
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(f, (byte)0);
      $$0.a(g, false);
   }

   @Override
   public void g() {
      if (this.a > 4) {
         this.j = true;
      }

      bzm $$0 = this.ah_();
      int $$1 = this.ay.a(f);
      if ($$1 > 0 && (this.j || this.v()) && $$0 != null) {
         if (!this.A()) {
            if (this.ai() instanceof aub $$2 && this.b == cvb.a.b) {
               this.a($$2, this.m(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cut) && this.dv().f($$0.bI()) < $$0.ds() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fis $$3 = $$0.bI().d(this.dv());
            this.o(this.dC(), this.dE() + $$3.e * 0.015 * $$1, this.dI());
            double $$4 = 0.05 * $$1;
            this.i(this.dA().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(ayz.Bf, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.g();
   }

   private boolean A() {
      bzm $$0 = this.ah_();
      return $$0 == null || !$$0.bO() ? false : !($$0 instanceof auc) || !$$0.am();
   }

   @Override
   public boolean x() {
      return this.ay.a(g);
   }

   @Nullable
   @Override
   protected fip b(fis $$0, fis $$1) {
      return this.j ? null : super.b($$0, $$1);
   }

   @Override
   protected void a(fip $$0) {
      bzm $$1 = $$0.a();
      float $$2 = 8.0F;
      bzm $$3 = this.ah_();
      byb $$4 = this.ea().a(this, (bzm)($$3 == null ? this : $$3));
      if (this.ai() instanceof aub $$5) {
         $$2 = djk.a($$5, this.ed(), $$1, $$4, $$2);
      }

      this.j = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.ap() == bzv.O) {
            return;
         }

         if (this.ai() instanceof aub $$6) {
            djk.a($$6, $$1, $$4, this.ed(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof cam $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cvp.b, $$1, this.ah_(), false);
      this.i(this.dA().d(0.02, 0.2, 0.02));
      this.a(ayz.Bd, 1.0F, 1.0F);
   }

   @Override
   protected void a(aub $$0, fio $$1, dcv $$2) {
      fis $$3 = $$1.b().a($$1.g());
      djk.a($$0, $$2, this.ah_() instanceof cam $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public dcv ed() {
      return this.q();
   }

   @Override
   protected boolean a(cut $$0) {
      return super.a($$0) || this.v() && this.e((bzm)$$0) && $$0.gs().g(this.m());
   }

   @Override
   protected dcv n() {
      return new dcv(dcz.xx);
   }

   @Override
   protected ayy i() {
      return ayz.Be;
   }

   @Override
   public void a_(cut $$0) {
      if (this.e((bzm)$$0) || this.ah_() == null) {
         super.a_($$0);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.j = $$0.a("DealtDamage", false);
      this.ay.a(f, this.b(this.q()));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("DealtDamage", this.j);
   }

   private byte b(dcv $$0) {
      return this.ai() instanceof aub $$1 ? (byte)bcb.a(djk.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void f() {
      int $$0 = this.ay.a(f);
      if (this.b != cvb.a.b || $$0 <= 0) {
         super.f();
      }
   }

   @Override
   protected float u() {
      return 0.99F;
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return true;
   }
}
