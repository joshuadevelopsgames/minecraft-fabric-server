public class afb implements zw<acq> {
   public static final zm<wg, afb> a = zw.a(afb::a, afb::new);
   private final int b;
   private final double c;

   public afb(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afb(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<afb> a() {
      return ahk.bj;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
