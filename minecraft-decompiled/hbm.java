public final class hbm {
   private int a;
   private int b;
   private int c;

   public static hbm a(fis $$0, long $$1) {
      return new hbm().b($$0, $$1);
   }

   public hbm b(fis $$0, long $$1) {
      this.a = a($$0.a(), ke.b($$1));
      this.b = a($$0.b(), ke.c($$1));
      this.c = a($$0.c(), ke.d($$1));
      return this;
   }

   private static int a(double $$0, int $$1) {
      int $$2 = ke.b($$0) - $$1;
      return bcb.a($$2, -1, 1);
   }

   public boolean a() {
      return this.a == 0 || this.b == 0 || this.c == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof hbm $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
      }
   }
}
