public class gvz extends gvt {
   private final gvo a;

   gvz(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gvo $$7) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a = $$7;
      this.j *= 0.3F;
      this.k = Math.random() * 0.2F + 0.1F;
      this.l *= 0.3F;
      this.b(0.01F, 0.01F);
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.b($$7);
      this.u = 0.0F;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
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
      int $$0 = 60 - this.t;
      if (this.t-- <= 0) {
         this.k();
      } else {
         this.k = this.k - this.u;
         this.a(this.j, this.k, this.l);
         this.j *= 0.98F;
         this.k *= 0.98F;
         this.l *= 0.98F;
         float $$1 = $$0 * 0.001F;
         this.b($$1, $$1);
         this.a(this.a.a($$0 % 4, 4));
      }
   }

   public static class a implements guw<mi> {
      private final gvo a;

      public a(gvo $$0) {
         this.a = $$0;
      }

      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gvz($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
