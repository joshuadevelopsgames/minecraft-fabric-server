public enum iy {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, jh.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jh.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public jh.a a(jh.a $$0) {
         return $$0;
      }

      @Override
      public iy a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, jh.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jh.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public jh.a a(jh.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public iy a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, jh.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, jh.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public jh.a a(jh.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public iy a() {
         return b;
      }
   };

   public static final jh.a[] d = jh.a.values();
   public static final iy[] e = values();

   public abstract int a(int var1, int var2, int var3, jh.a var4);

   public abstract double a(double var1, double var3, double var5, jh.a var7);

   public abstract jh.a a(jh.a var1);

   public abstract iy a();

   public static iy a(jh.a $$0, jh.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
