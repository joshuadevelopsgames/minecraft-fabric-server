import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class frw extends hyg {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.terms.title");
   private static final xo c = xo.c("mco.terms.sentence.1");
   private static final xo G = xn.a().b(xo.c("mco.terms.sentence.2").c(yl.a.c(true)));
   private final get H;
   private final fpx I;
   private boolean J;

   public frw(get $$0, fpx $$1) {
      super(b);
      this.H = $$0;
      this.I = $$1;
   }

   @Override
   public void aV_() {
      int $$0 = this.o / 4 - 2;
      this.c(fxo.a(xo.c("mco.terms.buttons.agree"), $$0x -> this.l()).a(this.o / 4, g(12), $$0, 20).a());
      this.c(fxo.a(xo.c("mco.terms.buttons.disagree"), $$0x -> this.n.a(this.H)).a(this.o / 2 + 4, g(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.n.a(this.H);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void l() {
      foq $$0 = foq.a();

      try {
         $$0.l();
         this.n.a(new fro(this.H, new ftb(this.H, this.I)));
      } catch (fqx var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.J) {
         this.n.p.a(bav.s.toString());
         ag.n().a(bav.s);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public xo i() {
      return xn.a(super.i(), c).b(xn.w).b(G);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 17, -1);
      $$0.b(this.q, c, this.o / 2 - 120, g(5), -1);
      int $$4 = this.q.a(c);
      int $$5 = this.o / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.q.a(G) + 1;
      int $$8 = $$6 + 1 + 9;
      this.J = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.b(this.q, G, this.o / 2 - 120 + $$4, g(5), this.J ? -9670204 : -13408581);
   }
}
