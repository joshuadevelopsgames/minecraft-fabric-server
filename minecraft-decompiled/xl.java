import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xl(String c, List<xl.a> d, yl e) {
   public static final Codec<xl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.STRING.fieldOf("translation_key").forGetter(xl::a),
            xl.a.d.listOf().fieldOf("parameters").forGetter(xl::b),
            yl.b.b.optionalFieldOf("style", yl.a).forGetter(xl::c)
         )
         .apply($$0, xl::new)
   );
   public static final zm<wx, xl> b = zm.a(zk.p, xl::a, xl.a.e.a(zk.a()), xl::b, yl.b.c, xl::c, xl::new);

   public static xl a(String $$0) {
      return new xl($$0, List.of(xl.a.a, xl.a.c), yl.a);
   }

   public static xl b(String $$0) {
      yl $$1 = yl.a.a(o.h).b(true);
      return new xl($$0, List.of(xl.a.a, xl.a.c), $$1);
   }

   public static xl c(String $$0) {
      yl $$1 = yl.a.a(o.h).b(true);
      return new xl($$0, List.of(xl.a.b, xl.a.c), $$1);
   }

   public static xl d(String $$0) {
      return new xl($$0, List.of(xl.a.b, xl.a.a, xl.a.c), yl.a);
   }

   public xo a(xo $$0, xk.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xo.a(this.c, $$2).c(this.e);
   }

   private xo[] b(xo $$0, xk.a $$1) {
      xo[] $$2 = new xo[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xl.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xl.a> b() {
      return this.d;
   }

   public yl c() {
      return this.e;
   }

   public static enum a implements bda {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xn.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xl.a> f = baq.a($$0 -> $$0.g, values(), baq.a.a);
      public static final Codec<xl.a> d = bda.a(xl.a::values);
      public static final zm<ByteBuf, xl.a> e = zk.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xl.a.a i;

      private a(final int $$0, final String $$1, final xl.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xo a(xo $$0, xk.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xo select(xo var1, xk.a var2);
      }
   }
}
