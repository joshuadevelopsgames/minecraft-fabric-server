import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gfo extends gfh<asb> {
   public gfo(@Nullable get $$0, asb $$1, gfi $$2) {
      super($$0, $$1, $$2);
   }

   protected Stream<aro> a(asb $$0, gfi $$1) {
      return $$1.a().c().stream().map($$1x -> a($$0, $$1x));
   }

   private static aro a(asb $$0, amw.a $$1) {
      return new aro(new arq($$1.a(), $$0.e()), Optional.of(new asi(new xm.f($$1.c()))));
   }
}
