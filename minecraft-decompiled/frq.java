import javax.annotation.Nullable;

public class frq extends hyg {
   private static final xo a = xo.c("mco.account.privacy.information");
   private static final int b = 15;
   private final gbo c = gbo.d();
   private final get G;
   @Nullable
   private fyj H;

   public frq(get $$0) {
      super(ftv.a);
      this.G = $$0;
   }

   @Override
   public void aV_() {
      this.c.a(15).c().b();
      this.H = new fyj(a, this.q).b(true);
      this.c.a(this.H);
      gbo $$0 = this.c.a(gbo.e().a(8));
      xo $$1 = xo.c("mco.account.privacy.info.button");
      $$0.a(fxo.a($$1, gdq.b(this, bav.a)).a());
      $$0.a(fxo.a(xn.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aP_() {
      this.n.a(this.G);
   }

   @Override
   protected void c() {
      if (this.H != null) {
         this.H.d(this.o - 15);
      }

      this.c.a();
      gbi.a(this.c, this.I());
   }

   @Override
   public xo i() {
      return a;
   }
}
