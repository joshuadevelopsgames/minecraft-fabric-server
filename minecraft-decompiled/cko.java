import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class cko<T extends cam> extends ckv<T> {
   @Override
   protected void a(aub $$0, T $$1) {
      double $$2 = $$1.i(cbs.n);
      fin $$3 = $$1.cV().c($$2, $$2, $$2);
      List<cam> $$4 = $$0.a(cam.class, $$3, $$1x -> $$1x != $$1 && $$1x.bO());
      $$4.sort(Comparator.comparingDouble($$1::g));
      cbm<?> $$5 = $$1.eh();
      $$5.a(cjo.g, $$4);
      $$5.a(cjo.h, new cjq($$0, $$1, $$4));
   }

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.g, cjo.h);
   }
}
