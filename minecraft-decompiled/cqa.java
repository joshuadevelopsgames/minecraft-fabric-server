import javax.annotation.Nullable;

public class cqa extends cpu {
   private static final clc b = clc.a().d();
   @Nullable
   private faz c;
   @Nullable
   private fis d;

   public cqa(cps $$0) {
      super($$0);
   }

   @Override
   public cqi<cqa> h() {
      return cqi.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(aub $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dC(), this.a.dE(), this.a.dI());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.ac || this.a.ad) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public fis f() {
      return this.d;
   }

   private void b(aub $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.n();
         jb $$2 = $$0.a(eka.a.f, enf.a(this.a.l()));
         cut $$3 = $$0.a(b, this.a, $$2.u(), $$2.v(), $$2.w());
         int $$5;
         if ($$3 != null) {
            fis $$4 = new fis($$3.dC(), 0.0, $$3.dI()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, $$2.v(), 0.0);
         }

         fax $$7 = new fax($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.gD().a(cqi.d);
      }
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
}
