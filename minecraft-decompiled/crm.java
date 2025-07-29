public class crm extends crv {
   private static final int a = 2400;
   private static final int b = 0;
   private int c = 0;

   public crm(bzv<? extends crm> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 3;
   }

   @Override
   protected void H() {
      this.ch.a(1, new chc(this));
      this.ch.a(1, new cgx(this, this.ai()));
      this.ch.a(2, new chs(this, 1.0, false));
      this.ch.a(3, new civ(this, 1.0));
      this.ch.a(7, new chq(this, cut.class, 8.0F));
      this.ch.a(8, new cid(this));
      this.ci.a(1, new cja(this).a());
      this.ci.a(2, new cjb<>(this, cut.class, true));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 8.0).a(cbs.w, 0.25).a(cbs.c, 2.0);
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Override
   protected ayy p() {
      return ayz.iW;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.iY;
   }

   @Override
   protected ayy f_() {
      return ayz.iX;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.iZ, 0.15F, 1.0F);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c = $$0.a("Lifetime", 0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void g() {
      this.br = this.dP();
      super.g();
   }

   @Override
   public void s(float $$0) {
      this.v($$0);
      super.s($$0);
   }

   @Override
   public void e_() {
      super.e_();
      if (this.ai().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.ai().a(me.af, this.d(0.5), this.dF(), this.g(0.5), (this.ar.j() - 0.5) * 2.0, -this.ar.j(), (this.ar.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gq()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bzv<crm> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bzu.a($$2)) {
         return true;
      } else {
         cut $$5 = $$1.a($$3.u() + 0.5, $$3.v() + 0.5, $$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
