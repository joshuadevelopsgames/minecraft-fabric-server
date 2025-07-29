public enum eiv {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private eiv(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static eiv a(atp $$0) {
      if ($$0.a(atp.d)) {
         return c;
      } else {
         return $$0.a(atp.b) ? b : a;
      }
   }
}
