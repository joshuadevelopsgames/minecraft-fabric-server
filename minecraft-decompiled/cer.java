import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cer {
   public static cce<cam> a(Function<cam, Optional<cdr>> $$0, Predicate<cam> $$1, int $$2, int $$3, float $$4) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$5 -> $$5.group($$5.a(cjo.o), $$5.a(cjo.n))
            .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
               Optional<cdr> $$10 = $$0.apply($$8);
               if (!$$10.isEmpty() && $$1.test($$8)) {
                  cdr $$11 = $$10.get();
                  if ($$8.dv().a((jv)$$11.a(), (double)$$3)) {
                     return false;
                  } else {
                     cdr $$12 = $$10.get();
                     $$5x.a($$12);
                     $$6.a(new cjr($$12, $$4, $$2));
                     return true;
                  }
               } else {
                  return false;
               }
            }))
      );
   }
}
