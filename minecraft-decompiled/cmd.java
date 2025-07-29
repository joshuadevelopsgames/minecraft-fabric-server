import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cmd extends bzc {
   protected static final int cn = 6000;
   private static final int ck = 0;
   private int cl = 0;
   @Nullable
   private bzs<auc> cm;

   protected cmd(bzv<? extends cmd> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.n, 16.0F);
      this.a(fbc.o, -1.0F);
   }

   public static cbr.a gM() {
      return cao.I().a(cbs.F, 10.0);
   }

   @Override
   protected void a(aub $$0) {
      if (this.Z_() != 0) {
         this.cl = 0;
      }

      super.a($$0);
   }

   @Override
   public void e_() {
      super.e_();
      if (this.Z_() != 0) {
         this.cl = 0;
      }

      if (this.cl > 0) {
         this.cl--;
         if (this.cl % 10 == 0) {
            double $$0 = this.ar.k() * 0.02;
            double $$1 = this.ar.k() * 0.02;
            double $$2 = this.ar.k() * 0.02;
            this.ai().a(me.S, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void c(aub $$0, byb $$1, float $$2) {
      this.gS();
      super.c($$0, $$1, $$2);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return $$1.a_($$0.e()).a(dqb.i) ? 10.0F : $$1.y($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("InLove", this.cl);
      bzs.a(this.cm, $$0, "LoveCause");
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.cl = $$0.a("InLove", 0);
      this.cm = bzs.a($$0, "LoveCause");
   }

   public static boolean b(bzv<? extends cmd> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      boolean $$5 = bzu.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(azo.cb) && $$5;
   }

   protected static boolean a(dlv $$0, jb $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int W() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(aub $$0) {
      return 1 + this.ar.a(3);
   }

   public abstract boolean i(dcv var1);

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (this.i($$2)) {
         int $$3 = this.Z_();
         if ($$0 instanceof auc $$4 && $$3 == 0 && this.gO()) {
            this.a($$0, $$1, $$2);
            this.h($$4);
            this.gN();
            return bxj.b;
         }

         if (this.g_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gN();
            return bxj.a;
         }

         if (this.ai().C) {
            return bxj.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gN() {
   }

   protected void a(cut $$0, bxi $$1, dcv $$2) {
      int $$3 = $$2.M();
      dgc $$4 = $$2.a(kq.x);
      $$2.a(1, $$0);
      if ($$4 != null) {
         dcv $$5 = $$4.a($$2, $$3, $$0.gc(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gO() {
      return this.cl <= 0;
   }

   public void h(@Nullable cut $$0) {
      this.cl = 600;
      if ($$0 instanceof auc $$1) {
         this.cm = new bzs<>($$1);
      }

      this.ai().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.cl = $$0;
   }

   public int gP() {
      return this.cl;
   }

   @Nullable
   public auc gQ() {
      return bzs.a(this.cm, this.ai()::a, auc.class);
   }

   public boolean gR() {
      return this.cl > 0;
   }

   public void gS() {
      this.cl = 0;
   }

   public boolean a(cmd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gR() && $$0.gR();
      }
   }

   public void a(aub $$0, cmd $$1) {
      bzc $$2 = this.a($$0, (bzc)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dC(), this.dE(), this.dI(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aub $$0, cmd $$1, @Nullable bzc $$2) {
      Optional.ofNullable(this.gQ()).or(() -> Optional.ofNullable($$1.gQ())).ifPresent($$2x -> {
         $$2x.a(azj.Q);
         aq.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gS();
      $$1.gS();
      $$0.a(this, (byte)18);
      if ($$0.P().c(dmq.g)) {
         $$0.b(new caa($$0, this.dC(), this.dE(), this.dI(), this.ec().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ar.k() * 0.02;
            double $$3 = this.ar.k() * 0.02;
            double $$4 = this.ar.k() * 0.02;
            this.ai().a(me.S, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
