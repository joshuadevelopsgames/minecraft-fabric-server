public class hje extends hit<hmx, gnh<hmx>> {
   private static final ame a = ame.b("textures/entity/fish/tropical_a_pattern_1.png");
   private static final ame b = ame.b("textures/entity/fish/tropical_a_pattern_2.png");
   private static final ame c = ame.b("textures/entity/fish/tropical_a_pattern_3.png");
   private static final ame d = ame.b("textures/entity/fish/tropical_a_pattern_4.png");
   private static final ame e = ame.b("textures/entity/fish/tropical_a_pattern_5.png");
   private static final ame f = ame.b("textures/entity/fish/tropical_a_pattern_6.png");
   private static final ame g = ame.b("textures/entity/fish/tropical_b_pattern_1.png");
   private static final ame h = ame.b("textures/entity/fish/tropical_b_pattern_2.png");
   private static final ame i = ame.b("textures/entity/fish/tropical_b_pattern_3.png");
   private static final ame j = ame.b("textures/entity/fish/tropical_b_pattern_4.png");
   private static final ame k = ame.b("textures/entity/fish/tropical_b_pattern_5.png");
   private static final ame l = ame.b("textures/entity/fish/tropical_b_pattern_6.png");
   private final gpr m;
   private final gps n;

   public hje(hgc<hmx, gnh<hmx>> $$0, gqj $$1) {
      super($$0);
      this.m = new gpr($$1.a(gqm.dN));
      this.n = new gps($$1.a(gqm.dL));
   }

   public void a(fod $$0, gxn $$1, int $$2, hmx $$3, float $$4, float $$5) {
      cnl.b $$6 = $$3.a;

      gnh<hmx> $$7 = (gnh<hmx>)(switch ($$6.a()) {
         case a -> this.m;
         case b -> this.n;
      });

      ame $$8 = switch ($$6) {
         case a -> a;
         case b -> b;
         case c -> c;
         case d -> d;
         case e -> e;
         case f -> f;
         case g -> g;
         case h -> h;
         case i -> i;
         case j -> j;
         case k -> k;
         case l -> l;
      };
      a($$7, $$8, $$0, $$1, $$2, $$3, $$3.c);
   }
}
