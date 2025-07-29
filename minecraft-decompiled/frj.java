import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class frj extends hyg {
   protected BooleanConsumer a;
   private final xo b;
   private final xo c;

   public frj(BooleanConsumer $$0, xo $$1, xo $$2) {
      super(ftv.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aV_() {
      this.c(fxo.a(xn.f, $$0 -> this.a.accept(true)).a(this.o / 2 - 105, g(9), 100, 20).a());
      this.c(fxo.a(xn.g, $$0 -> this.a.accept(false)).a(this.o / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.b, this.o / 2, g(3), -1);
      $$0.a(this.q, this.c, this.o / 2, g(5), -1);
   }
}
