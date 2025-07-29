import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frl extends hyg {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int G = 80;
   private static final int H = 95;
   private static final int I = 1;
   private final get J;
   private final fqr K;
   private final xo L;
   private final RateLimiter M;
   private fxo N;
   private final String O;
   private final frl.a P;
   @Nullable
   private volatile xo Q;
   private volatile xo R = xo.c("mco.download.preparing");
   @Nullable
   private volatile String S;
   private volatile boolean T;
   private volatile boolean U = true;
   private volatile boolean V;
   private volatile boolean W;
   @Nullable
   private Long X;
   @Nullable
   private Long Y;
   private long Z;
   private int aa;
   private static final String[] ab = new String[]{"", ".", ". .", ". . ."};
   private int ac;
   private boolean ad;
   private final BooleanConsumer ae;

   public frl(get $$0, fqr $$1, String $$2, BooleanConsumer $$3) {
      super(ftv.a);
      this.ae = $$3;
      this.J = $$0;
      this.O = $$2;
      this.K = $$1;
      this.P = new frl.a();
      this.L = xo.c("mco.download.title");
      this.M = RateLimiter.create(0.1F);
   }

   @Override
   public void aV_() {
      this.N = this.c(fxo.a(xn.e, $$0 -> this.aP_()).a((this.o - 200) / 2, this.p - 42, 200, 20).a());
      this.l();
   }

   private void l() {
      if (!this.V && !this.ad) {
         this.ad = true;
         if (this.a(this.K.a) >= 5368709120L) {
            xo $$0 = xo.a("mco.download.confirmation.oversized", fom.b(5368709120L));
            this.n.a(frs.c(this, $$0, $$0x -> {
               this.n.a(this);
               this.n();
            }));
         } else {
            this.n();
         }
      }
   }

   private long a(String $$0) {
      fon $$1 = new fon();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.aa++;
      if (this.R != null && this.M.tryAcquire(1)) {
         xo $$0 = this.m();
         this.n.aZ().d($$0);
      }
   }

   private xo m() {
      List<xo> $$0 = Lists.newArrayList();
      $$0.add(this.L);
      $$0.add(this.R);
      if (this.S != null) {
         $$0.add(xo.a("mco.download.percent", this.S));
         $$0.add(xo.a("mco.download.speed.narration", fom.b(this.Z)));
      }

      if (this.Q != null) {
         $$0.add(this.Q);
      }

      return xn.a($$0);
   }

   @Override
   public void aP_() {
      this.T = true;
      if (this.V && this.ae != null && this.Q == null) {
         this.ae.accept(true);
      }

      this.n.a(this.J);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.L, this.o / 2, 20, -1);
      $$0.a(this.q, this.R, this.o / 2, 50, -1);
      if (this.U) {
         this.d($$0);
      }

      if (this.P.a != 0L && !this.T) {
         this.e($$0);
         this.f($$0);
      }

      if (this.Q != null) {
         $$0.a(this.q, this.Q, this.o / 2, 110, -65536);
      }
   }

   private void d(fxb $$0) {
      int $$1 = this.q.a(this.R);
      if (this.aa != 0 && this.aa % 10 == 0) {
         this.ac++;
      }

      $$0.b(this.q, ab[this.ac % ab.length], this.o / 2 + $$1 / 2 + 5, 50, -1);
   }

   private void e(fxb $$0) {
      double $$1 = Math.min((double)this.P.a / this.P.b, 1.0);
      this.S = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.o - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.q, xo.a("mco.download.percent", this.S), this.o / 2, 84, -1);
   }

   private void f(fxb $$0) {
      if (this.aa % 20 == 0) {
         if (this.X != null) {
            long $$1 = ag.c() - this.Y;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.Z = 1000L * (this.P.a - this.X) / $$1;
            this.a($$0, this.Z);
         }

         this.X = this.P.a;
         this.Y = ag.c();
      } else {
         this.a($$0, this.Z);
      }
   }

   private void a(fxb $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.q.b(this.S);
         $$0.b(this.q, xo.a("mco.download.speed", fom.b($$1)), this.o / 2 + $$2 / 2 + 15, 84, -1);
      }
   }

   private void n() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.R = xo.c("mco.download.failed");
                  return;
               }

               if (this.T) {
                  this.G();
                  return;
               }

               this.R = xo.a("mco.download.downloading", this.O);
               fon $$0 = new fon();
               $$0.a(this.K.a);
               $$0.a(this.K, this.O, this.P, this.n.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.Q = xo.c("mco.download.failed");
                     this.N.b(xn.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.W) {
                        this.R = xo.c("mco.download.extracting");
                     }

                     this.W = true;
                  }

                  if (this.T) {
                     $$0.a();
                     this.G();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.V = true;
               this.R = xo.c("mco.download.done");
               this.N.b(xn.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.Q = xo.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.U = false;
               this.V = true;
            }
         }
      }).start();
   }

   private void G() {
      this.R = xo.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
