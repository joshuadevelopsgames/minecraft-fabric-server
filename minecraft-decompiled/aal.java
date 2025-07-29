import java.util.Optional;
import java.util.UUID;

public record aal(Optional<UUID> b) implements zw<aae> {
   public static final zm<wg, aal> a = zw.a(aal::a, aal::new);

   private aal(wg $$0) {
      this($$0.b(kf.g));
   }

   private void a(wg $$0) {
      $$0.a(this.b, kf.g);
   }

   @Override
   public zy<aal> a() {
      return aas.g;
   }

   public void a(aae $$0) {
      $$0.a(this);
   }
}
