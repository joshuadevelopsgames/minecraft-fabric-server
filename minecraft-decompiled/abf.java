public record abf(ame a) implements abe {
   public static <T extends wg> zm<T, abf> a(ame $$0, int $$1) {
      return abe.a(($$0x, $$1x) -> {}, $$2 -> {
         int $$3 = $$2.readableBytes();
         if ($$3 >= 0 && $$3 <= $$1) {
            $$2.k($$3);
            return new abf($$0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + $$1 + " bytes");
         }
      });
   }

   @Override
   public abe.b<abf> a() {
      return new abe.b<>(this.a);
   }

   public ame b() {
      return this.a;
   }
}
