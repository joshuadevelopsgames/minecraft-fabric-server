import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cbi extends cmd implements cat {
   public static final int ck = 144;
   private static final int co = 2;
   private static final int cp = 3;
   private static final int cq = 1;
   private static final boolean cr = false;
   protected static final alh<Byte> cl = all.a(cbi.class, alj.a);
   protected static final alh<Optional<bzs<cam>>> cm = all.a(cbi.class, alj.r);
   private boolean cs = false;

   protected cbi(bzv<? extends cbi> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cl, (byte)0);
      $$0.a(cm, Optional.empty());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      bzs<cam> $$1 = this.d();
      bzs.a($$1, $$0, "Owner");
      $$0.a("Sitting", this.cs);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      bzs<cam> $$1 = bzs.a($$0, "Owner", this.ai());
      if ($$1 != null) {
         try {
            this.ay.a(cm, Optional.of($$1));
            this.a(true, false);
         } catch (Throwable var4) {
            this.a(false, true);
         }
      } else {
         this.ay.a(cm, Optional.empty());
         this.a(false, true);
      }

      this.cs = $$0.a("Sitting", false);
      this.y(this.cs);
   }

   @Override
   public boolean v() {
      return true;
   }

   protected void x(boolean $$0) {
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

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.x(true);
      } else if ($$0 == 6) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   public boolean m() {
      return (this.ay.a(cl) & 4) != 0;
   }

   public void a(boolean $$0, boolean $$1) {
      byte $$2 = this.ay.a(cl);
      if ($$0) {
         this.ay.a(cl, (byte)($$2 | 4));
      } else {
         this.ay.a(cl, (byte)($$2 & -5));
      }

      if ($$1) {
         this.n();
      }
   }

   protected void n() {
   }

   public boolean t() {
      return (this.ay.a(cl) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.ay.a(cl);
      if ($$0) {
         this.ay.a(cl, (byte)($$1 | 1));
      } else {
         this.ay.a(cl, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public bzs<cam> d() {
      return this.ay.a(cm).orElse(null);
   }

   public void i(@Nullable cam $$0) {
      this.ay.a(cm, Optional.ofNullable($$0).map(bzs::new));
   }

   public void a(@Nullable bzs<cam> $$0) {
      this.ay.a(cm, Optional.ofNullable($$0));
   }

   public void g(cut $$0) {
      this.a(true, true);
      this.i($$0);
      if ($$0 instanceof auc $$1) {
         aq.y.a($$1, this);
      }
   }

   @Override
   public boolean c(cam $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(cam $$0) {
      return $$0 == this.U_();
   }

   public boolean a(cam $$0, cam $$1) {
      return true;
   }

   @Nullable
   @Override
   public fjs cu() {
      fjs $$0 = super.cu();
      if ($$0 != null) {
         return $$0;
      } else {
         if (this.m()) {
            cam $$1 = this.V_();
            if ($$1 != null) {
               return $$1.cu();
            }
         }

         return null;
      }
   }

   @Override
   protected boolean u(bzm $$0) {
      if (this.m()) {
         cam $$1 = this.V_();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.u($$0);
         }
      }

      return super.u($$0);
   }

   @Override
   public void a(byb $$0) {
      if (this.ai() instanceof aub $$1 && $$1.P().c(dmq.o) && this.U_() instanceof auc $$2) {
         $$2.a(this.eY().a());
      }

      super.a($$0);
   }

   public boolean gH() {
      return this.cs;
   }

   public void z(boolean $$0) {
      this.cs = $$0;
   }

   public void gI() {
      cam $$0 = this.U_();
      if ($$0 != null) {
         this.h($$0.dx());
      }
   }

   public boolean gJ() {
      cam $$0 = this.U_();
      return $$0 != null && this.g(this.U_()) >= 144.0;
   }

   private void h(jb $$0) {
      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.ar.a(-3, 3);
         int $$3 = this.ar.a(-3, 3);
         if (Math.abs($$2) >= 2 || Math.abs($$3) >= 2) {
            int $$4 = this.ar.a(-1, 1);
            if (this.a($$0.u() + $$2, $$0.v() + $$4, $$0.w() + $$3)) {
               return;
            }
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (!this.i(new jb($$0, $$1, $$2))) {
         return false;
      } else {
         this.b($$0 + 0.5, $$1, $$2 + 0.5, this.dP(), this.dR());
         this.cg.n();
         return true;
      }
   }

   private boolean i(jb $$0) {
      fbc $$1 = fbh.b(this, $$0);
      if ($$1 != fbc.c) {
         return false;
      } else {
         eeb $$2 = this.ai().a_($$0.e());
         if (!this.gL() && $$2.b() instanceof duq) {
            return false;
         } else {
            jb $$3 = $$0.b(this.dx());
            return this.ai().a(this, this.cV().a($$3));
         }
      }
   }

   public final boolean gK() {
      return this.gH() || this.cc() || this.u() || this.U_() != null && this.U_().am();
   }

   protected boolean gL() {
      return false;
   }

   public class a extends cib {
      public a(final double $$1, final bae<byd> $$2) {
         super(cbi.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(cbi.this, $$1);
      }

      @Override
      public void a() {
         if (!cbi.this.gK() && cbi.this.gJ()) {
            cbi.this.gI();
         }

         super.a();
      }
   }
}
