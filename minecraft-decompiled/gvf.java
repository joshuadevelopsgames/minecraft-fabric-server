public class gvf extends gvt {
   protected final gvo a;
   private float b;
   private float F;
   private float G;
   private boolean H;

   protected gvf(grk $$0, double $$1, double $$2, double $$3, gvo $$4, float $$5) {
      super($$0, $$1, $$2, $$3);
      this.B = 0.91F;
      this.u = $$5;
      this.a = $$4;
   }

   public void b(int $$0) {
      float $$1 = (($$0 & 0xFF0000) >> 16) / 255.0F;
      float $$2 = (($$0 & 0xFF00) >> 8) / 255.0F;
      float $$3 = (($$0 & 0xFF) >> 0) / 255.0F;
      float $$4 = 1.0F;
      this.a($$1 * 1.0F, $$2 * 1.0F, $$3 * 1.0F);
   }

   public void c(int $$0) {
      this.b = (($$0 & 0xFF0000) >> 16) / 255.0F;
      this.F = (($$0 & 0xFF00) >> 8) / 255.0F;
      this.G = (($$0 & 0xFF) >> 0) / 255.0F;
      this.H = true;
   }

   @Override
   public gux b() {
      return gux.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
      if (this.s > this.t / 2) {
         this.e(1.0F - ((float)this.s - this.t / 2) / this.t);
         if (this.H) {
            this.v = this.v + (this.b - this.v) * 0.2F;
            this.w = this.w + (this.F - this.w) * 0.2F;
            this.x = this.x + (this.G - this.x) * 0.2F;
         }
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }
}
