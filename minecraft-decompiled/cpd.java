import javax.annotation.Nullable;

public class cpd extends cmd implements cbc {
   private static final int ck = 40;
   private static final alh<Byte> cl = all.a(cpd.class, alj.a);
   private static final dbt cm = dbt.a;
   private static final boolean co = false;
   private int cp;
   private cha cq;

   public cpd(bzv<? extends cpd> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.cq = new cha(this);
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cib(this, 1.25));
      this.ch.a(2, new cgu(this, 1.0));
      this.ch.a(3, new ciq(this, 1.1, $$0 -> $$0.a(azx.ay), false));
      this.ch.a(4, new chh(this, 1.1));
      this.ch.a(5, this.cq);
      this.ch.a(6, new civ(this, 1.0));
      this.ch.a(7, new chq(this, cut.class, 6.0F));
      this.ch.a(8, new cid(this));
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.ay);
   }

   @Override
   protected void a(aub $$0) {
      this.cp = this.cq.h();
      super.a($$0);
   }

   @Override
   public void e_() {
      if (this.ai().C) {
         this.cp = Math.max(0, this.cp - 1);
      }

      super.e_();
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 8.0).a(cbs.w, 0.23F);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cl, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cp = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.cp <= 0) {
         return 0.0F;
      } else if (this.cp >= 4 && this.cp <= 36) {
         return 1.0F;
      } else {
         return this.cp < 4 ? (this.cp - $$0) / 4.0F : -(this.cp - 40 - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.cp > 4 && this.cp <= 36) {
         float $$1 = (this.cp - 4 - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * bcb.a($$1 * 28.7F);
      } else {
         return this.cp > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.tu)) {
         if (this.ai() instanceof aub $$3 && this.a()) {
            this.a($$3, aza.h, $$2);
            this.a(ejb.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bxj.b;
         } else {
            return bxj.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aub $$0, aza $$1, dcv $$2) {
      $$0.a(null, this, ayz.xP, $$1, 1.0F, 1.0F);
      this.a($$0, fdf.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cqz $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dA().b((this.ar.i() - this.ar.i()) * 0.1F, this.ar.i() * 0.05F, (this.ar.i() - this.ar.i()) * 0.1F));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bO() && !this.t() && !this.g_();
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Sheared", this.t());
      $$0.a("Color", dbt.s, this.n());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("Sheared", false));
      this.a($$0.<dbt>a("Color", dbt.s).orElse(cm));
   }

   @Override
   protected ayy p() {
      return ayz.xM;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.xO;
   }

   @Override
   protected ayy f_() {
      return ayz.xN;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.xQ, 0.15F, 1.0F);
   }

   public dbt n() {
      return dbt.a(this.ay.a(cl) & 15);
   }

   public void a(dbt $$0) {
      byte $$1 = this.ay.a(cl);
      this.ay.a(cl, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aR ? c((kp<T>)$$0, this.n()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aR);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aR) {
         this.a(c(kq.aR, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public boolean t() {
      return (this.ay.a(cl) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ay.a(cl);
      if ($$0) {
         this.ay.a(cl, (byte)($$1 | 16));
      } else {
         this.ay.a(cl, (byte)($$1 & -17));
      }
   }

   public static dbt a(dnl $$0, jb $$1) {
      jl<dnx> $$2 = $$0.v($$1);
      return cpe.a($$2, $$0.H_());
   }

   @Nullable
   public cpd b(aub $$0, bzc $$1) {
      cpd $$2 = bzv.bd.a($$0, bzu.e);
      if ($$2 != null) {
         dbt $$3 = this.n();
         dbt $$4 = ((cpd)$$1).n();
         $$2.a(dbt.a($$0, $$3, $$4));
      }

      return $$2;
   }

   @Override
   public void V() {
      super.V();
      this.x(false);
      if (this.g_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.a(a($$0, this.dx()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
