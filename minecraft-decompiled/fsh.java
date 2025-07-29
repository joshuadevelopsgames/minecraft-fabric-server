import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fsh extends hyg {
   private static final int G = 2;
   public static final List<bxg> a = ImmutableList.of(bxg.a, bxg.b, bxg.c, bxg.d);
   private static final int H = 0;
   public static final List<dmr> b = ImmutableList.of(dmr.a, dmr.b, dmr.c);
   private static final xo I = xo.c("mco.configure.world.edit.slot.name");
   static final xo J = xo.c("mco.configure.world.spawnProtection");
   private fxx K;
   protected final fsc c;
   private int L;
   private int M;
   private final fqb N;
   private final fpx.d O;
   private bxg P;
   private dmr Q;
   private final String R;
   private String S;
   private boolean T;
   private boolean U;
   int V;
   private boolean W;
   private boolean X;
   fsh.a Y;

   public fsh(fsc $$0, fqb $$1, fpx.d $$2, int $$3) {
      super(xo.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.N = $$1;
      this.O = $$2;
      this.P = a(a, $$1.b.f, 2);
      this.Q = a(b, $$1.b.g, 0);
      this.R = $$1.b.b($$3);
      this.a($$1.b.a($$3));
      if ($$2 == fpx.d.a) {
         this.T = $$1.b.a;
         this.V = $$1.b.c;
         this.X = $$1.b.e;
         this.U = $$1.b.b;
         this.W = $$1.b.d;
      } else {
         this.T = true;
         this.V = 0;
         this.X = false;
         this.U = true;
         this.W = true;
      }
   }

   @Override
   public void aP_() {
      this.n.a(this.c);
   }

   private static <T> T a(List<T> $$0, int $$1, int $$2) {
      try {
         return $$0.get($$1);
      } catch (IndexOutOfBoundsException var4) {
         return $$0.get($$2);
      }
   }

   private static <T> int a(List<T> $$0, T $$1, int $$2) {
      int $$3 = $$0.indexOf($$1);
      return $$3 == -1 ? $$2 : $$3;
   }

   @Override
   public void aV_() {
      this.M = 170;
      this.L = this.o / 2 - this.M;
      int $$0 = this.o / 2 + 10;
      if (this.O != fpx.d.a) {
         xo $$1;
         if (this.O == fpx.d.c) {
            $$1 = xo.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.O == fpx.d.e) {
            $$1 = xo.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xo.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hyf($$1, this.o / 2, 26, -65536));
      }

      this.K = this.d(new fxx(this.n.h, this.L, g(1), this.M, 20, null, xo.c("mco.configure.world.edit.slot.name")));
      this.K.a(this.S);
      this.K.b(this::a);
      fxv<Boolean> $$4 = this.c(fxv.b(this.T).a($$0, g(1), this.M, 20, xo.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.T = $$1));
      fxv<dmr> $$5 = this.c(fxv.a(dmr::e).a(b).a(this.Q).a(this.L, g(3), this.M, 20, xo.c("selectWorld.gameMode"), ($$0x, $$1) -> this.Q = $$1));
      this.Y = this.c(new fsh.a($$0, g(3), this.M, this.V, 0.0F, 16.0F));
      xo $$6 = xo.c("mco.configure.world.spawn_toggle.message");
      fxv<Boolean> $$7 = fxv.b(this.P != bxg.a && this.U)
         .a($$0, g(5), this.M, 20, xo.c("mco.configure.world.spawnMonsters"), this.a($$6, $$0x -> this.U = $$0x));
      fxv<bxg> $$8 = this.c(fxv.a(bxg::b).a(a).a(this.P).a(this.L, g(5), this.M, 20, xo.c("options.difficulty"), ($$1, $$2) -> {
         this.P = $$2;
         if (this.O == fpx.d.a) {
            boolean $$3 = this.P != bxg.a;
            $$7.j = $$3;
            $$7.a($$3 && this.U);
         }
      }));
      this.c($$7);
      fxv<Boolean> $$9 = this.c(fxv.b(this.X).a(this.L, g(7), this.M, 20, xo.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.X = $$1));
      fxv<Boolean> $$10 = this.c(fxv.b(this.W).a($$0, g(7), this.M, 20, xo.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.W = $$1));
      if (this.O != fpx.d.a) {
         $$4.j = false;
         $$7.j = false;
         this.Y.j = false;
         $$9.j = false;
      }

      if (this.P == bxg.a) {
         $$7.j = false;
      }

      if (this.N.b()) {
         $$10.j = false;
         $$8.j = false;
         $$5.j = false;
         $$7.j = false;
         $$9.j = false;
      }

      this.c(fxo.a(xo.c("mco.configure.world.buttons.done"), $$0x -> this.l()).a(this.L, g(13), this.M, 20).a());
      this.c(fxo.a(xn.e, $$0x -> this.aP_()).a($$0, g(13), this.M, 20).a());
   }

   private fxv.b<Boolean> a(xo $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.n.a(frs.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aP_();
            }));
         }
      };
   }

   @Override
   public xo i() {
      return xn.a(this.o(), this.E());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 17, -1);
      $$0.b(this.q, I, this.L + this.M / 2 - this.q.a(I) / 2, g(0) - 5, -1);
      this.K.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.R)) {
         this.S = "";
      } else {
         this.S = $$0;
      }
   }

   private void l() {
      int $$0 = a(a, this.P, 2);
      int $$1 = a(b, this.Q, 0);
      if (this.O != fpx.d.c && this.O != fpx.d.d && this.O != fpx.d.e) {
         boolean $$2 = this.O == fpx.d.a && this.P != bxg.a && this.U;
         this.c.a(new fqb(this.N.a, new fqe(this.T, $$2, this.V, this.W, $$0, $$1, this.X, this.S, this.N.b.h, this.N.b.i), this.N.c));
      } else {
         this.c.a(new fqb(this.N.a, new fqe(this.N.b.a, this.N.b.b, this.N.b.c, this.N.b.d, $$0, $$1, this.N.b.e, this.S, this.N.b.h, this.N.b.i), this.N.c));
      }
   }

   class a extends fxj {
      private final double e;
      private final double f;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xn.a, 0.0);
         this.e = $$4;
         this.f = $$5;
         this.d = (bcb.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4);
         this.b();
      }

      @Override
      public void a() {
         if (fsh.this.Y.j) {
            fsh.this.V = (int)bcb.d(bcb.a(this.d, 0.0, 1.0), this.e, this.f);
         }
      }

      @Override
      protected void b() {
         this.b(xn.a(fsh.J, (xo)(fsh.this.V == 0 ? xn.c : xo.b(String.valueOf(fsh.this.V)))));
      }
   }
}
