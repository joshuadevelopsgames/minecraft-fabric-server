import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fol extends hyg {
   static final ame b = ame.b("icon/info");
   static final ame c = ame.b("icon/new_realm");
   static final ame G = ame.b("realm_status/expired");
   static final ame H = ame.b("realm_status/expires_soon");
   static final ame I = ame.b("realm_status/open");
   static final ame J = ame.b("realm_status/closed");
   private static final ame K = ame.b("icon/invite");
   private static final ame L = ame.b("icon/news");
   public static final ame a = ame.b("hud/heart/hardcore_full");
   static final Logger M = LogUtils.getLogger();
   private static final ame N = ame.b("textures/gui/realms/no_realms.png");
   private static final xo O = xo.c("menu.online");
   private static final xo P = xo.c("mco.selectServer.loading");
   static final xo Q = xo.c("mco.selectServer.uninitialized");
   static final xo R = xo.c("mco.selectServer.expiredList");
   private static final xo S = xo.c("mco.selectServer.expiredRenew");
   static final xo T = xo.c("mco.selectServer.expiredTrial");
   private static final xo U = xo.c("mco.selectServer.play");
   private static final xo V = xo.c("mco.selectServer.leave");
   private static final xo W = xo.c("mco.selectServer.configure");
   static final xo X = xo.c("mco.selectServer.expired");
   static final xo Y = xo.c("mco.selectServer.expires.soon");
   static final xo Z = xo.c("mco.selectServer.expires.day");
   static final xo aa = xo.c("mco.selectServer.open");
   static final xo ab = xo.c("mco.selectServer.closed");
   static final xo ac = xo.a("gui.narrate.button", Q);
   private static final xo ad = xo.c("mco.selectServer.noRealms");
   private static final xo ae = xo.c("mco.invites.nopending");
   private static final xo af = xo.c("mco.invites.pending");
   private static final xo ag = xo.c("mco.compatibility.incompatible.popup.title");
   private static final xo ah = xo.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int ai = 100;
   private static final int aj = 3;
   private static final int ak = 4;
   private static final int al = 308;
   private static final int am = 5;
   private static final int an = 44;
   private static final int ao = 11;
   private static final int ap = 40;
   private static final int aq = 20;
   private static final int ar = 216;
   private static final int as = 36;
   private static final boolean at = !ac.b().f();
   private static boolean au = at;
   private final CompletableFuture<fok.a> av = fok.a();
   @Nullable
   private fsm.c aw;
   private final Set<UUID> ax = new HashSet<>();
   private static boolean ay;
   private final RateLimiter az;
   private final get aA;
   private fxo aB;
   private fxo aC;
   private fxo aD;
   private fxo aE;
   private fxo aF;
   fol.j aG;
   frc aH;
   List<fpx> aI = List.of();
   fpz aJ = new fpz();
   private volatile boolean aK;
   @Nullable
   private volatile String aL;
   long aM;
   final List<fpv> aN = new ArrayList<>();
   private fxo aO;
   private fol.g aP;
   private fol.g aQ;
   private fol.f aR;
   @Nullable
   private gbk aS;

   public fol(get $$0) {
      super(O);
      this.aA = $$0;
      this.az = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aV_() {
      this.aH = new frc(this.n);
      this.aG = new fol.j();
      xo $$0 = xo.c("mco.invites.title");
      this.aP = new fol.g($$0, K, $$1x -> this.n.a(new frr(this, $$0)));
      xo $$1 = xo.c("mco.news");
      this.aQ = new fol.g($$1, L, $$0x -> {
         String $$1x = this.aL;
         if ($$1x != null) {
            gdq.a(this, $$1x);
            if (this.aQ.a() != 0) {
               fss.a $$2 = fss.b();
               $$2.b = false;
               fss.b($$2);
               this.aQ.a(0);
            }
         }
      });
      this.aQ.a(fzb.a($$1));
      this.aB = fxo.a(U, $$0x -> a(this.N(), this)).a(100).a();
      this.aE = fxo.a(W, $$0x -> this.e(this.N())).a(100).a();
      this.aD = fxo.a(S, $$0x -> this.d(this.N())).a(100).a();
      this.aF = fxo.a(V, $$0x -> this.f(this.N())).a(100).a();
      this.aO = fxo.a(xo.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aC = fxo.a(xn.k, $$0x -> this.aP_()).a(100).a();
      if (foq.a == foq.b.b) {
         this.c(fxv.a(xo.b("Snapshot"), xo.b("Release")).a(5, 5, 100, 20, xo.b("Realm"), ($$0x, $$1x) -> {
            au = $$1x;
            this.aI = List.of();
            this.H();
         }));
      }

      this.a(fol.f.a);
      this.G();
      this.av.thenAcceptAsync($$0x -> {
         get $$1x = $$0x.a(this.aA);
         if ($$1x == null) {
            this.aw = this.a(this.n.bc());
         } else {
            this.n.a($$1x);
         }
      }, this.s);
   }

   public static boolean b() {
      return at && au;
   }

   @Override
   protected void c() {
      if (this.aS != null) {
         this.aG.a(this.o, this.aS);
         this.aS.a();
      }
   }

   @Override
   public void aP_() {
      this.n.a(this.aA);
   }

   private void l() {
      if (this.aH.a() && this.aI.isEmpty() && this.aN.isEmpty()) {
         this.a(fol.f.b);
      } else {
         this.a(fol.f.c);
      }
   }

   private void a(fol.f $$0) {
      if (this.aR != $$0) {
         if (this.aS != null) {
            this.aS.a($$1 -> this.e($$1));
         }

         this.aS = this.b($$0);
         this.aR = $$0;
         this.aS.a($$1 -> {
            fxm var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private gbk b(fol.f $$0) {
      gbk $$1 = new gbk(this);
      $$1.b(44);
      $$1.a(this.m());
      gbl $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fye(this.q, P));
            break;
         case b:
            $$1.c(this.n());
            break;
         case c:
            $$1.c(this.aG);
      }

      return $$1;
   }

   private gbl m() {
      int $$0 = 90;
      gbo $$1 = gbo.e().a(4);
      $$1.c().e();
      $$1.a(this.aP);
      $$1.a(this.aQ);
      gbo $$2 = gbo.e();
      $$2.c().e();
      $$2.a(gbp.a(90));
      $$2.a(F(), gbn::b);
      $$2.a(new gbi(90, 44)).a($$1, gbn::c);
      return $$2;
   }

   private gbl c(fol.f $$0) {
      gbj $$1 = new gbj().c(4);
      gbj.b $$2 = $$1.d(3);
      if ($$0 == fol.f.c) {
         $$2.a(this.aB);
         $$2.a(this.aE);
         $$2.a(this.aD);
         $$2.a(this.aF);
      }

      $$2.a(this.aO);
      $$2.a(this.aC);
      return $$1;
   }

   private gbo n() {
      gbo $$0 = gbo.d().a(8);
      $$0.c().b();
      $$0.a(fyb.a(130, 64, N, 130, 64));
      fxz $$1 = new fxz(308, ad, this.q, false, true, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      fpx $$0 = this.N();
      boolean $$1 = $$0 != null;
      this.aO.j = this.aR != fol.f.a;
      this.aB.j = $$1 && $$0.g();
      if (!this.aB.j && $$1 && $$0.f == fpx.c.a) {
         this.aB.a(fzb.a(fpx.a));
      }

      this.aD.j = $$1 && this.a($$0);
      this.aF.j = $$1 && this.c($$0);
      this.aE.j = $$1 && this.b($$0);
   }

   private boolean a(fpx $$0) {
      return $$0.k && h($$0);
   }

   private boolean b(fpx $$0) {
      return h($$0) && $$0.f != fpx.c.c;
   }

   private boolean c(fpx $$0) {
      return !h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.aw != null) {
         this.aw.b();
      }
   }

   public static void f() {
      fue.R().bc().d.a();
   }

   public static void g() {
      fue.R().bc().c.a();
   }

   private void H() {
      for (fsm.e<?> $$0 : this.n.bc().a()) {
         $$0.a();
      }
   }

   private fsm.c a(fra $$0) {
      fsm.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aH.a($$0x.a());
         this.aI = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (fpx $$2 : this.aH) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ay && $$1x) {
            ay = true;
            this.L();
         }
      });
      a(foq::e, $$0x -> {
         this.aN.clear();
         this.aN.addAll($$0x);

         for (fpv $$1x : $$0x) {
            if ($$1x instanceof fpv.a $$2) {
               fyr $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.n.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aN.isEmpty() && this.aR != fol.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aP.a($$0x);
         this.aP.a($$0x == 0 ? fzb.a(ae) : fzb.a(af));
         if ($$0x > 0 && this.az.tryAcquire(1)) {
            this.n.aZ().d(xo.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aK = $$0x);
      $$1.a($$0.g, $$0x -> this.aJ = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         this.aL = $$0.h.b();
         this.aQ.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   void a(Collection<fpv> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fpv $$2 : $$0) {
         if (!$$2.a() && !this.ax.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ax.addAll($$1));
      }
   }

   private static <T> void a(fol.k<T> $$0, Consumer<T> $$1) {
      fue $$2 = fue.R();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(foq.a($$2));
         } catch (fqx var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         M.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      this.aG.a(this, this.N());
      this.l();
      this.G();
   }

   private void L() {
      new Thread(() -> {
         List<fqi> $$0 = fop.a();
         foq $$1 = foq.a();
         fpo $$2 = new fpo();
         $$2.a = $$0;
         $$2.b = this.M();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            M.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> M() {
      List<Long> $$0 = Lists.newArrayList();

      for (fpx $$1 : this.aH) {
         if (this.i($$1)) {
            $$0.add($$1.b);
         }
      }

      return $$0;
   }

   private void d(@Nullable fpx $$0) {
      if ($$0 != null) {
         String $$1 = bav.a($$0.c, this.n.Y().b(), $$0.l);
         this.n.p.a($$1);
         ag.n().a($$1);
      }
   }

   private void e(@Nullable fpx $$0) {
      if ($$0 != null && this.n.b($$0.h)) {
         this.n.a(new fsc(this, $$0.b));
      }
   }

   private void f(@Nullable fpx $$0) {
      if ($$0 != null && !this.n.b($$0.h)) {
         xo $$1 = xo.c("mco.configure.world.leave.question.line1");
         this.n.a(frs.a(this, $$1, $$1x -> this.g($$0)));
      }
   }

   @Nullable
   private fpx N() {
      return this.aG.p() instanceof fol.l $$0 ? $$0.c() : null;
   }

   private void g(final fpx $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               foq $$0x = foq.a();
               $$0x.d($$0.b);
               fol.this.n.execute(fol::g);
            } catch (fqx var2) {
               fol.M.error("Couldn't configure world", var2);
               fol.this.n.execute(() -> fol.this.n.a(new frm(var2, fol.this)));
            }
         }
      }).start();
      this.n.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aN.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.K();
      });
   }

   public void h() {
      this.aG.a(null);
      g();
   }

   @Override
   public xo i() {
      return (xo)(switch (this.aR) {
         case a -> xn.a(super.i(), P);
         case b -> xn.a(super.i(), ad);
         case c -> super.i();
      });
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.q, "Minecraft " + ac.b().c(), 2, this.p - 10, -1);
      }

      if (this.aK && this.aO.j) {
         frg.a($$0, this.aO);
      }

      switch (foq.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", -8388737);
      }
   }

   private void O() {
      this.n.a(new frg(this, this.aK));
   }

   public static void a(@Nullable fpx $$0, get $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fpx $$0, get $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.j()) {
            fue.R().a(new fro($$1, new ftb($$1, $$0)));
            return;
         }

         switch ($$0.x) {
            case f:
               fue.R().a(new fro($$1, new ftb($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xo.c("mco.compatibility.unverifiable.title").b(-171), xo.c("mco.compatibility.unverifiable.message"), xn.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xo.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xo.a("mco.compatibility.downgrade.description", xo.b($$0.w).b(-171), xo.b(ac.b().c()).b(-171)),
                  xo.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fue.R()
                  .a(
                     new fyr.a($$1, ag)
                        .a(xo.a("mco.compatibility.incompatible.series.popup.message", xo.b($$0.w).b(-171), xo.b(ac.b().c()).b(-171)))
                        .a(xn.k, fyr::aP_)
                        .a()
                  );
               break;
            case c:
               fue.R().a(new fyr.a($$1, ag).a(ah).a(xn.k, fyr::aP_).a());
         }
      }
   }

   private static void a(fpx $$0, get $$1, xo $$2, xo $$3, xo $$4) {
      fue.R().a(new fyr.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fue.R().a(new fro($$1, new ftb($$1, $$0)));
         g();
      }).a(xn.e, fyr::aP_).a());
   }

   private static void b(fpx $$0, get $$1) {
      xo $$2 = xo.c("mco.compatibility.upgrade.title").b(-171);
      xo $$3 = xo.c("mco.compatibility.upgrade");
      xo $$4 = xo.b($$0.w).b(-171);
      xo $$5 = xo.b(ac.b().c()).b(-171);
      xo $$6 = h($$0) ? xo.a("mco.compatibility.upgrade.description", $$4, $$5) : xo.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xo a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xo a(String $$0, int $$1) {
      return (xo)(StringUtils.isBlank($$0) ? xn.a : xo.b($$0).b($$1));
   }

   public static xo a(int $$0, boolean $$1) {
      return (xo)($$1 ? xo.c("gameMode.hardcore").b(-65536) : dmr.a($$0).d());
   }

   static boolean h(fpx $$0) {
      return fue.R().b($$0.h);
   }

   private boolean i(fpx $$0) {
      return h($$0) && !$$0.k;
   }

   private void a(fxb $$0, String $$1, int $$2) {
      $$0.e().pushMatrix();
      $$0.e().translate(this.o / 2 - 25, 20.0F);
      $$0.e().rotate((float) (-Math.PI / 9));
      $$0.e().scale(1.5F, 1.5F);
      $$0.b(this.q, $$1, 0, 0, $$2);
      $$0.e().popMatrix();
   }

   class a extends fol.e {
      private static final xo f = xo.c("mco.snapshot.start");
      private static final int g = 5;
      private final fze h = new fze();
      private final fpx i;

      public a(final fpx $$0) {
         this.i = $$0;
         this.h.a(fzb.a(xo.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gxx.ar, fol.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fol.this.q, f, $$3 + 40 - 2, $$10 - 5, -8388737);
         $$0.b(fol.this.q, xo.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.d, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$0, $$6, $$7, $$8, this.aM_(), new gcd($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (gby.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fol.this.n.al().a(hvm.a(ayz.BU, 1.0F));
         fol.this.n
            .a(
               new fyr.a(fol.this, xo.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xo.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xo.c("mco.selectServer.create"), $$0 -> fol.this.n.a(new frk(fol.this, this.i, true)))
                  .a(xn.e, fyr::aP_)
                  .a()
            );
      }

      @Override
      public xo a() {
         return xo.a("gui.narrate.button", xn.a(f, xo.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.d, "unknown server"))));
      }
   }

   class b extends fol.e {
      private final fxo f;

      public b(final fxo $$0) {
         this.f = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a($$0, $$1, $$2);
         return super.a($$0, $$1, $$2);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.f.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fol.this.o / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xo a() {
         return this.f.A();
      }
   }

   static class c extends fya {
      private static final fzd b = new fzd(ame.b("widget/cross_button"), ame.b("widget/cross_button_highlighted"));

      protected c(fxo.c $$0, xo $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fzb.a($$1));
      }
   }

   class d extends fol.e {
      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xo a() {
         return xo.i();
      }
   }

   abstract class e extends fyl.a<fol.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fpx $$0, fxb $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.k) {
            this.a($$1, $$6, $$7, $$4, $$5, fol.G, () -> fol.X);
         } else if ($$0.f == fpx.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fol.J, () -> fol.ab);
         } else if (fol.h($$0) && $$0.m < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fol.H, () -> {
               if ($$0.m <= 0) {
                  return fol.Y;
               } else {
                  return (xo)($$0.m == 1 ? fol.Z : xo.a("mco.selectServer.expires.days", $$0.m));
               }
            });
         } else if ($$0.f == fpx.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fol.I, () -> fol.aa);
         }
      }

      private void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, ame $$5, Supplier<xo> $$6) {
         $$0.a(gxx.ar, $$5, $$1, $$2, 10, 28);
         if (fol.this.aG.a_($$3, $$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            $$0.a($$6.get(), $$3, $$4);
         }
      }

      protected void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, fpx $$5) {
         int $$6 = this.b($$2);
         int $$7 = this.a($$1);
         xo $$8 = fol.a($$5.w, $$5.d());
         int $$9 = this.a($$2, $$3, $$8);
         this.a($$0, $$5.b(), $$6, $$7, $$9, $$4);
         if ($$8 != xn.a && !$$5.j()) {
            $$0.b(fol.this.q, $$8, $$9, $$7, -8355712);
         }
      }

      protected void a(fxb $$0, int $$1, int $$2, int $$3, fpx $$4) {
         int $$5 = this.b($$2);
         int $$6 = this.a($$1);
         int $$7 = this.c($$6);
         String $$8 = $$4.c();
         boolean $$9 = $$4.j();
         if ($$9 && $$8 != null) {
            xo $$10 = xo.b($$8).a(o.h);
            $$0.b(fol.this.q, xo.a("mco.selectServer.minigameName", $$10).b(-171), $$5, $$7, -1);
         } else {
            int $$11 = this.a($$4, $$0, $$2, $$3, $$6);
            this.a($$0, $$4.a(), $$5, this.c($$6), $$11, -8355712);
         }
      }

      protected void a(fxb $$0, int $$1, int $$2, fpx $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fol.h($$3)) {
            $$0.b(fol.this.q, $$3.g, $$4, this.d($$5), -8355712);
         } else if ($$3.k) {
            xo $$7 = $$3.l ? fol.T : fol.R;
            $$0.b(fol.this.q, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fxb $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fol.this.q.b($$1) > $$6) {
               String $$7 = fol.this.q.a($$1, $$6 - fol.this.q.b("... "));
               $$0.b(fol.this.q, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fol.this.q, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, xo $$2) {
         return $$0 + $$1 - fol.this.q.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, xo $$2) {
         return $$0 + $$1 - fol.this.q.a($$2) - 20;
      }

      protected int a(fpx $$0, fxb $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.o;
         int $$6 = $$0.p;
         int $$7 = $$2;
         if (dmr.c($$6)) {
            xo $$8 = fol.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fol.this.q, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gxx.ar, fol.a, $$7, this.c($$4), 8, 8);
         }

         return $$7;
      }

      protected int a(int $$0) {
         return $$0 + 1;
      }

      protected int b() {
         return 2 + 9;
      }

      protected int b(int $$0) {
         return $$0 + 36 + 2;
      }

      protected int c(int $$0) {
         return $$0 + this.b();
      }

      protected int d(int $$0) {
         return $$0 + this.b() * 2;
      }
   }

   static enum f {
      a,
      b,
      c;
   }

   static class g extends fyv.b {
      private static final ame[] d = new ame[]{
         ame.b("notification/1"),
         ame.b("notification/2"),
         ame.b("notification/3"),
         ame.b("notification/4"),
         ame.b("notification/5"),
         ame.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xo $$0, ame $$1, fxo.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fxb $$0) {
         $$0.a(gxx.ar, d[Math.min(this.x, 6) - 1], this.E() + this.z() - 5, this.F() - 3, 8, 8);
      }
   }

   class h extends fol.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xo h;
      private final int i;
      private final List<fxm> j = new ArrayList<>();
      @Nullable
      private final fol.c k;
      private final fyj l;
      private final gbj m;
      private final gbi n;
      private int o = -1;

      public h(final xo $$0, final int $$1, final fpv $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new gbj();
         int $$3 = 7;
         this.m.a(fyb.a(20, 20, fol.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(gbp.a(40), 0, 0);
         this.n = this.m.a(new gbi(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fyj($$0, fol.this.q).b(true), this.n.b().b().d());
         this.m.a(gbp.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fol.c($$1x -> fol.this.a($$2.c()), xo.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
         } else {
            this.k = null;
         }

         this.m.a(this.j::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.k != null && this.k.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void e(int $$0) {
         if (this.o != $$0) {
            this.f($$0);
            this.o = $$0;
         }
      }

      private void f(int $$0) {
         int $$1 = $$0 - 80;
         this.n.b($$1);
         this.l.d($$1);
         this.m.a();
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.m.c($$3, $$2);
         this.e($$4 - 4);
         this.j.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.k != null) {
            this.k.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xo a() {
         return this.h;
      }
   }

   class i extends fol.e {
      private final fpx a;
      private final fze f = new fze();

      public i(final fpx $$0) {
         this.a = $$0;
         if (!$$0.k) {
            this.f.a(fzb.a(xo.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a(this.a, $$0, $$3 + $$4, $$2, $$6, $$7);
         fsu.a($$0, $$3, $$2, 32, this.a.h);
         this.a($$0, $$2, $$3, $$4, -8355712, this.a);
         this.a($$0, $$2, $$3, $$4, this.a);
         this.a($$0, $$2, $$3, this.a);
         this.f.a($$0, $$6, $$7, $$8, this.aM_(), new gcd($$3, $$2, $$4, $$5));
      }

      @Override
      public xo a() {
         return xo.b(Objects.requireNonNullElse(this.a.d, "unknown server"));
      }
   }

   class j extends fyl<fol.e> {
      public j() {
         super(fue.R(), fol.this.o, fol.this.p, 0, 36);
      }

      public void a(@Nullable fol.e $$0) {
         super.a($$0);
         fol.this.G();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fol $$0, @Nullable fpx $$1) {
         this.s();

         for (fpv $$2 : fol.this.aN) {
            if ($$2 instanceof fpv.c $$3) {
               this.a($$3, $$0);
               fol.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fpx $$0) {
         for (fpx $$1 : fol.this.aI) {
            this.b(fol.this.new a($$1));
         }

         for (fpx $$2 : fol.this.aH) {
            fol.e $$3;
            if (fol.b() && !$$2.i()) {
               if ($$2.f == fpx.c.c) {
                  continue;
               }

               $$3 = fol.this.new i($$2);
            } else {
               $$3 = fol.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.b == $$2.b) {
               this.a($$3);
            }
         }
      }

      private void a(fpv.c $$0, fol $$1) {
         xo $$2 = $$0.d();
         int $$3 = fol.this.q.b($$2, 216);
         int $$4 = bcb.e($$3 + 7, 36) - 1;
         this.b(fol.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fol.this.new d());
         }

         this.b(fol.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(foq var1) throws fqx;
   }

   class l extends fol.e {
      private static final xo f = xo.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fpx i;
      private final fze j = new fze();

      public l(final fpx $$0) {
         this.i = $$0;
         boolean $$1 = fol.h($$0);
         if (fol.b() && $$1 && $$0.i()) {
            this.j.a(fzb.a(xo.a("mco.snapshot.paired", $$0.v)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fzb.a(xo.a("mco.snapshot.friendsRealm.downgrade", $$0.w)));
         }
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.f == fpx.c.c) {
            $$0.a(gxx.ar, fol.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fol.this.q, fol.Q, $$3 + 40 - 2, $$10, -8388737);
         } else {
            fsu.a($$0, $$3, $$2, 32, this.i.h);
            this.a($$0, $$2, $$3, $$4, -1, this.i);
            this.a($$0, $$2, $$3, $$4, this.i);
            this.a($$0, $$2, $$3, this.i);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$9);
            if (!$$11) {
               this.j.a($$0, $$6, $$7, $$8, this.aM_(), new gcd($$3, $$2, $$4, $$5));
            }
         }
      }

      private boolean a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
         List<ProfileResult> $$8 = fol.this.aJ.a(this.i.b);
         if (!$$8.isEmpty()) {
            int $$9 = $$2 + $$3 - 21;
            int $$10 = $$1 + $$4 - 9 - 2;
            int $$11 = $$9;

            for (int $$12 = 0; $$12 < $$8.size(); $$12++) {
               $$11 -= 9 + ($$12 == 0 ? 0 : 3);
               fyo.a($$0, fue.R().ao().b($$8.get($$12).profile()), $$11, $$10, 9);
            }

            if ($$5 >= $$11 && $$5 <= $$9 && $$6 >= $$10 && $$6 <= $$10 + 9) {
               $$0.a(fol.this.q, List.of(f), Optional.of(new ghu.a($$8)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fol.this.n.al().a(hvm.a(ayz.BU, 1.0F));
         fol.a(this.i, fol.this);
      }

      private void e() {
         fol.this.n.al().a(hvm.a(ayz.BU, 1.0F));
         frk $$0 = new frk(fol.this, this.i, this.i.i());
         fol.this.n.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.f == fpx.c.c) {
            this.e();
         } else if (this.i.g()) {
            if (ag.c() - fol.this.aM < 250L && this.aM_()) {
               this.d();
            }

            fol.this.aM = ag.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (gby.a($$0)) {
            if (this.i.f == fpx.c.c) {
               this.e();
               return true;
            }

            if (this.i.g()) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xo a() {
         return (xo)(this.i.f == fpx.c.c ? fol.ac : xo.a("narrator.select", Objects.requireNonNullElse(this.i.d, "unknown server")));
      }

      public fpx c() {
         return this.i;
      }
   }
}
