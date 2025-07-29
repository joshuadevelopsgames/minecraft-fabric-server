public record aif(int b, int c, boolean d) implements zw<ahm> {
   public static final zm<wg, aif> a = zw.a(aif::a, aif::new);

   private aif(wg $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<aif> a() {
      return ahk.bD;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
