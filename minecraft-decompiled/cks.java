import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cks extends ckv<cam> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.j, cjo.k, cjo.l, cjo.m);
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      List<cut> $$2 = $$0.A()
         .stream()
         .filter(bzt.f)
         .filter($$1x -> $$1.a($$1x, this.a($$1)))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      cbm<?> $$3 = $$1.eh();
      $$3.a(cjo.j, $$2);
      List<cut> $$4 = $$2.stream().filter($$2x -> b($$0, $$1, $$2x)).collect(Collectors.toList());
      $$3.a(cjo.k, $$4.isEmpty() ? null : $$4.get(0));
      List<cut> $$5 = $$4.stream().filter($$2x -> c($$0, $$1, $$2x)).toList();
      $$3.a(cjo.m, $$5);
      $$3.a(cjo.l, $$5.isEmpty() ? null : $$5.get(0));
   }

   protected double a(cam $$0) {
      return $$0.i(cbs.n);
   }
}
