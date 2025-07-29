public class ghd extends get {
   private static final xo a = xo.c("jigsaw_block.joint_label");
   private static final xo b = xo.c("jigsaw_block.pool");
   private static final xo c = xo.c("jigsaw_block.name");
   private static final xo d = xo.c("jigsaw_block.target");
   private static final xo e = xo.c("jigsaw_block.final_state");
   private static final xo f = xo.c("jigsaw_block.placement_priority");
   private static final xo u = xo.c("jigsaw_block.placement_priority.tooltip");
   private static final xo v = xo.c("jigsaw_block.selection_priority");
   private static final xo w = xo.c("jigsaw_block.selection_priority.tooltip");
   private final ecd x;
   private fxx y;
   private fxx z;
   private fxx A;
   private fxx B;
   private fxx C;
   private fxx D;
   int E;
   private boolean F = true;
   private fxv<ecd.a> G;
   private fxo H;
   private fxo I;
   private ecd.a J;

   public ghd(ecd $$0) {
      super(ftv.a);
      this.x = $$0;
   }

   private void l() {
      this.n();
      this.n.a(null);
   }

   private void m() {
      this.n.a(null);
   }

   private void n() {
      this.n.M().b(new aji(this.x.aA_(), ame.a(this.y.a()), ame.a(this.z.a()), ame.a(this.A.a()), this.B.a(), this.J, this.b(this.C.a()), this.b(this.D.a())));
   }

   private int b(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.n.M().b(new aik(this.x.aA_(), this.E, this.F));
   }

   @Override
   public void aP_() {
      this.m();
   }

   @Override
   protected void aV_() {
      this.A = new fxx(this.q, this.o / 2 - 153, 20, 300, 20, b);
      this.A.f(128);
      this.A.a(this.x.d().a().toString());
      this.A.b($$0x -> this.F());
      this.d(this.A);
      this.y = new fxx(this.q, this.o / 2 - 153, 55, 300, 20, c);
      this.y.f(128);
      this.y.a(this.x.a().toString());
      this.y.b($$0x -> this.F());
      this.d(this.y);
      this.z = new fxx(this.q, this.o / 2 - 153, 90, 300, 20, d);
      this.z.f(128);
      this.z.a(this.x.c().toString());
      this.z.b($$0x -> this.F());
      this.d(this.z);
      this.B = new fxx(this.q, this.o / 2 - 153, 125, 300, 20, e);
      this.B.f(256);
      this.B.a(this.x.f());
      this.d(this.B);
      this.C = new fxx(this.q, this.o / 2 - 153, 160, 98, 20, v);
      this.C.f(3);
      this.C.a(Integer.toString(this.x.u()));
      this.C.a(fzb.a(w));
      this.d(this.C);
      this.D = new fxx(this.q, this.o / 2 - 50, 160, 98, 20, f);
      this.D.f(3);
      this.D.a(Integer.toString(this.x.k()));
      this.D.a(fzb.a(u));
      this.d(this.D);
      this.J = this.x.j();
      this.G = this.c(fxv.a(ecd.a::a).a(ecd.a.values()).a(this.J).a().a(this.o / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.J = $$1));
      boolean $$0 = duh.o(this.x.m()).o().b();
      this.G.j = $$0;
      this.G.k = $$0;
      this.c(new fxj(this.o / 2 - 154, 185, 100, 20, xn.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(xo.a("jigsaw_block.levels", ghd.this.E));
         }

         @Override
         protected void a() {
            ghd.this.E = bcb.a(bcb.b(0.0, 20.0, this.d));
         }
      });
      this.c(fxv.b(this.F).a(this.o / 2 - 50, 185, 100, 20, xo.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.F = $$1));
      this.I = this.c((fxo)fxo.a(xo.c("jigsaw_block.generate"), $$0x -> {
         this.l();
         this.E();
      }).a(this.o / 2 + 54, 185, 100, 20).a());
      this.H = this.c((fxo)fxo.a(xn.d, $$0x -> this.l()).a(this.o / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fxo)fxo.a(xn.e, $$0x -> this.m()).a(this.o / 2 + 4, 210, 150, 20).a());
      this.F();
   }

   @Override
   protected void aF_() {
      this.b(this.A);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
   }

   public static boolean a(String $$0) {
      return ame.c($$0) != null;
   }

   private void F() {
      boolean $$0 = a(this.y.a()) && a(this.z.a()) && a(this.A.a());
      this.H.j = $$0;
      this.I.j = $$0;
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.y.a();
      String $$4 = this.z.a();
      String $$5 = this.A.a();
      String $$6 = this.B.a();
      String $$7 = this.C.a();
      String $$8 = this.D.a();
      int $$9 = this.E;
      ecd.a $$10 = this.J;
      this.b($$0, $$1, $$2);
      this.y.a($$3);
      this.z.a($$4);
      this.A.a($$5);
      this.B.a($$6);
      this.E = $$9;
      this.J = $$10;
      this.G.a($$10);
      this.C.a($$7);
      this.D.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.H.j || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.q, b, this.o / 2 - 153, 10, -6250336);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.q, c, this.o / 2 - 153, 45, -6250336);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.b(this.q, d, this.o / 2 - 153, 80, -6250336);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.b(this.q, e, this.o / 2 - 153, 115, -6250336);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.b(this.q, v, this.o / 2 - 153, 150, -6250336);
      this.D.a($$0, $$1, $$2, $$3);
      $$0.b(this.q, f, this.o / 2 - 50, 150, -6250336);
      this.C.a($$0, $$1, $$2, $$3);
      if (duh.o(this.x.m()).o().b()) {
         $$0.b(this.q, a, this.o / 2 + 53, 150, -6250336);
      }
   }
}
