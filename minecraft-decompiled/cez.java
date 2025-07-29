import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cez {
   public static <E extends cam> cdo<E> a(List<Pair<? extends cft<? super E>, Integer>> $$0) {
      return a($$0, ccr.a.b, ccr.b.a);
   }

   public static <E extends cam> cdo<E> a(List<Pair<? extends cft<? super E>, Integer>> $$0, ccr.a $$1, ccr.b $$2) {
      cem<cft<? super E>> $$3 = new cem<>();
      $$0.forEach($$1x -> $$3.a((cft)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cfq.a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$3x -> $$3x.a((cft<E>)(($$3xx, $$4, $$5) -> {
         if ($$1 == ccr.a.b) {
            $$3.a();
         }

         for (cft<? super E> $$6 : $$3) {
            if ($$6.trigger($$3xx, $$4, $$5) && $$2 == ccr.b.a) {
               break;
            }
         }

         return true;
      }))));
   }
}
