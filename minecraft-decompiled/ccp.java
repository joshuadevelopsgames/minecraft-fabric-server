import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class ccp {
   public static <E extends cam> cce<E> a(Predicate<E> $$0, cjo<?> $$1) {
      return cfq.a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
         if ($$0.test((E)$$3)) {
            $$1xx.b();
            return true;
         } else {
            return false;
         }
      })));
   }
}
