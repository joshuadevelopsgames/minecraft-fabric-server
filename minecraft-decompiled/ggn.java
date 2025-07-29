public class ggn extends gfz<czc> {
   private static final ame E = ame.b("container/crafter/disabled_slot");
   private static final ame F = ame.b("container/crafter/powered_redstone");
   private static final ame G = ame.b("container/crafter/unpowered_redstone");
   private static final ame H = ame.b("textures/gui/container/crafter.png");
   private static final xo I = xo.c("gui.togglable_slot");
   private final cut J;

   public ggn(czc $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.J = $$1.j;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.f = (this.d - this.q.a(this.m)) / 2;
   }

   @Override
   protected void a(dak $$0, int $$1, int $$2, cyx $$3) {
      if ($$0 instanceof czd && !$$0.h() && !this.J.am()) {
         switch ($$3) {
            case a:
               if (this.x.e($$1)) {
                  this.a($$1);
               } else if (this.x.g().f()) {
                  this.b($$1);
               }
               break;
            case c:
               dcv $$4 = this.J.gs().a($$2);
               if (this.x.e($$1) && !$$4.f()) {
                  this.a($$1);
               }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(int $$0) {
      this.a($$0, true);
   }

   private void b(int $$0) {
      this.a($$0, false);
   }

   private void a(int $$0, boolean $$1) {
      this.x.a($$0, $$1);
      super.a($$0, this.x.l, $$1);
      float $$2 = $$1 ? 1.0F : 0.75F;
      this.J.a(ayz.BU.a(), 0.4F, $$2);
   }

   @Override
   public void a(fxb $$0, dak $$1) {
      if ($$1 instanceof czd $$2 && this.x.e($$1.d)) {
         this.a($$0, $$2);
      } else {
         super.a($$0, $$1);
      }
   }

   private void a(fxb $$0, czd $$1) {
      $$0.a(gxx.ar, E, $$1.e - 1, $$1.f - 1, 18, 18);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.f($$0);
      this.b($$0, $$1, $$2);
      if (this.z instanceof czd && !this.x.e(this.z.d) && this.x.g().f() && !this.z.h() && !this.J.am()) {
         $$0.a(this.q, I, $$1, $$2);
      }
   }

   private void f(fxb $$0) {
      int $$1 = this.o / 2 + 9;
      int $$2 = this.p / 2 - 48;
      ame $$3;
      if (this.x.l()) {
         $$3 = F;
      } else {
         $$3 = G;
      }

      $$0.a(gxx.ar, $$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.o - this.d) / 2;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, H, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
   }
}
