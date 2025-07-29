public class hgu extends hdc<cve, hmv> {
   public static final ame a = ame.b("textures/entity/projectiles/arrow.png");
   public static final ame h = ame.b("textures/entity/projectiles/tipped_arrow.png");

   public hgu(hee.a $$0) {
      super($$0);
   }

   protected ame a(hmv $$0) {
      return $$0.d ? h : a;
   }

   public hmv a() {
      return new hmv();
   }

   public void a(cve $$0, hmv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.x() > 0;
   }
}
