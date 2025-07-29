import javax.annotation.Nullable;

public class crt extends csf implements crz {
   private static final int e = 4;
   private static final int f = 3;
   public static final int a = 3;
   private int ck;
   private final fis[][] cl;

   public crt(bzv<? extends crt> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
      this.cl = new fis[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cl[0][$$2] = fis.c;
         this.cl[1][$$2] = fis.c;
      }
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(1, new csf.b());
      this.ch.a(3, new cgp<>(this, csz.class, 8.0F, 1.0, 1.2));
      this.ch.a(4, new crt.b());
      this.ch.a(5, new crt.a());
      this.ch.a(6, new cii<>(this, 0.5, 20, 15.0F));
      this.ch.a(8, new cif(this, 0.6));
      this.ch.a(9, new chq(this, cut.class, 3.0F, 1.0F));
      this.ch.a(10, new chq(this, cao.class, 8.0F));
      this.ci.a(1, new cja(this, cwk.class).a());
      this.ci.a(2, new cjb<>(this, cut.class, true).c(300));
      this.ci.a(3, new cjb<>(this, cua.class, false).c(300));
      this.ci.a(3, new cjb<>(this, cmv.class, false).c(300));
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.w, 0.5).a(cbs.n, 18.0).a(cbs.t, 32.0);
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.a(bzw.a, new dcv(dcz.pA));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void e_() {
      super.e_();
      if (this.ai().C && this.cs()) {
         this.ck--;
         if (this.ck < 0) {
            this.ck = 0;
         }

         if (this.bj == 1 || this.as % 1200 == 0) {
            this.ck = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cl[0][$$2] = this.cl[1][$$2];
               this.cl[1][$$2] = new fis((-6.0F + this.ar.a(13)) * 0.5, Math.max(0, this.ar.a(6) - 4), (-6.0F + this.ar.a(13)) * 0.5);
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.ai().a(me.e, this.d(0.5), this.dF(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.og, this.do(), 1.0F, 1.0F, false);
         } else if (this.bj == this.bk - 1) {
            this.ck = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cl[0][$$4] = this.cl[1][$$4];
               this.cl[1][$$4] = new fis(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public ayy ag_() {
      return ayz.oc;
   }

   public fis[] J(float $$0) {
      if (this.ck <= 0) {
         return this.cl[1];
      } else {
         double $$1 = (this.ck - $$0) / 3.0F;
         $$1 = Math.pow($$1, 0.25);
         fis[] $$2 = new fis[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cl[1][$$3].c(1.0 - $$1).e(this.cl[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected ayy p() {
      return ayz.oc;
   }

   @Override
   protected ayy f_() {
      return ayz.oe;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.of;
   }

   @Override
   protected ayy t() {
      return ayz.od;
   }

   @Override
   public void a(aub $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(cam $$0, float $$1) {
      dcv $$2 = this.b(cvq.a(this, dcz.pA));
      dcv $$3 = this.d($$2);
      cvb $$4 = cvq.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.ai() instanceof aub $$9) {
         cvo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, 14 - $$9.an().a() * 4);
      }

      this.a(ayz.yC, 1.0F, 1.0F / (this.ec().i() * 0.4F + 0.8F));
   }

   @Override
   public crc.a l() {
      if (this.gQ()) {
         return crc.a.c;
      } else {
         return this.gy() ? crc.a.d : crc.a.a;
      }
   }

   class a extends csf.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (crt.this.e() == null) {
            return false;
         } else {
            return crt.this.e().ar() == this.e ? false : crt.this.ai().d_(crt.this.dx()).a(bxg.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         cam $$0 = crt.this.e();
         if ($$0 != null) {
            this.e = $$0.ar();
         }
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 180;
      }

      @Override
      protected void k() {
         crt.this.e().b(new byq(bys.o, 400), crt.this);
      }

      @Override
      protected ayy l() {
         return ayz.oh;
      }

      @Override
      protected csf.a m() {
         return csf.a.f;
      }
   }

   class b extends csf.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !crt.this.d(bys.n);
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         crt.this.a(new byq(bys.n, 1200));
      }

      @Nullable
      @Override
      protected ayy l() {
         return ayz.oi;
      }

      @Override
      protected csf.a m() {
         return csf.a.e;
      }
   }
}
