import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public class frx extends hyg implements fpf {
   private static final int b = 200;
   private static final int c = 80;
   private static final int G = 95;
   private static final int H = 1;
   private static final String[] I = new String[]{"", ".", ". .", ". . ."};
   private static final xo J = xo.c("mco.upload.verifying");
   private final frt K;
   private final fct L;
   @Nullable
   private final fte M;
   private final long N;
   private final int O;
   final AtomicReference<fpe> a = new AtomicReference<>();
   private final fov P;
   private final RateLimiter Q;
   @Nullable
   private volatile xo[] R;
   private volatile xo S = xo.c("mco.upload.preparing");
   @Nullable
   private volatile String T;
   private volatile boolean U;
   private volatile boolean V;
   private volatile boolean W = true;
   private volatile boolean X;
   @Nullable
   private fxo Y;
   @Nullable
   private fxo Z;
   private int aa;
   private final gbk ab = new gbk(this);

   public frx(@Nullable fte $$0, long $$1, int $$2, frt $$3, fct $$4) {
      super(ftv.a);
      this.M = $$0;
      this.N = $$1;
      this.O = $$2;
      this.K = $$3;
      this.L = $$4;
      this.P = new fov();
      this.Q = RateLimiter.create(0.1F);
   }

   @Override
   public void aV_() {
      this.Y = this.ab.b(fxo.a(xn.k, $$0x -> this.l()).a());
      this.Y.k = false;
      this.Z = this.ab.b(fxo.a(xn.e, $$0x -> this.m()).a());
      if (!this.X) {
         if (this.K.b == -1) {
            this.X = true;
            this.G();
         } else {
            List<ftc> $$0 = new ArrayList<>();
            if (this.M != null) {
               $$0.add(this.M);
            }

            $$0.add(new ftj(this.N, this.K.b, () -> {
               if (!this.X) {
                  this.X = true;
                  this.n.execute(() -> {
                     this.n.a(this);
                     this.G();
                  });
               }
            }));
            this.n.a(new fro(this.K, $$0.toArray(new ftc[0])));
         }
      }

      this.ab.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ab.a();
   }

   private void l() {
      this.n.a(new fsc(new fol(new gev()), this.N));
   }

   private void m() {
      this.U = true;
      fpe $$0 = this.a.get();
      if ($$0 != null) {
         $$0.b();
      } else {
         this.n.a(this.K);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.W) {
            this.m();
         } else {
            this.l();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.V && this.P.c() && this.P.d() && this.Z != null) {
         this.S = J;
         this.Z.j = false;
      }

      $$0.a(this.q, this.S, this.o / 2, 50, -1);
      if (this.W) {
         $$0.b(this.q, I[this.aa / 10 % I.length], this.o / 2 + this.q.a(this.S) / 2 + 5, 50, -1);
      }

      if (this.P.c() && !this.U) {
         this.d($$0);
         this.e($$0);
      }

      xo[] $$4 = this.R;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.q, $$4[$$5], this.o / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void d(fxb $$0) {
      double $$1 = this.P.e();
      this.T = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.o - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.q, xo.a("mco.upload.percent", this.T), this.o / 2, 84, -1);
   }

   private void e(fxb $$0) {
      this.a($$0, this.P.g());
   }

   private void a(fxb $$0, long $$1) {
      String $$2 = this.T;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.q.b($$2);
         String $$4 = "(" + fom.b($$1) + "/s)";
         $$0.b(this.q, $$4, this.o / 2 + $$3 / 2 + 15, 84, -1);
      }
   }

   @Override
   public void e() {
      super.e();
      this.aa++;
      this.P.f();
      if (this.Q.tryAcquire(1)) {
         xo $$0 = this.n();
         this.n.aZ().d($$0);
      }
   }

   private xo n() {
      List<xo> $$0 = Lists.newArrayList();
      $$0.add(this.S);
      if (this.T != null) {
         $$0.add(xo.a("mco.upload.percent", this.T));
      }

      xo[] $$1 = this.R;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return xn.a($$0);
   }

   private void G() {
      Path $$0 = this.n.q.toPath().resolve("saves").resolve(this.L.a());
      fqe $$1 = fqe.a(this.L.g(), true, this.L.l().c());
      fqb $$2 = new fqb(this.O, $$1, List.of(fqa.a(this.L.g().c())));
      fpe $$3 = new fpe($$0, $$2, this.n.Y(), this.N, this);
      if (!this.a.compareAndSet(null, $$3)) {
         throw new IllegalStateException("Tried to start uploading but was already uploading");
      } else {
         $$3.a().handleAsync(($$0x, $$1x) -> {
            if ($$1x != null) {
               if ($$1x instanceof CompletionException $$2x) {
                  $$1x = $$2x.getCause();
               }

               if ($$1x instanceof foz $$3x) {
                  if ($$3x.a() != null) {
                     this.S = $$3x.a();
                  }

                  this.a($$3x.b());
               } else {
                  this.S = xo.a("mco.upload.failed", $$1x.getMessage());
               }
            } else {
               this.S = xo.c("mco.upload.done");
               if (this.Y != null) {
                  this.Y.b(xn.d);
               }
            }

            this.V = true;
            this.W = false;
            if (this.Y != null) {
               this.Y.k = true;
            }

            if (this.Z != null) {
               this.Z.k = false;
            }

            this.a.set(null);
            return null;
         }, this.n);
      }
   }

   private void a(@Nullable xo... $$0) {
      this.R = $$0;
   }

   @Override
   public fov b() {
      return this.P;
   }

   @Override
   public void d() {
      this.S = xo.a("mco.upload.uploading", this.L.b());
   }
}
