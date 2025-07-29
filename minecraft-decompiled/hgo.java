public class hgo<T extends cnj> extends hcy<T, hmq, gpn> {
   private static final ame a = ame.b("textures/entity/squid/squid.png");

   public hgo(hee.a $$0, gpn $$1, gpn $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public ame a(hmq $$0) {
      return a;
   }

   public hmq b() {
      return new hmq();
   }

   public void a(T $$0, hmq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bcb.h($$2, $$0.cr, $$0.cq);
      $$1.b = bcb.h($$2, $$0.cl, $$0.ck);
      $$1.c = bcb.h($$2, $$0.cn, $$0.cm);
   }

   protected void a(hmq $$0, fod $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.am ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.am ? -0.6F : -1.2F, 0.0F);
   }
}
