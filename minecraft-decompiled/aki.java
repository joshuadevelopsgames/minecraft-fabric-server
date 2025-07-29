import javax.annotation.Nullable;

public record aki(int b, @Nullable akm c) implements zw<akh> {
   public static final zm<wg, aki> a = zw.a(aki::c, aki::a);
   private static final int d = 1048576;

   private static aki a(wg $$0) {
      int $$1 = $$0.l();
      return new aki($$1, a($$1, $$0));
   }

   private static akm a(int $$0, wg $$1) {
      return b($$1);
   }

   private static akm b(wg $$0) {
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         $$0.k($$1);
         return ako.a;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void c(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<aki> a() {
      return akf.f;
   }

   public void a(akh $$0) {
      $$0.a(this);
   }

   @Nullable
   public akm e() {
      return this.c;
   }
}
