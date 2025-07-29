import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frr extends hyg {
   static final ame a = ame.b("pending_invite/accept_highlighted");
   static final ame b = ame.b("pending_invite/accept");
   static final ame c = ame.b("pending_invite/reject_highlighted");
   static final ame G = ame.b("pending_invite/reject");
   private static final Logger H = LogUtils.getLogger();
   private static final xo I = xo.c("mco.invites.nopending");
   static final xo J = xo.c("mco.invites.button.accept");
   static final xo K = xo.c("mco.invites.button.reject");
   private final get L;
   private final CompletableFuture<List<fpm>> M = CompletableFuture.supplyAsync(() -> {
      try {
         return foq.a().k().a;
      } catch (fqx var1x) {
         H.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ag.i());
   @Nullable
   xo N;
   frr.b O;
   private fxo P;
   private fxo Q;

   public frr(get $$0, xo $$1) {
      super($$1);
      this.L = $$0;
   }

   @Override
   public void aV_() {
      fol.f();
      this.O = new frr.b();
      this.M.thenAcceptAsync($$0 -> {
         List<frr.a> $$1 = $$0.stream().map($$0x -> new frr.a($$0x)).toList();
         this.O.a($$1);
         if ($$1.isEmpty()) {
            this.n.aZ().c(I);
         }
      }, this.s);
      this.c(this.O);
      this.P = this.c((fxo)fxo.a(J, $$0 -> this.c(true)).a(this.o / 2 - 174, this.p - 32, 100, 20).a());
      this.c((fxo)fxo.a(xn.d, $$0 -> this.aP_()).a(this.o / 2 - 50, this.p - 32, 100, 20).a());
      this.Q = this.c((fxo)fxo.a(K, $$0 -> this.c(false)).a(this.o / 2 + 74, this.p - 32, 100, 20).a());
      this.l();
   }

   @Override
   public void aP_() {
      this.n.a(this.L);
   }

   @Override
   void c(boolean $$0) {
      if (this.O.p() instanceof frr.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               foq $$2x = foq.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fqx var3) {
               H.error("Couldn't handle invite", var3);
               return false;
            }
         }, ag.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.O.a($$1);
               this.l();
               fra $$3 = this.n.bc();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.s);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      this.N = null;
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 12, -1);
      if (this.M.isDone() && this.O.b()) {
         $$0.a(this.q, I, this.o / 2, this.p / 2 - 20, -1);
      }

      if (this.N != null) {
         $$0.a(this.q, this.N, $$1, $$2);
      }
   }

   void l() {
      frr.a $$0 = this.O.p();
      this.P.k = $$0 != null;
      this.Q.k = $$0 != null;
   }

   class a extends fyl.a<frr.a> {
      private static final int b = 38;
      final fpm c;
      private final List<fre> d;

      a(final fpm $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new frr.a.a(), new frr.a.b());
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fre.a(frr.this.O, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fxb $$0, fpm $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(frr.this.q, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(frr.this.q, $$1.c, $$2 + 38, $$3 + 12, -9671572);
         $$0.b(frr.this.q, fsu.a($$1.e), $$2 + 38, $$3 + 24, -9671572);
         fre.a($$0, this.d, frr.this.O, $$2, $$3, $$4, $$5);
         fsu.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(xo.b(this.c.b), xo.b(this.c.c), fsu.a(this.c.e));
         return xo.a("narrator.select", $$0);
      }

      class a extends fre {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fxb $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gxx.ar, $$3 ? frr.a : frr.b, $$1, $$2, 18, 18);
            if ($$3) {
               frr.this.N = frr.J;
            }
         }

         @Override
         public void a(int $$0) {
            frr.this.c(true);
         }
      }

      class b extends fre {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fxb $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gxx.ar, $$3 ? frr.c : frr.G, $$1, $$2, 18, 18);
            if ($$3) {
               frr.this.N = frr.K;
            }
         }

         @Override
         public void a(int $$0) {
            frr.this.c(false);
         }
      }
   }

   class b extends fyl<frr.a> {
      public b() {
         super(fue.R(), frr.this.o, frr.this.p - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         frr.this.l();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(frr.a $$0) {
         this.g($$0);
      }
   }
}
