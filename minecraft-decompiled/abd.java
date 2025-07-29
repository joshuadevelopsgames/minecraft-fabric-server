import java.util.UUID;

public record abd(abd.a c) implements abe {
   public static final zm<wg, abd> a = abe.a(abd::a, abd::new);
   public static final abe.b<abd> b = abe.a("debug/breeze");

   private abd(wg $$0) {
      this(new abd.a($$0));
   }

   private void a(wg $$0) {
      this.c.a($$0);
   }

   @Override
   public abe.b<abd> a() {
      return b;
   }

   public abd.a b() {
      return this.c;
   }

   public record a(UUID a, int b, Integer c, jb d) {
      public a(wg $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wg::readInt), $$0.c(jb.b));
      }

      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wg::q);
         $$0.a(this.d, jb.b);
      }

      public String a() {
         return ahi.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public Integer d() {
         return this.c;
      }

      public jb e() {
         return this.d;
      }
   }
}
