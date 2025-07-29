import javax.annotation.Nullable;

public class ecf extends eaz implements bxa, bxm {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bxc e = new bxc() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return ecf.this.g.f();
      }

      @Override
      public dcv a(int $$0) {
         return $$0 == 0 ? ecf.this.g : dcv.l;
      }

      @Override
      public dcv a(int $$0, int $$1) {
         if ($$0 == 0) {
            dcv $$2 = ecf.this.g.a($$1);
            if (ecf.this.g.f()) {
               ecf.this.u();
            }

            return $$2;
         } else {
            return dcv.l;
         }
      }

      @Override
      public dcv b(int $$0) {
         if ($$0 == 0) {
            dcv $$1 = ecf.this.g;
            ecf.this.g = dcv.l;
            ecf.this.u();
            return $$1;
         } else {
            return dcv.l;
         }
      }

      @Override
      public void a(int $$0, dcv $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         ecf.this.e();
      }

      @Override
      public boolean a(cut $$0) {
         return bxc.a(ecf.this, $$0) && ecf.this.f();
      }

      @Override
      public boolean b(int $$0, dcv $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cyy f = new cyy() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? ecf.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            ecf.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   dcv g = dcv.l;
   int h;
   private int i;

   public ecf(jb $$0, eeb $$1) {
      super(ebb.E, $$0, $$1);
   }

   public dcv c() {
      return this.g;
   }

   public boolean f() {
      return this.g.c(kq.U) || this.g.c(kq.V);
   }

   public void b(dcv $$0) {
      this.a($$0, null);
   }

   void u() {
      this.h = 0;
      this.i = 0;
      dur.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(dcv $$0, @Nullable cut $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = bcb.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         dur.a(this.i(), this.aA_(), this.m());
      }
   }

   public int j() {
      return this.h;
   }

   public int k() {
      float $$0 = this.i > 1 ? this.j() / (this.i - 1.0F) : 1.0F;
      return bcb.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private dcv b(dcv $$0, @Nullable cut $$1) {
      if (this.n instanceof aub $$2) {
         dgf.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ek a(@Nullable cut $$0, aub $$1) {
      String $$2;
      xo $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xo.b("Lectern");
      } else {
         $$2 = $$0.aj().getString();
         $$3 = $$0.Q_();
      }

      fis $$6 = fis.b(this.o);
      return new ek(ej.a, $$6, fir.a, $$1, 2, $$2, $$3, $$1.q(), $$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.g = $$0.<dcv>a("Book", dcv.b).map($$0x -> this.b($$0x, null)).orElse(dcv.l);
      this.i = c(this.g);
      this.h = bcb.a($$0.a("Page", 0), 0, this.i - 1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.c().f()) {
         $$0.a("Book", dcv.b, this.c());
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(dcv.l);
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      if ($$1.c(dur.d) && this.n != null) {
         jh $$2 = $$1.c(dur.b);
         dcv $$3 = this.c().v();
         float $$4 = 0.25F * $$2.j();
         float $$5 = 0.25F * $$2.l();
         cqz $$6 = new cqz(this.n, $$0.u() + 0.5 + $$4, $$0.v() + 1, $$0.w() + 0.5 + $$5, $$3);
         $$6.i();
         this.n.b($$6);
      }
   }

   @Override
   public cym createMenu(int $$0, cus $$1, cut $$2) {
      return new czs($$0, this.e, this.f);
   }

   @Override
   public xo Q_() {
      return xo.c("container.lectern");
   }

   private static int c(dcv $$0) {
      dgf $$1 = $$0.a(kq.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dge $$2 = $$0.a(kq.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
