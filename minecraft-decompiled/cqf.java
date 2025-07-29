public class cqf extends cpv {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final clc f = clc.a().a(150.0);
   private final clc g;
   private int h;

   public cqf(cps $$0) {
      super($$0);
      this.g = clc.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dE() - $$0.dE()) <= 10.0);
   }

   @Override
   public void a(aub $$0) {
      this.h++;
      cam $$1 = $$0.a(this.g, this.a, this.a.dC(), this.a.dE(), this.a.dI());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.gD().a(cqi.h);
         } else {
            fis $$2 = new fis($$1.dC() - this.a.dC(), 0.0, $$1.dI() - this.a.dI()).d();
            fis $$3 = new fis(bcb.a(this.a.dP() * (float) (Math.PI / 180.0)), 0.0, -bcb.b(this.a.dP() * (float) (Math.PI / 180.0))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos($$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dC() - this.a.c.dC();
               double $$7 = $$1.dI() - this.a.c.dI();
               double $$8 = bcb.a(bcb.d(180.0 - bcb.d($$6, $$7) * 180.0F / (float)Math.PI - this.a.dP()), -100.0, 100.0);
               this.a.ck *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.ck += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.v(this.a.dP() + this.a.ck);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dC(), this.a.dE(), this.a.dI());
         this.a.gD().a(cqi.e);
         if ($$1 != null) {
            this.a.gD().a(cqi.i);
            this.a.gD().b(cqi.i).a(new fis($$1.dC(), $$1.dE(), $$1.dI()));
         }
      }
   }

   @Override
   public void c() {
      this.h = 0;
   }

   @Override
   public cqi<cqf> h() {
      return cqi.g;
   }
}
