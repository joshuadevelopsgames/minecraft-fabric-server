public record dhr<T extends dhm<?>>(amd<dhm<?>> b, T c) {
   public static final zm<wx, dhr<?>> a = zm.a(amd.b(mn.bA), dhr::a, dhm.c, dhr::b, dhr::new);

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof dhr<?> $$1 && this.b == $$1.b;
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   public amd<dhm<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
