public class gdv extends get {
   private static final int a = 8;
   private static final int b = 210;
   private static final xo c = xo.c("credits_and_attribution.screen.title");
   private static final xo d = xo.c("credits_and_attribution.button.credits");
   private static final xo e = xo.c("credits_and_attribution.button.attribution");
   private static final xo f = xo.c("credits_and_attribution.button.licenses");
   private final get u;
   private final gbk v = new gbk(this);

   public gdv(get $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aV_() {
      this.v.a(c, this.q);
      gbo $$0 = this.v.c(gbo.d()).a(8);
      $$0.c().b();
      $$0.a(fxo.a(d, $$0x -> this.l()).a(210).a());
      $$0.a(fxo.a(e, gdq.b(this, bav.d)).a(210).a());
      $$0.a(fxo.a(f, gdq.b(this, bav.e)).a(210).a());
      this.v.b(fxo.a(xn.d, $$0x -> this.aP_()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void l() {
      this.n.a(new gew(false, () -> this.n.a(this)));
   }

   @Override
   public void aP_() {
      this.n.a(this.u);
   }
}
