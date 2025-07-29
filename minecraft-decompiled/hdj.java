public class hdj extends hfl<csr, hka, gmn> {
   private static final ame a = ame.b("textures/entity/breeze/breeze.png");

   public hdj(hee.a $$0) {
      super($$0, new gmn($$0.a(gqm.K)), 0.5F);
      this.a(new hhs($$0, this));
      this.a(new hhr(this));
   }

   public void a(hka $$0, fod $$1, gxn $$2, int $$3) {
      gmn $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public ame a(hka $$0) {
      return a;
   }

   public hka a() {
      return new hka();
   }

   public void a(csr $$0, hka $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.e);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.f);
      $$1.f.a($$0.d);
   }

   public static gmn a(gmn $$0, gqn... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gqn $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
