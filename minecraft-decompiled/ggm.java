public class ggm extends gfz<cyv> {
   private static final ame E = ame.b("textures/gui/container/generic_54.png");
   private final int F;

   public ggm(cyv $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      int $$3 = 222;
      int $$4 = 114;
      this.F = $$0.m();
      this.e = 114 + this.F * 18;
      this.w = this.e - 94;
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
      $$0.a(gxx.ar, E, $$4, $$5, 0.0F, 0.0F, this.d, this.F * 18 + 17, 256, 256);
      $$0.a(gxx.ar, E, $$4, $$5 + this.F * 18 + 17, 0.0F, 126.0F, this.d, 96, 256, 256);
   }
}
