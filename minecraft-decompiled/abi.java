public record abi(jb c, int d, String e, int f) implements abe {
   public static final zm<wg, abi> a = abe.a(abi::a, abi::new);
   public static final abe.b<abi> b = abe.a("debug/game_test_add_marker");

   private abi(wg $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
      $$0.q(this.f);
   }

   @Override
   public abe.b<abi> a() {
      return b;
   }

   public jb b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }
}
