public class csl extends cwk implements crz {
   private static final ame a = ame.b("drinking");
   private static final cbq b = new cbq(a, -0.25, cbq.a.a);
   private static final alh<Boolean> e = all.a(csl.class, alj.k);
   private int f;
   private cjd<cwk> ck;
   private cjc<cut> cl;

   public csl(bzv<? extends csl> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
      this.ck = new cjd<>(this, cwk.class, true, ($$0, $$1) -> this.gX() && $$0.ap() != bzv.bK);
      this.cl = new cjc<>(this, cut.class, 10, true, false, null);
      this.ch.a(1, new chc(this));
      this.ch.a(2, new cih(this, 1.0, 60, 10.0F));
      this.ch.a(2, new civ(this, 1.0));
      this.ch.a(3, new chq(this, cut.class, 8.0F));
      this.ch.a(3, new cid(this));
      this.ci.a(1, new cja(this, cwk.class));
      this.ci.a(2, this.ck);
      this.ci.a(3, this.cl);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   protected ayy p() {
      return ayz.DV;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.DZ;
   }

   @Override
   protected ayy f_() {
      return ayz.DX;
   }

   public void z(boolean $$0) {
      this.au().a(e, $$0);
   }

   public boolean l() {
      return this.au().a(e);
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.t, 26.0).a(cbs.w, 0.25);
   }

   @Override
   public void e_() {
      if (!this.ai().C && this.bO()) {
         this.ck.k();
         if (this.ck.i() <= 0) {
            this.cl.a(true);
         } else {
            this.cl.a(false);
         }

         if (this.l()) {
            if (this.f-- <= 0) {
               this.z(false);
               dcv $$0 = this.fh();
               this.a(bzw.a, dcv.l);
               der $$1 = $$0.a(kq.R);
               if ($$0.a(dcz.tK) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kq.S, 1.0F));
               }

               this.c(ejb.l);
               this.h(cbs.w).c(b.a());
            }
         } else {
            jl<dep> $$2 = null;
            if (this.ar.i() < 0.15F && this.a(azu.a) && !this.d(bys.m)) {
               $$2 = des.w;
            } else if (this.ar.i() < 0.15F && (this.cb() || this.eN() != null && this.eN().a(azp.i)) && !this.d(bys.l)) {
               $$2 = des.l;
            } else if (this.ar.i() < 0.05F && this.eL() < this.fa()) {
               $$2 = des.y;
            } else if (this.ar.i() < 0.5F && this.e() != null && !this.d(bys.a) && this.e().g(this) > 121.0) {
               $$2 = des.n;
            }

            if ($$2 != null) {
               this.a(bzw.a, der.a(dcz.tK, $$2));
               this.f = this.fh().a((cam)this);
               this.z(true);
               if (!this.be()) {
                  this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.DY, this.do(), 1.0F, 0.8F + this.ar.i() * 0.4F);
               }

               cbo $$3 = this.h(cbs.w);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ar.i() < 7.5E-4F) {
            this.ai().a(this, (byte)15);
         }
      }

      super.e_();
   }

   @Override
   public ayy ag_() {
      return ayz.DW;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ar.a(35) + 10; $$1++) {
            this.ai().a(me.aq, this.dC() + this.ar.k() * 0.13F, this.cV().e + 0.5 + this.ar.k() * 0.13F, this.dI() + this.ar.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(byb $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(azp.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(cam $$0, float $$1) {
      if (!this.l()) {
         fis $$2 = $$0.dA();
         double $$3 = $$0.dC() + $$2.d - this.dC();
         double $$4 = $$0.dG() - 1.1F - this.dE();
         double $$5 = $$0.dI() + $$2.f - this.dI();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jl<dep> $$7 = des.A;
         if ($$0 instanceof cwk) {
            if ($$0.eL() <= 4.0F) {
               $$7 = des.y;
            } else {
               $$7 = des.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.d(bys.b)) {
            $$7 = des.q;
         } else if ($$0.eL() >= 8.0F && !$$0.d(bys.s)) {
            $$7 = des.C;
         } else if ($$6 <= 3.0 && !$$0.d(bys.r) && this.ar.i() < 0.25F) {
            $$7 = des.L;
         }

         if (this.ai() instanceof aub $$8) {
            dcv $$9 = der.a(dcz.wR, $$7);
            cvo.a(cwb::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.be()) {
            this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.Ea, this.do(), 1.0F, 0.8F + this.ar.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(aub $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gH() {
      return false;
   }
}
