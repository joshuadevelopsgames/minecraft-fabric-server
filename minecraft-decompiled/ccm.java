import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ccm {
   public static <E extends cam> cce<E> a(int $$0, BiPredicate<E, bzm> $$1) {
      return cfq.a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$2 -> $$2.group($$2.a(cjo.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
         bzm $$7 = $$5.dm();
         bzm $$8 = $$2.<bzm>a($$3).orElse(null);
         if ($$7 == null && $$8 == null) {
            return false;
         } else {
            bzm $$9 = $$7 == null ? $$8 : $$7;
            if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
               return false;
            } else {
               $$5.bS();
               $$3.b();
               return true;
            }
         }
      })));
   }

   private static boolean a(cam $$0, bzm $$1, int $$2) {
      return $$1.bO() && $$1.a($$0, (double)$$2) && $$1.ai() == $$0.ai();
   }
}
