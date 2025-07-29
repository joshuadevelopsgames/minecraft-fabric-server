public class aed implements zw<acq> {
   public static final zm<wg, aed> a = zw.a(aed::a, aed::new);
   private final int b;
   private final jb c;
   private final int d;
   private final boolean e;

   public aed(int $$0, jb $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private aed(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zy<aed> a() {
      return ahk.L;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public jb g() {
      return this.c;
   }
}
