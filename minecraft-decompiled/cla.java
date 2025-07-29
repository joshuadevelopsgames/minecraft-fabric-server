import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class cla extends cko<ctw> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cjo.C)));
   }

   protected void a(aub $$0, ctw $$1) {
      super.a($$0, $$1);
      a($$1, $$0x -> $$0x.ap() == bzv.bU)
         .or(() -> a($$1, $$0xx -> $$0xx.ap() != bzv.bU))
         .ifPresentOrElse($$1x -> $$1.eh().a(cjo.C, $$1x), () -> $$1.eh().b(cjo.C));
   }

   private static Optional<cam> a(ctw $$0, Predicate<cam> $$1) {
      return $$0.eh().c(cjo.g).stream().flatMap(Collection::stream).filter($$0::G).filter($$1).findFirst();
   }
}
