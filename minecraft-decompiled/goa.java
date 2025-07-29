import java.util.Arrays;

public class goa extends gnh<hmn> {
   private static final int a = 8;
   private final gqn[] b = new gqn[8];

   public goa(gqn $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "cube" + $$0;
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         int $$3 = 0;
         int $$4 = 0;
         if ($$2 > 0 && $$2 < 4) {
            $$4 += 9 * $$2;
         } else if ($$2 > 3) {
            $$3 = 32;
            $$4 += 9 * $$2 - 36;
         }

         $$1.a(a($$2), gqs.c().a($$3, $$4).a(-4.0F, 16 + $$2, -4.0F, 8.0F, 1.0F, 8.0F), gqp.a);
      }

      $$1.a("inside_cube", gqs.c().a(24, 40).a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), gqp.a);
      return gqt.a($$0, 64, 64);
   }

   public void a(hmn $$0) {
      super.a($$0);
      float $$1 = Math.max(0.0F, $$0.a);

      for (int $$2 = 0; $$2 < this.b.length; $$2++) {
         this.b[$$2].c = -(4 - $$2) * $$1 * 1.7F;
      }
   }
}
