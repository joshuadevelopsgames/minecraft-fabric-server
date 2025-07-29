public class hht extends hit<hmc, gop> {
   private final gnx<hmc> a;
   private final hty b;

   public hht(hgc<hmc, gop> $$0, gqj $$1, hty $$2) {
      super($$0);
      this.a = new gon<>($$1.a(gqm.cz));
      this.b = $$2;
   }

   private boolean a(dcv $$0, htz.d $$1) {
      dle $$2 = $$0.a(kq.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         htz $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fod $$0, gxn $$1, int $$2, hmc $$3, float $$4, float $$5) {
      if (!$$3.A && $$3.aB) {
         hst $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Z, htz.d.c)) {
               $$0.a();
               if (this.a($$3.Z, htz.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fog $$7 = $$1.getBuffer(gxz.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hri.d);
               $$0.b();
            }
         }
      }
   }
}
