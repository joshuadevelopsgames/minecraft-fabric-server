import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fsd extends hyg {
   private static final xo a = xo.c("mco.configure.world.buttons.invite");
   private static final xo b = xo.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xo c = xo.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xo G = xo.c("mco.configure.world.players.error").b(-65536);
   private final gbk H = new gbk(this);
   @Nullable
   private fxx I;
   @Nullable
   private fxo J;
   private final fpx K;
   private final fsc L;
   @Nullable
   private xo M;

   public fsd(fsc $$0, fpx $$1) {
      super(a);
      this.L = $$0;
      this.K = $$1;
   }

   @Override
   public void aV_() {
      this.H.a(a, this.q);
      gbo $$0 = this.H.c(gbo.d().a(8));
      this.I = new fxx(this.n.h, 200, 20, xo.c("mco.configure.world.invite.profile.name"));
      $$0.a(gbg.a(this.q, this.I, b));
      this.J = $$0.a(fxo.a(a, $$0x -> this.l()).a(200).a());
      this.H.b(fxo.a(xn.k, $$0x -> this.aP_()).a(200).a());
      this.H.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.a();
   }

   @Override
   protected void aF_() {
      if (this.I != null) {
         this.b(this.I);
      }
   }

   private void l() {
      if (this.J != null && this.I != null) {
         if (bdb.h(this.I.a())) {
            this.a(G);
         } else {
            long $$0 = this.K.b;
            String $$1 = this.I.a().trim();
            this.J.j = false;
            this.I.e(false);
            this.a(c);
            CompletableFuture.<Boolean>supplyAsync(() -> this.L.a($$0, $$1), ag.i()).thenAcceptAsync($$0x -> {
               if ($$0x) {
                  this.n.a(this.L);
               } else {
                  this.a(G);
               }

               this.I.e(true);
               this.J.j = true;
            }, this.s);
         }
      }
   }

   private void a(xo $$0) {
      this.M = $$0;
      this.n.aZ().d($$0);
   }

   @Override
   public void aP_() {
      this.n.a(this.L);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M != null && this.J != null) {
         $$0.a(this.q, this.M, this.o / 2, this.J.F() + this.J.y() + 8, -1);
      }
   }
}
