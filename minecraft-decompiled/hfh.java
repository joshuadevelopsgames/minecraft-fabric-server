public class hfh extends hcy<cot, hlr, goc> {
   private static final ame a = ame.b("textures/entity/llama/creamy.png");
   private static final ame k = ame.b("textures/entity/llama/white.png");
   private static final ame l = ame.b("textures/entity/llama/brown.png");
   private static final ame m = ame.b("textures/entity/llama/gray.png");

   public hfh(hee.a $$0, gql $$1, gql $$2) {
      super($$0, new goc($$0.a($$1)), new goc($$0.a($$2)), 0.7F);
      this.a(new hin(this, $$0.f(), $$0.h()));
   }

   public ame a(hlr $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> k;
         case c -> l;
         case d -> m;
      };
   }

   public hlr b() {
      return new hlr();
   }

   public void a(cot $$0, hlr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gU();
      $$1.b = !$$0.g_() && $$0.n();
      $$1.c = $$0.gl();
      $$1.d = $$0.gK();
   }
}
