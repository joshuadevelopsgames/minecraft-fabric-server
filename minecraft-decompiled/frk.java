import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class frk extends hyg {
   private static final xo a = xo.c("mco.selectServer.create");
   private static final xo b = xo.c("mco.configure.world.name");
   private static final xo c = xo.c("mco.configure.world.description");
   private static final int G = 10;
   private static final int H = 210;
   private final fol I;
   private final gbk J = new gbk(this);
   private fxx K;
   private fxx L;
   private final Runnable M;

   public frk(fol $$0, fpx $$1, boolean $$2) {
      super(a);
      this.I = $$0;
      this.M = () -> this.a($$1, $$2);
   }

   @Override
   public void aV_() {
      this.J.a(this.m, this.q);
      gbo $$0 = this.J.c(gbo.d()).a(10);
      fxo $$1 = fxo.a(xn.j, $$0x -> this.M.run()).a();
      $$1.j = false;
      this.K = new fxx(this.q, 210, 20, b);
      this.K.b($$1x -> $$1.j = !bdb.h($$1x));
      this.L = new fxx(this.q, 210, 20, c);
      $$0.a(gbg.a(this.q, this.K, b));
      $$0.a(gbg.a(this.q, this.L, c));
      gbo $$2 = this.J.b(gbo.e().a(10));
      $$2.a($$1);
      $$2.a(fxo.a(xn.k, $$0x -> this.aP_()).a());
      this.J.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.K);
   }

   @Override
   protected void c() {
      this.J.a();
   }

   private void a(fpx $$0, boolean $$1) {
      if (!$$0.i() && $$1) {
         AtomicBoolean $$2 = new AtomicBoolean();
         this.n.a(new gdm(() -> {
            $$2.set(true);
            this.I.h();
            this.n.a(this.I);
         }, xo.c("mco.upload.preparing"), xo.i()));
         CompletableFuture.<fpx>supplyAsync(() -> a($$0), ag.h()).thenAcceptAsync($$1x -> {
            if (!$$2.get()) {
               this.b($$1x);
            }
         }, this.n).exceptionallyAsync($$0x -> {
            this.I.h();
            xo $$3;
            if ($$0x.getCause() instanceof fqx $$2x) {
               $$3 = $$2x.a.b();
            } else {
               $$3 = xo.c("mco.errorMessage.initialize.failed");
            }

            this.n.a(new frm($$3, this.I));
            return null;
         }, this.n);
      } else {
         this.b($$0);
      }
   }

   private static fpx a(fpx $$0) {
      foq $$1 = foq.a();

      try {
         return $$1.a(Long.valueOf($$0.b));
      } catch (fqx var3) {
         throw new RuntimeException(var3);
      }
   }

   private void b(fpx $$0) {
      fte $$1 = new fte($$0.b, this.K.a(), this.L.a());
      frt $$2 = frt.a(this, $$0, $$1, () -> this.n.execute(() -> {
         fol.g();
         this.n.a(this.I);
      }));
      this.n.a($$2);
   }

   @Override
   public void aP_() {
      this.n.a(this.I);
   }
}
