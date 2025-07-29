import javax.annotation.Nullable;

public class cqh extends cpu {
   private boolean b;
   @Nullable
   private faz c;
   @Nullable
   private fis d;

   public cqh(cps $$0) {
      super($$0);
   }

   @Override
   public void a(aub $$0) {
      if (!this.b && this.c != null) {
         jb $$1 = $$0.a(eka.a.f, enf.a(this.a.l()));
         if (!$$1.a(this.a.dv(), 10.0)) {
            this.a.gD().a(cqi.a);
         }
      } else {
         this.b = false;
         this.i();
      }
   }

   @Override
   public void c() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void i() {
      int $$0 = this.a.n();
      fis $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
      if (this.a.gE() != null && this.a.gE().e() > 0) {
         $$2 %= 12;
         if ($$2 < 0) {
            $$2 += 12;
         }
      } else {
         $$2 -= 12;
         $$2 &= 7;
         $$2 += 12;
      }

      this.c = this.a.a($$0, $$2, null);
      this.j();
   }

   private void j() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            kg $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = $$0.v() + this.a.ec().i() * 20.0F;
            } while ($$1 < $$0.v());

            this.d = new fis($$0.u(), $$1, $$0.w());
         }
      }
   }

   @Nullable
   @Override
   public fis f() {
      return this.d;
   }

   @Override
   public cqi<cqh> h() {
      return cqi.e;
   }
}
