import javax.annotation.Nullable;

public class cni extends cma implements cbc, crz {
   private static final alh<Byte> a = all.a(cni.class, alj.a);
   private static final byte b = 16;
   private static final boolean c = true;

   public cni(bzv<? extends cni> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(1, new cih(this, 1.25, 20, 10.0F));
      this.ch.a(2, new civ(this, 1.0, 1.0000001E-5F));
      this.ch.a(3, new chq(this, cut.class, 6.0F));
      this.ch.a(4, new cid(this));
      this.ci.a(1, new cjb<>(this, cao.class, 10, true, false, ($$0, $$1) -> $$0 instanceof crn));
   }

   public static cbr.a l() {
      return cao.I().a(cbs.t, 4.0).a(cbs.w, 0.2F);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("Pumpkin", true));
   }

   @Override
   public boolean fx() {
      return true;
   }

   @Override
   public void e_() {
      super.e_();
      if (this.ai() instanceof aub $$0) {
         if (this.ai().v(this.dx()).a(azn.ae)) {
            this.a($$0, this.ea().d(), 1.0F);
         }

         if (!$$0.P().c(dmq.d)) {
            return;
         }

         eeb $$1 = dqb.ed.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = bcb.a(this.dC() + ($$2 % 2 * 2 - 1) * 0.25F);
            int $$4 = bcb.a(this.dE());
            int $$5 = bcb.a(this.dI() + ($$2 / 2 % 2 * 2 - 1) * 0.25F);
            jb $$6 = new jb($$3, $$4, $$5);
            if (this.ai().a_($$6).l() && $$1.a((dmx)this.ai(), $$6)) {
               this.ai().c($$6, $$1);
               this.ai().a(ejb.i, $$6, ejb.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(cam $$0, float $$1) {
      double $$2 = $$0.dC() - this.dC();
      double $$3 = $$0.dG() - 1.1F;
      double $$4 = $$0.dI() - this.dI();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.ai() instanceof aub $$6) {
         dcv $$7 = new dcv(dcz.rJ);
         cvo.a(new cvt($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dE(), $$4, 1.6F, 12.0F));
      }

      this.a(ayz.Aj, 1.0F, 0.4F / (this.ec().i() * 0.4F + 0.8F));
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.tu) && this.a()) {
         if (this.ai() instanceof aub $$3) {
            this.a($$3, aza.h, $$2);
            this.a(ejb.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   @Override
   public void a(aub $$0, aza $$1, dcv $$2) {
      $$0.a(null, this, ayz.Ak, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, fdf.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cW()));
   }

   @Override
   public boolean a() {
      return this.bO() && this.m();
   }

   public boolean m() {
      return (this.ay.a(a) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ay.a(a);
      if ($$0) {
         this.ay.a(a, (byte)($$1 | 16));
      } else {
         this.ay.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected ayy p() {
      return ayz.Ag;
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return ayz.Ai;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.Ah;
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.75F * this.cW(), this.ds() * 0.4F);
   }
}
