import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ext extends euy {
   public static final MapCodec<ext> d = a(ext::new);

   public ext(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      return a($$0, eka.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(evq $$0, euy.a $$1) {
      $$0.a(new exs($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public evh<?> e() {
      return evh.o;
   }
}
