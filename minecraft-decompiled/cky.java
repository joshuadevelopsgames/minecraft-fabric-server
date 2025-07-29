import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cky extends ckv<cam> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.i);
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      $$1.eh().a(cjo.i, this.a($$1));
   }

   private List<cam> a(cam $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(cam $$0) {
      return $$0.ap() == bzv.bF && $$0.g_();
   }

   private cjq c(cam $$0) {
      return $$0.eh().c(cjo.h).orElse(cjq.a());
   }
}
