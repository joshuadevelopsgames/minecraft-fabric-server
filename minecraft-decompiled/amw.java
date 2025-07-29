import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amw(List<amw.a> d) {
   public static final amw a = new amw(List.of());
   public static final zm<ByteBuf, Either<amw.b, xo>> b = zk.a(amw.b.k, xq.f);
   public static final zm<ByteBuf, List<amw.c>> c = amw.c.a.a(zk.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amw.a> a(amw.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amw.c> b() {
      return this.d.stream().map($$0 -> new amw.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amw.a> c() {
      return this.d;
   }

   public record a(Either<amw.b, xo> a, URI b) {

      public static amw.a a(amw.b $$0, URI $$1) {
         return new amw.a(Either.left($$0), $$1);
      }

      public static amw.a a(xo $$0, URI $$1) {
         return new amw.a(Either.right($$0), $$1);
      }

      public xo a() {
         return (xo)this.a.map(amw.b::a, $$0 -> $$0);
      }

      public Either<amw.b, xo> b() {
         return this.a;
      }

      public URI c() {
         return this.b;
      }
   }

   public static enum b {
      a(0, "report_bug"),
      b(1, "community_guidelines"),
      c(2, "support"),
      d(3, "status"),
      e(4, "feedback"),
      f(5, "community"),
      g(6, "website"),
      h(7, "forums"),
      i(8, "news"),
      j(9, "announcements");

      private static final IntFunction<amw.b> l = baq.a($$0 -> $$0.m, values(), baq.a.a);
      public static final zm<ByteBuf, amw.b> k = zk.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xo a() {
         return xo.c("known_server_link." + this.n);
      }

      public amw.a a(URI $$0) {
         return amw.a.a(this, $$0);
      }
   }

   public record c(Either<amw.b, xo> b, String c) {
      public static final zm<ByteBuf, amw.c> a = zm.a(amw.b, amw.c::a, zk.p, amw.c::b, amw.c::new);

      public Either<amw.b, xo> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
