import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class crd extends crv implements crz {
   private static final int a = 20;
   private static final int b = 40;
   private final cii<crd> c = new cii<>(this, 1.0, 20, 15.0F);
   private final chs d = new chs(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         crd.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         crd.this.w(true);
      }
   };

   protected crd(bzv<? extends crd> $$0, dmu $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void H() {
      this.ch.a(2, new cil(this));
      this.ch.a(3, new chb(this, 1.0));
      this.ch.a(3, new cgp<>(this, cpj.class, 6.0F, 1.0, 1.2));
      this.ch.a(5, new civ(this, 1.0));
      this.ch.a(6, new chq(this, cut.class, 8.0F));
      this.ch.a(6, new cid(this));
      this.ci.a(1, new cja(this));
      this.ci.a(2, new cjb<>(this, cut.class, true));
      this.ci.a(3, new cjb<>(this, cmv.class, true));
      this.ci.a(3, new cjb<>(this, cnm.class, 10, true, false, cnm.ck));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.w, 0.25);
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract ayy m();

   @Override
   public void e_() {
      boolean $$0 = this.gB();
      if ($$0) {
         dcv $$1 = this.a(bzw.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               dcr $$2 = $$1.h();
               $$1.b($$1.o() + this.ar.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bzw.f);
                  this.a(bzw.f, dcv.l);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.e(8.0F);
         }
      }

      super.e_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dn() instanceof cau $$0) {
         this.br = $$0.br;
      }
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      super.a($$0, $$1);
      this.a(bzw.a, new dcv(dcz.pA));
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bck $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bzw.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bzw.f, new dcv($$4.i() < 0.1F ? dqb.ew : dqb.ev));
            this.a(bzw.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.ai() != null && !this.ai().C) {
         this.ch.a(this.d);
         this.ch.a(this.c);
         dcv $$0 = this.b(cvq.a(this, dcz.pA));
         if ($$0.a(dcz.pA)) {
            int $$1 = this.t();
            if (this.ai().an() != bxg.d) {
               $$1 = this.gH();
            }

            this.c.c($$1);
            this.ch.a(4, this.c);
         } else {
            this.ch.a(4, this.d);
         }
      }
   }

   protected int t() {
      return 20;
   }

   protected int gH() {
      return 40;
   }

   @Override
   public void a(cam $$0, float $$1) {
      dcv $$2 = this.b(cvq.a(this, dcz.pA));
      dcv $$3 = this.d($$2);
      cvb $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.ai() instanceof aub $$9) {
         cvo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, 14 - $$9.an().a() * 4);
      }

      this.a(ayz.yC, 1.0F, 1.0F / (this.ec().i() * 0.4F + 0.8F));
   }

   protected cvb a(dcv $$0, float $$1, @Nullable dcv $$2) {
      return cvq.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(ddq $$0) {
      return $$0 == dcz.pA;
   }

   @Override
   public bae<dcr> ad() {
      return azx.bX;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bzw $$0, dcv $$1, dcv $$2) {
      super.a($$0, $$1, $$2);
      if (!this.ai().C) {
         this.n();
      }
   }

   public boolean gI() {
      return this.cA();
   }
}
