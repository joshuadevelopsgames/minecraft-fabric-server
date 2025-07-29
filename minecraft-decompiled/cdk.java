import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cdk {
   public static <T extends cao> cdo<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends cao> cdo<T> a(Predicate<T> $$0, int $$1) {
      return cfq.a(
         (Function<cfq.b<T>, ? extends App<cfq.c<T>, cft<T>>>)($$2 -> $$2.group($$2.a(cjo.o), $$2.b(cjo.p), $$2.c(cjo.q), $$2.b(cjo.h))
            .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
               cam $$10 = $$2.b($$4);
               if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<cjq>b($$6).a($$10)) {
                  $$3.a(new cco($$10, true));
                  $$8.a(bxi.a);
                  $$8.c($$7, $$10);
                  $$5.a(true, $$1);
                  return true;
               } else {
                  return false;
               }
            }))
      );
   }

   private static boolean a(cao $$0) {
      return $$0.b($$1 -> {
         dcr $$2 = $$1.h();
         return $$2 instanceof ddq && $$0.a((ddq)$$2);
      });
   }
}
