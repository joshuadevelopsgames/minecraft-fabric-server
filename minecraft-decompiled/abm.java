public record abm(long c, jb d) implements abe {
   public static final zm<wg, abm> a = abe.a(abm::a, abm::new);
   public static final abe.b<abm> b = abe.a("debug/neighbors_update");

   private abm(wg $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public abe.b<abm> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public jb c() {
      return this.d;
   }
}
