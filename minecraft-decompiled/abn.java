public record abn(int c, faz d, float e) implements abe {
   public static final zm<wg, abn> a = abe.a(abn::a, abn::new);
   public static final abe.b<abn> b = abe.a("debug/path");

   private abn(wg $$0) {
      this($$0.readInt(), faz.b($$0), $$0.readFloat());
   }

   private void a(wg $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public abe.b<abn> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public faz c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
