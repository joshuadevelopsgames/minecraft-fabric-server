public class gns extends gnh<hlb> {
   public static final gqw a = gqw.scaling(0.2375F);
   private static final float b = 0.9375F;
   private final gqn[] c = new gqn[9];
   private final gqn d;

   public gns(gqn $$0) {
      super($$0);
      this.d = $$0.b("body");

      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         this.c[$$1] = this.d.b(gqo.a($$1));
      }
   }

   public static gqt a(boolean $$0, gqr $$1) {
      gqv $$2 = new gqv();
      gqx $$3 = $$2.a();
      gqx $$4 = $$3.a("body", gqs.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, $$1), gqp.a(0.0F, 16.0F, 0.0F));
      if ($$0) {
         $$4.a("inner_body", gqs.c().a(0, 32).a(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, $$1.a(-0.5F)), gqp.a(0.0F, 8.0F, 0.0F));
      }

      $$4.a(gqo.a(0), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, $$1), gqp.a(-3.75F, 7.0F, -5.0F));
      $$4.a(gqo.a(1), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, $$1), gqp.a(1.25F, 7.0F, -5.0F));
      $$4.a(gqo.a(2), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, $$1), gqp.a(6.25F, 7.0F, -5.0F));
      $$4.a(gqo.a(3), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, $$1), gqp.a(-6.25F, 7.0F, 0.0F));
      $$4.a(gqo.a(4), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, $$1), gqp.a(-1.25F, 7.0F, 0.0F));
      $$4.a(gqo.a(5), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, $$1), gqp.a(3.75F, 7.0F, 0.0F));
      $$4.a(gqo.a(6), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$1), gqp.a(-3.75F, 7.0F, 5.0F));
      $$4.a(gqo.a(7), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$1), gqp.a(1.25F, 7.0F, 5.0F));
      $$4.a(gqo.a(8), gqs.c().a(0, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, $$1), gqp.a(6.25F, 7.0F, 5.0F));
      return gqt.a($$2, 64, 64).a(gqw.scaling(4.0F));
   }

   public void a(hlb $$0) {
      super.a($$0);
      if (!$$0.a.f()) {
         this.d.h = 0.9375F;
         this.d.i = 0.9375F;
         this.d.j = 0.9375F;
      }

      gnn.a($$0, this.c);
   }
}
