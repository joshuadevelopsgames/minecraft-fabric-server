import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gkb extends fxu.a<gkb> {
   private static final ame f = ame.b("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fzd h = new fzd(
      ame.b("social_interactions/report_button"), ame.b("social_interactions/report_button_disabled"), ame.b("social_interactions/report_button_highlighted")
   );
   private static final fzd i = new fzd(ame.b("social_interactions/mute_button"), ame.b("social_interactions/mute_button_highlighted"));
   private static final fzd j = new fzd(ame.b("social_interactions/unmute_button"), ame.b("social_interactions/unmute_button_highlighted"));
   private final fue k;
   private final List<fxm> l;
   private final UUID m;
   private final String n;
   private final Supplier<hst> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private boolean s;
   private final boolean u;
   @Nullable
   private fxo v;
   @Nullable
   private fxo w;
   @Nullable
   private fxo x;
   private float y;
   private static final xo z = xo.c("gui.socialInteractions.status_hidden").a(o.u);
   private static final xo A = xo.c("gui.socialInteractions.status_blocked").a(o.u);
   private static final xo B = xo.c("gui.socialInteractions.status_offline").a(o.u);
   private static final xo C = xo.c("gui.socialInteractions.status_hidden_offline").a(o.u);
   private static final xo D = xo.c("gui.socialInteractions.status_blocked_offline").a(o.u);
   private static final xo E = xo.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xo F = xo.c("gui.socialInteractions.tooltip.hide");
   private static final xo G = xo.c("gui.socialInteractions.tooltip.show");
   private static final xo H = xo.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = baj.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = baj.a(255, 74, 74, 74);
   public static final int c = baj.a(255, 48, 48, 48);
   public static final int d = baj.a(255, 255, 255, 255);
   public static final int e = baj.a(140, 255, 255, 255);

   public gkb(fue $$0, gke $$1, UUID $$2, String $$3, Supplier<hst> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      gst $$6 = $$0.bb();
      this.r = $$6.a().a();
      this.u = $$5;
      this.a($$6);
      xo $$7 = xo.a("gui.socialInteractions.narration.hide", $$3);
      xo $$8 = xo.a("gui.socialInteractions.narration.show", $$3);
      gkc $$9 = $$0.aO();
      boolean $$10 = $$0.K().a($$0.U());
      boolean $$11 = !$$0.t.cK().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fya(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new gjx($$1, $$6, this)), false), xo.c("gui.socialInteractions.report")) {
            @Override
            protected yc d() {
               return gkb.this.a(super.d());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fya(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xo.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xo.c("gui.socialInteractions.hide")) {
            @Override
            protected yc d() {
               return gkb.this.a(super.d());
            }
         };
         this.v.a(fzb.a(F, $$7));
         this.v.a(g);
         this.w = new fya(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xo.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xo.c("gui.socialInteractions.show")) {
            @Override
            protected yc d() {
               return gkb.this.a(super.d());
            }
         };
         this.w.a(fzb.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   public void a(gst $$0) {
      this.s = $$0.a(this.m);
   }

   private fzb l() {
      return !this.r ? fzb.a(E) : fzb.a(H, xo.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xo $$13 = this.m();
      int $$14;
      if ($$13 == xn.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.b(this.k.h, $$13, $$12, $$14 + 12, e);
      }

      fyo.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.b(this.k.h, this.n, $$12, $$14, d);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.j($$3 + ($$4 - this.v.z() - 4) - 20 - 4);
         this.v.k($$2 + ($$5 - this.v.y()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.j($$3 + ($$4 - this.w.z() - 4) - 20 - 4);
         this.w.k($$2 + ($$5 - this.w.y()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.j($$3 + ($$4 - this.w.z() - 4));
         this.x.k($$2 + ($$5 - this.w.y()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.s && this.x != null) {
         $$0.a(gxx.ar, f, this.x.E() + 5, this.x.F() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fzn> aH_() {
      return this.l;
   }

   @Override
   public List<? extends gbr> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID g() {
      return this.m;
   }

   public Supplier<hst> h() {
      return this.o;
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public boolean i() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.q = $$0;
   }

   public boolean j() {
      return this.q;
   }

   public boolean k() {
      return this.u;
   }

   private void a(boolean $$0, xo $$1) {
      this.e($$0);
      this.k.m.e().a($$1);
      this.k.aZ().d($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   yc a(yc $$0) {
      xo $$1 = this.m();
      return $$1 == xn.a ? xo.b(this.n).f(", ").b($$0) : xo.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xo m() {
      boolean $$0 = this.k.aO().d(this.m);
      boolean $$1 = this.k.aO().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : xn.a;
      }
   }
}
