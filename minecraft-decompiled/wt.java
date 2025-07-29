import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class wt {
   private static final Logger a = LogUtils.getLogger();

   public static ChannelFutureListener a(Runnable $$0) {
      return $$1 -> {
         $$0.run();
         if (!$$1.isSuccess()) {
            $$1.channel().pipeline().fireExceptionCaught($$1.cause());
         }
      };
   }

   public static ChannelFutureListener a(Supplier<zw<?>> $$0) {
      return $$1 -> {
         if (!$$1.isSuccess()) {
            zw<?> $$2 = $$0.get();
            if ($$2 != null) {
               a.warn("Failed to deliver packet, sending fallback {}", $$2.a(), $$1.cause());
               $$1.channel().writeAndFlush($$2, $$1.channel().voidPromise());
            } else {
               $$1.channel().pipeline().fireExceptionCaught($$1.cause());
            }
         }
      };
   }
}
