public class agb implements zw<acq> {
   public static final zm<wg, agb> a = zw.a(agb::a, agb::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public agb(bzm $$0) {
      this($$0.ar(), $$0.dA());
   }

   public agb(int $$0, fis $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = bcb.a($$1.d, -3.9, 3.9);
      double $$4 = bcb.a($$1.e, -3.9, 3.9);
      double $$5 = bcb.a($$1.f, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private agb(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
      $$0.m(this.e);
   }

   @Override
   public zy<agb> a() {
      return ahk.aH;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c / 8000.0;
   }

   public double f() {
      return this.d / 8000.0;
   }

   public double g() {
      return this.e / 8000.0;
   }
}
