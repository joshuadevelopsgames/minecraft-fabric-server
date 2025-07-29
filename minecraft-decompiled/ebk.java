public class ebk extends eaz {
   private static final boolean a = false;
   private static final boolean b = false;
   private static final boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private final dlt g = new dlt() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         ebk.this.e();
      }

      @Override
      public aub e() {
         return (aub)ebk.this.n;
      }

      @Override
      public void f() {
         eeb $$0 = ebk.this.n.a_(ebk.this.o);
         this.e().a(ebk.this.o, $$0, $$0, 3);
      }

      @Override
      public fis g() {
         return fis.b(ebk.this.o);
      }

      @Override
      public ek i() {
         jh $$0 = ebk.this.m().c(drj.b);
         return new ek(this, fis.b(ebk.this.o), new fir(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().q(), null);
      }

      @Override
      public boolean j() {
         return !ebk.this.n();
      }
   };

   public ebk(jb $$0, eeb $$1) {
      super(ebb.x, $$0, $$1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.g.a($$0);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.g.a($$0);
      this.d = $$0.a("powered", false);
      this.f = $$0.a("conditionMet", false);
      this.b($$0.a("auto", false));
   }

   public dlt a() {
      return this.g;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.e;
      this.e = $$0;
      if (!$$1 && $$0 && !this.d && this.n != null && this.u() != ebk.a.a) {
         this.w();
      }
   }

   public void f() {
      ebk.a $$0 = this.u();
      if ($$0 == ebk.a.b && (this.d || this.e) && this.n != null) {
         this.w();
      }
   }

   private void w() {
      dpz $$0 = this.m().b();
      if ($$0 instanceof drj) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.f;
   }

   public boolean k() {
      this.f = true;
      if (this.v()) {
         jb $$0 = this.o.a(this.n.a_(this.o).c(drj.b).g());
         if (this.n.a_($$0).b() instanceof drj) {
            eaz $$1 = this.n.c_($$0);
            this.f = $$1 instanceof ebk && ((ebk)$$1).a().k() > 0;
         } else {
            this.f = false;
         }
      }

      return this.f;
   }

   public ebk.a u() {
      eeb $$0 = this.m();
      if ($$0.a(dqb.gm)) {
         return ebk.a.c;
      } else if ($$0.a(dqb.lm)) {
         return ebk.a.b;
      } else {
         return $$0.a(dqb.ln) ? ebk.a.a : ebk.a.c;
      }
   }

   public boolean v() {
      eeb $$0 = this.n.a_(this.aA_());
      return $$0.b() instanceof drj ? $$0.c(drj.c) : false;
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.g.b($$0.a(kq.g));
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.g.o());
   }

   @Override
   public void b(fdc $$0) {
      super.b($$0);
      $$0.c("CustomName");
      $$0.c("conditionMet");
      $$0.c("powered");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
