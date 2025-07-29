public class acv implements zw<acq> {
   public static final zm<wg, acv> a = zw.a(acv::a, acv::new);
   private final int b;
   private final jb c;
   private final int d;

   public acv(int $$0, jb $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acv(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zy<acv> a() {
      return ahk.g;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jb e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
