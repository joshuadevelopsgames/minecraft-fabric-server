import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gds extends get {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long e = 2000L;
   public static final xo a = xo.c("connect.aborted");
   public static final xo b = xo.a("disconnect.genericReason", xo.c("disconnect.unknownHost"));
   @Nullable
   volatile wd f;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final get w;
   private xo x = xo.c("connect.connecting");
   private long y = -1L;
   final xo z;

   private gds(get $$0, xo $$1) {
      super(ftv.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(get $$0, fue $$1, gtc $$2, grz $$3, boolean $$4, @Nullable gsd $$5) {
      if ($$1.z instanceof gds) {
         d.error("Attempt to connect while already connecting");
      } else {
         xo $$6;
         if ($$5 != null) {
            $$6 = xn.r;
         } else if ($$4) {
            $$6 = gwp.a;
         } else {
            $$6 = xn.s;
         }

         gds $$9 = new gds($$0, $$6);
         if ($$5 != null) {
            $$9.a(xo.c("connect.transferring"));
         }

         $$1.z();
         $$1.aV();
         $$1.a(gsq.a($$3.b));
         $$1.bd().a(gwq.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fue $$0, final gtc $$1, final grz $$2, @Nullable final gsd $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0x = null;

            try {
               if (gds.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1x = gte.a.a($$1).map(gtb::d);
               if (gds.this.v) {
                  return;
               }

               if ($$1x.isEmpty()) {
                  $$0.execute(() -> $$0.a(new gea(gds.this.w, gds.this.z, gds.b)));
                  return;
               }

               $$0x = $$1x.get();
               wd $$2x;
               synchronized (gds.this) {
                  if (gds.this.v) {
                     return;
                  }

                  $$2x = new wd(zx.b);
                  $$2x.a($$0.aR().n());
                  gds.this.u = wd.a($$0x, $$0.n.aG(), $$2x);
               }

               gds.this.u.syncUninterruptibly();
               synchronized (gds.this) {
                  if (gds.this.v) {
                     $$2x.a(gds.a);
                     return;
                  }

                  gds.this.f = $$2x;
                  $$0.ag().a($$2x, a($$2.b()));
               }

               gds.this.f
                  .a($$0x.getHostName(), $$0x.getPort(), akg.b, akg.d, new grj(gds.this.f, $$0, $$2, gds.this.w, false, null, gds.this::a, $$3), $$3 != null);
               gds.this.f.a(new akj($$0.Y().c(), $$0.Y().b()));
            } catch (Exception var9) {
               if (gds.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               gds.d.error("Couldn't connect to server", var9);
               String $$8 = $$0x == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0x.getHostName() + ":" + $$0x.getPort(), "").replaceAll($$0x.toString(), "");
               $$0.execute(() -> $$0.a(new gea(gds.this.w, gds.this.z, xo.a("disconnect.genericReason", $$8))));
            }
         }

         private static huw.c a(grz.a $$0x) {
            return switch ($$0) {
               case a -> huw.c.b;
               case b -> huw.c.c;
               case c -> huw.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new s(d));
      $$4.start();
   }

   private void a(xo $$0) {
      this.x = $$0;
   }

   @Override
   public void e() {
      if (this.f != null) {
         if (this.f.i()) {
            this.f.b();
         } else {
            this.f.n();
         }
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aV_() {
      this.c(fxo.a(xn.e, $$0 -> {
         synchronized (this) {
            this.v = true;
            if (this.u != null) {
               this.u.cancel(true);
               this.u = null;
            }

            if (this.f != null) {
               this.f.a(a);
            }
         }

         this.n.a(this.w);
      }).a(this.o / 2 - 100, this.p / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ag.c();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.n.aZ().d(xo.c("narrator.joining"));
      }

      $$0.a(this.q, this.x, this.o / 2, this.p / 2 - 50, -1);
   }
}
