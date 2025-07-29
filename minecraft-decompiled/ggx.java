public class ggx extends gfz<czm> {
   private static final ame E = ame.b("container/grindstone/error");
   private static final ame F = ame.b("textures/gui/container/grindstone.png");

   public ggx(czm $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.o - this.d) / 2;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, F, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      if ((this.x.b(0).h() || this.x.b(1).h()) && !this.x.b(2).h()) {
         $$0.a(gxx.ar, E, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}
