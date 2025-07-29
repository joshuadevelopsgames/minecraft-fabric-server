import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ghp extends get {
   private static final xo a = xo.c("structure_block.structure_name");
   private static final xo b = xo.c("structure_block.position");
   private static final xo c = xo.c("structure_block.size");
   private static final xo d = xo.c("structure_block.integrity");
   private static final xo e = xo.c("structure_block.custom_data");
   private static final xo f = xo.c("structure_block.include_entities");
   private static final xo u = xo.c("structure_block.strict");
   private static final xo v = xo.c("structure_block.detect_size");
   private static final xo w = xo.c("structure_block.show_air");
   private static final xo x = xo.c("structure_block.show_boundingbox");
   private static final ImmutableList<efl> y = ImmutableList.copyOf(efl.values());
   private static final ImmutableList<efl> z = y.stream().filter($$0 -> $$0 != efl.d).collect(ImmutableList.toImmutableList());
   private final ecs A;
   private dvd B = dvd.a;
   private dwu C = dwu.a;
   private efl D = efl.d;
   private boolean E;
   private boolean F;
   private boolean G;
   private boolean H;
   private fxx I;
   private fxx J;
   private fxx K;
   private fxx L;
   private fxx M;
   private fxx N;
   private fxx O;
   private fxx P;
   private fxx Q;
   private fxx R;
   private fxo S;
   private fxo T;
   private fxo U;
   private fxo V;
   private fxo W;
   private fxo X;
   private fxo Y;
   private fxv<Boolean> Z;
   private fxv<Boolean> aa;
   private fxv<dvd> ab;
   private fxv<Boolean> ac;
   private fxv<Boolean> ad;
   private final DecimalFormat ae = new DecimalFormat("0.0###");

   public ghp(ecs $$0) {
      super(xo.c(dqb.pH.v()));
      this.A = $$0;
      this.ae.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void l() {
      if (this.a(ecs.a.a)) {
         this.n.a(null);
      }
   }

   private void m() {
      this.A.a(this.B);
      this.A.a(this.C);
      this.A.a(this.D);
      this.A.a(this.E);
      this.A.b(this.F);
      this.A.e(this.G);
      this.A.f(this.H);
      this.n.a(null);
   }

   @Override
   protected void aV_() {
      this.c((fxo)fxo.a(xn.d, $$0x -> this.l()).a(this.o / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fxo)fxo.a(xn.e, $$0x -> this.m()).a(this.o / 2 + 4, 210, 150, 20).a());
      this.B = this.A.u();
      this.C = this.A.v();
      this.D = this.A.x();
      this.E = this.A.y();
      this.F = this.A.z();
      this.G = this.A.H();
      this.H = this.A.I();
      this.S = this.c((fxo)fxo.a(xo.c("structure_block.button.save"), $$0x -> {
         if (this.A.x() == efl.a) {
            this.a(ecs.a.b);
            this.n.a(null);
         }
      }).a(this.o / 2 + 4 + 100, 185, 50, 20).a());
      this.T = this.c((fxo)fxo.a(xo.c("structure_block.button.load"), $$0x -> {
         if (this.A.x() == efl.b) {
            this.a(ecs.a.c);
            this.n.a(null);
         }
      }).a(this.o / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fxv.<efl>a($$0x -> xo.c("structure_block.mode." + $$0x.c()))
            .a(z, y)
            .a()
            .a(this.D)
            .a(this.o / 2 - 4 - 150, 185, 50, 20, xo.b("MODE"), ($$0x, $$1x) -> {
               this.A.a($$1x);
               this.a($$1x);
            })
      );
      this.Y = this.c((fxo)fxo.a(xo.c("structure_block.button.detect_size"), $$0x -> {
         if (this.A.x() == efl.a) {
            this.a(ecs.a.d);
            this.n.a(null);
         }
      }).a(this.o / 2 + 4 + 100, 120, 50, 20).a());
      this.Z = this.c(fxv.b(!this.A.y()).a().a(this.o / 2 + 4 + 100, 160, 50, 20, f, ($$0x, $$1x) -> this.A.a(!$$1x)));
      this.aa = this.c(fxv.b(this.A.z()).a().a(this.o / 2 + 4 + 100, 120, 50, 20, u, ($$0x, $$1x) -> this.A.b($$1x)));
      this.ab = this.c(fxv.<dvd>a(dvd::b).a(dvd.values()).a().a(this.B).a(this.o / 2 - 20, 185, 40, 20, xo.b("MIRROR"), ($$0x, $$1x) -> this.A.a($$1x)));
      this.ac = this.c(fxv.b(this.A.H()).a().a(this.o / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.A.e($$1x)));
      this.ad = this.c(fxv.b(this.A.I()).a().a(this.o / 2 + 4 + 100, 80, 50, 20, x, ($$0x, $$1x) -> this.A.f($$1x)));
      this.U = this.c((fxo)fxo.a(xo.b("0"), $$0x -> {
         this.A.a(dwu.a);
         this.n();
      }).a(this.o / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.V = this.c((fxo)fxo.a(xo.b("90"), $$0x -> {
         this.A.a(dwu.b);
         this.n();
      }).a(this.o / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.W = this.c((fxo)fxo.a(xo.b("180"), $$0x -> {
         this.A.a(dwu.c);
         this.n();
      }).a(this.o / 2 + 1 + 20, 185, 40, 20).a());
      this.X = this.c((fxo)fxo.a(xo.b("270"), $$0x -> {
         this.A.a(dwu.d);
         this.n();
      }).a(this.o / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.I = new fxx(this.q, this.o / 2 - 152, 40, 300, 20, xo.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !ghp.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.I.f(128);
      this.I.a(this.A.d());
      this.d(this.I);
      jb $$0 = this.A.j();
      this.J = new fxx(this.q, this.o / 2 - 152, 80, 80, 20, xo.c("structure_block.position.x"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.u()));
      this.d(this.J);
      this.K = new fxx(this.q, this.o / 2 - 72, 80, 80, 20, xo.c("structure_block.position.y"));
      this.K.f(15);
      this.K.a(Integer.toString($$0.v()));
      this.d(this.K);
      this.L = new fxx(this.q, this.o / 2 + 8, 80, 80, 20, xo.c("structure_block.position.z"));
      this.L.f(15);
      this.L.a(Integer.toString($$0.w()));
      this.d(this.L);
      kg $$1 = this.A.k();
      this.M = new fxx(this.q, this.o / 2 - 152, 120, 80, 20, xo.c("structure_block.size.x"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.u()));
      this.d(this.M);
      this.N = new fxx(this.q, this.o / 2 - 72, 120, 80, 20, xo.c("structure_block.size.y"));
      this.N.f(15);
      this.N.a(Integer.toString($$1.v()));
      this.d(this.N);
      this.O = new fxx(this.q, this.o / 2 + 8, 120, 80, 20, xo.c("structure_block.size.z"));
      this.O.f(15);
      this.O.a(Integer.toString($$1.w()));
      this.d(this.O);
      this.P = new fxx(this.q, this.o / 2 - 152, 120, 80, 20, xo.c("structure_block.integrity.integrity"));
      this.P.f(15);
      this.P.a(this.ae.format(this.A.A()));
      this.d(this.P);
      this.Q = new fxx(this.q, this.o / 2 - 72, 120, 80, 20, xo.c("structure_block.integrity.seed"));
      this.Q.f(31);
      this.Q.a(Long.toString(this.A.B()));
      this.d(this.Q);
      this.R = new fxx(this.q, this.o / 2 - 152, 120, 240, 20, xo.c("structure_block.custom_data"));
      this.R.f(128);
      this.R.a(this.A.w());
      this.d(this.R);
      this.n();
      this.a(this.D);
   }

   @Override
   protected void aF_() {
      this.b(this.I);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.I.a();
      String $$4 = this.J.a();
      String $$5 = this.K.a();
      String $$6 = this.L.a();
      String $$7 = this.M.a();
      String $$8 = this.N.a();
      String $$9 = this.O.a();
      String $$10 = this.P.a();
      String $$11 = this.Q.a();
      String $$12 = this.R.a();
      this.b($$0, $$1, $$2);
      this.I.a($$3);
      this.J.a($$4);
      this.K.a($$5);
      this.L.a($$6);
      this.M.a($$7);
      this.N.a($$8);
      this.O.a($$9);
      this.P.a($$10);
      this.Q.a($$11);
      this.R.a($$12);
   }

   private void n() {
      this.U.j = true;
      this.V.j = true;
      this.W.j = true;
      this.X.j = true;
      switch (this.A.v()) {
         case a:
            this.U.j = false;
            break;
         case c:
            this.W.j = false;
            break;
         case d:
            this.X.j = false;
            break;
         case b:
            this.V.j = false;
      }
   }

   private void a(efl $$0) {
      this.I.i(false);
      this.J.i(false);
      this.K.i(false);
      this.L.i(false);
      this.M.i(false);
      this.N.i(false);
      this.O.i(false);
      this.P.i(false);
      this.Q.i(false);
      this.R.i(false);
      this.S.k = false;
      this.T.k = false;
      this.Y.k = false;
      this.Z.k = false;
      this.aa.k = false;
      this.ab.k = false;
      this.U.k = false;
      this.V.k = false;
      this.W.k = false;
      this.X.k = false;
      this.ac.k = false;
      this.ad.k = false;
      switch ($$0) {
         case a:
            this.I.i(true);
            this.J.i(true);
            this.K.i(true);
            this.L.i(true);
            this.M.i(true);
            this.N.i(true);
            this.O.i(true);
            this.S.k = true;
            this.Y.k = true;
            this.Z.k = true;
            this.aa.k = false;
            this.ac.k = true;
            break;
         case b:
            this.I.i(true);
            this.J.i(true);
            this.K.i(true);
            this.L.i(true);
            this.P.i(true);
            this.Q.i(true);
            this.T.k = true;
            this.Z.k = true;
            this.aa.k = true;
            this.ab.k = true;
            this.U.k = true;
            this.V.k = true;
            this.W.k = true;
            this.X.k = true;
            this.ad.k = true;
            this.n();
            break;
         case c:
            this.I.i(true);
            break;
         case d:
            this.R.i(true);
      }
   }

   private boolean a(ecs.a $$0) {
      jb $$1 = new jb(this.c(this.J.a()), this.c(this.K.a()), this.c(this.L.a()));
      kg $$2 = new kg(this.c(this.M.a()), this.c(this.N.a()), this.c(this.O.a()));
      float $$3 = this.b(this.P.a());
      long $$4 = this.a(this.Q.a());
      this.n
         .M()
         .b(
            new ajj(
               this.A.aA_(),
               $$0,
               this.A.x(),
               this.I.a(),
               $$1,
               $$2,
               this.A.u(),
               this.A.v(),
               this.R.a(),
               this.A.y(),
               this.A.z(),
               this.A.H(),
               this.A.I(),
               $$3,
               $$4
            )
         );
      return true;
   }

   private long a(String $$0) {
      try {
         return Long.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   private float b(String $$0) {
      try {
         return Float.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 1.0F;
      }
   }

   private int c(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   @Override
   public void aP_() {
      this.m();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      efl $$4 = this.A.x();
      $$0.a(this.q, this.m, this.o / 2, 10, -1);
      if ($$4 != efl.d) {
         $$0.b(this.q, a, this.o / 2 - 153, 30, -6250336);
         this.I.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == efl.b || $$4 == efl.a) {
         $$0.b(this.q, b, this.o / 2 - 153, 70, -6250336);
         this.J.a($$0, $$1, $$2, $$3);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         $$0.b(this.q, f, this.o / 2 + 154 - this.q.a(f), 150, -6250336);
      }

      if ($$4 == efl.a) {
         $$0.b(this.q, c, this.o / 2 - 153, 110, -6250336);
         this.M.a($$0, $$1, $$2, $$3);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         $$0.b(this.q, v, this.o / 2 + 154 - this.q.a(v), 110, -6250336);
         $$0.b(this.q, w, this.o / 2 + 154 - this.q.a(w), 70, -6250336);
      }

      if ($$4 == efl.b) {
         $$0.b(this.q, d, this.o / 2 - 153, 110, -6250336);
         this.P.a($$0, $$1, $$2, $$3);
         this.Q.a($$0, $$1, $$2, $$3);
         $$0.b(this.q, u, this.o / 2 + 154 - this.q.a(u), 110, -6250336);
         $$0.b(this.q, x, this.o / 2 + 154 - this.q.a(x), 70, -6250336);
      }

      if ($$4 == efl.d) {
         $$0.b(this.q, e, this.o / 2 - 153, 110, -6250336);
         this.R.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.q, $$4.a(), this.o / 2 - 153, 174, -6250336);
   }

   @Override
   public boolean aQ_() {
      return false;
   }
}
