public enum awx {
   a("old"),
   b("new"),
   c("compatible");

   private final xo d;
   private final xo e;

   private awx(final String $$0) {
      this.d = xo.c("pack.incompatible." + $$0).a(o.h);
      this.e = xo.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static awx a(bbt<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xo b() {
      return this.d;
   }

   public xo c() {
      return this.e;
   }
}
