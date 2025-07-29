public class gha extends gfz<czo> {
   private static final ame E = ame.b("container/slot");
   private static final ame F = ame.b("container/horse/chest_slots");
   private static final ame G = ame.b("textures/gui/container/horse.png");
   private final coq H;
   private final int I;
   private float J;
   private float K;

   public gha(czo $$0, cus $$1, coq $$2, int $$3) {
      super($$0, $$1, $$2.Q_());
      this.H = $$2;
      this.I = $$3;
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.o - this.d) / 2;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, G, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      if (this.I > 0) {
         $$0.a(gxx.ar, F, 90, 54, 0, 0, $$4 + 79, $$5 + 17, this.I * 18, 54);
      }

      if (this.H.e(bzw.h) && this.H.ap().a(azs.J)) {
         this.d($$0, $$4 + 7, $$5 + 35 - 18);
      }

      boolean $$6 = this.H instanceof cot;
      if (this.H.e(bzw.g) && (this.H.ap().a(azs.L) || $$6)) {
         this.d($$0, $$4 + 7, $$5 + 35);
      }

      ghb.a($$0, $$4 + 26, $$5 + 18, $$4 + 78, $$5 + 70, 17, 0.25F, this.J, this.K, this.H);
   }

   private void d(fxb $$0, int $$1, int $$2) {
      $$0.a(gxx.ar, E, $$1, $$2, 18, 18);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      this.J = $$1;
      this.K = $$2;
      super.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2);
   }
}
