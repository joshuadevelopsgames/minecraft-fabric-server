import java.util.function.IntFunction;

public enum ftl implements bce {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<ftl> d = baq.a(ftl::b, values(), baq.a.b);
   private final int e;
   private final String f;

   private ftl(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public String a() {
      return this.f;
   }

   public static ftl a(int $$0) {
      return d.apply($$0);
   }
}
