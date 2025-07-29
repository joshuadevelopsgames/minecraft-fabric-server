import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class gdx extends get {
   private static final ame a = ame.b("icon/draft_report");
   private int b;
   private final xo c;
   private final boolean d;
   private xo e;
   private final List<fxo> f = Lists.newArrayList();
   @Nullable
   private fxo u;

   public gdx(@Nullable xo $$0, boolean $$1) {
      super(xo.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aV_() {
      this.b = 0;
      this.f.clear();
      xo $$0 = this.d ? xo.c("deathScreen.spectate") : xo.c("deathScreen.respawn");
      this.f.add(this.c(fxo.a($$0, $$0x -> {
         this.n.t.gp();
         $$0x.j = false;
      }).a(this.o / 2 - 100, this.p / 4 + 72, 200, 20).a()));
      this.u = this.c(
         fxo.a(xo.c("deathScreen.titleScreen"), $$0x -> this.n.bb().a(this.n, this, this::l, true)).a(this.o / 2 - 100, this.p / 4 + 96, 200, 20).a()
      );
      this.f.add(this.u);
      this.c(false);
      this.e = xo.a("deathScreen.score.value", xo.b(Integer.toString(this.n.t.gm())).a(o.o));
   }

   @Override
   public boolean aG_() {
      return false;
   }

   private void l() {
      if (this.d) {
         this.m();
      } else {
         gdr $$0 = new gdx.a($$0x -> {
            if ($$0x) {
               this.m();
            } else {
               this.n.t.gp();
               this.n.a(null);
            }
         }, xo.c("deathScreen.quit.confirm"), xn.a, xo.c("deathScreen.titleScreen"), xo.c("deathScreen.respawn"));
         this.n.a($$0);
         $$0.a(20);
      }
   }

   private void m() {
      if (this.n.s != null) {
         this.n.s.a(grk.a);
      }

      this.n.y();
      this.n.a(new gev());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.e().pushMatrix();
      $$0.e().scale(2.0F, 2.0F);
      $$0.a(this.q, this.m, this.o / 2 / 2, 30, -1);
      $$0.e().popMatrix();
      if (this.c != null) {
         $$0.a(this.q, this.c, this.o / 2, 85, -1);
      }

      $$0.a(this.q, this.e, this.o / 2, 100, -1);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         yl $$4 = this.a($$1);
         $$0.a(this.q, $$4, $$1, $$2);
      }

      if (this.u != null && this.n.bb().c()) {
         $$0.a(gxx.ar, a, this.u.E() + this.u.z() - 17, this.u.F() + 3, 15, 15);
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      a($$0, this.o, this.p);
   }

   static void a(fxb $$0, int $$1, int $$2) {
      $$0.a(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private yl a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.n.h.a(this.c);
         int $$2 = this.o / 2 - $$1 / 2;
         int $$3 = this.o / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.n.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < 85 + 9) {
         yl $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.i() instanceof xm.f $$4) {
            return a(this.n, this, $$4.b());
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   @Override
   public void e() {
      super.e();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (fxo $$1 : this.f) {
         $$1.j = $$0;
      }
   }

   public static class a extends gdr {
      public a(BooleanConsumer $$0, xo $$1, xo $$2, xo $$3, xo $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         gdx.a($$0, this.o, this.p);
      }
   }
}
