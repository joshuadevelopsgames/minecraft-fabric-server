public class gtq extends gvt {
   gtq(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, boolean $$7) {
      super($$0, $$1, $$2, $$3);
      this.d(3.0F);
      this.b(0.25F, 0.25F);
      if ($$7) {
         this.t = this.r.a(50) + 280;
      } else {
         this.t = this.r.a(50) + 80;
      }

      this.u = 3.0E-6F;
      this.j = $$4;
      this.k = $$5 + this.r.i() / 500.0F;
      this.l = $$6;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ < this.t && !(this.y <= 0.0F)) {
         this.j = this.j + this.r.i() / 5000.0F * (this.r.h() ? 1 : -1);
         this.l = this.l + this.r.i() / 5000.0F * (this.r.h() ? 1 : -1);
         this.k = this.k - this.u;
         this.a(this.j, this.k, this.l);
         if (this.s >= this.t - 60 && this.y > 0.01F) {
            this.y -= 0.015F;
         }
      } else {
         this.k();
      }
   }

   @Override
   public gux b() {
      return gux.c;
   }

   public static class a implements guw<mi> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gtq $$8 = new gtq($$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
         $$8.e(0.9F);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements guw<mi> {
      private final gvo a;

      public b(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gtq $$8 = new gtq($$1, $$2, $$3, $$4, $$5, $$6, $$7, true);
         $$8.e(0.95F);
         $$8.a(this.a);
         return $$8;
      }
   }
}
