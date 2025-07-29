public class hfz extends hcy<cnf, hmf, gov> {
   private static final ame a = ame.b("textures/entity/rabbit/brown.png");
   private static final ame k = ame.b("textures/entity/rabbit/white.png");
   private static final ame l = ame.b("textures/entity/rabbit/black.png");
   private static final ame m = ame.b("textures/entity/rabbit/gold.png");
   private static final ame n = ame.b("textures/entity/rabbit/salt.png");
   private static final ame o = ame.b("textures/entity/rabbit/white_splotched.png");
   private static final ame p = ame.b("textures/entity/rabbit/toast.png");
   private static final ame q = ame.b("textures/entity/rabbit/caerbannog.png");

   public hfz(hee.a $$0) {
      super($$0, new gov($$0.a(gqm.cN)), new gov($$0.a(gqm.cO)), 0.3F);
   }

   public ame a(hmf $$0) {
      if ($$0.b) {
         return p;
      } else {
         return switch ($$0.c) {
            case a -> a;
            case b -> k;
            case c -> l;
            case e -> m;
            case f -> n;
            case d -> o;
            case g -> q;
         };
      }
   }

   public hmf b() {
      return new hmf();
   }

   public void a(cnf $$0, hmf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(o.a($$0.aj().getString()));
      $$1.c = $$0.gH();
   }
}
