public class gtm extends gvt {
   private final float a;
   private final float b;

   gtm(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hoh $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gux b() {
      return gux.a;
   }

   protected gtm(grk $$0, double $$1, double $$2, double $$3, hoh $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hrs $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fue.R().a(hrr.c).apply(hrh.c()));
      }

      this.u = 1.0F;
      this.D /= 2.0F;
      this.a = this.r.i() * 3.0F;
      this.b = this.r.i() * 3.0F;
   }

   @Override
   protected float c() {
      return this.E.a((this.a + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.a / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.b / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.b + 1.0F) / 4.0F);
   }

   public static class a extends gtm.b<mi> {
      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gtm($$1, $$2, $$3, $$4, this.a(new dcv(dcz.cT), $$1));
      }
   }

   public abstract static class b<T extends mc> implements guw<T> {
      private final hoh a = new hoh();

      protected hoh a(dcv $$0, grk $$1) {
         fue.R().bg().a(this.a, $$0, dct.h, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gtm.b<ma> {
      public gut a(ma $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gtm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gtm.b<mi> {
      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gtm($$1, $$2, $$3, $$4, this.a(new dcv(dcz.rX), $$1));
      }
   }

   public static class e extends gtm.b<mi> {
      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gtm($$1, $$2, $$3, $$4, this.a(new dcv(dcz.rJ), $$1));
      }
   }
}
