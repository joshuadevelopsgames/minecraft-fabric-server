import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class cke extends cko<csr> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.copyOf(Iterables.concat(super.a(), List.of(cjo.C)));
   }

   protected void a(aub $$0, csr $$1) {
      super.a($$0, $$1);
      $$1.eh()
         .c(cjo.g)
         .stream()
         .flatMap(Collection::stream)
         .filter(bzt.e)
         .filter($$2 -> ckv.c($$0, $$1, $$2))
         .findFirst()
         .ifPresentOrElse($$1x -> $$1.eh().a(cjo.C, $$1x), () -> $$1.eh().b(cjo.C));
   }
}
