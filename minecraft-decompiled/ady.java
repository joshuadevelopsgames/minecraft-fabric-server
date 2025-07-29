public class ady implements zw<acq> {
   public static final zm<wg, ady> a = zw.a(ady::a, ady::new);
   private final int b;
   private final int c;
   private final int d;

   public ady(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ady(wg $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(wg $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.q(this.d);
   }

   @Override
   public zy<ady> a() {
      return ahk.H;
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
