import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public enum bxg implements bda {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   public static final bda.a<bxg> e = bda.a(bxg::values);
   private static final IntFunction<bxg> g = baq.a(bxg::a, values(), baq.a.b);
   public static final zm<ByteBuf, bxg> f = zk.a(g, bxg::a);
   private final int h;
   private final String i;

   private bxg(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public int a() {
      return this.h;
   }

   public xo b() {
      return xo.c("options.difficulty." + this.i);
   }

   public xo d() {
      return xo.c("options.difficulty." + this.i + ".info");
   }

   @Deprecated
   public static bxg a(int $$0) {
      return g.apply($$0);
   }

   @Nullable
   public static bxg a(String $$0) {
      return e.a($$0);
   }

   public String e() {
      return this.i;
   }

   @Override
   public String c() {
      return this.i;
   }
}
