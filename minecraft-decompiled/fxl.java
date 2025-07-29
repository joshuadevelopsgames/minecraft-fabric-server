public abstract class fxl extends fxh {
   private static final fzd c = new fzd(ame.b("widget/text_field"), ame.b("widget/text_field_highlighted"));
   private static final int d = 4;
   public static final int a = 8;
   private boolean e = true;
   private boolean f = true;

   public fxl(int $$0, int $$1, int $$2, int $$3, xo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fxl(int $$0, int $$1, int $$2, int $$3, xo $$4, boolean $$5, boolean $$6) {
      this($$0, $$1, $$2, $$3, $$4);
      this.e = $$5;
      this.f = $$6;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      boolean $$3 = $$0 == 265;
      boolean $$4 = $$0 == 264;
      if ($$3 || $$4) {
         double $$5 = this.g();
         this.a(this.g() + ($$3 ? -1 : 1) * this.o());
         if ($$5 != this.g()) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.k) {
         if (this.e) {
            this.b($$0);
         }

         $$0.c(this.E() + 1, this.F() + 1, this.E() + this.g - 1, this.F() + this.h - 1);
         $$0.e().pushMatrix();
         $$0.e().translate(0.0F, (float)(-this.g()));
         this.c($$0, $$1, $$2, $$3);
         $$0.e().popMatrix();
         $$0.f();
         this.c($$0);
         if (this.f) {
            this.a($$0);
         }
      }
   }

   protected void a(fxb $$0) {
   }

   protected int a() {
      return 4;
   }

   protected int b() {
      return this.a() * 2;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.j && this.k && $$0 >= this.E() && $$1 >= this.F() && $$0 < this.G() + 6 && $$1 < this.H();
   }

   @Override
   protected int l() {
      return this.G();
   }

   @Override
   protected int n() {
      return this.c() + this.b();
   }

   protected void b(fxb $$0) {
      this.a($$0, this.E(), this.F(), this.z(), this.y());
   }

   protected void a(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      ame $$5 = c.a(this.D(), this.aM_());
      $$0.a(gxx.ar, $$5, $$1, $$2, $$3, $$4);
   }

   protected boolean a(int $$0, int $$1) {
      return $$1 - this.g() >= this.F() && $$0 - this.g() <= this.F() + this.h;
   }

   protected abstract int c();

   protected abstract void c(fxb var1, int var2, int var3, float var4);

   protected int e() {
      return this.E() + this.a();
   }

   protected int p() {
      return this.F() + this.a();
   }

   @Override
   public void a(hwx $$0) {
   }
}
