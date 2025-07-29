import java.util.List;
import java.util.UUID;

public record aew(List<UUID> b) implements zw<acq> {
   public static final zm<wg, aew> a = zw.a(aew::a, aew::new);

   private aew(wg $$0) {
      this($$0.a(kf.g));
   }

   private void a(wg $$0) {
      $$0.a(this.b, kf.g);
   }

   @Override
   public zy<aew> a() {
      return ahk.af;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }
}
