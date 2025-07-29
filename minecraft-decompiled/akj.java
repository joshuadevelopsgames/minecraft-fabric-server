import java.util.UUID;

public record akj(String b, UUID c) implements zw<akh> {
   public static final zm<wg, akj> a = zw.a(akj::a, akj::new);

   private akj(wg $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wg $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zy<akj> a() {
      return akf.g;
   }

   public void a(akh $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
