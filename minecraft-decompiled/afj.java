public class afj implements zw<acq> {
   public static final zm<wg, afj> a = zw.a(afj::a, afj::new);
   private final int b;
   private final byte c;

   public afj(bzm $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private afj(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zy<afj> a() {
      return ahk.aq;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public bzm a(dmu $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return bcb.a(this.c);
   }
}
