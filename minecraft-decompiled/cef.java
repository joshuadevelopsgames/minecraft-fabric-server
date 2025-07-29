import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cef {
   public static cce<cam> a(bzv<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$2x -> $$2x.group($$2x.a(cjo.o), $$2x.c(cjo.r), $$2x.b(cjo.h))
            .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
               Optional<cam> $$9 = $$2x.<cjq>b($$5).a($$3xx -> $$3xx.g($$7) <= $$2 && $$0.equals($$3xx.ap()));
               if ($$9.isEmpty()) {
                  return false;
               } else {
                  cam $$10 = $$9.get();
                  $$4.a($$10);
                  $$3.a(new cco($$10, true));
                  return true;
               }
            }))
      );
   }
}
