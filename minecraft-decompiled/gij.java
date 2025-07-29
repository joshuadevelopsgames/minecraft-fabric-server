public class gij extends giq {
   public static final xo a = xo.c("options.accessibility.title");

   private static fuh<?>[] a(fui $$0) {
      return new fuh[]{
         $$0.aw(),
         $$0.aa(),
         $$0.v(),
         $$0.K(),
         $$0.r(),
         $$0.t(),
         $$0.ac(),
         $$0.p(),
         $$0.q(),
         $$0.D(),
         $$0.E(),
         $$0.af(),
         $$0.ag(),
         $$0.ah(),
         $$0.an(),
         $$0.ao(),
         $$0.ap(),
         $$0.as(),
         $$0.aq(),
         $$0.ar(),
         $$0.b(),
         $$0.a(),
         $$0.u(),
         $$0.c(),
         $$0.x(),
         $$0.L(),
         $$0.w()
      };
   }

   public gij(get $$0, fui $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aV_() {
      super.aV_();
      fxm $$0 = this.d.b(this.c.v());
      if ($$0 != null && !this.n.ae().c().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fzb.a(xo.c("options.accessibility.high_contrast.error.tooltip")));
      }

      fxm $$1 = this.d.b(this.c.L());
      if ($$1 != null) {
         $$1.j = this.F();
      }
   }

   @Override
   protected void l() {
      this.d.a(a(this.c));
   }

   @Override
   protected void m() {
      gbo $$0 = this.e.b(gbo.e().a(8));
      $$0.a(fxo.a(xo.c("options.accessibility.link"), gdq.b(this, bav.l)).a());
      $$0.a(fxo.a(xn.d, $$0x -> this.n.a(this.b)).a());
   }

   private boolean F() {
      return this.n.s != null && this.n.s.L().b(cyf.d);
   }
}
