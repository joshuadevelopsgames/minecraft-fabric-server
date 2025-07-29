public class hhv extends hit<hkc, gmq> {
   private static final ame a = ame.b("textures/entity/cat/cat_collar.png");
   private final gmq b;
   private final gmq c;

   public hhv(hgc<hkc, gmq> $$0, gqj $$1) {
      super($$0);
      this.b = new gmq($$1.a(gqm.T));
      this.c = new gmq($$1.a(gqm.S));
   }

   public void a(fod $$0, gxn $$1, int $$2, hkc $$3, float $$4, float $$5) {
      dbt $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gmq $$8 = $$3.am ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
