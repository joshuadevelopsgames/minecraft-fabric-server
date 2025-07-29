import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frt extends hyg {
   static final Logger c = LogUtils.getLogger();
   private static final xo G = xo.c("mco.selectServer.create");
   private static final xo H = xo.c("mco.selectServer.create.subtitle");
   private static final xo I = xo.c("mco.configure.world.switch.slot");
   private static final xo J = xo.c("mco.configure.world.switch.slot.subtitle");
   private static final xo K = xo.c("mco.reset.world.generate");
   private static final xo L = xo.c("mco.reset.world.title");
   private static final xo M = xo.c("mco.reset.world.warning");
   public static final xo a = xo.c("mco.create.world.reset.title");
   private static final xo N = xo.c("mco.reset.world.resetting.screen.title");
   private static final xo O = xo.c("mco.reset.world.template");
   private static final xo P = xo.c("mco.reset.world.adventure");
   private static final xo Q = xo.c("mco.reset.world.experience");
   private static final xo R = xo.c("mco.reset.world.inspiration");
   private final get S;
   private final fpx T;
   private final xo U;
   private final int V;
   private final xo W;
   private static final ame X = ame.b("textures/gui/realms/upload.png");
   private static final ame Y = ame.b("textures/gui/realms/adventure.png");
   private static final ame Z = ame.b("textures/gui/realms/survival_spawn.png");
   private static final ame aa = ame.b("textures/gui/realms/new_world.png");
   private static final ame ab = ame.b("textures/gui/realms/experience.png");
   private static final ame ac = ame.b("textures/gui/realms/inspiration.png");
   fqt ad;
   fqt ae;
   fqt af;
   fqt ag;
   public final int b;
   @Nullable
   private final fte ah;
   private final Runnable ai;
   private final gbk aj = new gbk(this);

   private frt(get $$0, fpx $$1, int $$2, xo $$3, xo $$4, int $$5, xo $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public frt(get $$0, fpx $$1, int $$2, xo $$3, xo $$4, int $$5, xo $$6, @Nullable fte $$7, Runnable $$8) {
      super($$3);
      this.S = $$0;
      this.T = $$1;
      this.b = $$2;
      this.U = $$4;
      this.V = $$5;
      this.W = $$6;
      this.ah = $$7;
      this.ai = $$8;
   }

   public static frt a(get $$0, fpx $$1, fte $$2, Runnable $$3) {
      return new frt($$0, $$1, $$1.q, G, H, -6250336, a, $$2, $$3);
   }

   public static frt a(get $$0, int $$1, fpx $$2, Runnable $$3) {
      return new frt($$0, $$2, $$1, I, J, -6250336, a, $$3);
   }

   public static frt a(get $$0, fpx $$1, Runnable $$2) {
      return new frt($$0, $$1, $$1.q, L, M, -65536, N, $$2);
   }

   @Override
   public void aV_() {
      gbo $$0 = this.aj.a(gbo.d());
      $$0.c().a(9 / 3);
      $$0.a(new fyx(this.m, this.q), gbn::b);
      $$0.a(new fyx(this.U, this.q).b(this.V), gbn::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            foq $$0x = foq.a();

            try {
               fqt $$1 = $$0x.a(1, 10, fpx.d.a);
               fqt $$2 = $$0x.a(1, 10, fpx.d.c);
               fqt $$3 = $$0x.a(1, 10, fpx.d.d);
               fqt $$4 = $$0x.a(1, 10, fpx.d.e);
               frt.this.n.execute(() -> {
                  frt.this.ad = $$1;
                  frt.this.ae = $$2;
                  frt.this.af = $$3;
                  frt.this.ag = $$4;
               });
            } catch (fqx var6) {
               frt.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      gbj $$1 = this.aj.c(new gbj());
      gbj.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new frt.a(this.n.h, K, aa, $$0x -> fox.a(this.n, this.S, this, this.b, this.T, this.ah)));
      $$2.a(new frt.a(this.n.h, fru.a, X, $$0x -> this.n.a(new fru(this.ah, this.T.b, this.b, this))));
      $$2.a(new frt.a(this.n.h, O, Z, $$0x -> this.n.a(new frv(O, this::a, fpx.d.a, this.ad))));
      $$2.a(gbp.b(16), 3);
      $$2.a(new frt.a(this.n.h, P, Y, $$0x -> this.n.a(new frv(P, this::a, fpx.d.c, this.ae))));
      $$2.a(new frt.a(this.n.h, Q, ab, $$0x -> this.n.a(new frv(Q, this::a, fpx.d.d, this.af))));
      $$2.a(new frt.a(this.n.h, R, ac, $$0x -> this.n.a(new frv(R, this::a, fpx.d.e, this.ag))));
      this.aj.b(fxo.a(xn.k, $$0x -> this.aP_()).a());
      this.aj.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.aj.a();
   }

   @Override
   public xo i() {
      return xn.a(this.o(), this.U);
   }

   @Override
   public void aP_() {
      this.n.a(this.S);
   }

   private void a(@Nullable fqs $$0) {
      this.n.a(this);
      if ($$0 != null) {
         this.a(new ftf($$0, this.T.b, this.W, this.ai));
      }

      fol.g();
   }

   private void a(ftc $$0) {
      List<ftc> $$1 = new ArrayList<>();
      if (this.ah != null) {
         $$1.add(this.ah);
      }

      if (this.b != this.T.q) {
         $$1.add(new ftj(this.T.b, this.b, () -> {}));
      }

      $$1.add($$0);
      this.n.a(new fro(this.S, $$1.toArray(new ftc[0])));
   }

   class a extends fxo {
      private static final ame b = ame.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ame v;

      a(final fwz $$0, final xo $$1, final ame $$2, final fxo.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.C();
         int $$5 = -1;
         if ($$4) {
            $$5 = baj.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.E();
         int $$7 = this.F();
         $$0.a(gxx.ar, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gxx.ar, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(frt.this.q, this.A(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
