import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gig extends fyl<gig.a> {
   static final ame a = ame.b("server_list/incompatible");
   static final ame m = ame.b("server_list/unreachable");
   static final ame n = ame.b("server_list/ping_1");
   static final ame o = ame.b("server_list/ping_2");
   static final ame p = ame.b("server_list/ping_3");
   static final ame q = ame.b("server_list/ping_4");
   static final ame r = ame.b("server_list/ping_5");
   static final ame s = ame.b("server_list/pinging_1");
   static final ame u = ame.b("server_list/pinging_2");
   static final ame v = ame.b("server_list/pinging_3");
   static final ame w = ame.b("server_list/pinging_4");
   static final ame x = ame.b("server_list/pinging_5");
   static final ame y = ame.b("server_list/join_highlighted");
   static final ame z = ame.b("server_list/join");
   static final ame A = ame.b("server_list/move_up_highlighted");
   static final ame B = ame.b("server_list/move_up");
   static final ame C = ame.b("server_list/move_down_highlighted");
   static final ame D = ame.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new s(E)).build()
   );
   static final xo G = xo.c("lanServer.scanning");
   static final xo H = xo.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xo I = xo.c("multiplayer.status.cannot_connect").b(-65536);
   static final xo J = xo.c("multiplayer.status.incompatible");
   static final xo K = xo.c("multiplayer.status.no_connection");
   static final xo L = xo.c("multiplayer.status.pinging");
   static final xo M = xo.c("multiplayer.status.online");
   private final gid N;
   private final List<gig.d> O = Lists.newArrayList();
   private final gig.a P = new gig.b();
   private final List<gig.c> Q = Lists.newArrayList();

   public gig(gid $$0, fue $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void K() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable gig.a $$0) {
      super.a($$0);
      this.N.m();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      gig.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gsa $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new gig.d(this.N, $$0.a($$1)));
      }

      this.K();
   }

   public void a(List<hwg> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hwg $$2 : $$0) {
         this.Q.add(new gig.c(this.N, $$2));
      }

      this.K();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         gig.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aH_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.F() && $$6 <= this.H()) {
            this.c.aZ().c(xo.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fyl.a<gig.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gig.a {
      private final fue a = fue.R();

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, gig.G, this.a.z.o / 2 - this.a.h.a(gig.G) / 2, $$10, -1);
         String $$11 = gei.a(ag.c());
         $$0.b(this.a.h, $$11, this.a.z.o / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public xo a() {
         return gig.G;
      }
   }

   public static class c extends gig.a {
      private static final int c = 32;
      private static final xo d = xo.c("lanServer.title");
      private static final xo e = xo.c("selectServer.hiddenAddress");
      private final gid f;
      protected final fue a;
      protected final hwg b;
      private long g;

      protected c(gid $$0, hwg $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fue.R();
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(this.a.h, d, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.a.h, this.b.a(), $$3 + 32 + 3, $$2 + 12, -8355712);
         if (this.a.n.l) {
            $$0.b(this.a.h, e, $$3 + 32 + 3, $$2 + 12 + 11, -13619152);
         } else {
            $$0.b(this.a.h, this.b.b(), $$3 + 32 + 3, $$2 + 12 + 11, -13619152);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a(this);
         if (ag.c() - this.g < 250L) {
            this.f.l();
         }

         this.g = ag.c();
         return super.a($$0, $$1, $$2);
      }

      public hwg b() {
         return this.b;
      }

      @Override
      public xo a() {
         return xo.a("narrator.select", this.c());
      }

      public xo c() {
         return xo.i().b(d).b(xn.w).f(this.b.a());
      }
   }

   public class d extends gig.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final gid g;
      private final fue h;
      private final grz i;
      private final ged j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xo> m;
      @Nullable
      private ame n;
      @Nullable
      private xo o;

      protected d(final gid $$1, final grz $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fue.R();
         this.j = ged.b(this.h.ab(), $$2.b);
         this.d();
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == grz.b.a) {
            this.i.a(grz.b.b);
            this.i.d = xn.a;
            this.i.c = xn.a;
            gig.F.submit(() -> {
               try {
                  this.g.n().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ac.b().d() ? grz.b.e : grz.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(grz.b.c);
                  this.i.d = gig.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(grz.b.c);
                  this.i.d = gig.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<bbm> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == grz.b.b) {
            int $$12 = (int)(ag.c() / 100L + $$1 * 2 & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> gig.u;
               case 2 -> gig.v;
               case 3 -> gig.w;
               case 4 -> gig.x;
               default -> gig.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gxx.ar, this.n, $$13, $$2, 10, 8);
         }

         byte[] $$14 = this.i.c();
         if (!Arrays.equals($$14, this.k)) {
            if (this.a($$14)) {
               this.k = $$14;
            } else {
               this.i.a(null);
               this.b();
            }
         }

         xo $$15 = (xo)(this.i.g() == grz.b.d ? this.i.h.f().a(o.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            $$0.a(this.o, $$6, $$7);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            $$0.a(Lists.transform(this.m, xo::g), $$6, $$7);
         }

         if (this.h.n.ad().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gxx.ar, gig.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gxx.ar, gig.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gxx.ar, gig.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gxx.ar, gig.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.E().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gxx.ar, gig.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gxx.ar, gig.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = gig.n;
               this.o = gig.L;
               break;
            case d:
               this.n = gig.a;
               this.o = gig.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = gig.m;
               this.o = gig.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = gig.r;
               } else if (this.i.f < 300L) {
                  this.n = gig.q;
               } else if (this.i.f < 600L) {
                  this.n = gig.p;
               } else if (this.i.f < 1000L) {
                  this.n = gig.o;
               } else {
                  this.n = gig.n;
               }

               this.o = xo.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.E().b();
      }

      protected void a(fxb $$0, int $$1, int $$2, ame $$3) {
         $$0.a(gxx.ar, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fnf.a($$0));
            } catch (Throwable var3) {
               gig.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (get.t()) {
            gig $$3 = this.g.e;
            int $$4 = $$3.aH_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.E().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.E().a($$0, $$1);
         this.g.e.a(this.g.E());
         gig.a $$2 = this.g.e.aH_().get($$1);
         this.g.e.a($$2);
         gig.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - gig.this.u();
         double $$4 = $$1 - gig.this.d(gig.this.aH_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.l();
               return true;
            }

            int $$5 = this.g.e.aH_().indexOf(this);
            if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
               this.a($$5, $$5 - 1);
               return true;
            }

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.E().c() - 1) {
               this.a($$5, $$5 + 1);
               return true;
            }
         }

         this.g.a(this);
         if (ag.c() - this.l < 250L) {
            this.g.l();
         }

         this.l = ag.c();
         return super.a($$0, $$1, $$2);
      }

      public grz c() {
         return this.i;
      }

      @Override
      public xo a() {
         yc $$0 = xo.i();
         $$0.b(xo.a("narrator.select", this.i.a));
         $$0.b(xn.u);
         switch (this.i.g()) {
            case b:
               $$0.b(gig.L);
               break;
            case d:
               $$0.b(gig.J);
               $$0.b(xn.u);
               $$0.b(xo.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xn.u);
               $$0.b(xo.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(gig.K);
               break;
            default:
               $$0.b(gig.M);
               $$0.b(xn.u);
               $$0.b(xo.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xn.u);
               $$0.b(xo.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xn.u);
                  $$0.b(xo.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xn.u);
                  $$0.b(xr.a(this.i.i, xo.b(", ")));
               }
         }

         return $$0;
      }

      @Override
      public void close() {
         this.j.close();
      }
   }
}
