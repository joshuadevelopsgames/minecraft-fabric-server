import io.netty.buffer.ByteBuf;

public interface zw<T extends ws> {
   zy<? extends zw<T>> a();

   void a(T var1);

   default boolean c() {
      return false;
   }

   default boolean d() {
      return false;
   }

   static <B extends ByteBuf, T extends zw<?>> zm<B, T> a(zp<B, T> $$0, zn<B, T> $$1) {
      return zm.a($$0, $$1);
   }
}
