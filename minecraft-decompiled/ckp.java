import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class ckp extends ckv<cam> {
   protected abstract boolean a(aub var1, cam var2, cam var3);

   protected abstract cjo<cam> b();

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      $$1.eh().a(this.b(), this.c($$0, $$1));
   }

   private Optional<cam> c(aub $$0, cam $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cjq> a(cam $$0) {
      return $$0.eh().c(cjo.h);
   }
}
