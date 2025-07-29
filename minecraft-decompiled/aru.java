import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum aru implements bda {
   a(0, "close"),
   b(1, "none"),
   c(2, "wait_for_response");

   public static final IntFunction<aru> d = baq.a($$0 -> $$0.g, values(), baq.a.a);
   public static final bda.a<aru> e = bda.a(aru::values);
   public static final zm<ByteBuf, aru> f = zk.a(d, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private aru(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public boolean a() {
      return this == a || this == c;
   }
}
