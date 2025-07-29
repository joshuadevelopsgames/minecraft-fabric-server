public class hgk extends hcy<cpg, hmo, gpj> {
   private static final ame a = ame.b("textures/entity/sniffer/sniffer.png");

   public hgk(hee.a $$0) {
      super($$0, new gpj($$0.a(gqm.do)), new gpj($$0.a(gqm.dp)), 1.1F);
   }

   public ame a(hmo $$0) {
      return a;
   }

   public hmo b() {
      return new hmo();
   }

   public void a(cpg $$0, hmo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
      $$1.b.a($$0.co);
      $$1.c.a($$0.cm);
      $$1.d.a($$0.cp);
      $$1.e.a($$0.ck);
      $$1.f.a($$0.cl);
   }

   protected fin a(cpg $$0) {
      return super.a($$0).g(0.6F);
   }
}
