import java.util.Set;

public class gpa extends gou<hmj> {
   public static final gqw a = new gmc(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gpa(gqn $$0) {
      super($$0);
   }

   public static gqt a() {
      gqv $$0 = gou.a(12, false, true, gqr.a);
      gqx $$1 = $$0.a();
      $$1.a("head", gqs.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gqp.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gqs.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gqp.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gqt.a($$0, 64, 32);
   }

   public void a(hmj $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.aj;
      this.b.e = $$0.b;
   }
}
