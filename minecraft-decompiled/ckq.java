import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ckq extends ckv<cam> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.h, cjo.N, cjo.ao);
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      cbm<?> $$2 = $$1.eh();
      List<cth> $$3 = Lists.newArrayList();
      cjq $$4 = $$2.c(cjo.h).orElse(cjq.a());
      Optional<cao> $$5 = $$4.a($$0x -> $$0x instanceof csm || $$0x instanceof cqm).map(cao.class::cast);

      for (cam $$7 : $$2.c(cjo.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cth && ((cth)$$7).gH()) {
            $$3.add((cth)$$7);
         }
      }

      $$2.a(cjo.N, $$5);
      $$2.a(cjo.ao, $$3);
   }
}
