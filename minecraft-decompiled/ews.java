import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ews extends euy {
   public static final MapCodec<ews> d = a(ews::new);

   public ews(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      return a($$0, eka.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(evq $$0, euy.a $$1) {
      jb $$2 = new jb($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ewr.a($$2));
   }

   @Override
   public evh<?> e() {
      return evh.a;
   }
}
