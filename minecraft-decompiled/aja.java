import javax.annotation.Nullable;

public class aja implements zw<ahm> {
   public static final zm<wg, aja> a = zw.a(aja::a, aja::new);
   private final aja.a b;
   @Nullable
   private final ame c;

   public aja(aja.a $$0, @Nullable ame $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aja a(aj $$0) {
      return new aja(aja.a.a, $$0.a());
   }

   public static aja b() {
      return new aja(aja.a.b, null);
   }

   private aja(wg $$0) {
      this.b = $$0.b(aja.a.class);
      if (this.b == aja.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      if (this.b == aja.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zy<aja> a() {
      return ahk.cb;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public aja.a e() {
      return this.b;
   }

   @Nullable
   public ame f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
