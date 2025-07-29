import javax.annotation.Nullable;

public class cpx extends cpu {
   @Nullable
   private fis b;
   private int c;

   public cpx(cps $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ec().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ec().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ec().i() - 0.5F) * 8.0F;
         this.a.ai().a(me.v, this.a.dC() + $$0, this.a.dE() + 2.0 + $$1, this.a.dI() + $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(aub $$0) {
      this.c++;
      if (this.b == null) {
         jb $$1 = $$0.a(eka.a.e, enf.a(this.a.l()));
         this.b = fis.c($$1);
      }

      double $$2 = this.b.c(this.a.dC(), this.a.dE(), this.a.dI());
      if (!($$2 < 100.0) && !($$2 > 22500.0) && !this.a.ac && !this.a.ad) {
         this.a.x(1.0F);
      } else {
         this.a.x(0.0F);
      }
   }

   @Override
   public void c() {
      this.b = null;
      this.c = 0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public fis f() {
      return this.b;
   }

   @Override
   public cqi<cpx> h() {
      return cqi.j;
   }
}
