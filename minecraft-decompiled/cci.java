import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cci {
   public static <E extends cam, T> cce<E> a(Predicate<E> $$0, cjo<? extends T> $$1, cjo<T> $$2, bwu $$3) {
      return cfq.a(
         (Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
            if (!$$0.test((E)$$6)) {
               return false;
            } else {
               $$4x.a($$4.b($$3xx), $$3.a($$5.A));
               return true;
            }
         }))
      );
   }
}
