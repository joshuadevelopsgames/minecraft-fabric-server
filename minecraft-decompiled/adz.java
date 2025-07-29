public record adz(int b, float c) implements zw<acq> {
   public static final zm<wg, adz> a = zw.a(adz::a, adz::new);

   public adz(cam $$0) {
      this($$0.ar(), $$0.eR());
   }

   private adz(wg $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<adz> a() {
      return ahk.I;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
