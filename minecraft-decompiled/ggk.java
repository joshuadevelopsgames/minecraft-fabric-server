import javax.annotation.Nullable;

public class ggk extends gfz<cyu> {
   private static final ame E = ame.b("container/cartography_table/error");
   private static final ame F = ame.b("container/cartography_table/scaled_map");
   private static final ame G = ame.b("container/cartography_table/duplicated_map");
   private static final ame H = ame.b("container/cartography_table/map");
   private static final ame I = ame.b("container/cartography_table/locked");
   private static final ame J = ame.b("textures/gui/container/cartography_table.png");
   private final hra K = new hra();

   public ggk(cyu $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.u -= 2;
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
      dcv $$6 = this.x.b(1).g();
      boolean $$7 = $$6.a(dcz.vL);
      boolean $$8 = $$6.a(dcz.rV);
      boolean $$9 = $$6.a(dcz.gp);
      dcv $$10 = this.x.b(0).g();
      fce $$11 = $$10.a(kq.M);
      boolean $$12 = false;
      fcg $$13;
      if ($$11 != null) {
         $$13 = ddi.a($$11, this.n.s);
         if ($$13 != null) {
            if ($$13.i) {
               $$12 = true;
               if ($$8 || $$9) {
                  $$0.a(gxx.ar, E, $$4 + 35, $$5 + 31, 28, 21);
               }
            }

            if ($$8 && $$13.g >= 4) {
               $$12 = true;
               $$0.a(gxx.ar, E, $$4 + 35, $$5 + 31, 28, 21);
            }
         }
      } else {
         $$13 = null;
      }

      this.a($$0, $$11, $$13, $$7, $$8, $$9, $$12);
   }

   private void a(fxb $$0, @Nullable fce $$1, @Nullable fcg $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.A;
      int $$8 = this.B;
      if ($$4 && !$$6) {
         $$0.a(gxx.ar, F, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(gxx.ar, G, $$7 + 67 + 16, $$8 + 13, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c();
         $$0.a(gxx.ar, G, $$7 + 67, $$8 + 13 + 16, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
      } else if ($$5) {
         $$0.a(gxx.ar, H, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.a(gxx.ar, I, $$7 + 118, $$8 + 60, 10, 14);
      } else {
         $$0.a(gxx.ar, H, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(fxb $$0, @Nullable fce $$1, @Nullable fcg $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.e().pushMatrix();
         $$0.e().translate($$3, $$4);
         $$0.e().scale($$5, $$5);
         this.n.au().a($$1, $$2, this.K);
         $$0.a(this.K);
         $$0.e().popMatrix();
      }
   }
}
