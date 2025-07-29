public class hiz extends hit<hmn, gpi> {
   private final gpi a;

   public hiz(hgc<hmn, gpi> $$0, gqj $$1) {
      super($$0);
      this.a = new gpi($$1.a(gqm.dn));
   }

   public void a(fod $$0, gxn $$1, int $$2, hmn $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ar && $$3.A;
      if (!$$3.A || $$6) {
         fog $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gxz.s(hgj.a));
         } else {
            $$7 = $$1.getBuffer(gxz.j(hgj.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, hfg.a($$3, 0.0F));
      }
   }
}
