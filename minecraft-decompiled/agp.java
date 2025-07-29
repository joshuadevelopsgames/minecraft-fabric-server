public class agp implements zw<acq> {
   public static final zm<wg, agp> a = zw.a(agp::a, agp::new);
   private final int b;
   private final int c;
   private final int d;

   public agp(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agp(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      $$0.q(this.d);
   }

   @Override
   public zy<agp> a() {
      return ahk.aU;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
