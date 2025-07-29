import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum bzw implements bda {
   a(bzw.a.a, 0, 0, "mainhand"),
   b(bzw.a.a, 1, 5, "offhand"),
   c(bzw.a.b, 0, 1, 1, "feet"),
   d(bzw.a.b, 1, 1, 2, "legs"),
   e(bzw.a.b, 2, 1, 3, "chest"),
   f(bzw.a.b, 3, 1, 4, "head"),
   g(bzw.a.c, 0, 1, 6, "body"),
   h(bzw.a.d, 0, 1, 7, "saddle");

   public static final int i = 0;
   public static final List<bzw> j = List.of(values());
   public static final IntFunction<bzw> k = baq.a($$0 -> $$0.q, values(), baq.a.a);
   public static final bda.a<bzw> l = bda.a(bzw::values);
   public static final zm<ByteBuf, bzw> m = zk.a(k, $$0 -> $$0.q);
   private final bzw.a n;
   private final int o;
   private final int p;
   private final int q;
   private final String r;

   private bzw(final bzw.a $$0, final int $$1, final int $$2, final int $$3, final String $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   private bzw(final bzw.a $$0, final int $$1, final int $$2, final String $$3) {
      this($$0, $$1, 0, $$2, $$3);
   }

   public bzw.a a() {
      return this.n;
   }

   public int b() {
      return this.o;
   }

   public int a(int $$0) {
      return $$0 + this.o;
   }

   public dcv a(dcv $$0) {
      return this.p > 0 ? $$0.a(this.p) : $$0;
   }

   public int d() {
      return this.q;
   }

   public int b(int $$0) {
      return this.q + $$0;
   }

   public String e() {
      return this.r;
   }

   public boolean f() {
      return this.n == bzw.a.b || this.n == bzw.a.c;
   }

   @Override
   public String c() {
      return this.r;
   }

   public boolean g() {
      return this.n != bzw.a.d;
   }

   public static bzw a(String $$0) {
      bzw $$1 = l.a($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
      }
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
