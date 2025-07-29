public class gea extends get {
   private static final xo a = xo.c("gui.toMenu");
   private static final xo b = xo.c("gui.toTitle");
   private static final xo c = xo.c("gui.report_to_server");
   private static final xo d = xo.c("gui.open_report_dir");
   private final get e;
   private final wf f;
   private final xo u;
   private final gbo v = gbo.d();

   public gea(get $$0, xo $$1, xo $$2) {
      this($$0, $$1, new wf($$2));
   }

   public gea(get $$0, xo $$1, xo $$2, xo $$3) {
      this($$0, $$1, new wf($$2), $$3);
   }

   public gea(get $$0, xo $$1, wf $$2) {
      this($$0, $$1, $$2, a);
   }

   public gea(get $$0, xo $$1, wf $$2, xo $$3) {
      super($$1);
      this.e = $$0;
      this.f = $$2;
      this.u = $$3;
   }

   @Override
   protected void aV_() {
      this.v.c().b().a(10);
      this.v.a(new fyx(this.m, this.q));
      this.v.a(new fyj(this.f.a(), this.q).d(this.o - 50).b(true));
      this.v.c().a(2);
      this.f.c().ifPresent($$0 -> this.v.a(fxo.a(c, gdq.b(this, $$0, false)).a(200).a()));
      this.f.b().ifPresent($$0 -> this.v.a(fxo.a(d, $$1x -> ag.n().a($$0.getParent())).a(200).a()));
      fxo $$0;
      if (this.n.G()) {
         $$0 = fxo.a(this.u, $$0x -> this.n.a(this.e)).a(200).a();
      } else {
         $$0 = fxo.a(b, $$0x -> this.n.a(new gev())).a(200).a();
      }

      this.v.a($$0);
      this.v.a();
      this.v.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      gbi.a(this.v, this.I());
   }

   @Override
   public xo i() {
      return xn.a(this.m, this.f.a());
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
