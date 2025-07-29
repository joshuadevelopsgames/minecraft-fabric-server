import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum coz implements bda {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<coz> h = bda.a(coz::values);
   private static final IntFunction<coz> j = baq.a(coz::a, values(), baq.a.b);
   public static final zm<ByteBuf, coz> i = zk.a(j, coz::a);
   private final int k;
   private final String l;

   private coz(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static coz a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
