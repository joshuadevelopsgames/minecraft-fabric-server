public record ahx(float b) implements zw<ahm> {
   public static final zm<wg, ahx> a = zw.a(ahx::a, ahx::new);

   private ahx(wg $$0) {
      this($$0.readFloat());
   }

   private void a(wg $$0) {
      $$0.a(this.b);
   }

   @Override
   public zy<ahx> a() {
      return ahk.bv;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }
}
