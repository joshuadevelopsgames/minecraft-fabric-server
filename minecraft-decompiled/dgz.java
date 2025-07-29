import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dgz implements bda {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dgz> e = bda.a(dgz::values);
   public static final IntFunction<dgz> f = baq.a(dgz::a, values(), baq.a.a);
   public static final zm<ByteBuf, dgz> g = zk.a(f, dgz::a);
   private final String h;
   private final int i;

   private dgz(final String $$0, final int $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   private int a() {
      return this.i;
   }
}
