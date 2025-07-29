public class gdw extends get {
   private fyi a;
   private final Runnable b;
   private final Runnable c;

   public gdw(Runnable $$0, Runnable $$1) {
      super(xo.c("datapackFailure.title"));
      this.a = fyi.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.a = fyi.a(this.q, this.o(), this.o - 50);
      this.c(fxo.a(xo.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.o / 2 - 155, this.p / 6 + 96, 150, 20).a());
      this.c(fxo.a(xn.k, $$0 -> this.b.run()).a(this.o / 2 - 155 + 160, this.p / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.o / 2, 70);
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
