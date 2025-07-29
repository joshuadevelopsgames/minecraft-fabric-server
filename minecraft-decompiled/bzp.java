public record bzp(float a, float b, float c, bzo d, boolean e) {
   private bzp(float $$0, float $$1, boolean $$2) {
      this($$0, $$1, c($$1), bzo.a($$0, $$1), $$2);
   }

   private static float c(float $$0) {
      return $$0 * 0.85F;
   }

   public fin a(fis $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fin a(double $$0, double $$1, double $$2) {
      float $$3 = this.a / 2.0F;
      float $$4 = this.b;
      return new fin($$0 - $$3, $$1, $$2 - $$3, $$0 + $$3, $$1 + $$4, $$2 + $$3);
   }

   public bzp a(float $$0) {
      return this.a($$0, $$0);
   }

   public bzp a(float $$0, float $$1) {
      return !this.e && ($$0 != 1.0F || $$1 != 1.0F) ? new bzp(this.a * $$0, this.b * $$1, this.c * $$1, this.d.a($$0, $$1, $$0), false) : this;
   }

   public static bzp b(float $$0, float $$1) {
      return new bzp($$0, $$1, false);
   }

   public static bzp c(float $$0, float $$1) {
      return new bzp($$0, $$1, true);
   }

   public bzp b(float $$0) {
      return new bzp(this.a, this.b, $$0, this.d, this.e);
   }

   public bzp a(bzo.a $$0) {
      return new bzp(this.a, this.b, this.c, $$0.a(this.a, this.b), this.e);
   }
}
