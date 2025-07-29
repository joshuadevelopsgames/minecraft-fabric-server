public class hfs extends hfl<cmz, hly, goi> {
   private static final ame a = ame.b("textures/entity/parrot/parrot_red_blue.png");
   private static final ame k = ame.b("textures/entity/parrot/parrot_blue.png");
   private static final ame l = ame.b("textures/entity/parrot/parrot_green.png");
   private static final ame m = ame.b("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ame n = ame.b("textures/entity/parrot/parrot_grey.png");

   public hfs(hee.a $$0) {
      super($$0, new goi($$0.a(gqm.ch)), 0.3F);
   }

   public ame a(hly $$0) {
      return a($$0.a);
   }

   public hly b() {
      return new hly();
   }

   public void a(cmz $$0, hly $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gV();
      float $$3 = bcb.h($$2, $$0.cr, $$0.co);
      float $$4 = bcb.h($$2, $$0.cq, $$0.cp);
      $$1.b = (bcb.a($$3) + 1.0F) * $$4;
      $$1.c = goi.a($$0);
   }

   public static ame a(cmz.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> k;
         case c -> l;
         case d -> m;
         case e -> n;
      };
   }
}
