import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ckj extends ckv<cam> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.y, cjo.z);
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      cbm<?> $$2 = $$1.eh();
      byb $$3 = $$1.eN();
      if ($$3 != null) {
         $$2.a(cjo.y, $$1.eN());
         bzm $$4 = $$3.d();
         if ($$4 instanceof cam) {
            $$2.a(cjo.z, (cam)$$4);
         }
      } else {
         $$2.b(cjo.y);
      }

      $$2.c(cjo.z).ifPresent($$2x -> {
         if (!$$2x.bO() || $$2x.ai() != $$0) {
            $$2.b(cjo.z);
         }
      });
   }
}
