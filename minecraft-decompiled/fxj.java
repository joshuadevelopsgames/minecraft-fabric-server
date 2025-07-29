public abstract class fxj extends fxm {
   private static final ame a = ame.b("widget/slider");
   private static final ame e = ame.b("widget/slider_highlighted");
   private static final ame f = ame.b("widget/slider_handle");
   private static final ame m = ame.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   public static final int c = 20;
   private static final int n = 8;
   private static final int o = 4;
   protected double d;
   private boolean p;

   public fxj(int $$0, int $$1, int $$2, int $$3, xo $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.d = $$5;
   }

   private ame c() {
      return this.D() && this.aM_() && !this.p ? e : a;
   }

   private ame e() {
      return !this.D() || !this.i && !this.p ? f : m;
   }

   @Override
   protected yc d() {
      return xo.a("gui.narrate.slider", this.A());
   }

   @Override
   public void a(gbt $$0) {
      $$0.a(gbs.a, this.d());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(gbs.d, xo.c("narration.slider.usage.focused"));
         } else {
            $$0.a(gbs.d, xo.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      fue $$4 = fue.R();
      $$0.a(gxx.ar, this.c(), this.E(), this.F(), this.z(), this.y(), baj.a(this.l));
      $$0.a(gxx.ar, this.e(), this.E() + (int)(this.d * (this.g - 8)), this.F(), 8, this.y(), baj.a(this.l));
      int $$5 = baj.a(this.l, this.j ? -1 : -6250336);
      this.a($$0, $$4.h, 2, $$5);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.a($$0);
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (!$$0) {
         this.p = false;
      } else {
         fub $$1 = fue.R().aY();
         if ($$1 == fub.b || $$1 == fub.d) {
            this.p = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (gby.a($$0)) {
         this.p = !this.p;
         return true;
      } else {
         if (this.p) {
            boolean $$3 = $$0 == 263;
            if ($$3 || $$0 == 262) {
               float $$4 = $$3 ? -1.0F : 1.0F;
               this.b(this.d + $$4 / (this.g - 8));
               return true;
            }
         }

         return false;
      }
   }

   private void a(double $$0) {
      this.b(($$0 - (this.E() + 4)) / (this.g - 8));
   }

   private void b(double $$0) {
      double $$1 = this.d;
      this.d = bcb.a($$0, 0.0, 1.0);
      if ($$1 != this.d) {
         this.a();
      }

      this.b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.a($$0);
      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(hwx $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(fue.R().al());
   }

   protected abstract void b();

   protected abstract void a();
}
