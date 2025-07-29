public class acx implements zw<acq> {
   public static final zm<wx, acx> a = zw.a(acx::a, acx::new);
   private final jb b;
   private final int c;
   private final int d;
   private final dpz e;

   public acx(jb $$0, dpz $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acx(wx $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zk.a(mn.i).decode($$0);
   }

   private void a(wx $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zk.a(mn.i).encode($$0, this.e);
   }

   @Override
   public zy<acx> a() {
      return ahk.i;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public jb b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dpz g() {
      return this.e;
   }
}
