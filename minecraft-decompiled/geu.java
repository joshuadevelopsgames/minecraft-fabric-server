import javax.annotation.Nullable;

public class geu extends get {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xo c = xo.c("selectWorld.allowCommands");
   private static final xo d = xo.c("selectWorld.gameMode");
   private static final xo e = xo.c("lanServer.otherPlayers");
   private static final xo f = xo.c("lanServer.port");
   private static final xo u = xo.a("lanServer.port.unavailable", 1024, 65535);
   private static final xo v = xo.a("lanServer.port.invalid", 1024, 65535);
   private static final int w = -43691;
   private final get x;
   private dmr y = dmr.a;
   private boolean z;
   private int A = bbs.a();
   @Nullable
   private fxx B;

   public geu(get $$0) {
      super(xo.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aV_() {
      hwf $$0 = this.n.W();
      this.y = $$0.u();
      this.z = $$0.aZ().m();
      this.c(fxv.a(dmr::e).a(dmr.a, dmr.d, dmr.b, dmr.c).a(this.y).a(this.o / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fxv.b(this.z).a(this.o / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fxo $$1 = fxo.a(xo.c("lanServer.start"), $$1x -> {
         this.n.a(null);
         xo $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = apk.a(this.A);
         } else {
            $$2 = xo.c("commands.publish.failed");
         }

         this.n.m.e().a($$2);
         this.n.aZ().c($$2);
         this.n.d();
      }).a(this.o / 2 - 155, this.p - 28, 150, 20).a();
      this.B = new fxx(this.q, this.o / 2 - 75, 160, 150, 20, xo.c("lanServer.port"));
      this.B.b($$1x -> {
         xo $$2 = this.a($$1x);
         this.B.c(xo.b(this.A + "").a(o.i));
         if ($$2 == null) {
            this.B.m(-2039584);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.m(-43691);
            this.B.a(fzb.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(xo.b(this.A + "").a(o.i));
      this.c(this.B);
      this.c($$1);
      this.c(fxo.a(xn.e, $$0x -> this.aP_()).a(this.o / 2 + 5, this.p - 28, 150, 20).a());
   }

   @Override
   public void aP_() {
      this.n.a(this.x);
   }

   @Nullable
   private xo a(String $$0) {
      if ($$0.isBlank()) {
         this.A = bbs.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !bbs.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = bbs.a();
            return v;
         }
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 50, -1);
      $$0.a(this.q, e, this.o / 2, 82, -1);
      $$0.a(this.q, f, this.o / 2, 142, -1);
   }
}
