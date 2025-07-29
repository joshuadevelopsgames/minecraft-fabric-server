public class ggj extends gfz<cyt> {
   private static final ame E = ame.b("container/brewing_stand/fuel_length");
   private static final ame F = ame.b("container/brewing_stand/brew_progress");
   private static final ame G = ame.b("container/brewing_stand/bubbles");
   private static final ame H = ame.b("textures/gui/container/brewing_stand.png");
   private static final int[] I = new int[]{29, 24, 20, 16, 11, 6, 0};

   public ggj(cyt $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.f = (this.d - this.q.a(this.m)) / 2;
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
      $$0.a(gxx.ar, H, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      int $$6 = this.x.l();
      int $$7 = bcb.a((18 * $$6 + 20 - 1) / 20, 0, 18);
      if ($$7 > 0) {
         $$0.a(gxx.ar, E, 18, 4, 0, 0, $$4 + 60, $$5 + 44, $$7, 4);
      }

      int $$8 = this.x.m();
      if ($$8 > 0) {
         int $$9 = (int)(28.0F * (1.0F - $$8 / 400.0F));
         if ($$9 > 0) {
            $$0.a(gxx.ar, F, 9, 28, 0, 0, $$4 + 97, $$5 + 16, 9, $$9);
         }

         $$9 = I[$$8 / 2 % 7];
         if ($$9 > 0) {
            $$0.a(gxx.ar, G, 12, 29, 0, 29 - $$9, $$4 + 63, $$5 + 14 + 29 - $$9, 12, $$9);
         }
      }
   }
}
