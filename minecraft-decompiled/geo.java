import java.net.URI;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class geo extends get {
   private static final ame a = ame.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int e = 204;
   private static final int f = 98;
   private static final xo u = xo.c("menu.returnToGame");
   private static final xo v = xo.c("gui.advancements");
   private static final xo w = xo.c("gui.stats");
   private static final xo x = xo.c("menu.sendFeedback");
   private static final xo y = xo.c("menu.reportBugs");
   private static final xo z = xo.c("menu.feedback");
   private static final xo A = xo.c("menu.options");
   private static final xo B = xo.c("menu.shareToLan");
   private static final xo C = xo.c("menu.playerReporting");
   private static final xo D = xo.c("menu.game");
   private static final xo E = xo.c("menu.paused");
   private static final fzb F = fzb.a(xo.c("menu.custom_options.tooltip"));
   private final boolean G;
   @Nullable
   private fxo H;

   public geo(boolean $$0) {
      super($$0 ? D : E);
      this.G = $$0;
   }

   public boolean l() {
      return this.G;
   }

   @Override
   protected void aV_() {
      if (this.G) {
         this.n();
      }

      this.c(new fyx(0, this.G ? 40 : 10, this.o, 9, this.m, this.q));
   }

   private void n() {
      gbj $$0 = new gbj();
      $$0.c().a(4, 4, 4, 0);
      gbj.b $$1 = $$0.d(2);
      $$1.a(fxo.a(u, $$0x -> {
         this.n.a(null);
         this.n.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new gfd(this.n.t.j.r(), this)));
      $$1.a(this.a(w, () -> new gex(this, this.n.t.l())));
      Optional<? extends jl<art>> $$2 = this.E();
      if ($$2.isEmpty()) {
         a(this, $$1);
      } else {
         this.a(this.n, (jl<art>)$$2.get(), $$1);
      }

      $$1.a(this.a(A, () -> new gip(this, this.n.n)));
      if (this.n.V() && !this.n.W().r()) {
         $$1.a(this.a(B, () -> new geu(this)));
      } else {
         $$1.a(this.a(C, () -> new gke(this)));
      }

      this.H = $$1.a(fxo.a(xn.b(this.n.U()), $$0x -> {
         $$0x.j = false;
         this.n.bb().a(this.n, this, () -> a(this.n, grk.a), true);
      }).a(204).a(), 2);
      $$0.a();
      gbi.a($$0, 0, 0, this.o, this.p, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private Optional<? extends jl<art>> E() {
      jy<art> $$0 = this.n.t.j.x().f(mn.aT);
      Optional<? extends jp<art>> $$1 = $$0.a(azq.a);
      if ($$1.isPresent()) {
         jp<art> $$2 = (jp<art>)$$1.get();
         if ($$2.b() > 0) {
            if ($$2.b() == 1) {
               return Optional.of($$2.a(0));
            }

            return $$0.a(arx.b);
         }
      }

      amw $$3 = this.n.t.j.a();
      return !$$3.a() ? $$0.a(arx.a) : Optional.empty();
   }

   static void a(get $$0, gbj.b $$1) {
      $$1.a(a($$0, x, ac.b().f() ? bav.i : bav.h));
      $$1.a(a($$0, y, bav.j)).j = !ac.b().a().a();
   }

   private void a(fue $$0, jl<art> $$1, gbj.b $$2) {
      $$2.a(this.a(z, () -> new geo.a(this)));
      $$2.a(fxo.a($$1.a().A_().a(), $$2x -> $$0.t.j.a($$1, this)).a(98).a(F).a());
   }

   public static void a(fue $$0, xo $$1) {
      boolean $$2 = $$0.U();
      grz $$3 = $$0.T();
      if ($$0.s != null) {
         $$0.s.a($$1);
      }

      if ($$2) {
         $$0.y();
      } else {
         $$0.z();
      }

      gev $$4 = new gev();
      if ($$2) {
         $$0.a($$4);
      } else if ($$3 != null && $$3.e()) {
         $$0.a(new fol($$4));
      } else {
         $$0.a(new gid($$4));
      }
   }

   @Override
   public void e() {
      if (this.m()) {
         fzz.c();
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.m()) {
         fzz.a($$0, this.q);
      }

      if (this.G && this.n != null && this.n.bb().c() && this.H != null) {
         $$0.a(gxx.ar, a, this.H.E() + this.H.z() - 17, this.H.F() + 3, 15, 15);
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean m() {
      fui $$0 = this.n.n;
      return $$0.aA().c() && $$0.a(aza.b) > 0.0F && this.G;
   }

   private fxo a(xo $$0, Supplier<get> $$1) {
      return fxo.a($$0, $$1x -> this.n.a($$1.get())).a(98).a();
   }

   private static fxo a(get $$0, xo $$1, URI $$2) {
      return fxo.a($$1, gdq.b($$0, $$2)).a(98).a();
   }

   static class a extends get {
      private static final xo b = xo.c("menu.feedback.title");
      public final get a;
      private final gbk c = new gbk(this);

      protected a(get $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aV_() {
         this.c.a(b, this.q);
         gbj $$0 = this.c.c(new gbj());
         $$0.c().a(4, 4, 4, 0);
         gbj.b $$1 = $$0.d(2);
         geo.a(this, $$1);
         this.c.b(fxo.a(xn.k, $$0x -> this.aP_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aP_() {
         this.n.a(this.a);
      }
   }
}
