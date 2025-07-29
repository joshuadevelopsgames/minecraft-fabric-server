public class cxn extends cxg {
   private float b;
   private float c;

   public cxn(bzv<?> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      if (!$$0.gh() && !this.cd() && (this.ai().C || $$0.o(this))) {
         this.c = this.b;
         if (!this.ai().C) {
            return (bxj)($$0.o(this) ? bxj.c : bxj.e);
         } else {
            return bxj.a;
         }
      } else {
         return bxj.e;
      }
   }

   @Override
   protected dcr p() {
      return dcz.oM;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.oM);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.cd()) {
            this.bR();
         }

         if (this.I() == 0) {
            this.l(-this.J());
            this.d(10);
            this.a(50.0F);
            this.bG();
         }
      }
   }

   @Override
   public boolean x() {
      return true;
   }

   @Override
   public void g() {
      double $$0 = this.dP();
      fis $$1 = this.dv();
      super.g();
      double $$2 = (this.dP() - $$0) % 360.0;
      if (this.ai().C && $$1.f(this.dv()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bzm $$0, bzm.b $$1) {
      super.a($$0, $$1);
      if (this.ai().C && $$0 instanceof cut $$2 && $$2.ha() && b(this.ai())) {
         float $$3 = (float)bcb.e(0.5, (double)this.c, (double)this.b);
         $$2.v($$2.dP() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
