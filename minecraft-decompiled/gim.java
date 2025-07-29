public class gim extends giq {
   private static final xo a = xo.c("options.languageAccuracyWarning").b(-4539718);
   private static final int f = 53;
   private gim.a u;
   final htd v;

   public gim(get $$0, fui $$1, htd $$2) {
      super($$0, $$1, xo.c("options.language.title"));
      this.v = $$2;
      this.e.a(53);
   }

   @Override
   protected void n() {
      this.u = this.e.c(new gim.a(this.n));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void m() {
      gbo $$0 = this.e.b(gbo.d()).a(8);
      $$0.c().b();
      $$0.a(new fyx(a, this.q));
      gbo $$1 = $$0.a(gbo.e().a(8));
      $$1.a(fxo.a(xo.c("options.font"), $$0x -> this.n.a(new gil(this, this.c))).a());
      $$1.a(fxo.a(xn.d, $$0x -> this.F()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.u.a(this.o, this.e);
   }

   void F() {
      gim.a.a $$0 = this.u.p();
      if ($$0 != null && !$$0.b.equals(this.v.a())) {
         this.v.a($$0.b);
         this.c.ac = $$0.b;
         this.n.l();
      }

      this.n.a(this.b);
   }

   class a extends fyl<gim.a.a> {
      public a(final fue $$0) {
         super($$0, gim.this.o, gim.this.p - 33 - 53, 33, 18);
         String $$1 = gim.this.v.a();
         gim.this.v.b().forEach(($$1x, $$2) -> {
            gim.a.a $$3 = new gim.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.p() != null) {
            this.e(this.p());
         }
      }

      @Override
      public int a() {
         return super.a() + 50;
      }

      public class a extends fyl.a<gim.a.a> {
         final String b;
         private final xo c;
         private long d;

         public a(final String $$1, final htc $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gim.this.q, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (gby.a($$0)) {
               this.b();
               gim.this.F();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ag.c() - this.d < 250L) {
               gim.this.F();
            }

            this.d = ag.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.c);
         }
      }
   }
}
