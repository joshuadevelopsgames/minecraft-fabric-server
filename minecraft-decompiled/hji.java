public class hji extends hid<hne, gqb> {
   private static final ame a = ame.b("textures/entity/wither/wither_armor.png");
   private final gqb b;

   public hji(hgc<hne, gqb> $$0, gqj $$1) {
      super($$0);
      this.b = new gqb($$1.a(gqm.eb));
   }

   protected boolean a(hne $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return bcb.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ame a() {
      return a;
   }

   protected gqb b() {
      return this.b;
   }
}
