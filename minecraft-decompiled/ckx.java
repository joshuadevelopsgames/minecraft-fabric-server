import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ckx extends ckv<cau> {
   private static final clc a = clc.b().d();
   private final Predicate<dcv> b;

   public ckx(Predicate<dcv> $$0) {
      this.b = $$0;
   }

   protected void a(aub $$0, cau $$1) {
      cbm<?> $$2 = $$1.eh();
      clc $$3 = a.c().a((float)$$1.i(cbs.F));
      List<cut> $$4 = $$0.A()
         .stream()
         .filter(bzt.f)
         .filter($$3x -> $$3.a($$0, $$1, $$3x))
         .filter(this::a)
         .filter($$1x -> !$$1.z($$1x))
         .sorted(Comparator.comparingDouble($$1::g))
         .collect(Collectors.toList());
      if (!$$4.isEmpty()) {
         cut $$5 = $$4.get(0);
         $$2.a(cjo.P, $$5);
      } else {
         $$2.b(cjo.P);
      }
   }

   private boolean a(cut $$0) {
      return this.a($$0.fh()) || this.a($$0.fi());
   }

   private boolean a(dcv $$0) {
      return this.b.test($$0);
   }

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.P);
   }
}
