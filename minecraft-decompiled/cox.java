import javax.annotation.Nullable;

public class cox extends chi {
   private final cow a;

   public cox(cow $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.ai().a(this.a.dC(), this.a.dE(), this.a.dI(), 10.0);
   }

   @Override
   public void a() {
      aub $$0 = (aub)this.a.ai();
      bxh $$1 = $$0.d_(this.a.dx());
      this.a.x(false);
      this.a.y(true);
      this.a.c_(0);
      cal $$2 = bzv.ay.a($$0, bzu.k);
      if ($$2 != null) {
         $$2.d(this.a.dC(), this.a.dE(), this.a.dI());
         $$2.a(true);
         $$0.b($$2);
         csd $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.o(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               coq $$5 = this.a($$1);
               if ($$5 != null) {
                  csd $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.o($$5);
                     $$5.i(this.a.ec().a(0.0, 1.1485), 0.0, this.a.ec().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private coq a(bxh $$0) {
      cow $$1 = bzv.bi.a(this.a.ai(), bzu.k);
      if ($$1 != null) {
         $$1.a((aub)this.a.ai(), $$0, bzu.k, null);
         $$1.a_(this.a.dC(), this.a.dE(), this.a.dI());
         $$1.aw = 60;
         $$1.gp();
         $$1.y(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private csd a(bxh $$0, coq $$1) {
      csd $$2 = bzv.bh.a($$1.ai(), bzu.k);
      if ($$2 != null) {
         $$2.a((aub)$$1.ai(), $$0, bzu.k, null);
         $$2.a_($$1.dC(), $$1.dE(), $$1.dI());
         $$2.aw = 60;
         $$2.gp();
         if ($$2.a(bzw.f).f()) {
            $$2.a(bzw.f, new dcv(dcz.qL));
         }

         this.a($$2, bzw.a, $$0);
         this.a($$2, bzw.f, $$0);
      }

      return $$2;
   }

   private void a(csd $$0, bzw $$1, bxh $$2) {
      dcv $$3 = $$0.a($$1);
      $$3.b(kq.l, djo.a);
      djk.a($$3, $$0.ai().K_(), dkw.a, $$2, $$0.ec());
      $$0.a($$1, $$3);
   }
}
