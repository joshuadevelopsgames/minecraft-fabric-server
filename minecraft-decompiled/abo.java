public record abo(jb c, String d, int e) implements abe {
   public static final zm<wg, abo> a = abe.a(abo::a, abo::new);
   public static final abe.b<abo> b = abe.a("debug/poi_added");

   private abo(wg $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public abe.b<abo> a() {
      return b;
   }

   public jb b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
