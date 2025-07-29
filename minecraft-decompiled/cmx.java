import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmx extends cmd {
   public static final double ck = 0.6;
   public static final double cl = 0.8;
   public static final double cm = 1.33;
   private static final alh<Boolean> co = all.a(cmx.class, alj.k);
   private static final boolean cp = false;
   @Nullable
   private cmx.a<cut> cq;
   @Nullable
   private cmx.b cr;

   public cmx(bzv<? extends cmx> $$0, dmu $$1) {
      super($$0, $$1);
      this.n();
   }

   boolean t() {
      return this.ay.a(co);
   }

   private void x(boolean $$0) {
      this.ay.a(co, $$0);
      this.n();
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Trusting", this.t());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("Trusting", false));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(co, false);
   }

   @Override
   protected void H() {
      this.cr = new cmx.b(this, 0.6, $$0 -> $$0.a(azx.aN), true);
      this.ch.a(1, new chc(this));
      this.ch.a(3, this.cr);
      this.ch.a(7, new cho(this, 0.3F));
      this.ch.a(8, new chy(this));
      this.ch.a(9, new cgu(this, 0.8));
      this.ch.a(10, new civ(this, 0.8, 1.0000001E-5F));
      this.ch.a(11, new chq(this, cut.class, 10.0F));
      this.ci.a(1, new cjb<>(this, cmj.class, false));
      this.ci.a(1, new cjb<>(this, cnm.class, 10, false, false, cnm.ck));
   }

   @Override
   public void a(aub $$0) {
      if (this.Q().b()) {
         double $$1 = this.Q().c();
         if ($$1 == 0.6) {
            this.b(cay.f);
            this.i(false);
         } else if ($$1 == 1.33) {
            this.b(cay.a);
            this.i(true);
         } else {
            this.b(cay.a);
            this.i(false);
         }
      } else {
         this.b(cay.a);
         this.i(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && this.as > 2400;
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 10.0).a(cbs.w, 0.3F).a(cbs.c, 3.0);
   }

   @Nullable
   @Override
   protected ayy p() {
      return ayz.tB;
   }

   @Override
   public int W() {
      return 900;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.tA;
   }

   @Override
   protected ayy f_() {
      return ayz.tC;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ((this.cr == null || this.cr.k()) && !this.t() && this.i($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.ai().C) {
            if (this.ar.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.ai().a(this, (byte)41);
            } else {
               this.y(false);
               this.ai().a(this, (byte)40);
            }
         }

         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.y(true);
      } else if ($$0 == 40) {
         this.y(false);
      } else {
         super.b($$0);
      }
   }

   private void y(boolean $$0) {
      mc $$1 = me.S;
      if (!$$0) {
         $$1 = me.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ar.k() * 0.02;
         double $$4 = this.ar.k() * 0.02;
         double $$5 = this.ar.k() * 0.02;
         this.ai().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void n() {
      if (this.cq == null) {
         this.cq = new cmx.a<>(this, cut.class, 16.0F, 0.8, 1.33);
      }

      this.ch.a(this.cq);
      if (!this.t()) {
         this.ch.a(4, this.cq);
      }
   }

   @Nullable
   public cmx b(aub $$0, bzc $$1) {
      return bzv.aK.a($$0, bzu.e);
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aN);
   }

   public static boolean c(bzv<cmx> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dmx $$0) {
      if ($$0.f(this) && !$$0.d(this.cV())) {
         jb $$1 = this.dx();
         if ($$1.v() < $$0.Q()) {
            return false;
         }

         eeb $$2 = $$0.a_($$1.e());
         if ($$2.a(dqb.i) || $$2.a(azo.L)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$3 == null) {
         $$3 = new bzc.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.5F * this.cW(), this.ds() * 0.4F);
   }

   @Override
   public boolean ch() {
      return this.cl() || super.ch();
   }

   static class a<T extends cam> extends cgp<T> {
      private final cmx i;

      public a(cmx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bzt.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.t() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.t() && super.c();
      }
   }

   static class b extends ciq {
      private final cmx d;

      public b(cmx $$0, double $$1, Predicate<dcv> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.d.t();
      }
   }
}
