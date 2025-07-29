public record dif(dcv a) implements dhs {
   @Override
   public dcv a(int $$0) {
      if ($$0 != 0) {
         throw new IllegalArgumentException("No item for index " + $$0);
      } else {
         return this.a;
      }
   }

   @Override
   public int a() {
      return 1;
   }

   public dcv c() {
      return this.a;
   }
}
