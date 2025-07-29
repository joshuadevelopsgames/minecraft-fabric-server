public class hea extends hfl<crl, hkm, gnf<hkm>> {
   private static final ame a = ame.b("textures/entity/enderman/enderman.png");
   private final bck k = bck.a();

   public hea(hee.a $$0) {
      super($$0, new gnf<>($$0.a(gqm.aR)), 0.5F);
      this.a(new hic(this));
      this.a(new hhu(this, $$0.d()));
   }

   public fis a(hkm $$0) {
      fis $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * $$0.ai;
         return $$1.b(this.k.k() * $$2, 0.0, this.k.k() * $$2);
      } else {
         return $$1;
      }
   }

   public ame b(hkm $$0) {
      return a;
   }

   public hkm a() {
      return new hkm();
   }

   public void a(crl $$0, hkm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hew.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.gH();
      $$1.b = $$0.t();
   }
}
