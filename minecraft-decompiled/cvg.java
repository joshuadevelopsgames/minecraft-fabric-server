import javax.annotation.Nullable;

public class cvg extends bzm implements cbk {
   public static final int a = 20;
   public static final int b = 2;
   public static final int c = 14;
   private static final int d = 0;
   private int e = 0;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private bzs<cam> i;

   public cvg(bzv<? extends cvg> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvg(dmu $$0, double $$1, double $$2, double $$3, float $$4, int $$5, cam $$6) {
      this(bzv.U, $$0);
      this.e = $$5;
      this.a($$6);
      this.v($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(all.a $$0) {
   }

   public void a(@Nullable cam $$0) {
      this.i = $$0 != null ? new bzs<>($$0) : null;
   }

   @Nullable
   public cam e() {
      return bzs.a(this.i, this.ai(), cam.class);
   }

   @Override
   protected void a(fda $$0) {
      this.e = $$0.a("Warmup", 0);
      this.i = bzs.a($$0, "Owner");
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("Warmup", this.e);
      bzs.a(this.i, $$0, "Owner");
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dC() + (this.ar.j() * 2.0 - 1.0) * this.ds() * 0.5;
                  double $$2 = this.dE() + 0.05 + this.ar.j();
                  double $$3 = this.dI() + (this.ar.j() * 2.0 - 1.0) * this.ds() * 0.5;
                  double $$4 = (this.ar.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ar.j() * 0.3;
                  double $$6 = (this.ar.j() * 2.0 - 1.0) * 0.3;
                  this.ai().a(me.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (cam $$8 : this.ai().a(cam.class, this.cV().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.ai().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.at();
         }
      }
   }

   private void c(cam $$0) {
      cam $$1 = this.e();
      if ($$0.bO() && !$$0.cG() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.ea().q(), 6.0F);
         } else {
            if ($$1.t($$0)) {
               return;
            }

            byb $$2 = this.ea().c(this, (bzm)$$1);
            if (this.ai() instanceof aub $$3 && $$0.a($$3, $$2, 6.0F)) {
               djk.a($$3, (bzm)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.be()) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.ji, this.do(), 1.0F, this.ar.i() * 0.2F + 0.85F, false);
         }
      }
   }

   public float a(float $$0) {
      if (!this.h) {
         return 0.0F;
      } else {
         int $$1 = this.g - 2;
         return $$1 <= 0 ? 1.0F : 1.0F - ($$1 - $$0) / 20.0F;
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }
}
