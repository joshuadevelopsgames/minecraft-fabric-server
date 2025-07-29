import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bzx implements bda, Iterable<bzw> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bzw.a),
   c(2, "offhand", bzw.b),
   d(3, "hand", $$0 -> $$0.a() == bzw.a.a),
   e(4, "feet", bzw.c),
   f(5, "legs", bzw.d),
   g(6, "chest", bzw.e),
   h(7, "head", bzw.f),
   i(8, "armor", bzw::f),
   j(9, "body", bzw.g),
   k(10, "saddle", bzw.h);

   public static final IntFunction<bzx> l = baq.a($$0 -> $$0.o, values(), baq.a.a);
   public static final Codec<bzx> m = bda.a(bzx::values);
   public static final zm<ByteBuf, bzx> n = zk.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bzw> q;
   private final List<bzw> r;

   private bzx(final int $$0, final String $$1, final Predicate<bzw> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bzw.j.stream().filter($$2).toList();
   }

   private bzx(final int $$0, final String $$1, final bzw $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bzx a(bzw $$0) {
      return switch ($$0) {
         case a -> b;
         case b -> c;
         case c -> e;
         case d -> f;
         case e -> g;
         case f -> h;
         case g -> j;
         case h -> k;
      };
   }

   @Override
   public String c() {
      return this.p;
   }

   public boolean b(bzw $$0) {
      return this.q.test($$0);
   }

   public List<bzw> a() {
      return this.r;
   }

   @Override
   public Iterator<bzw> iterator() {
      return this.r.iterator();
   }
}
