public class cpl {
   public static final amd<cpk> a = a(cpl.a.a);
   public static final amd<cpk> b = a(cpl.a.b);
   public static final amd<cpk> c = a(cpl.a.c);
   public static final amd<cpk> d = a(cpl.a.d);
   public static final amd<cpk> e = a(cpl.a.e);
   public static final amd<cpk> f = a(cpl.a.f);
   public static final amd<cpk> g = a(cpl.a.g);

   private static amd<cpk> a(cpl.a $$0) {
      return amd.a(mn.bs, ame.b($$0.a()));
   }

   public static void a(qq<cpk> $$0) {
      a($$0, a, cpl.a.a);
      a($$0, b, cpl.a.b);
      a($$0, c, cpl.a.c);
      a($$0, d, cpl.a.d);
      a($$0, e, cpl.a.e);
      a($$0, f, cpl.a.f);
      a($$0, g, cpl.a.g);
   }

   private static void a(qq<cpk> $$0, amd<cpk> $$1, cpl.a $$2) {
      $$0.a($$1, ayz.Er.get($$2));
   }

   public static jl<cpk> a(jz $$0, bck $$1) {
      return $$0.f(mn.bs).a($$1).orElseThrow();
   }

   public static enum a {
      a("classic", ""),
      b("puglin", "_puglin"),
      c("sad", "_sad"),
      d("angry", "_angry"),
      e("grumpy", "_grumpy"),
      f("big", "_big"),
      g("cute", "_cute");

      private final String h;
      private final String i;

      private a(final String $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public String a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }
   }
}
