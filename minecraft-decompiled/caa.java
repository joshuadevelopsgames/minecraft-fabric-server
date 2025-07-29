import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class caa extends bzm {
   protected static final alh<Integer> a = all.a(caa.class, alj.b);
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private static final short g = 5;
   private static final short h = 0;
   private static final short i = 0;
   private static final int j = 1;
   private int k = 0;
   private int l = 5;
   private int m = 1;
   @Nullable
   private cut n;
   private final cah o = new cah(this);

   public caa(dmu $$0, double $$1, double $$2, double $$3, int $$4) {
      this($$0, new fis($$1, $$2, $$3), fis.c, $$4);
   }

   public caa(dmu $$0, fis $$1, fis $$2, int $$3) {
      this(bzv.W, $$0);
      this.b($$1);
      if (!$$0.C) {
         this.v(this.ar.i() * 360.0F);
         fis $$4 = new fis((this.ar.j() * 0.2 - 0.1) * 2.0, this.ar.j() * 0.2 * 2.0, (this.ar.j() * 0.2 - 0.1) * 2.0);
         if ($$2.h() > 0.0 && $$2.b($$4) < 0.0) {
            $$4 = $$4.c(-1.0);
         }

         double $$5 = this.cV().a();
         this.b($$1.e($$2.d().c($$5 * 0.5)));
         this.i($$4);
         if (!$$0.b(this.cV())) {
            this.h($$5);
         }
      }

      this.c($$3);
   }

   public caa(bzv<? extends caa> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected void h(double $$0) {
      fis $$1 = this.dv().b(0.0, this.dt() / 2.0, 0.0);
      fjm $$2 = fjj.a(fin.a($$1, $$0, $$0, $$0));
      this.ai().a(this, $$2, $$1, this.ds(), this.dt(), this.ds()).ifPresent($$0x -> this.b($$0x.b(0.0, -this.dt() / 2.0, 0.0)));
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(a, 0);
   }

   @Override
   protected double bg() {
      return 0.03;
   }

   @Override
   public void g() {
      this.o.e();
      if (this.ax && this.ai().C) {
         this.ax = false;
      } else {
         super.g();
         boolean $$0 = !this.ai().b(this.cV());
         if (this.a(azu.a)) {
            this.m();
         } else if (!$$0) {
            this.bi();
         }

         if (this.ai().b_(this.dx()).a(azu.b)) {
            this.n((this.ar.i() - this.ar.i()) * 0.2F, 0.2F, (this.ar.i() - this.ar.i()) * 0.2F);
         }

         if (this.as % 20 == 1) {
            this.l();
         }

         this.i();
         if (this.n == null && !this.ai().C && $$0) {
            boolean $$1 = !this.ai().b(this.cV().c(this.dA()));
            if ($$1) {
               this.l(this.dC(), (this.cV().b + this.cV().e) / 2.0, this.dI());
               this.aE = true;
            }
         }

         double $$2 = this.dA().e;
         this.a(caq.a, this.dA());
         this.aL();
         float $$3 = 0.98F;
         if (this.aK()) {
            $$3 = this.ai().a_(this.aT()).b().g() * 0.98F;
         }

         this.i(this.dA().c((double)$$3));
         if (this.ae && $$2 < -this.bh()) {
            this.i(new fis(this.dA().d, -$$2 * 0.4, this.dA().f));
         }

         this.k++;
         if (this.k >= 6000) {
            this.at();
         }
      }
   }

   private void i() {
      if (this.n == null || this.n.am() || this.n.g(this) > 64.0) {
         cut $$0 = this.ai().a(this, 8.0);
         if ($$0 != null && !$$0.am() && !$$0.eM()) {
            this.n = $$0;
         } else {
            this.n = null;
         }
      }

      if (this.n != null) {
         fis $$1 = new fis(this.n.dC() - this.dC(), this.n.dE() + this.n.cW() / 2.0 - this.dE(), this.n.dI() - this.dI());
         double $$2 = $$1.h();
         double $$3 = 1.0 - Math.sqrt($$2) / 8.0;
         this.i(this.dA().e($$1.d().c($$3 * $$3 * 0.1)));
      }
   }

   @Override
   public jb aT() {
      return this.f(0.999999F);
   }

   private void l() {
      if (this.ai() instanceof aub) {
         for (caa $$1 : this.ai().a(ein.a(caa.class), this.cV().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(aub $$0, fis $$1, int $$2) {
      a($$0, $$1, fis.c, $$2);
   }

   public static void a(aub $$0, fis $$1, fis $$2, int $$3) {
      while ($$3 > 0) {
         int $$4 = b($$3);
         $$3 -= $$4;
         if (!b($$0, $$1, $$4)) {
            $$0.b(new caa($$0, $$1, $$2, $$4));
         }
      }
   }

   private static boolean b(aub $$0, fis $$1, int $$2) {
      fin $$3 = fin.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.H_().a(40);
      List<caa> $$5 = $$0.a(ein.a(caa.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         caa $$6 = $$5.get(0);
         $$6.m++;
         $$6.k = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(caa $$0) {
      return $$0 != this && a($$0, this.ar(), this.e());
   }

   private static boolean a(caa $$0, int $$1, int $$2) {
      return !$$0.dU() && ($$0.ar() - $$1) % 40 == 0 && $$0.e() == $$2;
   }

   private void b(caa $$0) {
      this.m = this.m + $$0.m;
      this.k = Math.min(this.k, $$0.k);
      $$0.at();
   }

   private void m() {
      fis $$0 = this.dA();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bv() {
   }

   @Override
   public final boolean b(byb $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else {
         this.bG();
         this.l = (int)(this.l - $$2);
         if (this.l <= 0) {
            this.at();
         }

         return true;
      }
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("Health", (short)this.l);
      $$0.a("Age", (short)this.k);
      $$0.a("Value", (short)this.e());
      $$0.a("Count", this.m);
   }

   @Override
   protected void a(fda $$0) {
      this.l = $$0.a("Health", (short)5);
      this.k = $$0.a("Age", (short)0);
      this.c($$0.a("Value", (short)0));
      this.m = $$0.<Integer>a("Count", bbi.p).orElse(1);
   }

   @Override
   public void a_(cut $$0) {
      if ($$0 instanceof auc $$1) {
         if ($$0.ct == 0) {
            $$0.ct = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.e());
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.m--;
            if (this.m == 0) {
               this.at();
            }
         }
      }
   }

   private int a(auc $$0, int $$1) {
      Optional<djh> $$2 = djk.a(djj.z, $$0, dcv::n);
      if ($$2.isPresent()) {
         dcv $$3 = $$2.get().a();
         int $$4 = djk.c($$0.y(), $$3, $$1);
         int $$5 = Math.min($$4, $$3.o());
         $$3.b($$3.o() - $$5);
         if ($$5 > 0) {
            int $$6 = $$1 - $$5 * $$1 / $$4;
            if ($$6 > 0) {
               return this.a($$0, $$6);
            }
         }

         return 0;
      } else {
         return $$1;
      }
   }

   public int e() {
      return this.ay.a(a);
   }

   private void c(int $$0) {
      this.ay.a(a, $$0);
   }

   public int f() {
      int $$0 = this.e();
      if ($$0 >= 2477) {
         return 10;
      } else if ($$0 >= 1237) {
         return 9;
      } else if ($$0 >= 617) {
         return 8;
      } else if ($$0 >= 307) {
         return 7;
      } else if ($$0 >= 149) {
         return 6;
      } else if ($$0 >= 73) {
         return 5;
      } else if ($$0 >= 37) {
         return 4;
      } else if ($$0 >= 17) {
         return 3;
      } else if ($$0 >= 7) {
         return 2;
      } else {
         return $$0 >= 3 ? 1 : 0;
      }
   }

   public static int b(int $$0) {
      if ($$0 >= 2477) {
         return 2477;
      } else if ($$0 >= 1237) {
         return 1237;
      } else if ($$0 >= 617) {
         return 617;
      } else if ($$0 >= 307) {
         return 307;
      } else if ($$0 >= 149) {
         return 149;
      } else if ($$0 >= 73) {
         return 73;
      } else if ($$0 >= 37) {
         return 37;
      } else if ($$0 >= 17) {
         return 17;
      } else if ($$0 >= 7) {
         return 7;
      } else {
         return $$0 >= 3 ? 3 : 1;
      }
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Override
   public aza do() {
      return aza.i;
   }

   @Override
   public cah l_() {
      return this.o;
   }
}
