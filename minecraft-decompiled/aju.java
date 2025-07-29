public record aju(int b, String c, int d, ajt e) implements zw<ajx> {
   public static final zm<wg, aju> a = zw.a(aju::a, aju::new);
   private static final int f = 255;

   @Deprecated
   public aju(int b, String c, int d, ajt e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aju(wg $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ajt.a($$0.l()));
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zy<aju> a() {
      return ajv.a;
   }

   public void a(ajx $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public ajt g() {
      return this.e;
   }
}
