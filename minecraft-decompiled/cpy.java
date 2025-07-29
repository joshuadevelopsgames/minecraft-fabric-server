import javax.annotation.Nullable;

public class cpy extends cpu {
   private static final clc b = clc.a().d();
   @Nullable
   private faz c;
   @Nullable
   private fis d;
   private boolean e;

   public cpy(cps $$0) {
      super($$0);
   }

   @Override
   public cqi<cpy> h() {
      return cqi.a;
   }

   @Override
   public void a(aub $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dC(), this.a.dE(), this.a.dI());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.ac || this.a.ad) {
         this.b($$0);
      }
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public fis f() {
      return this.d;
   }

   private void b(aub $$0) {
      if (this.c != null && this.c.c()) {
         jb $$1 = $$0.a(eka.a.f, enf.a(this.a.l()));
         int $$2 = this.a.gE() == null ? 0 : this.a.gE().e();
         if (this.a.ec().a($$2 + 3) == 0) {
            this.a.gD().a(cqi.c);
            return;
         }

         cut $$3 = $$0.a(b, this.a, $$1.u(), $$1.v(), $$1.w());
         double $$4;
         if ($$3 != null) {
            $$4 = $$1.b($$3.dv()) / 512.0;
         } else {
            $$4 = 64.0;
         }

         if ($$3 != null && (this.a.ec().a((int)($$4 + 2.0)) == 0 || this.a.ec().a($$2 + 2) == 0)) {
            this.a($$3);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$6 = this.a.n();
         int $$7 = $$6;
         if (this.a.ec().a(8) == 0) {
            this.e = !this.e;
            $$7 = $$6 + 6;
         }

         if (this.e) {
            $$7++;
         } else {
            $$7--;
         }

         if (this.a.gE() != null && this.a.gE().e() >= 0) {
            $$7 %= 12;
            if ($$7 < 0) {
               $$7 += 12;
            }
         } else {
            $$7 -= 12;
            $$7 &= 7;
            $$7 += 12;
         }

         this.c = this.a.a($$6, $$7, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
   }

   private void a(cut $$0) {
      this.a.gD().a(cqi.b);
      this.a.gD().b(cqi.b).a($$0);
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         kg $$0 = this.c.g();
         this.c.a();
         double $$1 = $$0.u();
         double $$2 = $$0.w();

         double $$3;
         do {
            $$3 = $$0.v() + this.a.ec().i() * 20.0F;
         } while ($$3 < $$0.v());

         this.d = new fis($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cpr $$0, jb $$1, byb $$2, @Nullable cut $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
