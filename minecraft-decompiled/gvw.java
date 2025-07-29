public class gvw extends gvt {
   private final fis a;

   gvw(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fis $$7, int $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      $$8 = baj.a($$8, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F, 0.875F + this.r.i() * 0.25F);
      this.v = baj.b($$8) / 255.0F;
      this.w = baj.c($$8) / 255.0F;
      this.x = baj.d($$8) / 255.0F;
      this.D = 0.26F;
      this.a = $$7;
   }

   @Override
   public gux b() {
      return gux.b;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         int $$0 = this.t - this.s;
         double $$1 = 1.0 / $$0;
         this.g = bcb.d($$1, this.g, this.a.a());
         this.h = bcb.d($$1, this.h, this.a.b());
         this.i = bcb.d($$1, this.i, this.a.c());
      }
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   public static class a implements guw<mj> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mj $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gvw $$8 = new gvw($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.a($$0.d());
         return $$8;
      }
   }
}
