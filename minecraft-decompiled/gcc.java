public record gcc(int a, int b) {
   public static gcc a(gca $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new gcc($$1, $$2);
         case b -> new gcc($$2, $$1);
      };
   }

   public gcc a(gcb $$0) {
      return switch ($$0) {
         case b -> new gcc(this.a, this.b + 1);
         case a -> new gcc(this.a, this.b - 1);
         case c -> new gcc(this.a - 1, this.b);
         case d -> new gcc(this.a + 1, this.b);
      };
   }

   public int a(gca $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
