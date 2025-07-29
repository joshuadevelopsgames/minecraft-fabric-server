public enum jj implements bda {
   a("down_east", jh.a, jh.f),
   b("down_north", jh.a, jh.c),
   c("down_south", jh.a, jh.d),
   d("down_west", jh.a, jh.e),
   e("up_east", jh.b, jh.f),
   f("up_north", jh.b, jh.c),
   g("up_south", jh.b, jh.d),
   h("up_west", jh.b, jh.e),
   i("west_up", jh.e, jh.b),
   j("east_up", jh.f, jh.b),
   k("north_up", jh.c, jh.b),
   l("south_up", jh.d, jh.b);

   private static final int m = jh.values().length;
   private static final jj[] n = ag.a(new jj[m * m], $$0 -> {
      for (jj $$1 : values()) {
         $$0[b($$1.q, $$1.p)] = $$1;
      }
   });
   private final String o;
   private final jh p;
   private final jh q;

   private static int b(jh $$0, jh $$1) {
      return $$0.ordinal() * m + $$1.ordinal();
   }

   private jj(final String $$0, final jh $$1, final jh $$2) {
      this.o = $$0;
      this.q = $$1;
      this.p = $$2;
   }

   @Override
   public String c() {
      return this.o;
   }

   public static jj a(jh $$0, jh $$1) {
      return n[b($$0, $$1)];
   }

   public jh a() {
      return this.q;
   }

   public jh b() {
      return this.p;
   }
}
