public class gmr extends gof {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gqn d;
   private final gqn e;

   public gmr(gqn $$0) {
      super($$0, gxz::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("bottom", gqs.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gqp.a);
      $$1.a("lid", gqs.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gqp.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gqs.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gqp.a(0.0F, 9.0F, 1.0F));
      return gqt.a($$0, 64, 64);
   }

   public static gqt b() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("bottom", gqs.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gqp.a);
      $$1.a("lid", gqs.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gqp.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gqs.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gqp.a(0.0F, 9.0F, 1.0F));
      return gqt.a($$0, 64, 64);
   }

   public static gqt c() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("bottom", gqs.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gqp.a);
      $$1.a("lid", gqs.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gqp.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gqs.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gqp.a(0.0F, 9.0F, 1.0F));
      return gqt.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
