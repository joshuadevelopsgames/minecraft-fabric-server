public class afp implements zw<acq> {
   public static final zm<wg, afp> a = zw.a(afp::a, afp::new);
   private final double b;
   private final double c;
   private final long d;

   public afp(eft $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private afp(wg $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<afp> a() {
      return ahk.aw;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }
}
