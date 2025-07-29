import java.util.List;

public record abk(int c, jb d, List<abk.a> e) implements abe {
   public static final zm<wg, abk> a = abe.a(abk::a, abk::new);
   public static final abe.b<abk> b = abe.a("debug/goal_selector");

   private abk(wg $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(abk.a::new));
   }

   private void a(wg $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public abe.b<abk> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jb c() {
      return this.d;
   }

   public List<abk.a> d() {
      return this.e;
   }

   public record a(int a, boolean b, String c) {
      public a(wg $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wg $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
