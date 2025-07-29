public class ghh extends gfz<czx> {
   private static final ame E = ame.b("container/villager/out_of_stock");
   private static final ame F = ame.b("container/villager/experience_bar_background");
   private static final ame G = ame.b("container/villager/experience_bar_current");
   private static final ame H = ame.b("container/villager/experience_bar_result");
   private static final ame I = ame.b("container/villager/scroller");
   private static final ame J = ame.b("container/villager/scroller_disabled");
   private static final ame K = ame.b("container/villager/trade_arrow_out_of_stock");
   private static final ame L = ame.b("container/villager/trade_arrow");
   private static final ame M = ame.b("container/villager/discount_strikethrough");
   private static final ame N = ame.b("textures/gui/container/villager.png");
   private static final int O = 512;
   private static final int P = 256;
   private static final int Q = 99;
   private static final int R = 136;
   private static final int S = 16;
   private static final int T = 5;
   private static final int U = 35;
   private static final int V = 68;
   private static final int W = 6;
   private static final int X = 7;
   private static final int Y = 5;
   private static final int Z = 20;
   private static final int aa = 88;
   private static final int ab = 27;
   private static final int ac = 6;
   private static final int ad = 139;
   private static final int ae = 18;
   private static final int af = 94;
   private static final xo ag = xo.c("merchant.trades");
   private static final xo ah = xo.c("merchant.deprecated");
   private int ai;
   private final ghh.a[] aj = new ghh.a[7];
   int ak;
   private boolean al;

   public ghh(czx $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.d = 276;
      this.v = 107;
   }

   private void E() {
      this.x.e(this.ai);
      this.x.h(this.ai);
      this.n.M().b(new ajc(this.ai));
   }

   @Override
   protected void aV_() {
      super.aV_();
      int $$0 = (this.o - this.d) / 2;
      int $$1 = (this.p - this.e) / 2;
      int $$2 = $$1 + 16 + 2;

      for (int $$3 = 0; $$3 < 7; $$3++) {
         this.aj[$$3] = this.c(new ghh.a($$0 + 5, $$2, $$3, $$0x -> {
            if ($$0x instanceof ghh.a) {
               this.ai = ((ghh.a)$$0x).a() + this.ak;
               this.E();
            }
         }));
         $$2 += 20;
      }
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2) {
      int $$3 = this.x.n();
      if ($$3 > 0 && $$3 <= 5 && this.x.q()) {
         xo $$4 = xo.a("merchant.title", this.m, xo.c("merchant.level." + $$3));
         int $$5 = this.q.a($$4);
         int $$6 = 49 + this.d / 2 - $$5 / 2;
         $$0.a(this.q, $$4, $$6, 6, -12566464, false);
      } else {
         $$0.a(this.q, this.m, 49 + this.d / 2 - this.q.a(this.m) / 2, 6, -12566464, false);
      }

      $$0.a(this.q, this.y, this.v, this.w, -12566464, false);
      int $$7 = this.q.a(ag);
      $$0.a(this.q, ag, 5 - $$7 / 2 + 48, 6, -12566464, false);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.o - this.d) / 2;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, N, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 512, 256);
      dlr $$6 = this.x.p();
      if (!$$6.isEmpty()) {
         int $$7 = this.ai;
         if ($$7 < 0 || $$7 >= $$6.size()) {
            return;
         }

         dlq $$8 = $$6.get($$7);
         if ($$8.r()) {
            $$0.a(gxx.ar, E, this.A + 83 + 99, this.B + 35, 28, 21);
         }
      }
   }

   private void a(fxb $$0, int $$1, int $$2, dlq $$3) {
      int $$4 = this.x.n();
      int $$5 = this.x.l();
      if ($$4 < 5) {
         $$0.a(gxx.ar, F, $$1 + 136, $$2 + 16, 102, 5);
         int $$6 = cug.b($$4);
         if ($$5 >= $$6 && cug.d($$4)) {
            int $$7 = 102;
            float $$8 = 102.0F / (cug.c($$4) - $$6);
            int $$9 = Math.min(bcb.d($$8 * ($$5 - $$6)), 102);
            $$0.a(gxx.ar, G, 102, 5, 0, 0, $$1 + 136, $$2 + 16, $$9, 5);
            int $$10 = this.x.m();
            if ($$10 > 0) {
               int $$11 = Math.min(bcb.d($$10 * $$8), 102 - $$9);
               $$0.a(gxx.ar, H, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, $$11, 5);
            }
         }
      }
   }

   private void a(fxb $$0, int $$1, int $$2, dlr $$3) {
      int $$4 = $$3.size() + 1 - 7;
      if ($$4 > 1) {
         int $$5 = 139 - (27 + ($$4 - 1) * 139 / $$4);
         int $$6 = 1 + $$5 / $$4 + 139 / $$4;
         int $$7 = 113;
         int $$8 = Math.min(113, this.ak * $$6);
         if (this.ak == $$4 - 1) {
            $$8 = 113;
         }

         $$0.a(gxx.ar, I, $$1 + 94, $$2 + 18 + $$8, 6, 27);
      } else {
         $$0.a(gxx.ar, J, $$1 + 94, $$2 + 18, 6, 27);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dlr $$4 = this.x.p();
      if (!$$4.isEmpty()) {
         int $$5 = (this.o - this.d) / 2;
         int $$6 = (this.p - this.e) / 2;
         int $$7 = $$6 + 16 + 1;
         int $$8 = $$5 + 5 + 5;
         this.a($$0, $$5, $$6, $$4);
         int $$9 = 0;

         for (dlq $$10 : $$4) {
            if (!this.a($$4.size()) || $$9 >= this.ak && $$9 < 7 + this.ak) {
               dcv $$11 = $$10.a();
               dcv $$12 = $$10.b();
               dcv $$13 = $$10.c();
               dcv $$14 = $$10.f();
               int $$15 = $$7 + 2;
               this.a($$0, $$12, $$11, $$8, $$15);
               if (!$$13.f()) {
                  $$0.b($$13, $$5 + 5 + 35, $$15);
                  $$0.a(this.q, $$13, $$5 + 5 + 35, $$15);
               }

               this.a($$0, $$10, $$5, $$15);
               $$0.b($$14, $$5 + 5 + 68, $$15);
               $$0.a(this.q, $$14, $$5 + 5 + 68, $$15);
               $$7 += 20;
               $$9++;
            } else {
               $$9++;
            }
         }

         int $$16 = this.ai;
         dlq $$17 = $$4.get($$16);
         if (this.x.q()) {
            this.a($$0, $$5, $$6, $$17);
         }

         if ($$17.r() && this.a(186, 35, 22, 21, $$1, $$2) && this.x.o()) {
            $$0.a(this.q, ah, $$1, $$2);
         }

         for (ghh.a $$18 : this.aj) {
            if ($$18.C()) {
               $$18.a($$0, $$1, $$2);
            }

            $$18.k = $$18.a < this.x.p().size();
         }
      }

      this.b($$0, $$1, $$2);
   }

   private void a(fxb $$0, dlq $$1, int $$2, int $$3) {
      if ($$1.r()) {
         $$0.a(gxx.ar, K, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      } else {
         $$0.a(gxx.ar, L, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
      }
   }

   private void a(fxb $$0, dcv $$1, dcv $$2, int $$3, int $$4) {
      $$0.b($$1, $$3, $$4);
      if ($$2.M() == $$1.M()) {
         $$0.a(this.q, $$1, $$3, $$4);
      } else {
         $$0.a(this.q, $$2, $$3, $$4, $$2.M() == 1 ? "1" : null);
         $$0.a(this.q, $$1, $$3 + 14, $$4, $$1.M() == 1 ? "1" : null);
         $$0.a(gxx.ar, M, $$3 + 7, $$4 + 12, 9, 2);
      }
   }

   private boolean a(int $$0) {
      return $$0 > 7;
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else {
         int $$4 = this.x.p().size();
         if (this.a($$4)) {
            int $$5 = $$4 - 7;
            this.ak = bcb.a((int)(this.ak - $$3), 0, $$5);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.x.p().size();
      if (this.al) {
         int $$6 = this.B + 18;
         int $$7 = $$6 + 139;
         int $$8 = $$5 - 7;
         float $$9 = ((float)$$1 - $$6 - 13.5F) / ($$7 - $$6 - 27.0F);
         $$9 = $$9 * $$8 + 0.5F;
         this.ak = bcb.a((int)$$9, 0, $$8);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.al = false;
      int $$3 = (this.o - this.d) / 2;
      int $$4 = (this.p - this.e) / 2;
      if (this.a(this.x.p().size()) && $$0 > $$3 + 94 && $$0 < $$3 + 94 + 6 && $$1 > $$4 + 18 && $$1 <= $$4 + 18 + 139 + 1) {
         this.al = true;
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends fxo {
      final int a;

      public a(final int $$0, final int $$1, final int $$2, final fxo.c $$3) {
         super($$0, $$1, 88, 20, xn.a, $$3, q);
         this.a = $$2;
         this.k = false;
      }

      public int a() {
         return this.a;
      }

      public void a(fxb $$0, int $$1, int $$2) {
         if (this.i && ghh.this.x.p().size() > this.a + ghh.this.ak) {
            if ($$1 < this.E() + 20) {
               dcv $$3 = ghh.this.x.p().get(this.a + ghh.this.ak).b();
               $$0.b(ghh.this.q, $$3, $$1, $$2);
            } else if ($$1 < this.E() + 50 && $$1 > this.E() + 30) {
               dcv $$4 = ghh.this.x.p().get(this.a + ghh.this.ak).c();
               if (!$$4.f()) {
                  $$0.b(ghh.this.q, $$4, $$1, $$2);
               }
            } else if ($$1 > this.E() + 65) {
               dcv $$5 = ghh.this.x.p().get(this.a + ghh.this.ak).f();
               $$0.b(ghh.this.q, $$5, $$1, $$2);
            }
         }
      }
   }
}
