import java.util.UUID;

public record aaz(UUID b, aaz.a c) implements zw<aat> {
   public static final zm<wg, aaz> a = zw.a(aaz::a, aaz::new);

   private aaz(wg $$0) {
      this($$0.n(), $$0.b(aaz.a.class));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<aaz> a() {
      return aas.r;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }

   public aaz.a e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;

      public boolean a() {
         return this != d && this != e;
      }
   }
}
