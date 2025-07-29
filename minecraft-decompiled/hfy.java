public class hfy extends hfl<cne, hme, gnh<hkn>> {
   private static final ame a = ame.b("textures/entity/fish/pufferfish.png");
   private final gnh<hkn> k;
   private final gnh<hkn> l;
   private final gnh<hkn> m = this.c();

   public hfy(hee.a $$0) {
      super($$0, new gor($$0.a(gqm.cK)), 0.2F);
      this.l = new gos($$0.a(gqm.cL));
      this.k = new got($$0.a(gqm.cM));
   }

   public ame a(hme $$0) {
      return a;
   }

   public hme b() {
      return new hme();
   }

   protected float b(hme $$0) {
      return 0.1F + 0.1F * $$0.a;
   }

   public void a(hme $$0, fod $$1, gxn $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.k;
         case 1 -> this.l;
         default -> this.m;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cne $$0, hme $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
   }

   protected void a(hme $$0, fod $$1, float $$2, float $$3) {
      $$1.a(0.0F, bcb.b($$0.v * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
