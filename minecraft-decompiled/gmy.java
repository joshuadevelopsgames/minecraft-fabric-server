import java.util.List;

public class gmy extends gnh<hkf> {
   public static final List<gqn> a = List.of();
   private final gqn b;
   private final List<gqn> c;
   private final fuu d;
   private final fuu e;
   private final fuu f;
   private final fuu g;

   public gmy(gqn $$0) {
      super($$0);
      gqn $$1 = $$0.b("root");
      gqn $$2 = $$1.b("upper_body");
      this.b = $$2.b("head");
      this.c = List.of(this.b);
      this.d = fva.a.a($$1);
      this.e = fva.b.a($$1);
      this.f = fva.c.a($$1);
      this.g = fva.d.a($$1);
   }

   private static gqv b() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("root", gqs.c(), gqp.a(0.0F, 24.0F, 0.0F));
      gqx $$3 = $$2.a("upper_body", gqs.c(), gqp.a(-1.0F, -19.0F, 0.0F));
      $$3.a(
         "head",
         gqs.c()
            .a(0, 0)
            .a(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .a(28, 31)
            .a(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .a(12, 40)
            .a(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .a(34, 12)
            .a(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         gqp.a(-3.0F, -11.0F, 0.0F)
      );
      $$3.a("body", gqs.c().a(0, 16).a(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).a(24, 0).a(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F), gqp.a(0.0F, -7.0F, 1.0F));
      $$3.a(
         "right_arm", gqs.c().a(22, 13).a(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).a(46, 0).a(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F), gqp.a(-7.0F, -9.5F, 1.5F)
      );
      $$3.a(
         "left_arm",
         gqs.c()
            .a(30, 40)
            .a(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .a(52, 12)
            .a(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .a(52, 19)
            .a(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         gqp.a(6.0F, -9.0F, 0.5F)
      );
      $$2.a(
         "left_leg", gqs.c().a(42, 40).a(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).a(45, 55).a(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F), gqp.a(1.5F, -16.0F, 0.5F)
      );
      $$2.a(
         "right_leg",
         gqs.c()
            .a(0, 34)
            .a(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .a(45, 46)
            .a(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .a(12, 34)
            .a(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         gqp.a(-1.0F, -17.5F, 0.5F)
      );
      return $$0;
   }

   public static gqt a() {
      gqv $$0 = b();
      return gqt.a($$0, 64, 64);
   }

   public void a(hkf $$0) {
      super.a($$0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      if ($$0.e) {
         this.d.a($$0.ag, $$0.ah, 1.0F, 1.0F);
      }

      this.e.a($$0.b, $$0.v);
      this.f.a($$0.a, $$0.v);
      this.g.a($$0.c, $$0.v);
   }

   public List<gqn> b(hkf $$0) {
      return !$$0.d ? a : this.c;
   }
}
