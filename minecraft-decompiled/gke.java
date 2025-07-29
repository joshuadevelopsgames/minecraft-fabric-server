import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gke extends get {
   private static final xo c = xo.c("gui.socialInteractions.title");
   private static final ame d = ame.b("social_interactions/background");
   private static final ame e = ame.b("icon/search");
   private static final xo f = xo.c("gui.socialInteractions.tab_all");
   private static final xo u = xo.c("gui.socialInteractions.tab_hidden");
   private static final xo v = xo.c("gui.socialInteractions.tab_blocked");
   private static final xo w = f.e().a(o.t);
   private static final xo x = u.e().a(o.t);
   private static final xo y = v.e().a(o.t);
   private static final xo z = xo.c("gui.socialInteractions.search_hint").a(o.u).a(o.h);
   static final xo A = xo.c("gui.socialInteractions.search_empty").a(o.h);
   private static final xo B = xo.c("gui.socialInteractions.empty_hidden").a(o.h);
   private static final xo C = xo.c("gui.socialInteractions.empty_blocked").a(o.h);
   private static final xo D = xo.c("gui.socialInteractions.blocking_hint");
   private static final int E = 8;
   private static final int F = 236;
   private static final int G = 16;
   private static final int H = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int I = 238;
   private static final int J = 20;
   private static final int K = 36;
   private final gbk L = new gbk(this);
   @Nullable
   private final get M;
   @Nullable
   gkd N;
   fxx O;
   private String P = "";
   private gke.a Q = gke.a.a;
   private fxo R;
   private fxo S;
   private fxo T;
   private fxo U;
   @Nullable
   private xo V;
   private int W;

   public gke() {
      this(null);
   }

   public gke(@Nullable get $$0) {
      super(c);
      this.M = $$0;
      this.a(fue.R());
   }

   private int l() {
      return Math.max(52, this.p - 128 - 16);
   }

   private int m() {
      return 80 + this.l() - 8;
   }

   private int n() {
      return (this.o - 238) / 2;
   }

   @Override
   public xo i() {
      return (xo)(this.V != null ? xn.a(super.i(), this.V) : super.i());
   }

   @Override
   protected void aV_() {
      this.L.a(c, this.q);
      this.N = new gkd(this, this.n, this.o, this.m() - 88, 88, 36);
      int $$0 = this.N.a() / 3;
      int $$1 = this.N.u();
      int $$2 = this.N.v();
      this.R = this.c(fxo.a(f, $$0x -> this.a(gke.a.a)).a($$1, 45, $$0, 20).a());
      this.S = this.c(fxo.a(u, $$0x -> this.a(gke.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.T = this.c(fxo.a(v, $$0x -> this.a(gke.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.O != null ? this.O.a() : "";
      this.O = new fxx(this.q, this.n() + 28, 74, 200, 15, z) {
         @Override
         protected yc d() {
            return !gke.this.O.a().isEmpty() && gke.this.N.c() ? super.d().f(", ").b(gke.A) : super.d();
         }
      };
      this.O.f(16);
      this.O.i(true);
      this.O.m(-1);
      this.O.a($$3);
      this.O.c(z);
      this.O.b(this::a);
      this.c(this.O);
      this.d(this.N);
      this.U = this.c(fxo.a(D, gdq.b(this, bav.o)).a(this.o / 2 - 100, 64 + this.l(), 200, 20).a());
      this.a(this.Q);
      this.L.b(fxo.a(xn.d, $$0x -> this.aP_()).a(200).a());
      this.L.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aJ_() {
      if (this.N != null) {
         this.N.K();
      }
   }

   @Override
   protected void c() {
      this.L.a();
      this.N.b(this.o, this.m() - 88, 88);
      this.O.c(this.n() + 28, 74);
      int $$0 = this.N.u();
      int $$1 = this.N.v();
      int $$2 = this.N.a() / 3;
      this.R.c($$0, 45);
      this.S.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.T.c($$1 - $$2 + 1, 45);
      this.U.c(this.o / 2 - 100, 64 + this.l());
   }

   @Override
   protected void aF_() {
      this.b(this.O);
   }

   @Override
   public void aP_() {
      this.n.a(this.M);
   }

   private void a(gke.a $$0) {
      this.Q = $$0;
      this.R.b(f);
      this.S.b(u);
      this.T.b(v);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.R.b(w);
            Collection<UUID> $$2 = this.n.t.j.p();
            this.N.a($$2, this.N.g(), true);
            break;
         case b:
            this.S.b(x);
            Set<UUID> $$3 = this.n.aO().c();
            $$1 = $$3.isEmpty();
            this.N.a($$3, this.N.g(), false);
            break;
         case c:
            this.T.b(y);
            gkc $$4 = this.n.aO();
            Set<UUID> $$5 = this.n.t.j.p().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.N.a($$5, this.N.g(), false);
      }

      ftv $$6 = this.n.aZ();
      if (!this.O.a().isEmpty() && this.N.c() && !this.O.aM_()) {
         $$6.d(A);
      } else if ($$1) {
         if ($$0 == gke.a.b) {
            $$6.d(B);
         } else if ($$0 == gke.a.c) {
            $$6.d(C);
         }
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.n() + 3;
      $$0.a(gxx.ar, d, $$4, 64, 236, this.l() + 16);
      $$0.a(gxx.ar, e, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.n);
      if (this.V != null) {
         $$0.b(this.n.h, this.V, this.n() + 8, 35, -1);
      }

      if (!this.N.c()) {
         this.N.a($$0, $$1, $$2, $$3);
      } else if (!this.O.a().isEmpty()) {
         $$0.a(this.n.h, A, this.o / 2, (72 + this.m()) / 2, -1);
      } else if (this.Q == gke.a.b) {
         $$0.a(this.n.h, B, this.o / 2, (72 + this.m()) / 2, -1);
      } else if (this.Q == gke.a.c) {
         $$0.a(this.n.h, C, this.o / 2, (72 + this.m()) / 2, -1);
      }

      this.U.k = this.Q == gke.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.O.aM_() && this.n.n.L.a($$0, $$1)) {
         this.aP_();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   private void a(String $$0) {
      $$0 = $$0.toLowerCase(Locale.ROOT);
      if (!$$0.equals(this.P)) {
         this.N.a($$0);
         this.P = $$0;
         this.a(this.Q);
      }
   }

   private void a(fue $$0) {
      int $$1 = $$0.M().o().size();
      if (this.W != $$1) {
         String $$2 = "";
         grz $$3 = $$0.T();
         if ($$0.U()) {
            $$2 = $$0.W().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.V = xo.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.V = xo.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.W = $$1;
      }
   }

   public void a(grw $$0) {
      this.N.a($$0, this.Q);
   }

   public void a(UUID $$0) {
      this.N.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
