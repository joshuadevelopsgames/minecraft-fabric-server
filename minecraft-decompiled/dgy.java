import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dgy implements bda {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<dgy> f = baq.a($$0 -> $$0.g, values(), baq.a.a);
   public static final Codec<dgy> d = bda.a(dgy::values);
   public static final zm<ByteBuf, dgy> e = zk.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private dgy(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
