public class afo implements zw<acq> {
   public static final zm<wg, afo> a = zw.a(afo::a, afo::new);
   private final double b;
   private final double c;

   public afo(eft $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private afo(wg $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<afo> a() {
      return ahk.av;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
