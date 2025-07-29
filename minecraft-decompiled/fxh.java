public abstract class fxh extends fxm {
   public static final int b = 6;
   private double a;
   private static final ame c = ame.b("widget/scroller");
   private static final ame d = ame.b("widget/scroller_background");
   private boolean e;

   public fxh(int $$0, int $$1, int $$2, int $$3, xo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (!this.k) {
         return false;
      } else {
         this.a(this.g() - $$3 * this.o());
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.e) {
         if ($$1 < this.F()) {
            this.a(0.0);
         } else if ($$1 > this.H()) {
            this.a(this.i());
         } else {
            double $$5 = Math.max(1, this.i());
            int $$6 = this.k();
            double $$7 = Math.max(1.0, $$5 / (this.h - $$6));
            this.a(this.g() + $$4 * $$7);
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(double $$0, double $$1) {
      this.e = false;
   }

   public double g() {
      return this.a;
   }

   public void a(double $$0) {
      this.a = bcb.a($$0, 0.0, (double)this.i());
   }

   public boolean c(double $$0, double $$1, int $$2) {
      this.e = this.j() && this.g($$2) && $$0 >= this.l() && $$0 <= this.l() + 6 && $$1 >= this.F() && $$1 < this.H();
      return this.e;
   }

   public void h() {
      this.a(this.a);
   }

   public int i() {
      return Math.max(0, this.n() - this.h);
   }

   protected boolean j() {
      return this.i() > 0;
   }

   protected int k() {
      return bcb.a((int)((float)(this.h * this.h) / this.n()), 32, this.h - 8);
   }

   protected int l() {
      return this.G() - 6;
   }

   protected int m() {
      return Math.max(this.F(), (int)this.a * (this.h - this.k()) / this.i() + this.F());
   }

   protected void c(fxb $$0) {
      if (this.j()) {
         int $$1 = this.l();
         int $$2 = this.k();
         int $$3 = this.m();
         $$0.a(gxx.ar, d, $$1, this.F(), 6, this.y());
         $$0.a(gxx.ar, c, $$1, $$3, 6, $$2);
      }
   }

   protected abstract int n();

   protected abstract double o();
}
