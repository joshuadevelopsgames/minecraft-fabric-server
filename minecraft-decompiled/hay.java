public class hay implements hac<edi> {
   private final hof a;
   private final bck b = bck.a();
   private final hll c = new hll();

   public hay(had.a $$0) {
      this.a = $$0.d();
   }

   public void a(edi $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      if (edi.a.a($$0.c())) {
         dmu $$7 = $$0.i();
         if ($$7 != null) {
            dcv $$8 = $$0.c().a();
            if (!$$8.f()) {
               this.a.a(this.c.a, $$8, dct.h, $$7, null, 0);
               this.c.b = hll.a($$8.M());
               this.c.c = hll.a($$8);
               edj $$9 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(bcb.i($$1, $$9.b(), $$9.a())));
               hfb.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
