import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ddr implements bda {
   a(0, "common", o.p),
   b(1, "uncommon", o.o),
   c(2, "rare", o.l),
   d(3, "epic", o.n);

   public static final Codec<ddr> e = bda.b(ddr::values);
   public static final IntFunction<ddr> f = baq.a($$0 -> $$0.h, values(), baq.a.a);
   public static final zm<ByteBuf, ddr> g = zk.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final o j;

   private ddr(final int $$0, final String $$1, final o $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public o a() {
      return this.j;
   }

   @Override
   public String c() {
      return this.i;
   }
}
