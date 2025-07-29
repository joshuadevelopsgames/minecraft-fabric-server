public class agd implements zw<acq> {
   public static final zm<wg, agd> a = zw.a(agd::a, agd::new);
   private final float b;
   private final int c;
   private final int d;

   public agd(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agd(wg $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zy<agd> a() {
      return ahk.aJ;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
