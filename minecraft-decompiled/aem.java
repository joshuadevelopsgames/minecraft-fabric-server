public record aem(fis b, float c, float d) implements zw<acq> {
   public static final zm<wg, aem> a = zm.a(fis.b, aem::b, zk.l, aem::e, zk.l, aem::f, aem::new);

   public static aem a(bzm $$0) {
      return new aem($$0.dv(), $$0.dP(), $$0.dR());
   }

   @Override
   public zy<aem> a() {
      return ahk.V;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
