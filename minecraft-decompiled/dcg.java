public class dcg<T extends bzm & caj> extends dcr {
   private final bzv<T> a;
   private final int b;

   public dcg(bzv<T> $$0, int $$1, dcr.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      if ($$0.C) {
         return bxj.e;
      } else {
         bzm $$4 = $$1.dn();
         if ($$1.cc() && $$4 instanceof caj $$5 && $$4.ap() == this.a && $$5.a()) {
            bzw $$6 = cam.d($$2);
            dcv $$7 = $$3.a(this.b, dcz.su, $$1, $$6);
            return bxj.b.a($$7);
         } else {
            $$1.b(azj.c.b(this));
            return bxj.e;
         }
      }
   }
}
