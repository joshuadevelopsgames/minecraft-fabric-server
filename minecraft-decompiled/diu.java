import io.netty.buffer.ByteBuf;

public record diu(int b) {
   public static final zm<ByteBuf, diu> a = zm.a(zk.h, diu::a, diu::new);

   public int a() {
      return this.b;
   }
}
