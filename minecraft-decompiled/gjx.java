public class gjx extends get {
   private static final xo a = xo.c("gui.abuseReport.title");
   private static final xo b = xo.c("gui.abuseReport.message");
   private static final xo c = xo.c("gui.abuseReport.type.chat");
   private static final xo d = xo.c("gui.abuseReport.type.skin");
   private static final xo e = xo.c("gui.abuseReport.type.name");
   private static final int f = 6;
   private final get u;
   private final gst v;
   private final gkb w;
   private final gbo x = gbo.d().a(6);

   public gjx(get $$0, gst $$1, gkb $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   protected void aV_() {
      this.x.c().b();
      this.x.a(new fyx(this.m, this.q), this.x.b().e(6));
      this.x.a(new fyj(b, this.q).b(true), this.x.b().e(6));
      fxo $$0 = this.x.a(fxo.a(c, $$0x -> this.n.a(new gjt(this.u, this.v, this.w.g()))).a());
      if (!this.w.k()) {
         $$0.j = false;
         $$0.a(fzb.a(xo.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.w.j()) {
         $$0.j = false;
         $$0.a(fzb.a(xo.a("gui.socialInteractions.tooltip.report.no_messages", this.w.c())));
      }

      this.x.a(fxo.a(d, $$0x -> this.n.a(new gjz(this.u, this.v, this.w.g(), this.w.h()))).a());
      this.x.a(fxo.a(e, $$0x -> this.n.a(new gjw(this.u, this.v, this.w.g(), this.w.c()))).a());
      this.x.a(gbp.b(20));
      this.x.a(fxo.a(xn.e, $$0x -> this.aP_()).a());
      this.x.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      gbi.a(this.x, this.I());
   }

   @Override
   public void aP_() {
      this.n.a(this.u);
   }
}
