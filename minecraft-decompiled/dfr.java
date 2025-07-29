import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record dfr(int d) {
   public static final Codec<dfr> a = Codec.INT.xmap(dfr::new, dfr::a);
   public static final zm<ByteBuf, dfr> b = zk.g.a(dfr::new, dfr::a);
   public static final dfr c = new dfr(4603950);

   public int a() {
      return this.d;
   }
}
