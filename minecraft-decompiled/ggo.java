public class ggo extends ggb<czf> {
   private static final ame E = ame.b("textures/gui/container/crafting_table.png");

   public ggo(czf $$0, cus $$1, xo $$2) {
      super($$0, new gjf($$0), $$1, $$2);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.f = 29;
   }

   @Override
   protected gcc E() {
      return new gcc(this.A + 5, this.p / 2 - 49);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, E, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
   }
}
