public class aep implements zw<acq> {
   public static final zm<wg, aep> a = zw.a(aep::a, aep::new);
   private final jb b;
   private final boolean c;

   public aep(jb $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aep(wg $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<aep> a() {
      return ahk.Y;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public jb b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
