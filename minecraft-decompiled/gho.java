public class gho extends gfz<daq> {
   private static final ame E = ame.b("container/stonecutter/scroller");
   private static final ame F = ame.b("container/stonecutter/scroller_disabled");
   private static final ame G = ame.b("container/stonecutter/recipe_selected");
   private static final ame H = ame.b("container/stonecutter/recipe_highlighted");
   private static final ame I = ame.b("container/stonecutter/recipe");
   private static final ame J = ame.b("textures/gui/container/stonecutter.png");
   private static final int K = 12;
   private static final int L = 15;
   private static final int M = 4;
   private static final int N = 3;
   private static final int O = 16;
   private static final int P = 18;
   private static final int Q = 54;
   private static final int R = 52;
   private static final int S = 14;
   private float T;
   private boolean U;
   private int V;
   private boolean W;

   public gho(daq $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::G);
      this.u--;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(gxx.ar, J, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      int $$6 = (int)(41.0F * this.T);
      ame $$7 = this.F() ? E : F;
      $$0.a(gxx.ar, $$7, $$4 + 119, $$5 + 15 + $$6, 12, 15);
      int $$8 = this.A + 52;
      int $$9 = this.B + 14;
      int $$10 = this.V + 12;
      this.a($$0, $$2, $$3, $$8, $$9, $$10);
      this.a($$0, $$8, $$9, $$10);
   }

   @Override
   protected void b(fxb $$0, int $$1, int $$2) {
      super.b($$0, $$1, $$2);
      if (this.W) {
         int $$3 = this.A + 52;
         int $$4 = this.B + 14;
         int $$5 = this.V + 12;
         dhz.b<dim> $$6 = this.x.m();

         for (int $$7 = this.V; $$7 < $$5 && $$7 < $$6.d(); $$7++) {
            int $$8 = $$7 - this.V;
            int $$9 = $$3 + $$8 % 4 * 16;
            int $$10 = $$4 + $$8 / 4 * 18 + 2;
            if ($$1 >= $$9 && $$1 < $$9 + 16 && $$2 >= $$10 && $$2 < $$10 + 18) {
               bdp $$11 = diz.a(this.n.s);
               diy $$12 = $$6.e().get($$7).c().b();
               $$0.b(this.q, $$12.b($$11), $$1, $$2);
            }
         }
      }
   }

   private void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = this.V; $$6 < $$5 && $$6 < this.x.n(); $$6++) {
         int $$7 = $$6 - this.V;
         int $$8 = $$3 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$4 + $$9 * 18 + 2;
         ame $$11;
         if ($$6 == this.x.l()) {
            $$11 = G;
         } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
            $$11 = H;
         } else {
            $$11 = I;
         }

         $$0.a(gxx.ar, $$11, $$8, $$10 - 1, 16, 18);
      }
   }

   private void a(fxb $$0, int $$1, int $$2, int $$3) {
      dhz.b<dim> $$4 = this.x.m();
      bdp $$5 = diz.a(this.n.s);

      for (int $$6 = this.V; $$6 < $$3 && $$6 < $$4.d(); $$6++) {
         int $$7 = $$6 - this.V;
         int $$8 = $$1 + $$7 % 4 * 16;
         int $$9 = $$7 / 4;
         int $$10 = $$2 + $$9 * 18 + 2;
         diy $$11 = $$4.e().get($$6).c().b();
         $$0.a($$11.b($$5), $$8, $$10);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.U = false;
      if (this.W) {
         int $$3 = this.A + 52;
         int $$4 = this.B + 14;
         int $$5 = this.V + 12;

         for (int $$6 = this.V; $$6 < $$5; $$6++) {
            int $$7 = $$6 - this.V;
            double $$8 = $$0 - ($$3 + $$7 % 4 * 16);
            double $$9 = $$1 - ($$4 + $$7 / 4 * 18);
            if ($$8 >= 0.0 && $$9 >= 0.0 && $$8 < 16.0 && $$9 < 18.0 && this.x.a(this.n.t, $$6)) {
               fue.R().al().a(hvm.a(ayz.BZ, 1.0F));
               this.n.r.a(this.x.l, $$6);
               return true;
            }
         }

         $$3 = this.A + 119;
         $$4 = this.B + 9;
         if ($$0 >= $$3 && $$0 < $$3 + 12 && $$1 >= $$4 && $$1 < $$4 + 54) {
            this.U = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.U && this.F()) {
         int $$5 = this.B + 14;
         int $$6 = $$5 + 54;
         this.T = ((float)$$1 - $$5 - 7.5F) / ($$6 - $$5 - 15.0F);
         this.T = bcb.a(this.T, 0.0F, 1.0F);
         this.V = (int)(this.T * this.E() + 0.5) * 4;
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         if (this.F()) {
            int $$4 = this.E();
            float $$5 = (float)$$3 / $$4;
            this.T = bcb.a(this.T - $$5, 0.0F, 1.0F);
            this.V = (int)(this.T * $$4 + 0.5) * 4;
         }

         return true;
      }
   }

   private boolean F() {
      return this.W && this.x.n() > 12;
   }

   protected int E() {
      return (this.x.n() + 4 - 1) / 4 - 3;
   }

   private void G() {
      this.W = this.x.o();
      if (!this.W) {
         this.T = 0.0F;
         this.V = 0;
      }
   }
}
