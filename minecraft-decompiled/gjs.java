import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gjs<B extends gsp.a<?>> extends get {
   private static final xo B = xo.c("gui.abuseReport.report_sent_msg");
   private static final xo C = xo.c("gui.abuseReport.sending.title").a(o.r);
   private static final xo D = xo.c("gui.abuseReport.sent.title").a(o.r);
   private static final xo E = xo.c("gui.abuseReport.error.title").a(o.r);
   private static final xo F = xo.c("gui.abuseReport.send.generic_error");
   protected static final xo a = xo.c("gui.abuseReport.send");
   protected static final xo b = xo.c("gui.abuseReport.observed_what");
   protected static final xo c = xo.c("gui.abuseReport.select_reason");
   private static final xo G = xo.c("gui.abuseReport.describe");
   protected static final xo d = xo.c("gui.abuseReport.more_comments");
   private static final xo H = xo.c("gui.abuseReport.comments");
   private static final xo I = xo.c("gui.abuseReport.attestation");
   protected static final int e = 120;
   protected static final int f = 20;
   protected static final int u = 280;
   protected static final int v = 8;
   private static final Logger J = LogUtils.getLogger();
   protected final get w;
   protected final gst x;
   protected final gbo y = gbo.d().a(8);
   protected B z;
   private fxq K;
   protected fxo A;

   protected gjs(xo $$0, get $$1, gst $$2, B $$3) {
      super($$0);
      this.w = $$1;
      this.x = $$2;
      this.z = $$3;
   }

   protected fyh a(int $$0, int $$1, Consumer<String> $$2) {
      AbuseReportLimits $$3 = this.x.a().b();
      fyh $$4 = fyh.r().a(G).a(this.q, $$0, $$1, H);
      $$4.a(this.z.g());
      $$4.a($$3.maxOpinionCommentsLength());
      $$4.b($$2);
      return $$4;
   }

   @Override
   protected void aV_() {
      this.y.c().b();
      this.l();
      this.m();
      this.n();
      this.E();
      this.y.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   protected void l() {
      this.y.a(new fyx(this.m, this.q));
   }

   protected abstract void m();

   protected void n() {
      this.K = this.y.a(fxq.a(I, this.q).a(this.z.h()).a(280).a(($$0x, $$1) -> {
         this.z.a($$1);
         this.E();
      }).a());
      gbo $$0 = this.y.a(gbo.e().a(8));
      $$0.a(fxo.a(xn.k, $$0x -> this.aP_()).a(120).a());
      this.A = $$0.a(fxo.a(a, $$0x -> this.F()).a(120).a());
   }

   protected void E() {
      gsp.b $$0 = this.z.c();
      this.A.j = $$0 == null && this.K.a();
      this.A.a(y.a($$0, gsp.b::a));
   }

   @Override
   protected void c() {
      this.y.a();
      gbi.a(this.y, this.I());
   }

   protected void F() {
      this.z.a(this.x).ifLeft($$0 -> {
         CompletableFuture<?> $$1 = this.x.a().a($$0.a(), $$0.b(), $$0.c());
         this.n.a(gef.a(C, xn.e, () -> {
            this.n.a(this);
            $$1.cancel(true);
         }));
         $$1.handleAsync(($$0x, $$1x) -> {
            if ($$1x == null) {
               this.G();
            } else {
               if ($$1x instanceof CancellationException) {
                  return null;
               }

               this.a($$1x);
            }

            return null;
         }, this.n);
      }).ifRight($$0 -> this.a($$0.b()));
   }

   private void G() {
      this.K();
      this.n.a(gef.a(D, B, xn.d, () -> this.n.a(null)));
   }

   private void a(Throwable $$0) {
      J.error("Encountered error while sending abuse report", $$0);
      xo $$2;
      if ($$0.getCause() instanceof yo $$1) {
         $$2 = $$1.a();
      } else {
         $$2 = F;
      }

      this.a($$2);
   }

   private void a(xo $$0) {
      xo $$1 = $$0.f().a(o.m);
      this.n.a(gef.a(E, $$1, xn.k, () -> this.n.a(this)));
   }

   void H() {
      if (this.z.b()) {
         this.x.a(this.z.e().b());
      }
   }

   void K() {
      this.x.a(null);
   }

   @Override
   public void aP_() {
      if (this.z.b()) {
         this.n.a(new gjs.a());
      } else {
         this.n.a(this.w);
      }
   }

   @Override
   public void aI_() {
      this.H();
      super.aI_();
   }

   class a extends gih {
      private static final xo c = xo.c("gui.abuseReport.discard.title").a(o.r);
      private static final xo d = xo.c("gui.abuseReport.discard.content");
      private static final xo e = xo.c("gui.abuseReport.discard.return");
      private static final xo f = xo.c("gui.abuseReport.discard.draft");
      private static final xo u = xo.c("gui.abuseReport.discard.discard");

      protected a() {
         super(c, d, d);
      }

      @Override
      protected gbl l() {
         gbo $$0 = gbo.d().a(8);
         $$0.c().b();
         gbo $$1 = $$0.a(gbo.e().a(8));
         $$1.a(fxo.a(e, $$0x -> this.aP_()).a());
         $$1.a(fxo.a(f, $$0x -> {
            gjs.this.H();
            this.n.a(gjs.this.w);
         }).a());
         $$0.a(fxo.a(u, $$0x -> {
            gjs.this.K();
            this.n.a(gjs.this.w);
         }).a());
         return $$0;
      }

      @Override
      public void aP_() {
         this.n.a(gjs.this);
      }

      @Override
      public boolean aG_() {
         return false;
      }
   }
}
