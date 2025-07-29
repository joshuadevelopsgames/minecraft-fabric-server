public record abg(amd<ejb> c, fis d) implements abe {
   public static final zm<wg, abg> a = abe.a(abg::a, abg::new);
   public static final abe.b<abg> b = abe.a("debug/game_event");

   private abg(wg $$0) {
      this($$0.a(mn.J), $$0.k());
   }

   private void a(wg $$0) {
      $$0.b(this.c);
      $$0.a(this.d);
   }

   @Override
   public abe.b<abg> a() {
      return b;
   }

   public amd<ejb> b() {
      return this.c;
   }

   public fis c() {
      return this.d;
   }
}
