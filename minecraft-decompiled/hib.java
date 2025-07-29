public class hib extends hit<hnh, gnc> {
   private static final ame a = ame.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gnc b;
   private final gnc c;

   public hib(hgc<hnh, gnc> $$0, gqj $$1) {
      super($$0);
      this.b = new gnc($$1.a(gqm.aN));
      this.c = new gnc($$1.a(gqm.aK));
   }

   public void a(fod $$0, gxn $$1, int $$2, hnh $$3, float $$4, float $$5) {
      gnc $$6 = $$3.am ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
