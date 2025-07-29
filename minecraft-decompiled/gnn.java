public class gnn extends gnh<hky> {
   private final gqn[] a = new gqn[9];

   public gnn(gqn $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1] = $$0.b(gqo.a($$1));
      }
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("body", gqs.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gqp.a(0.0F, 17.6F, 0.0F));
      bck $$2 = bck.a(1660L);

      for (int $$3 = 0; $$3 < 9; $$3++) {
         float $$4 = (($$3 % 3 - $$3 / 3 % 2 * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float $$5 = ($$3 / 3 / 2.0F * 2.0F - 1.0F) * 5.0F;
         int $$6 = $$2.a(7) + 8;
         $$1.a(gqo.a($$3), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, $$6, 2.0F), gqp.a($$4, 24.6F, $$5));
      }

      return gqt.a($$0, 64, 32).a(gqw.scaling(4.5F));
   }

   public void a(hky $$0) {
      super.a($$0);
      a($$0, this.a);
   }

   public static void a(hkn $$0, gqn[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e = 0.2F * bcb.a($$0.v * 0.3F + $$2) + 0.4F;
      }
   }
}
