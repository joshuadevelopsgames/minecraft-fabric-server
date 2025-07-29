import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class frp extends hyg {
   private static final ame a = ame.b("icon/unseen_notification");
   private static final ame b = ame.b("icon/news");
   private static final ame c = ame.b("icon/invite");
   private static final ame G = ame.b("icon/trial_available");
   private final CompletableFuture<Boolean> H = fok.a().thenApply($$0 -> $$0.a() == fok.b.a);
   @Nullable
   private fsm.c I;
   @Nullable
   private frp.a J;
   private volatile int K;
   private static boolean L;
   private static boolean M;
   private static boolean N;
   private final frp.a O = new frp.a() {
      @Override
      public fsm.c a(fra $$0) {
         fsm.c $$1 = $$0.a.a();
         frp.this.a($$0, $$1);
         frp.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final frp.a P = new frp.a() {
      @Override
      public fsm.c a(fra $$0) {
         fsm.c $$1 = $$0.a.a();
         frp.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public frp() {
      super(ftv.a);
   }

   @Override
   public void aV_() {
      if (this.I != null) {
         this.I.a();
      }
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.n.bc().b.a();
   }

   @Nullable
   private frp.a l() {
      boolean $$0 = this.n() && this.H.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.m() ? this.O : this.P;
      }
   }

   @Override
   public void e() {
      frp.a $$0 = this.l();
      if (!Objects.equals(this.J, $$0)) {
         this.J = $$0;
         if (this.J != null) {
            this.I = this.J.a(this.n.bc());
         } else {
            this.I = null;
         }
      }

      if (this.I != null) {
         this.I.b();
      }
   }

   private boolean m() {
      return this.n.n.X().c();
   }

   private boolean n() {
      return this.n.z instanceof gev;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.H.getNow(false)) {
         this.d($$0);
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
   }

   private void d(fxb $$0) {
      int $$1 = this.K;
      int $$2 = 24;
      int $$3 = this.p / 4 + 48;
      int $$4 = this.o / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (N) {
         $$0.a(gxx.ar, a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.J != null && this.J.a()) {
         if (M) {
            $$0.a(gxx.ar, b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(gxx.ar, c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (L) {
            $$0.a(gxx.ar, G, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fra $$0, fsm.c $$1) {
      $$1.a($$0.d, $$0x -> this.K = $$0x);
      $$1.a($$0.e, $$0x -> L = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         M = $$0.h.a();
      });
   }

   void b(fra $$0, fsm.c $$1) {
      $$1.a($$0.b, $$0x -> {
         N = false;

         for (fpv $$1x : $$0x) {
            if (!$$1x.a()) {
               N = true;
               break;
            }
         }
      });
   }

   interface a {
      fsm.c a(fra var1);

      boolean a();
   }
}
