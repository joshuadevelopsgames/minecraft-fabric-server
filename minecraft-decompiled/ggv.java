import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ggv extends gfz<czi> {
   private static final ame[] K = new ame[]{
      ame.b("container/enchanting_table/level_1"), ame.b("container/enchanting_table/level_2"), ame.b("container/enchanting_table/level_3")
   };
   private static final ame[] L = new ame[]{
      ame.b("container/enchanting_table/level_1_disabled"),
      ame.b("container/enchanting_table/level_2_disabled"),
      ame.b("container/enchanting_table/level_3_disabled")
   };
   private static final ame M = ame.b("container/enchanting_table/enchantment_slot_disabled");
   private static final ame N = ame.b("container/enchanting_table/enchantment_slot_highlighted");
   private static final ame O = ame.b("container/enchanting_table/enchantment_slot");
   private static final ame P = ame.b("textures/gui/container/enchanting_table.png");
   private static final ame Q = ame.b("textures/entity/enchanting_table_book.png");
   private final bck R = bck.a();
   private gmm S;
   public float E;
   public float F;
   public float G;
   public float H;
   public float I;
   public float J;
   private dcv T = dcv.l;

   public ggv(czi $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.S = new gmm(this.n.aT().a(gqm.J));
   }

   @Override
   public void m() {
      super.m();
      this.n.t.cO = this.n.t.as;
      this.E();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = (this.o - this.d) / 2;
      int $$4 = (this.p - this.e) / 2;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         double $$6 = $$0 - ($$3 + 60);
         double $$7 = $$1 - ($$4 + 14 + 19 * $$5);
         if ($$6 >= 0.0 && $$7 >= 0.0 && $$6 < 108.0 && $$7 < 19.0 && this.x.a(this.n.t, $$5)) {
            this.n.r.a(this.x.l, $$5);
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.o - this.d) / 2;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, P, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      this.d($$0, $$4, $$5);
      ggu.a().a(this.x.m());
      int $$6 = this.x.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.x.m[$$7];
         if ($$10 == 0) {
            $$0.a(gxx.ar, M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.q.b($$11);
            xt $$13 = ggu.a().a(this.q, $$12);
            int $$14 = -9937334;
            if (($$6 < $$7 + 1 || this.n.t.cB < $$10) && !this.n.t.gc()) {
               $$0.a(gxx.ar, M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               $$0.a(gxx.ar, L[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.q, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, baj.f(($$14 & 16711422) >> 1), false);
               $$14 = -12550384;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(gxx.ar, N, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                  $$14 = -128;
               } else {
                  $$0.a(gxx.ar, O, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               }

               $$0.a(gxx.ar, K[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.q, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14, false);
               $$14 = -8323296;
            }

            $$0.b(this.q, $$11, $$9 + 86 - this.q.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void d(fxb $$0, int $$1, int $$2) {
      float $$3 = this.n.aw().a(false);
      float $$4 = bcb.h($$3, this.J, this.I);
      float $$5 = bcb.h($$3, this.F, this.E);
      int $$6 = $$1 + 14;
      int $$7 = $$2 + 14;
      int $$8 = $$6 + 38;
      int $$9 = $$7 + 31;
      $$0.a(this.S, Q, 40.0F, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      float $$4 = this.n.aw().a(false);
      super.a($$0, $$1, $$2, $$4);
      this.b($$0, $$1, $$2);
      boolean $$5 = this.n.t.gc();
      int $$6 = this.x.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = this.x.m[$$7];
         Optional<jl.c<dji>> $$9 = this.n.s.K_().f(mn.aW).c(this.x.n[$$7]);
         if (!$$9.isEmpty()) {
            int $$10 = this.x.o[$$7];
            int $$11 = $$7 + 1;
            if (this.a(60, 14 + 19 * $$7, 108, 17, $$1, $$2) && $$8 > 0 && $$10 >= 0 && $$9 != null) {
               List<xo> $$12 = Lists.newArrayList();
               $$12.add(xo.a("container.enchant.clue", dji.a($$9.get(), $$10)).a(o.p));
               if (!$$5) {
                  $$12.add(xn.a);
                  if (this.n.t.cB < $$8) {
                     $$12.add(xo.a("container.enchant.level.requirement", this.x.m[$$7]).a(o.m));
                  } else {
                     yc $$13;
                     if ($$11 == 1) {
                        $$13 = xo.c("container.enchant.lapis.one");
                     } else {
                        $$13 = xo.a("container.enchant.lapis.many", $$11);
                     }

                     $$12.add($$13.a($$6 >= $$11 ? o.h : o.m));
                     yc $$15;
                     if ($$11 == 1) {
                        $$15 = xo.c("container.enchant.level.one");
                     } else {
                        $$15 = xo.a("container.enchant.level.many", $$11);
                     }

                     $$12.add($$15.a(o.h));
                  }
               }

               $$0.a(this.q, $$12, $$1, $$2);
               break;
            }
         }
      }
   }

   @Override
   public void E() {
      dcv $$0 = this.x.b(0).g();
      if (!dcv.a($$0, this.T)) {
         this.T = $$0;

         do {
            this.G = this.G + (this.R.a(4) - this.R.a(4));
         } while (this.E <= this.G + 1.0F && this.E >= this.G - 1.0F);
      }

      this.F = this.E;
      this.J = this.I;
      boolean $$1 = false;

      for (int $$2 = 0; $$2 < 3; $$2++) {
         if (this.x.m[$$2] != 0) {
            $$1 = true;
         }
      }

      if ($$1) {
         this.I += 0.2F;
      } else {
         this.I -= 0.2F;
      }

      this.I = bcb.a(this.I, 0.0F, 1.0F);
      float $$3 = (this.G - this.E) * 0.4F;
      float $$4 = 0.2F;
      $$3 = bcb.a($$3, -0.2F, 0.2F);
      this.H = this.H + ($$3 - this.H) * 0.9F;
      this.E = this.E + this.H;
   }
}
