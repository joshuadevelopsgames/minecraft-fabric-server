import java.util.List;
import javax.annotation.Nullable;

public class ghf extends gfz<czt> {
   private static final ame E = ame.b("container/slot/banner");
   private static final ame F = ame.b("container/slot/dye");
   private static final ame G = ame.b("container/slot/banner_pattern");
   private static final ame H = ame.b("container/loom/scroller");
   private static final ame I = ame.b("container/loom/scroller_disabled");
   private static final ame J = ame.b("container/loom/pattern_selected");
   private static final ame K = ame.b("container/loom/pattern_highlighted");
   private static final ame L = ame.b("container/loom/pattern");
   private static final ame M = ame.b("container/loom/error");
   private static final ame N = ame.b("textures/gui/container/loom.png");
   private static final int O = 4;
   private static final int P = 4;
   private static final int Q = 12;
   private static final int R = 15;
   private static final int S = 14;
   private static final int T = 56;
   private static final int U = 60;
   private static final int V = 13;
   private static final float W = 64.0F;
   private static final float X = 21.0F;
   private static final float Y = 40.0F;
   private gqn Z;
   @Nullable
   private eap aa;
   private dcv ab = dcv.l;
   private dcv ac = dcv.l;
   private dcv ad = dcv.l;
   private boolean ae;
   private boolean af;
   private float ag;
   private boolean ah;
   private int ai;

   public ghf(czt $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.u -= 2;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.Z = this.n.aT().a(gqm.r).b("flag");
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2);
   }

   private int E() {
      return bcb.e(this.x.l().size(), 4);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(gxx.ar, N, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      dak $$6 = this.x.n();
      dak $$7 = this.x.o();
      dak $$8 = this.x.p();
      dak $$9 = this.x.q();
      if (!$$6.h()) {
         $$0.a(gxx.ar, E, $$4 + $$6.e, $$5 + $$6.f, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(gxx.ar, F, $$4 + $$7.e, $$5 + $$7.f, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(gxx.ar, G, $$4 + $$8.e, $$5 + $$8.f, 16, 16);
      }

      int $$10 = (int)(41.0F * this.ag);
      ame $$11 = this.ae ? H : I;
      $$0.a(gxx.ar, $$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      if (this.aa != null && !this.af) {
         dbt $$12 = ((dbb)$$9.g().h()).a();
         int $$13 = $$4 + 141;
         int $$14 = $$5 + 8;
         $$0.a(this.Z, $$12, this.aa, $$13, $$14, $$13 + 20, $$14 + 40);
      } else if (this.af) {
         $$0.a(gxx.ar, M, $$4 + $$9.e - 5, $$5 + $$9.f - 5, 26, 26);
      }

      if (this.ae) {
         int $$15 = $$4 + 60;
         int $$16 = $$5 + 13;
         List<jl<eao>> $$17 = this.x.l();

         label64:
         for (int $$18 = 0; $$18 < 4; $$18++) {
            for (int $$19 = 0; $$19 < 4; $$19++) {
               int $$20 = $$18 + this.ai;
               int $$21 = $$20 * 4 + $$19;
               if ($$21 >= $$17.size()) {
                  break label64;
               }

               int $$22 = $$15 + $$19 * 14;
               int $$23 = $$16 + $$18 * 14;
               boolean $$24 = $$2 >= $$22 && $$3 >= $$23 && $$2 < $$22 + 14 && $$3 < $$23 + 14;
               ame $$25;
               if ($$21 == this.x.m()) {
                  $$25 = J;
               } else if ($$24) {
                  $$25 = K;
               } else {
                  $$25 = L;
               }

               $$0.a(gxx.ar, $$25, $$22, $$23, 14, 14);
               hrs $$28 = gyi.a($$17.get($$21)).c();
               this.a($$0, $$22, $$23, $$28);
            }
         }
      }

      fue.R().j.p().a(fnb.a.c);
   }

   private void a(fxb $$0, int $$1, int $$2, hrs $$3) {
      $$0.e().pushMatrix();
      $$0.e().translate($$1 + 4, $$2 + 2);
      float $$4 = $$3.c();
      float $$5 = $$4 + ($$3.d() - $$3.c()) * 21.0F / 64.0F;
      float $$6 = $$3.i() - $$3.h();
      float $$7 = $$3.h() + $$6 / 64.0F;
      float $$8 = $$7 + $$6 * 40.0F / 64.0F;
      int $$9 = 5;
      int $$10 = 10;
      $$0.a(0, 0, 5, 10, dbt.h.d());
      $$0.a($$3.j(), 0, 0, 5, 10, $$4, $$5, $$7, $$8);
      $$0.e().popMatrix();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ah = false;
      if (this.ae) {
         int $$3 = this.A + 60;
         int $$4 = this.B + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - ($$3 + $$6 * 14);
               double $$8 = $$1 - ($$4 + $$5 * 14);
               int $$9 = $$5 + this.ai;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.x.a(this.n.t, $$10)) {
                  fue.R().al().a(hvm.a(ayz.BV, 1.0F));
                  this.n.r.a(this.x.l, $$10);
                  return true;
               }
            }
         }

         $$3 = this.A + 119;
         $$4 = this.B + 9;
         if ($$0 >= $$3 && $$0 < $$3 + 12 && $$1 >= $$4 && $$1 < $$4 + 56) {
            this.ah = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.E() - 4;
      if (this.ah && this.ae && $$5 > 0) {
         int $$6 = this.B + 13;
         int $$7 = $$6 + 56;
         this.ag = ((float)$$1 - $$6 - 7.5F) / ($$7 - $$6 - 15.0F);
         this.ag = bcb.a(this.ag, 0.0F, 1.0F);
         this.ai = Math.max((int)(this.ag * $$5 + 0.5), 0);
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
         int $$4 = this.E() - 4;
         if (this.ae && $$4 > 0) {
            float $$5 = (float)$$3 / $$4;
            this.ag = bcb.a(this.ag - $$5, 0.0F, 1.0F);
            this.ai = Math.max((int)(this.ag * $$4 + 0.5F), 0);
         }

         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < $$2 || $$1 < $$3 || $$0 >= $$2 + this.d || $$1 >= $$3 + this.e;
   }

   private void F() {
      dcv $$0 = this.x.q().g();
      if ($$0.f()) {
         this.aa = null;
      } else {
         this.aa = $$0.a(kq.am, eap.a);
      }

      dcv $$1 = this.x.n().g();
      dcv $$2 = this.x.o().g();
      dcv $$3 = this.x.p().g();
      eap $$4 = $$1.a(kq.am, eap.a);
      this.af = $$4.b().size() >= 6;
      if (this.af) {
         this.aa = null;
      }

      if (!dcv.a($$1, this.ab) || !dcv.a($$2, this.ac) || !dcv.a($$3, this.ad)) {
         this.ae = !$$1.f() && !$$2.f() && !this.af && !this.x.l().isEmpty();
      }

      if (this.ai >= this.E()) {
         this.ai = 0;
         this.ag = 0.0F;
      }

      this.ab = $$1.v();
      this.ac = $$2.v();
      this.ad = $$3.v();
   }
}
