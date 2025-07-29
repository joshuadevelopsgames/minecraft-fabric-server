import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqg extends cpu {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private faz e;
   @Nullable
   private fis f;
   @Nullable
   private cam g;
   private boolean h;

   public cqg(cps $$0) {
      super($$0);
   }

   @Override
   public void a(aub $$0) {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gD().a(cqi.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$1 = this.g.dC();
            double $$2 = this.g.dI();
            double $$3 = $$1 - this.a.dC();
            double $$4 = $$2 - this.a.dI();
            double $$5 = Math.sqrt($$3 * $$3 + $$4 * $$4);
            double $$6 = Math.min(0.4F + $$5 / 80.0 - 1.0, 10.0);
            this.f = new fis($$1, this.g.dE() + $$6, $$2);
         }

         double $$7 = this.f == null ? 0.0 : this.f.c(this.a.dC(), this.a.dE(), this.a.dI());
         if ($$7 < 100.0 || $$7 > 22500.0) {
            this.i();
         }

         double $$8 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.F(this.g)) {
               this.d++;
               fis $$9 = new fis(this.g.dC() - this.a.dC(), 0.0, this.g.dI() - this.a.dI()).d();
               fis $$10 = new fis(bcb.a(this.a.dP() * (float) (Math.PI / 180.0)), 0.0, -bcb.b(this.a.dP() * (float) (Math.PI / 180.0))).d();
               float $$11 = (float)$$10.b($$9);
               float $$12 = (float)(Math.acos($$11) * 180.0F / (float)Math.PI);
               $$12 += 0.5F;
               if (this.d >= 5 && $$12 >= 0.0F && $$12 < 10.0F) {
                  double $$13 = 1.0;
                  fis $$14 = this.a.h(1.0F);
                  double $$15 = this.a.c.dC() - $$14.d * 1.0;
                  double $$16 = this.a.c.e(0.5) + 0.5;
                  double $$17 = this.a.c.dI() - $$14.f * 1.0;
                  double $$18 = this.g.dC() - $$15;
                  double $$19 = this.g.e(0.5) - $$16;
                  double $$20 = this.g.dI() - $$17;
                  fis $$21 = new fis($$18, $$19, $$20);
                  if (!this.a.be()) {
                     $$0.a(null, 1017, this.a.dx(), 0);
                  }

                  cvf $$22 = new cvf($$0, this.a, $$21.d());
                  $$22.b($$15, $$16, $$17, 0.0F, 0.0F);
                  $$0.b($$22);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gD().a(cqi.a);
               }
            } else if (this.d > 0) {
               this.d--;
            }
         } else if (this.d > 0) {
            this.d--;
         }
      }
   }

   private void i() {
      if (this.e == null || this.e.c()) {
         int $$0 = this.a.n();
         int $$1 = $$0;
         if (this.a.ec().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gE() != null && this.a.gE().e() > 0) {
            $$1 %= 12;
            if ($$1 < 0) {
               $$1 += 12;
            }
         } else {
            $$1 -= 12;
            $$1 &= 7;
            $$1 += 12;
         }

         this.e = this.a.a($$0, $$1, null);
         if (this.e != null) {
            this.e.a();
         }
      }

      this.j();
   }

   private void j() {
      if (this.e != null && !this.e.c()) {
         kg $$0 = this.e.g();
         this.e.a();
         double $$1 = $$0.u();
         double $$2 = $$0.w();

         double $$3;
         do {
            $$3 = $$0.v() + this.a.ec().i() * 20.0F;
         } while ($$3 < $$0.v());

         this.f = new fis($$1, $$3, $$2);
      }
   }

   @Override
   public void c() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(cam $$0) {
      this.g = $$0;
      int $$1 = this.a.n();
      int $$2 = this.a.q(this.g.dC(), this.g.dE(), this.g.dI());
      int $$3 = this.g.dB();
      int $$4 = this.g.dH();
      double $$5 = $$3 - this.a.dC();
      double $$6 = $$4 - this.a.dI();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = bcb.a(this.g.dE() + $$8);
      fax $$10 = new fax($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.j();
      }
   }

   @Nullable
   @Override
   public fis f() {
      return this.f;
   }

   @Override
   public cqi<cqg> h() {
      return cqi.b;
   }
}
