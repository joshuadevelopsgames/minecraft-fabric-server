public class hvg extends huz {
   public static final int n = 20;
   private final gwi o;
   private int p;

   public hvg(gwi $$0) {
      super(ayz.iD, aza.h, hvr.t());
      this.o = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.1F;
   }

   @Override
   public void q() {
      this.p++;
      if (!this.o.dU() && (this.p <= 20 || this.o.fQ())) {
         this.f = (float)this.o.dC();
         this.g = (float)this.o.dE();
         this.h = (float)this.o.dI();
         float $$0 = (float)this.o.dA().h();
         if ($$0 >= 1.0E-7) {
            this.d = bcb.a($$0 / 4.0F, 0.0F, 1.0F);
         } else {
            this.d = 0.0F;
         }

         if (this.p < 20) {
            this.d = 0.0F;
         } else if (this.p < 40) {
            this.d = this.d * ((this.p - 20) / 20.0F);
         }

         float $$1 = 0.8F;
         if (this.d > 0.8F) {
            this.e = 1.0F + (this.d - 0.8F);
         } else {
            this.e = 1.0F;
         }
      } else {
         this.n();
      }
   }
}
