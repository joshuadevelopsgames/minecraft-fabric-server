import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum efm implements bda {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<efm> g = baq.a($$0 -> $$0.h, values(), baq.a.a);
   public static final Codec<efm> e = bda.a(efm::values);
   public static final zm<ByteBuf, efm> f = zk.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final xo j;
   private final xo k;

   private efm(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = xo.c("test_block.mode." + $$1);
      this.k = xo.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public xo a() {
      return this.j;
   }

   public xo b() {
      return this.k;
   }
}
