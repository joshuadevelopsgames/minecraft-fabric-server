public class cwd extends cvc {
   private static final alh<Boolean> d = all.a(cwd.class, alj.k);
   private static final boolean f = false;

   public cwd(bzv<? extends cwd> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cwd(dmu $$0, cam $$1, fis $$2) {
      super(bzv.bN, $$1, $$2, $$0);
   }

   @Override
   protected float l() {
      return this.n() ? 0.73F : super.l();
   }

   @Override
   public boolean cb() {
      return false;
   }

   @Override
   public float a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4, float $$5) {
      return this.n() && cqm.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         bzm var8 = $$0.a();
         boolean $$7;
         if (this.ah_() instanceof cam $$5) {
            byb $$6 = this.ea().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bO()) {
                  djk.a($$1, var8, $$6);
               } else {
                  $$5.d(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.ea().q(), 5.0F);
         }

         if ($$7 && var8 instanceof cam $$9) {
            int $$10 = 0;
            if (this.ai().an() == bxg.c) {
               $$10 = 10;
            } else if (this.ai().an() == bxg.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new byq(bys.t, 20 * $$10, 1), this.y());
            }
         }
      }
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (!this.ai().C) {
         this.ai().a(this, this.dC(), this.dE(), this.dI(), 1.0F, false, dmu.a.c);
         this.at();
      }
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(d, false);
   }

   public boolean n() {
      return this.ay.a(d);
   }

   public void a(boolean $$0) {
      this.ay.a(d, $$0);
   }

   @Override
   protected boolean f() {
      return false;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("dangerous", this.n());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.a("dangerous", false));
   }
}
