import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public interface aad<T extends ws, B extends ByteBuf, C> extends wu.b {
   wu<T> a(Function<ByteBuf, B> var1, C var2);
}
