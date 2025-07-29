import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class frg extends hyg {
   private static final xo a = xo.c("mco.selectServer.popup");
   private static final xo b = xo.c("mco.selectServer.close");
   private static final ame c = ame.b("popup/background");
   private static final ame G = ame.b("icon/trial_available");
   private static final fzd H = new fzd(ame.b("widget/cross_button"), ame.b("widget/cross_button_highlighted"));
   private static final int I = 195;
   private static final int J = 152;
   private static final int K = 6;
   private static final int L = 4;
   private static final int M = 10;
   private static final int N = 320;
   private static final int O = 172;
   private static final int P = 100;
   private static final int Q = 99;
   private static final int R = 100;
   private static List<ame> S = List.of();
   private final get T;
   private final boolean U;
   @Nullable
   private fxo V;
   private int W;
   private int X;

   public frg(get $$0, boolean $$1) {
      super(a);
      this.T = $$0;
      this.U = $$1;
   }

   public static void a(axo $$0) {
      Collection<ame> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      S = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aV_() {
      this.T.a(this.n, this.o, this.p);
      if (this.U) {
         this.V = this.c(fxo.a(xo.c("mco.selectServer.trial"), gdq.b(this, bav.q)).a(this.n() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fxo.a(xo.c("mco.selectServer.buy"), gdq.b(this, bav.r)).a(this.n() - 10 - 99, this.G() - 10 - 20, 99, 20).a());
      fya $$0 = this.c(new fya(this.l() + 4, this.m() + 4, 14, 14, H, $$0x -> this.aP_(), b));
      $$0.a(fzb.a(b));
      int $$1 = 142 - (this.U ? 40 : 20);
      fxy $$2 = new fxy(this.n() - 10 - 100, this.m() + 10, 100, $$1, a, this.q);
      if ($$2.q()) {
         $$2.h(94);
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.X > 100) {
         this.X = 0;
         this.W = (this.W + 1) % S.size();
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.V != null) {
         a($$0, this.V);
      }
   }

   public static void a(fxb $$0, fxo $$1) {
      int $$2 = 8;
      $$0.a(gxx.ar, G, $$1.E() + $$1.z() - 8 - 4, $$1.F() + $$1.y() / 2 - 4, 8, 8);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.T.b($$0, -1, -1, $$3);
      $$0.c();
      this.T.a($$0, -1, -1, $$3);
      $$0.c();
      this.c($$0);
      $$0.a(gxx.ar, c, this.l(), this.m(), 320, 172);
      if (!S.isEmpty()) {
         $$0.a(gxx.ar, S.get(this.W), this.l() + 10, this.m() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int l() {
      return (this.o - 320) / 2;
   }

   private int m() {
      return (this.p - 172) / 2;
   }

   private int n() {
      return this.l() + 320;
   }

   private int G() {
      return this.m() + 172;
   }

   @Override
   public void aP_() {
      this.n.a(this.T);
   }
}
