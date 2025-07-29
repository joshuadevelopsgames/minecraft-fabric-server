public record ain(fis b, float c, float d, boolean e) implements zw<ahm> {
   public static final zm<wg, ain> a = zm.a(fis.b, ain::b, zk.l, ain::e, zk.l, ain::f, zk.b, ain::g, ain::new);

   public static ain a(bzm $$0) {
      return $$0.bU() ? new ain($$0.l_().a(), $$0.l_().b(), $$0.l_().c(), $$0.aK()) : new ain($$0.dv(), $$0.dP(), $$0.dR(), $$0.aK());
   }

   @Override
   public zy<ain> a() {
      return ahk.bO;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
