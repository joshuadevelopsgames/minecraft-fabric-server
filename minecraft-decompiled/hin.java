public class hin extends hit<hlr, goc> {
   private final goc a;
   private final goc b;
   private final hie c;

   public hin(hgc<hlr, goc> $$0, gqj $$1, hie $$2) {
      super($$0);
      this.c = $$2;
      this.a = new goc($$1.a(gqm.bN));
      this.b = new goc($$1.a(gqm.bM));
   }

   public void a(fod $$0, gxn $$1, int $$2, hlr $$3, float $$4, float $$5) {
      dcv $$6 = $$3.c;
      dle $$7 = $$6.a(kq.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, dcv.l, dld.m, $$2);
      }
   }

   private void a(fod $$0, gxn $$1, hlr $$2, dcv $$3, amd<dlc> $$4, int $$5) {
      goc $$6 = $$2.am ? this.b : this.a;
      $$6.a($$2);
      this.c.a(htz.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
