public class fri extends hyg {
   private static final xo a = xo.c("mco.client.incompatible.title").b(-65536);
   private static final xo b = xo.b(ac.b().c()).b(-65536);
   private static final xo c = xo.a("mco.client.unsupported.snapshot.version", b);
   private static final xo G = xo.a("mco.client.outdated.stable.version", b);
   private final get H;
   private final gbk I = new gbk(this);

   public fri(get $$0) {
      super(a);
      this.H = $$0;
   }

   @Override
   public void aV_() {
      this.I.a(a, this.q);
      this.I.c(new fyj(this.l(), this.q).b(true));
      this.I.b(fxo.a(xn.k, $$0 -> this.aP_()).a(200).a());
      this.I.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.a();
   }

   @Override
   public void aP_() {
      this.n.a(this.H);
   }

   private xo l() {
      return ac.b().f() ? G : c;
   }
}
