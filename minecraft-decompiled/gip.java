import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gip extends get {
   private static final xo a = xo.c("options.title");
   private static final xo b = xo.c("options.skinCustomisation");
   private static final xo c = xo.c("options.sounds");
   private static final xo d = xo.c("options.video");
   private static final xo e = xo.c("options.controls");
   private static final xo f = xo.c("options.language");
   private static final xo u = xo.c("options.chat");
   private static final xo v = xo.c("options.resourcepack");
   private static final xo w = xo.c("options.accessibility");
   private static final xo x = xo.c("options.telemetry");
   private static final fzb y = fzb.a(xo.c("options.telemetry.disabled"));
   private static final xo z = xo.c("options.credits_and_attribution");
   private static final int A = 2;
   private final gbk B = new gbk(this, 61, 33);
   private final get C;
   private final fui D;
   @Nullable
   private fxv<bxg> E;
   @Nullable
   private fyf F;

   public gip(get $$0, fui $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aV_() {
      gbo $$0 = this.B.a(gbo.d().a(8));
      $$0.a(new fyx(a, this.q), gbn::b);
      gbo $$1 = $$0.a(gbo.e()).a(8);
      $$1.a(this.D.al().a(this.n.n));
      $$1.a(this.l());
      gbj $$2 = new gbj();
      $$2.c().f(4).e(4).b();
      gbj.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gir(this, this.D)));
      $$3.a(this.a(c, () -> new gis(this, this.D)));
      $$3.a(this.a(d, () -> new giu(this, this.n, this.D)));
      $$3.a(this.a(e, () -> new giv(this, this.D)));
      $$3.a(this.a(f, () -> new gim(this, this.D, this.n.ai())));
      $$3.a(this.a(u, () -> new gik(this, this.D)));
      $$3.a(this.a(v, () -> new gjc(this.n.ae(), this::a, this.n.ah(), xo.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new gij(this, this.D)));
      fxo $$4 = $$3.a(this.a(x, () -> new gkh(this, this.D)));
      if (!this.n.F()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new gdv(this)));
      this.B.c($$2);
      this.B.b(fxo.a(xn.d, $$0x -> this.aP_()).a(200).a());
      this.B.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void aP_() {
      this.n.a(this.C);
   }

   private void a(awz $$0) {
      this.D.a($$0);
      this.n.a(this);
   }

   private gbm l() {
      if (this.n.s != null && this.n.V()) {
         this.E = a(0, 0, "options.difficulty", this.n);
         if (!this.n.s.l().l()) {
            this.F = new fyf(0, 0, $$0x -> this.n.a(new gdr(this::c, xo.c("difficulty.lock.title"), xo.a("difficulty.lock.question", this.n.s.l().q().b()))));
            this.E.h(this.E.z() - this.F.z());
            this.F.b(this.n.s.l().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            gbh $$0 = new gbh(150, 0, gbh.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fxo.a(xo.c("options.online"), $$0x -> this.n.a(new gio(this, this.D))).a(this.o / 2 + 5, this.p / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fxv<bxg> a(int $$0, int $$1, String $$2, fue $$3) {
      return fxv.a(bxg::b).a(bxg.values()).a($$3.s.an()).a($$0, $$1, 150, 20, xo.c($$2), ($$1x, $$2x) -> $$3.M().b(new ahq($$2x)));
   }

   private void c(boolean $$0) {
      this.n.a(this);
      if ($$0 && this.n.s != null && this.F != null && this.E != null) {
         this.n.M().b(new ail(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void aI_() {
      this.D.aC();
   }

   private fxo a(xo $$0, Supplier<get> $$1) {
      return fxo.a($$0, $$1x -> this.n.a($$1.get())).a();
   }
}
