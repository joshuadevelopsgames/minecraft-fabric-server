public record abv(jb c, float d, float e, float f, float g, float h) implements abe {
   public static final zm<wg, abv> a = abe.a(abv::a, abv::new);
   public static final abe.b<abv> b = abe.a("debug/worldgen_attempt");

   private abv(wg $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public abe.b<abv> a() {
      return b;
   }

   public jb b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }
}
