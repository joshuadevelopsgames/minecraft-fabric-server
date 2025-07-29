import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class ckb extends ckv<cam> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.L, cjo.h);
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      $$1.eh().c(cjo.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   protected void a(cam $$0, cjq $$1) {
      Optional<cam> $$2 = $$1.a($$1x -> $$1x.ap() == $$0.ap() && !$$1x.g_()).map(cam.class::cast);
      $$0.eh().a(cjo.L, $$2);
   }
}
