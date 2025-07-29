public class hhh extends hfl<cqm, hne, gqb> {
   private static final ame a = ame.b("textures/entity/wither/wither_invulnerable.png");
   private static final ame k = ame.b("textures/entity/wither/wither.png");

   public hhh(hee.a $$0) {
      super($$0, new gqb($$0.a(gqm.ea)), 1.0F);
      this.a(new hji(this, $$0.f()));
   }

   protected int a(cqm $$0, jb $$1) {
      return 15;
   }

   public ame a(hne $$0) {
      int $$1 = bcb.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : k;
   }

   public hne b() {
      return new hne();
   }

   protected void a(hne $$0, fod $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cqm $$0, hne $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gH();
      $$1.c = $$3 > 0 ? $$3 - $$2 : 0.0F;
      System.arraycopy($$0.t(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.n(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gI();
   }
}
