import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cga {
   public static <E extends ctw> cce<E> a(Function<E, Optional<? extends cam>> $$0) {
      return cfq.a(
         (Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$1 -> $$1.group($$1.c(cjo.az), $$1.c(cjo.p), $$1.a(cjo.F))
            .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
               Optional<? extends cam> $$6 = $$0.apply((E)$$4);
               if ($$6.filter($$4::G).isEmpty()) {
                  return false;
               } else {
                  $$1x.a($$6.get());
                  $$3.b();
                  return true;
               }
            }))
      );
   }
}
