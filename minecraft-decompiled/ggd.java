public class ggd extends ghc<cyp> {
   private static final ame E = ame.b("container/anvil/text_field");
   private static final ame F = ame.b("container/anvil/text_field_disabled");
   private static final ame G = ame.b("container/anvil/error");
   private static final ame H = ame.b("textures/gui/container/anvil.png");
   private static final xo I = xo.c("container.repair.expensive");
   private fxx J;
   private final cut K;

   public ggd(cyp $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2, H);
      this.K = $$1.j;
      this.f = 60;
   }

   @Override
   protected void E() {
      int $$0 = (this.o - this.d) / 2;
      int $$1 = (this.p - this.e) / 2;
      this.J = new fxx(this.q, $$0 + 62, $$1 + 24, 103, 12, xo.c("container.repair"));
      this.J.h(false);
      this.J.m(-1);
      this.J.n(-1);
      this.J.d(false);
      this.J.f(50);
      this.J.b(this::a);
      this.J.a("");
      this.c(this.J);
      this.J.e(this.x.b(0).h());
   }

   @Override
   protected void m() {
      super.m();
      this.n.t.cO = this.n.t.as;
   }

   @Override
   protected void aF_() {
      this.b(this.J);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.J.a();
      this.b($$0, $$1, $$2);
      this.J.a($$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.n.t.p();
      }

      return !this.J.a($$0, $$1, $$2) && !this.J.c() ? super.a($$0, $$1, $$2) : true;
   }

   private void a(String $$0) {
      dak $$1 = this.x.b(0);
      if ($$1.h()) {
         String $$2 = $$0;
         if (!$$1.g().c(kq.g) && $$0.equals($$1.g().y().getString())) {
            $$2 = "";
         }

         if (this.x.a($$2)) {
            this.n.t.j.b(new aiz($$2));
         }
      }
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2) {
      super.c($$0, $$1, $$2);
      int $$3 = this.x.m();
      if ($$3 > 0) {
         int $$4 = -8323296;
         xo $$5;
         if ($$3 >= 40 && !this.n.t.gc()) {
            $$5 = I;
            $$4 = -40864;
         } else if (!this.x.b(2).h()) {
            $$5 = null;
         } else {
            $$5 = xo.a("container.repair.cost", $$3);
            if (!this.x.b(2).a(this.K)) {
               $$4 = -40864;
            }
         }

         if ($$5 != null) {
            int $$8 = this.d - 8 - this.q.a($$5) - 2;
            int $$9 = 69;
            $$0.a($$8 - 2, 67, this.d - 8, 79, 1325400064);
            $$0.b(this.q, $$5, $$8, 69, $$4);
         }
      }
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gxx.ar, this.x.b(0).h() ? E : F, this.A + 59, this.B + 20, 110, 16);
   }

   @Override
   protected void d(fxb $$0, int $$1, int $$2) {
      if ((this.x.b(0).h() || this.x.b(1).h()) && !this.x.b(this.x.n()).h()) {
         $$0.a(gxx.ar, G, $$1 + 99, $$2 + 45, 28, 21);
      }
   }

   @Override
   public void a(cym $$0, int $$1, dcv $$2) {
      if ($$1 == 0) {
         this.J.a($$2.f() ? "" : $$2.y().getString());
         this.J.e(!$$2.f());
         this.a(this.J);
      }
   }
}
