public class gng extends gnh<hkn> {
   private static final int a = 4;
   private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] c = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final gqn[] d = new gqn[4];

   public gng(gqn $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "segment" + $$0;
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      float $$2 = -3.5F;

      for (int $$3 = 0; $$3 < 4; $$3++) {
         $$1.a(
            a($$3),
            gqs.c().a(c[$$3][0], c[$$3][1]).a(b[$$3][0] * -0.5F, 0.0F, b[$$3][2] * -0.5F, b[$$3][0], b[$$3][1], b[$$3][2]),
            gqp.a(0.0F, 24 - b[$$3][1], $$2)
         );
         if ($$3 < 3) {
            $$2 += (b[$$3][2] + b[$$3 + 1][2]) * 0.5F;
         }
      }

      return gqt.a($$0, 64, 32);
   }

   @Override
   public void a(hkn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         this.d[$$1].f = bcb.b($$0.v * 0.9F + $$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (1 + Math.abs($$1 - 2));
         this.d[$$1].b = bcb.a($$0.v * 0.9F + $$1 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * Math.abs($$1 - 2);
      }
   }
}
