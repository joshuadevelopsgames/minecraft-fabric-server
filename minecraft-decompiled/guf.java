public class guf extends gvt {
   private final double a;
   private final double b;
   private final double F;
   private final int G;
   private final int H;

   guf(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, int $$8) {
      super($$0, $$1, $$2, $$3);
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.a = $$1;
      this.b = $$2;
      this.F = $$3;
      this.d = $$1 + $$4;
      this.e = $$2 + $$5;
      this.f = $$3 + $$6;
      this.g = this.d;
      this.h = this.e;
      this.i = this.f;
      this.D = 0.1F * (this.r.i() * 0.5F + 0.2F);
      this.n = false;
      this.t = (int)(Math.random() * 5.0) + 25;
      this.G = $$7;
      this.H = $$8;
   }

   @Override
   public gux b() {
      return gux.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         float $$0 = (float)this.s / this.t;
         float $$1 = 1.0F - $$0;
         this.g = this.a + this.j * $$1;
         this.h = this.b + this.k * $$1;
         this.i = this.F + this.l * $$1;
         int $$2 = baj.a($$0, this.G, this.H);
         this.a(baj.b($$2) / 255.0F, baj.c($$2) / 255.0F, baj.d($$2) / 255.0F);
         this.e(baj.a($$2) / 255.0F);
      }
   }

   public static class a implements guw<mi> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         guf $$8 = new guf($$1, $$2, $$3, $$4, $$5, $$6, $$7, -12210434, -1);
         $$8.d(bcb.b($$1.H_(), 3.0F, 5.0F));
         $$8.a(this.a);
         return $$8;
      }
   }
}
