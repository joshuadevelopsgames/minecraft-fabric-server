public class ait implements zw<ahm> {
   public static final zm<wg, ait> a = zw.a(ait::a, ait::new);
   private final jb b;
   private final jh c;
   private final ait.a d;
   private final int e;

   public ait(ait.a $$0, jb $$1, jh $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ait(ait.a $$0, jb $$1, jh $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ait(wg $$0) {
      this.d = $$0.b(ait.a.class);
      this.b = $$0.e();
      this.c = jh.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wg $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zy<ait> a() {
      return ahk.bU;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public jb b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public ait.a f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
