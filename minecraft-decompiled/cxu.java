import javax.annotation.Nullable;

public class cxu extends cxg {
   private static final byte b = 10;
   private static final String c = "explosion_power";
   private static final String d = "explosion_speed_factor";
   private static final String h = "fuse";
   private static final float i = 4.0F;
   private static final float j = 1.0F;
   private static final int k = -1;
   @Nullable
   private byb l;
   private int m = -1;
   private float n = 4.0F;
   private float o = 1.0F;

   public cxu(bzv<? extends cxu> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public eeb u() {
      return dqb.cu.m();
   }

   @Override
   public void g() {
      super.g();
      if (this.m > 0) {
         this.m--;
         this.ai().a(me.ah, this.dC(), this.dE() + 0.5, this.dI(), 0.0, 0.0, 0.0);
      } else if (this.m == 0) {
         this.a(this.l, this.dA().j());
      }

      if (this.ac) {
         double $$0 = this.dA().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if ($$1.c() instanceof cvb $$4 && $$4.cb()) {
         byb $$5 = this.ea().d(this, $$1.d());
         this.a($$5, $$4.dA().h());
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(aub $$0, byb $$1) {
      double $$2 = this.dA().j();
      if (!f($$1) && !($$2 >= 0.01F)) {
         this.a($$0, this.p());
      } else {
         if (this.m < 0) {
            this.a($$1);
            this.m = this.ar.a(20) + this.ar.a(20);
         }
      }
   }

   @Override
   protected dcr p() {
      return dcz.oP;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.oP);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable byb $$0, double $$1) {
      if (this.ai() instanceof aub $$2) {
         if ($$2.P().c(dmq.ad)) {
            double $$3 = Math.min(Math.sqrt($$1), 5.0);
            $$2.a(this, $$0, null, this.dC(), this.dE(), this.dI(), (float)(this.n + this.o * this.ar.j() * 1.5 * $$3), false, dmu.a.d);
            this.at();
         } else if (this.q()) {
            this.at();
         }
      }
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      if ($$0 >= 3.0) {
         double $$3 = $$0 / 10.0;
         this.h($$3 * $$3);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.m < 0) {
         this.a(null);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.a(null);
      } else {
         super.b($$0);
      }
   }

   public void a(@Nullable byb $$0) {
      if (!(this.ai() instanceof aub $$1 && !$$1.P().c(dmq.ad))) {
         this.m = 80;
         if (!this.ai().C) {
            if ($$0 != null && this.l == null) {
               this.l = this.ea().d(this, $$0.d());
            }

            this.ai().a(this, (byte)10);
            if (!this.be()) {
               this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.Bb, aza.e, 1.0F, 1.0F);
            }
         }
      }
   }

   public int e() {
      return this.m;
   }

   public boolean q() {
      return this.m > -1;
   }

   @Override
   public float a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4, float $$5) {
      return !this.q() || !$$3.a(azo.K) && !$$1.a_($$2.d()).a(azo.K) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dmn $$0, dly $$1, jb $$2, eeb $$3, float $$4) {
      return !this.q() || !$$3.a(azo.K) && !$$1.a_($$2.d()).a(azo.K) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.m = $$0.a("fuse", -1);
      this.n = bcb.a($$0.a("explosion_power", 4.0F), 0.0F, 128.0F);
      this.o = bcb.a($$0.a("explosion_speed_factor", 1.0F), 0.0F, 128.0F);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("fuse", this.m);
      if (this.n != 4.0F) {
         $$0.a("explosion_power", this.n);
      }

      if (this.o != 1.0F) {
         $$0.a("explosion_speed_factor", this.o);
      }
   }

   @Override
   boolean e(byb $$0) {
      return f($$0);
   }

   private static boolean f(byb $$0) {
      return $$0.c() instanceof cvo $$1 ? $$1.cb() : $$0.a(azp.i) || $$0.a(azp.l);
   }
}
