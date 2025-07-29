import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cec {
   public static cce<cam> a(cap $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ap().f()), $$1);
   }

   public static cdo<cam> a(bzv<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ap()), $$1);
   }

   public static cdo<cam> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cdo<cam> a(Predicate<cam> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$2x -> $$2x.group($$2x.c(cjo.o), $$2x.b(cjo.h))
            .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
               Optional<cam> $$8 = $$2x.<cjq>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= $$2 && !$$6.z($$2xxxx)));
               if ($$8.isEmpty()) {
                  return false;
               } else {
                  $$3.a(new cco($$8.get(), true));
                  return true;
               }
            }))
      );
   }
}
