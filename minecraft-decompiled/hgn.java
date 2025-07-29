public class hgn<T extends csg> extends hfl<T, hlq, gpl> {
   private static final ame a = ame.b("textures/entity/spider/spider.png");

   public hgn(hee.a $$0) {
      this($$0, gqm.ds);
   }

   public hgn(hee.a $$0, gql $$1) {
      super($$0, new gpl($$0.a($$1)), 0.8F);
      this.a(new hjb<>(this));
   }

   @Override
   protected float ba_() {
      return 180.0F;
   }

   @Override
   public ame b(hlq $$0) {
      return a;
   }

   public hlq b() {
      return new hlq();
   }

   public void a(T $$0, hlq $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
