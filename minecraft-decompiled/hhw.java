public class hhw extends hid<hkg, gmz> {
   private static final ame a = ame.b("textures/entity/creeper/creeper_armor.png");
   private final gmz b;

   public hhw(hgc<hkg, gmz> $$0, gqj $$1) {
      super($$0);
      this.b = new gmz($$1.a(gqm.ar));
   }

   protected boolean a(hkg $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ame a() {
      return a;
   }

   protected gmz b() {
      return this.b;
   }
}
