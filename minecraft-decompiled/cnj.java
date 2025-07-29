import java.util.Objects;
import javax.annotation.Nullable;

public class cnj extends cmc {
   public float ck;
   public float cl;
   public float cm;
   public float cn;
   public float co;
   public float cp;
   public float cq;
   public float cr;
   private float cs;
   private float ct;
   private float cu;
   fis cv = fis.c;

   public cnj(bzv<? extends cnj> $$0, dmu $$1) {
      super($$0, $$1);
      this.ar.b((long)this.ar());
      this.ct = 1.0F / (this.ar.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void H() {
      this.ch.a(0, new cnj.b(this));
      this.ch.a(1, new cnj.a());
   }

   public static cbr.a gH() {
      return cao.I().a(cbs.t, 10.0);
   }

   @Override
   protected ayy p() {
      return ayz.AC;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.AE;
   }

   @Override
   protected ayy f_() {
      return ayz.AD;
   }

   protected ayy n() {
      return ayz.AF;
   }

   @Override
   public boolean v() {
      return true;
   }

   @Override
   protected float fk() {
      return 0.4F;
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.bt.a($$0, bzu.e);
   }

   @Override
   protected double bg() {
      return 0.08;
   }

   @Override
   public void e_() {
      super.e_();
      this.cl = this.ck;
      this.cn = this.cm;
      this.cp = this.co;
      this.cr = this.cq;
      this.co = this.co + this.ct;
      if (this.co > Math.PI * 2) {
         if (this.ai().C) {
            this.co = (float) (Math.PI * 2);
         } else {
            this.co -= (float) (Math.PI * 2);
            if (this.ar.a(10) == 0) {
               this.ct = 1.0F / (this.ar.i() + 1.0F) * 0.2F;
            }

            this.ai().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.co < (float) Math.PI) {
            float $$0 = this.co / (float) Math.PI;
            this.cq = bcb.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ($$0 > 0.75) {
               if (this.di()) {
                  this.i(this.cv);
               }

               this.cu = 1.0F;
            } else {
               this.cu *= 0.8F;
            }
         } else {
            this.cq = 0.0F;
            if (this.di()) {
               this.i(this.dA().c(0.9));
            }

            this.cu *= 0.99F;
         }

         fis $$1 = this.dA();
         double $$2 = $$1.i();
         this.br = this.br + (-((float)bcb.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.br) * 0.1F;
         this.v(this.br);
         this.cm = this.cm + (float) Math.PI * this.cu * 1.5F;
         this.ck = this.ck + (-((float)bcb.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.ck) * 0.1F;
      } else {
         this.cq = bcb.e(bcb.a(this.co)) * (float) Math.PI * 0.25F;
         if (!this.ai().C) {
            double $$3 = this.dA().e;
            if (this.d(bys.y)) {
               $$3 = 0.05 * (this.e(bys.y).e() + 1);
            } else {
               $$3 -= this.bh();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.ck = this.ck + (-90.0F - this.ck) * 0.02F;
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.ew() != null) {
         this.t();
         return true;
      } else {
         return false;
      }
   }

   private fis m(fis $$0) {
      fis $$1 = $$0.a(this.cl * (float) (Math.PI / 180.0));
      return $$1.b(-this.bs * (float) (Math.PI / 180.0));
   }

   private void t() {
      this.b(this.n());
      fis $$0 = this.m(new fis(0.0, -1.0, 0.0)).b(this.dC(), this.dE(), this.dI());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fis $$2 = this.m(new fis(this.ar.i() * 0.6 - 0.3, -1.0, this.ar.i() * 0.6 - 0.3));
         float $$3 = this.g_() ? 0.1F : 0.3F;
         fis $$4 = $$2.c((double)($$3 + this.ar.i() * 2.0F));
         ((aub)this.ai()).a(this.m(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected mc m() {
      return me.al;
   }

   @Override
   public void k(fis $$0) {
      this.a(caq.a, this.dA());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.co = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gI() {
      return this.cv.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cbe $$4 = Objects.requireNonNullElseGet($$3, () -> new bzc.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends chi {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         cam $$0 = cnj.this.ew();
         return cnj.this.bm() && $$0 != null ? cnj.this.g((bzm)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         cam $$0 = cnj.this.ew();
         if ($$0 != null) {
            fis $$1 = new fis(cnj.this.dC() - $$0.dC(), cnj.this.dE() - $$0.dE(), cnj.this.dI() - $$0.dI());
            eeb $$2 = cnj.this.ai().a_(jb.a(cnj.this.dC() + $$1.d, cnj.this.dE() + $$1.e, cnj.this.dI() + $$1.f));
            fal $$3 = cnj.this.ai().b_(jb.a(cnj.this.dC() + $$1.d, cnj.this.dE() + $$1.e, cnj.this.dI() + $$1.f));
            if ($$3.a(azu.a) || $$2.l()) {
               double $$4 = $$1.g();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.c($$5);
                  }
               }

               if ($$2.l()) {
                  $$1 = $$1.a(0.0, $$1.e, 0.0);
               }

               cnj.this.cv = new fis($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cnj.this.ai().a(me.d, cnj.this.dC(), cnj.this.dE(), cnj.this.dI(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends chi {
      private final cnj a;

      public b(cnj $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.eB();
         if ($$0 > 100) {
            this.a.cv = fis.c;
         } else if (this.a.ec().a(b(50)) == 0 || !this.a.at || !this.a.gI()) {
            float $$1 = this.a.ec().i() * (float) (Math.PI * 2);
            this.a.cv = new fis(bcb.b($$1) * 0.2F, -0.1F + this.a.ec().i() * 0.2F, bcb.a($$1) * 0.2F);
         }
      }
   }
}
