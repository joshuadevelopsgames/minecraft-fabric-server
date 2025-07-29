public class gpb extends gof {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gqn e;
   private final gqn f;

   public gpb(gqn $$0) {
      super($$0, gxz::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("plate", gqs.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gqp.a);
      $$1.a("handle", gqs.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gqp.a);
      return gqt.a($$0, 64, 64);
   }

   public gqn b() {
      return this.e;
   }

   public gqn c() {
      return this.f;
   }
}
