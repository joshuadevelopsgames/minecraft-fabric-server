import com.mojang.logging.LogUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsc extends hyg {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.selectServer.play");
   private final fol c;
   @Nullable
   private fpx G;
   @Nullable
   private fpq H;
   private final Map<fpw, fqn> I = new LinkedHashMap<>();
   private final long J;
   private boolean K;
   private final fzv L = new fzv($$1x -> {
      fxm var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x), this::a, this::b);
   @Nullable
   private fxo M;
   @Nullable
   private fzw N;
   private final gbk O = new gbk(this);

   public fsc(fol $$0, long $$1, @Nullable fpx $$2, @Nullable fpq $$3) {
      super(xo.i());
      this.c = $$0;
      this.J = $$1;
      this.G = $$2;
      this.H = $$3;
   }

   public fsc(fol $$0, long $$1) {
      this($$0, $$1, null, null);
   }

   @Override
   public void aV_() {
      if (this.G == null) {
         this.a(this.J);
      }

      if (this.H == null) {
         this.k();
      }

      xo $$0 = xo.c("mco.configure.world.loading");
      this.N = fzw.a(this.L, this.o)
         .a(new fzt(this.B(), fsj.a, $$0), new fzt(this.B(), fse.a, $$0), new fzt(this.B(), fsi.a, $$0), new fzt(this.B(), fsg.a, $$0))
         .a();
      this.c(this.N);
      gbo $$1 = this.O.b(gbo.e().a(8));
      this.M = $$1.a(fxo.a(b, $$0x -> {
         this.aP_();
         fol.a(this.G, this);
      }).a(150).a());
      this.M.j = false;
      $$1.a(fxo.a(xn.k, $$0x -> this.aP_()).a());
      this.O.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.N.a(0, false);
      this.c();
      if (this.G != null && this.H != null) {
         this.H();
      }
   }

   private void a(fzu $$0) {
      if (this.G != null && $$0 instanceof fsb $$1) {
         $$1.b(this.G);
      }
   }

   private void b(fzu $$0) {
      if (this.G != null && $$0 instanceof fsb $$1) {
         $$1.c(this.G);
      }
   }

   public int g() {
      return this.O.d();
   }

   public int h() {
      return this.O.c();
   }

   public get j() {
      return this.c;
   }

   public get a(fqx $$0) {
      return new frm($$0, this.c);
   }

   @Override
   public void c() {
      if (this.N != null) {
         this.N.a(this.o);
         this.N.g();
         int $$0 = this.N.I().c();
         gcd $$1 = new gcd(0, $$0, this.o, this.p - this.O.b() - $$0);
         this.L.a($$1);
         this.O.b($$0);
         this.O.a();
      }
   }

   private void G() {
      if (this.G != null && this.M != null) {
         this.M.j = this.G.g();
         if (!this.M.j && this.G.f == fpx.c.a) {
            this.M.a(fzb.a(fpx.a));
         }
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gxx.ar, get.i, 0, this.p - this.O.b() - 2, 0.0F, 0.0F, this.o, 2, 32, 2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.N.b($$0) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fxb $$0) {
      $$0.a(gxx.ar, gkl.a, 0, 0, 0.0F, 0.0F, this.o, this.O.c(), 16, 16);
      this.a($$0, 0, this.O.c(), this.o, this.p);
   }

   @Override
   public void aP_() {
      if (this.G != null && this.L.a() instanceof fsb $$0) {
         $$0.c(this.G);
      }

      this.n.a(this.c);
      if (this.K) {
         this.c.h();
      }
   }

   public void k() {
      fsu.<fpq>a(foq::f, fsu.a(this::a, "Couldn't get realms region data")).thenAcceptAsync($$0 -> {
         this.H = $$0;
         this.H();
      }, this.n);
   }

   @Override
   public void a(long $$0) {
      fsu.<fpx>a($$1 -> $$1.a($$0), fsu.a(this::a, "Couldn't get own world")).thenAcceptAsync($$0x -> {
         this.G = $$0x;
         this.H();
      }, this.n);
   }

   private void H() {
      if (this.G != null && this.H != null) {
         this.I.clear();

         for (fqh $$0 : this.H.b()) {
            if ($$0.a() != fpw.x) {
               this.I.put($$0.a(), $$0.b());
            }
         }

         if (this.N != null) {
            this.e(this.N);
         }

         this.N = fzw.a(this.L, this.o)
            .a(
               new fsj(this, Objects.requireNonNull(this.n), this.G),
               new fse(this, this.n, this.G),
               new fsi(this, this.n, this.G),
               new fsg(this, this.n, this.G, this.I)
            )
            .a();
         this.c(this.N);
         this.N.a(0, false);
         this.N.b(3, !this.G.k);
         if (this.G.k) {
            this.N.a(3, fzb.a(xo.c("mco.configure.world.settings.expired")));
         } else {
            this.N.a(3, null);
         }

         this.G();
         this.c();
      }
   }

   public void a(fqb $$0) {
      fqb $$1 = this.G.j.get(this.G.q);
      $$0.b.j = $$1.b.j;
      $$0.b.k = $$1.b.k;
      foq $$2 = foq.a();

      try {
         if (this.G.q != $$0.a) {
            throw new fqx(fot.b.d());
         }

         $$2.a(this.G.b, $$0.a, $$0.b, $$0.c);
         this.G.j.put(this.G.q, $$0);
         if ($$0.b.g != $$1.b.g || $$0.b() != $$1.b()) {
            fol.g();
         }

         this.m();
      } catch (fqx var5) {
         a.error("Couldn't save slot settings", var5);
         this.n.a(new frm(var5, this));
         return;
      }

      this.n.a(this);
   }

   public void a(String $$0, String $$1, fqj $$2, @Nullable fpw $$3) {
      String $$4 = bdb.h($$1) ? "" : $$1;
      String $$5 = bdb.h($$0) ? "" : $$0;
      foq $$6 = foq.a();

      try {
         fqb $$7 = this.G.j.get(this.G.q);
         fpw $$8 = $$2 == fqj.c ? $$3 : null;
         fqk $$9 = new fqk($$2, $$8);
         $$6.a(this.G.b, $$5, $$4, $$9, $$7.a, $$7.b, $$7.c);
         this.G.y = $$9;
         this.G.d = $$0;
         this.G.e = $$4;
         this.m();
      } catch (fqx var11) {
         a.error("Couldn't save settings", var11);
         this.n.a(new frm(var11, this));
         return;
      }

      this.n.a(this);
   }

   public void b(boolean $$0) {
      fsc $$1 = this.a(this.G);
      this.n.a(new fro(this.n(), new ftd(this.G, $$1, $$0, this.n)));
   }

   public void l() {
      fsc $$0 = this.a(this.G);
      this.n.a(new fro(this.n(), new fsy(this.G, $$0)));
   }

   public void m() {
      this.K = true;
      if (this.N != null) {
         for (fzu $$0 : this.N.c()) {
            if ($$0 instanceof fsb $$1) {
               $$1.a(this.G);
            }
         }
      }
   }

   public boolean a(long $$0, String $$1) {
      foq $$2 = foq.a();

      try {
         List<fpp> $$3 = $$2.a($$0, $$1);
         if (this.G != null) {
            this.G.i = $$3;
         } else {
            this.G = $$2.a($$0);
         }

         this.m();
         return true;
      } catch (fqx var6) {
         a.error("Couldn't invite user", var6);
         return false;
      }
   }

   public fsc n() {
      fsc $$0 = new fsc(this.c, this.J);
      $$0.K = this.K;
      return $$0;
   }

   public fsc a(fpx $$0) {
      fsc $$1 = new fsc(this.c, this.J, $$0, this.H);
      $$1.K = this.K;
      return $$1;
   }
}
