import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gfk extends gfh<arv> {
   public gfk(@Nullable get $$0, arv $$1, gfi $$2) {
      super($$0, $$1, $$2);
   }

   protected Stream<aro> a(arv $$0, gfi $$1) {
      return $$0.e().a().map($$1x -> a($$0, $$1x));
   }

   private static aro a(arv $$0, jl<art> $$1) {
      return new aro(new arq($$1.a().A_().a(), $$0.f()), Optional.of(new asi(new xm.h($$1))));
   }
}
