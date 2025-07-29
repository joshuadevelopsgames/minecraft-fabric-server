public record abq(jb c, int d) implements abe {
   public static final zm<wg, abq> a = abe.a(abq::a, abq::new);
   public static final abe.b<abq> b = abe.a("debug/poi_ticket_count");

   private abq(wg $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public abe.b<abq> a() {
      return b;
   }

   public jb b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
