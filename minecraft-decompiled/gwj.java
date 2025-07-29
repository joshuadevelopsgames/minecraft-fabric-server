import com.mojang.authlib.GameProfile;

public class gwj extends gwf {
   private fis h = fis.c;
   private int i;

   public gwj(grk $$0, GameProfile $$1) {
      super($$0, $$1);
      this.aq = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cV().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cO();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean b(byb $$0) {
      return true;
   }

   @Override
   public void g() {
      super.g();
      this.s(false);
   }

   @Override
   public void e_() {
      if (this.bU()) {
         this.l_().e();
      }

      if (this.bH > 0) {
         this.a(this.bH, this.bG);
         this.bH--;
      }

      if (this.i > 0) {
         this.j(new fis((this.h.d - this.dA().d) / this.i, (this.h.e - this.dA().e) / this.i, (this.h.f - this.dA().f) / this.i));
         this.i--;
      }

      this.cr = this.cs;
      this.ff();
      float $$1;
      if (this.aK() && !this.eM()) {
         $$1 = (float)Math.min(0.1, this.dA().i());
      } else {
         $$1 = 0.0F;
      }

      this.cs = this.cs + ($$1 - this.cs) * 0.4F;

      try (bty $$2 = bts.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.h = new fis($$0, $$1, $$2);
      this.i = this.ap().p() + 1;
   }

   @Override
   protected void gl() {
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      this.bC();
   }
}
