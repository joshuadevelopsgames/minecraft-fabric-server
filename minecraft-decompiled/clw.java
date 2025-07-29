import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class clw extends clv {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final alh<Byte> e = all.a(clw.class, alj.a);
   private static final int f = 1;
   private static final clc cj = clc.b().a(4.0);
   private static final byte ck = 0;
   public final bzd c = new bzd();
   public final bzd d = new bzd();
   @Nullable
   private jb cl;

   public clw(bzv<? extends clw> $$0, dmu $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.x(true);
      }
   }

   @Override
   public boolean bd() {
      return !this.m() && this.as % 10.0F == 0.0F;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   protected float fk() {
      return 0.1F;
   }

   @Override
   public float fl() {
      return super.fl() * 0.95F;
   }

   @Nullable
   @Override
   public ayy p() {
      return this.m() && this.ar.a(4) != 0 ? null : ayz.bF;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.bH;
   }

   @Override
   protected ayy f_() {
      return ayz.bG;
   }

   @Override
   public boolean bL() {
      return false;
   }

   @Override
   protected void E(bzm $$0) {
   }

   @Override
   protected void o() {
   }

   public static cbr.a l() {
      return cao.I().a(cbs.t, 6.0);
   }

   public boolean m() {
      return (this.ay.a(e) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ay.a(e);
      if ($$0) {
         this.ay.a(e, (byte)($$1 | 1));
      } else {
         this.ay.a(e, (byte)($$1 & -2));
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.m()) {
         this.i(fis.c);
         this.o(this.dC(), bcb.a(this.dE()) + 1.0 - this.dt(), this.dI());
      } else {
         this.i(this.dA().d(1.0, 0.6, 1.0));
      }

      this.t();
   }

   @Override
   protected void a(aub $$0) {
      super.a($$0);
      jb $$1 = this.dx();
      jb $$2 = $$1.d();
      if (this.m()) {
         boolean $$3 = this.be();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ar.a(200) == 0) {
               this.bt = this.ar.a(360);
            }

            if ($$0.a(cj, this) != null) {
               this.x(false);
               if (!$$3) {
                  $$0.a(null, 1025, $$1, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$3) {
               $$0.a(null, 1025, $$1, 0);
            }
         }
      } else {
         if (this.cl != null && (!$$0.w(this.cl) || this.cl.v() <= $$0.L_())) {
            this.cl = null;
         }

         if (this.cl == null || this.ar.a(30) == 0 || this.cl.a(this.dv(), 2.0)) {
            this.cl = jb.a(this.dC() + this.ar.a(7) - this.ar.a(7), this.dE() + this.ar.a(6) - 2.0, this.dI() + this.ar.a(7) - this.ar.a(7));
         }

         double $$4 = this.cl.u() + 0.5 - this.dC();
         double $$5 = this.cl.v() + 0.1 - this.dE();
         double $$6 = this.cl.w() + 0.5 - this.dI();
         fis $$7 = this.dA();
         fis $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.i($$8);
         float $$9 = (float)(bcb.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = bcb.h($$9 - this.dP());
         this.bE = 0.5F;
         this.v(this.dP() + $$10);
         if (this.ar.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.x(true);
         }
      }
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   public boolean n_() {
      return true;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (this.m()) {
            this.x(false);
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.ay.a(e, $$0.a("BatFlags", (byte)0));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("BatFlags", this.ay.a(e).byteValue());
   }

   public static boolean b(bzv<clw> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      if ($$3.v() >= $$1.a(eka.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.C($$3);
         int $$6 = 4;
         if (n()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(azo.cm) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean n() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void t() {
      if (this.m()) {
         this.c.a();
         this.d.b(this.as);
      } else {
         this.d.a();
         this.c.b(this.as);
      }
   }
}
