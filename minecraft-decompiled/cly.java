public abstract class cly extends cmd {
   private static final bzp ck = bzv.D.n().a(0.5F).b(0.665F);

   public cly(bzv<? extends cly> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cib(this, 2.0));
      this.ch.a(2, new cgu(this, 1.0));
      this.ch.a(3, new ciq(this, 1.25, $$0 -> $$0.a(azx.aw), false));
      this.ch.a(4, new chh(this, 1.25));
      this.ch.a(5, new civ(this, 1.0));
      this.ch.a(6, new chq(this, cut.class, 6.0F));
      this.ch.a(7, new cid(this));
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aw);
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 10.0).a(cbs.w, 0.2F);
   }

   @Override
   protected ayy p() {
      return ayz.gf;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.gh;
   }

   @Override
   protected ayy f_() {
      return ayz.gg;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.gj, 0.15F, 1.0F);
   }

   @Override
   protected float fk() {
      return 0.4F;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.rF) && !this.g_()) {
         $$0.a(ayz.gi, 1.0F, 1.0F);
         dcv $$3 = dcy.a($$2, $$0, dcz.rL.m());
         $$0.a($$1, $$3);
         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? ck : super.e($$0);
   }
}
