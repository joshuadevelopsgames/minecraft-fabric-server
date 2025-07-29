import javax.annotation.Nullable;

public class cow extends coq {
   private final cox ck = new cox(this);
   private static final int cl = 18000;
   private static final boolean cm = false;
   private static final int co = 0;
   private static final bzp cp = bzv.bi.n().a(bzo.a().a(bzn.a, 0.0F, bzv.bi.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cq = false;
   private int cr = 0;

   public cow(bzv<? extends cow> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public static cbr.a m() {
      return hh().a(cbs.t, 15.0).a(cbs.w, 0.2F);
   }

   public static boolean c(bzv<? extends cmd> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return !bzu.a($$2) ? cmd.b($$0, $$1, $$2, $$3, $$4) : bzu.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bck $$0) {
      this.h(cbs.p).a(a($$0::j));
   }

   @Override
   protected void gZ() {
   }

   @Override
   protected ayy p() {
      return this.a(azu.a) ? ayz.yx : ayz.yt;
   }

   @Override
   protected ayy f_() {
      return ayz.yu;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.yv;
   }

   @Override
   protected ayy aY() {
      if (this.aK()) {
         if (!this.cd()) {
            return ayz.yA;
         }

         this.cG++;
         if (this.cG > 5 && this.cG % 3 == 0) {
            return ayz.yy;
         }

         if (this.cG <= 5) {
            return ayz.yA;
         }
      }

      return ayz.yw;
   }

   @Override
   protected void g(float $$0) {
      if (this.aK()) {
         super.g(0.3F);
      } else {
         super.g(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void ho() {
      if (this.bm()) {
         this.a(ayz.yz, 0.4F, 1.0F);
      } else {
         super.ho();
      }
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cp : super.e($$0);
   }

   @Override
   public void e_() {
      super.e_();
      if (this.n() && this.cr++ >= 18000) {
         this.at();
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("SkeletonTrap", this.n());
      $$0.a("SkeletonTrapTime", this.cr);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("SkeletonTrap", false));
      this.cr = $$0.a("SkeletonTrapTime", 0);
   }

   @Override
   protected float fq() {
      return 0.96F;
   }

   public boolean n() {
      return this.cq;
   }

   public void x(boolean $$0) {
      if ($$0 != this.cq) {
         this.cq = $$0;
         if ($$0) {
            this.ch.a(1, this.ck);
         } else {
            this.ch.a(this.ck);
         }
      }
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.bi.a($$0, bzu.e);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      return (bxj)(!this.gY() ? bxj.e : super.b($$0, $$1));
   }
}
