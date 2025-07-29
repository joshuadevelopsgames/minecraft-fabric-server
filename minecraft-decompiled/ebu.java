public class ebu extends eci {
   public static final int d = 9;
   private ju<dcv> e = ju.a(9, dcv.l);

   protected ebu(ebb<?> $$0, jb $$1, eeb $$2) {
      super($$0, $$1, $$2);
   }

   public ebu(jb $$0, eeb $$1) {
      this(ebb.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(bck $$0) {
      this.f_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).f() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public dcv b(dcv $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         dcv $$3 = this.e.get($$2);
         if ($$3.f() || dcv.c($$0, $$3)) {
            int $$4 = Math.min($$0.M(), $$1 - $$3.M());
            if ($$4 > 0) {
               if ($$3.f()) {
                  this.a($$2, $$0.a($$4));
               } else {
                  $$0.h($$4);
                  $$3.g($$4);
               }
            }

            if ($$0.f()) {
               break;
            }
         }
      }

      return $$0;
   }

   @Override
   protected xo j() {
      return xo.c("container.dispenser");
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.e = ju.a(this.b(), dcv.l);
      if (!this.c_($$0)) {
         bxd.a($$0, this.e);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.d_($$0)) {
         bxd.a($$0, this.e);
      }
   }

   @Override
   protected ju<dcv> f() {
      return this.e;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.e = $$0;
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return new czh($$0, $$1, this);
   }
}
