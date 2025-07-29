import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ckn extends ckv<cao> {
   private static final long b = 32L;
   private static final long c = 16L;
   public static final int a = 32;

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.M);
   }

   protected void a(aub $$0, cao $$1) {
      cbm<?> $$2 = $$1.eh();
      List<cqz> $$3 = $$0.a(cqz.class, $$1.cV().c(32.0, 16.0, 32.0), $$0x -> true);
      $$3.sort(Comparator.comparingDouble($$1::g));
      Optional<cqz> $$4 = $$3.stream().filter($$2x -> $$1.c($$0, $$2x.e())).filter($$1x -> $$1x.a($$1, 32.0)).filter($$1::F).findFirst();
      $$2.a(cjo.M, $$4);
   }
}
