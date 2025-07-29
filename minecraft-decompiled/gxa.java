public enum gxa {
   a(new gxa.b(gxa.a.f, gxa.a.e, gxa.a.a), new gxa.b(gxa.a.f, gxa.a.e, gxa.a.d), new gxa.b(gxa.a.c, gxa.a.e, gxa.a.d), new gxa.b(gxa.a.c, gxa.a.e, gxa.a.a)),
   b(new gxa.b(gxa.a.f, gxa.a.b, gxa.a.d), new gxa.b(gxa.a.f, gxa.a.b, gxa.a.a), new gxa.b(gxa.a.c, gxa.a.b, gxa.a.a), new gxa.b(gxa.a.c, gxa.a.b, gxa.a.d)),
   c(new gxa.b(gxa.a.c, gxa.a.b, gxa.a.d), new gxa.b(gxa.a.c, gxa.a.e, gxa.a.d), new gxa.b(gxa.a.f, gxa.a.e, gxa.a.d), new gxa.b(gxa.a.f, gxa.a.b, gxa.a.d)),
   d(new gxa.b(gxa.a.f, gxa.a.b, gxa.a.a), new gxa.b(gxa.a.f, gxa.a.e, gxa.a.a), new gxa.b(gxa.a.c, gxa.a.e, gxa.a.a), new gxa.b(gxa.a.c, gxa.a.b, gxa.a.a)),
   e(new gxa.b(gxa.a.f, gxa.a.b, gxa.a.d), new gxa.b(gxa.a.f, gxa.a.e, gxa.a.d), new gxa.b(gxa.a.f, gxa.a.e, gxa.a.a), new gxa.b(gxa.a.f, gxa.a.b, gxa.a.a)),
   f(new gxa.b(gxa.a.c, gxa.a.b, gxa.a.a), new gxa.b(gxa.a.c, gxa.a.e, gxa.a.a), new gxa.b(gxa.a.c, gxa.a.e, gxa.a.d), new gxa.b(gxa.a.c, gxa.a.b, gxa.a.d));

   private static final gxa[] g = ag.a(new gxa[6], $$0 -> {
      $$0[gxa.a.e] = a;
      $$0[gxa.a.b] = b;
      $$0[gxa.a.d] = c;
      $$0[gxa.a.a] = d;
      $$0[gxa.a.f] = e;
      $$0[gxa.a.c] = f;
   });
   private final gxa.b[] h;

   public static gxa a(jh $$0) {
      return g[$$0.d()];
   }

   private gxa(final gxa.b... $$0) {
      this.h = $$0;
   }

   public gxa.b a(int $$0) {
      return this.h[$$0];
   }

   public static final class a {
      public static final int a = jh.d.d();
      public static final int b = jh.b.d();
      public static final int c = jh.f.d();
      public static final int d = jh.c.d();
      public static final int e = jh.a.d();
      public static final int f = jh.e.d();
   }

   public static class b {
      public final int a;
      public final int b;
      public final int c;

      b(int $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
