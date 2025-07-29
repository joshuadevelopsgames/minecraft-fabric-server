public class hjc extends hit<hmc, gop> {
   public static final ame a = ame.b("textures/entity/trident_riptide.png");
   private final gpm b;

   public hjc(hgc<hmc, gop> $$0, gqj $$1) {
      super($$0);
      this.b = new gpm($$1.a(gqm.cH));
   }

   public void a(fod $$0, gxn $$1, int $$2, hmc $$3, float $$4, float $$5) {
      if ($$3.ao) {
         fog $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hri.d);
      }
   }
}
