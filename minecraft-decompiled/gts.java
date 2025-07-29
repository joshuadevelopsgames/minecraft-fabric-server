public class gts extends gvt {
   private static final int a = 11993298;
   private static final int b = 14614777;
   private static final float F = 0.7176471F;
   private static final float G = 0.0F;
   private static final float H = 0.8235294F;
   private static final float I = 0.8745098F;
   private static final float J = 0.0F;
   private static final float K = 0.9764706F;
   private boolean L;
   private final gvo M;

   gts(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gvo $$7) {
      super($$0, $$1, $$2, $$3);
      this.B = 0.96F;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.v = bcb.a(this.r, 0.7176471F, 0.8745098F);
      this.w = bcb.a(this.r, 0.0F, 0.0F);
      this.x = bcb.a(this.r, 0.8235294F, 0.9764706F);
      this.D *= 0.75F;
      this.t = (int)(20.0 / (this.r.i() * 0.8 + 0.2));
      this.L = false;
      this.n = false;
      this.M = $$7;
      this.b($$7);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.M);
         if (this.m) {
            this.k = 0.0;
            this.L = true;
         }

         if (this.L) {
            this.k += 0.002;
         }

         this.a(this.j, this.k, this.l);
         if (this.h == this.e) {
            this.j *= 1.1;
            this.l *= 1.1;
         }

         this.j = this.j * this.B;
         this.l = this.l * this.B;
         if (this.L) {
            this.k = this.k * this.B;
         }
      }
   }

   @Override
   public gux b() {
      return gux.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * bcb.a((this.s + $$0) / this.t * 32.0F, 0.0F, 1.0F);
   }

   public static class a implements guw<mi> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gts($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
