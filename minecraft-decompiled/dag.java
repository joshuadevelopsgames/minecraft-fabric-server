public class dag extends dak {
   private final cze a;
   private final cut b;
   private int g;

   public dag(cut $$0, cze $$1, bxc $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(dcv $$0) {
      return false;
   }

   @Override
   public dcv a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(dcv $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void c_(dcv $$0) {
      if (this.g > 0) {
         $$0.a(this.b, this.g);
      }

      if (this.c instanceof dad $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   private static ju<dcv> a(dha $$0) {
      ju<dcv> $$1 = ju.a($$0.a(), dcv.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, $$0.a($$2));
      }

      return $$1;
   }

   private ju<dcv> a(dha $$0, dmu $$1) {
      return $$1 instanceof aub $$2 ? $$2.u().a(dhx.a, $$0, $$2).map($$1x -> ((dhb)$$1x.b()).a($$0)).orElseGet(() -> a($$0)) : dhb.b($$0);
   }

   @Override
   public void a(cut $$0, dcv $$1) {
      this.c_($$1);
      dha.a $$2 = this.a.aC_();
      dha $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      ju<dcv> $$6 = this.a($$3, $$0.ai());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.ay_();
            dcv $$10 = this.a.a($$9);
            dcv $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (dcv.c($$10, $$11)) {
                  $$11.g($$10.M());
                  this.a.a($$9, $$11);
               } else if (!this.b.gs().g($$11)) {
                  this.b.a($$11, false);
               }
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}
