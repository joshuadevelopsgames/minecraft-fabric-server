public record aka(int b, akn c) implements zw<ajz> {
   public static final zm<wg, aka> a = zw.a(aka::a, aka::new);
   private static final int d = 1048576;

   private aka(wg $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static akn a(ame $$0, wg $$1) {
      return b($$0, $$1);
   }

   private static akp b(ame $$0, wg $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new akp($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zy<aka> a() {
      return akf.a;
   }

   public void a(ajz $$0) {
      $$0.a(this);
   }

   public akn e() {
      return this.c;
   }
}
