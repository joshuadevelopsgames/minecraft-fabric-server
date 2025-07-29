import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserFlag;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.ProfileActionType;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.management.ManagementFactory;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fue extends bwc<Runnable> implements fnj {
   static fue F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ag.n() == ag.a.d;
   private static final int H = 10;
   public static final ame b = ame.b("default");
   public static final ame c = ame.b("uniform");
   public static final ame d = ame.b("alt");
   private static final ame I = ame.b("regional_compliancies.json");
   private static final CompletableFuture<bdk> J = CompletableFuture.completedFuture(bdk.a);
   private static final xo K = xo.c("multiplayer.socialInteractions.not_available");
   private static final xo L = xo.c("menu.savingLevel");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long M = Double.doubleToLongBits(Math.PI);
   private final Path N;
   private final CompletableFuture<ProfileResult> O;
   private final hru P;
   private final gyg Q;
   private final DataFixer R;
   private final gyo S;
   private final fni T;
   private final ftu.b U = new ftu.b(20.0F, 0L, this::a);
   private final gxw V;
   public final gxh f;
   private final hec W;
   private final hof X;
   private final hfd Y;
   private final gxk Z;
   public final guv g;
   private final fuq aa;
   public final fwz h;
   public final fwz i;
   public final gxb j;
   public final hbz l;
   private final AtomicReference<aup> ab = new AtomicReference<>();
   public final fxa m;
   public final fui n;
   private final ftz ac;
   public final fuf o;
   public final fud p;
   private fub ad = fub.a;
   public final File q;
   private final String ae;
   private final String af;
   private final Proxy ag;
   private final fcs ah;
   private final boolean ai;
   private final boolean aj;
   private final boolean ak;
   private final axl al;
   private final awf am;
   private final hus an;
   private final awz ao;
   private final htd ap;
   private final fvi aq;
   private final fmr ar;
   @Nullable
   private final flg as;
   private final hwx at;
   private final hws au;
   private final gam av;
   private final hsv aw;
   private final gxd ax;
   private final fuj ay = new fuj(I, fue::a);
   private final YggdrasilAuthenticationService az;
   private final MinecraftSessionService aA;
   private final UserApiService aB;
   private final CompletableFuture<UserProperties> aC;
   private final hsu aD;
   private final huh aE;
   private final gys aF;
   private final hss aG;
   private final hsr aH;
   private final hsq aI;
   private final fxc aJ;
   private final hsy aK;
   private final gad aL;
   private final hxz aM;
   private final gkc aN;
   private final hab aO;
   private final hxb aP;
   private final grx aQ;
   private final fra aR;
   private final gwq aS;
   @Nullable
   public gru r;
   @Nullable
   public grk s;
   @Nullable
   public gwi t;
   @Nullable
   private hwf aT;
   @Nullable
   private wd aU;
   private boolean aV;
   @Nullable
   public bzm u;
   @Nullable
   public bzm v;
   @Nullable
   public fiq w;
   private int aW;
   protected int x;
   private volatile boolean aX;
   private long aY = ag.d();
   private long aZ;
   private int ba;
   public boolean y;
   @Nullable
   public get z;
   @Nullable
   private gen bb;
   private boolean bc;
   Thread bd;
   private volatile boolean be;
   @Nullable
   private Supplier<p> bf;
   private static int bg;
   public String A = "";
   private long bh;
   private final fmy bi;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bj;
   private final Queue<Runnable> bk = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bl;
   @Nullable
   private gae bm;
   private int bn;
   private final btm bo;
   private bvk bp = bvj.a;
   private final ful bq = new ful();
   private long br;
   private double bs;
   @Nullable
   private fnw.a bt;
   private final ftv bu;
   private final gse bv;
   private gst bw;
   private final ftr bx;
   private final fii by;
   private boolean bz;
   private final long bA;
   private long bB;

   public fue(final glm $$0) {
      super("Client");
      F = this;
      this.bA = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.N = $$0.c.b.toPath();
      this.ae = $$0.d.b;
      this.af = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.by = fcs.a($$2.resolve("allowed_symlinks.txt"));
      hsj $$3 = new hsj($$0.c.a(), this.by);
      this.an = new hus(this, $$2.resolve("downloads"), $$0.a);
      axb $$4 = new awu(this.N, awd.a, axa.b, this.by);
      this.ao = new awz($$3, this.an.a(), $$4);
      this.am = $$3.a();
      this.ag = $$0.a.d;
      this.az = new YggdrasilAuthenticationService(this.ag);
      this.aA = this.az.createMinecraftSessionService();
      this.aa = $$0.a.a;
      this.O = CompletableFuture.supplyAsync(() -> this.aA.fetchProfile(this.aa.b(), true), ag.j());
      this.aB = this.a(this.az, $$0);
      this.aC = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aB.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ag.j());
      G.info("Setting user: {}", this.aa.c());
      G.debug("(Session ID is {})", this.aa.a());
      this.ai = $$0.d.a;
      this.aj = !$$0.d.d;
      this.ak = !$$0.d.e;
      this.aT = null;
      yt.a(fuc::a);
      this.R = bds.a();
      this.bd = Thread.currentThread();
      this.n = new fui(this, this.q);
      this.aL = new gad(this, this.n);
      boolean $$5 = this.n.af;
      this.n.af = false;
      this.n.aC();
      this.be = true;
      this.aM = new hxz(this, this.n);
      this.ac = new ftz($$2, this.R);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fmx $$6 = $$0.b;
      if (this.n.p > 0 && this.n.o > 0) {
         $$6 = $$0.b.a(this.n.o, this.n.p);
      }

      if (!$$5) {
         $$6 = $$6.a(false);
         this.n.k = null;
         G.warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
      }

      ag.c = RenderSystem.initBackendSystem();
      this.S = new gyo(this);
      this.T = this.S.a($$6, this.n.k, this.bi());
      this.a(true);
      this.T.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fmu.a($$0.c.a, fue.this.bd.threadId());
            }
         }
      });
      hxm.a.b(hxi.A);

      try {
         this.T.a(this.am, ac.b().f() ? fmz.a : fmz.b);
      } catch (IOException var15) {
         G.error("Couldn't set icon", var15);
      }

      this.o = new fuf(this);
      this.o.a(this.T.h());
      this.p = new fud(this);
      this.p.a(this.T.h());
      RenderSystem.initRenderer(this.T.h(), this.n.t, false, ($$0x, $$1x) -> this.ac().a($$0x, $$1x), $$0.d.g);
      G.info("Using optional rendering extensions: {}", String.join(", ", RenderSystem.getDevice().getEnabledExtensions()));
      this.ar = new fmq(this.T.k(), this.T.l());
      this.al = new axl(awd.a);
      this.ao.a();
      this.n.b(this.ao);
      this.ap = new htd(this.n.ac, $$0x -> {
         if (this.t != null) {
            this.t.j.E();
         }
      });
      this.al.a(this.ap);
      this.P = new hru(this.al);
      this.al.a(this.P);
      this.Q = new gyg(this.P, this::a);
      this.al.a(this.Q);
      this.aD = new hsu($$1.toPath().resolve("skins"), this.aA, this);
      this.ah = new fcs($$2.resolve("saves"), $$2.resolve("backups"), this.by, this.R);
      this.bx = new ftr($$2);
      this.au = new hws(this);
      this.at = new hwx(this.n, this.au);
      this.al.a(this.at);
      this.aw = new hsv(this.aa);
      this.al.a(this.aw);
      this.av = new gam(this.P);
      this.h = this.av.a();
      this.i = this.av.b();
      this.al.a(this.av);
      this.g();
      this.al.a(new hsn());
      this.al.a(new hsm());
      this.al.a(new hsl());
      this.T.a("Startup");
      RenderSystem.setupDefaultState();
      this.T.a("Post startup");
      this.aq = fvi.a();
      this.aE = new huh(this.P, this.aq, this.n.F().c());
      this.al.a(this.aE);
      hty $$8 = new hty();
      this.al.a($$8);
      this.X = new hof(this.aE);
      this.Y = new hfd(this.X);
      this.aH = new hsr(this.P);
      this.aI = new hsq(this.P);
      this.al.a(this.aI);
      this.Z = new gxk(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fof.a();
         this.V = new gxw($$9);
      } catch (OutOfMemoryError var14) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + bav.k,
            "ok",
            "error",
            true
         );
         throw new gln("Unable to allocate render buffers", var14);
      }

      this.aN = new gkc(this, this.aB);
      this.aF = new gys(this.aE.b(), this.aE.c(), this.aq);
      this.al.a(this.aF);
      this.W = new hec(this, this.P, this.X, this.Y, this.Z, this.aF, this.h, this.n, this.aE.d(), $$8);
      this.al.a(this.W);
      this.aO = new hab(this.h, this.aE.d(), this.aF, this.X, this.Y, this.W);
      this.al.a(this.aO);
      this.g = new guv(this.s, this.P);
      this.al.a(this.g);
      this.aG = new hss(this.P);
      this.al.a(this.aG);
      this.aJ = new fxc(this.P);
      this.al.a(this.aJ);
      this.aK = new hsy();
      this.al.a(this.aK);
      this.j = new gxb(this, this.W.c(), this.V);
      this.f = new gxh(this, this.W, this.aO, this.V);
      this.al.a(this.f);
      this.al.a(this.f.z());
      this.ax = new gxd();
      this.al.a(this.ax);
      this.al.a(this.ay);
      this.m = new fxa(this);
      this.l = new hbz(this);
      foq $$11 = foq.a(this);
      this.aR = new fra($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.ar.c != this.T.k() || this.ar.d != this.T.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.T.k()
               + "x"
               + this.T.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );

         try {
            GpuDevice $$13 = RenderSystem.getDevice();
            List<String> $$14 = $$13.getLastDebugMessages();
            if (!$$14.isEmpty()) {
               $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", $$14));
            }
         } catch (Throwable var13) {
         }

         this.T.a(this.ar.c, this.ar.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ae().c() && !this.T.i()) {
         if ($$5) {
            this.T.g();
            this.n.ae().a(this.T.i());
         } else {
            this.n.ae().a(false);
         }
      }

      this.T.a(this.n.R().c());
      this.T.b(this.n.J().c());
      this.T.d();
      this.a();
      this.j.a(this.am.d());
      this.aP = new hxb(this, this.aB, this.aa);
      this.aQ = grx.a(this.aB, this.aa, $$2);
      this.bu = new ftv(this);
      this.bu.a(this.n.aw().c() != fug.a);
      this.bv = new gse(this);
      this.bv.a(this.n.D().c());
      this.bw = gst.a(gsq.a(), this.aB);
      gev.a(this.P);
      gej.a(this.P);
      this.j.q().a(this.P);
      this.a((get)(new gee(xo.c("gui.loadingMinecraft"))));
      List<awb> $$15 = this.ao.h();
      this.bq.a(ful.b.a, $$15);
      axk $$16 = this.al.a(ag.h().a("resourceLoad"), this, J, $$15);
      hxm.a.a(hxi.C);
      fue.b $$17 = new fue.b($$11, $$0.e);
      this.a((gen)(new gej(this, $$16, $$1x -> ag.a($$1x, $$1xx -> this.a($$1xx, $$17), () -> {
         if (ac.aZ) {
            this.bl();
         }

         this.bq.a();
         this.a($$17);
      }), false)));
      this.aS = gwq.a($$0.e.b());
      this.bi = new fmy(this.n, this);
      this.bo = new btm(ag.c, () -> this.bn, this.bi::c);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.as = new flg();
      } else {
         this.as = null;
      }
   }

   private void a(@Nullable fue.b $$0) {
      if (!this.bz) {
         this.bz = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fue.b $$0) {
      Runnable $$1 = this.c($$0);
      hxm.a.b(hxi.C);
      hxm.a.b(hxi.z);
      hxm.a.a(this.aP.a());
      $$1.run();
      this.n.af = true;
      this.n.aC();
   }

   public boolean c() {
      return this.bz;
   }

   private Runnable c(@Nullable fue.b $$0) {
      List<Function<Runnable, get>> $$1 = new ArrayList<>();
      boolean $$2 = this.a($$1);
      Runnable $$3 = () -> {
         if ($$0 != null && $$0.b.a()) {
            gwp.a(this, $$0.b.c(), $$0.a());
         } else {
            this.a((get)(new gev(true, new fyg($$2))));
         }
      };

      for (Function<Runnable, get> $$4 : Lists.reverse($$1)) {
         get $$5 = $$4.apply($$3);
         $$3 = () -> this.a($$5);
      }

      return $$3;
   }

   private boolean a(List<Function<Runnable, get>> $$0) {
      boolean $$1 = false;
      if (this.n.ad) {
         $$0.add($$0x -> new gdl(this.n, $$0x));
         $$1 = true;
      }

      BanDetails $$2 = this.I();
      if ($$2 != null) {
         $$0.add($$1x -> gdo.a($$1xx -> {
            if ($$1xx) {
               ag.n().a(bav.n);
            }

            $$1x.run();
         }, $$2));
      }

      ProfileResult $$3 = this.O.join();
      if ($$3 != null) {
         GameProfile $$4 = $$3.profile();
         Set<ProfileActionType> $$5 = $$3.actions();
         if ($$5.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> gdo.a($$4.getName(), $$1x));
         }

         if ($$5.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(gdo::a);
         }
      }

      return $$1;
   }

   private static boolean a(Object $$0) {
      try {
         return Locale.getDefault().getISO3Country().equals($$0);
      } catch (MissingResourceException var2) {
         return false;
      }
   }

   public void d() {
      this.T.b(this.bi());
   }

   private String bi() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(ac.b().c());
      grl $$1 = this.M();
      if ($$1 != null && $$1.m().i()) {
         $$0.append(" - ");
         grz $$2 = this.T();
         if (this.aT != null && !this.aT.r()) {
            $$0.append(htb.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(htb.a("title.multiplayer.realms"));
         } else if (this.aT == null && ($$2 == null || !$$2.d())) {
            $$0.append(htb.a("title.multiplayer.other"));
         } else {
            $$0.append(htb.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, glm $$1) {
      return $$1.a.a.g() != fuq.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static bca e() {
      return bca.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fue.class);
   }

   private void a(Throwable $$0, @Nullable fue.b $$1) {
      if (this.ao.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ag.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xo $$1, @Nullable fue.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bq.a($$0);
      this.an.b();
      this.ao.b(Collections.emptyList());
      this.n.i.clear();
      this.n.j.clear();
      this.n.aC();
      this.a(true, $$2).thenRunAsync(() -> this.a($$1), this);
   }

   private void bj() {
      this.a(null);
      if (this.s != null) {
         this.s.a(grk.a);
         this.z();
      }

      this.a((get)(new gev()));
      this.a(null);
   }

   private void a(@Nullable xo $$0) {
      gad $$1 = this.aB();
      gab.b($$1, gab.a.c, xo.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (!this.ao.b()) {
         if (this.ao.e().size() <= 1) {
            G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
            this.c(new p($$0.getMessage(), $$0));
         } else {
            this.a_(this::bj);
         }
      } else {
         this.a($$0, xo.c("resourcePack.runtime_failure"), null);
      }
   }

   public void f() {
      this.bd = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bd.setPriority(10);
      }

      DiscontinuousFrame $$0 = TracyClient.createDiscontinuousFrame("Client Tick");

      try {
         boolean $$1 = false;

         while (this.be) {
            this.bk();

            try {
               btw $$2 = btw.a("Renderer");
               boolean $$3 = this.aR().e();

               try (bts.a $$4 = bts.a(this.a($$3, $$2))) {
                  this.bp.c();
                  $$0.start();
                  this.c(!$$1);
                  $$0.end();
                  this.bp.d();
               }

               this.b($$3, $$2);
            } catch (OutOfMemoryError var10) {
               if ($$1) {
                  throw var10;
               }

               this.bm();
               this.a((get)(new gem()));
               System.gc();
               G.error(LogUtils.FATAL_MARKER, "Out of memory", var10);
               $$1 = true;
            }
         }
      } catch (aa var11) {
         G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var11);
         this.c(var11.a());
      } catch (Throwable var12) {
         G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var12);
         this.c(new p("Unexpected error", var12));
      }
   }

   void g() {
      this.av.a(this.n);
   }

   private void a(int $$0, long $$1) {
      this.n.R().a(false);
      this.n.aC();
   }

   public fmr h() {
      return this.ar;
   }

   public String i() {
      return this.ae;
   }

   public String j() {
      return this.af;
   }

   public void a(p $$0) {
      this.bf = () -> this.d($$0);
   }

   public void b(p $$0) {
      this.bf = () -> $$0;
   }

   private void bk() {
      if (this.bf != null) {
         a(this, this.q, this.bf.get());
      }
   }

   public void c(p $$0) {
      bbz.b();
      p $$1 = this.d($$0);
      this.bm();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, p $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ag.f() + "-client.txt");
      amg.a($$1.a(z.a));
      if ($$1.e() != null) {
         amg.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, z.a)) {
         amg.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         amg.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fue $$0, File $$1, p $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.at.f();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.T().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fue.b $$1) {
      if (this.bl != null) {
         return this.bl;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.bb instanceof gej) {
            this.bl = $$2;
            return $$2;
         } else {
            this.ao.a();
            List<awb> $$3 = this.ao.h();
            if (!$$0) {
               this.bq.a(ful.b.b, $$3);
            }

            this.a((gen)(new gej(this, this.al.a(ag.h().a("resourceLoad"), this, J, $$3), $$3x -> ag.a($$3x, $$2xx -> {
               if ($$0) {
                  this.an.c();
                  this.bj();
               } else {
                  this.a($$2xx, $$1);
               }
            }, () -> {
               this.f.d();
               this.bq.a();
               this.an.d();
               $$2.complete(null);
               this.a($$1);
            }), !$$0)));
            return $$2;
         }
      }
   }

   private void bl() {
      boolean $$0 = false;
      gyr $$1 = this.aq().a();
      gzc $$2 = $$1.a().a();

      for (dpz $$3 : mm.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            eeb $$4 = (eeb)$$7.next();
            if ($$4.o() == dwn.b) {
               gzc $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      hrs $$6 = $$2.a();

      for (dpz $$7 : mm.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            eeb $$8 = (eeb)var15.next();
            hrs $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      mm.g.c().forEach($$0x -> {
         dcr $$1x = (dcr)$$0x.a();
         String $$2x = $$1x.j();
         String $$3x = xo.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.j())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= gek.a();
      $$0 |= hef.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public fcs m() {
      return this.ah;
   }

   private void a(String $$0) {
      fue.a $$1 = this.K();
      if (!$$1.a(this.U())) {
         if (this.m.c()) {
            this.m.b(false);
            this.a((get)(new gdq($$0x -> {
               if ($$0x) {
                  ag.n().a(bav.g);
               }

               this.a(null);
            }, fue.a.e, bav.g, true)));
         } else {
            xo $$2 = $$1.a();
            this.m.a($$2, false);
            this.bu.d($$2);
            this.m.b($$1 == fue.a.d);
         }
      } else {
         this.a((get)(new gdp($$0)));
      }
   }

   public void a(@Nullable get $$0) {
      if (ac.aZ && Thread.currentThread() != this.bd) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.aI_();
      } else {
         this.a(fub.a);
      }

      if ($$0 == null && this.bc) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new gev();
         } else if ($$0 == null && this.t.eM()) {
            if (this.t.n()) {
               $$0 = new gdx(null, this.s.l().l());
            } else {
               this.t.gp();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aJ_();
         }

         if ($$0 != null) {
            this.o.j();
            fuc.b();
            $$0.b(this, this.T.o(), this.T.p());
            this.y = false;
         } else {
            this.at.g();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable gen $$0) {
      this.bb = $$0;
   }

   public void n() {
      try {
         G.info("Stopping!");

         try {
            this.bu.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.s != null) {
               this.s.a(grk.a);
            }

            this.z();
         } catch (Throwable var6) {
         }

         if (this.z != null) {
            this.z.aI_();
         }

         this.close();
      } finally {
         ag.c = System::nanoTime;
         if (this.bf == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bt != null) {
         this.bt.a();
      }

      try {
         this.aP.close();
         this.ay.close();
         this.aE.close();
         this.av.close();
         this.j.close();
         this.Q.close();
         this.f.close();
         this.at.e();
         this.g.a();
         this.aG.close();
         this.aI.close();
         this.aJ.close();
         this.aH.close();
         this.P.close();
         this.al.close();
         if (this.as != null) {
            this.as.close();
         }

         gay.b();
         ag.k();
         RenderSystem.getDevice().close();
      } catch (Throwable var5) {
         G.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.S.close();
         this.T.close();
      }
   }

   private void c(boolean $$0) {
      this.T.a("Pre render");
      if (this.T.c()) {
         this.q();
      }

      if (this.bl != null && !(this.bb instanceof gej)) {
         CompletableFuture<Void> $$1 = this.bl;
         this.bl = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bk.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.U.a(ag.c(), $$0);
      btt $$4 = bts.a();
      if ($$0) {
         $$4.a("scheduledExecutables");
         this.bA();
         $$4.c();
         $$4.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$3); $$5++) {
            $$4.f("clientTick");
            this.t();
         }

         $$4.c();
      }

      this.T.a("Render");
      $$4.a("gpuAsync");
      RenderSystem.executePendingTasks();
      $$4.b("sound");
      this.at.a(this.j.l());
      $$4.b("toasts");
      this.aL.a();
      $$4.b("render");
      long $$6 = ag.d();
      boolean $$8;
      if (!this.aR().d() && !this.bp.e()) {
         $$8 = false;
         this.bs = 0.0;
      } else {
         $$8 = this.bt == null || this.bt.b();
         if ($$8) {
            fnw.a().ifPresent(fnw::b);
         }
      }

      fmr $$9 = this.h();
      RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$9.c(), 0, $$9.e(), 1.0);
      $$4.a("mouse");
      this.o.a();
      $$4.c();
      if (!this.y) {
         $$4.b("gameRenderer");
         this.j.a(this.U, $$0);
         $$4.c();
      }

      $$4.a("blit");
      if (!this.T.u()) {
         $$9.b();
      }

      this.bh = ag.d() - $$6;
      if ($$8) {
         fnw.a().ifPresent($$0x -> this.bt = $$0x.c());
      }

      $$4.b("updateDisplay");
      if (this.as != null) {
         this.as.a();
         this.as.a($$9);
      }

      this.T.a(this.as);
      int $$10 = this.bi.a();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      $$4.b("yield");
      Thread.yield();
      $$4.c();
      this.T.a("Post render");
      this.ba++;
      boolean $$11 = this.aX;
      this.aX = this.V() && (this.z != null && this.z.aQ_() || this.bb != null && this.bb.a()) && !this.aT.r();
      if (!$$11 && this.aX) {
         this.at.a(aza.b, aza.k);
      }

      this.U.b(this.aX);
      this.U.c(!this.br());
      long $$12 = ag.d();
      long $$13 = $$12 - this.aY;
      if ($$8) {
         this.br = $$13;
      }

      this.aR().a($$13);
      this.aY = $$12;
      $$4.a("fpsUpdate");
      if (this.bt != null && this.bt.b()) {
         this.bs = this.bt.c() * 100.0 / this.br;
      }

      while (ag.c() >= this.aZ + 1000L) {
         String $$14;
         if (this.bs > 0.0) {
            $$14 = " GPU: " + (this.bs > 100.0 ? o.m + "100%" : Math.round(this.bs) + "%");
         } else {
            $$14 = "";
         }

         bg = this.ba;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bg,
            $$10 == 260 ? "inf" : $$10,
            this.n.R().c() ? " vsync " : " ",
            this.n.l().c(),
            this.n.j().c() == ftq.a ? "" : (this.n.j().c() == ftq.b ? " fast-clouds" : " fancy-clouds"),
            this.n.H().c(),
            $$14
         );
         this.aZ += 1000L;
         this.ba = 0;
      }

      $$4.c();
   }

   private btt a(boolean $$0, @Nullable btw $$1) {
      if (!$$0) {
         this.bo.b();
         if (!this.bp.e() && $$1 == null) {
            return btp.a;
         }
      }

      btt $$2;
      if ($$0) {
         if (!this.bo.a()) {
            this.bn = 0;
            this.bo.c();
         }

         this.bn++;
         $$2 = this.bo.d();
      } else {
         $$2 = btp.a;
      }

      if (this.bp.e()) {
         $$2 = btt.a($$2, this.bp.f());
      }

      return btw.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable btw $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fzj $$2 = this.aR().o();
      if ($$0) {
         $$2.a(this.bo.e());
      } else {
         $$2.a(null);
      }
   }

   @Override
   public void a() {
      int $$0 = this.T.a(this.n.au().c(), this.k());
      this.T.a($$0);
      if (this.z != null) {
         this.z.a(this, this.T.o(), this.T.p());
      }

      fmr $$1 = this.h();
      $$1.a(this.T.k(), this.T.l());
      this.j.a(this.T.k(), this.T.l());
      this.o.g();
   }

   @Override
   public void b() {
      this.o.k();
   }

   public int o() {
      return bg;
   }

   public long p() {
      return this.bh;
   }

   private void bm() {
      bbz.b();

      try {
         if (this.aV && this.aT != null) {
            this.aT.a(true);
         }

         this.y();
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<xo> $$0) {
      if (this.bp.e()) {
         this.bn();
         return false;
      } else {
         Consumer<btr> $$1 = $$1x -> {
            if ($$1x != btn.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / bdg.a;
               this.execute(
                  () -> $$0.accept(
                     xo.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", $$2x / $$3x))
                  )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xo $$2x = xo.b($$1x.toString()).a(o.t).a($$1xx -> $$1xx.a(new xm.e($$1x.getParent())));
            this.execute(() -> $$0.accept(xo.a("debug.profiling.stop", $$2x)));
         };
         ae $$3 = a(new ae(), this, this.ap, this.ae, this.n);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aT == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aT.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ag.i());
            this.aT.a($$0x -> {}, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bp = bvi.a(new gwn(ag.c, this.f), ag.c, ag.i(), new bvo("client"), $$1x -> {
            this.bp = bvj.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bn() {
      this.bp.a();
      if (this.aT != null) {
         this.aT.aV();
      }
   }

   private void bo() {
      this.bp.b();
      if (this.aT != null) {
         this.aT.aW();
      }
   }

   private Path a(ae $$0, List<Path> $$1) {
      String $$2;
      if (this.U()) {
         $$2 = this.W().aZ().e();
      } else {
         grz $$3 = this.T();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ag.f(), $$2, ac.b().b());
         String $$6 = w.a(bvo.a, $$5, ".zip");
         $$7 = bvo.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (bbl $$10 = new bbl($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.n.aI().getName()), this.n.aJ());
         $$1.forEach($$10::a);
      } finally {
         for (Path $$13 : $$1) {
            try {
               FileUtils.forceDelete($$13.toFile());
            } catch (IOException var18) {
               G.warn("Failed to delete temporary profiling result {}", $$13, var18);
            }
         }
      }

      return $$7;
   }

   public void q() {
      this.be = false;
   }

   public boolean r() {
      return this.be;
   }

   public void b(boolean $$0) {
      if (this.z == null) {
         boolean $$1 = this.V() && !this.aT.r();
         if ($$1) {
            this.a((get)(new geo(!$$0)));
         } else {
            this.a((get)(new geo(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fG()) {
         if ($$0 && this.w != null && this.w.d() == fiq.a.b) {
            fio $$1 = (fio)this.w;
            jb $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jh $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(bxi.a);
               }
            }
         } else {
            this.r.b();
         }
      }
   }

   private boolean bp() {
      if (this.x > 0) {
         return false;
      } else if (this.w == null) {
         G.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.r.e()) {
            this.x = 10;
         }

         return false;
      } else if (this.t.C()) {
         return false;
      } else {
         dcv $$0 = this.t.b(bxi.a);
         if (!$$0.a(this.s.L())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((fip)this.w).a());
                  break;
               case b:
                  fio $$2 = (fio)this.w;
                  jb $$3 = $$2.b();
                  if (!this.s.a_($$3).l()) {
                     this.r.a($$3, $$2.c());
                     if (this.s.a_($$3).l()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.r.e()) {
                     this.x = 10;
                  }

                  this.t.gO();
            }

            this.t.a(bxi.a);
            return $$1;
         }
      }
   }

   private void bq() {
      if (!this.r.j()) {
         this.aW = 4;
         if (!this.t.C()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bxi $$0 : bxi.values()) {
               dcv $$1 = this.t.b($$0);
               if (!$$1.a(this.s.L())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        fip $$2 = (fip)this.w;
                        bzm $$3 = $$2.a();
                        if (!this.s.F_().a($$3.dx())) {
                           return;
                        }

                        bxj $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bxj.d $$5) {
                           if ($$5.e() == bxj.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        fio $$6 = (fio)this.w;
                        int $$7 = $$1.M();
                        bxj $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bxj.d $$9) {
                           if ($$9.e() == bxj.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.M() != $$7 || this.t.gc())) {
                                 this.j.d.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bxj.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bxj.d $$11) {
                  if ($$11.e() == bxj.e.b) {
                     this.t.a($$0);
                  }

                  this.j.d.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hws s() {
      return this.au;
   }

   public void t() {
      this.bB++;
      if (this.s != null && !this.aX) {
         this.s.v().m();
      }

      if (this.aW > 0) {
         this.aW--;
      }

      btt $$0 = bts.a();
      $$0.a("gui");
      this.bv.a();
      this.m.a(this.aX);
      $$0.c();
      this.j.a(1.0F);
      this.aM.a(this.s, this.w);
      $$0.a("gameMode");
      if (!this.aX && this.s != null) {
         this.r.c();
      }

      $$0.b("textures");
      if (this.br()) {
         this.P.d();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof geg $$1 && !this.t.fY()) {
            $$1.l();
         }
      } else if (this.t.eM() && !(this.z instanceof gdx)) {
         this.a(null);
      } else if (this.t.fY() && this.s != null) {
         this.a((get)(new geg()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         try {
            this.z.e();
         } catch (Throwable var5) {
            p $$3 = p.a(var5, "Ticking screen");
            this.z.a($$3);
            throw new aa($$3);
         }
      }

      if (!this.aR().d()) {
         this.m.m();
      }

      if (this.bb == null && this.z == null) {
         $$0.b("Keybindings");
         this.bt();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         $$0.b("gameRenderer");
         if (!this.aX) {
            this.j.f();
         }

         $$0.b("levelRenderer");
         if (!this.aX) {
            this.f.n();
         }

         $$0.b("level");
         if (!this.aX) {
            this.s.f();
         }
      } else if (this.j.g() != null) {
         this.j.c();
      }

      this.au.a();
      this.at.a(this.aX);
      if (this.s != null) {
         if (!this.aX) {
            if (!this.n.s && this.bs()) {
               xo $$4 = xo.c("tutorial.socialInteractions.title");
               xo $$5 = xo.a("tutorial.socialInteractions.description", hxz.a("socialInteractions"));
               this.bm = new gae(this.h, gae.a.f, $$4, $$5, true, 8000);
               this.aL.a(this.bm);
               this.n.s = true;
               this.n.aC();
            }

            this.aM.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var6) {
               p $$7 = p.a(var6, "Exception in world tick");
               if (this.s == null) {
                  q $$8 = $$7.a("Affected level");
                  $$8.a("Problem", "Level is null!");
               } else {
                  this.s.a($$7);
               }

               throw new aa($$7);
            }
         }

         $$0.b("animateTick");
         if (!this.aX && this.br()) {
            this.s.b(this.t.dB(), this.t.dD(), this.t.dH());
         }

         $$0.b("particles");
         if (!this.aX && this.br()) {
            this.g.b();
         }

         grl $$9 = this.M();
         if ($$9 != null && !this.aX) {
            $$9.b(ahz.a);
         }
      } else if (this.aU != null) {
         $$0.b("pendingConnection");
         this.aU.b();
      }

      $$0.b("keyboard");
      this.p.b();
      $$0.c();
   }

   private boolean br() {
      return this.s == null || this.s.v().i();
   }

   private boolean bs() {
      return !this.aV || this.aT != null && this.aT.r();
   }

   private void bt() {
      while (this.n.N.g()) {
         ftn $$0 = this.n.aH();
         this.n.a(this.n.aH().c());
         if ($$0.a() != this.n.aH().a()) {
            this.j.a(this.n.aH().a() ? this.ap() : null);
         }

         this.f.p();
      }

      while (this.n.O.g()) {
         this.n.aa = !this.n.aa;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.n.U.e();
         boolean $$3 = this.n.V.e();
         if (this.n.T[$$1].g()) {
            if (this.t.am()) {
               this.m.h().a($$1);
            } else if (!this.t.gc() || this.z != null || !$$3 && !$$2) {
               this.t.gs().c($$1);
            } else {
               ggq.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.bs()) {
            this.t.a(K, true);
            this.bu.d(K);
         } else {
            if (this.bm != null) {
               this.bm.c();
               this.bm = null;
            }

            this.a((get)(new gke()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.f()) {
            this.t.k();
         } else {
            this.aM.a();
            this.a((get)(new ghb(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((get)(new gfd(this.t.j.r())));
      }

      while (this.n.S.g()) {
         this.bu().ifPresent($$0 -> this.t.j.a((jl<art>)$$0, this.z));
      }

      while (this.n.D.g()) {
         if (!this.t.am()) {
            this.M().b(new ait(ait.a.g, jb.c, jh.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.am() && this.t.a(get.s())) {
            this.t.a(bxi.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.bb == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fG()) {
         if (!this.n.F.e()) {
            this.r.b(this.t);
         }

         while (this.n.G.g()) {
         }

         while (this.n.F.g()) {
         }

         while (this.n.H.g()) {
         }
      } else {
         while (this.n.G.g()) {
            $$4 |= this.bp();
         }

         while (this.n.F.g()) {
            this.bq();
         }

         while (this.n.H.g()) {
            this.bC();
         }
      }

      if (this.n.F.e() && this.aW == 0 && !this.t.fG()) {
         this.bq();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   private Optional<jl<art>> bu() {
      jy<art> $$0 = this.t.j.x().f(mn.aT);
      return $$0.a(azq.b).flatMap($$1 -> {
         if ($$1.b() == 0) {
            return Optional.empty();
         } else {
            return $$1.b() == 1 ? Optional.of($$1.a(0)) : $$0.a(arx.c);
         }
      });
   }

   public hxb u() {
      return this.aP;
   }

   public double v() {
      return this.bs;
   }

   public grx w() {
      return this.aQ;
   }

   public gky x() {
      return new gky(this, this.ah);
   }

   public void a(fcs.c $$0, awz $$1, and $$2, boolean $$3) {
      this.z();
      this.ab.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         amz $$5 = amz.a(this.az, this.q);
         $$5.f().a(this);
         ecp.a($$5, this);
         axx.a(false);
         this.aT = MinecraftServer.a((Function<Thread, hwf>)($$4x -> new hwf($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
            aup $$1xx = aup.b($$0xx + 0);
            this.ab.set($$1xx);
            return auo.a($$1xx, this.bk::add);
         })));
         this.aV = true;
         this.a(gsq.a());
         this.aS.a(gwq.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var12) {
         p $$7 = p.a(var12, "Starting integrated server");
         q $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new aa($$7);
      }

      while (this.ab.get() == null) {
         Thread.yield();
      }

      geh $$9 = new geh(this.ab.get());
      btt $$10 = bts.a();
      this.a((get)$$9);
      $$10.a("waitForServer");

      for (; !this.aT.ai() || this.bb != null; this.bk()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var11) {
         }
      }

      th.a.b();
      $$10.c();
      Duration $$11 = Duration.between($$4, Instant.now());
      SocketAddress $$12 = this.aT.ah().a();
      wd $$13 = wd.a($$12);
      $$13.a($$12.toString(), 0, new grj($$13, this, null, null, $$3, $$11, $$0x -> {}, null));
      $$13.a(new akj(this.Y().c(), this.Y().b()));
      this.aU = $$13;
   }

   public void a(grk $$0, ger.a $$1) {
      this.d(new ger(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aV) {
         amz $$2 = amz.a(this.az, this.q);
         $$2.f().a(this);
         ecp.a($$2, this);
         axx.a(false);
      }
   }

   public void y() {
      this.a(new gee(L), false);
   }

   public void z() {
      this.a(new geq(true), false);
   }

   public void a(get $$0, boolean $$1) {
      grl $$2 = this.M();
      if ($$2 != null) {
         this.bz();
         $$2.j();
         if (!$$1) {
            this.C();
         }
      }

      this.aN.b();
      if (this.bp.e()) {
         this.bo();
      }

      hwf $$3 = this.aT;
      this.aT = null;
      this.j.i();
      this.r = null;
      this.bu.b();
      this.bc = true;

      try {
         this.d($$0);
         if (this.s != null) {
            if ($$3 != null) {
               btt $$4 = bts.a();
               $$4.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               $$4.c();
            }

            this.m.j();
            this.aV = false;
         }

         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bc = false;
      }

      ecp.a();
   }

   public void C() {
      this.an.i();
      this.bA();
   }

   public void b(get $$0) {
      grl $$1 = this.M();
      if ($$1 != null) {
         $$1.k();
      }

      if (this.bp.e()) {
         this.bo();
      }

      this.j.i();
      this.r = null;
      this.bu.b();
      this.bc = true;

      try {
         this.d($$0);
         this.m.j();
         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bc = false;
      }

      ecp.a();
   }

   private void d(get $$0) {
      btt $$1 = bts.a();
      $$1.a("forcedTick");
      this.at.d();
      this.u = null;
      this.aU = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void c(get $$0) {
      try (bty $$1 = bts.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable grk $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aO.a($$0);
      this.j.a($$0);
      this.d();
   }

   private UserProperties bv() {
      return this.aC.join();
   }

   public boolean D() {
      return this.E() && this.n.am().c();
   }

   public boolean E() {
      return this.F() && this.bv().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean F() {
      return ac.aZ ? false : this.bv().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean G() {
      return this.aj && this.bv().flag(UserFlag.SERVERS_ALLOWED) && this.I() == null && !this.J();
   }

   public boolean H() {
      return this.bv().flag(UserFlag.REALMS_ALLOWED) && this.I() == null;
   }

   @Nullable
   public BanDetails I() {
      return (BanDetails)this.bv().bannedScopes().get("MULTIPLAYER");
   }

   public boolean J() {
      ProfileResult $$0 = this.O.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.K().a(false) ? this.aN.c($$0) : (this.t == null || !$$0.equals(this.t.cK())) && !$$0.equals(ag.e);
   }

   public fue.a K() {
      if (this.n.o().c() == cuq.c) {
         return fue.a.b;
      } else if (!this.ak) {
         return fue.a.c;
      } else {
         return !this.bv().flag(UserFlag.CHAT_ALLOWED) ? fue.a.d : fue.a.a;
      }
   }

   public final boolean L() {
      return this.ai;
   }

   @Nullable
   public grl M() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean N() {
      return !F.n.Y;
   }

   public static boolean O() {
      return F.n.l().c().b() >= ftw.b.b();
   }

   public static boolean P() {
      return !F.j.b() && F.n.l().c().b() >= ftw.c.b();
   }

   public static boolean Q() {
      return F.n.m().c();
   }

   private void bC() {
      if (this.w != null && this.w.d() != fiq.a.a) {
         boolean $$0 = get.s();
         switch (this.w) {
            case fio $$1:
               this.r.a($$1.b(), $$0);
               break;
            case fip $$2:
               this.r.a($$2.a(), $$0);
               break;
            default:
         }
      }
   }

   public p d(p $$0) {
      ae $$1 = $$0.f();

      try {
         a($$1, this, this.ap, this.ae, this.n);
         this.a($$0.a("Uptime"));
         if (this.s != null) {
            this.s.a($$0);
         }

         if (this.aT != null) {
            this.aT.b($$1);
         }

         this.bq.a($$0);
      } catch (Throwable var4) {
         G.error("Failed to collect details", var4);
      }

      return $$0;
   }

   public static void a(@Nullable fue $$0, @Nullable htd $$1, String $$2, @Nullable fui $$3, p $$4) {
      ae $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(q $$0) {
      $$0.a("JVM uptime", () -> a(ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((System.currentTimeMillis() - this.bA) / 1000.0));
      $$0.a("High-res time", () -> a(ag.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bB, this.bB / 20.0));
   }

   private static ae a(ae $$0, @Nullable fue $$1, @Nullable htd $$2, String $$3, @Nullable fui $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bh();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.T.k() + "x" + $$1.T.l() : "<not initialized>");
      $$0.a("GFLW Platform", fni::a);
      $$0.a("Render Extensions", () -> String.join(", ", RenderSystem.getDevice().getEnabledExtensions()));
      $$0.a("GL debug messages", () -> {
         GpuDevice $$0x = RenderSystem.tryGetDevice();
         if ($$0x == null) {
            return "<no renderer available>";
         } else {
            return $$0x.isDebuggingEnabled() ? String.join("\n", $$0x.getLastDebugMessages()) : "<debugging unavailable>";
         }
      });
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.M) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.ak().l();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.l().c().toString());
         $$0.a("Render Distance", $$4.aK() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> awz.a($$1.ae().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", GLX::_getCpuInfo);
      return $$0;
   }

   public static fue R() {
      return F;
   }

   public CompletableFuture<Void> S() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gsq $$0) {
      if (!this.bw.a($$0)) {
         this.bw = gst.a($$0, this.aB);
      }
   }

   @Nullable
   public grz T() {
      return y.a(this.M(), grl::z);
   }

   public boolean U() {
      return this.aV;
   }

   public boolean V() {
      return this.aV && this.aT != null;
   }

   @Nullable
   public hwf W() {
      return this.aT;
   }

   public boolean X() {
      hwf $$0 = this.W();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.Y().b());
   }

   public fuq Y() {
      return this.aa;
   }

   public GameProfile Z() {
      ProfileResult $$0 = this.O.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.aa.b(), this.aa.c());
   }

   public Proxy aa() {
      return this.ag;
   }

   public hru ab() {
      return this.P;
   }

   public gyg ac() {
      return this.Q;
   }

   public axo ad() {
      return this.al;
   }

   public awz ae() {
      return this.ao;
   }

   public awf af() {
      return this.am;
   }

   public hus ag() {
      return this.an;
   }

   public Path ah() {
      return this.N;
   }

   public htd ai() {
      return this.ap;
   }

   public Function<ame, hrs> a(ame $$0) {
      return this.aE.c($$0)::a;
   }

   public boolean aj() {
      return this.aX;
   }

   public gxd ak() {
      return this.ax;
   }

   public hwx al() {
      return this.at;
   }

   public hwr am() {
      ayw $$0 = y.a(this.z, get::D);
      if ($$0 != null) {
         return new hwr($$0);
      } else if (this.t == null) {
         return new hwr(ayx.a);
      } else {
         dmu $$1 = this.t.ai();
         if ($$1.aj() == dmu.k) {
            return this.m.k().b() ? new hwr(ayx.d) : new hwr(ayx.e);
         } else {
            jl<dnx> $$2 = $$1.v(this.t.dx());
            dnx $$3 = $$2.a();
            float $$4 = $$3.q();
            Optional<bvt<ayw>> $$5 = $$3.p();
            if ($$5.isPresent()) {
               Optional<ayw> $$6 = $$5.get().a($$1.A);
               return new hwr($$6.orElse(null), $$4);
            } else if (!this.au.b(ayx.f) && (!this.t.bq() || !$$2.a(azn.Z))) {
               return $$1.aj() != dmu.j && this.t.gt().d && this.t.gt().c ? new hwr(ayx.b, $$4) : new hwr(ayx.g, $$4);
            } else {
               return new hwr(ayx.f, $$4);
            }
         }
      }
   }

   public MinecraftSessionService an() {
      return this.aA;
   }

   public hsu ao() {
      return this.aD;
   }

   @Nullable
   public bzm ap() {
      return this.u;
   }

   public void a(bzm $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bzm $$0) {
      return $$0.cr() || this.t != null && this.t.am() && this.n.Q.e() && $$0.ap() == bzv.bU;
   }

   @Override
   protected Thread ay() {
      return this.bd;
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gys aq() {
      return this.aF;
   }

   public hec ar() {
      return this.W;
   }

   public hab as() {
      return this.aO;
   }

   public hfd at() {
      return this.Y;
   }

   public gxk au() {
      return this.Z;
   }

   public DataFixer av() {
      return this.R;
   }

   public ftu aw() {
      return this.U;
   }

   public fvi az() {
      return this.aq;
   }

   public boolean aA() {
      return this.t != null && this.t.gK() || this.n.Z().c();
   }

   public gad aB() {
      return this.aL;
   }

   public hxz aC() {
      return this.aM;
   }

   public boolean aD() {
      return this.bj;
   }

   public ftz aE() {
      return this.ac;
   }

   public huh aF() {
      return this.aE;
   }

   public hss aG() {
      return this.aG;
   }

   public hsr aH() {
      return this.aH;
   }

   public hsq aI() {
      return this.aI;
   }

   public fxc aJ() {
      return this.aJ;
   }

   public hsy aK() {
      return this.aK;
   }

   @Override
   public void a(boolean $$0) {
      this.bj = $$0;
   }

   public xo a(File $$0) {
      int $$1 = 4;
      int $$2 = 4096;
      int $$3 = 4096;
      int $$4 = this.T.k();
      int $$5 = this.T.l();
      fmr $$6 = this.h();
      float $$7 = this.t.dR();
      float $$8 = this.t.dP();
      float $$9 = this.t.ab;
      float $$10 = this.t.aa;
      this.j.a(false);

      yc var13;
      try {
         this.j.b(true);
         this.T.b(4096);
         this.T.c(4096);
         $$6.a(4096, 4096);

         for (int $$11 = 0; $$11 < 6; $$11++) {
            switch ($$11) {
               case 0:
                  this.t.v($$8);
                  this.t.w(0.0F);
                  break;
               case 1:
                  this.t.v(($$8 + 90.0F) % 360.0F);
                  this.t.w(0.0F);
                  break;
               case 2:
                  this.t.v(($$8 + 180.0F) % 360.0F);
                  this.t.w(0.0F);
                  break;
               case 3:
                  this.t.v(($$8 - 90.0F) % 360.0F);
                  this.t.w(0.0F);
                  break;
               case 4:
                  this.t.v($$8);
                  this.t.w(-90.0F);
                  break;
               case 5:
               default:
                  this.t.v($$8);
                  this.t.w(90.0F);
            }

            this.t.aa = this.t.dP();
            this.t.ab = this.t.dR();
            this.j.a(ftu.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var18) {
            }

            fum.a($$0, "panorama_" + $$11 + ".png", $$6, 4, $$0x -> {});
         }

         xo $$12 = xo.b($$0.getName()).a(o.t).a($$1x -> $$1x.a(new xm.e($$0.getAbsoluteFile())));
         return xo.a("screenshot.success", $$12);
      } catch (Exception var19) {
         G.error("Couldn't save image", var19);
         var13 = xo.a("screenshot.failure", var19.getMessage());
      } finally {
         this.t.w($$7);
         this.t.v($$8);
         this.t.ab = $$9;
         this.t.aa = $$10;
         this.j.a(true);
         this.T.b($$4);
         this.T.c($$5);
         $$6.a($$4, $$5);
         this.j.b(false);
      }

      return var13;
   }

   @Nullable
   public aup aL() {
      return this.ab.get();
   }

   public hsv aM() {
      return this.aw;
   }

   @Nullable
   public gen aN() {
      return this.bb;
   }

   public gkc aO() {
      return this.aN;
   }

   public fni aP() {
      return this.T;
   }

   public fmy aQ() {
      return this.bi;
   }

   public fxw aR() {
      return this.m.l();
   }

   public gxw aS() {
      return this.V;
   }

   public void a(int $$0) {
      this.aE.a($$0);
   }

   public gqj aT() {
      return this.aE.d().get();
   }

   public boolean aU() {
      return this.bv().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aV() {
      this.aN.a();
      this.w().a();
   }

   @Nullable
   public bcq aW() {
      return bcq.a(this.az.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.az.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fub aY() {
      return this.ad;
   }

   public void a(fub $$0) {
      this.ad = $$0;
   }

   public ftv aZ() {
      return this.bu;
   }

   public gse ba() {
      return this.bv;
   }

   public gst bb() {
      return this.bw;
   }

   public fra bc() {
      return this.aR;
   }

   public gwq bd() {
      return this.aS;
   }

   public ftr be() {
      return this.bx;
   }

   public fii bf() {
      return this.by;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bxt $$1 = this.s.v();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   public hof bg() {
      return this.X;
   }

   @Nullable
   public static String bh() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(xn.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xo.c("chat.disabled.options").a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xo.c("chat.disabled.launcher").a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xo.a("chat.disabled.profile", xo.d(fue.F.n.I.h())).a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xo e = xo.c("chat.disabled.profile.moreInfo");
      private final xo f;

      a(final xo $$0) {
         this.f = $$0;
      }

      public xo a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   record b(foq a, glm.c b) {
   }
}
