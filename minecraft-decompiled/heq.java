public class heq extends hgo<cab> {
   private static final ame a = ame.b("textures/entity/squid/glow_squid.png");

   public heq(hee.a $$0, gpn $$1, gpn $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public ame a(hmq $$0) {
      return a;
   }

   protected int a(cab $$0, jb $$1) {
      int $$2 = (int)bcb.b(0.0F, 15.0F, 1.0F - $$0.t() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
